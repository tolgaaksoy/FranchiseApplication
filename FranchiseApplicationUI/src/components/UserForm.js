import React, {Component} from 'react';
import FormUserDetails from './FormUserDetails';
import FormAddressDetails from './FormAddressDetails';
import FormAppealDetails from './FormAppealDetails';
import FormAppealDescriptions from './FormAppealDescriptions';
import Confirm from './Confirm';
import Success from './Success';

export class UserForm extends Component {
    state = {
        step: 1,
        appealAdressDescription: '',
        appealDistrict: '',
        appealNeighborhood: '',
        appealProvince: '',
        appealDescription: '',
        extraDescription: '',
        investmentAmount: 0,
        customerDescription: '',
        customerDistrict: '',
        customerNeighborhood: '',
        customerProvince: '',
        birthDate: '',
        email: '',
        idNumber: '',
        lastName: '',
        firstName: '',
        phoneNumber: '',
        experience: ''
    };

    // Proceed to next step
    nextStep = () => {
        const {step} = this.state;
        this.setState({
            step: step + 1
        });
    };

    // Go back to prev step
    prevStep = () => {
        const {step} = this.state;
        this.setState({
            step: step - 1
        });
    };

    handleChange = input => e => {
        this.setState({[input]: e.target.value});
    };

    render() {
        const {step} = this.state;
        const {
            appealAdressDescription,
            appealDistrict,
            appealNeighborhood,
            appealProvince,

            appealDescription,
            extraDescription,
            investmentAmount,

            customerDescription,
            customerDistrict,
            customerNeighborhood,
            customerProvince,

            birthDate,
            email,
            idNumber,
            lastName,
            firstName,
            phoneNumber,
            experience
        } = this.state;

        const values = {
            appealAdressDescription,
            appealDistrict,
            appealNeighborhood,
            appealProvince,

            appealDescription,
            extraDescription,
            investmentAmount,

            customerDescription,
            customerDistrict,
            customerNeighborhood,
            customerProvince,

            birthDate,
            email,
            idNumber,
            lastName,
            firstName,
            phoneNumber,
            experience
        };

        switch (step) {
            case 1:
                return (<FormUserDetails
                    nextStep={this.nextStep}
                    handleChange={this.handleChange}
                    values={values}/>);
            case 2:
                return (<FormAddressDetails
                    nextStep={this.nextStep}
                    prevStep={this.prevStep}
                    handleChange={this.handleChange}
                    values={values}/>);
            case 3:
                return (<FormAppealDetails
                    nextStep={this.nextStep}
                    prevStep={this.prevStep}
                    handleChange={this.handleChange}
                    values={values}/>);
            case 4:
                return (<FormAppealDescriptions
                    nextStep={this.nextStep}
                    prevStep={this.prevStep}
                    handleChange={this.handleChange}
                    values={values}/>);
            case 5:
                return (<Confirm nextStep={this.nextStep} prevStep={this.prevStep} values={values}/>);
            case 6:
                return <Success/>;
            default:
                (console.log('Çok adımlı başvuru formu.'))
        }
    }
}

export default UserForm;

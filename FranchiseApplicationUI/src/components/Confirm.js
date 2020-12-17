import React, {Component} from 'react';
import Dialog from '@material-ui/core/Dialog';
import AppBar from '@material-ui/core/AppBar';
import {ThemeProvider as MuiThemeProvider} from '@material-ui/core/styles';
import {List, ListItem, ListItemText} from '@material-ui/core/';
import Button from '@material-ui/core/Button';

export class Confirm extends Component {
    continue = e => {
        e.preventDefault();
        // PROCESS FORM //
        const {
            values: {
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
            }
        } = this.props;

        const appealObject = {
            appealDto: {
                addressDto: {
                    description: appealAdressDescription,
                    district: appealDistrict,
                    neighborhood: appealNeighborhood,
                    province: appealProvince
                },
                appealDescription: appealDescription,
                customerDto: {
                    addressDto: {
                        description: customerDescription,
                        district: customerDistrict,
                        neighborhood: customerNeighborhood,
                        province: customerProvince
                    },
                    birthDate: birthDate,
                    email: email,
                    idNumber: idNumber,
                    lastName: lastName,
                    firstName: firstName,
                    phoneNumber: phoneNumber
                },
                extraDescription: extraDescription,
                investmentAmount: investmentAmount,
                experience: experience
            }
        }

        fetch("http://localhost:8080/api/appeal/addAppeal", {
            method: "POST",
            mode: "cors",
            headers: {
                'Content-Type': 'application/json',
                Accept: 'application/json'
            },
            body: JSON.stringify(appealObject)
        });

        this
            .props
            .nextStep();
    };

    back = e => {
        e.preventDefault();
        this
            .props
            .prevStep();
    };

    render() {
        const {
            values: {
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
            }
        } = this.props;

        return (
            <MuiThemeProvider>
                <> <Dialog open fullWidth maxWidth='sm'>
                    <AppBar title="Confirm User Data"/>
                    <List>
                        <ListItem>
                            <ListItemText primary="Adınız: " secondary={firstName}/>
                        </ListItem>
                        <ListItem>
                            <ListItemText primary="Soyadınız: " secondary={lastName}/>
                        </ListItem>
                        <ListItem>
                            <ListItemText primary="Email Adresiniz: " secondary={email}/>
                        </ListItem>
                        <ListItem>
                            <ListItemText primary="Telefon Numaranız " secondary={phoneNumber}/>
                        </ListItem>
                        <ListItem>
                            <ListItemText primary="Bayi Konumu(İl): " secondary={appealProvince}/>
                        </ListItem>
                        <ListItem>
                            <ListItemText primary="Bayi Konumu(İlçe): "secondary={appealDistrict}/>
                        </ListItem>
                        <ListItem>
                            <ListItemText primary="Bayi Konumu(Semt): " secondary={appealNeighborhood}/>
                        </ListItem>
                        <ListItem>
                            <ListItemText
                                primary="Detaylı Bayi Konumu: " secondary={appealAdressDescription}/>
                        </ListItem>
                        <ListItem>
                            <ListItemText primary="Yatırım Miktarınız " secondary={investmentAmount}/>
                        </ListItem>
                    </List>
                    <br/>
                    <Button color="secondary" variant="contained" onClick={this.back}>GERİ</Button>

                    <Button color="primary" variant="contained" onClick={this.continue}>Başvuruyu Tamamla</Button>
                </Dialog>
            </>
        </MuiThemeProvider>
        );
    }
}

export default Confirm;

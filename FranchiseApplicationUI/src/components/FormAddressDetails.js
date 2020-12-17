import React, {Component} from 'react';
import Dialog from '@material-ui/core/Dialog';
import AppBar from '@material-ui/core/AppBar';
import {ThemeProvider as MuiThemeProvider} from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';

export class FormPersonalDetails extends Component {
    continue = e => {
        e.preventDefault();
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
        const {values, handleChange} = this.props;
        return (
            <MuiThemeProvider>
                <> <Dialog open fullWidth maxWidth='sm'>
                    <AppBar title="Enter Personal Details"/>
                    <h2>Başvuranın Adres Bilgileri</h2>
                    <TextField
                        placeholder="Yaşadığınız Şehri Giriniz."
                        label="Şehir"
                        onChange={handleChange('customerProvince')}
                        defaultValue={values.customerProvince}
                        margin="normal"
                        fullWidth/>
                    <br/>
                    <TextField
                        placeholder="Yaşadığınız İlçeyi Giriniz."
                        label="İlçe"
                        onChange={handleChange('customerDistrict')}
                        defaultValue={values.customerDistrict}
                        margin="normal"
                        fullWidth/>
                    <br/>
                    <TextField
                        placeholder="Yaşadığınız Semti Giriniz."
                        label="Semt"
                        onChange={handleChange('customerNeighborhood')}
                        defaultValue={values.customerNeighborhood}
                        margin="normal"
                        fullWidth/>
                    <br/>
                    <TextField
                        id="standard-multiline-flexible"
                        label="Multiline"
                        multiline
                        rowsMax={4}
                        placeholder="Adres Detaylarını Giriniz."
                        label="Adres Detayı"
                        onChange={handleChange('customerDescription')}
                        defaultValue={values.customerDescription}
                        margin="normal"
                        fullWidth/>
                    <br/>
                    <Button color="secondary" variant="contained" onClick={this.back}>GERİ</Button>

                    <Button color="primary" variant="contained" onClick={this.continue}>İLERİ</Button>
                </Dialog>
            </>
        </MuiThemeProvider>
        );
    }
}

export default FormPersonalDetails;

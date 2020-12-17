import React, {Component} from 'react';
import Dialog from '@material-ui/core/Dialog';
import AppBar from '@material-ui/core/AppBar';
import {ThemeProvider as MuiThemeProvider} from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import Radio from '@material-ui/core/Radio';
import RadioGroup from '@material-ui/core/RadioGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';

export class FormAppealDetails extends Component {
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
                    <AppBar title="Enter Appeal Details"/>
                    <h2>Bayilik Bilgileri</h2>
                    <TextField
                        placeholder="Bayi Açmak İstediğiniz Şehiri Giriniz."
                        label="Şehir"
                        onChange={handleChange('appealProvince')}
                        defaultValue={values.appealProvince}
                        margin="normal"
                        fullWidth/>
                    <br/>
                    <TextField
                        placeholder="Bayi Açmak İstediğiniz İlçeyi Giriniz."
                        label="İlçe"
                        onChange={handleChange('appealDistrict')}
                        defaultValue={values.appealDistrict}
                        margin="normal"
                        fullWidth/>
                    <br/>
                    <TextField
                        placeholder="Bayi Açmak İstediğiniz Semti Giriniz."
                        label="Semt"
                        onChange={handleChange('appealNeighborhood')}
                        defaultValue={values.appealNeighborhood}
                        margin="normal"
                        fullWidth/>
                    <br/>
                    <TextField
                        placeholder="Bayinin Adres Detaylarını Giriniz."
                        label="Adres Detaylarını Giriniz."
                        onChange={handleChange('appealAdressDescription')}
                        defaultValue={values.appealAdressDescription}
                        margin="normal"
                        fullWidth/>
                    <br/>
                    <TextField
                        type="number"
                        placeholder="Yatırım Miktarınız."
                        label="Yatırım Miktarınız."
                        onChange={handleChange('investmentAmount')}
                        defaultValue={values.investmentAmount}
                        margin="normal"
                        fullWidth/>
                    <br/>
                    <label>Daha önceden benzer bir deneyiminiz var mı?</label>
                    <RadioGroup row aria-label="position" name="position" defaultValue="top">
                        <FormControlLabel
                        onChange={handleChange('experience')}
                            value="true"
                            control={< Radio color = "primary" />}
                            label="Deneyimliyim."
                            labelPlacement="start"/>
                        <FormControlLabel
                        onChange={handleChange('experience')}
                            value="false"
                            control={< Radio color = "primary" />}
                            label="Deneyimim yok."
                            labelPlacement="start"/>
                    </RadioGroup>
                    <br/>
                    <Button color="secondary" variant="contained" onClick={this.back}>GERİ</Button>

                    <Button color="primary" variant="contained" onClick={this.continue}>İLERİ</Button>
                </Dialog>
            </>
        </MuiThemeProvider>
        );
    }
}

export default FormAppealDetails;

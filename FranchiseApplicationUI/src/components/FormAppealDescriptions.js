import React, {Component} from 'react';
import Dialog from '@material-ui/core/Dialog';
import AppBar from '@material-ui/core/AppBar';
import {ThemeProvider as MuiThemeProvider} from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';


export class FormAppealDescriptions extends Component {
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
                    <h2>Ek Açıklamalar</h2>
                    <TextField
                        id="standard-multiline-flexible"
                        label="Multiline"
                        multiline
                        rowsMax={4}
                        placeholder="Bizi Tercih Etme Sebebiniz"
                        label="Bizi Tercih Etme Sebebiniz:"
                        onChange={handleChange('appealDescription')}
                        defaultValue={values.appealDescription}
                        margin="normal"
                        fullWidth/>
                    <br/>
                    <TextField
                        id="standard-multiline-flexible"
                        label="Multiline"
                        multiline
                        rowsMax={4}
                        placeholder="Eklemek İstediğiniz Diğer Şeyler"
                        label="Eklemek İstediğiniz Diğer Şeyler:"
                        onChange={handleChange('extraDescription')}
                        defaultValue={values.extraDescription}
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

export default FormAppealDescriptions;

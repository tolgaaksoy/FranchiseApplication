import React, { Component } from 'react';
import Dialog from '@material-ui/core/Dialog';
import AppBar from '@material-ui/core/AppBar';
import { ThemeProvider as MuiThemeProvider } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import Input from '@material-ui/core/Input';

export class FormUserDetails extends Component {
  continue = e => {
    e.preventDefault();
    this.props.nextStep();
  };

  render() {
    const { values, handleChange } = this.props;
    return (
      <MuiThemeProvider>
        <>
          <Dialog
            open
            fullWidth
            maxWidth='sm'
          >
            <AppBar title="Enter User Details" />
            <h2>Başvuranın Kişisel Bilgileri</h2>
            <TextField
              placeholder="Adınız"
              label="Adınız"
              onChange={handleChange('firstName')}
              defaultValue={values.firstName}
              margin="normal"
              fullWidth
            />
            <br />
            <TextField
              placeholder="Soyadınız"
              label="Soyadınız"
              onChange={handleChange('lastName')}
              defaultValue={values.lastName}
              margin="normal"
              fullWidth
            />
            <br />
            <TextField
            type="number"
            inputProps={{ min: 10000000000, max: 99999999999 }}
              placeholder="TC Kimlik Numaranız"
              label="TC Kimlik Numaranız"
              onChange={handleChange('idNumber')}
              defaultValue={values.idNumber}
              margin="normal"
              fullWidth
            />
            <br />
            <TextField
              id="date"
              label="Dogum Tarihiniz"
              type="date"
              onChange={handleChange('birthDate')}
              defaultValue={values.birthDate}
              margin="normal"
              InputLabelProps={{
                shrink: true,
              }}
              fullWidth
            />
            <br />
            <TextField
            type="number"
              placeholder="Telefon Numaranız"
              label="Telefon Numarası"
              onChange={handleChange('phoneNumber')}
              defaultValue={values.phoneNumber}
              margin="normal"
              fullWidth
            />
            <br />
            <TextField
              placeholder="Email Adresiniz"
              label="Email Adresiniz"
              onChange={handleChange('email')}
              defaultValue={values.email}
              margin="normal"
              fullWidth
            />
            <br />
            <Button
              color="primary"
              variant="contained"
              onClick={this.continue}
            >İLERİ</Button>
          </Dialog>
        </>
      </MuiThemeProvider>
    );
  }
}

export default FormUserDetails;

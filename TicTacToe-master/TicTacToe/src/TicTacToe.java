import React, { useState } from 'react';
import { FormGroup, FormControlLabel, Checkbox } from '@mui/material';

const CheckboxGroupMui = () => {
  const [state, setState] = useState({
    reading: false,
    traveling: false,
    cooking: false,
  });

  const handleChange = (event) => {
    setState({
      ...state,
      [event.target.name]: event.target.checked,
    });
  };

  return (
    <FormGroup>
      {Object.keys(state).map((key) => (
        <FormControlLabel
          control={
            <Checkbox
              checked={state[key]}
              onChange={handleChange}
              name={key}
            />
          }
          label={key.charAt(0).toUpperCase() + key.slice(1)}
          key={key}
        />
      ))}
    </FormGroup>
  );
};

export default CheckboxGroupMui;
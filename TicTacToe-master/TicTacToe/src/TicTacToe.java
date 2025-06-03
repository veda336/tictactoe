import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
public class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame jFrame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe(){
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(800,800);
        jFrame.getContentPane().setBackground(new Color(50,50,50));
        jFrame.setLayout(new BorderLayout());
        jFrame.setVisible(true);

        textField.setBackground(new Color(25,25,25));
        textField.setForeground(new Color(25,255,0));
        textField.setFont(new Font("Ink Free", Font.BOLD,75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("TIC-TAC-TOE");
        textField.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);
        title_panel.add(textField);

        button_panel.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++){
            buttons[i]=new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        jFrame.add(title_panel,BorderLayout.NORTH);
        jFrame.add(button_panel);

        firstTurn();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<9;i++){
            if(e.getSource()==buttons[i]){
                if(player1_turn){
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        textField.setText("O Turn");
                        check();
                    }
                }
                else{
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        player1_turn=true;
                        textField.setText("X Turn");
                        check();
                    }
                }
            }
        }
    }
    public void  firstTurn(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(random.nextInt(2)==0){
            player1_turn=true;
            textField.setText("X Turn");
        }else{
            player1_turn=false;
            textField.setText("O Turn");
        }
    }
    public void check(){
        if((buttons[0].getText()=="X") &&
                (buttons[1].getText()=="X") &&
                (buttons[2].getText()=="X")){
            xWins(0,1,2);
        }
        if((buttons[3].getText()=="X") &&
                (buttons[4].getText()=="X") &&
                (buttons[5].getText()=="X")){
            xWins(3,4,5);
        }
        if((buttons[6].getText()=="X") &&
                (buttons[7].getText()=="X") &&
                (buttons[8].getText()=="X")){
            xWins(6,7,8);

        }
        if((buttons[0].getText()=="X") &&
                (buttons[3].getText()=="X") &&
                (buttons[6].getText()=="X")){
            xWins(0,3,6);
        }
        if((buttons[1].getText()=="X") &&
                (buttons[4].getText()=="X") &&
                (buttons[7].getText()=="X")){
            xWins(1,4,7);
        }
        if((buttons[2].getText()=="X") &&
                (buttons[5].getText()=="X") &&
                (buttons[8].getText()=="X")){
            xWins(2,5,8);
        }
        if((buttons[0].getText()=="X") &&
                (buttons[4].getText()=="X") &&
                (buttons[8].getText()=="X")){
            xWins(0,4,8);
        }
        if((buttons[2].getText()=="X") &&
                (buttons[4].getText()=="X") &&
                (buttons[6].getText()=="X")){
            xWins(2,4,6);
        }

        if((buttons[0].getText()=="O") &&
                (buttons[1].getText()=="O") &&
                (buttons[2].getText()=="O")){
            oWins(0,1,2);
        }
        if((buttons[3].getText()=="O") &&
                (buttons[4].getText()=="O") &&
                (buttons[5].getText()=="O")){
            oWins(3,4,5);
        }
        if((buttons[6].getText()=="O") &&
                (buttons[7].getText()=="O") &&
                (buttons[8].getText()=="O")){
            oWins(6,7,8);

        }
        if((buttons[0].getText()=="O") &&
                (buttons[3].getText()=="O") &&
                (buttons[6].getText()=="O")){
            oWins(0,3,6);
        }
        if((buttons[1].getText()=="O") &&
                (buttons[4].getText()=="O") &&
                (buttons[7].getText()=="O")){
            oWins(1,4,7);
        }
        if((buttons[2].getText()=="O") &&
                (buttons[5].getText()=="O") &&
                (buttons[8].getText()=="O")){
            oWins(2,5,8);
        }
        if((buttons[0].getText()=="O") &&
                (buttons[4].getText()=="O") &&
                (buttons[8].getText()=="O")){
            oWins(0,4,8);
        }
        if((buttons[2].getText()=="O") &&
                (buttons[4].getText()=="O") &&
                (buttons[6].getText()=="O")){
            oWins(2,4,6);
        }
    }
    public void xWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        textField.setText("X Wins");
    }
    public void oWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        textField.setText("O Wins");
    }
}



import React, { useState } from 'react';

const questionConfigs = {
  question1: {
    label: 'Choose your hobbies',
    options: [
      { type: 'checkbox', label: 'Reading', group: 'hobbies' },
      { type: 'checkbox', label: 'Sports', group: 'hobbies' },
      { type: 'checkbox', label: 'Music', group: 'hobbies' }
    ]
  },
  question2: {
    label: 'Personal Details',
    options: [
      { type: 'input', placeholder: 'Your Name', group: 'name' },
      {
        type: 'dropdown',
        label: 'Role',
        choices: ['User', 'Admin', 'Manager'],
        group: 'personal'
      },
      { type: 'checkbox', label: 'Agree to Terms', group: 'personal' }
    ]
  },
  question3: {
    label: 'Preferences',
    options: [
      {
        type: 'dropdown',
        label: 'Frequency',
        choices: ['Daily', 'Weekly', 'Monthly'],
        group: 'preferences'
      },
      { type: 'checkbox', label: 'Enable Notifications', group: 'preferences' }
    ]
  }
};

const App = () => {
  const [selectedQuestion, setSelectedQuestion] = useState('');
  const [formValues, setFormValues] = useState({});

  const handleRadioChange = (e) => {
    setSelectedQuestion(e.target.value);
    setFormValues({}); // reset form when switching
  };

  const normalizeAnswers = (formValues) => {
    const normalized = {};
    for (const [group, value] of Object.entries(formValues)) {
      if (Array.isArray(value)) {
        normalized[group] = value.length === 1 ? value[0] : value;
      } else {
        normalized[group] = value;
      }
    }
    return normalized;
  };

  const handleSubmit = () => {
    const payload = {
      question: selectedQuestion,
      answers: normalizeAnswers(formValues)
    };
    console.log('Payload:', payload);
    alert(JSON.stringify(payload, null, 2));
  };

  return (
    <div style={{ padding: '2rem', fontFamily: 'Arial' }}>
      <h2>Select a Question</h2>
      {Object.keys(questionConfigs).map((key) => (
        <label key={key} style={{ marginRight: '1rem' }}>
          <input
            type="radio"
            name="question"
            value={key}
            checked={selectedQuestion === key}
            onChange={handleRadioChange}
          />
          {questionConfigs[key].label}
        </label>
      ))}

      <hr />

      {selectedQuestion && (
        <div>
          <h3>{questionConfigs[selectedQuestion].label}</h3>
          <div style={{ display: 'flex', flexWrap: 'wrap', gap: '1rem' }}>
            {questionConfigs[selectedQuestion].options.map((opt, i) => {
              const groupKey = opt.group;

              if (opt.type === 'checkbox') {
                return (
                  <label key={i}>
                    <input
                      type="checkbox"
                      onChange={(e) => {
                        setFormValues((prev) => {
                          const prevValues = prev[groupKey] || [];
                          const newValues = e.target.checked
                            ? [...new Set([...prevValues, opt.label])]
                            : prevValues.filter((val) => val !== opt.label);
                          return { ...prev, [groupKey]: newValues };
                        });
                      }}
                    />
                    {opt.label}
                  </label>
                );
              }

              if (opt.type === 'dropdown') {
                return (
                  <div key={i}>
                    <label>{opt.label}</label>
                    <br />
                    <select
                      defaultValue=""
                      onChange={(e) => {
                        const selected = e.target.value;
                        setFormValues((prev) => {
                          const prevValues = prev[groupKey] || [];
                          const newValues = [...new Set([...prevValues.filter(v => v !== selected), selected])];
                          return { ...prev, [groupKey]: newValues };
                        });
                      }}
                    >
                      <option value="" disabled>Select</option>
                      {opt.choices.map((choice, j) => (
                        <option key={j} value={choice}>
                          {choice}
                        </option>
                      ))}
                    </select>
                  </div>
                );
              }

              if (opt.type === 'input') {
                return (
                  <input
                    key={i}
                    type="text"
                    placeholder={opt.placeholder}
                    onChange={(e) => {
                      const inputVal = e.target.value;
                      setFormValues((prev) => {
                        return { ...prev, [groupKey]: inputVal };
                      });
                    }}
                  />
                );
              }

              return null;
            })}
          </div>
          <button onClick={handleSubmit} style={{ marginTop: '1rem' }}>
            Submit
          </button>
        </div>
      )}
    </div>
  );
};

export default App;



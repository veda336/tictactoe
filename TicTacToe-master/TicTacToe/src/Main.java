public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
    }
}
import React from 'react';

const EmailToMailto = ({ sentence }) => {
  const transformEmailToLink = (text) => {
    const emailRegex = /\b[A-Za-z0-9._%+-]+@gmail\.com\b/g; // Regex to find Gmail addresses
    return text.split(emailRegex).map((part, index, arr) => {
      if (index < arr.length - 1) {
        const emailMatch = text.match(emailRegex)[index];
        return (
          <React.Fragment key={index}>
            {part}
            <a href={`mailto:${emailMatch}`}>{emailMatch}</a>
          </React.Fragment>
        );
      }
      return part;
    });
  };

  return <p>{transformEmailToLink(sentence)}</p>;
};

export default EmailToMailto;
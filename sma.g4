grammar sma;

DIGIT: [0-9]+;
HEX_NUMBER: [0][xX][0-9a-fA-F]+;

addition: addition '+' DIGIT
        | DIGIT;

subtraction: subtraction '-' DIGIT
        | DIGIT;

multiplication: multiplication '*' DIGIT
        | DIGIT;

division: division '/' DIGIT
        | DIGIT;

addition_hex: addition_hex '+' HEX_NUMBER
        | HEX_NUMBER;

subtraction_hex: subtraction_hex '-' HEX_NUMBER
        | HEX_NUMBER;

multiplication_hex: multiplication_hex '*' HEX_NUMBER
        | HEX_NUMBER;

division_hex: division_hex '/' HEX_NUMBER
        | HEX_NUMBER;

bitwise_and: bitwise_and '&' HEX_NUMBER
        | HEX_NUMBER '&' HEX_NUMBER;

bitwise_or: bitwise_or '|' HEX_NUMBER
        | HEX_NUMBER '|' HEX_NUMBER;

bitwise_xor: bitwise_xor '^' HEX_NUMBER
        | HEX_NUMBER '^' HEX_NUMBER;

not: '!' HEX_NUMBER;
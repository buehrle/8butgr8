grammar sma;

addition: addition '+' ZAHL
        | ZAHL;

ZAHL: [0-9]+;
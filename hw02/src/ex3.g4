grammar ex2;

main : condition EOF;

condition: odd | reverse;

reverse : | '0' piece '0' | '1' piece '1';

piece: '0' | '1' | reverse;

odd: even '1' | even '0';

even: | digit digit;

digit: '1' | '0';


grammar ex2;

main : reverse_and_odd EOF;

reverse_and_odd : '0' piece '0' | '1' piece '1';

piece: '0' | '1' | reverse_and_odd;

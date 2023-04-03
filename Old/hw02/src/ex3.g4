grammar ex3;

main : reverse EOF;

reverse : | '0' piece '0' | '1' piece '1';

piece: '0' | '1' | reverse;

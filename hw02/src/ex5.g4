grammar ex4;

main: content EOF;

content: | piece 'c';

piece: 'a' | 'b' | 'a' piece 'c' | 'b' piece 'c';
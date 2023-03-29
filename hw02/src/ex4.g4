grammar ex4;

main: content EOF;

content: | 'a' content 'c' | 'b' ext 'c';

ext: | 'b' ext 'c';
grammar ex5;

main: condition EOF;

condition: equal | double;

equal: | '0' equal '1';

double: | '0' double '1' '1';
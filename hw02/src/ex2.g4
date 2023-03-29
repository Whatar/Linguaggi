grammar ex1;

main: a '1' a '1' a '1' a '1' b;

a: | '0' a;
b: | '0' b | '1' b;

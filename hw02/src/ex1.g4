grammar ex1;

main: piece '1' piece '1' piece '1' piece '1' tail;

piece: | '0' piece;
tail: | '0' tail | '1' tail;

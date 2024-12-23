This project contains a few different interpreters built with Java and HAML4.

This interpreters were built for a course at [univr](https://www.corsi.univr.it/?ent=cs&id=420)

The final project, and the most interesting one, is documented here.

# [Have Fun](https://github.com/Whatar/Linguaggi/tree/master/HaveFun)

This interpreter was invented for a simple language "Have Fun", similar to javascript, with support for the following functionalities:

- Functions
- Variables
- Global variables
- different scopes
- recursive functions and scopes
- mutually recursive functions and scopes
- different nested languages (The interpreter supports the use of the fictional "CHUCK NORRIS" programming language inside braces).

The following is an example script written in the "Have Fun" language, supported by the interpreter.

```
fun f(x) {
  out(g * 42);
  return x + 42
}

g = 3;
out(f(g))


fun const() {
  return5
}

out(const())


fun f(x) {
    out( { 333 + 333 } nd { 42 * 42 } );
    return x
}

out(f(42))


fun anna() {
  A = 3.0/2.0;
  return A
}

out(anna())


fun f(x, y) {
  return y
}

out(f(1, 2));
global t = 42;
out(f(3, 4))


fun f(x, y) {
  global t = 3;
  return y
}

out(f(1, 2))


fun f(x, y) {
  global a = 5
  return y
}

out(f(1, 2, 3))


fun f(x){
    y.g = 42 + 0;
    return y.g
}

global y = 42;
f(42);
out(y.g)


fun f(x, y) { return y }

out(f(1, 2, 3))


fun AnnaKarenina(x){
	y = x * x;
	${
	IT'S SHOWTIME
	  HEY CHRISTMAS TREE a
	  YOU SET US UP 0.0
	  GET TO THE CHOPPER a
	  HERE IS MY INVITATION 4.0
	  GET UP y
	  YOU'RE FIRED 2.0
	  ENOUGH TALK
	  TALK TO THE HAND a
	YOU HAVE BEEN TERMINATED
	}$;
	return 42
	}

out(AnnaKarenina(42))


fun f(x) { return 1 }

fun x(f) { return 2 }

f = 3;
out(f(f) + x(x))


fun f(x) { return 1 }

out(f)


fun f(x) { return 1 }

out(g(0))


fun f(x, y, x) { return 1 }

out(1)


fun f() { return 1 }

fun f(x) { return 1 }

out(1)
```

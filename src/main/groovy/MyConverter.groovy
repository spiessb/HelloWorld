class Converter {
    static celsius(fahrenheit) { (fahrenheit - 32) * 5 / 9 }
    static fahrenheit(celsius) { 9/5 * celsius + 32 }
}

def f100 = 100.0
def cel  = Converter.celsius(f100)
printf("%1.1f Fahrenheit sind %.1f Celcius.%n", f100, cel )

//convert and convert back
printf("Hundert F hin und zurück ... %.1f%n", Converter.fahrenheit(Converter.celsius(100.0)) )

def heiss = 95
println heiss + " F sind " + Converter.celsius(heiss) + " C."
assert 35 == Converter.celsius(95)
class Converter {
    static celsius(fahrenheit) { (fahrenheit - 32) * 5 / 9 }
    static fahrenheit(celsius) { 9/5 * celsius + 32 }
}

def f = 100.0
def c = Converter.celsius(f)
printf("%1.1f Fahrenheit sind %.1f Celcius.%n", f, c)

//convert and convert back
printf("%.1f%n", Converter.fahrenheit(Converter.celsius(100.0)) )

println Converter.celsius(95)
assert 35 == Converter.celsius(95)
import java.text.SimpleDateFormat
import java.util.logging.SimpleFormatter

def name = 'Beat'
println "Hello $name!"

def d = new Date()
def f = new SimpleDateFormat('dd.MM.yyyy HH:mm')
println f.format(d)

println(d)
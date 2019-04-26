import java.text.SimpleDateFormat
import java.util.logging.SimpleFormatter

def name = 'Beat'
println "Hello $name!"

// Date formats
def d = new Date()
def f = new SimpleDateFormat('dd.MM.yyyy HH:mm')
println f.format(d)

// default SimpleDateFormat
def sf = new SimpleDateFormat()
println sf.format(d)            // dd.MM.yy
println(d)                      // e.g. Fri Apr 26 13:38:10 CEST 2019

println('Bloss ein bisschen Schrott ;-)')

assert 1 == 1

def nick = 'ReGina'
def book = 'Groovy in Action, 2nd ed.'
assert "$nick is $book" == 'ReGina is Groovy in Action, 2nd ed.'

assert 1 instanceof Integer
assert 1 instanceof Number

assert 1.plus(2.5) == 3.5
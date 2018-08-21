/**
 * GinA, listing 14.3, p. 512
 */

import groovy.xml.DOMBuilder
import groovy.xml.dom.DOMCategory

def doc = DOMBuilder.parse(new FileReader('../../data/plan.xml'))
def plan = doc.documentElement
use(DOMCategory) {
    assert plan.name() == 'plan'
    assert plan.week[0].name() == 'week'
    assert plan.week[0].'@capacity' == '8'
    assert plan.week.task[0].name() == 'task'
    assert plan.week.task[0].text() == 'easy'
}

println new Date()

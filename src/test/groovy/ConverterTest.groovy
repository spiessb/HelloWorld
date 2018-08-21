class ConverterTest extends GroovyTestCase {
    void testSimple() {
        assertEquals("Convert 95 F to 35 C", 35.0 ,Converter.celsius(95))
    }
}

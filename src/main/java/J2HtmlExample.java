import j2html.tags.ContainerTag;

import static j2html.TagCreator.*;

/**
 * See https://j2html.com/
 * Unfortunately not part of Java yet.
 */
public class J2HtmlExample {

    public static void main(String[] args) {
        System.out.println(
                html(
                        body(
                                h1("Hello World!"),
                                p("Some text in a paragraph.")
                        )
                ).renderFormatted()
        );
    }
}

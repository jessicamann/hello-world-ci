package hello;

import org.junit.Test;

/**
 * Created by jmann on 10/20/16.
 */
public class GreeterTest {
    @Test
    public void shouldReturnHello() throws Exception {
        assert(new Greeter().sayHello()).equals("Hello World");
    }
}
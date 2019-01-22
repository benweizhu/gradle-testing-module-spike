import me.zeph.gradle.spike.gradletestspike.service.CustomerService;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CustomerServiceTest {
    @Test
    public void shouldReturnHi() {
        CustomerService customerService = new CustomerService();
        assertThat(customerService.sayHi(), is("hi"));
    }
}

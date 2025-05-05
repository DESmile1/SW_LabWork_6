import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testPasswordHashing() {
        User user = new User("testUser", "password123");
        assertNotNull(user.getPasswordHash());
        assertNotEquals("password123", user.getPasswordHash());
    }
}

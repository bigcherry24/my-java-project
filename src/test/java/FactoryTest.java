import org.junit.jupiter.api.Test;

import com.example.afm.GUIFactory;
import com.example.afm.MacButton;
import com.example.afm.MacCheckbox;
import com.example.afm.MacFactory;
import com.example.afm.WindowsButton;
import com.example.afm.WindowsCheckbox;
import com.example.afm.WindowsFactory;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    public void testWindowsFactory() {
        GUIFactory factory = new WindowsFactory();
        assertNotNull(factory.createButton());
        assertNotNull(factory.createCheckbox());
        assertTrue(factory.createButton() instanceof WindowsButton);
        assertTrue(factory.createCheckbox() instanceof WindowsCheckbox);
    }

    @Test
    public void testMacFactory() {
        GUIFactory factory = new MacFactory();
        assertNotNull(factory.createButton());
        assertNotNull(factory.createCheckbox());
        assertTrue(factory.createButton() instanceof MacButton);
        assertTrue(factory.createCheckbox() instanceof MacCheckbox);
    }
}

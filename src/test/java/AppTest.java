import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {

    @Test
    void testMain() {
        // main 메서드를 테스트하기 위해 System.out을 캡처합니다.
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // main 메서드 실행
        App.main(new String[]{});

        // 출력된 내용 확인
        assertEquals("Hello, World!\n", outContent.toString());

        // 원래의 System.out으로 복원
        // Restores the original System.out PrintStream that was saved before the test
        System.setOut(originalOut);
    }
}
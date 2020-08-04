package mock;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    SecurityCenter securityCenter;
    mockDoorPanel mockDoorPanel;
    @BeforeEach
    public void setUp() {
        mockDoorPanel = new mockDoorPanel();
        securityCenter = new SecurityCenter(mockDoorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        assertEquals(true,mockDoorPanel.flag);
    }

    class mockDoorPanel extends DoorPanel{
        public boolean flag = false;
        public void close() {
            flag = true;
        }
    }
}

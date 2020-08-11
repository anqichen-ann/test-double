package Mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import stub.GradeService;
import stub.GradeServiceTest;
import stub.GradeSystem;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class SecurityCenterTest {
    SecurityCenter securityCenter;
    @Mock DoorPanel doorPanel;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter = new SecurityCenter(doorPanel);
        when(doorPanel.close()).thenReturn(true);
        securityCenter.switchOn();
    }
}

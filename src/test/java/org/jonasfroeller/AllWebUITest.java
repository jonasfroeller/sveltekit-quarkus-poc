package org.jonasfroeller;

import io.quarkiverse.quinoa.testing.QuinoaTestProfiles;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(QuinoaTestProfiles.EnableAndRunTests.class) // EnableAndRunTests => Quarkus + Frontend
public class AllWebUITest {
    @Test
    public void runsFrontendTestsToo() {
        // runs package.json "test" too
    }
}
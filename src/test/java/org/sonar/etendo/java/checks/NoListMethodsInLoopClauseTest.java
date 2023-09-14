package org.sonar.etendo.java.checks;

import org.junit.jupiter.api.Test;
import org.sonar.java.checks.verifier.CheckVerifier;

class NoListMethodsInLoopClauseTest {

  @Test
  void test() {
    CheckVerifier.newVerifier()
        .onFile("src/test/files/NoListMethodsInLoopClause.java")
        .withCheck(new NoListMethodsInLoopClause())
        .verifyIssues();
  }
}
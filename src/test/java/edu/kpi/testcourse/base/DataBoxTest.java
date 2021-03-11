package edu.kpi.testcourse.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Вводим равные значения.
 */
class DataBoxTest {

  @Test
  void checkValueSaving() {
    DataBoxTest dataBoxTest = new DataBoxTest();
    assertThat("Test1").isEqualTo("Test1");
  }
}

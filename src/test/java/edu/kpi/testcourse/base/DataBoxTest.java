package edu.kpi.testcourse.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Вводим разные значения.
 */
class DataBoxTest {

  @Test
  void checkValueSaving() {
    DataBoxTest dataBoxTest = new DataBoxTest();
    assertThat("Test1").isEqualTo("Test2");
  }
}

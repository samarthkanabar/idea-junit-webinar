package test.base.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.base.demo.ModuleDemo;

class ModuleTests {

  @Test
  void moduleNameIsTestBase() {
    String expected = "test.base";
    String actual = ModuleDemo.class.getModule().getName();
    Assertions.assertEquals(expected, actual);
  }
}

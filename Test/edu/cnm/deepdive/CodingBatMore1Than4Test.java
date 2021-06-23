package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatMore1Than4Test {

  private int[][] more14Params = {
      {1, 4, 1},
      {1, 4, 1, 4},
      {1, 1},
      {1, 6, 6},
      {1},
      {1, 4},
      {6, 1, 1},
      {1, 6, 4},
      {1, 1, 4, 4, 1},
      {1, 1, 6, 4, 4, 1},
      {},
      {4, 1, 4, 6},
      {4, 1, 4, 6, 1},
      {1, 4, 1, 4, 1, 6}
  };


  private boolean[] more14Expected = {true, false, true, true, true, false, true, false, true, true,
  false, false, false, true};


  @Test
  void more14Test() {
    for (int i = 0; i < more14Params.length; i++) {
      boolean actual = CodingBatMore1Than4.more14(more14Params[i]);
      Assertions.assertEquals(actual, more14Expected[i]);
    }
  }

}
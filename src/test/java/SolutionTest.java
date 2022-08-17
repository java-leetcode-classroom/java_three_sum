import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void threeSumExample1() {
    assertEquals(
      List.of(
        List.of(-1,-1,2),
        List.of(-1,0,1)),
      sol.threeSum(new int[]{
        -1,0,1,2,-1,-4
      }));
  }
  @Test
  void threeSumExample2() {
    assertEquals(
        List.of(),
        sol.threeSum(new int[]{
          0,1,1
        }));
  }
  @Test
  void threeSumExample3() {
    assertEquals(
        List.of(List.of(0,0,0)),
        sol.threeSum(new int[]{
          0,0,0
        }));
  }
}
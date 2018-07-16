package com.android.awells.kyu5.WeightForWeight;

import static org.junit.Assert.assertTrue;

import com.android.awells.kyu5.WeightForWeight.Solution.Pair;
import com.android.awells.kyu5.WeightForWeight.Solution.PairComparator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

/**
 * Tests written by https://github.com/awells111. I am writing these BEFORE I write my solution in
 * order to practice Test Driven Development.
 */
public class SolutionTest {

  @Test
  public void comparatorTest() {
    List<Pair> list = new LinkedList<>();
    list.add(new Pair("9"));
    list.add(new Pair("9999"));
    list.add(new Pair("111111111"));

    Collections.sort(list, new PairComparator());

    assertTrue(list.get(0).num.equals("111111111") && list.get(0).weight == 9);
    assertTrue(list.get(1).num.equals("9") && list.get(1).weight == 9);
    assertTrue(list.get(2).num.equals("9999") && list.get(2).weight == 36);
  }

  @Test
  public void buildList() {
    List<Pair> list = Solution.buildList("    101 12 4 5 ");

    assertTrue(list.get(0).num.equals("101") && list.get(0).weight == 2);
    assertTrue(list.get(1).num.equals("12") && list.get(1).weight == 3);
    assertTrue(list.get(2).num.equals("4") && list.get(2).weight == 4);
    assertTrue(list.get(3).num.equals("5") && list.get(3).weight == 5);
  }
}

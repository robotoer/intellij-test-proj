package com.wibidata.intellij;

public interface SudokuBoard {
  Iterable<Integer> getRow(final int rowIndex);
  Iterable<Integer> getColumn(final int columnIndex);
  Iterable<Integer> getSubSquare(final int subSquareIndex);
}

public class RightAngle
{
  public static void main(String args[])
  {
    int row, column, numberOfRows=8;
    for(row=0; row<numberOfRows; row++)
    {
      for(column=0; column<=row; column++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
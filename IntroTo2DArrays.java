import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args){
    int[][] ray = new int[2][3];

    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;

    System.out.println(Arrays.toString(ray));

    //Print the first array in the array ray
    System.out.println(Arrays.toString(ray[0]));
    System.out.println(Arrays.toString(ray[1]));

    //ray.length is the number of rows
    for(int row = 0; row < ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //change all values in the 2D array to 7
    for(int row = 0; row < ray.length; row++)
    {
      for(int column = 0; column < ray[row].length; column++)
      {
        ray[row][column] = 7;
      }
    }

    for(int row = 0; row < ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //Fill the array with random numbers from 0-10 inclusive
    for(int row = 0; row < ray.length; row++)
    {
      for(int column = 0; column < ray[row].length; column++)
      {
        ray[row][column] = (int)(Math.random()*11);
      }
    }

    for(int row = 0; row < ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //find the sum of each row
    int sum = 0;
    for(int row = 0; row < ray.length; row++)
    {
      sum = 0;

      for(int column = 0; column < ray[row].length; column++)
      {
        sum += ray[row][column];
      }

      System.out.println("The sum of row " + row + " is: " + sum);
    }

    System.out.println("\n\n\n Homework Assignment");
    //Add the columns of each row using for each loops
    int total = 0;
    for(int[] row: ray)
    {
      for(int column: row)
      {
        total += column;
      }
    }
    System.out.println("The sum of the Array is: " + total);
  }
}

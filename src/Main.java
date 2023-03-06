import java.util.ArrayList;
import java.util.Collections;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList<Integer> arr = new ArrayList<>(0);
    arr.add(100);
    arr.add(5);
    arr.add(55);
    arr.add(0);
    System.out.println("Unsorted -> " + arr);
    Collections.sort(arr);
    System.out.println("Sorted -> " + arr);
    System.out.println("Collections FrameWork");
  }
}
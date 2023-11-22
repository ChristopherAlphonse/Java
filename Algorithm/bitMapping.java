package Algorithm;

public class bitMapping{

    int mask = 0x0f;
      int value = 0x55;


    public int performBitMapping(){
      return mask & value;
    }


    public static void main(String[] args) {
    bitMapping bitMap = new bitMapping();
    System.out.println(bitMap.performBitMapping());      
  }

}

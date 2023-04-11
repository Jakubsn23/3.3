import java.util.Random;

class Main {
  public static void main(String[] args) 
  {
    Random r = new Random();

    int [][] tab = new int[10][10];
    for(int i=0; i<tab.length; i++)
      {
        for(int j=0; j<tab.length; j++)
          {
            tab[i][j] = r.nextInt(50 + 50) - 50;
            System.out.print(tab[i][j] + " ");
          }
        System.out.println();
      }
  }
}
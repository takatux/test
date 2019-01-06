//import java.*;
import javax.swing.*;

class pencarianArray {
  public static void main(String[] args) {
    
    int[] DataArray = {4,5,7,20,60,45,5,5,80,7};
    int i, nilaiX;
    boolean ketemu;
    
    for(i=0;i<DataArray.length;i++){
      System.out.print(DataArray[i]+" ");
    }
    System.out.println();
    
    String bilangan = JOptionPane.showInputDialog("Masukkan nilai yang dicari");
    nilaiX = Integer.parseInt(bilangan);
    
    ketemu = false;
    for (i=0;i<DataArray.length;i++){
      if (DataArray[i]==nilaiX){
        ketemu = true;
        break;
      }
    }
    if (ketemu==true){
      System.out.println("Data ditemukan pada elemen ke"+(i+1));
    }
    else
      System.out.println("Data tidak ditemukan");
    
    System.out.println("\n");
    System.exit(0);
  }  
}


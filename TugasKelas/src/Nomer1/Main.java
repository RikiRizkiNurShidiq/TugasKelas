package Nomer1;

public class Main {
	public static void main(String[] args) {
        
        Object [][] data ={
            {"Jonny"  ,"1996" ,"Laki"     }, // baris ke-0
            {"Rony"   ,"1995" ,"Laki"     }, // baris ke-1
            {"Tony"   ,"1996" ,"Laki"     }, // baris ke-2
            {"Dony"   ,"1997" ,"Laki"     }, // baris ke-3
            {"Tiffany","1997" ,"Perempuan"}  // baris ke-4
        };
        
        Object[][] ganti = ChangeArrayLength.changeLength2D(data, 9, 3);
        
        System.out.println("Length   : "+ganti.length);
        System.out.println("Length 2 : "+ganti[0].length);
        System.out.println("");
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
            System.out.println();
        }
    }
}


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[]znak={" 2"," 3"," 4"," 5"," 6"," 7"," 8"," 9"," 10"," В"," Д"," К"," Т"};
        String[]mast={"♡","♢","♧", "♤"};
        String[]koloda=new String[52];
        for (int r=0;r<6;r++){
        int z=0;
        int z1=0;
        int z2=0;
        int z3=0;
        String t;
            for (int i = 0; i < 52; i++) {
                if (i < 13) {
                    koloda[i] = znak[z] + mast[0];
                    z = z + 1;
                } else if (i < 26) {
                    koloda[i] = znak[z1] + mast[1];
                    z1 = z1 + 1;
                } else if (i < 39) {
                    koloda[i] = znak[z2] + mast[2];
                    z2 = z2 + 1;
                } else {
                    koloda[i] = znak[z3] + mast[3];
                    z3 = z3 + 1;
                }
            }for (int j=0;j<52;j++){
                int x = (int) (Math.random()*52);
                int y = (int) (Math.random()*52);
                t = koloda[x];
                koloda[x] = koloda[y];
                koloda[y] = t;
            }// ниже сортировка без функции случайного выбора
           /* for (int j = 0; j < 52; j++) {
                String t;
                if (j % 3 == 0 & j < 39) {
                    t = koloda[j + 13];
                    koloda[j + 13] = koloda[j];
                    koloda[j] = t;
                } else if (j % 3 == 0 & j > 39) {
                    t = koloda[j - 18];
                    koloda[j - 18] = koloda[j];
                    koloda[j] = t;
                }
            }*/
        }
        System.out.println(Arrays.toString(koloda));
        System.out.println("Первый игрок получает " + koloda[0]+koloda[4]+koloda[8]+koloda[12]+koloda[16]);
        System.out.println("Второй игрок получает " + koloda[1]+koloda[5]+koloda[9]+koloda[13]+koloda[17]);
        System.out.println("Третий игрок получает " + koloda[2]+koloda[6]+koloda[10]+koloda[14]+koloda[18]);
        System.out.println("Четвертый игрок получает " + koloda[3]+koloda[7]+koloda[11]+koloda[15]+koloda[19]);
    }
}
package algotithm.Recursion;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;

public class IntArrow{
        public int[] intArrow = null;
        public int pointer ;

        public IntArrow(){
            pointer = (int) (Math.random()*20+13);
            intArrow = new int[pointer];
            for(int i=0;i<pointer;i++){
                intArrow[i]=(int) (Math.random()*2000);
            }
        }

    @Override
    public String toString() {
        return "IntArrow{" +
                "intArrow=" + Arrays.toString(intArrow) +
                ", pointer=" + pointer +
                '}';
    }

    public static void main(String[]arfs){
            IntArrow intArrow = new IntArrow();
            System.out.println(intArrow.toString());
        }
    }
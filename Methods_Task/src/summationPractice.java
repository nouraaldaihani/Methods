import java.util.ArrayList;
import java.util.List;

public class summationPractice {
    public static void main(String[] args) {
        ArrayList <Integer> value = new ArrayList<>();
        value.add(1);
        value.add(2);
        value.add(3);
        value.add(4);

        System.out.println(summat(value));
     
    }

    //public static int sumNum (ArrayList<Integer>numbers){
       // int sums = 0;
   // for (int i =0; i < numbers.size(); i++){

   //  sums+= numbers.get(i);
       
   // }
  //return sumNum;
    
    
   // }

   // @Override
   // public String toString(){
      //  return "SummationPractice[]";
   // }
     public static int summat(ArrayList<Integer> numbers){
int sums = 0;
for(int i=0;i<numbers.size();i++){
    sums+= numbers.get(i);
    
}
return sums;

     }
    }


        
    







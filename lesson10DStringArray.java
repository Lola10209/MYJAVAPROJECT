public class lesson10DStringArray {
   private String[] foods = {"Pepperonni", "Amala", "Spaghetti"};
   public lesson10DStringArray(){
    int size = foods.length;
    for(int i = 0; i<size; i++){   //or i<foods.length;
        System.out.println(foods[i]); 
    }
   }
   public static void main(String [] args){
    new lesson10DStringArray();
   }
}

import java.util.ArrayList;
import java.util.Iterator;

class Hello{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i < 7; i++){
            names.add("name : " + i);
        }
        Iterator<String> iterator = names.iterator();
        String element = iterator.next();
        System.out.println(element);

        System.out.println("while loop");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
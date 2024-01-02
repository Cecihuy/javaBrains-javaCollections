import java.util.HashSet;
import java.util.Set;

class Hello{
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Name A");
        names.add("Name B");

        /* print element. no order */
        System.out.println(names);

        /* added element with duplicate value 
        is not allowed(will be ignored) */
        names.add("Name A");
        System.out.println(names);

        /* remove element base on value */
        names.remove("Name A");
        System.out.println(names);

        /* check an element if already there */
        System.out.println(names.contains("Name B"));       
    }    
}
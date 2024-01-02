import java.util.ArrayList;
import java.util.List;

class Hello{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Name A");
        names.add("Name B");

        /* print element. it sorted base on insertion order */
        System.out.println(names);

        /* added one more element with duplicate value is allowed */
        names.add("Name A");
        System.out.println(names);
       
        /* to set value based on index. any data on that index will be replace */
        names.set(2, "Name C");
        System.out.println(names);

        /* get element based on index in argument */
        System.out.println(names.get(0));
        
        /* get with no element will throw exception */
        //System.out.println(names.get(200));

        /* insert value base on index, if any data on that index will be shifted to next index
         * also array size will be increased
        */
        names.add(1,"Name D");
        System.out.println(names);

        /* remove element base on index. all data next to it will be shifted to the left */
        names.remove(1);
        System.out.println(names);
        
        /* remove element base on value */
        names.remove("Name C");
        System.out.println(names);
    }    
}
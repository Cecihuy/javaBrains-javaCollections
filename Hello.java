import java.util.Arrays;

class Hello{
    public static void main(String[] args) {
        String[] names;
        names = new String[7];
        Arrays.fill(names, "name : ");
        
        for(int i = 0; i < names.length; i++){
            names[i] = names[i] + i;
            System.out.println(names[i]);
        }
        System.out.println(Arrays.binarySearch(names, "name : 4"));
    }
}
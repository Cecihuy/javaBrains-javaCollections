import java.util.ArrayList;

class Hello{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i < 7; i++){
            names.add("name : " + i);
        }
        for(int i = 0; i < 7; i++){
            System.out.println(names.get(i));
        }
        System.out.println(names.indexOf("name : 4"));
    }
}
import java.util.HashMap;
import java.util.Map;

class Hello{
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        Student student1 = new Student("foo", "bar", 2, "Science");
        Student student2 = new Student("bar", "baz", 1, "commerce");
        Student student3 = new Student("blah", "bar", 3, "arts");

        students.put(student1.getId(), student1);
        students.put(student2.getId(), student2);
        students.put(student3.getId(), student3);
        
        /* print element */
        System.out.println(students);

        /* print element base on key */
        System.out.println(students.get(1));

        /* iterating key */
        for(Integer key: students.keySet()){
            System.out.println(key);
        }

        /* iterating values */
        for(Student val: students.values()){
            System.out.println(val);
        }

        /* print both key and values */
        for(Map.Entry<Integer, Student> entry:students.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        /* try get values by key, if no exist then create one */
        System.out.println(students.getOrDefault(100, new Student("test", "test", 100, "test")));

        /* try put values by key, if no exist then put one */
        System.out.println(students.putIfAbsent(100, new Student("test", "test", 100, "test")));
        
        /* foreach */
        students.forEach((key,value) -> System.out.println(value));

        /* perform with lambda */
        System.out.println(students.computeIfAbsent(100, key -> new Student("test", "test", key, "test")));
    }
}
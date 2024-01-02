class Hello{
    public static void main(String[] args) {
        Student student1 = new Student("foo", "bar", 1, "science");
        Student student2 = new Student("foo", "bar", 1, "science");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
    }    
}
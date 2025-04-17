class Student {
    public String name;
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age < 0){
            System.out.println("Invalid age");
            this.age = 0;
        }
    }
}
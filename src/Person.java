public class Person extends Object{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if(age>0 && age<130)
           this.age = age;
        else
            throw new Exception ("nu-i slobod");
    }

    private String name;
    private int age;


}

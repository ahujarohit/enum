import java.util.Scanner;

enum Gender {
    MALE, FEMALE;

    public static Gender acceptGender() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if(str.trim().equalsIgnoreCase("male"))
            return MALE;
        else
            return FEMALE;
            
    }
}

class Person {
    protected String name;
    protected int age;
    protected Gender gender;

    public Person() {
        name = new String();
        gender = Gender.MALE;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void acceptData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = in.nextLine();
        System.out.print("Enter Age : ");
        age = in.nextInt();
        System.out.print("Enter Gender : ");
        gender = Gender.acceptGender();
    }

    public void showData() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }
}

class Example5 {
    public static void main(String args[]) {
        Person person = new Person();
        person.acceptData();
        person.showData();
    }
}


















package taskadditional.cattask5;

public class Cat {
    public String name;
    public int age;
    public int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
            }
        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    }
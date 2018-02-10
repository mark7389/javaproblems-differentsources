package pkg;

public class Person{

        private String name;
        private int age;
        private int height;
        private int weight;
        private String eyeColor;
        private String gender;
        public Person(String name, int age, int height, int weight, String eyeColor, String gender){
          this.name = name;
          this.age = age;
          this.height = height;
          this.weight = weight;
          this.eyeColor = eyeColor;
          this.gender = gender;
        }
        public String getName(){
          return this.name;
        }
        public void setName(String name){
          this.name = name;
        }
        public int getAge(){
          return this.age;
        }
        public void setAge(int age){
          this.age = age;
        }
        public int getHeight(){
          return this.height;
        }
        public void setHeight(int height){
          this.height = height;
        }
        public int getWeight(){
          return this.weight;
        }
        public void setWeight(int weight){
          this.weight = weight;
        }
        public String getEyeColor(){
          return this.eyeColor;
        }
        public void setEyeColor(String color){
          this.eyeColor = color;
        }
        public String getGender(){
          return this.gender;
        }
        public void setGender(String gender){
            this.gender = gender;
        }
}
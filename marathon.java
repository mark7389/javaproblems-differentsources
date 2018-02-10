
public class marathon{
    class Person{
        String name;
        int time;
        public Person(String n, int t){
            this.name = n;
            this.time = t;
        }
    }
    Person fastest = new Person("",0);
    Person secondFastest = new Person("", 0);
    Person [] table = {new Person("Elena",341),new Person("Thomas",273),
    new Person("Hamilton", 278), new Person("Suzie", 329),
    new Person("Phil", 445),new Person("Matt",402), new Person("Alex",388),
    new Person("Emma", 275), new Person("John",243),new Person("James", 334),
    new Person("Jane", 412), new Person("Emily", 393), new Person("Daniel", 299),
    new Person("Neda", 343), new Person("Aaron", 317), new Person("Kate",265)};
    public void setFastest(){
        this.fastest = this.table[0];
        for(int i = 0; i<this.table.length; i++){
                if(this.table[i].time < this.fastest.time){
                    this.fastest = this.table[i];
                }
        }

    }
    public void setSecondFastest() {
        if(this.fastest.name == ""){
            this.setFastest();
            this.secondFastest = this.table[0];
            for(int i = 0 ; i < this.table.length; i++){
                if(this.secondFastest.time < this.table[i].time && this.table[i].time > this.fastest.time){
                    this.secondFastest = this.table[i];
                }
            }
        }
        else{
            this.secondFastest = this.table[0];
            for(int i = 0 ; i < this.table.length; i++){
                if(this.table[i].time < this.secondFastest.time && this.table[i].time > this.fastest.time){
                    this.secondFastest = this.table[i];
                }
            }

        }

    }

    public static void main(String [] args){
        marathon m = new marathon();
        m.setFastest();
        m.setSecondFastest();
        System.out.println("Fastest runner: "+m.fastest.name+"\nTime: "+m.fastest.time);
        System.out.println("2nd Fastest runner: "+m.secondFastest.name+"\nTime: "+m.secondFastest.time);


    }
}




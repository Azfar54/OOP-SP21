package lab.pkg12;

public class Lab12_Runner {

    public static void main(String[] args) {
        //This is actually the runner of Person class
        Student[] study = new Student[5];
        
        study[0] = new Student("Daniyal", "121");
        study[1] = new Student("Bilal", "903");
        study[2] = new Student("Atlas", "418");
        study[0].associate();
        study[1].associate();
        study[2].associate();

        System.out.println("\n");

        Teacher[] teach = new Teacher[5];
        teach[0] = new Teacher("Arshad", "201");
        teach[1] = new Teacher("Moiz", "208");
        teach[2] = new Teacher("Zain", "211");
        teach[0].associate();
        teach[1].associate();
        teach[2].associate();

        System.out.println("\n");

        /**
         * This is a test runner only. Below this part you will find array and
         * arraylist runner.
         */
        /**
         * HumanResource hr = new HumanResource();
         * hr.addEntity(student[0]);
         * hr.addEntity(student[1]);
         * hr.addEntity(student[2]);
         * 
         * hr.addEntity(teacher[0]);
         * hr.addEntity(teacher[1]);
         * hr.addEntity(teacher[2]);
         * hr.print();
         * 
         * System.out.println("Before deletion");
         * System.out.println("\n");
         *
         * hr.delete("208");
         * hr.delete("211");
         *
         * System.out.println("After deletion");
         * hr.print();
         *
         */
        
        /**
         * ABOVE IS TEST RUNNER ONLY. 
         * REAL IMPLEMENTATION IS BELOW.
         */
        
        
        
        /**
          * The runner below is of array. Array implementation runner.
         */
        /**
         * HumanResource hr = new HumanResource();
         * hr.adden(student[0]);
         * hr.adden(student[1]);
         * hr.adden(student[2]);
         *
         * hr.adden(teacher[0]);
         * hr.adden(teacher[1]);
         * hr.adden(teacher[2]);
         * 
         * System.out.println(hr.toString());
         * System.out.println("Before deletion");
         * System.out.println("\n");
         * hr.delete(0);
         * hr.delete(1);
         *
         * System.out.println("After deletion");
         * System.out.println(hr.toString());
        *
         */
        
        
        
        /**
         * ArrayList runner implementation. Below is the runner of ArrayList.
         */
        HumanResource humresource = new HumanResource();
        humresource.addEn(study[0]);
        humresource.addEn(study[1]);
        humresource.addEn(study[2]);
        humresource.addEn(teach[0]);
        humresource.addEn(teach[1]);
        humresource.addEn(teach[2]);
        System.out.println(humresource.toString());
        System.out.println("Before deletion");
        System.out.println("\n");
        humresource.delete(1);
        humresource.delete(2);

        System.out.println("After deletion");
        System.out.println(humresource.toString());

    }
    
}
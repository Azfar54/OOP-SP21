package lab.pkg12;

public class Person {
        //protected String name;
    //protected int id;
    
    protected String ID;
    protected String name;

    public Person( String name, String ID) {
        this.name = name;
         this.ID = ID;
    }

    /**
    public Person(String name,String id){
       this.name=name;
       this.id=id;
        
    }
     * @return 
    **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return ID;
    }

    public void setId(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return String.format("Name = %s , ID = %s", getName(), getId());
    }

}

package lab.pkg12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HumanResource {
    /**
     * private int index = -1; 
     * private Person[] array;
     *
     * public void addEntity(Person person) {
     *
     * if (index == -1) {
     * array = new Person[1]; index++; } else { extend();
     * index++;
     * }
     *
     * array[index] = person;
     *
     * }
     *
     * public void extend() {
     * Person[] extendedArray = new Person[index + 2];
     * for (int i = 0; i <= index; i++) {
     * extendedArray[i] = array[i]; }
     * array =extendedArray;
     * }
     *
     * public void delete(String id){
     * Person[] extendedArray = new
     * Person[index]; int x = 0; for (int i = 0; i <= index; i++)
     * {
     * if(array[i].getId() == id)
     * { continue; } extendedArray[x] = array[i];
     * x++; }
     * index--; array = extendedArray; }
     *
     * public void print() { for (int i = 0; i <= index; i++) {
     * System.out.println(array[i].toString()); } }
     *
     */
    /**
     * This was merely a test run or implementation of the program.
     * The real implementation is as under.
     */
    
    
    
    
    
                    //*********IMPLENTATION IN THE PROGRAM STARTS FROM BELOW HERE.******\\    
    
    
    /**
     * This is an array implementation. Array implementation done and performed below.
     */
    /**
     * Association[] resources; public HumanResource() { // DEFAULT_CAPACITY
     * resources = new Association[10000]; }
     *
     * public void adden(Association resource) {
     *
     * if (resource == null) { throw new NullPointerException("Can't insert
     * null!"); }
     *
     * for (int i = 0; i < resources.length; ++i) { if (resources[i] == null) {
     * resources[i] = resource; return; } }
     *
     * // if no more space available int indexToAdd = resources.length;
     * extend(); resources[indexToAdd] = resource; }
     *
     * public boolean delete(int index) {
     *
     * boolean exists = false; int lastIndex = -1;
     *
     * for (int i = 0; i < resources.length && resources[i] != null; ++i) { if
     * (index == i) { exists = true; } lastIndex = i; }
     *
     * if (exists) { System.arraycopy(resources, index + 1, resources, index,
     * resources.length - index - 1); resources[lastIndex] = null; }
     *
     * return exists; }
     *
     * @Override public String toString() {
     *
     * StringBuilder res = new StringBuilder("HumanResource:\n");
     *
     * for (int i = 0; i < resources.length && resources[i] != null; ++i) {
     * res.append(resources[i]).append("\n"); }
     *
     * return res.toString(); }
     *
     * private void extend() { Association[] temp = resources;
     *
     * // Allocate new memory resources = new Association[resources.length * 2];
     *
     * // copy old data System.arraycopy(temp, 0, resources, 0,
     * resources.length);
     *
     * }
     *
     
     
    
     */
    
                               //*********START OF THE ARRAYLIST IS FROM HERE.******\\    
    
    
    
    /**
     * This is an ArrayList implementation. Below is the code for only ArrayList
     *
     */
    
    private int index_no = -1;
    private ArrayList<Association> resources = new ArrayList();
    
    //Note that this is the completed version of the program made at the spot in lab 12

    public int getIndex_no() {
        return index_no;
    }

    public void setIndex_no(int index_no) {
        this.index_no = index_no;
    }

    public ArrayList<Association> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Association> resources) {
        this.resources = resources;
    }

    
    public void addEn(Association... resources) {
        if (index_no == -1) {
            for (Association res : resources) {
                this.resources.add(res);
            }

            index_no++;
        } else {
            extend();
            index_no++;
        }

        this.resources.addAll(Arrays.asList(resources));

    }

    private void extend() {
        ArrayList<Association> extendedResources = new ArrayList();
        for (Association exRes : extendedResources) {
            this.resources.add(exRes);
        }
        Collections.copy(resources,
                extendedResources);
    }

    public boolean delete(int index) {
        ArrayList<Association> extendedResources = new ArrayList();
        boolean exists = false;
        int lastIndex = -1;

        for (int i = 0; i < resources.size() && resources.get(i) != null; ++i) {
            if (index == i) {
                exists = true;
                continue;
            }

            lastIndex = i;
        }

        if (exists) {
            Collections.copy(resources, extendedResources);
            resources.set(lastIndex, null);
        }

        return exists;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder("HumanResource:\n");

        for (int i = 0; i < resources.size() && resources.get(i) != null; ++i) {
            str.append(resources.get(i)).append("\n");
        }

        return str.toString();
    
}
}
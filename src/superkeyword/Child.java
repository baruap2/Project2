package superkeyword;

public class Child extends Father{

    //super keyword in constructor//looks for the class it's extending from, and uses same parameter
    public Child(){
        super(20);
    }

    //super keyword in method
    public void higherEducation(){
        super.educated();
    }

    //super keyword in variables
    public void athleticSkills(){
        int numberOfSports = super.numberOfSports;
        System.out.println("child is practicing "+numberOfSports+" sports");
    }
}

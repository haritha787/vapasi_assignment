package src.Encapsulation;

public class GetNames {
    public static void main(String[] args)
    {
            College College1=new College();
            College College2=new College();
            College College3=new College();
            College College4=new College();
            College College5=new College();
            //Set College name and Department Names of Corresponding College
            College1.setCollegeName("PSG");
            College1.setDepartmentNames(new String[]{"ECE", "MECH", "IT", "CS", "EEE", "AUTO", "EI"});
            College2.setCollegeName("SRS");
            College2.setDepartmentNames(new String[]{"ECE", "MECH", "IT", "CS"});
            College3.setCollegeName("THIAGARAJA");
            College3.setDepartmentNames(new String[]{"ECE", "MECH", "IT", "CS", "EEE"});
            College4.setCollegeName("VELAMMAL");
            College4.setDepartmentNames(new String[]{"ECE", "MECH","EEE", "AUTO", "EI"});
            College5.setCollegeName("KALASALINGAM");
            College5.setDepartmentNames(new String[]{"CS", "EEE", "AUTO", "EI"});
            //print College name and Department Names of Corresponding College
            System.out.println("College Name " + College1.getCollegeName()+" & Department Names " + College1.getDepartmentNames());
            System.out.println("College Name " + College2.getCollegeName()+" & Department Names " + College2.getDepartmentNames());
            System.out.println("College Name " + College3.getCollegeName()+" & Department Names " + College3.getDepartmentNames());
            System.out.println("College Name " + College4.getCollegeName()+" & Department Names " + College4.getDepartmentNames());
            System.out.println("College Name " + College5.getCollegeName()+" & Department Names " + College5.getDepartmentNames());


    }

}

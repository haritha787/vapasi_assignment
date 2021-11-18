package src.Encapsulation;

import java.util.ArrayList;

public class College {
    private String collegeName;
    private ArrayList<String> departmentNames = new ArrayList<>();

    public String  getCollegeName()
    {
        return this.collegeName;

    }
    public ArrayList<String> getDepartmentNames()
    {

         return this.departmentNames;

    }
    public void setCollegeName(String nameOfCollege)
    {
        this.collegeName=nameOfCollege;

    }
    public void setDepartmentNames(String[] depts)
    {
        for(int i=0; i<depts.length;i++)
        {
              this.departmentNames.add(depts[i]);

        }

    }

}

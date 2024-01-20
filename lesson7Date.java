public class lesson7Date {   //class name should be a noun
    // date.java file is in this constructor topic
    private int day;
    private int month;       
    private int year;
//the following a instance variable. one per instance variable

    public lesson7Date(int d, int m, int y){
        month = m;
        day = d;
        year = y;
    }

    public int getMonth(){       //getter is also called the assesor. //you must return if it's int, string but no return value for void 
        return month;
    }

    public void setMonth(int m){      //setter is called the mutator method. generally known as the setter. one per instance variable.
        if(m >= 1 && m<= 12){      //&& means 'and'  || means 'or'
            month = m;
        }
    }

    public String toString(){
        String result;  //return the string representing the object
        result = day + "/" + month + "/" + year;
        return result;
    }
}

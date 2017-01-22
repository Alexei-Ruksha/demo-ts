package ts.human;


import java.util.Date;

/**
 * Created by Алексей on 10.12.2016.
 */
public class WorkDay implements Event
{
    private String name;
    private Date date;
   public Date getDate() {return date;}
   public void setDate(Date date) {this.date = date;}
   public String getName() {return name;}
   public void setName(String name) {this.name = name;}
   public WorkDay(String name,Date date){this.name = name;}
   WorkDay workDay=new WorkDay("Субботник",new Date());

}


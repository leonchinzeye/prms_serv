/*"programSlotId": 1,
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.edu.nus.iss.phoenix.entity.schedule;

import java.io.Serializable;
import java.sql.Date;
/**
 *
 * @author Karen Athaide
 */
public class WeeklySchedule implements Cloneable, Serializable {
    
    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int weekId;
    private Date startDate;
    private String assignedBy;
    private int programSlotId;
    private String yearAS;
    
    /** 
     * Constructors. 
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */
    public WeeklySchedule() {
        
    }
    
    public WeeklySchedule(int weekId) {
        this.weekId = weekId;
    }
    
    public WeeklySchedule(int weekId, Date startDate, String assignedBy, int programSlotId, String yearAS) {
        this.weekId = weekId;
        this.startDate = startDate;
        this.assignedBy = assignedBy;
        this.programSlotId = programSlotId;
        this.yearAS = yearAS;
    }
    
    /**
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     * @return 
     */
    public int getWeekId() {
        return weekId;
    }
    
    public void setWeekId(int weekId) {
        this.weekId = weekId;
    }
    
    public Date getStartDate() {
        return startDate;
    }
      
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    } 
    
    public String getAssignedBy() {
        return assignedBy;
    }
    
    public void setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy;
    }
    
    public int getProgramSlotId() {
        return programSlotId;
    }
    
    public void setProgramSlotId(int programSlotId) {
        this.programSlotId = programSlotId;
    }
    
    public String getYearAS() {
        return yearAS;
    }
    
    public void setYear(String yearAS) {
        this.yearAS = yearAS;
    }
}

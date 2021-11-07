

public class CostOfAttendanceCalculator {
    
    private int costOfAttendance;
    private int scholarships;
    
    public CostOfAttendanceCalculator() {
        costOfAttendance = 0;
        scholarships = 0;
    }
    
    public CostOfAttendanceCalculator(int costOfAttendance, int scholarships) {
        this.costOfAttendance = costOfAttendance;
        this.scholarships = scholarships;
    }
    
    public int calculate() {
        return costOfAttendance - scholarships;
    }
    
}
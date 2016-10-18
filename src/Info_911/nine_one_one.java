package Info_911;

public class nine_one_one {
    private String Name[] = new String[100];
    private String Time[] = new String[100];
    private String Phone_Number[] = new String[100];
    private String Nature[] = new String[100];
    private boolean Accidental_Call[] = new boolean[100];
    private String Description[] = new String[100];             // List of up to 100 elements
    private String Responding_Units[] = new String[100];
    private String Status[] = new String[100];
    private boolean cell_Phone[] = new boolean[100];

    private int name_Count = 0;                                  // Array counters
    private int time_Count = 0;
    private int phone_Count = 0;
    private int nature_Count = 0;
    // private boolean accident_Count = false;
    private int accident_Count = 0;
    private int units_Count = 0;
    private int des_Count = 0;
    private int status_Count = 0;
    private int cell_Count = 0;

    public String[] getName() {                                   // Get name
        return Name;
    }

    public boolean[] getcell_Phone() {                            // Get if cell phone
        return cell_Phone;
    }

    public void setCell_Phone(boolean cell_Phone) {             // Set if cell phone
        this.cell_Phone[cell_Count] = cell_Phone;
    }

    public String[] getTime() {                                   // Get time
        return Time;
    }

    public String[] getPhone_Number() {                           // Get phone number
        return Phone_Number;
    }

    public String[] getNature() {                                 // Get nature
        return Nature;
    }

    public boolean[] getAccidental_Call() {                       // Get accidental call
        return Accidental_Call;
    }

    public String[] getDescription() {                          // Get description list
        return Description;
    }

    public int getDes_Count() {                                 // Returns description counter
        return des_Count;
    }

    public String[] getResponding_Units() {                     // Get responding units list
        return Responding_Units;
    }

    public int getUnits_Count() {                               // Returns responding units count
        return units_Count;
    }

    public String[] getStatus() {                                 // Get status
        return Status;
    }

    public void setName(String Name) {                          // Set name
        this.Name[name_Count] = Name;
        ++name_Count;
    }

    public void setTime (String Time) {                         // Set time
        this.Time[time_Count] = Time;
        ++time_Count;
    }

    public void setPhone_Number(String Phone_Number) {          // Set phone number
        this.Phone_Number[phone_Count] = Phone_Number;
        ++phone_Count;
    }

    public void setNature(String Nature) {                      // Set nature
        this.Nature[nature_Count] = Nature;
        ++nature_Count;
    }

    public void setAccidental_Call(boolean Accidental_Call) {   // Set accidental call
        this.Accidental_Call[accident_Count] = Accidental_Call;
        ++accident_Count;
    }

    public void addDescription(String Description) {            // Add single element to description list
        this.Description[des_Count] = Description;
        ++des_Count;
    }

    public void addResponding_Units(String Responding_Units) {  // Add single element to responding units list
        this.Responding_Units[units_Count] = Responding_Units;
        ++units_Count;
    }

    public void setStatus(String Status) {                      // Set status
        this.Status[status_Count] = Status;
        ++status_Count;
    }
}

/**
 * Created by aaronewing on 10/17/2016.
 */
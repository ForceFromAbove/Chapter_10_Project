package Info_911;

public class E911 extends nine_one_one {            // Handles land line 911 calls
    private String Address[] = new String[100];

    private int address_Count = 0;

    public String[] getAddress() {                    // Get address
        return Address;
    }

    public void setAddress(String Address) {        // Set address
        this.Address[address_Count] = Address;
        ++address_Count;
    }
}


/**
 * Created by aaronewing on 10/17/2016.
 */
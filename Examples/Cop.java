//=============================================================================
public class Cop {
//-----------------------------------------------------------------------------
    private String name;
    private Gun gun;
//-----------------------------------------------------------------------------
    public Cop() {

        name = null;
        gun = null;
    }
//-----------------------------------------------------------------------------
    public Cop(String name) {

        this();
        this.name = name;
    }
//-----------------------------------------------------------------------------
    public String toString() {

        String displayString;

        displayString = "Officer " + name;
        if (gun != null) {
            displayString += " has a " + gun;
        } else {
            displayString += " has no gun";
        }
        return(displayString);
    }
//-----------------------------------------------------------------------------
    public void setGun(Gun newGun) {

        gun = newGun;
    }
//-----------------------------------------------------------------------------
    public void fireGun() {

        gun.fire();
    }
//-----------------------------------------------------------------------------
    public void loadGun() {

        gun.load();
    }
//-----------------------------------------------------------------------------
}
//=============================================================================

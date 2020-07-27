import java.util.prefs.Preferences;
public class themeClass {
    Preferences pref=Preferences.userRoot().node(this.getClass().getName());
    public void setPref(int theme){
        pref.getInt("value",0);
        pref.putInt("value", theme);
    }
    public int getPref(){
        return pref.getInt("value", 0);
    }
}

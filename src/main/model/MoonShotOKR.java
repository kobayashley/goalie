package main.model;

import java.util.ArrayList;
import java.util.Calendar;

public class MoonShotOKR extends OKR {
    private ArrayList<KeyResult> keyresults;

    //EFFECTS: this with initialized null title, metric, endDate, and assigned team, marked incomplete, and setting
    //         startDate to be today.
    public MoonShotOKR() {
        objective = new Objective();
        objective.setTitle("");
        keyresults = new ArrayList<>();
        for(int i = 0; i< keyresults.size(); i++){
            keyresults.get(i).markIncomplete();
        }
        for(int i = 0; i< keyresults.size(); i++){
            keyresults.get(i).setMetric("");
        }
        startDate = Calendar.getInstance().getTime();
        endDate = null;
        todaysDate = Calendar.getInstance().getTime();
        assignedTo = "";
    }


    //REQUIRES: non-empty keyresults
    //EFFECTS: returns this keyresults
    public ArrayList<KeyResult> getMSKeyresults() {
        return keyresults;
    }

    //MODIFIES: this
    //EFFECTS: adds kr into this RegularOKR's list of krs if it does not already exist.
    public void insertKR(MoonShotKR kr) {
        if (!keyresults.contains(kr)) {
            this.keyresults.add(kr);
        } else {
            return;
        }
    }

    //MODIFIES: this
    //EFFECTS: removes this kr if it is found in this RegularOKR's list of krs.
    public void removeKR(MoonShotKR kr){
        this.keyresults.remove(kr);
    }

    //EFFECTS: returns true if this RegularOKR contains kr
    public boolean containsKR(MoonShotKR kr){
        return keyresults.contains(kr);
    }
}

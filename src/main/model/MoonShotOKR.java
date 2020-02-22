package main.model;

import java.util.ArrayList;
import java.util.Calendar;

public class MoonShotOKR extends OKR {
    private ArrayList<MoonShotKR> mskeyresults;

    //EFFECTS: this with initialized null title, metric, endDate, and assigned team, marked incomplete, and setting
    //         startDate to be today.
    public MoonShotOKR() {
        objective = new Objective();
        objective.setTitle("");
        mskeyresults = new ArrayList<>();
        for(int i=0; i<mskeyresults.size(); i++){
            mskeyresults.get(i).markIncomplete();
        }
        for(int i=0; i<mskeyresults.size(); i++){
            mskeyresults.get(i).setMetric("");
        }
        startDate = Calendar.getInstance().getTime();
        endDate = null;
        todaysDate = Calendar.getInstance().getTime();
        assignedTo = "";
    }


    //REQUIRES: non-empty mskeyresults
    //EFFECTS: returns this mskeyresults
    public ArrayList<MoonShotKR> getMSKeyresults() {
        return mskeyresults;
    }

    //MODIFIES: this
    //EFFECTS: adds kr into this RegularOKR's list of krs if it does not already exist.
    public void insertKR(MoonShotKR kr) {
        if (!mskeyresults.contains(kr)) {
            this.mskeyresults.add(kr);
        } else {
            return;
        }
    }

    //MODIFIES: this
    //EFFECTS: removes this kr if it is found in this RegularOKR's list of krs.
    public void removeKR(MoonShotKR kr){
        this.mskeyresults.remove(kr);
    }

    //EFFECTS: returns true if this RegularOKR contains kr
    public boolean containsKR(MoonShotKR kr){
        return mskeyresults.contains(kr);
    }
}

package main.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class RegularOKR extends OKR{
    private ArrayList<RegularKeyResult> keyresults;

    //EFFECTS: this with initialized null title, metric, endDate, and assigned team, marked incomplete, and setting
    //         startDate to be today.
    public RegularOKR() {
        objective = new Objective();
        objective.setTitle("");
        keyresults = new ArrayList<>();
        for(int i=0; i<keyresults.size(); i++){
            keyresults.get(i).markIncomplete();
        }
        for(int i=0; i<keyresults.size(); i++){
            keyresults.get(i).setMetric("");
        }
        startDate = Calendar.getInstance().getTime();
        endDate = null;
        todaysDate = Calendar.getInstance().getTime();
        assignedTo = "";
    }

    //REQUIRES: deadline and team are non-empty values.
    //EFFECTS: this updated with initialized deadline and assigned team. OVERLOADING.
    public RegularOKR(Date deadline, String team){
        startDate = Calendar.getInstance().getTime();
        todaysDate = Calendar.getInstance().getTime();
        endDate = deadline;
        keyresults = new ArrayList<>();
        for(int i=0; i<keyresults.size(); i++) {
            if (!getKeyresults().isEmpty()) {
                keyresults.get(i).markIncomplete();
            }
        }
        assignedTo = team;

    }


    //REQUIRES: non-empty keyresults
    //EFFECTS: returns this keyresults
    public ArrayList<RegularKeyResult> getKeyresults() {
        return keyresults;
    }

    //MODIFIES: this
    //EFFECTS: adds kr into this RegularOKR's list of krs if it does not already exist.
    public void insertKR(RegularKeyResult kr) {
        if (!keyresults.contains(kr)) {
            this.keyresults.add(kr);
        } else {
            return;
        }
    }

    //MODIFIES: this
    //EFFECTS: removes this kr if it is found in this RegularOKR's list of krs.
    public void removeKR(RegularKeyResult kr){
        this.keyresults.remove(kr);
    }

    //EFFECTS: returns true if this RegularOKR contains kr
    public boolean containsKR(RegularKeyResult kr){
        return keyresults.contains(kr);
        }
}

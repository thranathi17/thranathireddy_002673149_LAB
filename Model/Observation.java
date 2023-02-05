/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author thran
 */
public class Observation {
    
    int observationId;
    private double bloodPressure;
    private double Temperature;
    private Medicine medication;
    
    public Observation(){
        this.medication = new Medicine();
    
    
}

    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }
    
    public Medicine getMedication(){
    return medication;
    }
    public void setMedication(Medicine Medication){
            this.medication = Medication;
}
    @Override
    public String toString(){
        return String.valueOf(this.observationId);
    }
}

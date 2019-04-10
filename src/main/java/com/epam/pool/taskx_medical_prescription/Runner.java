package com.epam.pool.taskx_medical_prescription;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss,SSS DD.MM.YYYY");

        Prescription.Builder prescriptionBuilder = new Prescription.Builder()
                .setPatient("Mr Smith")
                .setDoctor("Dr. Johns")
                .setMedicine("Penicillin")
                .setDate(simpleDateFormat.format(new Date()))
                .setValidityDays(30);

        Prescription prescription = prescriptionBuilder.build();
        System.out.println(prescription);

        prescription = prescriptionBuilder.setDate(simpleDateFormat.format(new Date())).build();
        System.out.println(prescription);
    }
}

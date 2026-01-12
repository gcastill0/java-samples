import java.util.Scanner;

import javax.jws.soap.SOAPBinding.Use;

public class Recomendation {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = myScanner.nextLine();

        System.out.println("Welcome, " + name
                + "! This a program that helps you pick the perfect materials and median to create your artworks!");

        System.out.println("Are you going to use digital or traditional? \n1 - Digital\n2 - Traditional");
        int DorT = myScanner.nextInt();

        // Traditional art
        int typeOFworkTR = 0;
        int Skill_levelTR = 0;
        int UsedBeforeTR = 0;
        int WillNotUseTR = 0;
        int CostTR = 0;

        // Digital art
        int Storage = 0;
        int Quality = 0;
        int typeOFworkDG = 0;
        int UsedBeforeDG = 0;
        int Skill_levelDG = 0;
        int WillNotUseDG = 0;
        int CostDG = 0;

        // if (DorT == digital){

        // If they want to use Digital or Traditional materials (DIGITAL)
        if (DorT == 1) {
            System.out.println(
                    "What kind of artwork are you going to make? \n1 - Illustration \n2 - Animation \n3 - 3d Model ");
            typeOFworkDG = myScanner.nextInt();
        }

        // If they want to use Digital or Traditional materials (TRADITIONAL)
        if (DorT == 2) {
            System.out.println(
                    "What kind of artwork are you going to make? \n1 - Painting \n2 - Drawing \n3 - Sculpture ");
            typeOFworkTR = myScanner.nextInt();
        }

        // What kind of Materials/Softwares the user has used before (DIGITAL)
        if (typeOFworkDG == 1) {
            System.out.println(
                    "What kind of software have you used before? \n1 - Photoshop \n11 - Adobe Illustrator \n111 - Clip Studio Paint ");
            UsedBeforeDG = myScanner.nextInt();
        }

        if (typeOFworkDG == 2) {
            System.out.println(
                    "What kind of softwares have you used before? \n2 - Maya (3d) \n22 - Procreate Dreams (2d) \n222 - Ibis Paint X (2d) ");
            UsedBeforeDG = myScanner.nextInt();
        }

        if (typeOFworkDG == 3) {
            System.out.println("What kind of softwares have you used before? \n2 - Maya \n33 - Blender ");
            UsedBeforeDG = myScanner.nextInt();
        }

        // What kind of Materials/Softwares the user has used before (TRADITIONAL)
        if (typeOFworkTR == 1) {
            System.out.println(
                    "What kind of materials have you used before? \n1 - Acrylics \n11 - Water Colours \n111 - Guache ");
            UsedBeforeTR = myScanner.nextInt();
        }

        if (typeOFworkTR == 2) {
            System.out.println(
                    "What kind of materials have you used before? \n2 - Pencils \n22 - Coloured Pencils \n222 - Markers ");
            UsedBeforeTR = myScanner.nextInt();

        }

        if (typeOFworkTR == 3) {
            System.out.println("What kind of materials have you used before? \n3 - Clay \n33 - Cardboard + Paper): ");
            UsedBeforeTR = myScanner.nextInt();
        }

        // Their skill level on each of the differetnt Materials/Softwares (Digital)

        if (UsedBeforeDG == 1 || UsedBeforeDG == 11 || UsedBeforeDG == 111 || UsedBeforeDG == 2 || UsedBeforeDG == 22
                || UsedBeforeDG == 222 || UsedBeforeDG == 33) {
            System.out.println(
                    "How would you rate your skill level on a scale of 1 (low) - 10 (high) for the software that you chose? ");
            Skill_levelDG = myScanner.nextInt();

            System.out.println(
                    "How much storage do you have on your device? (in GBs) \n1 - 1 - 10 \n2 - 11 - 20 \n3 if more ");
            Storage = myScanner.nextInt();

            System.out.println(
                    "How much are you willing to spend if you need to buy a product? \n1 - 0 - 25 \n2 - 25 - 50 \n3 - 50 - 75 \n4 - 75 - 100 ");
            CostDG = myScanner.nextInt();

            System.out.println(
                    "Is there any particular software that was listed that you do not want to use? (if none, enter '0') \n1 - Photoshop \n11 - Adobe Illustrator \n111 - Clip Studio Paint \n2 - Maya \n22 - Procreate Dreams \n222 - Ibis Paint X \n33 - Blender ");
            WillNotUseDG = myScanner.nextInt();

        }

        // Their skill level on each of the differetnt Materials/Softwares (Traditional)

        if (UsedBeforeTR == 1 || UsedBeforeTR == 11 || UsedBeforeTR == 111 || UsedBeforeTR == 2 || UsedBeforeTR == 22
                || UsedBeforeTR == 222 || UsedBeforeTR == 3 || UsedBeforeTR == 33) {
            System.out.println(
                    "How would you rate your skill level on a scale of 1 (low) - 10 (high) for the material(s) that you chose? ");
            Skill_levelTR = myScanner.nextInt();

            System.out.println(
                    "How much are you willing to spend on materials if you need to buy a product? \n1 - 0 - 25 \n2 - 25 - 50 \n3 - 50 - 75 \n4 - 75 - 100 ");
            CostTR = myScanner.nextInt();

            System.out.println(
                    "Is there any particular material that was listed that you do not want to use? (if none, enter '0') \n1 - Acrylics \n11 - Water Colours \n111 - Guache \n2 - Pencils \n22 - Coloured Pencils \n222 - Markers \n3 - Clay \n33 - Cardboard + Paper ");
            WillNotUseTR = myScanner.nextInt();

        }

        // DIGITAL
        if (DorT == 1) {
            // ILLUSTRATION
            if (typeOFworkDG == 1) {
                // PHOTOSHOP
                if (UsedBeforeDG == 1) {
                    // LOW SKILLS
                    if (Skill_levelDG == 1 || Skill_levelDG == 2 || Skill_levelDG == 3) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){ 
                                }
                                if (WillNotUseDG == 33){  
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){  
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){ 
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){ 
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                } 
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                    
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }

                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelDG == 4 || Skill_levelDG == 5 || Skill_levelDG == 6) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // HIGH SKILLS
                    else {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){  
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                }
                // ADOBE ILLUSTRATOR
                if (UsedBeforeDG == 11) {
                    // LOW SKILLS
                    if (Skill_levelDG == 1 || Skill_levelDG == 2 || Skill_levelDG == 3) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelDG == 4 || Skill_levelDG == 5 || Skill_levelDG == 6) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){  
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // HIGH SKILLS
                    else {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                }
                // CLIP STUDIO PAINT
                if (UsedBeforeDG == 111) {
                    // LOW SKILLS
                    if (Skill_levelDG == 1 || Skill_levelDG == 2 || Skill_levelDG == 3) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){  
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){  
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelDG == 4 || Skill_levelDG == 5 || Skill_levelDG == 6) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                        }
                        // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                    }
                }

                    // HIGH SKILLS
                    else {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){   
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }         
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){   
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                    }
                }

            }
            // ANIMATION
            if (typeOFworkDG == 2) {
                // MAYA
                if (UsedBeforeDG == 2) {
                    // LOW SKILLS
                    if (Skill_levelDG == 1 || Skill_levelDG == 2 || Skill_levelDG == 3) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelDG == 4 || Skill_levelDG == 5 || Skill_levelDG == 6) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // HIGH SKILLS
                    else {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){  
                                if (WillNotUseDG == 0){
                                }
                                if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                }
                // PROCREATE DREAMS
                if (UsedBeforeDG == 22) {
                    // LOW SKILLS
                    if (Skill_levelDG == 1 || Skill_levelDG == 2 || Skill_levelDG == 3) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelDG == 4 || Skill_levelDG == 5 || Skill_levelDG == 6) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // HIGH SKILLS
                    else {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                }
                // IBIS PAINT X
                if (UsedBeforeDG == 222) {
                    // LOW SKILLS
                    if (Skill_levelDG == 1 || Skill_levelDG == 2 || Skill_levelDG == 3) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelDG == 4 || Skill_levelDG == 5 || Skill_levelDG == 6) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // HIGH SKILLS
                    else {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                }
            }
            // 3D MODEL
            if (typeOFworkDG == 3) {
                // MAYA
                if (UsedBeforeDG == 3) {
                    // LOW SKILLS
                    if (Skill_levelDG == 1 || Skill_levelDG == 2 || Skill_levelDG == 3) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelDG == 4 || Skill_levelDG == 5 || Skill_levelDG == 6) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // HIGH SKILLS
                    else {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                }
                // BLENDER
                if (UsedBeforeDG == 33) {
                    // LOW SKILLS
                    if (Skill_levelDG == 1 || Skill_levelDG == 2 || Skill_levelDG == 3) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelDG == 4 || Skill_levelDG == 5 || Skill_levelDG == 6) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                    // HIGH SKILLS
                    else {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // MEDIUM COST
                        else if (CostTR == 4 || CostTR == 5 || CostTR == 6) {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                        // HIGH COST
                        else {
                            // LOW STORAGE
                            if (Storage == 1){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // MEDIUM STORAGE
                            if (Storage == 2){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                            // HIGH STORAGE
                            if (Storage == 3){ 
                                if (WillNotUseDG == 0){
                                }
                                 if (WillNotUseDG == 1){
                                }
                                if (WillNotUseDG == 11){
                                }
                                if (WillNotUseDG == 111){
                                }
                                if (WillNotUseDG == 2){
                                }
                                if (WillNotUseDG == 22){
                                }
                                if (WillNotUseDG == 222){
                                }
                                if (WillNotUseDG == 3){
                                }
                                if (WillNotUseDG == 33){
                                }
                            }
                        }
                    }
                }
            }
        }

        // TRADITIONAL
        if (DorT == 2) {
            // PAINTING
            if (typeOFworkTR == 1) {
                // ACRYLICS
                if (UsedBeforeTR == 1) {
                    // LOW SKILLS
                    if (Skill_levelTR == 1 || Skill_levelTR == 2 || Skill_levelTR == 3) {
                        // LOW COST
                        if (CostTR == 1 || CostTR == 2 || CostTR == 3) {

                        }
                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelTR == 4 || Skill_levelTR == 5 || Skill_levelTR == 6) {

                    }
                    // HIGH SKILLS
                    else {

                    }
                }
                // WATER COLOURS
                if (UsedBeforeTR == 11) {
                    // LOW SKILLS
                    if (Skill_levelTR == 1 || Skill_levelTR == 2 || Skill_levelTR == 3) {

                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelTR == 4 || Skill_levelTR == 5 || Skill_levelTR == 6) {

                    }
                    // HIGH SKILLS
                    else {

                    }
                }
                // GUACHE
                if (UsedBeforeTR == 111) {
                    // LOW SKILLS
                    if (Skill_levelTR == 1 || Skill_levelTR == 2 || Skill_levelTR == 3) {

                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelTR == 4 || Skill_levelTR == 5 || Skill_levelTR == 6) {

                    }
                    // HIGH SKILLS
                    else {

                    }
                }

            }
            // DRAWING
            if (typeOFworkTR == 2) {
                // PENCILS
                if (UsedBeforeTR == 2) {
                    // LOW SKILLS
                    if (Skill_levelTR == 1 || Skill_levelTR == 2 || Skill_levelTR == 3) {

                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelTR == 4 || Skill_levelTR == 5 || Skill_levelTR == 6) {

                    }
                    // HIGH SKILLS
                    else {

                    }
                }
                // COLOURED PENCILS
                if (UsedBeforeTR == 22) {
                    // LOW SKILLS
                    if (Skill_levelTR == 1 || Skill_levelTR == 2 || Skill_levelTR == 3) {

                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelTR == 4 || Skill_levelTR == 5 || Skill_levelTR == 6) {

                    }
                    // HIGH SKILLS
                    else {

                    }
                }
                // MARKERS
                if (UsedBeforeTR == 222) {
                    // LOW SKILLS
                    if (Skill_levelTR == 1 || Skill_levelTR == 2 || Skill_levelTR == 3) {

                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelTR == 4 || Skill_levelTR == 5 || Skill_levelTR == 6) {

                    }
                    // HIGH SKILLS
                    else {

                    }
                }
            }
            // SCULPTURE
            if (typeOFworkTR == 3) {
                // CLAY
                if (UsedBeforeTR == 3) {
                    // LOW SKILLS
                    if (Skill_levelTR == 1 || Skill_levelTR == 2 || Skill_levelTR == 3) {

                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelTR == 4 || Skill_levelTR == 5 || Skill_levelTR == 6) {

                    }
                    // HIGH SKILLS
                    else {

                    }
                }
                // CARDBOARD + PAPER
                if (UsedBeforeTR == 33) {
                    // LOW SKILLS
                    if (Skill_levelTR == 1 || Skill_levelTR == 2 || Skill_levelTR == 3) {

                    }
                    // MEDIUM SKILLS
                    else if (Skill_levelTR == 4 || Skill_levelTR == 5 || Skill_levelTR == 6) {

                    }
                    // HIGH SKILLS
                    else {

                    }
                }
            }
        }

        myScanner.close();
    }
}
}
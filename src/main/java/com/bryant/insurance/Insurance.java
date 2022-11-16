package com.bryant.insurance;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Insurance {
    private ArrayList<String> claimsData() {
        String fileName = "C:\\Users\\erink\\claims.csv";
        ArrayList<String> data = new ArrayList<>();
        // variable to store all the claims from the file
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String claim = scanner.nextLine();
                data.add(claim);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void printCount(HashMap<String, ArrayList<String>> dataMap) {
        dataMap.forEach((k, v) -> {
            int count = v.size();
            System.out.println(k + "-" + count);
        });

    }

    public void printAll(HashMap<String, ArrayList<String>> dataMap) {
        dataMap.forEach((k, v) -> {
            System.out.println(k);
        });
    }

    public void printSorted(HashMap<String, ArrayList<String>> dataMap) {
        TreeSet dataSet = new TreeSet<>();
        dataMap.forEach((k, v) -> {
            dataSet.add(k);
            System.out.println(dataSet);
        });
    }

    public void calculate(HashMap<String, ArrayList<String>> dataMap) {
        dataMap.forEach((k, v) -> {
            double totalAmount = 0;
            for (String line : v) {
                String[] data = line.split(",");
                Double claimAmount = Double.valueOf(data[6]);
                totalAmount = claimAmount + totalAmount;
            }
            System.out.println(k + "-" + totalAmount);
        });
    }

    public void highest(HashMap<String, ArrayList<String>> dataMap) {
        dataMap.forEach((k, v) -> {
            double max = 0.0;
            double totalAmount = 0;
            ArrayList<Double> totals = new ArrayList<>();
            for (String line : v) {
                String[] data = line.split(",");
                Double claimAmount = Double.valueOf(data[6]);
                totalAmount = claimAmount + totalAmount;
                totals.add(totalAmount);
            }
            for (double total : totals) {
                if (total > max) {
                    max = total;
                }
            }
            System.out.println(k + "-" + max);
        });
    }

    public static void main(String[] args) {
        Insurance insurance = new Insurance();
        ArrayList<String> claimsData = insurance.claimsData();

        HashMap<String, ArrayList<String>> type = new HashMap<>();
        HashMap<String, ArrayList<String>> status = new HashMap<>();
        HashMap<String, ArrayList<String>> gender = new HashMap<>();
        HashMap<String, ArrayList<String>> month = new HashMap<>();


        for (String line : claimsData) {
            String[] data = line.split(",");
            String claimId = data[0];
            String claimMonth = data[1];
            String policyHolder = data[2];
            String age = data[3];
            String claimGender = data[4];
            String claimType = data[5];
            String claimAmount = data[6];
            String claimStatus = data[7];

            ArrayList<String> claimsByType = type.get(claimType);
            if (claimsByType == null) {
                claimsByType = new ArrayList<>();
            }
            claimsByType.add(line);

            ArrayList<String> claimsByStatus = status.get(claimStatus);
            if (claimsByStatus == null) {
                claimsByStatus = new ArrayList<>();
            }
            claimsByStatus.add(line);

            ArrayList<String> claimsByGender = gender.get(claimGender);
            if (claimsByGender == null) {
                claimsByGender = new ArrayList<>();
            }
            claimsByGender.add(line);

            ArrayList<String> claimsByMonth = month.get(claimMonth);
            if (claimsByMonth == null) {
                claimsByMonth = new ArrayList<>();
            }
            claimsByMonth.add(line);

            type.put(claimType, claimsByType);
            status.put(claimStatus, claimsByStatus);
            gender.put(claimGender, claimsByGender);
            month.put(claimMonth, claimsByMonth);
        }
        // counts
        System.out.println("Claims by type counts: ");
        insurance.printCount(type);
        System.out.println("Claims by status counts: ");
        insurance.printCount(status);
        System.out.println("Claims by gender counts: ");
        insurance.printCount(gender);
        System.out.println("Claims by month counts: ");
        insurance.printCount(month);

        //print all
        System.out.println("Claims by type: ");
        insurance.printAll(type);
        System.out.println("Claims by status: ");
        insurance.printAll(status);
        System.out.println("Claims by gender: ");
        insurance.printAll(gender);
        System.out.println("Claims by month: ");
        insurance.printAll(month);

        //print sorted
        System.out.println("Sorted claims by type: ");
        insurance.printSorted(type);
        System.out.println("Sorted claims by status: ");
        insurance.printSorted(status);
        System.out.println("Sorted claims by gender: ");
        insurance.printSorted(gender);
        System.out.println("Sorted claims by month: ");
        insurance.printSorted(month);

        //calculate
        System.out.println("Claims by type payouts: ");
        insurance.calculate(type);
        System.out.println("Claims by status payouts: ");
        insurance.calculate(status);
        System.out.println("Claims by gender payouts: ");
        insurance.calculate(gender);
        System.out.println("Claims by month payouts: ");
        insurance.calculate(month);

        //highest
        System.out.println("Claims by type highest payouts: ");
        insurance.highest(type);
        System.out.println("Claims by status highest payouts: ");
        insurance.highest(status);
        System.out.println("Claims by gender highest payouts: ");
        insurance.highest(gender);
        System.out.println("Claims by month highest  payouts: ");
        insurance.highest(month);
    }

}


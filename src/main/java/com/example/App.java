package com.example;

import com.example.service.DataInitService;
import com.example.service.PerformanceTestService;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-performance");

        try {
            DataInitService dataInitService = new DataInitService(emf);
            dataInitService.initData();

            PerformanceTestService performanceTestService = new PerformanceTestService(emf);

            System.out.println("\n\n=== 1er Test : PROBLÈME N+1 SANS OPTIMISATION ===");
            performanceTestService.testN1Problem();

            System.out.println("\n\n=== 2eme Test : RÉSOLUTION AVEC JOIN FETCH ===");
            performanceTestService.testJoinFetch();

            System.out.println("\n\n=== 2eme Test: RÉSOLUTION AVEC ENTITY GRAPHS ===");
            performanceTestService.testEntityGraph();

            System.out.println("\n\n=== 4eme Test: CACHE DE SECOND NIVEAU ===");
            performanceTestService.testSecondLevelCache();

            System.out.println("\n\n=== 5eme Test: COMPARAISON DES PERFORMANCES ===");
            performanceTestService.testPerformanceComparison();

        } finally {
            emf.close();
        }
    }
}
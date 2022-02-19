package com.example.demo.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.thymeleaf.util.ListUtils.size;

public class MentorScore {
    private final double SOCIAL_WEIGH = 0.1;
    private final double CARE_WEIGH = 0.15;
    private final double EXPERIENCE_WEIGH = 0.6;
    private final double VALUE_WEIGH = 0.15;
    private int social;
    private int careful;
    private List<Boolean> experience;
    private List<Boolean> careerValue;

    public MentorScore() {
        this.experience = new ArrayList<>();
        this.careerValue = new ArrayList<>();
    }

    private int calculateScore(int social, int careful, List<Boolean> careerValue, List<Boolean>experience) {
        int matchScore = 0;

        if (java.lang.Math.abs(this.social - social) == 0) {
            matchScore += 100*SOCIAL_WEIGH;
        } else if (java.lang.Math.abs(this.social - social) == 1) {
            matchScore += 66*SOCIAL_WEIGH;
        } else {
            matchScore += 33*SOCIAL_WEIGH;
        }

        if (java.lang.Math.abs(this.careful - careful) == 0) {
            matchScore += 100*CARE_WEIGH;
        } else if (java.lang.Math.abs(this.careful - careful) == 1) {
            matchScore += 66*CARE_WEIGH;
        } else {
            matchScore += 33*CARE_WEIGH;
        }

        int careerScore = 0;
        for (int i = 0; i < size(careerValue); i++) {
            if (this.careerValue.get(i).equals(careerValue.get(i))) {
                careerScore += 10;
            }
        }
        matchScore += careerScore*VALUE_WEIGH;

        int experienceScore = 0;
        for (int i = 0; i < size(experience); i++) {
            if (this.careerValue.get(i).equals(careerValue.get(i))) {
                experienceScore += 33;
            }
        }
        matchScore += experienceScore*EXPERIENCE_WEIGH;

        return matchScore;
    }

    private int getSocialScore(int choice) {
        if (choice < 2) {
            social = 3;
        } else if (choice > 4) {
            social = 1;
        } else {
            social = 2;
        }
        return social;
    }

    private int getCareScore(int choice) {
        if (choice < 2) {
            careful = 3;
        } else if (choice > 4) {
            careful = 1;
        } else {
            careful = 2;
        }
        return careful;
    }

    private void addExperienceManager(boolean manager) {
        experience.add(manager);
    }

    private void addExperienceProfessional(boolean professional) {
        experience.add(professional);
    }

    private void addExperienceTechnician(boolean tech) {
        experience.add(tech);
    }

    private void addExperienceSales(boolean sales) {
        experience.add(sales);
    }

    private void addExperienceOffice(boolean office) {
        experience.add(office);
    }

    private void addExperienceCraft(boolean craft) {
        experience.add(craft);
    }

    private void addExperienceOperative(boolean operative) {
        experience.add(operative);
    }

    private void addExperienceLabour(boolean labour) {
        experience.add(labour);
    }

    private void addExperienceService(boolean service) {
        experience.add(service);
    }

    private void addCareerAchieve(boolean achieve) {
        careerValue.add(achieve);
    }

    private void addCareerHelping(boolean helping) {
        careerValue.add(helping);
    }

    private void addCareerAlone(boolean alone) {
        careerValue.add(alone);
    }

    private void addCareerStability(boolean stability) {
        careerValue.add(stability);
    }

    private void addCareerLearning(boolean learning) {
        careerValue.add(learning);
    }

    private void addCareerSpare(boolean spare) {
        careerValue.add(spare);
    }

    private void addCareerInfluential(boolean influence) {
        careerValue.add(influence);
    }

    private void addCareerSelfRegulated(boolean self) {
        careerValue.add(self);
    }

    private void addCareerMoney(boolean money) {
        careerValue.add(money);
    }

    private void addCareerAdmire(boolean admire) {
        careerValue.add(admire);
    }

    public List<Boolean> getCareerValue() {
        return careerValue;
    }

    public List<Boolean> getExperience() {
        return experience;
    }

}

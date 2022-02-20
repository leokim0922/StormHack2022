package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import static org.thymeleaf.util.ListUtils.size;


public class MentorScore {
    private final double SOCIAL_WEIGH = 0.1;
    private final double CARE_WEIGH = 0.15;
    private final double EXPERIENCE_WEIGH = 0.6;
    private final double VALUE_WEIGH = 0.15;

    private int id;
    private int social;
    private int careful;
    private boolean experienceManager;
    private boolean experienceProfessional;
    private boolean experienceTechnician;
    private boolean experienceSales;
    private boolean experienceOffice;
    private boolean experienceCraft;
    private boolean experienceOperative;
    private boolean experienceLabour;
    private boolean experienceService;
    private boolean careerAchieve;
    private boolean careerHelping;
    private boolean careerAlone;
    private boolean careerStability;
    private boolean careerLearning;
    private boolean careerSpare;
    private boolean careerInfluential;
    private boolean careerSelfRegulated;
    private boolean careerMoney;
    private boolean careerAdmire;

//    private List<Boolean> experience;
//    private List<Boolean> careerValue;

    public MentorScore() {
//        this.experience = new ArrayList<>();
//        this.careerValue = new ArrayList<>();
    }

    private int calculateScore(int social, int careful) {
        int matchScore = 0;
        List<Boolean> experience = makeExperienceList();

        List<Boolean> careerValue = makeCareerValueList();


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
            if (careerValue.get(i).equals(careerValue.get(i))) {
                careerScore += 10;
            }
        }
        matchScore += careerScore*VALUE_WEIGH;

        int experienceScore = 0;
        for (int i = 0; i < size(experience); i++) {
            if (careerValue.get(i).equals(careerValue.get(i))) {
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

    public void setId(Integer id) {
        this.id = id;
    }

    private void setExperienceManager(boolean manager) {
        experienceManager = manager;
    }

    private void setExperienceProfessional(boolean professional) {
        experienceProfessional = professional;
    }

    private void setExperienceTechnician(boolean tech) {
        experienceTechnician = tech;
    }

    private void setExperienceSales(boolean sales) {
        experienceSales = sales;
    }

    private void setExperienceOffice(boolean office) {
        experienceOffice = office;
    }

    private void setExperienceCraft(boolean craft) {
        experienceCraft = craft;
    }

    private void setExperienceOperative(boolean operative) {
        experienceOperative = operative;
    }

    private void setExperienceLabour(boolean labour) {
        experienceLabour = labour;
    }

    private void setExperienceService(boolean service) {
        experienceService = service;
    }

    private void setCareerAchieve(boolean achieve) {
        careerAchieve = achieve;
    }

    private void setCareerHelping(boolean helping) {
        careerHelping = helping;
    }

    private void setCareerAlone(boolean alone) {
        careerAlone = alone;
    }

    private void setCareerStability(boolean stability) {
        careerStability = stability;
    }

    private void setCareerLearning(boolean learning) {
        careerLearning = learning;
    }

    private void setCareerSpare(boolean spare) {
        careerSpare = spare;
    }

    private void setCareerInfluential(boolean influence) {
        careerInfluential = influence;
    }

    private void setCareerSelfRegulated(boolean self) {
        careerSelfRegulated = self;
    }

    private void setCareerMoney(boolean money) {
        careerMoney = money;
    }

    private void setCareerAdmire(boolean admire) {
        careerAdmire = admire;
    }

    public List<Boolean> makeCareerValueList() {
        List<Boolean> careerValue = new ArrayList<>();

        careerValue.add(careerAchieve);
        careerValue.add(careerHelping);
        careerValue.add(careerAlone);
        careerValue.add(careerStability);
        careerValue.add(careerLearning);
        careerValue.add(careerSpare);
        careerValue.add(careerInfluential);
        careerValue.add(careerSelfRegulated);
        careerValue.add(careerMoney);
        careerValue.add(careerAdmire);
        return careerValue;
    }

    public List<Boolean> makeExperienceList() {
        List<Boolean> experience = new ArrayList<>();

        experience.add(experienceManager);
        experience.add(experienceProfessional);
        experience.add(experienceTechnician);
        experience.add(experienceSales);
        experience.add(experienceOffice);
        experience.add(experienceCraft);
        experience.add(experienceOperative);
        experience.add(experienceLabour);
        experience.add(experienceService);

        return experience;
    }

    public Integer getId() {
        return id;
    }

}

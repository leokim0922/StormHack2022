package com.example.demo.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mentorpush extends HttpServlet {

    private List<String> strings1 = new ArrayList<>(Arrays.asList("Officials and Managers", "Professionals", "Technicians", "Sales Workers",
            "Office and Clerical Workers", "Craft Workers", "Operatives", "Laborers", "Service Workers"));

    private List<Boolean> jobsBl = new ArrayList<>();

    private List<String> strings2 = new ArrayList<>(Arrays.asList("Setting a difficult goal", "Helping others", "Working alone", "Stability",
            "Learning and experiencing new stuff", "Having enough spare time", "Being influential", "Working in self-regulated state", "Making a lot of money", "Getting admiration"));

    private List<Boolean> careersBl = new ArrayList<>();

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<String> jobs = new ArrayList<>(Arrays.asList(request.getParameterValues("radio1")));
        String answer2 = request.getParameter("radio2");
        String answer3 = request.getParameter("radio3");
        List<String> careers = new ArrayList<>(Arrays.asList(request.getParameterValues("radio4")));

        for (String str : strings1) {
            if (jobs.contains(str)) {
                jobsBl.add(true);
            } else {
                jobsBl.add(false);
            }
        }
        for (String str : strings2) {
            if (careers.contains(str)) {
                careersBl.add(true);
            } else {
                careersBl.add(false);
            }
        }
    }




}

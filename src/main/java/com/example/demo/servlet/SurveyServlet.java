package com.example.demo.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOError;
import java.io.IOException;


@WebServlet("/fieldSurveyServlet")
public class SurveyServlet extends HttpServlet {

    public int answer1;
    public int answer2;
    public int answer3;
    public int answer4;

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        answer1 = Integer.parseInt(request.getParameter("problemSolving"));
        answer2 = Integer.parseInt(request.getParameter("radio3"));
        answer3 = Integer.parseInt(request.getParameter("radio4"));
        answer4 = Integer.parseInt(request.getParameter("radio5"));

    }

    public int getAnswer1() {return answer1;}

    public int getAnswer2() {return answer2;}

    public int getAnswer3() {return answer3;}

    public int getAnswer4() {return answer4;}

}

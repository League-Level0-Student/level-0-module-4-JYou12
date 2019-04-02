package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday = false, isVacation = false;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        int Vaca = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
//weekday true and false
        if (weekday == 0) {
        	isWeekday = true;
        	System.out.println("true");
        }else if(weekday == 1){
        	isWeekday = false;
        }
//Vacation true and false
        if (Vaca == 0) {
        	isVacation = true;
        	System.out.println("true");
        }else if(Vaca == 1){
        	isVacation = false;
        }
        
        if (isVacation == true && isWeekday == false) {
        	
        JOptionPane.showMessageDialog(null, "Sleep in?");
        	
        }else if (isVacation == true) {
        	
        JOptionPane.showMessageDialog(null, "Sleep in?");
        	
        }else if (isWeekday == true) {
        	
        	JOptionPane.showMessageDialog(null, "GET UP! Lazybones!");
        	
        }else if (isWeekday == false) {
        	
        	JOptionPane.showMessageDialog(null, "Sleep in?");
        	
        }
        
        }
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }


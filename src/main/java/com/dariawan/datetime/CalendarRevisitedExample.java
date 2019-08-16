/**
 * Code Examples in JDK 7 v1 (https://www.dariawan.com)
 * Copyright (C) 2019 Dariawan <hello@dariawan.com>
 *
 * Creative Commons Attribution-ShareAlike 4.0 International License
 *
 * Under this license, you are free to:
 * # Share - copy and redistribute the material in any medium or format
 * # Adapt - remix, transform, and build upon the material for any purpose,
 *   even commercially.
 *
 * The licensor cannot revoke these freedoms
 * as long as you follow the license terms.
 *
 * License terms:
 * # Attribution - You must give appropriate credit, provide a link to the
 *   license, and indicate if changes were made. You may do so in any
 *   reasonable manner, but not in any way that suggests the licensor
 *   endorses you or your use.
 * # ShareAlike - If you remix, transform, or build upon the material, you must
 *   distribute your contributions under the same license as the original.
 * # No additional restrictions - You may not apply legal terms or
 *   technological measures that legally restrict others from doing anything the
 *   license permits.
 *
 * Notices:
 * # You do not have to comply with the license for elements of the material in
 *   the public domain or where your use is permitted by an applicable exception
 *   or limitation.
 * # No warranties are given. The license may not give you all of
 *   the permissions necessary for your intended use. For example, other rights
 *   such as publicity, privacy, or moral rights may limit how you use
 *   the material.
 *
 * You may obtain a copy of the License at
 *   https://creativecommons.org/licenses/by-sa/4.0/
 *   https://creativecommons.org/licenses/by-sa/4.0/legalcode
 */
package com.dariawan.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarRevisitedExample {
    
    public static void main(String[] args) {       
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        // create a calendar and set
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 4, 1, 18, 20, 30);

        // Print Calendar's field
        System.out.println("Year            : " + cal.get(Calendar.YEAR));
        System.out.println("Month           : " + cal.get(Calendar.MONTH));
        System.out.println("Is May?         : " + (cal.get(Calendar.MONTH) == Calendar.MAY));
        System.out.println("Day of Month    : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week     : " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Is Sunday?      : " + (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY));
        System.out.println("Hour of the Day : " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute          : " + cal.get(Calendar.MINUTE));
        System.out.println("Second          : " + cal.get(Calendar.SECOND));
        System.out.println("AM PM           : " + cal.get(Calendar.AM_PM));
        System.out.println("Is AM?          : " + (cal.get(Calendar.AM_PM) == Calendar.AM));
        System.out.println("Is PM?          : " + (cal.get(Calendar.AM_PM) == Calendar.PM));
        System.out.println();
        
        // Displaying date using getTime() 
        System.out.println("Current Date     : " + sdf.format(cal.getTime()));
        
        // Manipulating dates
        Calendar clonedCal = (Calendar) cal.clone();
        clonedCal.add(Calendar.DAY_OF_YEAR, -100);
        System.out.println("100 days ago was : " + sdf.format(clonedCal.getTime()));
        
        cal.add(Calendar.MONTH, 6);
        System.out.println("6 months later is: " + sdf.format(cal.getTime()));
    }
}

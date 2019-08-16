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
import java.util.GregorianCalendar;

public class GregorianCalendarRevisitedExample {
    
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        // create a calendar and set
        GregorianCalendar cal = new GregorianCalendar(1997, 4, 7, 10, 40, 30);

        // Displaying date using getTime() 
        System.out.println("Date           : " + sdf.format(cal.getTime()));
        
        // Print Calendar's field
        System.out.println("Year           : " + cal.get(Calendar.YEAR));
        System.out.println("Month          : " + cal.get(Calendar.MONTH));
        System.out.println("Date           : " + cal.get(Calendar.DATE));
        System.out.println("Hour of the Day: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute         : " + cal.get(Calendar.MINUTE));
        System.out.println("Second         : " + cal.get(Calendar.SECOND));
        System.out.println();
        
        // Manipulating dates
        GregorianCalendar clonedCal = (GregorianCalendar) cal.clone();
        clonedCal.add(Calendar.DAY_OF_YEAR, 50);
        System.out.println("50 days later is: " + sdf.format(clonedCal.getTime()));
        
        cal.add(Calendar.MONTH, -18);
        System.out.println("18 months ago is: " + sdf.format(cal.getTime()));
        System.out.println();
        
        // increasing date, true indicates add 
        cal.roll(Calendar.DAY_OF_MONTH, true);
        // Displaying the result after operation 
        System.out.println("Roll Date: " + sdf.format(cal.getTime()));

        // Decrementing the date, false indicates subtraction 
        cal.roll(Calendar.DAY_OF_MONTH, false);
        System.out.println("Roll Date: " + sdf.format(cal.getTime()));
        
        // increasing month, roll +20 
        cal.roll(Calendar.MONTH, 20);
        System.out.println("Roll Date: " + sdf.format(cal.getTime()));
        
        // decreasing date, roll -30
        cal.roll(Calendar.DATE, -30);
        System.out.println("Roll Date: " + sdf.format(cal.getTime()));
        System.out.println();
        
        cal.setWeekDate(2018, 20, 5);
        System.out.println("Date: " + sdf.format(cal.getTime()));
    }
}

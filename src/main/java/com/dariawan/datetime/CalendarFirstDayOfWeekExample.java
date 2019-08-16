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

public class CalendarFirstDayOfWeekExample {
    
    public static void main(String[] args) {       
        SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy");
        
        // create a cal
        Calendar cal = Calendar.getInstance();
        cal.set(2019, 2, 3, 14, 20, 45);
        System.out.printf("Calendar Date/Time         : %s\n", sdf.format(cal.getTime()));
        System.out.println();
        
        System.out.printf("First Day of Week          : %s\n", cal.getFirstDayOfWeek());
        System.out.printf("First Day of Week == SUNDAY: %s\n", (cal.getFirstDayOfWeek() == Calendar.SUNDAY));
        System.out.printf("Minimal Days in First Week : %s\n", cal.getMinimalDaysInFirstWeek());
        System.out.printf("Week Of Year               : %s\n", cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println();
        
        cal.setWeekDate(2019, 25, 4);
        System.out.printf("Calendar Date/Time         : %s\n", sdf.format(cal.getTime()));
        System.out.println();
        
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.setMinimalDaysInFirstWeek​(7);
        System.out.printf("First Day of Week          : %s\n", cal.getFirstDayOfWeek());
        System.out.printf("First Day of Week == SUNDAY: %s\n", (cal.getFirstDayOfWeek() == Calendar.SUNDAY));
        System.out.printf("First Day of Week == MONDAY: %s\n", (cal.getFirstDayOfWeek() == Calendar.MONDAY));
        System.out.printf("Minimal Days in First Week : %s\n", cal.getMinimalDaysInFirstWeek());
        System.out.printf("Week Of Year               : %s\n", cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println();
        
        cal.setWeekDate(2019, 25, 4);
        System.out.printf("Calendar Date/Time         : %s\n", sdf.format(cal.getTime()));
    }
}
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
import java.util.Locale;
import java.util.TimeZone;

public class CalendarInitExample {
    
    static void printCalendar(Calendar calendar, String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy");
        TimeZone timeZone = calendar.getTimeZone();
        sdf.setTimeZone(timeZone);

        System.out.printf("***** %s *****\n", name);
        System.out.printf("Time zone        : %s\n", timeZone.getID());
        System.out.printf("default time zone: %s\n", TimeZone.getDefault().getID());
        System.out.printf("UTC              : %s\n", sdf.format(calendar.getTime()));
        System.out.printf("Default          : %s\n", calendar.getTime());
        System.out.printf("First Day of Week: %s\n", calendar.getFirstDayOfWeek());
        System.out.println();
    }
    
    public static void main(String[] args) {       
        
        // create a calendar
        Calendar cal1 = Calendar.getInstance();
        printCalendar(cal1, "Calendar1");

        // create a calendar with locale
        Locale locale1 = Locale.FRANCE;
        Calendar cal2 = Calendar.getInstance(locale1);
        printCalendar(cal2, "Calendar2");

        // create a calendar with timezone
        TimeZone tz1 = TimeZone.getTimeZone("Europe/Copenhagen");
        Calendar cal3 = Calendar.getInstance(tz1);
        printCalendar(cal3, "Calendar3");

        // create a calendar with timezone and locale
        TimeZone tz2 = TimeZone.getTimeZone("Japan");
        Locale locale2 = Locale.FRANCE;
        Calendar cal4 = Calendar.getInstance(tz2, locale2);
        printCalendar(cal4, "Calendar4");
    }
}

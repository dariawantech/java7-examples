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

public class CalendarTypeMaxMinExample {
    
    public static void main(String[] args) {       
        SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy");
        
        // create a cal
        Calendar cal = Calendar.getInstance();
        System.out.printf("Calendar Date/Time             : %s\n", sdf.format(cal.getTime()));
        System.out.printf("First Day of Week              : %s\n", cal.getFirstDayOfWeek());
        System.out.printf("First Day of Week == SUNDAY    : %s\n", (cal.getFirstDayOfWeek() == Calendar.SUNDAY));
        System.out.printf("Minimal Days in First Week     : %s\n", cal.getMinimalDaysInFirstWeek());
        System.out.printf("Weeks in Week Year             : %s\n", cal.getWeeksInWeekYear());
        System.out.printf("Week Year                      : %s\n", cal.getWeekYear());
        System.out.println();
        
        System.out.printf("Maximum of YEAR                : %s\n", cal.getMaximum(Calendar.YEAR));
        System.out.printf("Maximum of MONTH               : %s\n", cal.getMaximum(Calendar.MONTH));
        System.out.printf("Maximum of DATE                : %s\n", cal.getMaximum(Calendar.DATE));
        System.out.printf("Maximum of DAY_OF_YEAR         : %s\n", cal.getMaximum(Calendar.DAY_OF_YEAR));
        System.out.printf("Maximum of HOUR_OF_DAY         : %s\n", cal.getMaximum(Calendar.HOUR_OF_DAY));
        System.out.printf("Maximum of HOUR                : %s\n", cal.getMaximum(Calendar.HOUR));
        System.out.printf("Maximum of MINUTE              : %s\n", cal.getMaximum(Calendar.MINUTE));
        System.out.printf("Maximum of SECOND              : %s\n", cal.getMaximum(Calendar.SECOND));
        System.out.printf("Maximum of MILLISECOND         : %s\n", cal.getMaximum(Calendar.MILLISECOND));
        System.out.println();
        
        System.out.printf("Actual Maximum of YEAR         : %s\n", cal.getActualMaximum(Calendar.YEAR));
        System.out.printf("Actual Maximum of MONTH        : %s\n", cal.getActualMaximum(Calendar.MONTH));
        System.out.printf("Actual Maximum of DATE         : %s\n", cal.getActualMaximum(Calendar.DATE));
        System.out.printf("Actual Maximum of DAY_OF_YEAR  : %s\n", cal.getActualMaximum(Calendar.DAY_OF_YEAR));
        System.out.printf("Actual Maximum of HOUR_OF_DAY  : %s\n", cal.getActualMaximum(Calendar.HOUR_OF_DAY));
        System.out.printf("Actual Maximum of HOUR         : %s\n", cal.getActualMaximum(Calendar.HOUR));
        System.out.printf("Actual Maximum of MINUTE       : %s\n", cal.getActualMaximum(Calendar.MINUTE));
        System.out.printf("Actual Maximum of SECOND       : %s\n", cal.getActualMaximum(Calendar.SECOND));
        System.out.printf("Actual Maximum of MILLISECOND  : %s\n", cal.getActualMaximum(Calendar.MILLISECOND));
        System.out.println();
        
        System.out.printf("Least Maximum of YEAR          : %s\n", cal.getLeastMaximum(Calendar.YEAR));
        System.out.printf("Least Maximum of MONTH         : %s\n", cal.getLeastMaximum(Calendar.MONTH));
        System.out.printf("Least Maximum of DATE          : %s\n", cal.getLeastMaximum(Calendar.DATE));
        System.out.printf("Least Maximum of DAY_OF_YEAR   : %s\n", cal.getLeastMaximum(Calendar.DAY_OF_YEAR));
        System.out.printf("Least Maximum of HOUR_OF_DAY   : %s\n", cal.getLeastMaximum(Calendar.HOUR_OF_DAY));
        System.out.printf("Least Maximum of HOUR          : %s\n", cal.getLeastMaximum(Calendar.HOUR));
        System.out.printf("Least Maximum of MINUTE        : %s\n", cal.getLeastMaximum(Calendar.MINUTE));
        System.out.printf("Least Maximum of SECOND        : %s\n", cal.getLeastMaximum(Calendar.SECOND));
        System.out.printf("Least Maximum of MILLISECOND   : %s\n", cal.getLeastMaximum(Calendar.MILLISECOND));
        System.out.println();
        
        System.out.printf("Minimum of YEAR                : %s\n", cal.getMinimum(Calendar.YEAR));
        System.out.printf("Minimum of MONTH               : %s\n", cal.getMinimum(Calendar.MONTH));
        System.out.printf("Minimum of DATE                : %s\n", cal.getMinimum(Calendar.DATE));
        System.out.printf("Minimum of DAY_OF_YEAR         : %s\n", cal.getMinimum(Calendar.DAY_OF_YEAR));
        System.out.printf("Minimum of HOUR_OF_DAY         : %s\n", cal.getMinimum(Calendar.HOUR_OF_DAY));
        System.out.printf("Minimum of HOUR                : %s\n", cal.getMinimum(Calendar.HOUR));
        System.out.printf("Minimum of MINUTE              : %s\n", cal.getMinimum(Calendar.MINUTE));
        System.out.printf("Minimum of SECOND              : %s\n", cal.getMinimum(Calendar.SECOND));
        System.out.printf("Minimum of MILLISECOND         : %s\n", cal.getMinimum(Calendar.MILLISECOND));
        System.out.println();
        
        System.out.printf("Actual Minimum of YEAR         : %s\n", cal.getActualMinimum(Calendar.YEAR));
        System.out.printf("Actual Minimum of MONTH        : %s\n", cal.getActualMinimum(Calendar.MONTH));
        System.out.printf("Actual Minimum of DATE         : %s\n", cal.getActualMinimum(Calendar.DATE));
        System.out.printf("Actual Minimum of DAY_OF_YEAR  : %s\n", cal.getActualMinimum(Calendar.DAY_OF_YEAR));
        System.out.printf("Actual Minimum of HOUR_OF_DAY  : %s\n", cal.getActualMinimum(Calendar.HOUR_OF_DAY));
        System.out.printf("Actual Minimum of HOUR         : %s\n", cal.getActualMinimum(Calendar.HOUR));
        System.out.printf("Actual Minimum of MINUTE       : %s\n", cal.getActualMinimum(Calendar.MINUTE));
        System.out.printf("Actual Minimum of SECOND       : %s\n", cal.getActualMinimum(Calendar.SECOND));
        System.out.printf("Actual Minimum of MILLISECOND  : %s\n", cal.getActualMinimum(Calendar.MILLISECOND));
        System.out.println();
        
        System.out.printf("Greatest Minimum of YEAR       : %s\n", cal.getGreatestMinimum(Calendar.YEAR));
        System.out.printf("Greatest Minimum of MONTH      : %s\n", cal.getGreatestMinimum(Calendar.MONTH));
        System.out.printf("Greatest Minimum of DATE       : %s\n", cal.getGreatestMinimum(Calendar.DATE));
        System.out.printf("Greatest Minimum of DAY_OF_YEAR: %s\n", cal.getGreatestMinimum(Calendar.DAY_OF_YEAR));
        System.out.printf("Greatest Minimum of HOUR_OF_DAY: %s\n", cal.getGreatestMinimum(Calendar.HOUR_OF_DAY));
        System.out.printf("Greatest Minimum of HOUR       : %s\n", cal.getGreatestMinimum(Calendar.HOUR));
        System.out.printf("Greatest Minimum of MINUTE     : %s\n", cal.getGreatestMinimum(Calendar.MINUTE));
        System.out.printf("Greatest Minimum of SECOND     : %s\n", cal.getGreatestMinimum(Calendar.SECOND));
        System.out.printf("Greatest Minimum of MILLISECOND: %s\n", cal.getGreatestMinimum(Calendar.MILLISECOND));
        System.out.println();
    }
}
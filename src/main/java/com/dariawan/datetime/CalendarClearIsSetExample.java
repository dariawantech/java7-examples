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

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClearIsSetExample {
    
    static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss.SSS a");
        
    static void checkSet(Calendar cal) {
        System.out.println("calendar time   : " + sdf.format(cal.getTime()));   
        System.out.println("YEAR set?       : " + cal.isSet(Calendar.YEAR));
        System.out.println("MONTH set?      : " + cal.isSet(Calendar.MONTH));
        System.out.println("DATE set?       : " + cal.isSet(Calendar.DATE));
        System.out.println("HOUR_OF_DAY set?: " + cal.isSet(Calendar.HOUR_OF_DAY));
        System.out.println("HOUR set?       : " + cal.isSet(Calendar.HOUR));
        System.out.println("MINUTE set?     : " + cal.isSet(Calendar.MINUTE));
        System.out.println("SECOND set?     : " + cal.isSet(Calendar.SECOND));
        System.out.println("MILLISECOND set?: " + cal.isSet(Calendar.MILLISECOND));
        System.out.println("AM_PM set?      : " + cal.isSet(Calendar.AM_PM));
        System.out.println();
    }
    
    public static void main(String[] args) {
        String strDate = "09-11-2015 03:30:45.100 PM";
        
        Calendar cal = Calendar.getInstance();
        try {
            Date date1 = sdf.parse(strDate);
            cal.setTime(date1);                                 
        } catch (ParseException ex) {
            System.out.println("ParseException occured: " + ex.getMessage());
        }
     
        checkSet(cal);
        
        cal.clear(Calendar.YEAR);
        cal.clear(Calendar.DATE);
        cal.clear(Calendar.HOUR_OF_DAY);
        cal.clear(Calendar.HOUR);
        cal.clear(Calendar.MILLISECOND);
        cal.clear(Calendar.AM_PM);
        checkSet(cal);
        
        cal.clear();
        checkSet(cal);
    }
}

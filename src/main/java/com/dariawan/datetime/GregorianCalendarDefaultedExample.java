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

import java.util.Calendar;
import java.util.Locale;

public class GregorianCalendarDefaultedExample {
    
    public static void main(String[] args) {               
        Locale locale1 = Locale.getDefault();
        Calendar cal1 = Calendar.getInstance();
        System.out.println("Locale  : " + locale1);
        System.out.println("Calendar: " + cal1.getClass().getName());
        System.out.println("Year    : " + cal1.get(Calendar.YEAR));
        System.out.println("Month   : " + cal1.get(Calendar.MONTH));
        System.out.println("Date    : " + cal1.get(Calendar.DATE));
        System.out.println();
        
        Locale locale2 = new Locale("ja", "JP", "JP");
        Calendar cal2 = Calendar.getInstance(locale2);
        System.out.println("Locale  : " + locale2);
        System.out.println("Calendar: " + cal2.getClass().getName());
        System.out.println("Year    : " + cal2.get(Calendar.YEAR));
        System.out.println("Month   : " + cal2.get(Calendar.MONTH));
        System.out.println("Date    : " + cal2.get(Calendar.DATE));
        System.out.println();
        
        Locale locale3 = new Locale("th", "TH");
        Calendar cal3 = Calendar.getInstance(locale3);
        System.out.println("Locale  : " + locale3);
        System.out.println("Calendar: " + cal3.getClass().getName());
        System.out.println("Year    : " + cal3.get(Calendar.YEAR));
        System.out.println("Month   : " + cal3.get(Calendar.MONTH));
        System.out.println("Date    : " + cal3.get(Calendar.DATE));
    }
}

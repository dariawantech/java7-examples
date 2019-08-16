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

public class UtilDateCloneEqualsExample {
    
    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	String strDate1 = "09/04/1980 03:25:00 PM";
        String strDate2 = "1980-04-09T15:25:00";
        String strDate3 = "1980-04-09T03:25:00 PM";
        try {
            Date date1 = sdf1.parse(strDate1);
            System.out.println("date1: " + date1);
            
            Date date2 = (Date) date1.clone();
            System.out.println("date2: " + date2);

            Date date3 = sdf2.parse(strDate2);
            System.out.println("date3: " + date3);
            
            // wrong parsing because date string not match with date/time format
            Date date4 = sdf2.parse(strDate3);
            System.out.println("date4: " + date4);
            
            // false - different reference
            System.out.println("date1 == date2: " + (date1 == date2));
            // true
            System.out.println("date1 equals date2: " + date1.equals(date2));
            System.out.println("date1 equals date3: " + date1.equals(date3));
            System.out.println("date1 equals date4: " + date1.equals(date4));
        } catch (ParseException ex) {
            System.out.println("ParseException occured: " + ex.getMessage());
        }
    }
}

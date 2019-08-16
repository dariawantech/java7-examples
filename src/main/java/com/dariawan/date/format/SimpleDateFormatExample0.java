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
package com.dariawan.date.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample0 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(new SimpleDateFormat("dd/MM/yy").format(date));
        System.out.println(new SimpleDateFormat("dd MMM yyyy").format(date));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
        System.out.println(new SimpleDateFormat("dd-MM-yyyy h:mm a").format(date));
        System.out.println(new SimpleDateFormat("dd-MM-yyyy hh:mm a, zzzz").format(date));
        System.out.println(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ").format(date));
        System.out.println(new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss.SSSZ").format(date));
        System.out.println(new SimpleDateFormat("yyMMddHHmmssSSS").format(date));
        
        System.out.println("\n--- new SimpleDateFormat() ---");
        String strDate = "25 Jun 2019 01:11:28";
        try {            
            date = new SimpleDateFormat("dd MMM yyyy hh:mm:ss").parse(strDate);
        } catch (ParseException e) {
            System.out.println("ParseException occured: " + e.getMessage());
        }
        
        String pattern = "dd MMM yyyy";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);

        System.out.println(sdf1.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat();
        System.out.println(sdf2.format(date));
        System.out.println(sdf2.toPattern());

        strDate = "9 Apr 1980";
        try {            
            date = new SimpleDateFormat("d MMM yyyy").parse(strDate);
            System.out.println(date);  
        } catch (ParseException e) {
            System.out.println("ParseException occured: " + e.getMessage());
        }
    }
}

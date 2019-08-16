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
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public class CalendarGetDisplayNamesExample {
    
     static void printMap(Map map) {
        StringBuilder sb = new StringBuilder();
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Entry entry = (Entry) iter.next();
            sb.append(entry.getKey());
            sb.append('=').append('"');
            sb.append(entry.getValue());
            sb.append('"');
            if (iter.hasNext()) {
                sb.append(',').append(' ');
            }
        }
        System.out.println(sb.toString());
        System.out.println();
    }
     
    static void printDisplayNames(Calendar cal, Locale locale) {
         SimpleDateFormat sdf = new SimpleDateFormat("EE, dd MMM yyyy HH:mm:ss zzz");
        Map<String, Integer> map;
        
        // call the getDisplayNames method
        map = cal.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.SHORT, locale);
        System.out.println("DAY_OF_WEEK - SHORT - " + locale.getDisplayName());
        printMap(map);

        map = cal.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
        System.out.println("DAY_OF_WEEK - LONG - " + locale.getDisplayName());
        printMap(map);

        map = cal.getDisplayNames(Calendar.MONTH, Calendar.SHORT, locale);
        System.out.println("MONTH - SHORT - " + locale.getDisplayName());
        printMap(map);

        map = cal.getDisplayNames(Calendar.MONTH, Calendar.LONG, locale);
        System.out.println("MONTH - LONG - " + locale.getDisplayName());
        printMap(map);
        
        System.out.printf("Calendar's Date/Time   : %s\n", sdf.format(cal.getTime()));
        System.out.printf("Calendar's DAY_OF_WEEK : %s\n", cal.getDisplayName​(Calendar.DAY_OF_WEEK, Calendar.SHORT, locale));
        System.out.printf("Calendar's DAY_OF_WEEK : %s\n", cal.getDisplayName​(Calendar.DAY_OF_WEEK, Calendar.LONG, locale));
        System.out.printf("Calendar's MONTH       : %s\n", cal.getDisplayName​(Calendar.MONTH, Calendar.SHORT, locale));
        System.out.printf("Calendar's MONTH       : %s\n", cal.getDisplayName​(Calendar.MONTH, Calendar.LONG, locale));
    }
    
    public static void main(String[] args) {       
        // create a cal
        Calendar cal1 = Calendar.getInstance();        
        Locale locale1 = Locale.getDefault();
        cal1.set(1997, 4, 7, 20, 30, 40);
        printDisplayNames(cal1, locale1);        

        // change locale
        Locale locale2 = Locale.FRANCE;
        Calendar cal2 = Calendar.getInstance(locale2);
        cal2.set(1997, 4, 7, 20, 30, 40);
        printDisplayNames(cal2, locale2);        
    }
}
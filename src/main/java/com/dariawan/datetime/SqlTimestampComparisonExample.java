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

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class SqlTimestampComparisonExample {
    
    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        Timestamp sqlTimestamp1 = new Timestamp(now);
        System.out.println("sqlTimestamp1            : " + sqlTimestamp1);

        Timestamp sqlTimestamp2 = new Timestamp(324126010345L);
        System.out.println("sqlTimestamp2            : " + sqlTimestamp2);
        System.out.println("sqlTimestamp2 nanoseconds: " + sqlTimestamp2.getNanos());
        System.out.println();
        
        System.out.println("sqlTimestamp1 after sqlTimestamp2    : " + sqlTimestamp1.after(sqlTimestamp2));
        System.out.println("sqlTimestamp2 after sqlTimestamp1    : " + sqlTimestamp2.after(sqlTimestamp1));

        System.out.println("sqlTimestamp1 before sqlTimestamp2   : " + sqlTimestamp1.before(sqlTimestamp2));
        System.out.println("sqlTimestamp2 before sqlTimestamp1   : " + sqlTimestamp2.before(sqlTimestamp1));
        
        System.out.println("sqlTimestamp1 compareTo sqlTimestamp2: " + sqlTimestamp1.compareTo(sqlTimestamp2));
        System.out.println("sqlTimestamp2 compareTo sqlTimestamp1: " + sqlTimestamp2.compareTo(sqlTimestamp1));
        System.out.println();
        
        Calendar cal = Calendar.getInstance();
        cal.set(1980, 3, 9, 18, 30, 10);
        cal.set(Calendar.MILLISECOND, 345);
        Date date1 = cal.getTime();
        System.out.println("Date1                        : " + date1);
        System.out.println("sqlTimestamp2 compareTo date1: " + sqlTimestamp2.compareTo(date1)); 
        System.out.println();
        
        Date date = new Date(now);  // similar with sqlTimestamp1 from currentTimeMillis
        System.out.println("Date2                             : " + date);
        System.out.println("sqlTimestamp1 equals object       : " + sqlTimestamp1.equals(date));  
        
        Object obj = sqlTimestamp2.clone();
        System.out.println("Object                            : " + obj);
        System.out.println("sqlTimestamp2 equals object       : " + sqlTimestamp2.equals(obj));        
        
        Timestamp sqlTimestamp3 = new Timestamp(((Timestamp) obj).getTime());
        System.out.println("sqlTimestamp2 equals sqlTimestamp3: " + sqlTimestamp2.equals(sqlTimestamp3)); 
    }
}

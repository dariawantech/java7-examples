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

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimePrior8Example {

    public static void main(String[] args) throws ParseException {
        long now = System.currentTimeMillis();

        Date date = new Date(now);
        System.out.println("java.util.Date: " + date);

        java.sql.Date sqlDate = new java.sql.Date(now);
        System.out.println("java.sql.Date: " + sqlDate);

        Time sqlTime = new Time(now);
        System.out.println("java.sql.Time: " + sqlTime);

        Timestamp ts = new Timestamp(now);
        System.out.println("java.sql.Timestamp: " + ts);

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(now);
        System.out.println("java.util.Calendar: " + cal.getTime());
        
        GregorianCalendar gCal = new GregorianCalendar();
        gCal.setTimeInMillis(now);
        System.out.println("java.util.GregorianCalendar: " + gCal.getTime());
        
        String strDate = "2019-07-03 08:15:35";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date dt = sdf.parse(strDate);
        System.out.println("Date in SGT: " + dt);
        
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        dt = sdf.parse(strDate);
        System.out.println("Date in UTC: " + dt);        
    }
}

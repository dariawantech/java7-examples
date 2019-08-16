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

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeJodaTimeExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("org.joda.time.LocalDate: " + localDate);
        
        LocalTime localTime = LocalTime.now();
        System.out.println("org.joda.time.LocalTime: " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("org.joda.time.LocalDateTime: " + localDateTime);
        
        Instant instant = new Instant();
        System.out.println("org.joda.time.Instant: " + instant);
        
        DateTime dateTime = instant.toDateTime();
        System.out.println("org.joda.time.DateTime: " + dateTime);
        
        long now = System.currentTimeMillis();
        long plus24Hours = now + 24*24*60*1000;  // in miliseconds
        Duration duration = new Duration(now, plus24Hours);
        System.out.println("org.joda.time.Duration: " + duration);
        Instant instantPlus24Hours = instant.plus(duration);
        System.out.println("Instant plus Duration: " + instantPlus24Hours);
        
        Period period = new Period().withMonths(1);
        System.out.println("org.joda.time.Period: " + period);
        DateTime datePeriod = dateTime.plus(period);
        System.out.println("Date plus Period: " + datePeriod);
        
        Interval interval = new Interval(instant, instantPlus24Hours);
        System.out.println("org.joda.time.Interval: " + interval);
        
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss:SSSZZ ZZZ");
        
        DateTime dt1 = new DateTime();
        System.out.println(fmt.print(dt1));

        DateTimeZone dtz2 = DateTimeZone.forID("UTC");
        DateTime dt2 = dt1.withZone(dtz2);
        System.out.println(fmt.print(dt2));

        DateTimeZone dtz3 = DateTimeZone.forID("America/New_York");
        DateTime dt3 = dt1.withZone(dtz3);
        System.out.println(fmt.print(dt3));
    }
}

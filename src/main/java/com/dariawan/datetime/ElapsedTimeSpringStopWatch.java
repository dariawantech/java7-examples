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

import java.util.concurrent.TimeUnit;
import org.springframework.util.StopWatch;

public class ElapsedTimeSpringStopWatch {

     static void doSomething() {
         try {
             // Sleep 2 seconds
             TimeUnit.SECONDS.sleep(2);
         } catch (InterruptedException ex) {
             System.out.println("InterruptedException occured: " + ex.getMessage());
         }
    }

    public static void main(String[] args) {
        StopWatch sWatch = new StopWatch("Spring StopWatch Test");
        
        sWatch.start("Task #1");
        doSomething();        
        sWatch.stop();

        sWatch.start("Task #2");
        doSomething();        
        sWatch.stop();

        // getTotalTimeMillis(): Return the total time in milliseconds for all tasks.
        System.out.println("Elapsed time in milliseconds: " + sWatch.getTotalTimeMillis());
        
        // prettyPrint(): Return a string with a table describing all tasks performed.
        System.out.println("Pretty Print: " + sWatch.prettyPrint());

        // shortSummary(): Return a short description of the total running time.
        System.out.println("Short Summary: " + sWatch.shortSummary());

        // getTaskCount(): Return the number of tasks timed.
        System.out.println("Total Task Count: " + sWatch.getTaskCount());

        // getLastTaskName(): Return the name of the last task.
        System.out.println("Last Task Name: " + sWatch.getLastTaskName());
    }
}

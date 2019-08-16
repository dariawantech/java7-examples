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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SqlDateTimeInsertExample {
 
    public static void main(String[] args) throws Exception {
        // (1) connect to mysql database
        String url = "jdbc:mysql://localhost/coffeehouse";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(url, "barista", "cappuccino")) {
            // (2) set java.sql.Date, Time, and Timestamp with current Date (and time)
            java.util.Date utilDate = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            java.sql.Time sqlTime = new java.sql.Time(utilDate.getTime());
            java.sql.Timestamp sqlTS = new java.sql.Timestamp(utilDate.getTime());
            // (3) insert java.sql.Date, Time and Timestamp (including objects) to DB
            String sql = "INSERT INTO test_datetime("
                    + "dtm_date, dtm_time, dtm_timestamp,"
                    + "obj_date, obj_time, obj_timestamp) VALUES (?,?,?,?,?,?)";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setDate(1, sqlDate);
                pst.setTime(2, sqlTime);
                pst.setTimestamp(3, sqlTS);
                
                pst.setObject(4, utilDate);
                pst.setObject(5, utilDate);
                pst.setObject(6, utilDate);
                
                // (4) execute update
                pst.executeUpdate();
            }
        }
    }
}

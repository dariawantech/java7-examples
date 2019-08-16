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
package com.dariawan.string.methods;

import java.util.Locale;

public class StringFormat {

    public static void main(String[] args) {
        String str = "OutOfMemory";

        // %s %d and %n is used to append the string
        System.out.print(String.format("\"%s\" length: %d%n", str, str.length()));

        // pi, the ratio of the circumference of a circle to its diameter
        // using locale as Locale.US
        System.out.println(String.format(Locale.US, "pi = %+10.9f", Math.PI));
        // using locale as Locale.US
        System.out.println(String.format(Locale.FRANCE, "pi = %+10.9f", Math.PI));

        // The '(' numeric flag may be used to format negative numbers with
        // parentheses rather than a minus sign.  Group separators are
        // automatically inserted.
        System.out.print(String.format("Balance: $ %(,.2f%n", 42304.6f));
        System.out.print(String.format("Balance: $ %(,.2f%n", -134.257f));
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

public final class JavaVersion {
    private static final int majorJavaVersion = JavaVersion.determineMajorJavaVersion();

    private JavaVersion() {
    }

    private static int determineMajorJavaVersion() {
        return JavaVersion.getMajorJavaVersion(System.getProperty("java.version"));
    }

    private static int extractBeginningInt(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 0;
        while (true) {
            int n4 = string2.length();
            if (n3 >= n4) break;
            n4 = string2.charAt(n3);
            boolean bl2 = Character.isDigit((char)n4);
            if (!bl2) break;
            stringBuilder.append((char)n4);
            ++n3;
            continue;
            break;
        }
        try {
            string2 = stringBuilder.toString();
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
        return Integer.parseInt(string2);
    }

    public static int getMajorJavaVersion() {
        return majorJavaVersion;
    }

    public static int getMajorJavaVersion(String string2) {
        int n3;
        int n4 = JavaVersion.parseDotted(string2);
        if (n4 == (n3 = -1)) {
            n4 = JavaVersion.extractBeginningInt(string2);
        }
        if (n4 == n3) {
            return 6;
        }
        return n4;
    }

    public static boolean isJava9OrLater() {
        int n3 = majorJavaVersion;
        int n4 = 9;
        n3 = n3 >= n4 ? 1 : 0;
        return n3 != 0;
    }

    private static int parseDotted(String object) {
        int n3;
        block7: {
            String string2 = "[._]";
            try {
                object = object.split(string2);
                n3 = 0;
                string2 = null;
            }
            catch (NumberFormatException numberFormatException) {
                return -1;
            }
            string2 = object[0];
            n3 = Integer.parseInt(string2);
            int n4 = 1;
            if (n3 != n4) break block7;
            int n7 = ((String[])object).length;
            if (n7 <= n4) break block7;
            object = object[n4];
            return Integer.parseInt((String)object);
        }
        return n3;
    }
}


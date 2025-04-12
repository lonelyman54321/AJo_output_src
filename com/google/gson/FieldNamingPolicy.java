/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.FieldNamingPolicy$1;
import com.google.gson.FieldNamingPolicy$2;
import com.google.gson.FieldNamingPolicy$3;
import com.google.gson.FieldNamingPolicy$4;
import com.google.gson.FieldNamingPolicy$5;
import com.google.gson.FieldNamingPolicy$6;
import com.google.gson.FieldNamingPolicy$7;
import com.google.gson.FieldNamingStrategy;

public abstract class FieldNamingPolicy
extends Enum
implements FieldNamingStrategy {
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES;
    public static final /* enum */ FieldNamingPolicy IDENTITY;
    public static final /* enum */ FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final /* enum */ FieldNamingPolicy LOWER_CASE_WITH_DOTS;
    public static final /* enum */ FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final /* enum */ FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final /* enum */ FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;
    public static final /* enum */ FieldNamingPolicy UPPER_CASE_WITH_UNDERSCORES;

    static {
        FieldNamingPolicy$1 fieldNamingPolicy$1 = new FieldNamingPolicy$1();
        IDENTITY = fieldNamingPolicy$1;
        int n3 = 1;
        FieldNamingPolicy$2 fieldNamingPolicy$2 = new FieldNamingPolicy$2();
        UPPER_CAMEL_CASE = fieldNamingPolicy$2;
        int n4 = 2;
        FieldNamingPolicy$3 fieldNamingPolicy$3 = new FieldNamingPolicy$3();
        UPPER_CAMEL_CASE_WITH_SPACES = fieldNamingPolicy$3;
        int n7 = 3;
        FieldNamingPolicy$4 fieldNamingPolicy$4 = new FieldNamingPolicy$4();
        UPPER_CASE_WITH_UNDERSCORES = fieldNamingPolicy$4;
        int n8 = 4;
        FieldNamingPolicy$5 fieldNamingPolicy$5 = new FieldNamingPolicy$5();
        LOWER_CASE_WITH_UNDERSCORES = fieldNamingPolicy$5;
        int n10 = 5;
        FieldNamingPolicy$6 fieldNamingPolicy$6 = new FieldNamingPolicy$6();
        LOWER_CASE_WITH_DASHES = fieldNamingPolicy$6;
        int n14 = 6;
        FieldNamingPolicy$7 fieldNamingPolicy$7 = new FieldNamingPolicy$7();
        LOWER_CASE_WITH_DOTS = fieldNamingPolicy$7;
        FieldNamingPolicy[] fieldNamingPolicyArray = new FieldNamingPolicy[7];
        fieldNamingPolicyArray[0] = fieldNamingPolicy$1;
        fieldNamingPolicyArray[n3] = fieldNamingPolicy$2;
        fieldNamingPolicyArray[n4] = fieldNamingPolicy$3;
        fieldNamingPolicyArray[n7] = fieldNamingPolicy$4;
        fieldNamingPolicyArray[n8] = fieldNamingPolicy$5;
        fieldNamingPolicyArray[n10] = fieldNamingPolicy$6;
        fieldNamingPolicyArray[n14] = fieldNamingPolicy$7;
        $VALUES = fieldNamingPolicyArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FieldNamingPolicy() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ FieldNamingPolicy(FieldNamingPolicy$1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static String separateCamelCase(String string2, char c2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = string2.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            char c3 = string2.charAt(i3);
            int n4 = Character.isUpperCase(c3);
            if (n4 != 0 && (n4 = stringBuilder.length()) != 0) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(c3);
        }
        return stringBuilder.toString();
    }

    public static String upperCaseFirstLetter(String string2) {
        int n3 = string2.length();
        CharSequence charSequence = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2 = string2.charAt(i3);
            boolean bl2 = Character.isLetter(c2);
            if (!bl2) continue;
            n3 = (int)(Character.isUpperCase(c2) ? 1 : 0);
            if (n3 != 0) {
                return string2;
            }
            n3 = Character.toUpperCase(c2);
            c2 = '\u0001';
            if (i3 == 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((char)n3);
                string2 = string2.substring(c2);
                ((StringBuilder)charSequence).append(string2);
                return ((StringBuilder)charSequence).toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            charSequence = string2.substring(0, i3);
            stringBuilder.append((String)charSequence);
            stringBuilder.append((char)n3);
            string2 = string2.substring(i3 += c2);
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
        return string2;
    }

    public static FieldNamingPolicy valueOf(String string2) {
        return Enum.valueOf(FieldNamingPolicy.class, string2);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[])$VALUES.clone();
    }
}


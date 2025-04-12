/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

public final class JwtLocation$InCase
extends Enum {
    private static final /* synthetic */ JwtLocation$InCase[] $VALUES;
    public static final /* enum */ JwtLocation$InCase HEADER;
    public static final /* enum */ JwtLocation$InCase IN_NOT_SET;
    public static final /* enum */ JwtLocation$InCase QUERY;
    private final int value;

    static {
        JwtLocation$InCase jwtLocation$InCase;
        JwtLocation$InCase jwtLocation$InCase2;
        JwtLocation$InCase jwtLocation$InCase3;
        int n3 = 1;
        HEADER = jwtLocation$InCase3 = new JwtLocation$InCase("HEADER", 0, n3);
        int n4 = 2;
        QUERY = jwtLocation$InCase2 = new JwtLocation$InCase("QUERY", n3, n4);
        IN_NOT_SET = jwtLocation$InCase = new JwtLocation$InCase("IN_NOT_SET", n4, 0);
        JwtLocation$InCase[] jwtLocation$InCaseArray = new JwtLocation$InCase[3];
        jwtLocation$InCaseArray[0] = jwtLocation$InCase3;
        jwtLocation$InCaseArray[n3] = jwtLocation$InCase2;
        jwtLocation$InCaseArray[n4] = jwtLocation$InCase;
        $VALUES = jwtLocation$InCaseArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JwtLocation$InCase() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static JwtLocation$InCase forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return QUERY;
            }
            return HEADER;
        }
        return IN_NOT_SET;
    }

    public static JwtLocation$InCase valueOf(int n3) {
        return JwtLocation$InCase.forNumber(n3);
    }

    public static JwtLocation$InCase valueOf(String string2) {
        return Enum.valueOf(JwtLocation$InCase.class, string2);
    }

    public static JwtLocation$InCase[] values() {
        return (JwtLocation$InCase[])$VALUES.clone();
    }

    public int getNumber() {
        return this.value;
    }
}


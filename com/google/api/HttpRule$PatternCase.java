/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

public final class HttpRule$PatternCase
extends Enum {
    private static final /* synthetic */ HttpRule$PatternCase[] $VALUES;
    public static final /* enum */ HttpRule$PatternCase CUSTOM;
    public static final /* enum */ HttpRule$PatternCase DELETE;
    public static final /* enum */ HttpRule$PatternCase GET;
    public static final /* enum */ HttpRule$PatternCase PATCH;
    public static final /* enum */ HttpRule$PatternCase PATTERN_NOT_SET;
    public static final /* enum */ HttpRule$PatternCase POST;
    public static final /* enum */ HttpRule$PatternCase PUT;
    private final int value;

    static {
        HttpRule$PatternCase httpRule$PatternCase;
        HttpRule$PatternCase httpRule$PatternCase2;
        HttpRule$PatternCase httpRule$PatternCase3;
        HttpRule$PatternCase httpRule$PatternCase4;
        HttpRule$PatternCase httpRule$PatternCase5;
        HttpRule$PatternCase httpRule$PatternCase6;
        HttpRule$PatternCase httpRule$PatternCase7;
        int n3 = 2;
        GET = httpRule$PatternCase7 = new HttpRule$PatternCase("GET", 0, n3);
        int n4 = 1;
        int n7 = 3;
        PUT = httpRule$PatternCase6 = new HttpRule$PatternCase("PUT", n4, n7);
        int n8 = 4;
        POST = httpRule$PatternCase5 = new HttpRule$PatternCase("POST", n3, n8);
        int n10 = 5;
        DELETE = httpRule$PatternCase4 = new HttpRule$PatternCase("DELETE", n7, n10);
        int n14 = 6;
        PATCH = httpRule$PatternCase3 = new HttpRule$PatternCase("PATCH", n8, n14);
        CUSTOM = httpRule$PatternCase2 = new HttpRule$PatternCase("CUSTOM", n10, 8);
        PATTERN_NOT_SET = httpRule$PatternCase = new HttpRule$PatternCase("PATTERN_NOT_SET", n14, 0);
        HttpRule$PatternCase[] httpRule$PatternCaseArray = new HttpRule$PatternCase[7];
        httpRule$PatternCaseArray[0] = httpRule$PatternCase7;
        httpRule$PatternCaseArray[n4] = httpRule$PatternCase6;
        httpRule$PatternCaseArray[n3] = httpRule$PatternCase5;
        httpRule$PatternCaseArray[n7] = httpRule$PatternCase4;
        httpRule$PatternCaseArray[n8] = httpRule$PatternCase3;
        httpRule$PatternCaseArray[n10] = httpRule$PatternCase2;
        httpRule$PatternCaseArray[n14] = httpRule$PatternCase;
        $VALUES = httpRule$PatternCaseArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HttpRule$PatternCase() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static HttpRule$PatternCase forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 8;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            n4 = 5;
                            if (n3 != n4) {
                                n4 = 6;
                                if (n3 != n4) {
                                    return null;
                                }
                                return PATCH;
                            }
                            return DELETE;
                        }
                        return POST;
                    }
                    return PUT;
                }
                return GET;
            }
            return CUSTOM;
        }
        return PATTERN_NOT_SET;
    }

    public static HttpRule$PatternCase valueOf(int n3) {
        return HttpRule$PatternCase.forNumber(n3);
    }

    public static HttpRule$PatternCase valueOf(String string2) {
        return Enum.valueOf(HttpRule$PatternCase.class, string2);
    }

    public static HttpRule$PatternCase[] values() {
        return (HttpRule$PatternCase[])$VALUES.clone();
    }

    public int getNumber() {
        return this.value;
    }
}


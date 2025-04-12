/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

public class ResponseParser {
    public static final int ResponseActionDiscard = 0;
    public static final int ResponseActionRetry = 1;

    public static int parse(int n3) {
        int n4 = 200;
        if (n3 >= n4 && n3 <= (n4 = 299)) {
            return 0;
        }
        n4 = 300;
        int n7 = 1;
        if (n3 >= n4 && n3 <= (n4 = 399)) {
            return n7;
        }
        n4 = 400;
        if (n3 >= n4 && n3 <= (n4 = 499)) {
            return 0;
        }
        return n7;
    }
}


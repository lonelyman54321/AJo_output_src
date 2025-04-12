/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.stacktrace;

import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;

public class MiddleOutStrategy
implements StackTraceTrimmingStrategy {
    private final int trimmedSize;

    public MiddleOutStrategy(int n3) {
        this.trimmedSize = n3;
    }

    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArray) {
        int n3 = stackTraceElementArray.length;
        int n4 = this.trimmedSize;
        if (n3 <= n4) {
            return stackTraceElementArray;
        }
        n3 = n4 / 2;
        int n7 = n4 - n3;
        StackTraceElement[] stackTraceElementArray2 = new StackTraceElement[n4];
        System.arraycopy(stackTraceElementArray, 0, stackTraceElementArray2, 0, n7);
        int n8 = stackTraceElementArray.length - n3;
        System.arraycopy(stackTraceElementArray, n8, stackTraceElementArray2, n7, n3);
        return stackTraceElementArray2;
    }
}


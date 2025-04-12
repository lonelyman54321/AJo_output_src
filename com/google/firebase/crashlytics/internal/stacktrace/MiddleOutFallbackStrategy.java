/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.stacktrace;

import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;

public class MiddleOutFallbackStrategy
implements StackTraceTrimmingStrategy {
    private final int maximumStackSize;
    private final MiddleOutStrategy middleOutStrategy;
    private final StackTraceTrimmingStrategy[] trimmingStrategies;

    public MiddleOutFallbackStrategy(int n3, StackTraceTrimmingStrategy ... object) {
        this.maximumStackSize = n3;
        this.trimmingStrategies = object;
        super(n3);
        this.middleOutStrategy = object;
    }

    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] object) {
        int n3;
        int n4 = ((StackTraceElement[])object).length;
        int n7 = this.maximumStackSize;
        if (n4 <= n7) {
            return object;
        }
        StackTraceTrimmingStrategy[] stackTraceTrimmingStrategyArray = this.trimmingStrategies;
        n7 = stackTraceTrimmingStrategyArray.length;
        StackTraceElement[] stackTraceElementArray = object;
        for (int i3 = 0; i3 < n7; ++i3) {
            StackTraceTrimmingStrategy stackTraceTrimmingStrategy = stackTraceTrimmingStrategyArray[i3];
            int n8 = stackTraceElementArray.length;
            int n10 = this.maximumStackSize;
            if (n8 <= n10) break;
            stackTraceElementArray = stackTraceTrimmingStrategy.getTrimmedStackTrace((StackTraceElement[])object);
        }
        if ((n3 = stackTraceElementArray.length) > (n4 = this.maximumStackSize)) {
            object = this.middleOutStrategy;
            stackTraceElementArray = ((MiddleOutStrategy)object).getTrimmedStackTrace(stackTraceElementArray);
        }
        return stackTraceElementArray;
    }
}


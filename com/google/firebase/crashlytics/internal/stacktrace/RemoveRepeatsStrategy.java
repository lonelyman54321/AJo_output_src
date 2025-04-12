/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.stacktrace;

import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.util.HashMap;

public class RemoveRepeatsStrategy
implements StackTraceTrimmingStrategy {
    private final int maxRepetitions;

    public RemoveRepeatsStrategy() {
        this(1);
    }

    public RemoveRepeatsStrategy(int n3) {
        this.maxRepetitions = n3;
    }

    private static boolean isRepeatingSequence(StackTraceElement[] stackTraceElementArray, int n3, int n4) {
        int n7 = n4 - n3;
        int n8 = n4 + n7;
        int n10 = stackTraceElementArray.length;
        if (n8 > n10) {
            return false;
        }
        for (n8 = 0; n8 < n7; ++n8) {
            n10 = n3 + n8;
            StackTraceElement stackTraceElement = stackTraceElementArray[n10];
            int n14 = n4 + n8;
            StackTraceElement stackTraceElement2 = stackTraceElementArray[n14];
            if ((n10 = (int)(stackTraceElement.equals(stackTraceElement2) ? 1 : 0)) != 0) continue;
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private static StackTraceElement[] trimRepeats(StackTraceElement[] var0, int var1_1) {
        var2_2 = new HashMap<StackTraceElement, Integer>();
        var3_3 = var0.length;
        var4_4 = new StackTraceElement[var3_3];
        var5_5 = 0;
        var6_6 = null;
        var7_7 = 0;
        var8_8 = 1;
        while (var5_5 < (var9_9 = var0.length)) {
            var10_10 = var0[var5_5];
            var11_11 = (Integer)var2_2.get(var10_10);
            if (var11_11 == null) ** GOTO lbl-1000
            var12_12 = var11_11;
            if ((var12_12 = (int)RemoveRepeatsStrategy.isRepeatingSequence(var0, var12_12, var5_5)) != 0) {
                var13_13 = var11_11;
                var13_13 = var5_5 - var13_13;
                if (var8_8 < var1_1) {
                    System.arraycopy(var0, var5_5, var4_4, var7_7, var13_13);
                    var7_7 += var13_13;
                    ++var8_8;
                }
                var13_13 = var13_13 + -1 + var5_5;
            } else lbl-1000:
            // 2 sources

            {
                var4_4[var7_7] = var14_14 = var0[var5_5];
                ++var7_7;
                var13_13 = var5_5;
                var8_8 = 1;
            }
            var6_6 = var5_5;
            var2_2.put(var10_10, var6_6);
            var5_5 = var13_13 + 1;
        }
        var0 = new StackTraceElement[var7_7];
        System.arraycopy(var4_4, 0, var0, 0, var7_7);
        return var0;
    }

    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArray) {
        int n3;
        int n4 = this.maxRepetitions;
        StackTraceElement[] stackTraceElementArray2 = RemoveRepeatsStrategy.trimRepeats(stackTraceElementArray, n4);
        int n7 = stackTraceElementArray2.length;
        if (n7 < (n3 = stackTraceElementArray.length)) {
            return stackTraceElementArray2;
        }
        return stackTraceElementArray;
    }
}


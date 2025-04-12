/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.firebase.logger;

import android.util.Log;
import com.google.firebase.logger.Logger;
import com.google.firebase.logger.Logger$AndroidLogger$WhenMappings;
import com.google.firebase.logger.Logger$Level;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

final class Logger$AndroidLogger
extends Logger {
    public Logger$AndroidLogger(String string2, boolean bl2, Logger$Level logger$Level) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter((Object)logger$Level, "minLevel");
        super(string2, bl2, logger$Level, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public int log(Logger$Level object, String string2, Object[] objectArray, Throwable throwable) {
        void var8_26;
        void var4_10;
        int[] nArray;
        String string3;
        Intrinsics.checkNotNullParameter(object, "level");
        Intrinsics.checkNotNullParameter(string3, "format");
        Object object2 = "args";
        Intrinsics.checkNotNullParameter(nArray, (String)object2);
        int n3 = nArray.length;
        if (n3 != 0) {
            object2 = StringCompanionObject.INSTANCE;
            n3 = nArray.length;
            nArray = Arrays.copyOf(nArray, n3);
            n3 = nArray.length;
            String string4 = "format(format, *args)";
            string3 = xh2_0.a(nArray, n3, string3, string4);
        }
        nArray = Logger$AndroidLogger$WhenMappings.$EnumSwitchMapping$0;
        int n7 = ((Enum)object).ordinal();
        n7 = nArray[n7];
        int n8 = 1;
        if (n7 != n8) {
            n8 = 2;
            if (n7 != n8) {
                n8 = 3;
                if (n7 != n8) {
                    n8 = 4;
                    if (n7 != n8) {
                        n8 = 5;
                        if (n7 != n8) {
                            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                            throw noWhenBranchMatchedException;
                        }
                        String string5 = this.getTag();
                        if (var4_10 != null) {
                            int n10 = Log.e((String)string5, (String)string3, (Throwable)var4_10);
                            return (int)var8_26;
                        }
                        int n14 = Log.e((String)string5, (String)string3);
                        return (int)var8_26;
                    }
                    String string6 = this.getTag();
                    if (var4_10 != null) {
                        int n15 = Log.w((String)string6, (String)string3, (Throwable)var4_10);
                        return (int)var8_26;
                    }
                    int n16 = Log.w((String)string6, (String)string3);
                    return (int)var8_26;
                }
                String string7 = this.getTag();
                if (var4_10 != null) {
                    int n17 = Log.i((String)string7, (String)string3, (Throwable)var4_10);
                    return (int)var8_26;
                }
                int n18 = Log.i((String)string7, (String)string3);
                return (int)var8_26;
            }
            String string8 = this.getTag();
            if (var4_10 != null) {
                int n19 = Log.d((String)string8, (String)string3, (Throwable)var4_10);
                return (int)var8_26;
            }
            int n20 = Log.d((String)string8, (String)string3);
            return (int)var8_26;
        }
        String string9 = this.getTag();
        if (var4_10 != null) {
            int n21 = Log.v((String)string9, (String)string3, (Throwable)var4_10);
            return (int)var8_26;
        }
        int n22 = Log.v((String)string9, (String)string3);
        return (int)var8_26;
    }
}


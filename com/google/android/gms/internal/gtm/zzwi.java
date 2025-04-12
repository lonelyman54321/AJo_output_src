/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzwh;

final class zzwi
implements zzwh {
    public final StackTraceElement zza(Class object, int n3) {
        int n4;
        int n7;
        StackTraceElement[] stackTraceElementArray;
        block5: {
            stackTraceElementArray = new Throwable();
            stackTraceElementArray = stackTraceElementArray.getStackTrace();
            object = ((Class)object).getName();
            n7 = 3;
            boolean bl2 = false;
            while (true) {
                int n8 = stackTraceElementArray.length;
                n4 = -1;
                if (n7 >= n8) break;
                String string2 = stackTraceElementArray[n7].getClassName();
                n8 = (int)(string2.equals(object) ? 1 : 0);
                if (n8 != 0) {
                    bl2 = true;
                } else {
                    if (bl2) break block5;
                    bl2 = false;
                }
                ++n7;
            }
            n7 = -1;
        }
        if (n7 != n4) {
            return stackTraceElementArray[n7];
        }
        return null;
    }
}


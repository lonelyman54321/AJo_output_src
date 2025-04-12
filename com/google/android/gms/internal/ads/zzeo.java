/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 */
package com.google.android.gms.internal.ads;

import android.text.Spannable;

public final class zzeo {
    public static void zza(Spannable spannable, Object object, int n3, int n4, int n7) {
        int n8;
        Object[] objectArray = object.getClass();
        objectArray = spannable.getSpans(n3, n4, objectArray);
        int n10 = objectArray.length;
        int n14 = 0;
        while (true) {
            n8 = 33;
            if (n14 >= n10) break;
            Object object2 = objectArray[n14];
            int n15 = spannable.getSpanStart(object2);
            if (n15 == n3 && (n15 = spannable.getSpanEnd(object2)) == n4 && (n15 = spannable.getSpanFlags(object2)) == n8) {
                spannable.removeSpan(object2);
            }
            ++n14;
        }
        spannable.setSpan(object, n3, n4, n8);
    }
}


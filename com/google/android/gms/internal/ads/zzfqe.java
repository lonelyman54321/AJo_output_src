/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzfqe {
    public static String zza(View view) {
        int n3 = view.isAttachedToWindow();
        if (n3 != 0) {
            int n4;
            n3 = view.getVisibility();
            if (n3 == (n4 = 8)) {
                return "viewGone";
            }
            n4 = 4;
            if (n3 == n4) {
                return "viewInvisible";
            }
            if (n3 != 0) {
                return "viewNotVisible";
            }
            float f5 = view.getAlpha();
            n3 = 0;
            float f6 = f5 - 0.0f;
            Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object == false) {
                return "viewAlphaZero";
            }
            return null;
        }
        return "notAttached";
    }
}


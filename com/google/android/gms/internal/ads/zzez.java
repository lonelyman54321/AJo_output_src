/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.opengl.EGL14
 *  android.opengl.EGLDisplay
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzgd;

public final class zzez {
    public static void zza(boolean bl2, String string2) {
        if (bl2) {
            return;
        }
        zzey zzey2 = new zzey(string2);
        throw zzey2;
    }

    public static boolean zzb(Context context) {
        String string2;
        boolean bl2;
        String string3;
        String string4;
        boolean bl3;
        int n3 = zzgd.zza;
        int n4 = 24;
        if (n3 < n4 || n3 < (n4 = 26) && ((bl3 = (string4 = "samsung").equals(string3 = zzgd.zzc)) || (bl3 = (string4 = "XT1650").equals(string3 = zzgd.zzd))) || n3 < n4 && !(bl2 = (context = context.getPackageManager()).hasSystemFeature(string2 = "android.hardware.vr.high_performance"))) {
            return false;
        }
        return zzez.zzd("EGL_EXT_protected_content");
    }

    public static boolean zzc() {
        return zzez.zzd("EGL_KHR_surfaceless_context");
    }

    private static boolean zzd(String string2) {
        boolean bl2;
        Object object = EGL14.eglGetDisplay((int)0);
        int n3 = 12373;
        return (object = EGL14.eglQueryString((EGLDisplay)object, (int)n3)) != null && (bl2 = ((String)object).contains(string2));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ClipData
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.internal.ads.zzfyg;

public final class zzfvl {
    public static final int zza;
    public static final ClipData zzb;

    static {
        Intent intent;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 22;
        if (n3 > n4) {
            n3 = 0x4000000;
        } else {
            n3 = 0;
            intent = null;
        }
        zza = n3;
        intent = new Intent();
        zzb = ClipData.newIntent((CharSequence)"", (Intent)intent);
    }

    public static PendingIntent zza(Context context, int n3, Intent intent, int n4) {
        n3 = 0xC000000;
        intent = zzfvl.zzc(intent, n3, 0);
        return PendingIntent.getActivity((Context)context, (int)0, (Intent)intent, (int)n3);
    }

    public static PendingIntent zzb(Context context, int n3, Intent intent, int n4, int n7) {
        intent = zzfvl.zzc(intent, n4, 0);
        return PendingIntent.getService((Context)context, (int)0, (Intent)intent, (int)n4);
    }

    private static Intent zzc(Intent object, int n3, int n4) {
        Object object2;
        n4 = n3 & 0x58;
        int n7 = 1;
        if (n4 == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        String string2 = "Cannot set any dangerous parts of intent to be mutable.";
        zzfyg.zzf(n4 != 0, string2);
        n4 = n3 & 1;
        int n8 = 3;
        if (n4 == 0 || (n4 = (int)(zzfvl.zzd(0, n8) ? 1 : 0)) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        String string3 = "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.";
        zzfyg.zzf(n4 != 0, string3);
        n4 = n3 & 2;
        int n10 = 5;
        if (n4 == 0 || (n4 = (int)(zzfvl.zzd(0, n10) ? 1 : 0)) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        String string4 = "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.";
        zzfyg.zzf(n4 != 0, string4);
        n4 = n3 & 4;
        int n14 = 9;
        if (n4 == 0 || (n4 = (int)(zzfvl.zzd(0, n14) ? 1 : 0)) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        String string5 = "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.";
        zzfyg.zzf(n4 != 0, string5);
        n4 = n3 & 0x80;
        int n15 = 17;
        if (n4 == 0 || (n4 = (int)(zzfvl.zzd(0, n15) ? 1 : 0)) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        String string6 = "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.";
        zzfyg.zzf(n4 != 0, string6);
        object2 = object.getComponent();
        if (object2 != null) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        string6 = "Must set component on Intent.";
        zzfyg.zzf(n4 != 0, string6);
        n4 = (int)(zzfvl.zzd(0, n7) ? 1 : 0);
        int n16 = 23;
        int n17 = 0x4000000;
        if (n4 != 0) {
            n4 = zzfvl.zzd(n3, n17) ^ n7;
            String string7 = "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.";
            zzfyg.zzf(n4 != 0, string7);
        } else {
            n4 = Build.VERSION.SDK_INT;
            if (n4 >= n16 && (n4 = (int)(zzfvl.zzd(n3, n17) ? 1 : 0)) == 0) {
                n7 = 0;
                Object var16_17 = null;
            }
            object2 = "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.";
            zzfyg.zzf(n7 != 0, object2);
        }
        object2 = new Intent(object);
        int n18 = Build.VERSION.SDK_INT;
        if (n18 < n16 || (n18 = (int)(zzfvl.zzd(n3, n17) ? 1 : 0)) == 0) {
            object = object2.getPackage();
            if (object == null) {
                object = object2.getComponent().getPackageName();
                object2.setPackage((String)object);
            }
            n18 = (int)(zzfvl.zzd(0, n8) ? 1 : 0);
            String string8 = "";
            if (n18 == 0 && (object = object2.getAction()) == null) {
                object2.setAction(string8);
            }
            if ((n18 = (int)(zzfvl.zzd(0, n14) ? 1 : 0)) == 0 && (object = object2.getCategories()) == null) {
                object2.addCategory(string8);
            }
            if ((n18 = (int)(zzfvl.zzd(0, n10) ? 1 : 0)) == 0 && (object = object2.getData()) == null) {
                object = Uri.EMPTY;
                string8 = "*/*";
                object2.setDataAndType((Uri)object, string8);
            }
            if ((n18 = (int)(zzfvl.zzd(0, n15) ? 1 : 0)) == 0 && (object = object2.getClipData()) == null) {
                object = zzb;
                object2.setClipData((ClipData)object);
            }
        }
        return object2;
    }

    private static boolean zzd(int n3, int n4) {
        return (n3 &= n4) == n4;
    }
}


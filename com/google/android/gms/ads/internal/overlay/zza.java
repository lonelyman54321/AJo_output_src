/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;

public final class zza {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean zza(Context context, Intent intent, zzaa zzaa2, zzy zzy2, boolean bl2) {
        ActivityNotFoundException activityNotFoundException2;
        block5: {
            block4: {
                String string2 = "Launching an intent: ";
                if (bl2) {
                    intent = intent.getData();
                    return zza.zzc(context, (Uri)intent, zzaa2, zzy2);
                }
                try {
                    String string3 = intent.toURI();
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append(string3);
                    string3 = stringBuilder.toString();
                    zze.zza(string3);
                    zzu.zzp();
                    zzt.zzT(context, intent);
                    if (zzaa2 == null) break block4;
                    zzaa2.zzg();
                }
                catch (ActivityNotFoundException activityNotFoundException2) {
                    break block5;
                }
            }
            boolean bl3 = true;
            if (zzy2 != null) {
                zzy2.zza(bl3);
            }
            return bl3;
        }
        zzm.zzj(activityNotFoundException2.getMessage());
        boolean bl4 = false;
        Object var0_2 = null;
        if (zzy2 == null) return false;
        zzy2.zza(false);
        return false;
    }

    public static final boolean zzb(Context object, zzc zzc2, zzaa zzaa2, zzy zzy2) {
        int n3;
        int n4 = 0;
        Object object2 = null;
        if (zzc2 == null) {
            zzm.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbep.zza(object);
        Intent intent = zzc2.zzh;
        if (intent != null) {
            boolean bl2 = zzc2.zzj;
            return zza.zza(object, intent, zzaa2, zzy2, bl2);
        }
        intent = new Intent();
        Object object3 = zzc2.zzb;
        boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
        if (bl3) {
            zzm.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        object3 = zzc2.zzc;
        bl3 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl3) {
            object3 = zzc2.zzb;
            String string2 = zzc2.zzc;
            object3 = Uri.parse((String)object3);
            intent.setDataAndType((Uri)object3, string2);
        } else {
            object3 = Uri.parse((String)zzc2.zzb);
            intent.setData((Uri)object3);
        }
        intent.setAction("android.intent.action.VIEW");
        object3 = zzc2.zzd;
        bl3 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl3) {
            object3 = zzc2.zzd;
            intent.setPackage((String)object3);
        }
        object3 = zzc2.zze;
        bl3 = TextUtils.isEmpty((CharSequence)object3);
        boolean bl4 = true;
        if (!bl3) {
            object3 = zzc2.zze;
            Object object4 = "/";
            int n7 = 2;
            n3 = ((String[])(object3 = ((String)object3).split((String)object4, n7))).length;
            if (n3 < n7) {
                object = String.valueOf(zzc2.zze);
                zzm.zzj("Could not parse component name from open GMSG: ".concat((String)object));
                return false;
            }
            object4 = object3[0];
            object3 = object3[bl4];
            intent.setClassName((String)object4, (String)object3);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)(object3 = zzc2.zzf))) == 0) {
            try {
                n4 = Integer.parseInt((String)object3);
            }
            catch (NumberFormatException numberFormatException) {
                object3 = "Could not parse intent flags.";
                zzm.zzj((String)object3);
            }
            intent.addFlags(n4);
        }
        object2 = zzbep.zzeA;
        object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        n4 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
        if (n4 != 0) {
            n4 = 0x10000000;
            intent.addFlags(n4);
            object2 = "android.support.customtabs.extra.user_opt_out";
            intent.putExtra((String)object2, bl4);
        } else {
            object2 = zzbep.zzez;
            object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            n4 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
            if (n4 != 0) {
                zzu.zzp();
                zzt.zzo(object, intent);
            }
        }
        boolean bl5 = zzc2.zzj;
        return zza.zza(object, intent, zzaa2, zzy2, bl5);
    }

    private static final boolean zzc(Context object, Uri uri, zzaa zzaa2, zzy zzy2) {
        int n3;
        int n4;
        block5: {
            zzt zzt2 = zzu.zzp();
            n4 = zzt2.zzm((Context)object, uri);
            if (zzaa2 == null) break block5;
            try {
                zzaa2.zzg();
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                object = activityNotFoundException.getMessage();
                zzm.zzj((String)object);
                n4 = 6;
            }
        }
        if (zzy2 != null) {
            zzy2.zzb(n4);
        }
        return n4 == (n3 = 5);
    }
}


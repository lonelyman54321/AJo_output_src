/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcau;
import java.util.Map;

public final class zzcaw {
    public static Uri zza(String string2, String string3, String string4) {
        int n3;
        String string5 = "&adurl";
        int n4 = string2.indexOf(string5);
        if (n4 == (n3 = -1)) {
            string5 = "?adurl";
            n4 = string2.indexOf(string5);
        }
        if (n4 != n3) {
            String string6 = string2.substring(0, ++n4);
            StringBuilder stringBuilder = new StringBuilder(string6);
            X50.a(stringBuilder, string3, "=", string4, "&");
            string2 = string2.substring(n4);
            stringBuilder.append(string2);
            return Uri.parse((String)stringBuilder.toString());
        }
        return Uri.parse((String)string2).buildUpon().appendQueryParameter(string3, string4).build();
    }

    public static String zzb(Uri object, Context context, Map map2) {
        Object object2 = zzu.zzn();
        boolean bl2 = ((zzcau)object2).zzp(context);
        if (!bl2) {
            return object.toString();
        }
        object2 = zzu.zzn().zza(context);
        if (object2 == null) {
            return object.toString();
        }
        Object object3 = zzbep.zzaf;
        object3 = (String)zzba.zzc().zza((zzbeg)object3);
        String string2 = object.toString();
        Object object4 = zzbep.zzae;
        object4 = (Boolean)zzba.zzc().zza((zzbeg)object4);
        boolean bl3 = (Boolean)object4;
        String string3 = "_ac";
        if (bl3 && (bl3 = string2.contains((CharSequence)object3))) {
            object = zzu.zzn();
            map2 = (Map)map2.get(string3);
            ((zzcau)object).zzj(context, (String)object2, map2);
            object = zzcaw.zzd(string2, context);
            string2 = ((String)object).replace((CharSequence)object3, (CharSequence)object2);
        } else {
            object3 = "fbs_aeid";
            boolean bl4 = TextUtils.isEmpty((CharSequence)(object = object.getQueryParameter((String)object3)));
            if (bl4) {
                object = zzbep.zzad;
                object4 = zzba.zzc();
                object = (Boolean)((zzben)object4).zza((zzbeg)object);
                bl4 = (Boolean)object;
                if (!bl4) {
                    object = zzcaw.zza(zzcaw.zzd(string2, context), (String)object3, (String)object2).toString();
                    object3 = zzu.zzn();
                    map2 = (Map)map2.get(string3);
                    ((zzcau)object3).zzj(context, (String)object2, map2);
                    return object;
                }
            }
        }
        return string2;
    }

    public static String zzc(String string2, Context context, boolean bl2, Map map2) {
        Object object;
        Object object2 = zzbep.zzam;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        if ((!bl3 || bl2) && (bl2 = ((zzcau)(object = zzu.zzn())).zzp(context)) && !(bl2 = TextUtils.isEmpty((CharSequence)string2)) && (object = zzu.zzn().zza(context)) != null) {
            object2 = zzbep.zzaf;
            object2 = (String)zzba.zzc().zza((zzbeg)object2);
            object3 = zzbep.zzae;
            object3 = (Boolean)zzba.zzc().zza((zzbeg)object3);
            boolean bl4 = (Boolean)object3;
            String string3 = "_ai";
            String string4 = "_ac";
            if (bl4 && (bl4 = string2.contains((CharSequence)object2))) {
                object3 = zzu.zzp();
                bl4 = ((zzt)object3).zzi(string2);
                if (bl4) {
                    object3 = zzu.zzn();
                    map2 = (Map)map2.get(string4);
                    ((zzcau)object3).zzj(context, (String)object, map2);
                    return zzcaw.zzd(string2, context).replace((CharSequence)object2, (CharSequence)object);
                }
                object3 = zzu.zzp();
                bl4 = ((zzt)object3).zzj(string2);
                if (bl4) {
                    object3 = zzu.zzn();
                    map2 = (Map)map2.get(string3);
                    ((zzcau)object3).zzk(context, (String)object, map2);
                    return zzcaw.zzd(string2, context).replace((CharSequence)object2, (CharSequence)object);
                }
            } else {
                object2 = "fbs_aeid";
                bl4 = string2.contains((CharSequence)object2);
                if (!bl4) {
                    object3 = zzbep.zzad;
                    zzben zzben2 = zzba.zzc();
                    object3 = (Boolean)zzben2.zza((zzbeg)object3);
                    bl4 = (Boolean)object3;
                    if (!bl4) {
                        object3 = zzu.zzp();
                        bl4 = ((zzt)object3).zzi(string2);
                        if (bl4) {
                            object3 = zzu.zzn();
                            map2 = (Map)map2.get(string4);
                            ((zzcau)object3).zzj(context, (String)object, map2);
                            return zzcaw.zza(zzcaw.zzd(string2, context), (String)object2, (String)object).toString();
                        }
                        object3 = zzu.zzp();
                        bl4 = ((zzt)object3).zzj(string2);
                        if (bl4) {
                            object3 = zzu.zzn();
                            map2 = (Map)map2.get(string3);
                            ((zzcau)object3).zzk(context, (String)object, map2);
                            string2 = zzcaw.zza(zzcaw.zzd(string2, context), (String)object2, (String)object).toString();
                        }
                    }
                }
            }
        }
        return string2;
    }

    private static String zzd(String string2, Context object) {
        boolean bl2;
        String string3 = zzu.zzn().zzd((Context)object);
        object = zzu.zzn().zzb((Context)object);
        String string4 = "gmp_app_id";
        boolean bl3 = string2.contains(string4);
        if (!bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)string3))) {
            string2 = zzcaw.zza(string2, string4, string3).toString();
        }
        if (!(bl2 = string2.contains(string3 = "fbs_aiid")) && !(bl2 = TextUtils.isEmpty((CharSequence)object))) {
            string2 = zzcaw.zza(string2, string3, (String)object).toString();
        }
        return string2;
    }
}


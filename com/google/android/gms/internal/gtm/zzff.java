/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzeo;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class zzff {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long zza(String string2) {
        long l2 = 0L;
        if (string2 == null) {
            return l2;
        }
        try {
            return Long.parseLong(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return l2;
        }
    }

    public static zzav zzb(zzeo object, String object2) {
        StringBuilder stringBuilder;
        String string2 = "?";
        Preconditions.checkNotNull(object);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (bl2) {
            return null;
        }
        Serializable serializable = new Serializable();
        try {
            stringBuilder = new StringBuilder(string2);
        }
        catch (URISyntaxException uRISyntaxException) {
            ((zzbq)object).zzR("No valid campaign data found", uRISyntaxException);
            return null;
        }
        stringBuilder.append((String)object2);
        object2 = stringBuilder.toString();
        serializable = new Serializable((String)object2);
        object2 = "UTF-8";
        object = HttpUtils.parse(serializable, (String)object2);
        object2 = new zzav();
        string2 = (String)object.get("utm_content");
        ((zzav)object2).zzp(string2);
        string2 = (String)object.get("utm_medium");
        ((zzav)object2).zzu(string2);
        string2 = (String)object.get("utm_campaign");
        ((zzav)object2).zzv(string2);
        string2 = (String)object.get("utm_source");
        ((zzav)object2).zzw(string2);
        string2 = (String)object.get("utm_term");
        ((zzav)object2).zzt(string2);
        string2 = (String)object.get("utm_id");
        ((zzav)object2).zzs(string2);
        string2 = (String)object.get("anid");
        ((zzav)object2).zzo(string2);
        string2 = (String)object.get("gclid");
        ((zzav)object2).zzr(string2);
        string2 = (String)object.get("dclid");
        ((zzav)object2).zzq(string2);
        object = (String)object.get("aclid");
        ((zzav)object2).zzn((String)object);
        return object2;
    }

    public static String zzc(boolean bl2) {
        boolean bl3 = true;
        if (bl3 != bl2) {
            return "0";
        }
        return "1";
    }

    public static String zzd(Locale object) {
        String string2;
        boolean bl2;
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((Locale)object).getLanguage())))) {
            StringBuilder stringBuilder = new StringBuilder();
            string2 = string2.toLowerCase((Locale)object);
            stringBuilder.append(string2);
            string2 = ((Locale)object).getCountry();
            boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl3) {
                stringBuilder.append("-");
                string2 = ((Locale)object).getCountry();
                object = string2.toLowerCase((Locale)object);
                stringBuilder.append((String)object);
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public static MessageDigest zze(String string2) {
        int n3;
        string2 = "MD5";
        for (int i3 = 0; i3 < (n3 = 2); ++i3) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(string2);
                if (messageDigest == null) continue;
                return messageDigest;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
        }
        return null;
    }

    public static Map zzf(String stringArray) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string2 = "&";
        for (String string3 : stringArray.split(string2)) {
            String string4 = "=";
            int n3 = 3;
            String[] stringArray2 = string3.split(string4, n3);
            int n4 = stringArray2.length;
            String string5 = null;
            int n7 = 1;
            if (n4 > n7) {
                String string6 = stringArray2[0];
                String string7 = stringArray2[n7];
                boolean bl2 = TextUtils.isEmpty((CharSequence)string7);
                if (bl2) {
                    bl2 = false;
                    string7 = null;
                } else {
                    string7 = stringArray2[n7];
                }
                hashMap.put(string6, string7);
                if (n4 != n3 || (n4 = (int)(TextUtils.isEmpty((CharSequence)(string4 = stringArray2[n7])) ? 1 : 0)) != 0 || (n4 = (int)(hashMap.containsKey(string4 = stringArray2[n7]) ? 1 : 0)) != 0) continue;
                string4 = stringArray2[n7];
                n3 = 2;
                String string8 = stringArray2[n3];
                n7 = (int)(TextUtils.isEmpty((CharSequence)string8) ? 1 : 0);
                if (n7 == 0) {
                    string5 = stringArray2[n3];
                }
                hashMap.put(string4, string5);
                continue;
            }
            if (n4 != n7 || (n4 = (string4 = stringArray2[0]).length()) == 0) continue;
            String string9 = stringArray2[0];
            hashMap.put(string9, null);
        }
        return hashMap;
    }

    public static void zzg(Map map2, String string2, String string3) {
        boolean bl2;
        if (string3 != null && !(bl2 = map2.containsKey(string2))) {
            map2.put(string2, string3);
        }
    }

    public static void zzh(Map map2, String string2, Map object) {
        object = (String)object.get(string2);
        zzff.zzg(map2, string2, (String)object);
    }

    public static boolean zzi(Context context, String string2, boolean bl2) {
        block8: {
            block9: {
                PackageManager packageManager;
                try {
                    packageManager = context.getPackageManager();
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                ComponentName componentName = new ComponentName(context, string2);
                context = packageManager.getReceiverInfo(componentName, 0);
                if (context == null) break block8;
                boolean bl3 = context.enabled;
                if (!bl3) break block8;
                if (!bl2) break block9;
                boolean bl4 = context.exported;
                if (!bl4) break block8;
            }
            return true;
        }
        return false;
    }

    public static boolean zzj(double d2, String string2) {
        double d5;
        double d7 = 0.0;
        double d9 = d2 - d7;
        Object object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        if (object > 0 && (object = (d5 = d2 - (d7 = 100.0)) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) < 0) {
            double d12;
            double d13;
            int n3;
            object = TextUtils.isEmpty((CharSequence)string2);
            boolean bl2 = true;
            if (object == false) {
                n3 = 0;
                for (object = (Object)(string2.length() + -1); object >= 0; object += -1) {
                    int n4 = string2.charAt((int)object);
                    n3 <<= 6;
                    int n7 = -1 >>> 4;
                    n3 = (n3 & n7) + n4;
                    n4 <<= 14;
                    if ((n4 = 0xFE00000 & (n3 += n4)) == 0) continue;
                    n3 ^= (n4 >>= 21);
                }
            } else {
                n3 = 1;
            }
            if ((d13 = (d12 = (d7 = (double)(n3 %= 10000)) - (d2 *= d7)) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1)) >= 0) {
                return bl2;
            }
        }
        return false;
    }
}


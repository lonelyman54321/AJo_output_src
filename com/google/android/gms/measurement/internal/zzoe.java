/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjj$zza;
import java.util.HashMap;
import java.util.Map;

public final class zzoe {
    private static final String[] zza = new String[]{"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    private final Map zzb;

    private zzoe(Map map2) {
        HashMap hashMap;
        this.zzb = hashMap = new HashMap();
        hashMap.putAll(map2);
    }

    private static int zza(SharedPreferences sharedPreferences2, String string2) {
        int n3 = -1;
        try {
            return sharedPreferences2.getInt(string2, n3);
        }
        catch (ClassCastException classCastException) {
            return n3;
        }
    }

    public static zzoe zza(SharedPreferences object) {
        int n3;
        boolean bl2;
        String string2;
        int n4;
        int n7;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string3 = "\u0000";
        String string4 = zzoe.zzb(object, "IABTCF_VendorConsents");
        int n8 = string3.equals(string4);
        if (n8 == 0 && (n8 = string4.length()) > (n7 = 754)) {
            n4 = string4.charAt(n7);
            string4 = String.valueOf((char)n4);
            String string5 = "GoogleConsent";
            hashMap.put(string5, string4);
        }
        if ((n4 = zzoe.zza(object, string4 = "IABTCF_gdprApplies")) != (n8 = -1)) {
            string2 = "gdprApplies";
            string4 = String.valueOf(n4);
            hashMap.put(string2, string4);
        }
        if ((n4 = zzoe.zza(object, string4 = "IABTCF_EnableAdvertiserConsentMode")) != n8) {
            string2 = "EnableAdvertiserConsentMode";
            string4 = String.valueOf(n4);
            hashMap.put(string2, string4);
        }
        if ((n4 = zzoe.zza(object, string4 = "IABTCF_PolicyVersion")) != n8) {
            string2 = "PolicyVersion";
            string4 = String.valueOf(n4);
            hashMap.put(string2, string4);
        }
        if (!(bl2 = string3.equals(string4 = zzoe.zzb(object, "IABTCF_PurposeConsents")))) {
            string3 = "PurposeConsents";
            hashMap.put(string3, string4);
        }
        if ((n3 = zzoe.zza(object, string4 = "IABTCF_CmpSdkID")) != n8) {
            string4 = "CmpSdkID";
            object = String.valueOf(n3);
            hashMap.put(string4, (String)object);
        }
        object = new zzoe(hashMap);
        return object;
    }

    public static String zza(String object, boolean n3) {
        int n4;
        if (n3 != 0 && (n3 = ((String)object).length()) > (n4 = 4)) {
            String string2;
            int n7;
            block3: {
                object = ((String)object).toCharArray();
                n3 = 1;
                n7 = 1;
                while (true) {
                    char c2 = 64;
                    string2 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
                    if (n7 >= c2) break;
                    c2 = (char)object[n4];
                    char c3 = string2.charAt(n7);
                    if (c2 != c3) {
                        ++n7;
                        continue;
                    }
                    break block3;
                    break;
                }
                n7 = 0;
            }
            n3 |= n7;
            n3 = string2.charAt(n3);
            object[n4] = n3;
            object = String.valueOf((char[])object);
        }
        return object;
    }

    private static String zzb(SharedPreferences sharedPreferences2, String string2) {
        String string3 = "\u0000";
        try {
            return sharedPreferences2.getString(string2, string3);
        }
        catch (ClassCastException classCastException) {
            return string3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int zzd() {
        String string2;
        Object object;
        int n3 = -1;
        try {
            object = this.zzb;
            string2 = "CmpSdkID";
        }
        catch (NumberFormatException numberFormatException) {
            return n3;
        }
        object = object.get(string2);
        object = (String)object;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) return n3;
        return Integer.parseInt((String)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int zze() {
        String string2;
        Object object;
        int n3 = -1;
        try {
            object = this.zzb;
            string2 = "PolicyVersion";
        }
        catch (NumberFormatException numberFormatException) {
            return n3;
        }
        object = object.get(string2);
        object = (String)object;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) return n3;
        return Integer.parseInt((String)object);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzoe;
        if (!bl2) {
            return false;
        }
        object = (zzoe)object;
        String string2 = this.zzc();
        object = ((zzoe)object).zzc();
        return string2.equalsIgnoreCase((String)object);
    }

    public final int hashCode() {
        return this.zzc().hashCode();
    }

    public final String toString() {
        return this.zzc();
    }

    public final Bundle zza() {
        Object object = "1";
        Object object2 = this.zzb.get("GoogleConsent");
        boolean n3 = ((String)object).equals(object2);
        if (n3) {
            object2 = this.zzb;
            String string2 = "gdprApplies";
            boolean bl2 = ((String)object).equals(object2 = object2.get(string2));
            if (bl2) {
                object2 = this.zzb;
                string2 = "EnableAdvertiserConsentMode";
                boolean bl3 = ((String)object).equals(object2 = object2.get(string2));
                if (bl3) {
                    String string3;
                    int n4;
                    String string4;
                    int n7 = this.zze();
                    if (n7 < 0) {
                        return Bundle.EMPTY;
                    }
                    object = this.zzb;
                    string2 = "PurposeConsents";
                    boolean bl4 = TextUtils.isEmpty((CharSequence)(object = (String)object.get(string2)));
                    if (bl4) {
                        return Bundle.EMPTY;
                    }
                    string2 = new Bundle();
                    int n8 = ((String)object).length();
                    String string5 = "denied";
                    String string6 = "granted";
                    int n10 = 49;
                    if (n8 > 0) {
                        string4 = zzjj$zza.zza.zze;
                        n4 = ((String)object).charAt(0);
                        string3 = n4 == n10 ? string6 : string5;
                        string2.putString(string4, string3);
                    }
                    if ((n8 = ((String)object).length()) > (n4 = 3)) {
                        string4 = zzjj$zza.zzd.zze;
                        char c2 = ((String)object).charAt(2);
                        string3 = c2 == n10 && (n4 = (int)((String)object).charAt(n4)) == n10 ? string6 : string5;
                        string2.putString(string4, string3);
                    }
                    if ((n8 = ((String)object).length()) > (n4 = 6) && n7 >= (n8 = 4)) {
                        char c3;
                        object2 = zzjj$zza.zzc.zze;
                        n8 = ((String)object).charAt(0);
                        if (n8 == n10 && (c3 = ((String)object).charAt(n4)) == n10) {
                            string5 = string6;
                        }
                        string2.putString(object2, string5);
                    }
                    return string2;
                }
            }
        }
        return Bundle.EMPTY;
    }

    public final String zzb() {
        Object object;
        int n3;
        String string2 = "1";
        StringBuilder stringBuilder = new StringBuilder(string2);
        int n4 = this.zzd();
        int n7 = 63;
        String string3 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
        if (n4 >= 0 && n4 <= (n3 = 4095)) {
            n3 = n4 >> 6 & n7;
            n3 = string3.charAt(n3);
            stringBuilder.append((char)n3);
            n4 &= n7;
            n4 = string3.charAt(n4);
            stringBuilder.append((char)n4);
        } else {
            object = "00";
            stringBuilder.append((String)object);
        }
        n4 = this.zze();
        if (n4 >= 0 && n4 <= n7) {
            n4 = string3.charAt(n4);
            stringBuilder.append((char)n4);
        } else {
            object = "0";
            stringBuilder.append((String)object);
        }
        Preconditions.checkArgument(true);
        object = this.zzb;
        String string4 = "gdprApplies";
        object = object.get(string4);
        n4 = (int)(string2.equals(object) ? 1 : 0);
        if (n4 != 0) {
            n4 = 2;
        } else {
            n4 = 0;
            object = null;
        }
        n7 = n4 | 4;
        Map map2 = this.zzb;
        String string5 = "EnableAdvertiserConsentMode";
        map2 = map2.get(string5);
        char c2 = string2.equals(map2);
        if (c2 != '\u0000') {
            n7 = n4 | 0xC;
        }
        c2 = string3.charAt(n7);
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }

    public final String zzc() {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = zza;
        int n3 = stringArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = this.zzb;
            String string2 = stringArray[i3];
            int n4 = object.containsKey(string2);
            if (n4 == 0) continue;
            n4 = stringBuilder.length();
            if (n4 > 0) {
                object = ";";
                stringBuilder.append((String)object);
            }
            stringBuilder.append(string2);
            stringBuilder.append("=");
            object = this.zzb;
            string2 = (String)object.get(string2);
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzox;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class zzpr {
    private final String zza;

    public zzpr() {
        this.zza = "https://www.google-analytics.com";
    }

    private static final String zzb(String string2) {
        String string3;
        String string4;
        String string5 = "UTF-8";
        try {
            string5 = URLEncoder.encode(string2, string5);
            string4 = "\\+";
            string3 = "%20";
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            string2 = String.valueOf(string2);
            zzhi.zza("Cannot encode the string: ".concat(string2));
            return "";
        }
        return string5.replaceAll(string4, string3);
    }

    public final String zza(zzox object) {
        boolean bl2 = ((zzox)object).zzg();
        if (bl2) {
            object = ((zzox)object).zza();
        } else {
            String string2 = ((zzox)object).zze().trim();
            bl2 = string2.isEmpty();
            string2 = !bl2 ? ((zzox)object).zze().trim() : "-1";
            StringBuilder stringBuilder = new StringBuilder();
            String string3 = ((zzox)object).zzf();
            if (string3 != null) {
                string3 = ((zzox)object).zzf();
                stringBuilder.append(string3);
            } else {
                string3 = "id";
                stringBuilder.append(string3);
            }
            stringBuilder.append("=");
            string3 = zzpr.zzb(((zzox)object).zzb());
            stringBuilder.append(string3);
            string3 = "&pv=";
            stringBuilder.append(string3);
            string2 = zzpr.zzb(string2);
            stringBuilder.append(string2);
            string2 = "&rv=5.0";
            stringBuilder.append(string2);
            boolean bl3 = ((zzox)object).zzg();
            if (bl3) {
                object = "&gtm_debug=x";
                stringBuilder.append((String)object);
            }
            object = stringBuilder.toString();
        }
        return n1.a(this.zza, "/gtm/android?", (String)object);
    }
}


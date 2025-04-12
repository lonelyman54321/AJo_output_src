/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class zzmu
extends zzjo {
    /*
     * Enabled aggressive block sorting
     */
    public static String zzb(String object, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        Charset charset = Charset.forName("UTF-8");
        int n3 = 0;
        byte[] byArray = null;
        int n4;
        while (n3 < (n4 = ((String)object).length())) {
            int n7;
            n4 = ((String)object).charAt(n3);
            int n8 = string2.indexOf(n4);
            if (n8 != (n7 = -1)) {
                stringBuilder.append((char)n4);
                ++n3;
                continue;
            }
            if ((n4 = (int)(Character.isHighSurrogate((char)n4) ? 1 : 0)) != 0) {
                n4 = n3 + 1;
                n8 = ((String)object).length();
                if (n4 >= n8) {
                    object = new UnsupportedEncodingException();
                    throw object;
                }
                if ((n4 = (int)(Character.isLowSurrogate(((String)object).charAt(n4)) ? 1 : 0)) == 0) {
                    object = new UnsupportedEncodingException();
                    throw object;
                }
                n4 = 2;
            } else {
                n4 = 1;
            }
            byArray = ((String)object).substring(n3, n4 += n3).getBytes(charset);
            for (n8 = 0; n8 < (n7 = byArray.length); ++n8) {
                String string3 = "%";
                stringBuilder.append(string3);
                n7 = byArray[n8] >> 4 & 0xF;
                int n10 = 16;
                n7 = Character.toUpperCase(Character.forDigit(n7, n10));
                stringBuilder.append((char)n7);
                n7 = Character.toUpperCase(Character.forDigit(byArray[n8] & 0xF, n10));
                stringBuilder.append((char)n7);
            }
            n3 = n4;
        }
        return stringBuilder.toString().replaceAll(" ", "%20");
    }

    public final zzqo zza(zzhx object, zzqo ... object2) {
        Preconditions.checkArgument(true);
        int n3 = ((zzqo[])object2).length;
        if (n3 > 0) {
            n3 = 0;
            object = (zzqo)Preconditions.checkNotNull(object2[0]);
        } else {
            object = zzqs.zze;
        }
        object = zzjn.zzd((zzqo)object);
        String string2 = "#;/?:@&=+$,abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_.!~*'()0123456789";
        try {
            object = zzmu.zzb((String)object, string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return zzqs.zze;
        }
        object2 = new zzqz((String)object);
        return object2;
    }
}


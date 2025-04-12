/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfk;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzia {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long zza(String charSequence, String string2) {
        String string3;
        String string4;
        long l2;
        String string5;
        block7: {
            long l3;
            Object object;
            String string6;
            string5 = "Inconsistent headers [";
            int n3 = TextUtils.isEmpty((CharSequence)charSequence);
            l2 = -1;
            string4 = "HttpUtil";
            string3 = "]";
            if (n3 == 0) {
                try {
                    l2 = Long.parseLong((String)charSequence);
                }
                catch (NumberFormatException numberFormatException) {
                    string6 = "Unexpected Content-Length [";
                    object = new StringBuilder(string6);
                    ((StringBuilder)object).append((String)charSequence);
                    ((StringBuilder)object).append(string3);
                    object = ((StringBuilder)object).toString();
                    zzfk.zzc(string4, (String)object);
                }
            }
            if ((n3 = TextUtils.isEmpty((CharSequence)string2)) != 0) return l2;
            object = zza.matcher(string2);
            int n4 = ((Matcher)object).matches();
            if (n4 == 0) return l2;
            n4 = 2;
            try {
                string6 = ((Matcher)object).group(n4);
                if (string6 == null) throw null;
                l3 = Long.parseLong(string6);
                n4 = 1;
                if ((object = ((Matcher)object).group(n4)) == null) throw null;
                long l4 = Long.parseLong((String)object);
                l3 -= l4;
                long l7 = l2 - 0L;
                n3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                l4 = 1L;
                l3 += l4;
                if (n3 < 0) {
                    return l3;
                }
            }
            catch (NumberFormatException numberFormatException) {
                break block7;
            }
            n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n3 == 0) return l2;
            {
                object = new StringBuilder(string5);
                ((StringBuilder)object).append((String)charSequence);
                charSequence = "] [";
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(string3);
                charSequence = ((StringBuilder)object).toString();
                zzfk.zzf(string4, (String)charSequence);
                return Math.max(l2, l3);
            }
        }
        string5 = "Unexpected Content-Range [";
        charSequence = new StringBuilder(string5);
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(string3);
        charSequence = ((StringBuilder)charSequence).toString();
        zzfk.zzc(string4, (String)charSequence);
        return l2;
    }

    public static long zzb(String object) {
        Pattern pattern;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && (bl2 = ((Matcher)(object = (pattern = zzb).matcher((CharSequence)object))).matches())) {
            object = ((Matcher)object).group(1);
            object.getClass();
            return Long.parseLong((String)object);
        }
        return -1;
    }
}


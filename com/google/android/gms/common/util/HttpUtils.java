/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util;

import com.google.android.gms.internal.common.zzaa;
import com.google.android.gms.internal.common.zzr;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class HttpUtils {
    private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    public static Map parse(URI object, String string2) {
        char c2;
        HashMap<String, Object> hashMap = Collections.emptyMap();
        if ((object = ((URI)object).getRawQuery()) != null && (c2 = ((String)object).length()) > '\u0000') {
            hashMap = new HashMap<String, Object>();
            c2 = '=';
            zzaa zzaa2 = zzaa.zzc(zzr.zzb(c2));
            char c3 = '&';
            Object object2 = zzaa.zzc(zzr.zzb(c3)).zzb();
            object = ((zzaa)object2).zzd((CharSequence)object).iterator();
            while ((c3 = (char)(object.hasNext() ? 1 : 0)) != '\u0000') {
                int n3;
                object2 = (String)object.next();
                int n4 = (object2 = zzaa2.zzf((CharSequence)object2)).isEmpty();
                if (n4 == 0 && (n4 = object2.size()) <= (n3 = 2)) {
                    n4 = 0;
                    String string3 = HttpUtils.zza((String)object2.get(0), string2);
                    int n7 = object2.size();
                    if (n7 == n3) {
                        n3 = 1;
                        object2 = HttpUtils.zza((String)object2.get(n3), string2);
                    } else {
                        c3 = '\u0000';
                        object2 = null;
                    }
                    hashMap.put(string3, object2);
                    continue;
                }
                object = new IllegalArgumentException("bad parameter");
                throw object;
            }
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String zza(String string2, String object) {
        if (object == null) {
            object = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(string2, (String)object);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {}
        object = new IllegalArgumentException(unsupportedEncodingException);
        throw object;
    }
}


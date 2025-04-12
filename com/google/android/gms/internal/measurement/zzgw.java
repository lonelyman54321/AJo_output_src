/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

public final class zzgw {
    public static final Uri zza = Uri.parse((String)"content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse((String)"content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc;
    public static final Pattern zzd;

    static {
        int n3 = 2;
        zzc = Pattern.compile("^(1|true|t|on|yes|y)$", n3);
        zzd = Pattern.compile("^(0|false|f|off|no|n)$", n3);
    }
}


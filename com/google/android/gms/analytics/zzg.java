/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 *  android.util.LogPrinter
 */
package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.google.android.gms.analytics.zzf;
import com.google.android.gms.analytics.zzh;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.analytics.zzt;
import java.util.ArrayList;
import java.util.Collections;

public final class zzg
implements zzt {
    private static final Uri zza;
    private final LogPrinter zzb;

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        zza = builder.build();
    }

    public zzg() {
        LogPrinter logPrinter;
        this.zzb = logPrinter = new LogPrinter(4, "GA/LogCatTransport");
    }

    public final Uri zzb() {
        return zza;
    }

    public final void zze(zzh object) {
        object = ((zzh)object).zze();
        LogPrinter logPrinter = new ArrayList(object);
        object = new zzf(this);
        Collections.sort(logPrinter, object);
        object = new StringBuilder();
        int n3 = logPrinter.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = ((zzj)logPrinter.get(i3)).toString();
            int n4 = TextUtils.isEmpty((CharSequence)string2);
            if (n4 != 0) continue;
            n4 = ((StringBuilder)object).length();
            if (n4 != 0) {
                String string3 = ", ";
                ((StringBuilder)object).append(string3);
            }
            ((StringBuilder)object).append(string2);
        }
        logPrinter = this.zzb;
        object = ((StringBuilder)object).toString();
        logPrinter.println((String)object);
    }
}


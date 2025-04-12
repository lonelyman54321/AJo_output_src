/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.Logger;
import com.google.android.gms.internal.gtm.zzhi;

final class zzjh
implements Logger {
    public final void error(Exception exception) {
        zzhi.zzb("", exception);
    }

    public final void error(String string2) {
        zzhi.zza(string2);
    }

    public final int getLogLevel() {
        return 3;
    }

    public final void info(String string2) {
        zzhi.zzc(string2);
    }

    public final void setLogLevel(int n3) {
        zzhi.zze("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    public final void verbose(String string2) {
        zzhi.zzd(string2);
    }

    public final void warn(String string2) {
        zzhi.zze(string2);
    }
}


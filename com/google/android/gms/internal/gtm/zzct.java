/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.Logger;
import com.google.android.gms.internal.gtm.zzeg;
import com.google.android.gms.internal.gtm.zzeh;

final class zzct
implements Logger {
    private int zza = 2;
    private boolean zzb;

    public final void error(Exception exception) {
    }

    public final void error(String string2) {
    }

    public final int getLogLevel() {
        return this.zza;
    }

    public final void info(String string2) {
    }

    public final void setLogLevel(int n3) {
        this.zza = n3;
        n3 = (int)(this.zzb ? 1 : 0);
        if (n3 == 0) {
            Object object = zzeh.zzb;
            String cfr_ignored_0 = (String)((zzeg)object).zzb();
            object = (String)((zzeg)object).zzb();
            n3 = 1;
            this.zzb = n3;
        }
    }

    public final void verbose(String string2) {
    }

    public final void warn(String string2) {
    }
}


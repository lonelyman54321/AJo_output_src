/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.Logger;
import com.google.android.gms.tagmanager.zzdc;

final class zzfl
implements Logger {
    public final void error(Exception exception) {
    }

    public final void error(String string2) {
    }

    public final int getLogLevel() {
        int n3 = zzdc.zza;
        int n4 = 2;
        if (n3 != n4) {
            int n7;
            int n8 = 3;
            if (n3 != n8 && n3 != (n7 = 4)) {
                n7 = 5;
                if (n3 != n7) {
                    return n8;
                }
                return n4;
            }
            return 1;
        }
        return 0;
    }

    public final void info(String string2) {
        zzdc.zzb.zzb(string2);
    }

    public final void setLogLevel(int n3) {
    }

    public final void verbose(String string2) {
        zzdc.zzb.zzd(string2);
    }

    public final void warn(String string2) {
    }
}


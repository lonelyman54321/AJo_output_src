/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzdag;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfim;

public final class zzcpt
implements zzdag {
    private final zzfim zza;

    public zzcpt(zzfim zzfim2) {
        this.zza = zzfim2;
    }

    public final void zzdj(Context object) {
        try {
            object = this.zza;
        }
        catch (zzfhv zzfhv2) {
            zzm.zzk("Cannot invoke onDestroy for the mediation adapter.", zzfhv2);
            return;
        }
        ((zzfim)object).zzg();
    }

    public final void zzdl(Context object) {
        try {
            object = this.zza;
        }
        catch (zzfhv zzfhv2) {
            zzm.zzk("Cannot invoke onPause for the mediation adapter.", zzfhv2);
            return;
        }
        ((zzfim)object).zzt();
    }

    public final void zzdm(Context context) {
        zzfhv zzfhv22;
        block6: {
            block5: {
                zzfim zzfim2;
                try {
                    zzfim2 = this.zza;
                }
                catch (zzfhv zzfhv22) {}
                zzfim2.zzu();
                if (context == null) break block5;
                zzfim2 = this.zza;
                zzfim2.zzs(context);
                return;
                break block6;
            }
            return;
        }
        zzm.zzk("Cannot invoke onResume for the mediation adapter.", zzfhv22);
    }
}


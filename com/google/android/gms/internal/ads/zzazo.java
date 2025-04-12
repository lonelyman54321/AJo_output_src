/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzazo
extends zzazs {
    public zzazo(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "5HcA415u1KU8m2yVlDZBhQQK+0IFNRmmWPxuAq0DnfPzSdJ/uWlnYMD1kKfkH6cZ", "u7Ufq5yuXkEXg69T8jpWuOOX55Q9g2DSVI1gtbNUvY8=", zzatp2, n3, 48);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zze;
        Object object2 = zzavc.zzc;
        ((zzatp)object).zzaa((zzavc)object2);
        object = this.zzf;
        object2 = this.zzb.zzb();
        int n3 = 1;
        Object object3 = new Object[n3];
        object3[0] = object2;
        object = (Boolean)((Method)object).invoke(null, object3);
        boolean bl2 = (Boolean)object;
        object2 = this.zze;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    if (bl2) {
                        try {
                            object = this.zze;
                            object3 = zzavc.zzb;
                            ((zzatp)object).zzaa((zzavc)object3);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = this.zze;
                    object3 = zzavc.zza;
                    ((zzatp)object).zzaa((zzavc)object3);
                }
                return;
            }
            throw throwable2;
        }
    }
}


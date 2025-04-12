/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzaza
extends zzazs {
    private static volatile Long zzi;
    private static final Object zzj;

    static {
        Object object;
        zzj = object = new Object();
    }

    public zzaza(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "tnRfJM39LV6MDlXml8e8fAfi5JhKcsRyFSmagsP97rbE/0XgA5fRVLlLbAYUcu57", "TvLSh+Eka5RyCXMK4IvAvP4vfksx/KqJwxjzSKu7qQs=", zzatp2, n3, 22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Long l2;
        Object object;
        Object object2;
        block8: {
            object2 = zzi;
            if (object2 == null) {
                object2 = zzj;
                synchronized (object2) {
                    Throwable throwable2;
                    block7: {
                        block6: {
                            try {
                                object = zzi;
                                if (object != null) break block6;
                                object = this.zzf;
                                l2 = null;
                                object = ((Method)object).invoke(null, null);
                                zzi = object = (Long)object;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        break block8;
                    }
                    throw throwable2;
                }
            }
        }
        object2 = this.zze;
        synchronized (object2) {
            object = this.zze;
            l2 = zzi;
            long l3 = l2;
            ((zzatp)object).zzB(l3);
            return;
        }
    }
}


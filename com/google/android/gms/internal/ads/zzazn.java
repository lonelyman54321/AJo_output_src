/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzazn
extends zzazs {
    private static volatile Long zzi;
    private static final Object zzj;

    static {
        Object object;
        zzj = object = new Object();
    }

    public zzazn(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "5kY1EQ+6snGNdZX1BEywItRy0EAwZ4DbRiPucqHAgfZR8kr75HzXIMEIf0cE9z11", "NtWyZSC7qBNyKPaXbOjRpNaZGUUAwpDpvYkB4v1ZH9M=", zzatp2, n3, 33);
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
            ((zzatp)object).zzac(l3);
            return;
        }
    }
}


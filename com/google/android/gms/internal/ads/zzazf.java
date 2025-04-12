/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzazf
extends zzazs {
    private static volatile String zzi;
    private static final Object zzj;

    static {
        Object object;
        zzj = object = new Object();
    }

    public zzazf(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "+pOuZc4XP/KXmz3ZcR0Th/zrptiqFMKeADXdr6ffDtBODTAlpCvFIUU/DK0sXoAh", "l4qa5EABhdRHJHltXD4U8dy0wNZl4oyoZ9TbFONnMI4=", zzatp2, n3, 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        String string2;
        Object object;
        Object object2;
        block8: {
            object2 = this.zze;
            object = "E";
            ((zzatp)object2).zzG((String)object);
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
                                string2 = null;
                                object = ((Method)object).invoke(null, null);
                                zzi = object = (String)object;
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
            string2 = zzi;
            ((zzatp)object).zzG(string2);
            return;
        }
    }
}


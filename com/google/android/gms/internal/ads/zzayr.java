/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzavo;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzazt;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

public final class zzayr
extends zzazs {
    private static final zzazt zzi;
    private final Context zzj;

    static {
        zzazt zzazt2;
        zzi = zzazt2 = new zzazt();
    }

    public zzayr(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, Context context) {
        super(zzaye2, "LYoHKR17UvbUNibqKPKJklawQJNaw1zk7CnhZAC68YBTzC7x4MYQVXp9Sihs98Ok", "ngqbGKXcQCvq0ft27xRzOzNoEVN+ei+Vq2+CNx9QQMc=", zzatp2, n3, 29);
        this.zzj = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        zzatp zzatp2;
        Object object;
        Object object2;
        boolean bl2;
        block8: {
            bl2 = true;
            this.zze.zzo("E");
            object2 = this.zzj;
            object = zzi;
            object2 = object2.getPackageName();
            object2 = ((zzazt)object).zza((String)object2);
            object = ((AtomicReference)object2).get();
            if (object == null) {
                synchronized (object2) {
                    Throwable throwable2;
                    block7: {
                        block6: {
                            try {
                                object = ((AtomicReference)object2).get();
                                if (object != null) break block6;
                                object = this.zzf;
                                zzatp2 = this.zzj;
                                Object[] objectArray = new Object[bl2];
                                objectArray[0] = zzatp2;
                                zzatp2 = null;
                                object = ((Method)object).invoke(null, objectArray);
                                object = (String)object;
                                ((AtomicReference)object2).set(object);
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
        object2 = (String)((AtomicReference)object2).get();
        object = this.zze;
        synchronized (object) {
            zzatp2 = this.zze;
            object2 = ((String)object2).getBytes();
            String string2 = zzavo.zza((byte[])object2, bl2);
            zzatp2.zzo(string2);
            return;
        }
    }
}


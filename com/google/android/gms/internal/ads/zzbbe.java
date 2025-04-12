/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbbg;
import java.util.Iterator;

final class zzbbe
implements Runnable {
    final /* synthetic */ zzbbf zza;

    public zzbbe(zzbbf zzbbf2) {
        this.zza = zzbbf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = zzbbf.zzc(this.zza);
        synchronized (object) {
            block8: {
                boolean bl2;
                Throwable throwable2;
                Iterator iterator;
                block7: {
                    block6: {
                        try {
                            iterator = this.zza;
                            boolean bl3 = zzbbf.zzi((zzbbf)((Object)iterator));
                            if (!bl3 || !(bl3 = zzbbf.zzj((zzbbf)((Object)iterator)))) break block6;
                            bl3 = false;
                            zzbbf.zze((zzbbf)((Object)iterator), false);
                            iterator = "App went background";
                            zzm.zze((String)((Object)iterator));
                            iterator = this.zza;
                            iterator = zzbbf.zzd((zzbbf)((Object)iterator));
                            iterator = iterator.iterator();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    iterator = "App is still foreground";
                    zzm.zze((String)((Object)iterator));
                    break block8;
                }
                throw throwable2;
                while (bl2 = iterator.hasNext()) {
                    Object object2 = iterator.next();
                    object2 = (zzbbg)object2;
                    try {
                        object2.zza(false);
                    }
                    catch (Exception exception) {
                        String string2 = "";
                        zzm.zzh(string2, exception);
                    }
                }
            }
            return;
        }
    }
}


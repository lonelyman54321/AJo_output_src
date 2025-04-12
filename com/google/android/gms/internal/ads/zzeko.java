/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekp;
import com.google.android.gms.internal.ads.zzekq;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzgfp;

final class zzeko
implements zzgfp {
    final /* synthetic */ zzfgt zza;
    final /* synthetic */ zzekp zzb;

    public zzeko(zzekp zzekp2, zzfgt zzfgt2) {
        this.zza = zzfgt2;
        this.zzb = zzekp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Throwable object) {
        zzekp zzekp2 = this.zzb;
        synchronized (zzekp2) {
            Throwable throwable2;
            block7: {
                block6: {
                    Object object2;
                    block5: {
                        try {
                            object2 = this.zzb;
                            object2 = zzekp.zza((zzekp)object2);
                            zzfgt zzfgt2 = this.zza;
                            ((zzekq)object2).zzb((Throwable)object, zzfgt2);
                            object = this.zzb;
                            object = zzekp.zza((zzekp)object);
                            object2 = this.zza;
                            boolean bl2 = ((zzfgt)object2).zzaw;
                            if (!bl2) break block5;
                            for (object = ((zzekq)object).zza(); object != null; object = ((zzekq)object).zza()) {
                                object2 = this.zzb;
                                zzekp.zzc((zzekp)object2, (zzfgt)object);
                                object = this.zzb;
                                object = zzekp.zza((zzekp)object);
                            }
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    if (object != null) {
                        object2 = this.zzb;
                        zzekp.zzc((zzekp)object2, (zzfgt)object);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}


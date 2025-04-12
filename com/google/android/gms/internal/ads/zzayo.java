/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import java.lang.reflect.Method;

public final class zzayo
extends zzazs {
    private final Activity zzi;
    private final View zzj;

    public zzayo(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, View view, Activity activity) {
        super(zzaye2, "GC4CZUnPsyUcm5NrWw7C8gSktjb/gtBCDrSKBLlqImuOnQy7zHyo6XlIzkH3EMVH", "Kx8fghNUQq+sA+EfmK6qh0KjuKvw753ECuaCFV8szVM=", zzatp2, n3, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        int n3 = 2;
        int n4 = 1;
        Object object = null;
        Object object2 = this.zzj;
        if (object2 == null) {
            return;
        }
        object2 = zzbep.zzcC;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        Object object3 = this.zzf;
        Object object4 = this.zzj;
        Activity activity = this.zzi;
        int n7 = 3;
        Object[] objectArray = new Object[n7];
        objectArray[0] = object4;
        objectArray[n4] = activity;
        objectArray[n3] = object2;
        object2 = (Object[])((Method)object3).invoke(null, objectArray);
        object3 = this.zze;
        synchronized (object3) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object4 = this.zze;
                        object = object2[0];
                        object = (Long)object;
                        long l2 = (Long)object;
                        ((zzatp)object4).zzc(l2);
                        object = this.zze;
                        Object object5 = object2[n4];
                        object5 = (Long)object5;
                        long l3 = (Long)object5;
                        ((zzatp)object).zze(l3);
                        if (!bl2) break block4;
                        object5 = this.zze;
                        Object object6 = object2[n3];
                        object6 = (String)object6;
                        ((zzatp)object5).zzd((String)object6);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}


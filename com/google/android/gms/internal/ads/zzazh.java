/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzazh
extends zzazs {
    public zzazh(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "0njjbCFUq6vJ1UgnErUI7KEtLgZLN7V9IJ5yZ3QtzXmjMaTjzKInpeDNakYTgh0P", "C8NIMy/t/HZjKrbJt0Xe/Cv+czK1jvEhHHQsIVfXSJE=", zzatp2, n3, 73);
    }

    public final void zza() {
        Object object;
        Object object2;
        block14: {
            block13: {
                try {
                    object2 = this.zzf;
                }
                catch (InvocationTargetException invocationTargetException) {
                    object2 = this.zze;
                    object = zzavc.zzc;
                    ((zzatp)object2).zzI((zzavc)object);
                    return;
                }
                object = this.zzb;
                object = ((zzaye)object).zzb();
                int n3 = 1;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                object = null;
                object2 = ((Method)object2).invoke(null, objectArray);
                object2 = (Boolean)object2;
                boolean bl2 = (Boolean)object2;
                object = this.zze;
                if (!bl2) break block13;
                object2 = zzavc.zzb;
                break block14;
            }
            object2 = zzavc.zza;
        }
        ((zzatp)object).zzI((zzavc)object2);
    }
}


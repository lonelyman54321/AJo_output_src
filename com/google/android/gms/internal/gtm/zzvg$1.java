/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dalvik.system.VMStack
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzuh;
import com.google.android.gms.internal.gtm.zzvb;
import com.google.android.gms.internal.gtm.zzvg;
import com.google.android.gms.internal.gtm.zzwd;
import dalvik.system.VMStack;

class zzvg$1
extends zzvb {
    public zzuh zza(Class clazz, int n3) {
        return zzuh.zza;
    }

    public String zzb(Class serializable) {
        int n3;
        block7: {
            n3 = (int)(zzvg.zzs() ? 1 : 0);
            if (n3 != 0) {
                Class clazz;
                try {
                    clazz = zzvg.zzp();
                }
                catch (Throwable throwable) {}
                n3 = serializable.equals(clazz);
                if (n3 == 0) break block7;
                clazz = VMStack.getStackClass2();
                return clazz.getName();
            }
        }
        if ((n3 = zzvg.zzr()) != 0 && (serializable = zzwd.zza((Class)serializable, n3 = 1)) != null) {
            return ((StackTraceElement)serializable).getClassName();
        }
        return null;
    }
}


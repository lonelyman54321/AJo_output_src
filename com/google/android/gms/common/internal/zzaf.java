/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.internal.common.zzb;

public abstract class zzaf
extends zzb
implements zzag {
    public static zzag zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        boolean bl2 = iInterface instanceof zzag;
        if (bl2) {
            return (zzag)iInterface;
        }
        iInterface = new zzae(iBinder);
        return iInterface;
    }
}


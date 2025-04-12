/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.appupdate.internal.zzb;
import com.google.android.play.core.appupdate.internal.zzd;
import com.google.android.play.core.appupdate.internal.zzf;

public abstract class zze
extends zzb
implements zzf {
    public static zzf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        boolean bl2 = iInterface instanceof zzf;
        if (bl2) {
            return (zzf)iInterface;
        }
        iInterface = new zzd(iBinder);
        return iInterface;
    }
}


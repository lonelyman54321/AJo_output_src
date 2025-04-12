/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.splitinstall.internal.zzbm;
import com.google.android.play.core.splitinstall.internal.zzbo;
import com.google.android.play.core.splitinstall.internal.zzl;

public abstract class zzbn
extends zzl
implements zzbo {
    public static zzbo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        boolean bl2 = iInterface instanceof zzbo;
        if (bl2) {
            return (zzbo)iInterface;
        }
        iInterface = new zzbm(iBinder);
        return iInterface;
    }
}


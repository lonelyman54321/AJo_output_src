/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.zzk;

public interface IGmsCallbacks
extends IInterface {
    public void onPostInitComplete(int var1, IBinder var2, Bundle var3);

    public void zzb(int var1, Bundle var2);

    public void zzc(int var1, IBinder var2, zzk var3);
}


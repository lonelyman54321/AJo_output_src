/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 */
package com.google.android.gms.internal.auth;

import android.os.IInterface;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.api.Status;

public interface zzat
extends IInterface {
    public void zzb(byte[] var1);

    public void zzc(DeviceMetaData var1);

    public void zzd(Status var1);

    public void zze();

    public void zzf(Status var1, zzw var2);

    public void zzg(Status var1, zzo var2);

    public void zzh(Status var1);
}


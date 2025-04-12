/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IInterface
 *  android.os.ParcelFileDescriptor
 */
package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.internal.plus.zzr;

public interface zzb
extends IInterface {
    public void zza(int var1, Bundle var2);

    public void zza(int var1, Bundle var2, Bundle var3);

    public void zza(int var1, Bundle var2, ParcelFileDescriptor var3);

    public void zza(int var1, Bundle var2, SafeParcelResponse var3);

    public void zza(int var1, zzr var2);

    public void zza(Status var1);

    public void zza(DataHolder var1, String var2);

    public void zza(DataHolder var1, String var2, String var3);

    public void zzb(String var1);

    public void zzc(String var1);
}


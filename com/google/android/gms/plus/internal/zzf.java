/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 */
package com.google.android.gms.plus.internal;

import android.os.IInterface;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.plus.internal.zzb;
import java.util.List;

public interface zzf
extends IInterface {
    public String getAccountName();

    public ICancelToken zza(zzb var1, int var2, int var3, int var4, String var5);

    public void zza();

    public void zza(zzb var1);

    public void zza(zzb var1, List var2);
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 */
package com.google.android.gms.vision.face.internal.client;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.face.internal.client.FaceParcel;

public interface zzh
extends IInterface {
    public void zza();

    public boolean zza(int var1);

    public FaceParcel[] zza(IObjectWrapper var1, IObjectWrapper var2, IObjectWrapper var3, int var4, int var5, int var6, int var7, int var8, int var9, zzs var10);

    public FaceParcel[] zza(IObjectWrapper var1, zzs var2);
}


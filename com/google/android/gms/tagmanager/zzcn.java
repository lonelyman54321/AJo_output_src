/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.IInterface
 */
package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzck;

public interface zzcn
extends IInterface {
    public void initialize(IObjectWrapper var1, zzck var2, zzcb var3);

    public void preview(Intent var1, IObjectWrapper var2);

    public void previewIntent(Intent var1, IObjectWrapper var2, IObjectWrapper var3, zzck var4, zzcb var5);
}


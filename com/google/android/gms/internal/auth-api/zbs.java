/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 */
package com.google.android.gms.internal.auth-api;

import android.os.IInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public interface zbs
extends IInterface {
    public void zbb(Status var1, Credential var2);

    public void zbc(Status var1);

    public void zbd(Status var1, String var2);
}


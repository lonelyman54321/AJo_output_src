/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public interface zaca {
    public ConnectionResult zab();

    public ConnectionResult zac(long var1, TimeUnit var3);

    public ConnectionResult zad(Api var1);

    public BaseImplementation$ApiMethodImpl zae(BaseImplementation$ApiMethodImpl var1);

    public BaseImplementation$ApiMethodImpl zaf(BaseImplementation$ApiMethodImpl var1);

    public void zaq();

    public void zar();

    public void zas(String var1, FileDescriptor var2, PrintWriter var3, String[] var4);

    public void zat();

    public void zau();

    public boolean zaw();

    public boolean zax();

    public boolean zay(SignInConnectionListener var1);
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.common.zzv;
import com.google.android.gms.common.zzw;
import java.util.concurrent.Callable;

final class zzu
extends zzw {
    private final Callable zze;

    public /* synthetic */ zzu(Callable callable, zzv zzv2) {
        super(false, 1, 5, null, null, null);
        this.zze = callable;
    }

    public final String zza() {
        Callable callable;
        try {
            callable = this.zze;
        }
        catch (Exception exception) {
            RuntimeException runtimeException = new RuntimeException(exception);
            throw runtimeException;
        }
        callable = callable.call();
        return (String)((Object)callable);
    }
}


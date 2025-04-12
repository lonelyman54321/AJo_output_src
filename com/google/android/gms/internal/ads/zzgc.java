/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

public final class zzgc
implements ThreadFactory {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzgc(String string2) {
        this.zza = string2;
    }

    public final Thread newThread(Runnable runnable2) {
        String string2 = this.zza;
        Thread thread2 = new Thread(runnable2, string2);
        return thread2;
    }
}


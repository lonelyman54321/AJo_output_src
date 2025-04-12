/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zzg
implements Callable {
    private final /* synthetic */ SharedPreferences zzo;
    private final /* synthetic */ String zzp;
    private final /* synthetic */ Long zzs;

    public zzg(SharedPreferences sharedPreferences2, String string2, Long l2) {
        this.zzo = sharedPreferences2;
        this.zzp = string2;
        this.zzs = l2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences2 = this.zzo;
        String string2 = this.zzp;
        long l2 = this.zzs;
        return sharedPreferences2.getLong(string2, l2);
    }
}


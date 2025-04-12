/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zze
implements Callable {
    private final /* synthetic */ SharedPreferences zzo;
    private final /* synthetic */ String zzp;
    private final /* synthetic */ Integer zzr;

    public zze(SharedPreferences sharedPreferences2, String string2, Integer n3) {
        this.zzo = sharedPreferences2;
        this.zzp = string2;
        this.zzr = n3;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences2 = this.zzo;
        String string2 = this.zzp;
        int n3 = this.zzr;
        return sharedPreferences2.getInt(string2, n3);
    }
}


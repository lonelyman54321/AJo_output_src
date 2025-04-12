/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zzi
implements Callable {
    private final /* synthetic */ SharedPreferences zzo;
    private final /* synthetic */ String zzp;
    private final /* synthetic */ String zzt;

    public zzi(SharedPreferences sharedPreferences2, String string2, String string3) {
        this.zzo = sharedPreferences2;
        this.zzp = string2;
        this.zzt = string3;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences2 = this.zzo;
        String string2 = this.zzp;
        String string3 = this.zzt;
        return sharedPreferences2.getString(string2, string3);
    }
}


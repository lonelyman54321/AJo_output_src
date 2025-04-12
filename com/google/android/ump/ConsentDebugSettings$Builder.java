/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.ump;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.ump.ConsentDebugSettings;
import java.util.ArrayList;
import java.util.List;

public class ConsentDebugSettings$Builder {
    private final List zza;
    private final Context zzb;
    private int zzc;
    private boolean zzd;

    public ConsentDebugSettings$Builder(Context context) {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
        this.zzc = 0;
        this.zzb = context = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ int zza(ConsentDebugSettings$Builder consentDebugSettings$Builder) {
        return consentDebugSettings$Builder.zzc;
    }

    public ConsentDebugSettings$Builder addTestDeviceHashedId(String string2) {
        this.zza.add(string2);
        return this;
    }

    public ConsentDebugSettings build() {
        String string2;
        Object object;
        boolean bl2 = true;
        boolean bl3 = zzct.zza(bl2);
        if (!(bl3 || (bl3 = (object = this.zza).contains(string2 = zzcl.zza(this.zzb))) || (bl3 = this.zzd))) {
            bl2 = false;
        }
        object = new ConsentDebugSettings(bl2, this, null);
        return object;
    }

    public ConsentDebugSettings$Builder setDebugGeography(int n3) {
        this.zzc = n3;
        return this;
    }

    public ConsentDebugSettings$Builder setForceTesting(boolean bl2) {
        this.zzd = bl2;
        return this;
    }
}


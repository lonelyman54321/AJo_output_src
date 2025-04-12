/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

public abstract class AbstractAdRequestBuilder {
    protected final zzdw zza;

    public AbstractAdRequestBuilder() {
        zzdw zzdw2;
        this.zza = zzdw2 = new zzdw();
        zzdw2.zzt("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public AbstractAdRequestBuilder addCustomEventExtrasBundle(Class clazz, Bundle bundle) {
        this.zza.zzo(clazz, bundle);
        return this.self();
    }

    public AbstractAdRequestBuilder addKeyword(String string2) {
        this.zza.zzq(string2);
        return this.self();
    }

    public AbstractAdRequestBuilder addNetworkExtrasBundle(Class object, Bundle object2) {
        this.zza.zzr((Class)object, (Bundle)object2);
        Class<AdMobAdapter> clazz = AdMobAdapter.class;
        boolean bl2 = object.equals(clazz);
        if (bl2 && (bl2 = object2.getBoolean((String)(object = "_emulatorLiveAds")))) {
            object = this.zza;
            object2 = "B3EEABB8EE11C2BE770B684D95219ECB";
            ((zzdw)object).zzu((String)object2);
        }
        return this.self();
    }

    public abstract AbstractAdRequestBuilder self();

    public AbstractAdRequestBuilder setAdString(String string2) {
        this.zza.zzv(string2);
        return this.self();
    }

    public AbstractAdRequestBuilder setContentUrl(String string2) {
        Preconditions.checkNotNull(string2, "Content URL must be non-null.");
        String string3 = "Content URL must be non-empty.";
        Preconditions.checkNotEmpty(string2, string3);
        int n3 = string2.length();
        int n4 = 512;
        Integer n7 = n4;
        int n8 = string2.length();
        Integer n10 = n8;
        int n14 = 2;
        Object[] objectArray = new Object[n14];
        boolean bl2 = false;
        objectArray[0] = n7;
        int n15 = 1;
        objectArray[n15] = n10;
        if (n3 <= n4) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "Content URL must not exceed %d in length.  Provided length was %d.", objectArray);
        this.zza.zzw(string2);
        return this.self();
    }

    public AbstractAdRequestBuilder setHttpTimeoutMillis(int n3) {
        this.zza.zzx(n3);
        return this.self();
    }

    public AbstractAdRequestBuilder setNeighboringContentUrls(List list) {
        if (list == null) {
            zzm.zzj("neighboring content URLs list should not be null");
            return this.self();
        }
        this.zza.zzz(list);
        return this.self();
    }

    public AbstractAdRequestBuilder setRequestAgent(String string2) {
        this.zza.zzB(string2);
        return this.self();
    }

    public final AbstractAdRequestBuilder zza(String string2) {
        this.zza.zzt(string2);
        return this.self();
    }

    public final AbstractAdRequestBuilder zzb(boolean bl2) {
        this.zza.zzy(bl2);
        return this.self();
    }

    public final AbstractAdRequestBuilder zzc(boolean bl2) {
        this.zza.zzC(bl2);
        return this.self();
    }
}


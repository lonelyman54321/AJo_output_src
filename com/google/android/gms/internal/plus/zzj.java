/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.plus.zzk;
import com.google.android.gms.internal.plus.zzl;
import com.google.android.gms.internal.plus.zzm;
import com.google.android.gms.internal.plus.zzn;
import com.google.android.gms.internal.plus.zzo;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.model.people.Person;
import java.util.Collection;

public final class zzj
implements People {
    public final Person getCurrentPerson(GoogleApiClient googleApiClient) {
        return Plus.zza(googleApiClient, true).zzb();
    }

    public final PendingResult load(GoogleApiClient googleApiClient, Collection collection) {
        zzn zzn2 = new zzn(this, googleApiClient, collection);
        return googleApiClient.enqueue(zzn2);
    }

    public final PendingResult load(GoogleApiClient googleApiClient, String ... stringArray) {
        zzo zzo2 = new zzo(this, googleApiClient, stringArray);
        return googleApiClient.enqueue(zzo2);
    }

    public final PendingResult loadConnected(GoogleApiClient googleApiClient) {
        zzm zzm2 = new zzm(this, googleApiClient);
        return googleApiClient.enqueue(zzm2);
    }

    public final PendingResult loadVisible(GoogleApiClient googleApiClient, int n3, String string2) {
        zzk zzk2 = new zzk(this, googleApiClient, n3, string2);
        return googleApiClient.enqueue(zzk2);
    }

    public final PendingResult loadVisible(GoogleApiClient googleApiClient, String string2) {
        zzl zzl2 = new zzl(this, googleApiClient, string2);
        return googleApiClient.enqueue(zzl2);
    }
}


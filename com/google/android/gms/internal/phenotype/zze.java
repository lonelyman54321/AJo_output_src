/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
package com.google.android.gms.internal.phenotype;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.phenotype.zzb;
import com.google.android.gms.internal.phenotype.zzc;

public final class zze
extends GmsClient {
    public zze(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        super(context, looper, 51, clientSettings, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        boolean bl2 = iInterface instanceof zzb;
        if (bl2) {
            return (zzb)iInterface;
        }
        iInterface = new zzc(iBinder);
        return iInterface;
    }

    public final int getMinApkVersion() {
        return 11925000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.phenotype.service.START";
    }
}


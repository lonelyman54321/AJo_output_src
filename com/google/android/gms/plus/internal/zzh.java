/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.RemoteException
 */
package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.internal.plus.zzr;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zzf;
import com.google.android.gms.plus.internal.zzg;
import com.google.android.gms.plus.internal.zzj;
import com.google.android.gms.plus.internal.zzk;
import com.google.android.gms.plus.internal.zzn;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public final class zzh
extends GmsClient {
    private Person zzr;
    private final zzn zzs;

    public zzh(Context context, Looper looper, ClientSettings clientSettings, zzn zzn2, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        super(context, looper, 2, clientSettings, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
        this.zzs = zzn2;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        boolean bl2 = iInterface instanceof zzf;
        if (bl2) {
            return (zzf)iInterface;
        }
        iInterface = new zzg(iBinder);
        return iInterface;
    }

    public final String getAccountName() {
        IInterface iInterface;
        this.checkConnected();
        try {
            iInterface = this.getService();
        }
        catch (RemoteException remoteException) {
            IllegalStateException illegalStateException = new IllegalStateException(remoteException);
            throw illegalStateException;
        }
        iInterface = (zzf)iInterface;
        return iInterface.getAccountName();
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = this.zzs.zze();
        Object object = this.zzs.zzc();
        bundle.putStringArray("request_visible_actions", object);
        object = this.zzs.zzd();
        bundle.putString("auth_package", (String)object);
        return bundle;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.plus.service.START";
    }

    public final void onPostInitHandler(int n3, IBinder iBinder, Bundle bundle, int n4) {
        Object object;
        boolean bl2;
        if (n3 == 0 && bundle != null && (bl2 = bundle.containsKey((String)(object = "loaded_person")))) {
            this.zzr = object = com.google.android.gms.internal.plus.zzr.zza(bundle.getByteArray((String)object));
        }
        super.onPostInitHandler(n3, iBinder, bundle, n4);
    }

    public final boolean requiresSignIn() {
        int n3;
        Object object = this.getClientSettings();
        Api api = Plus.API;
        object = ((ClientSettings)object).getApplicableScopes(api);
        api = null;
        if (object != null && !(n3 = object.isEmpty())) {
            String string2;
            Scope scope;
            boolean bl2;
            int n4;
            n3 = object.size();
            if (n3 == (n4 = 1) && (bl2 = object.contains(scope = new Scope(string2 = "plus_one_placeholder_scope")))) {
                return false;
            }
            return n4 != 0;
        }
        return false;
    }

    public final ICancelToken zza(BaseImplementation$ResultHolder object, int n3, String string2) {
        Object object2;
        this.checkConnected();
        zzj zzj2 = new zzj((BaseImplementation$ResultHolder)object);
        try {
            object2 = object = this.getService();
        }
        catch (RemoteException remoteException) {
            object = DataHolder.empty(8);
            zzj2.zza((DataHolder)object, null);
            return null;
        }
        object2 = (zzf)object;
        int n4 = 1;
        int n7 = -1;
        return object2.zza(zzj2, n4, n3, n7, string2);
    }

    public final void zza() {
        this.checkConnected();
        IInterface iInterface = null;
        try {
            this.zzr = null;
            iInterface = this.getService();
        }
        catch (RemoteException remoteException) {
            IllegalStateException illegalStateException = new IllegalStateException(remoteException);
            throw illegalStateException;
        }
        iInterface = (zzf)iInterface;
        iInterface.zza();
    }

    public final void zza(BaseImplementation$ResultHolder object) {
        Object object2;
        this.checkConnected();
        zzj zzj2 = new zzj((BaseImplementation$ResultHolder)object);
        try {
            object2 = object = this.getService();
        }
        catch (RemoteException remoteException) {
            object = DataHolder.empty(8);
            zzj2.zza((DataHolder)object, null);
            return;
        }
        object2 = (zzf)object;
        int n3 = -1;
        int n4 = 2;
        int n7 = 1;
        object2.zza(zzj2, n4, n7, n3, null);
    }

    public final void zza(BaseImplementation$ResultHolder object, Collection collection) {
        this.checkConnected();
        zzj zzj2 = new zzj((BaseImplementation$ResultHolder)object);
        try {
            object = this.getService();
        }
        catch (RemoteException remoteException) {
            object = DataHolder.empty(8);
            zzj2.zza((DataHolder)object, null);
            return;
        }
        object = (zzf)object;
        ArrayList arrayList = new ArrayList(collection);
        object.zza(zzj2, arrayList);
    }

    public final void zza(BaseImplementation$ResultHolder baseImplementation$ResultHolder, String[] object) {
        object = Arrays.asList(object);
        this.zza(baseImplementation$ResultHolder, (Collection)object);
    }

    public final Person zzb() {
        this.checkConnected();
        return this.zzr;
    }

    public final void zzb(BaseImplementation$ResultHolder object) {
        this.checkConnected();
        this.zza();
        zzk zzk2 = new zzk((BaseImplementation$ResultHolder)object);
        try {
            object = this.getService();
        }
        catch (RemoteException remoteException) {
            zzk2.zza(8, (Bundle)null);
            return;
        }
        object = (zzf)object;
        object.zza(zzk2);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.util.Log
 */
package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zae;
import com.google.android.gms.signin.internal.zaf;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

public class SignInClientImpl
extends GmsClient
implements com.google.android.gms.signin.zae {
    public static final /* synthetic */ int zaa;
    private final boolean zab;
    private final ClientSettings zac;
    private final Bundle zad;
    private final Integer zae;

    public SignInClientImpl(Context object, Looper looper, boolean bl2, ClientSettings clientSettings, Bundle bundle, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        super((Context)object, looper, 44, clientSettings, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
        this.zab = true;
        this.zac = clientSettings;
        this.zad = bundle;
        object = clientSettings.zab();
        this.zae = object;
    }

    public static Bundle createBundleFromClientSettings(ClientSettings object) {
        ((ClientSettings)object).zaa();
        Integer n3 = ((ClientSettings)object).zab();
        Bundle bundle = new Bundle();
        String string2 = "com.google.android.gms.signin.internal.clientRequestedAccount";
        object = ((ClientSettings)object).getAccount();
        bundle.putParcelable(string2, (Parcelable)object);
        if (n3 != null) {
            object = "com.google.android.gms.common.internal.ClientSettings.sessionId";
            int n4 = n3;
            bundle.putInt((String)object, n4);
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            boolean bl2 = iInterface instanceof zaf;
            if (bl2) {
                object = iInterface;
                object = (zaf)iInterface;
            } else {
                iInterface = new zaf((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        String string2 = this.zac.getRealClientPackageName();
        Object object = this.getContext().getPackageName();
        boolean bl2 = ((String)object).equals(string2);
        if (!bl2) {
            string2 = this.zad;
            object = this.zac;
            String string3 = "com.google.android.gms.signin.internal.realClientPackageName";
            object = ((ClientSettings)object).getRealClientPackageName();
            string2.putString(string3, (String)object);
        }
        return this.zad;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn() {
        return this.zab;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zaa() {
        IInterface iInterface;
        try {
            iInterface = this.getService();
        }
        catch (RemoteException remoteException) {
            return;
        }
        iInterface = (zaf)iInterface;
        Object object = this.zae;
        object = Preconditions.checkNotNull(object);
        object = (Integer)object;
        int n3 = (Integer)object;
        iInterface.zae(n3);
    }

    public final void zab() {
        BaseGmsClient$LegacyClientCallbackAdapter baseGmsClient$LegacyClientCallbackAdapter = new BaseGmsClient$LegacyClientCallbackAdapter(this);
        this.connect(baseGmsClient$LegacyClientCallbackAdapter);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zac(IAccountAccessor iAccountAccessor, boolean bl2) {
        IInterface iInterface;
        try {
            iInterface = this.getService();
        }
        catch (RemoteException remoteException) {
            return;
        }
        iInterface = (zaf)iInterface;
        Object object = this.zae;
        object = Preconditions.checkNotNull(object);
        object = (Integer)object;
        int n3 = (Integer)object;
        iInterface.zaf(iAccountAccessor, n3, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zad(zae zae2) {
        RemoteException remoteException2;
        int n3;
        block6: {
            Object object;
            Object object2;
            Object object3;
            block5: {
                boolean bl2;
                block4: {
                    String string2 = "Expecting a valid ISignInCallbacks";
                    Preconditions.checkNotNull(zae2, string2);
                    n3 = 1;
                    try {
                        object3 = this.zac;
                        object3 = ((ClientSettings)object3).getAccountOrDefault();
                        object2 = "<<default account>>";
                        object = ((Account)object3).name;
                        bl2 = ((String)object2).equals(object);
                        if (!bl2) break block4;
                        object2 = this.getContext();
                        object2 = Storage.getInstance((Context)object2);
                        object2 = ((Storage)object2).getSavedDefaultGoogleSignInAccount();
                        break block5;
                    }
                    catch (RemoteException remoteException2) {
                        break block6;
                    }
                }
                bl2 = false;
                object2 = null;
            }
            Object object4 = this.zae;
            object4 = Preconditions.checkNotNull(object4);
            object4 = (Integer)object4;
            int n4 = (Integer)object4;
            object = new zat((Account)object3, n4, (GoogleSignInAccount)object2);
            object3 = this.getService();
            object3 = (zaf)object3;
            object2 = new zai(n3, (zat)object);
            ((zaf)object3).zag((zai)object2, zae2);
            return;
        }
        try {
            int n7 = 8;
            ConnectionResult connectionResult = new ConnectionResult(n7, null);
            zak zak2 = new zak(n3, connectionResult, null);
            zae2.zab(zak2);
            return;
        }
        catch (RemoteException remoteException3) {
            Log.wtf((String)"SignInClientImpl", (String)"ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)remoteException2);
            return;
        }
    }
}


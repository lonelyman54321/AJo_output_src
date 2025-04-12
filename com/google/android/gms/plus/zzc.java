/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.ScopeUtil;
import com.google.android.gms.plus.Plus$PlusOptions;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.zzh;
import com.google.android.gms.plus.internal.zzn;

final class zzc
extends Api$AbstractClientBuilder {
    public final /* synthetic */ Api$Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object stringArray, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        Object object = stringArray;
        object = (Plus$PlusOptions)stringArray;
        if (object == null) {
            object = new Plus$PlusOptions(null);
        }
        String string2 = clientSettings.getAccountOrDefault().name;
        String[] stringArray2 = ScopeUtil.toScopeString(clientSettings.getAllRequestedScopes());
        object = object.zzh;
        Context context2 = new Context[]{};
        String[] stringArray3 = object = object.toArray((T[])context2);
        stringArray3 = object;
        String[] stringArray4 = new String[]{};
        String string3 = context.getPackageName();
        String string4 = context.getPackageName();
        PlusCommonExtras plusCommonExtras = new PlusCommonExtras();
        zzn zzn2 = new zzn(string2, stringArray2, stringArray3, stringArray4, string3, string4, null, plusCommonExtras);
        context2 = context;
        zzh zzh2 = new zzh(context, looper, clientSettings, zzn2, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
        return zzh2;
    }

    public final int getPriority() {
        return 2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.loader.content.a;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.auth.api.signin.internal.zbv;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Set;

final class zbw
implements Uv1$a {
    final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbv2) {
        this.zba = signInHubActivity;
    }

    public final a onCreateLoader(int n3, Bundle object) {
        object = this.zba;
        Set set = GoogleApiClient.getAllClients();
        zbc zbc2 = new zbc((Context)object, set);
        return zbc2;
    }

    public final void onLoaderReset(a a2) {
    }
}


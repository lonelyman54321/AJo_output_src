/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.auth.api.signin.internal.zbn;
import com.google.android.gms.auth.api.signin.internal.zbo;
import com.google.android.gms.common.util.UidVerifier;

public final class zbt
extends zbo {
    private final Context zba;

    public zbt(Context context) {
        this.zba = context;
    }

    private final void zbd() {
        Object object = this.zba;
        int n3 = Binder.getCallingUid();
        boolean bl2 = UidVerifier.isGooglePlayServicesUid(object, n3);
        if (bl2) {
            return;
        }
        String string2 = Gj0.b(Binder.getCallingUid(), "Calling UID ", " is not Google Play services.");
        object = new SecurityException(string2);
        throw object;
    }

    public final void zbb() {
        this.zbd();
        zbn.zbc(this.zba).zbd();
    }

    public final void zbc() {
        this.zbd();
        Object object = Storage.getInstance(this.zba);
        GoogleSignInAccount googleSignInAccount = ((Storage)object).getSavedDefaultGoogleSignInAccount();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (googleSignInAccount != null) {
            googleSignInOptions = ((Storage)object).getSavedDefaultGoogleSignInOptions();
        }
        object = GoogleSignIn.getClient(this.zba, googleSignInOptions);
        if (googleSignInAccount != null) {
            ((GoogleSignInClient)object).revokeAccess();
            return;
        }
        ((GoogleSignInClient)object).signOut();
    }
}


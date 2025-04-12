/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.Storage;

public final class zbn {
    private static zbn zbd;
    final Storage zba;
    GoogleSignInAccount zbb;
    GoogleSignInOptions zbc;

    private zbn(Context object) {
        GoogleSignInAccount googleSignInAccount;
        object = Storage.getInstance((Context)object);
        this.zba = object;
        this.zbb = googleSignInAccount = ((Storage)object).getSavedDefaultGoogleSignInAccount();
        this.zbc = object = ((Storage)object).getSavedDefaultGoogleSignInOptions();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zbn zbc(Context object) {
        Class<zbn> clazz = zbn.class;
        synchronized (clazz) {
            object = object.getApplicationContext();
            return zbn.zbf(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zbn zbf(Context context) {
        Class<zbn> clazz = zbn.class;
        synchronized (clazz) {
            zbn zbn2 = zbd;
            if (zbn2 != null) {
                return zbn2;
            }
            zbd = zbn2 = new zbn(context);
            return zbn2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final GoogleSignInAccount zba() {
        synchronized (this) {
            return this.zbb;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final GoogleSignInOptions zbb() {
        synchronized (this) {
            return this.zbc;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zbd() {
        synchronized (this) {
            Storage storage = this.zba;
            storage.clear();
            storage = null;
            this.zbb = null;
            this.zbc = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zbe(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        synchronized (this) {
            Storage storage = this.zba;
            storage.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
            this.zbb = googleSignInAccount;
            this.zbc = googleSignInOptions;
            return;
        }
    }
}


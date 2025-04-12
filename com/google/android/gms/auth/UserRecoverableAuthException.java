/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.auth.GoogleAuthException;

public class UserRecoverableAuthException
extends GoogleAuthException {
    private final Intent zza;

    public UserRecoverableAuthException(String string2, Intent intent) {
        super(string2);
        this.zza = intent;
    }

    public Intent getIntent() {
        Intent intent = this.zza;
        if (intent == null) {
            return null;
        }
        Intent intent2 = new Intent(intent);
        return intent2;
    }
}


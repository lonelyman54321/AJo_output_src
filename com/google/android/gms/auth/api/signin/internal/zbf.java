/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.internal.zba;
import com.google.android.gms.auth.api.signin.internal.zbg;
import com.google.android.gms.auth.api.signin.internal.zbn;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class zbf
extends zba {
    final /* synthetic */ zbg zba;

    public zbf(zbg zbg2) {
        this.zba = zbg2;
    }

    public final void zbd(GoogleSignInAccount googleSignInAccount, Status status) {
        Object object;
        Object object2;
        if (googleSignInAccount != null) {
            object2 = zbn.zbc(this.zba.zba);
            object = this.zba.zbb;
            ((zbn)object2).zbe((GoogleSignInOptions)object, googleSignInAccount);
        }
        object2 = this.zba;
        object = new GoogleSignInResult(googleSignInAccount, status);
        ((BasePendingResult)object2).setResult((Result)object);
    }
}


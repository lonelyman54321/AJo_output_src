/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin;

import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.zba;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil$ResultConverter;

final class zbb
implements PendingResultUtil$ResultConverter {
    private zbb() {
    }

    public /* synthetic */ zbb(zba zba2) {
    }

    public final /* synthetic */ Object convert(Result result2) {
        return ((GoogleSignInResult)result2).getSignInAccount();
    }
}


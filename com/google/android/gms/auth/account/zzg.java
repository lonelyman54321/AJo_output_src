/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.account;

import com.google.android.gms.auth.account.WorkAccountApi$AddAccountResult;
import com.google.android.gms.auth.account.WorkAccountClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil$ResultConverter;

final class zzg
implements PendingResultUtil$ResultConverter {
    public zzg(WorkAccountClient workAccountClient) {
    }

    public final /* synthetic */ Object convert(Result result2) {
        return ((WorkAccountApi$AddAccountResult)result2).getAccount();
    }
}


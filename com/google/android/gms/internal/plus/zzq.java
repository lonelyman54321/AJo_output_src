/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.plus.zzp;
import com.google.android.gms.plus.People$LoadPeopleResult;
import com.google.android.gms.plus.model.people.PersonBuffer;

final class zzq
implements People$LoadPeopleResult {
    private final /* synthetic */ Status zzan;

    public zzq(zzp zzp2, Status status) {
        this.zzan = status;
    }

    public final String getNextPageToken() {
        return null;
    }

    public final PersonBuffer getPersonBuffer() {
        return null;
    }

    public final Status getStatus() {
        return this.zzan;
    }

    public final void release() {
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.Preconditions;

public final class zae
extends zai {
    protected final BaseImplementation$ApiMethodImpl zaa;

    public zae(int n3, BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        super(n3);
        BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl2;
        this.zaa = baseImplementation$ApiMethodImpl2 = (BaseImplementation$ApiMethodImpl)Preconditions.checkNotNull(baseImplementation$ApiMethodImpl, "Null methods are not runnable.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zad(Status status) {
        BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl;
        try {
            baseImplementation$ApiMethodImpl = this.zaa;
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
        baseImplementation$ApiMethodImpl.setFailedResult(status);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zae(Exception object) {
        String string2 = object.getClass().getSimpleName();
        object = ((Throwable)object).getLocalizedMessage();
        String string3 = ": ";
        object = n1.a(string2, string3, (String)object);
        int n3 = 10;
        Status status = new Status(n3, (String)object);
        try {
            object = this.zaa;
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
        ((BaseImplementation$ApiMethodImpl)object).setFailedResult(status);
    }

    public final void zaf(zabq object) {
        BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl;
        try {
            baseImplementation$ApiMethodImpl = this.zaa;
        }
        catch (RuntimeException runtimeException) {
            this.zae(runtimeException);
            return;
        }
        object = ((zabq)object).zaf();
        baseImplementation$ApiMethodImpl.run((Api$AnyClient)object);
    }

    public final void zag(zaad zaad2, boolean bl2) {
        BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl = this.zaa;
        zaad2.zac(baseImplementation$ApiMethodImpl, bl2);
    }
}


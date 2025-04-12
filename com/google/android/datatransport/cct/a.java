/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct;

import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.cct.CctTransportBackend$HttpRequest;
import com.google.android.datatransport.runtime.retries.Function;

public final class a
implements Function {
    public final /* synthetic */ CctTransportBackend a;

    public /* synthetic */ a(CctTransportBackend cctTransportBackend) {
        this.a = cctTransportBackend;
    }

    public final Object apply(Object object) {
        CctTransportBackend cctTransportBackend = this.a;
        object = (CctTransportBackend$HttpRequest)object;
        return CctTransportBackend.a(cctTransportBackend, (CctTransportBackend$HttpRequest)object);
    }
}


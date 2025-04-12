/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct;

import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.cct.CctTransportBackend$HttpRequest;
import com.google.android.datatransport.cct.CctTransportBackend$HttpResponse;
import com.google.android.datatransport.runtime.retries.RetryStrategy;

public final class b
implements RetryStrategy {
    public final Object shouldRetry(Object object, Object object2) {
        object = (CctTransportBackend$HttpRequest)object;
        object2 = (CctTransportBackend$HttpResponse)object2;
        return CctTransportBackend.b((CctTransportBackend$HttpRequest)object, (CctTransportBackend$HttpResponse)object2);
    }
}


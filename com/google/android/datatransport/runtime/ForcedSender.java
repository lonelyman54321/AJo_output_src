/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportImpl;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;

public final class ForcedSender {
    private static final String LOG_TAG = "ForcedSender";

    private ForcedSender() {
    }

    public static void sendBlocking(Transport object, Priority object2) {
        int n3 = object instanceof TransportImpl;
        if (n3 != 0) {
            object = ((TransportImpl)object).getTransportContext().withPriority((Priority)((Object)object2));
            object2 = TransportRuntime.getInstance().getUploader();
            n3 = 1;
            ((Uploader)object2).logAndUpdateState((TransportContext)object, n3);
        } else {
            object2 = LOG_TAG;
            String string2 = "Expected instance of `TransportImpl`, got `%s`.";
            Logging.w((String)object2, string2, object);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.transport;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.PerfMetric;

final class FlgTransport {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private Transport flgTransport;
    private final Provider flgTransportFactoryProvider;
    private final String logSourceName;

    public FlgTransport(Provider provider, String string2) {
        this.logSourceName = string2;
        this.flgTransportFactoryProvider = provider;
    }

    private boolean initializeFlgTransportClient() {
        boolean bl2;
        Object object = this.flgTransport;
        if (object == null) {
            object = (TransportFactory)this.flgTransportFactoryProvider.get();
            if (object != null) {
                String string2 = this.logSourceName;
                Encoding encoding = Encoding.of("proto");
                SR0 sR0 = new Object();
                Class<PerfMetric> clazz = PerfMetric.class;
                this.flgTransport = object = object.getTransport(string2, clazz, encoding, sR0);
            } else {
                object = logger;
                String string3 = "Flg TransportFactory is not available at the moment";
                ((AndroidLogger)object).warn(string3);
            }
        }
        if ((object = this.flgTransport) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public void log(PerfMetric object) {
        boolean bl2 = this.initializeFlgTransportClient();
        if (!bl2) {
            logger.warn("Unable to dispatch event because Flg Transport is not available");
            return;
        }
        Transport transport = this.flgTransport;
        object = Event.ofData(object);
        transport.send((Event)object);
    }
}


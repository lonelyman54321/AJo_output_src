/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.sessions.EventGDTLogger$Companion;
import com.google.firebase.sessions.EventGDTLoggerInterface;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionEvents;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class EventGDTLogger
implements EventGDTLoggerInterface {
    private static final String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";
    public static final EventGDTLogger$Companion Companion;
    private static final String TAG = "EventGDTLogger";
    private final Provider transportFactoryProvider;

    static {
        EventGDTLogger$Companion eventGDTLogger$Companion;
        Companion = eventGDTLogger$Companion = new EventGDTLogger$Companion(null);
    }

    public EventGDTLogger(Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "transportFactoryProvider");
        this.transportFactoryProvider = provider;
    }

    public static /* synthetic */ byte[] a(EventGDTLogger eventGDTLogger, SessionEvent sessionEvent) {
        return eventGDTLogger.encode(sessionEvent);
    }

    private final byte[] encode(SessionEvent object) {
        String string2 = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(object);
        Intrinsics.checkNotNullExpressionValue(string2, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        ((SessionEvent)object).getEventType().name();
        object = Charsets.UTF_8;
        object = string2.getBytes((Charset)object);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).getBytes(charset)");
        return object;
    }

    public void log(SessionEvent object) {
        Intrinsics.checkNotNullParameter(object, "sessionEvent");
        Object object2 = (TransportFactory)this.transportFactoryProvider.get();
        Encoding encoding = Encoding.of("json");
        H02 h02 = new H02(this, 3);
        object2 = object2.getTransport(AQS_LOG_SOURCE, SessionEvent.class, encoding, h02);
        object = Event.ofData(object);
        object2.send((Event)object);
    }
}


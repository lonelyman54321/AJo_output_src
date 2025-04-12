/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.internal;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.internal.InternalEvent;
import com.affise.attribution.internal.InternalEventsRepository;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.storages.InternalEventsStorage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class InternalEventsRepositoryImpl
implements InternalEventsRepository {
    private final Converter converterToBase64;
    private final Converter converterToSerializedEvent;
    private final InternalEventsStorage eventsStorage;
    private final LogsManager logsManager;

    public InternalEventsRepositoryImpl(Converter converter, Converter converter2, LogsManager logsManager2, InternalEventsStorage internalEventsStorage2) {
        Intrinsics.checkNotNullParameter(converter, "converterToBase64");
        Intrinsics.checkNotNullParameter(converter2, "converterToSerializedEvent");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        Intrinsics.checkNotNullParameter(internalEventsStorage2, "eventsStorage");
        this.converterToBase64 = converter;
        this.converterToSerializedEvent = converter2;
        this.logsManager = logsManager2;
        this.eventsStorage = internalEventsStorage2;
    }

    public void clear() {
        this.eventsStorage.clear();
    }

    public void deleteEvent(List list, String string2) {
        Intrinsics.checkNotNullParameter(list, "ids");
        Intrinsics.checkNotNullParameter(string2, "url");
        InternalEventsStorage internalEventsStorage2 = this.eventsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        internalEventsStorage2.deleteEvent(string2, list);
    }

    public List getEvents(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        InternalEventsStorage internalEventsStorage2 = this.eventsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        return internalEventsStorage2.getEvents(string2);
    }

    public boolean hasEvents(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        InternalEventsStorage internalEventsStorage2 = this.eventsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        return internalEventsStorage2.hasEvents(string2);
    }

    public void storeEvent(InternalEvent internalEvent, List object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(internalEvent, "event");
        String string2 = "urls";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            string2 = (String)object.next();
            InternalEventsStorage internalEventsStorage2 = this.eventsStorage;
            string2 = (String)this.converterToBase64.convert(string2);
            SerializedEvent serializedEvent = (SerializedEvent)this.converterToSerializedEvent.convert(internalEvent);
            internalEventsStorage2.saveEvent(string2, serializedEvent);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.events;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.events.Event;
import com.affise.attribution.events.EventsRepository;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.storages.EventsStorage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class EventsRepositoryImpl
implements EventsRepository {
    private final Converter converterToBase64;
    private final Converter converterToSerializedEvent;
    private final EventsStorage eventsStorage;
    private final LogsManager logsManager;

    public EventsRepositoryImpl(Converter converter, Converter converter2, LogsManager logsManager2, EventsStorage eventsStorage2) {
        Intrinsics.checkNotNullParameter(converter, "converterToBase64");
        Intrinsics.checkNotNullParameter(converter2, "converterToSerializedEvent");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        Intrinsics.checkNotNullParameter(eventsStorage2, "eventsStorage");
        this.converterToBase64 = converter;
        this.converterToSerializedEvent = converter2;
        this.logsManager = logsManager2;
        this.eventsStorage = eventsStorage2;
    }

    public void clear() {
        this.eventsStorage.clear();
    }

    public void deleteEvent(List list, String string2) {
        Intrinsics.checkNotNullParameter(list, "ids");
        Intrinsics.checkNotNullParameter(string2, "url");
        EventsStorage eventsStorage2 = this.eventsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        eventsStorage2.deleteEvent(string2, list);
    }

    public List getEvents(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        EventsStorage eventsStorage2 = this.eventsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        return eventsStorage2.getEvents(string2);
    }

    public boolean hasEvents(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        EventsStorage eventsStorage2 = this.eventsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        return eventsStorage2.hasEvents(string2);
    }

    public void storeEvent(Event event, List object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(event, "event");
        String string2 = "urls";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            string2 = (String)object.next();
            EventsStorage eventsStorage2 = this.eventsStorage;
            string2 = (String)this.converterToBase64.convert(string2);
            SerializedEvent serializedEvent = (SerializedEvent)this.converterToSerializedEvent.convert(event);
            eventsStorage2.saveEvent(string2, serializedEvent);
        }
    }

    public void storeWebEvent(String object, List object2) {
        Intrinsics.checkNotNullParameter(object, "event");
        Object object3 = "urls";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = new JSONObject((String)object);
        object = "affise_event_id";
        object = object3.getString((String)object);
        Object object4 = "id";
        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
        SerializedEvent serializedEvent = new SerializedEvent((String)object, (JSONObject)object3);
        object2 = (Iterable)object2;
        try {
            object = object2.iterator();
        }
        catch (Throwable throwable) {
            object2 = this.logsManager;
            object2.addUserError(throwable);
        }
        while (true) {
            boolean bl2 = object.hasNext();
            if (!bl2) break;
            object2 = object.next();
            object2 = (String)object2;
            object3 = this.eventsStorage;
            object4 = this.converterToBase64;
            object2 = object4.convert(object2);
            object2 = (String)object2;
            object3.saveEvent((String)object2, serializedEvent);
            continue;
            break;
        }
    }
}


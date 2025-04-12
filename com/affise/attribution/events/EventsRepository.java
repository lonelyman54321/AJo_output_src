/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events;

import com.affise.attribution.events.Event;
import java.util.List;

public interface EventsRepository {
    public void clear();

    public void deleteEvent(List var1, String var2);

    public List getEvents(String var1);

    public boolean hasEvents(String var1);

    public void storeEvent(Event var1, List var2);

    public void storeWebEvent(String var1, List var2);
}


/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.storages;

import com.affise.attribution.events.SerializedEvent;
import java.util.List;

public interface InternalEventsStorage {
    public void clear();

    public void deleteEvent(String var1, List var2);

    public List getEvents(String var1);

    public boolean hasEvents(String var1);

    public void saveEvent(String var1, SerializedEvent var2);
}


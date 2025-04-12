/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.internal;

import com.affise.attribution.internal.InternalEvent;
import java.util.List;

public interface InternalEventsRepository {
    public void clear();

    public void deleteEvent(List var1, String var2);

    public List getEvents(String var1);

    public boolean hasEvents(String var1);

    public void storeEvent(InternalEvent var1, List var2);
}


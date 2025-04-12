/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public class ListenerHolders {
    private final Set zaa;

    public ListenerHolders() {
        Object object = new WeakHashMap();
        this.zaa = object = Collections.newSetFromMap(object);
    }

    public static ListenerHolder createListenerHolder(Object object, Looper looper, String string2) {
        Preconditions.checkNotNull(object, "Listener must not be null");
        Preconditions.checkNotNull(looper, "Looper must not be null");
        Preconditions.checkNotNull(string2, "Listener type must not be null");
        ListenerHolder listenerHolder = new ListenerHolder(looper, object, string2);
        return listenerHolder;
    }

    public static ListenerHolder createListenerHolder(Object object, Executor executor, String string2) {
        Preconditions.checkNotNull(object, "Listener must not be null");
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(string2, "Listener type must not be null");
        ListenerHolder listenerHolder = new ListenerHolder(executor, object, string2);
        return listenerHolder;
    }

    public static ListenerHolder$ListenerKey createListenerKey(Object object, String string2) {
        Preconditions.checkNotNull(object, "Listener must not be null");
        Preconditions.checkNotNull(string2, "Listener type must not be null");
        Preconditions.checkNotEmpty(string2, "Listener type must not be empty");
        ListenerHolder$ListenerKey listenerHolder$ListenerKey = new ListenerHolder$ListenerKey(object, string2);
        return listenerHolder$ListenerKey;
    }

    public final ListenerHolder zaa(Object object, Looper looper, String object2) {
        object2 = this.zaa;
        object = ListenerHolders.createListenerHolder(object, looper, "NO_TYPE");
        object2.add(object);
        return object;
    }

    public final void zab() {
        boolean bl2;
        Iterator iterator = this.zaa.iterator();
        while (bl2 = iterator.hasNext()) {
            ListenerHolder listenerHolder = (ListenerHolder)iterator.next();
            listenerHolder.clear();
        }
        this.zaa.clear();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBufferObserver;
import com.google.android.gms.common.data.DataBufferObserver$Observable;
import java.util.HashSet;
import java.util.Iterator;

public final class DataBufferObserverSet
implements DataBufferObserver,
DataBufferObserver$Observable {
    private final HashSet zaa;

    public DataBufferObserverSet() {
        HashSet hashSet;
        this.zaa = hashSet = new HashSet();
    }

    public void addObserver(DataBufferObserver dataBufferObserver) {
        this.zaa.add(dataBufferObserver);
    }

    public void clear() {
        this.zaa.clear();
    }

    public boolean hasObservers() {
        HashSet hashSet = this.zaa;
        boolean bl2 = hashSet.isEmpty();
        return !bl2;
    }

    public void onDataChanged() {
        boolean bl2;
        Iterator iterator = this.zaa.iterator();
        while (bl2 = iterator.hasNext()) {
            DataBufferObserver dataBufferObserver = (DataBufferObserver)iterator.next();
            dataBufferObserver.onDataChanged();
        }
    }

    public void onDataRangeChanged(int n3, int n4) {
        boolean bl2;
        Iterator iterator = this.zaa.iterator();
        while (bl2 = iterator.hasNext()) {
            DataBufferObserver dataBufferObserver = (DataBufferObserver)iterator.next();
            dataBufferObserver.onDataRangeChanged(n3, n4);
        }
    }

    public void onDataRangeInserted(int n3, int n4) {
        boolean bl2;
        Iterator iterator = this.zaa.iterator();
        while (bl2 = iterator.hasNext()) {
            DataBufferObserver dataBufferObserver = (DataBufferObserver)iterator.next();
            dataBufferObserver.onDataRangeInserted(n3, n4);
        }
    }

    public void onDataRangeMoved(int n3, int n4, int n7) {
        boolean bl2;
        Iterator iterator = this.zaa.iterator();
        while (bl2 = iterator.hasNext()) {
            DataBufferObserver dataBufferObserver = (DataBufferObserver)iterator.next();
            dataBufferObserver.onDataRangeMoved(n3, n4, n7);
        }
    }

    public void onDataRangeRemoved(int n3, int n4) {
        boolean bl2;
        Iterator iterator = this.zaa.iterator();
        while (bl2 = iterator.hasNext()) {
            DataBufferObserver dataBufferObserver = (DataBufferObserver)iterator.next();
            dataBufferObserver.onDataRangeRemoved(n3, n4);
        }
    }

    public void removeObserver(DataBufferObserver dataBufferObserver) {
        this.zaa.remove(dataBufferObserver);
    }
}


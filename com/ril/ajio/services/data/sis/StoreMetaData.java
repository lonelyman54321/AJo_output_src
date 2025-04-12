/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.sis;

import com.ril.ajio.services.data.Home.Status;
import com.ril.ajio.services.data.sis.SisStoreList;
import java.util.ArrayList;

public final class StoreMetaData {
    private SisStoreList data;
    private ArrayList sisStoreList;
    private Status status;

    public SisStoreList getData() {
        return this.data;
    }

    public ArrayList getSisStoreList() {
        return this.sisStoreList;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setSisStoreList(ArrayList arrayList) {
        this.sisStoreList = arrayList;
    }
}


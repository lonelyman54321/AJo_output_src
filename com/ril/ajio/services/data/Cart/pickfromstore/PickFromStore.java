/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart.pickfromstore;

import com.ril.ajio.services.data.Cart.pickfromstore.Status;
import java.io.Serializable;
import java.util.ArrayList;

public class PickFromStore
implements Serializable {
    private Status status;
    private ArrayList storeNodes = null;

    public Status getStatus() {
        return this.status;
    }

    public ArrayList getStoreNodes() {
        return this.storeNodes;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setStoreNodes(ArrayList arrayList) {
        this.storeNodes = arrayList;
    }
}


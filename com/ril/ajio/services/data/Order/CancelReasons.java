/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import java.util.ArrayList;

public class CancelReasons
implements Serializable {
    private ArrayList cancelReasons;

    public ArrayList getCancelReasons() {
        return this.cancelReasons;
    }

    public void setCancelReasons(ArrayList arrayList) {
        this.cancelReasons = arrayList;
    }
}


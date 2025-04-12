/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import kotlin.jvm.internal.Intrinsics;

public final class ReturnCapture {
    private String exchangeMessage;
    private boolean isNewOne;
    private String selfShipMessage;

    public ReturnCapture() {
        String string2;
        this.exchangeMessage = string2 = "";
        this.selfShipMessage = string2;
    }

    public final String getExchangeMessage() {
        return this.exchangeMessage;
    }

    public final String getSelfShipMessage() {
        return this.selfShipMessage;
    }

    public final boolean isNewOne() {
        return this.isNewOne;
    }

    public final void setExchangeMessage(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.exchangeMessage = string2;
    }

    public final void setNewOne(boolean bl2) {
        this.isNewOne = bl2;
    }

    public final void setSelfShipMessage(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.selfShipMessage = string2;
    }
}


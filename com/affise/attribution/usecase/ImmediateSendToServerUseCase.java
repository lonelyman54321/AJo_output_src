/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.events.Event;
import com.affise.attribution.events.OnSendFailedCallback;
import com.affise.attribution.events.OnSendSuccessCallback;

public interface ImmediateSendToServerUseCase {
    public void sendNow(Event var1, OnSendSuccessCallback var2, OnSendFailedCallback var3);
}


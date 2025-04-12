/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.usecase.SendDataToServerUseCase;

public final class SendDataToServerUseCase$DefaultImpls {
    public static /* synthetic */ void send$default(SendDataToServerUseCase object, boolean bl2, boolean bl3, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 2) != 0) {
                bl3 = true;
            }
            object.send(bl2, bl3);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        throw object;
    }
}


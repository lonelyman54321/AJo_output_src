/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.MutableWindowInsetsType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class MutableWindowInsetsType$animationInProgress$2
extends Lambda
implements Function0 {
    final /* synthetic */ MutableWindowInsetsType this$0;

    public MutableWindowInsetsType$animationInProgress$2(MutableWindowInsetsType mutableWindowInsetsType) {
        this.this$0 = mutableWindowInsetsType;
        super(0);
    }

    public final Boolean invoke() {
        MutableWindowInsetsType mutableWindowInsetsType = this.this$0;
        int n3 = MutableWindowInsetsType.access$getOngoingAnimationsCount(mutableWindowInsetsType);
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            mutableWindowInsetsType = null;
        }
        return n3 != 0;
    }
}


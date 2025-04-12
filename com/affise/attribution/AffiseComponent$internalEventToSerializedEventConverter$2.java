/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.internal.InternalEventToSerializedEventConverter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$internalEventToSerializedEventConverter$2
extends Lambda
implements Function0 {
    public static final AffiseComponent$internalEventToSerializedEventConverter$2 INSTANCE;

    static {
        AffiseComponent$internalEventToSerializedEventConverter$2 affiseComponent$internalEventToSerializedEventConverter$2;
        INSTANCE = affiseComponent$internalEventToSerializedEventConverter$2 = new AffiseComponent$internalEventToSerializedEventConverter$2();
    }

    public AffiseComponent$internalEventToSerializedEventConverter$2() {
        super(0);
    }

    public final InternalEventToSerializedEventConverter invoke() {
        InternalEventToSerializedEventConverter internalEventToSerializedEventConverter2 = new InternalEventToSerializedEventConverter();
        return internalEventToSerializedEventConverter2;
    }
}


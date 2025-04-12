/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

final class SessionGenerator$1
extends FunctionReferenceImpl
implements Function0 {
    public static final SessionGenerator$1 INSTANCE;

    static {
        SessionGenerator$1 sessionGenerator$1;
        INSTANCE = sessionGenerator$1 = new SessionGenerator$1();
    }

    public SessionGenerator$1() {
        super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
    }

    public final UUID invoke() {
        return UUID.randomUUID();
    }
}


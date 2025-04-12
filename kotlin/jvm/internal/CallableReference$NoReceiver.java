/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.io.Serializable;

class CallableReference$NoReceiver
implements Serializable {
    private static final CallableReference$NoReceiver INSTANCE;

    static {
        CallableReference$NoReceiver callableReference$NoReceiver;
        INSTANCE = callableReference$NoReceiver = new CallableReference$NoReceiver();
    }

    private CallableReference$NoReceiver() {
    }

    public static /* synthetic */ CallableReference$NoReceiver access$000() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}


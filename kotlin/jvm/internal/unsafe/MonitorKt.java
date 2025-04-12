/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal.unsafe;

public final class MonitorKt {
    private static final void monitorEnter(Object object) {
        object = new UnsupportedOperationException("This function can only be used privately");
        throw object;
    }

    private static final void monitorExit(Object object) {
        object = new UnsupportedOperationException("This function can only be used privately");
        throw object;
    }
}


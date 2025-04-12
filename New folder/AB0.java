/*
 * Decompiled with CFR 0.152.
 */
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;
import kotlin.jvm.internal.Intrinsics;

public final class AB0 {
    public static Bus a;

    public static final Bus a() {
        Bus bus = a;
        if (bus == null) {
            ThreadEnforcer threadEnforcer = ThreadEnforcer.MAIN;
            a = bus = new Bus(threadEnforcer);
        }
        bus = a;
        Intrinsics.checkNotNull(bus, "null cannot be cast to non-null type com.squareup.otto.Bus");
        return bus;
    }
}


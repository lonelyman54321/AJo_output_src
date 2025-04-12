/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from A80
 */
public final class a80_0 {
    private volatile /* synthetic */ Object current;

    static {
        AtomicReferenceFieldUpdater.newUpdater(a80_0.class, Object.class, "current");
    }

    public a80_0() {
        nz0_2 nz0_22 = fh1_2.f();
        this.current = nz0_22;
    }

    public final Object a(Object object) {
        Intrinsics.checkNotNullParameter(object, "key");
        return ((Map)this.current).get(object);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bw2
 */
public final class bw2_1
extends zw2_0 {
    public final Object c;

    public bw2_1(int n3) {
        super(n3);
        Object object;
        this.c = object = new Object();
    }

    public final boolean a(Object object) {
        Intrinsics.checkNotNullParameter(object, "instance");
        Object object2 = this.c;
        synchronized (object2) {
            boolean bl2 = super.a(object);
            return bl2;
        }
    }

    public final Object b() {
        Object object = this.c;
        synchronized (object) {
            Object object2 = super.b();
            return object2;
        }
    }
}


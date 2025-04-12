/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jh3
 */
public final class jh3_1
implements zb3_0 {
    public final zb3_0 b;
    public final Object c;

    public jh3_1(ab3_0 object) {
        Intrinsics.checkNotNullParameter(object, "delegate");
        this.b = object;
        this.c = object = new Object();
    }

    public final xb3_0 a(gI3 object) {
        Intrinsics.checkNotNullParameter(object, "id");
        Object object2 = this.c;
        synchronized (object2) {
            zb3_0 zb3_02 = this.b;
            object = zb3_02.a((gI3)object);
            return object;
        }
    }

    public final boolean b(gI3 gI32) {
        Intrinsics.checkNotNullParameter(gI32, "id");
        Object object = this.c;
        synchronized (object) {
            zb3_0 zb3_02 = this.b;
            boolean bl2 = zb3_02.b(gI32);
            return bl2;
        }
    }

    public final xb3_0 c(gI3 object) {
        Intrinsics.checkNotNullParameter(object, "id");
        Object object2 = this.c;
        synchronized (object2) {
            zb3_0 zb3_02 = this.b;
            object = zb3_02.c((gI3)object);
            return object;
        }
    }

    public final List remove(String object) {
        Intrinsics.checkNotNullParameter(object, "workSpecId");
        Object object2 = this.c;
        synchronized (object2) {
            zb3_0 zb3_02 = this.b;
            object = zb3_02.remove((String)object);
            return object;
        }
    }
}


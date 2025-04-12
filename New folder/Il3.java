/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Il3 {
    public final Al3 a;
    public final zt2_0 b;

    public Il3(Al3 al3, zt2_0 zt2_02) {
        this.a = al3;
        this.b = zt2_02;
    }

    public final void a(ql3_0 ql3_02, ql3_0 ql3_03) {
        Object object = (Il3)this.a.b.get();
        boolean bl2 = Intrinsics.areEqual(object, this);
        if (bl2) {
            object = this.b;
            object.c(ql3_02, ql3_03);
        }
    }
}


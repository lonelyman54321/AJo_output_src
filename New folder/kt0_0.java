/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KT0
 */
public final class kt0_0
extends LP1$c
implements nt0_0 {
    public Function1 n;
    public tu0_0 o;

    public kt0_0() {
        throw null;
    }

    public final void L0(tu0_0 tu0_02) {
        Object object = this.o;
        boolean bl2 = Intrinsics.areEqual(object, tu0_02);
        if (!bl2) {
            this.o = tu0_02;
            object = this.n;
            object.invoke(tu0_02);
        }
    }
}


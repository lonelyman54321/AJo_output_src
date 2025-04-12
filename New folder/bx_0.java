/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bx
 */
public final class bx_0
extends wj3_0 {
    public final iA3 b;

    public bx_0(p70_0 p70_02) {
        Intrinsics.checkNotNullParameter(p70_02, "validator");
        Map map2 = p70_02.a;
        super(map2);
        this.b = p70_02;
    }

    public final List a() {
        Object v4 = this.a.get("PT_BG");
        Intrinsics.checkNotNull(v4);
        return kotlin.collections.a.b(v4);
    }

    public final boolean b() {
        boolean bl2 = this.b.b();
        boolean bl3 = this.c();
        return bl2 & bl3;
    }
}


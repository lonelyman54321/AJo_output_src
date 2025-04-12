/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CJ3
 */
public final class cj3_1
extends wj3_0 {
    public iA3 b;

    public final List a() {
        Object v4 = this.a.get("PT_BIG_IMG");
        Intrinsics.checkNotNull(v4);
        return kotlin.collections.a.b(v4);
    }

    public final boolean b() {
        iA3 iA32 = this.b;
        boolean bl2 = iA32.b();
        if (bl2 && (bl2 = this.c())) {
            bl2 = true;
        } else {
            bl2 = false;
            iA32 = null;
        }
        return bl2;
    }
}


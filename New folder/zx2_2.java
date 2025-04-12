/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zX2
 */
public final class zx2_2 {
    public static final wx2_2 a(Object object) {
        Object object2 = c40_0.a;
        if (object != object2) {
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (wx2_2)object;
        }
        object2 = "Does not contain segment".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public static final boolean b(Object object) {
        boolean bl2;
        gh3_2 gh3_22 = c40_0.a;
        if (object == gh3_22) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class N30 {
    public static final Object a(rq2_1 rq2_12, H30 h30) {
        Intrinsics.checkNotNull(h30, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object object = rq2_12.get(h30);
        if (object == null) {
            object = h30.a();
        }
        return ((pa3_0)object).a(rq2_12);
    }

    public static final rq2_1 b(MB2[] mB2Array, rq2_1 rq2_12, rq2_1 rq2_13) {
        qq2_0 qq2_02 = qq2_0.g;
        qq2_02.getClass();
        Qq2$a qq2$a = new Qq2$a(qq2_02);
        for (MB2 mB2 : mB2Array) {
            H30 h30 = mB2.a;
            Object object = "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>";
            Intrinsics.checkNotNull(h30, (String)object);
            h30 = (kb2_0)h30;
            boolean bl2 = mB2.h;
            if (!bl2) {
                object = "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>";
                Intrinsics.checkNotNull(h30, (String)object);
                bl2 = rq2_12.containsKey(h30);
                if (bl2) continue;
            }
            object = (pa3_0)rq2_13.get(h30);
            String string2 = "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>";
            Intrinsics.checkNotNull(mB2, string2);
            pa3_0 pa3_02 = ((kb2_0)h30).b(mB2, (pa3_0)object);
            qq2$a.put(h30, pa3_02);
        }
        return qq2$a.i();
    }
}


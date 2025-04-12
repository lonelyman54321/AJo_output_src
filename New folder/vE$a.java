/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class vE$a
implements x80_0 {
    public static final vE$a a;

    static {
        vE$a vE$a;
        a = vE$a = new Object();
    }

    public final Object convert(Object object) {
        object = (il2_2)object;
        try {
            ce_2 ce_22 = new ce_2();
            Object object2 = ((il2_2)object).h();
            object2.j0(ce_22);
            object2 = ((il2_2)object).d();
            long l2 = ((il2_2)object).c();
            Object object3 = "content";
            Intrinsics.checkNotNullParameter(ce_22, (String)object3);
            object3 = "<this>";
            Intrinsics.checkNotNullParameter(ce_22, (String)object3);
            object3 = new jl2_2((jn1_0)object2, l2, ce_22);
            return object3;
        }
        finally {
            ((il2_2)object).close();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$l
 */
public final class fs2$l_0
extends Lambda
implements Function1 {
    public static final fs2$l_0 c;

    static {
        fs2$l_0 fs2$l_0;
        c = fs2$l_0 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Object object2 = Boolean.FALSE;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2) {
            long l2 = OX.l;
            object = new OX(l2);
        } else {
            object2 = "null cannot be cast to non-null type kotlin.Int";
            Intrinsics.checkNotNull(object, (String)object2);
            int n3 = (Integer)object;
            long l3 = zx_0.c(n3);
            object = new OX(l3);
        }
        return object;
    }
}


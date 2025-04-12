/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$p
 */
public final class fs2$p_0
extends Lambda
implements Function1 {
    public static final fs2$p_0 c;

    static {
        fs2$p_0 fs2$p_0;
        c = fs2$p_0 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        object = (List)object;
        Object object2 = object.get(0);
        Object object3 = null;
        object2 = object2 != null ? (String)object2 : null;
        Intrinsics.checkNotNull(object2);
        int n3 = 1;
        object = object.get(n3);
        ds2_0 ds2_02 = FS2.j;
        Boolean bl2 = Boolean.FALSE;
        boolean bl3 = Intrinsics.areEqual(object, bl2);
        if (!bl3 && object != null) {
            object3 = object = ds2_02.b.invoke(object);
            object3 = (gm3_0)object;
        }
        object = new Gu1$b((String)object2, (gm3_0)object3);
        return object;
    }
}


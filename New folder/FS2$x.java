/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$x
extends Lambda
implements Function1 {
    public static final FS2$x c;

    static {
        FS2$x fS2$x;
        c = fS2$x = new Lambda(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        ym2_0 ym2_02;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        object = (List)object;
        int n3 = 0;
        Object object2 = object.get(0);
        int n4 = 0;
        if (object2 != null) {
            object2 = (Cj3)object2;
        } else {
            n3 = 0;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        int n7 = ((Cj3)object2).a;
        n3 = 1;
        object2 = object.get(n3);
        if (object2 != null) {
            object2 = (Pj3)object2;
        } else {
            n3 = 0;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        int n8 = ((Pj3)object2).a;
        n3 = 2;
        object2 = object.get(n3);
        Object object3 = Dm3.b;
        object3 = FS2.r;
        Object object4 = Boolean.FALSE;
        boolean bl2 = Intrinsics.areEqual(object2, object4);
        if ((!bl2 || (bl2 = object3 instanceof GS2)) && object2 != null) {
            object3 = ((GS2)object3).b;
            object2 = (Dm3)object3.invoke(object2);
        } else {
            n3 = 0;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        long l2 = ((Dm3)object2).a;
        n3 = 3;
        object = object.get(n3);
        object2 = vl3_0.c;
        object2 = FS2.m;
        boolean bl3 = Intrinsics.areEqual(object, object4);
        if (!bl3 && object != null) {
            object2 = ((ds2_0)object2).b;
            object4 = object = (vl3_0)object2.invoke(object);
        } else {
            object4 = null;
        }
        object2 = ym2_02;
        n4 = n7;
        n7 = n8;
        return new ym2_0(n4, n8, l2, (vl3_0)object4, 496);
    }
}


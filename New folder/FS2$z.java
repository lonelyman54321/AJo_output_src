/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$z
extends Lambda
implements Function1 {
    public static final FS2$z c;

    static {
        FS2$z fS2$z;
        c = fS2$z = new Lambda(1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        b13_0 b13_02;
        void var4_11;
        void var4_7;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        object = (List)object;
        int n3 = 0;
        Object e2 = object.get(0);
        Object object2 = FS2.q;
        Boolean bl2 = Boolean.FALSE;
        boolean bl3 = Intrinsics.areEqual(e2, bl2);
        Object object3 = null;
        if ((!bl3 || (bl3 = object2 instanceof GS2)) && e2 != null) {
            object2 = ((GS2)object2).b;
            OX oX = (OX)object2.invoke(e2);
        } else {
            n3 = 0;
            Object var4_5 = null;
        }
        Intrinsics.checkNotNull(var4_7);
        long l2 = var4_7.a;
        n3 = 1;
        Object e5 = object.get(n3);
        object2 = FS2.s;
        boolean bl4 = Intrinsics.areEqual(e5, bl2);
        if ((!bl4 || (bl4 = object2 instanceof GS2)) && e5 != null) {
            object2 = ((GS2)object2).b;
            e72 e722 = (e72)object2.invoke(e5);
        } else {
            n3 = 0;
            Object var4_9 = null;
        }
        Intrinsics.checkNotNull(var4_11);
        long l3 = var4_11.a;
        n3 = 2;
        object = object.get(n3);
        if (object != null) {
            object3 = object;
            object3 = (Float)object;
        }
        Intrinsics.checkNotNull(object3);
        float f5 = ((Number)object3).floatValue();
        b13_0 b13_03 = b13_02;
        return new b13_0(l2, l3, f5);
    }
}


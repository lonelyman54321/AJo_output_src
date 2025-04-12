/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from nl3
 */
public final class nl3_0
extends Lambda
implements gx0_2 {
    public static final nl3_0 c;

    static {
        nl3_0 nl3_02;
        c = nl3_02 = new Lambda(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (gr3$b)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        int n3 = -1079955085;
        object2.K(n3);
        object3 = Yh1.Focused;
        Yh1 yh1 = Yh1.UnfocusedEmpty;
        boolean bl2 = object.c(object3, (Object)yh1);
        int n4 = 67;
        if (bl2) {
            object = ex0_0.c;
            n3 = 2;
            boolean bl3 = false;
            yh1 = null;
            object = Hl.c(n4, 0, (cx0_0)object, n3);
        } else {
            int n7;
            n3 = (int)(object.c((Object)yh1, object3) ? 1 : 0);
            if (n3 == 0 && (n7 = object.c(object3 = Yh1.UnfocusedNotEmpty, (Object)yh1)) == 0) {
                n7 = 7;
                n3 = 0;
                object3 = null;
                boolean bl4 = false;
                yh1 = null;
                object = Hl.b(0.0f, n7, null);
            } else {
                object = ex0_0.c;
                int n8 = 83;
                object = object3 = new Qs3(n8, n4, (cx0_0)object);
            }
        }
        object2.E();
        return object;
    }
}


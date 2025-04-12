/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;

/*
 * Renamed from tT0
 */
public final class tt0_2 {
    public static final c33 a(es0_2 object) {
        Object object2;
        Object object3;
        dr$a_1 dr$a_1 = dr_2.V;
        dr$a_1.getClass();
        int n3 = dr$a_1.b;
        int n4 = 1;
        if (n4 >= n3) {
            n3 = 1;
        }
        n3 -= n4;
        n4 = object instanceof ir_2;
        if (n4 != 0) {
            object3 = object;
            object3 = (ir_2)object;
            object2 = ((ir_2)object3).i();
            if (object2 != null) {
                int n7 = -3;
                he_2 he_22 = ((ir_2)object3).c;
                int n8 = ((ir_2)object3).b;
                if (n8 != n7 && n8 != (n7 = -2) && n8 != 0) {
                    n3 = n8;
                } else {
                    he_2 he_23 = he_2.SUSPEND;
                    if (he_22 != he_23 || n8 == 0) {
                        n3 = 0;
                        dr$a_1 = null;
                    }
                }
                object3 = ((ir_2)object3).a;
                object = new c33(n3, he_22, (es0_2)object2, (CoroutineContext)object3);
                return object;
            }
        }
        object2 = he_2.SUSPEND;
        f f5 = f.a;
        object3 = new c33(n3, (he_2)((Object)object2), (es0_2)object, f5);
        return object3;
    }
}


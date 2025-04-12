/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import kotlin.jvm.internal.Reflection;

public class ur3
implements BD3 {
    public static final tr3 b(gr3 gr32) {
        tr3 tr32;
        Object object = gr32.a.a();
        if (object != null) {
            String string2;
            Object object2 = object.getClass().getEnumConstants();
            if (object2 == null || (object2 = tp_2.O(object2)) == null) {
                object2 = O03.b(object);
            }
            if ((string2 = gr32.c) == null) {
                object = Reflection.getOrCreateKotlinClass(object.getClass());
                object.getSimpleName();
            }
            tr32 = new tr3(gr32, (Set)object2);
        } else {
            tr32 = null;
        }
        return tr32;
    }

    public void a() {
    }

    public void onAnimationCancel() {
    }
}


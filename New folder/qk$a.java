/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import kotlin.jvm.internal.Reflection;

public final class qk$a {
    public static qk_0 a(gr3 gr32) {
        boolean bl2 = qk_0.c;
        Object object = null;
        if (!bl2) {
            return null;
        }
        Object object2 = gr32.a.a();
        if (object2 != null) {
            String string2;
            object = object2.getClass().getEnumConstants();
            if (object == null || (object = tp_2.O(object)) == null) {
                object = O03.b(object2);
            }
            if ((string2 = gr32.c) == null) {
                object2 = Reflection.getOrCreateKotlinClass(object2.getClass());
                object2.getSimpleName();
            }
            qk_0 qk_02 = new qk_0(gr32, (Set)object);
            object = qk_02;
        }
        return object;
    }
}


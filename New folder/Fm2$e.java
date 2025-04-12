/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.util.Map;

public final class Fm2$e
extends fm2_2 {
    public final Method a;
    public final int b;
    public final boolean c;

    public Fm2$e(Method method, int n3, boolean bl2) {
        this.a = method;
        this.b = n3;
        this.c = bl2;
    }

    public final void a(sj2_1 object, Object object2) {
        object2 = (Map)object2;
        int n3 = this.b;
        Method method = this.a;
        if (object2 != null) {
            boolean bl2;
            object2 = object2.entrySet().iterator();
            while (bl2 = object2.hasNext()) {
                Object object3 = (Map.Entry)object2.next();
                String string2 = (String)object3.getKey();
                if (string2 != null) {
                    if ((object3 = object3.getValue()) != null) {
                        object3 = object3.toString();
                        boolean bl3 = this.c;
                        ((sj2_1)object).b(string2, (String)object3, bl3);
                        continue;
                    }
                    object = cP.a("Header map contained null value for key '", string2, "'.");
                    object2 = new Object[]{};
                    throw cz3_0.k(method, n3, (String)object, (Object[])object2);
                }
                object2 = new Object[]{};
                throw cz3_0.k(method, n3, "Header map contained null key.", (Object[])object2);
            }
            return;
        }
        object2 = new Object[]{};
        throw cz3_0.k(method, n3, "Header map was null.", (Object[])object2);
    }
}


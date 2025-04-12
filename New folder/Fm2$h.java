/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.util.Map;

public final class Fm2$h
extends fm2_2 {
    public final Method a;
    public final int b;
    public final x80_0 c;
    public final String d;

    public Fm2$h(Method method, int n3, x80_0 x80_02, String string2) {
        this.a = method;
        this.b = n3;
        this.c = x80_02;
        this.d = string2;
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
                Object object4 = (String)object3.getKey();
                if (object4 != null) {
                    if ((object3 = object3.getValue()) != null) {
                        object4 = cP.a("form-data; name=\"", (String)object4, "\"");
                        String string2 = "Content-Transfer-Encoding";
                        String string3 = this.d;
                        object4 = m41$b.c(new String[]{"Content-Disposition", object4, string2, string3});
                        x80_0 x80_02 = this.c;
                        object3 = (pj2_2)x80_02.convert(object3);
                        ((sj2_1)object).c((m41_0)object4, (pj2_2)object3);
                        continue;
                    }
                    object = cP.a("Part map contained null value for key '", (String)object4, "'.");
                    object2 = new Object[]{};
                    throw cz3_0.k(method, n3, (String)object, (Object[])object2);
                }
                object2 = new Object[]{};
                throw cz3_0.k(method, n3, "Part map contained null key.", (Object[])object2);
            }
            return;
        }
        object2 = new Object[]{};
        throw cz3_0.k(method, n3, "Part map was null.", (Object[])object2);
    }
}


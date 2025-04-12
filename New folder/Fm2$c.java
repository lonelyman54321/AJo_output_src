/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.util.Map;

public final class Fm2$c
extends fm2_2 {
    public final Method a;
    public final int b;
    public final boolean c;

    public Fm2$c(Method method, int n3, boolean bl2) {
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
                Map.Entry entry = (Map.Entry)object2.next();
                String string2 = (String)entry.getKey();
                if (string2 != null) {
                    entry = entry.getValue();
                    String string3 = "'.";
                    if (entry != null) {
                        String string4 = entry.toString();
                        if (string4 != null) {
                            bl2 = this.c;
                            ((sj2_1)object).a(string2, string4, bl2);
                            continue;
                        }
                        object = new StringBuilder("Field map value '");
                        ((StringBuilder)object).append(entry);
                        ((StringBuilder)object).append("' converted to null by ");
                        object2 = vE$d.class.getName();
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append(" for key '");
                        ((StringBuilder)object).append(string2);
                        ((StringBuilder)object).append(string3);
                        object = ((StringBuilder)object).toString();
                        object2 = new Object[]{};
                        throw cz3_0.k(method, n3, (String)object, (Object[])object2);
                    }
                    object = cP.a("Field map contained null value for key '", string2, string3);
                    object2 = new Object[]{};
                    throw cz3_0.k(method, n3, (String)object, (Object[])object2);
                }
                object2 = new Object[]{};
                throw cz3_0.k(method, n3, "Field map contained null key.", (Object[])object2);
            }
            return;
        }
        object2 = new Object[]{};
        throw cz3_0.k(method, n3, "Field map was null.", (Object[])object2);
    }
}


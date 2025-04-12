/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from mk1
 */
public final class mk1_0 {
    public final Class a;
    public final Object b;
    public final Method c;
    public final List d;

    public mk1_0(Class object, Object object2, Method method, ArrayList arrayList) {
        this.a = object;
        this.b = object2;
        this.c = method;
        this.d = object = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        String string2 = this.a.getName();
        String string3 = this.c.getName();
        List list = this.d;
        Object[] objectArray = new Object[]{string2, string3, list};
        return String.format("%s.%s() %s", objectArray);
    }
}


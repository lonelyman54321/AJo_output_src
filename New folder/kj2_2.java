/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KJ2
 */
public final class kj2_2 {
    public final ob1_1 a;
    public final String b;
    public final m41_0 c;
    public final pj2_2 d;
    public final Map e;
    public ti_1 f;

    public kj2_2(ob1_1 ob1_12, String string2, m41_0 m41_02, pj2_2 pj2_22, Map map2) {
        Intrinsics.checkNotNullParameter(ob1_12, "url");
        Intrinsics.checkNotNullParameter(string2, "method");
        Intrinsics.checkNotNullParameter(m41_02, "headers");
        Intrinsics.checkNotNullParameter(map2, "tags");
        this.a = ob1_12;
        this.b = string2;
        this.c = m41_02;
        this.d = pj2_22;
        this.e = map2;
    }

    public final ti_1 a() {
        ti_1 ti_12 = this.f;
        if (ti_12 == null) {
            ti_12 = ti_1.n;
            this.f = ti_12 = TI$b.a(this.c);
        }
        return ti_12;
    }

    public final String b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        return this.c.a(string2);
    }

    public final KJ2$a c() {
        Intrinsics.checkNotNullParameter(this, "request");
        KJ2$a kJ2$a = new Object();
        Object object = new LinkedHashMap();
        kJ2$a.e = object;
        kJ2$a.a = object = this.a;
        kJ2$a.b = object = this.b;
        kJ2$a.d = object = this.d;
        object = this.e;
        boolean bl2 = object.isEmpty();
        object = bl2 ? new LinkedHashMap() : fh1_2.q((Map)object);
        kJ2$a.e = object;
        kJ2$a.c = object = this.c.e();
        return kJ2$a;
    }

    public final Object d(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "type");
        Object v4 = this.e.get(clazz);
        return clazz.cast(v4);
    }

    public final String toString() {
        String string2;
        CharSequence charSequence = new StringBuilder("Request{method=");
        Iterator iterator = this.b;
        ((StringBuilder)charSequence).append((String)((Object)iterator));
        ((StringBuilder)charSequence).append(", url=");
        iterator = this.a;
        ((StringBuilder)charSequence).append(iterator);
        iterator = this.c;
        int n3 = ((m41_0)((Object)iterator)).size();
        if (n3 != 0) {
            boolean bl2;
            ((StringBuilder)charSequence).append(", headers=[");
            iterator = iterator.iterator();
            n3 = 0;
            string2 = null;
            while (bl2 = iterator.hasNext()) {
                Object object = iterator.next();
                int n4 = n3 + 1;
                if (n3 >= 0) {
                    object = (Pair)object;
                    String string3 = (String)((Pair)object).a;
                    object = (String)((Pair)object).b;
                    if (n3 > 0) {
                        string2 = ", ";
                        ((StringBuilder)charSequence).append(string2);
                    }
                    ((StringBuilder)charSequence).append(string3);
                    ((StringBuilder)charSequence).append(':');
                    ((StringBuilder)charSequence).append((String)object);
                    n3 = n4;
                    continue;
                }
                xx_2.n();
                throw null;
            }
            char c2 = ']';
            ((StringBuilder)charSequence).append(c2);
        }
        if ((n3 = (iterator = this.e).isEmpty() ^ 1) != 0) {
            string2 = ", tags=";
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(iterator);
        }
        ((StringBuilder)charSequence).append('}');
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}


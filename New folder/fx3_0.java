/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fx3
 */
public final class fx3_0
implements Serializable {
    public static final fx3$a Companion;
    public final String a;
    public final int b;
    public final im2_2 c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;
    public final iu3_0 i;
    public final iu3_0 j;
    public final hh3_2 k;
    public final hh3_2 l;
    public final hh3_2 m;
    public final hh3_2 n;

    static {
        fx3$a fx3$a;
        Companion = fx3$a = new fx3$a();
    }

    public fx3_0(iu3_0 object, String object2, int n3, ArrayList arrayList, im2_2 im2_22, String string2, String string3, String string4, String string5) {
        int n4;
        Intrinsics.checkNotNullParameter(object2, "host");
        Intrinsics.checkNotNullParameter(arrayList, "pathSegments");
        Intrinsics.checkNotNullParameter(im2_22, "parameters");
        String string6 = "fragment";
        Intrinsics.checkNotNullParameter(string2, string6);
        string2 = "urlString";
        Intrinsics.checkNotNullParameter(string5, string2);
        this.a = object2;
        this.b = n3;
        this.c = im2_22;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        if (n3 >= 0 && n3 < (n4 = 65536)) {
            n3 = 1;
            object2 = new tv1_2(arrayList, n3);
            yr1_2.b((Function0)object2);
            this.i = object;
            if (object == null) {
                object = iu3_0.c;
            }
            this.j = object;
            object = new bx3_0(arrayList, this);
            this.k = object = yr1_2.b((Function0)object);
            object = new cx3_0(this);
            this.l = object = yr1_2.b((Function0)object);
            object = new dx3_0(this);
            yr1_2.b((Function0)object);
            object = new ex3_0(this);
            this.m = object = yr1_2.b((Function0)object);
            object = new hj_0(this, 1);
            this.n = object = yr1_2.b((Function0)object);
            object = new ij_0(this, 3);
            yr1_2.b((Function0)object);
            return;
        }
        object = hj0_0.a(n3, "Port must be between 0 and 65535, or 0 if not set. Provided: ");
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    private final Object writeReplace() {
        mx3_0 mx3_02 = mx3_0.a;
        Intrinsics.checkNotNullParameter(mx3_02, "serializer");
        Intrinsics.checkNotNullParameter(this, "value");
        fm0_2 fm0_22 = new fm0_2(mx3_02, this);
        return fm0_22;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<fx3_0> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = fx3_0.class) == (object2 = object.getClass())) {
            object = (fx3_0)object;
            object2 = this.f;
            object = ((fx3_0)object).f;
            return Intrinsics.areEqual(object2, object);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return this.f;
    }
}


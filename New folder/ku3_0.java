/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ku3
 */
public final class ku3_0 {
    public static final fx3_0 a(eu3_0 eu3_02) {
        Intrinsics.checkNotNullParameter(eu3_02, "builder");
        eu3_0 eu3_03 = new eu3_0(0);
        ku3_0.c(eu3_03, eu3_02);
        return eu3_03.b();
    }

    public static final fx3_0 b(String string2) {
        Object object = "urlString";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = new eu3_0(0);
        return hu3_0.b((eu3_0)object, string2).b();
    }

    public static final void c(eu3_0 eu3_02, eu3_0 eu3_03) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(eu3_02, "<this>");
        Intrinsics.checkNotNullParameter(eu3_03, "url");
        Object object = eu3_03.d;
        eu3_02.d = object;
        object = eu3_03.a;
        eu3_02.d((String)object);
        int n3 = eu3_03.c;
        eu3_02.e(n3);
        object = eu3_03.h;
        String string2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, string2);
        eu3_02.h = object;
        eu3_02.e = object = eu3_03.e;
        eu3_02.f = object = eu3_03.f;
        object = mm2_1.a();
        jm2_2 jm2_22 = eu3_03.i;
        ze3_2.a((ve3_2)object, jm2_22);
        Intrinsics.checkNotNullParameter(object, "value");
        eu3_02.i = object;
        jm2_22 = new jx3_0((km2_2)object);
        eu3_02.j = jm2_22;
        object = eu3_03.g;
        Intrinsics.checkNotNullParameter(object, string2);
        eu3_02.g = object;
        eu3_02.b = bl2 = eu3_03.b;
    }
}


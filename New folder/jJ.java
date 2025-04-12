/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class jJ {
    public final rq1_2 a;
    public final rq1_2 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final m41_0 f;

    public jJ(ie2_2 object) {
        long l2;
        int n3 = 1;
        Object object2 = et1_2.NONE;
        Object object3 = new hj_0(this, 0);
        this.a = object3 = yr1_2.a(object2, (Function0)object3);
        object3 = new ij_0(this, 0);
        object2 = yr1_2.a(object2, (Function0)object3);
        this.b = object2;
        long l3 = Long.MAX_VALUE;
        this.c = l2 = Long.parseLong(((ie2_2)object).x(l3));
        this.d = l2 = Long.parseLong(((ie2_2)object).x(l3));
        String string2 = ((ie2_2)object).x(l3);
        int n4 = Integer.parseInt(string2);
        if (n4 > 0) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        this.e = n4;
        string2 = ((ie2_2)object).x(l3);
        n4 = Integer.parseInt(string2);
        m41$a_0 m41$a_0 = new m41$a_0();
        for (int i3 = 0; i3 < n4; i3 += n3) {
            int n7;
            String string3 = ((ie2_2)object).x(l3);
            int n8 = StringsKt.N(string3, ':', 0, false, 6);
            if (n8 != (n7 = -1)) {
                String string4 = string3.substring(0, n8);
                String string5 = "substring(...)";
                Intrinsics.checkNotNullExpressionValue(string4, string5);
                string4 = ((Object)StringsKt.m0(string4)).toString();
                string3 = string3.substring(n8 += n3);
                Intrinsics.checkNotNullExpressionValue(string3, string5);
                m41$a_0.d(string4, string3);
                continue;
            }
            object = "Unexpected header: ".concat(string3);
            object = object.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        this.f = object = m41$a_0.e();
    }

    public jJ(cl2_2 object) {
        boolean bl2;
        long l2;
        Object object2 = et1_2.NONE;
        Object object3 = new hj_0(this, 0);
        this.a = object3 = yr1_2.a(object2, (Function0)object3);
        object3 = new ij_0(this, 0);
        object2 = yr1_2.a(object2, (Function0)object3);
        this.b = object2;
        this.c = l2 = ((cl2_2)object).k;
        this.d = l2 = ((cl2_2)object).l;
        object2 = ((cl2_2)object).e;
        if (object2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        this.e = bl2;
        this.f = object = ((cl2_2)object).f;
    }

    public final void a(he2_2 he2_22) {
        long l2 = this.c;
        he2_22.Y(l2);
        int n3 = 10;
        he2_22.writeByte(n3);
        long l3 = this.d;
        he2_22.Y(l3);
        he2_22.writeByte(n3);
        boolean bl2 = this.e;
        l3 = bl2 ? 1L : 0L;
        he2_22.Y(l3);
        he2_22.writeByte(n3);
        m41_0 m41_02 = this.f;
        long l4 = m41_02.size();
        he2_22.Y(l4);
        he2_22.writeByte(n3);
        int n4 = m41_02.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            String string2 = m41_02.c(i3);
            he2_22.D(string2);
            he2_22.D(": ");
            string2 = m41_02.g(i3);
            he2_22.D(string2);
            he2_22.writeByte(n3);
        }
    }
}


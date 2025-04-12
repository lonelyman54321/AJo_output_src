/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ok
 */
public final class ok_0
implements t20 {
    public final Object a;
    public final ni3_0 b;

    public ok_0(pk_0 object) {
        Object object2;
        Object object3 = ((pk_0)object).c.d();
        Object object4 = ((pk_0)object).c.d();
        this.a = object2 = ((pk_0)object).a.a.getValue();
        Gl gl = ((pk_0)object).b;
        object = ((pk_0)object).c;
        Vs3 vs3 = ((Lj)object).a;
        object2 = vs3.b();
        object = ((Lj)object).c.c;
        object = object2.invoke(object);
        Object object5 = object = vs3.a().invoke(object);
        object5 = (Ol)object;
        this.b = object2 = new ni3_0(gl, vs3, object3, object4, (Ol)object5);
    }

    public final long a() {
        long l2 = this.b.e();
        long l3 = 999999;
        l2 += l3;
        l3 = 1000000;
        return l2 / l3;
    }
}


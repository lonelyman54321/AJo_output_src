/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from wi0
 */
public final class wi0_1
implements BP1 {
    public final wi0$a a;

    public wi0_1(wi0$c$a wi0$c$a) {
        this.a = wi0$c$a;
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 object2) {
        k62 k622 = new k62(object);
        object = object.toString();
        wi0$a wi0$a = this.a;
        object2 = new wi0$b((String)object, wi0$a);
        BP1$a bP1$a = new BP1$a(k622, (ei0_0)object2);
        return bP1$a;
    }

    public final boolean b(Object object) {
        return object.toString().startsWith("data:image");
    }
}


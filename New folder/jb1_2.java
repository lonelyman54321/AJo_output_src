/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from jb1
 */
public abstract class jb1_2
implements ma1_0,
i90_0 {
    public abstract ea1_2 a();

    public abstract uf_1 b();

    public abstract by0_2 c();

    public abstract by0_2 d();

    public abstract ub1_2 e();

    public abstract wa1_1 f();

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpResponse[");
        Object object = mb1_1.b(this).getUrl();
        stringBuilder.append(object);
        stringBuilder.append(", ");
        object = this.e();
        stringBuilder.append(object);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}


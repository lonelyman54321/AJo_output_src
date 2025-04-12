/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Kn0$b
 */
public final class kn0$b_0
extends bg2$d_0 {
    public final Long a;
    public final k70_0 b;
    public final /* synthetic */ Object c;

    public kn0$b_0(is2_2 object, k70_0 k70_02, Object object2) {
        this.c = object2;
        object = ((db1_2)((is2_2)object).a).c;
        object2 = ja1_1.a;
        object2 = "Content-Length";
        object = ((xe3_2)object).e((String)object2);
        if (object != null) {
            long l2 = Long.parseLong((String)object);
            object = l2;
        } else {
            object = null;
        }
        this.a = object;
        if (k70_02 == null) {
            object = k70$a.a;
            k70_02 = k70$a.b;
        }
        this.b = k70_02;
    }

    public final Long a() {
        return this.a;
    }

    public final k70_0 b() {
        return this.b;
    }

    public final uf_1 e() {
        return (uf_1)this.c;
    }
}


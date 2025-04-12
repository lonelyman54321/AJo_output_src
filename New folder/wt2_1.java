/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from wT2
 */
public final class wt2_1
implements T01 {
    public hr1_0 a;
    public T01 b;

    public final void a(W01 w01) {
        T01 t01 = this.b;
        if (t01 != null) {
            t01.a(w01);
        }
    }

    public final W01 b() {
        Object object = this.b;
        if (object != null) {
            object = object.b();
            hr1_0 hr1_02 = this.a;
            if (hr1_02 == null) {
                int n3 = 1;
                hr1_02 = new hr1_0(n3);
                hr1_02.b(object);
                this.a = hr1_02;
            } else {
                hr1_02.b(object);
            }
            return object;
        }
        bh1_1.c("GraphicsContext not provided");
        throw null;
    }

    public final void c() {
        hr1_0 hr1_02 = this.a;
        if (hr1_02 != null) {
            int n3;
            Object[] objectArray = hr1_02.a;
            int n4 = hr1_02.b;
            for (n3 = 0; n3 < n4; ++n3) {
                W01 w01 = (W01)objectArray[n3];
                this.a(w01);
            }
            objectArray = hr1_02.a;
            n4 = hr1_02.b;
            n3 = 0;
            rp_1.n(0, n4, null, objectArray);
            hr1_02.b = 0;
        }
    }
}


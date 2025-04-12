/*
 * Decompiled with CFR 0.152.
 */
public final class Qq2$a
extends Uq2 {
    public qq2_0 g;

    public Qq2$a(qq2_0 qq2_02) {
        int n3;
        Object object;
        this.a = qq2_02;
        this.b = object;
        this.c = object = qq2_02.d;
        this.f = n3 = qq2_02.g();
        this.g = qq2_02;
    }

    public final qq2_0 i() {
        Object object = this.c;
        qq2_0 qq2_02 = this.g;
        hs3_0 hs3_02 = qq2_02.d;
        if (object != hs3_02) {
            this.b = object = new Object();
            object = this.c;
            int n3 = this.e();
            qq2_02 = new Sq2((hs3_0)object, n3);
        }
        this.g = qq2_02;
        return qq2_02;
    }
}


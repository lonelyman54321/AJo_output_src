/*
 * Decompiled with CFR 0.152.
 */
public final class hP2$a
extends p0_0 {
    public int c;
    public int d;
    public final /* synthetic */ hp2_2 e;

    public hP2$a(hp2_2 hp2_22) {
        int n3;
        int n4;
        this.e = hp2_22;
        this.c = n4 = hp2_22.a();
        this.d = n3 = hp2_22.d;
    }

    public final void a() {
        int n3 = this.c;
        if (n3 == 0) {
            hb3_1 hb3_12;
            this.a = hb3_12 = hb3_1.Done;
        } else {
            hp2_2 hp2_22 = this.e;
            Object object = hp2_22.b;
            int n4 = this.d;
            this.b = object = object[n4];
            this.a = object = hb3_1.Ready;
            ++n4;
            int n7 = hp2_22.c;
            this.d = n4 %= n7;
            this.c = n3 += -1;
        }
    }
}


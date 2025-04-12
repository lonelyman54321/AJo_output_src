/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ms3
 */
public final class ms3_0
extends is3_0 {
    public final xq2_0 d;

    public ms3_0(xq2_0 xq2_02) {
        this.d = xq2_02;
    }

    public final Object next() {
        int n3;
        int n4 = this.c;
        this.c = n3 = n4 + 2;
        Object object = this.a;
        Object object2 = object[n4];
        Object object3 = object[++n4];
        object = this.d;
        er1_1 er1_12 = new er1_1((xq2_0)object, object2, object3);
        return er1_12;
    }
}


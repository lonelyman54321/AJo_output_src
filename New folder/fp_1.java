/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fp
 */
public final class fp_1 {
    public final Object[] a;
    public Object[] b;
    public int c;

    public fp_1() {
        Object[] objectArray = new Object[5];
        this.a = objectArray;
        this.b = objectArray;
    }

    public final void a(Object object) {
        int n3 = this.c;
        int n4 = 4;
        if (n3 == n4) {
            Object[] objectArray = new Object[5];
            Object[] objectArray2 = this.b;
            objectArray2[n4] = objectArray;
            this.b = objectArray;
            n3 = 0;
            objectArray = null;
        }
        this.b[n3] = object;
        this.c = ++n3;
    }
}


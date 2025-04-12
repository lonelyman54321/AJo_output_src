/*
 * Decompiled with CFR 0.152.
 */
public final class Aw2 {
    public final Object[] a;
    public int b;

    public Aw2() {
        Object[] objectArray = new Object[256];
        this.a = objectArray;
    }

    public final void a(Object object) {
        int n3 = this.b;
        Object[] objectArray = this.a;
        int n4 = objectArray.length;
        if (n3 < n4) {
            objectArray[n3] = object;
            this.b = ++n3;
        }
    }
}


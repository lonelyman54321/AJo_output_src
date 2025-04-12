/*
 * Decompiled with CFR 0.152.
 */
public final class DF0$a {
    public final qp3 a;
    public final int[] b;

    public DF0$a(qp3 qp32, int[] nArray) {
        int n3 = nArray.length;
        if (n3 == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            String string2 = "Empty tracks are not allowed";
            Cx.d(string2, illegalArgumentException);
        }
        this.a = qp32;
        this.b = nArray;
    }
}


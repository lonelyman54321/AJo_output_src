/*
 * Decompiled with CFR 0.152.
 */
public final class zB2$b {
    public final int a;
    public final int b;
    public final float[] c;
    public final float[] d;

    public zB2$b(int n3, int n4, float[] fArray, float[] fArray2) {
        this.a = n3;
        long l2 = (long)fArray.length * (long)2;
        long l3 = fArray2.length;
        long l4 = 3;
        long l7 = l2 - (l3 *= l4);
        n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
        n3 = n3 == 0 ? 1 : 0;
        ct3.a(n3 != 0);
        this.c = fArray;
        this.d = fArray2;
        this.b = n4;
    }
}


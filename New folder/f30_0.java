/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from f30
 */
public final class f30_0
extends c30_0 {
    public final boolean c;

    public f30_0(lm1_2 lm1_22, boolean bl2) {
        Intrinsics.checkNotNullParameter(lm1_22, "writer");
        super(lm1_22);
        this.c = bl2;
    }

    public final void d(byte by2) {
        boolean bl2 = this.c;
        if (bl2) {
            by2 = (byte)(by2 & 0xFF);
            String string2 = String.valueOf(by2);
            this.j(string2);
        } else {
            by2 = (byte)(by2 & 0xFF);
            String string3 = String.valueOf(by2);
            this.h(string3);
        }
    }

    public final void f(int n3) {
        boolean bl2 = this.c;
        int n4 = 10;
        long l2 = 0xFFFFFFFFL;
        if (bl2) {
            long l3 = n3;
            String string2 = Long.toString(l2 &= l3, n4);
            this.j(string2);
        } else {
            long l4 = n3;
            String string3 = Long.toString(l2 &= l4, n4);
            this.h(string3);
        }
    }

    public final void g(long l2) {
        Object object = this.c;
        int n3 = 63;
        int n4 = 5;
        int n7 = 1;
        int n8 = 10;
        String string2 = "0";
        long l3 = 0L;
        int n10 = 64;
        if (object != 0) {
            Object object2 = mt3_0.b;
            object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object != 0) {
                if (object > 0) {
                    string2 = Long.toString(l2, n8);
                } else {
                    object2 = new char[n10];
                    long l4 = l2 >>> n7;
                    long l7 = n4;
                    l4 /= l7;
                    l7 = n8;
                    long l8 = l4 * l7;
                    int n14 = (int)(l2 -= l8);
                    char c2 = Character.forDigit(n14, n8);
                    object2[n3] = c2;
                    while ((c2 = (char)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1))) > '\u0000') {
                        l2 = l4 % l7;
                        n14 = (int)l2;
                        c2 = Character.forDigit(n14, n8);
                        object2[n3 += -1] = c2;
                        l4 /= l7;
                    }
                    string2 = new String((char[])object2, n3, n10 -= n3);
                }
            }
            this.j(string2);
        } else {
            Object object3 = mt3_0.b;
            object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object != 0) {
                if (object > 0) {
                    string2 = Long.toString(l2, n8);
                } else {
                    object3 = new char[n10];
                    long l12 = l2 >>> n7;
                    long l14 = n4;
                    l12 /= l14;
                    l14 = n8;
                    long l15 = l12 * l14;
                    int n15 = (int)(l2 -= l15);
                    char c3 = Character.forDigit(n15, n8);
                    object3[n3] = c3;
                    while ((c3 = (char)(l12 == l3 ? 0 : (l12 < l3 ? -1 : 1))) > '\u0000') {
                        l2 = l12 % l14;
                        n15 = (int)l2;
                        c3 = Character.forDigit(n15, n8);
                        object3[n3 += -1] = c3;
                        l12 /= l14;
                    }
                    string2 = new String((char[])object3, n3, n10 -= n3);
                }
            }
            this.h(string2);
        }
    }

    public final void i(short s7) {
        boolean bl2 = this.c;
        char c2 = (char)-1;
        if (bl2) {
            s7 = (short)(s7 & c2);
            String string2 = String.valueOf(s7);
            this.j(string2);
        } else {
            s7 = (short)(s7 & c2);
            String string3 = String.valueOf(s7);
            this.h(string3);
        }
    }
}


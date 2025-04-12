/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from V0
 */
public final class v0_0
extends k0_0 {
    public final i0_0 a;
    public final /* synthetic */ w0_0 b;
    public final /* synthetic */ String c;

    public v0_0(w0_0 object, String string2) {
        this.b = object;
        this.c = string2;
        this.a = object = ((w0_0)object).b.b;
    }

    public final void J(int n3) {
        String string2 = Long.toString((long)n3 & 0xFFFFFFFFL, 10);
        this.Z(string2);
    }

    public final void Z(String object) {
        Intrinsics.checkNotNullParameter(object, "s");
        tm1_1 tm1_12 = new tm1_1(object, false, null);
        object = this.b;
        String string2 = this.c;
        ((w0_0)object).V(string2, tm1_12);
    }

    public final i0_0 a() {
        return this.a;
    }

    public final void g(byte by2) {
        String string2 = String.valueOf(by2 & 0xFF);
        this.Z(string2);
    }

    public final void q(long l2) {
        String string2;
        int n3 = 64;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            string2 = "0";
        } else {
            int n4 = 10;
            if (object > 0) {
                string2 = Long.toString(l2, n4);
            } else {
                char[] cArray = new char[n3];
                int n7 = 1;
                long l7 = l2 >>> n7;
                int n8 = 5;
                long l8 = n8;
                l7 /= l8;
                l8 = n4;
                long l12 = l7 * l8;
                char c2 = Character.forDigit((int)(l2 -= l12), n4);
                int n10 = 63;
                cArray[n10] = c2;
                while ((c2 = (char)(l7 == l3 ? 0 : (l7 < l3 ? -1 : 1))) > '\u0000') {
                    l12 = l7 % l8;
                    cArray[n10 += -1] = c2 = Character.forDigit((int)l12, n4);
                    l7 /= l8;
                }
                string2 = new String(cArray, n10, n3 -= n10);
            }
        }
        this.Z(string2);
    }

    public final void w(short s7) {
        String string2 = String.valueOf(s7 & (char)-1);
        this.Z(string2);
    }
}


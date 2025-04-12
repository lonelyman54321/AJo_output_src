/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from l
 */
public final class l_0 {
    public static final int a = -1234567890;

    public static final boolean a(byte[] byArray, int n3, byte[] byArray2, int n4, int n7) {
        Intrinsics.checkNotNullParameter(byArray, "a");
        Intrinsics.checkNotNullParameter(byArray2, "b");
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = i3 + n3;
            n8 = byArray[n8];
            int n10 = i3 + n4;
            if (n8 == (n10 = byArray2[n10])) continue;
            return false;
        }
        return true;
    }

    public static final void b(long l2, long l3, long l4) {
        long l7;
        long l8;
        long l12;
        long l14 = l3 | l4;
        long l15 = 0L;
        long l16 = l14 - l15;
        Object object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (object >= 0 && (l12 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) <= 0 && (l8 = (l7 = (l14 = l2 - l3) - l4) == 0L ? 0 : (l7 < 0L ? -1 : 1)) >= 0) {
            return;
        }
        CharSequence charSequence = D70.c(l2, "size=", " offset=");
        charSequence.append(l3);
        charSequence.append(" byteCount=");
        charSequence.append(l4);
        charSequence = charSequence.toString();
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)charSequence);
        throw arrayIndexOutOfBoundsException;
    }

    public static final int c(ff_2 ff_22, int n3) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(ff_22, string2);
        int n4 = a;
        if (n3 == n4) {
            return ff_22.d();
        }
        return n3;
    }

    public static final String d(byte by2) {
        char[] cArray = d_0.a;
        int c2 = by2 >> 4 & 0xF;
        char c3 = cArray[c2];
        by2 = (byte)(by2 & 0xF);
        by2 = (byte)cArray[by2];
        cArray = new char[]{c3, (char)by2};
        Intrinsics.checkNotNullParameter(cArray, "<this>");
        String string2 = new String(cArray);
        return string2;
    }
}


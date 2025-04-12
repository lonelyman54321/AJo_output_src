/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EF
 */
public final class ef_2
implements Comparable {
    public static final ef_2 c;
    public static final char[] d;
    public final byte[] a;
    public int b;

    static {
        byte[] byArray = new byte[]{};
        Object object = new ef_2(byArray);
        c = object;
        object = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(object, "toCharArray(...)");
        d = (char[])object;
    }

    public ef_2(byte[] byArray) {
        this.a = byArray;
    }

    public /* synthetic */ ef_2(byte[] byArray, int n3) {
        n3 = byArray.length;
        this(byArray, 0, n3);
    }

    public ef_2(byte[] byArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "data");
        byArray = rp_1.l(n3, byArray, n4);
        this(byArray);
    }

    public final byte a(int n3) {
        int n4;
        byte[] byArray = this.a;
        if (n3 >= 0 && n3 < (n4 = byArray.length)) {
            return byArray[n3];
        }
        CharSequence charSequence = wk0_0.a(n3, "index (", ") is out of byte string bounds: [0..");
        int n7 = byArray.length;
        charSequence = tu.a(charSequence, n7, ')');
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public final int compareTo(Object object) {
        int n3;
        block2: {
            object = (ef_2)object;
            Intrinsics.checkNotNullParameter(object, "other");
            if (object != this) {
                byte[] byArray = ((ef_2)object).a;
                byte[] byArray2 = this.a;
                int n4 = byArray2.length;
                int n7 = byArray.length;
                n4 = Math.min(n4, n7);
                for (n3 = 0; n3 < n4; ++n3) {
                    n7 = byArray2[n3];
                    n7 &= 0xFF;
                    int n8 = byArray[n3] & 0xFF;
                    if ((n7 = Intrinsics.compare(n7, n8)) == 0) continue;
                    n3 = n7;
                    break block2;
                }
                n3 = byArray2.length;
                object = ((ef_2)object).a;
                int n10 = ((Object)object).length;
                n3 = Intrinsics.compare(n3, n10);
            }
        }
        return n3;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<ef_2> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = ef_2.class) == (object2 = object.getClass())) {
            object = (ef_2)object;
            object2 = ((ef_2)object).a;
            int n3 = ((Object)object2).length;
            byte[] byArray = this.a;
            int n4 = byArray.length;
            if (n3 != n4) {
                return false;
            }
            int n7 = ((ef_2)object).b;
            if (n7 != 0 && (n3 = this.b) != 0 && n7 != n3) {
                return false;
            }
            return Arrays.equals(byArray, (byte[])object2);
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.b;
        if (n3 == 0) {
            byte[] byArray = this.a;
            this.b = n3 = Arrays.hashCode(byArray);
        }
        return n3;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        byte[] object = this.a;
        int n3 = object.length;
        if (n3 == 0) {
            return "ByteString(size=0)";
        }
        String string2 = String.valueOf(object.length);
        int n4 = string2.length() + 22;
        int n7 = object.length * 2 + n4;
        StringBuilder stringBuilder = new StringBuilder(n7);
        stringBuilder.append("ByteString(size=");
        stringBuilder.append(string2);
        string2 = " hex=";
        stringBuilder.append(string2);
        for (char c2 : object) {
            char c3 = c2 >>> 4 & 0xF;
            char[] cArray = d;
            c3 = cArray[c3];
            stringBuilder.append(c3);
            c2 &= 0xF;
            c2 = cArray[c2];
            stringBuilder.append(c2);
        }
        stringBuilder.append(')');
        String string3 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return string3;
    }
}


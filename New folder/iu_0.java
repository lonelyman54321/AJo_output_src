/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from iu
 */
public final class iu_0 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public iu_0(ArrayList arrayList, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16, int n17, float f5, String string2) {
        this.a = arrayList;
        this.b = n3;
        this.c = n4;
        this.d = n7;
        this.e = n8;
        this.f = n10;
        this.g = n14;
        this.h = n15;
        this.i = n16;
        this.j = n17;
        this.k = f5;
        this.l = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static iu_0 a(Xm2 xm2) {
        Object object;
        block6: {
            int n3;
            float f5;
            int n4;
            Object object2;
            int n7;
            int n8;
            int n10;
            int n14;
            int n15;
            int n16;
            ArrayList<byte[]> arrayList;
            int n17;
            int n18;
            int n19;
            int n20;
            block7: {
                float f6;
                int n21;
                int n22;
                int n24;
                object = xm2;
                n20 = 0;
                n19 = 3;
                n18 = 4;
                int n25 = 1;
                try {
                    byte[] byArray;
                    byte[] byArray2;
                    xm2.J(n18);
                    n24 = xm2.w() & n19;
                    n17 = n24 + 1;
                    if (n17 == n19) break block6;
                    arrayList = new ArrayList<byte[]>();
                    n24 = xm2.w() & 0x1F;
                    for (n22 = 0; n22 < n24; n22 += n25) {
                        n16 = xm2.C();
                        n15 = ((Xm2)object).b;
                        ((Xm2)object).J(n16);
                        byte[] byArray3 = ((Xm2)object).a;
                        byArray2 = LW.a;
                        n14 = n16 + 4;
                        byArray2 = new byte[n14];
                        byArray = LW.a;
                        System.arraycopy(byArray, 0, byArray2, 0, n18);
                        System.arraycopy(byArray3, n15, byArray2, n18, n16);
                        arrayList.add(byArray2);
                    }
                    n22 = xm2.w();
                    for (n16 = 0; n16 < n22; n16 += n25) {
                        n15 = xm2.C();
                        n10 = ((Xm2)object).b;
                        ((Xm2)object).J(n15);
                        byArray2 = ((Xm2)object).a;
                        byArray = LW.a;
                        n8 = n15 + 4;
                        byArray = new byte[n8];
                        byte[] byArray4 = LW.a;
                        System.arraycopy(byArray4, 0, byArray, 0, n18);
                        System.arraycopy(byArray2, n10, byArray, n18, n15);
                        arrayList.add(byArray);
                    }
                    if (n24 <= 0) break block7;
                    object = arrayList.get(0);
                    object = (byte[])object;
                    Object object3 = arrayList.get(0);
                    object3 = (byte[])object3;
                    n21 = ((Object)object).length;
                    object = DS1.i(n17, object3, n21);
                    n18 = ((DS1$m)object).e;
                    n24 = ((DS1$m)object).f;
                    n22 = ((DS1$m)object).h + 8;
                    n16 = ((DS1$m)object).i + 8;
                    n15 = ((DS1$m)object).p;
                    n10 = ((DS1$m)object).q;
                    n14 = ((DS1$m)object).r;
                    n8 = ((DS1$m)object).s;
                    f6 = ((DS1$m)object).g;
                    n7 = ((DS1$m)object).a;
                    n25 = ((DS1$m)object).b;
                    n21 = ((DS1$m)object).c;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw ParserException.a("Error parsing AVC config", arrayIndexOutOfBoundsException);
                }
                Integer n26 = n7;
                Integer n27 = n25;
                object = n21;
                Object[] objectArray = new Object[n19];
                objectArray[0] = n26;
                n20 = 1;
                objectArray[n20] = n27;
                n20 = 2;
                objectArray[n20] = object;
                object = "avc1.%02X%02X%02X";
                object2 = object = String.format((String)object, objectArray);
                n7 = n14;
                n4 = n8;
                f5 = f6;
                n14 = n16;
                n8 = n15;
                n3 = n10;
                n16 = n18;
                n15 = n24;
                n10 = n22;
            }
            int n28 = -1;
            n20 = 1065353216;
            n19 = 0;
            Object var25_29 = null;
            n18 = 16;
            object2 = null;
            n16 = -1;
            n15 = -1;
            n10 = -1;
            n14 = -1;
            n8 = -1;
            n3 = -1;
            float f7 = 0.0f / 0.0f;
            n7 = -1;
            n4 = 16;
            f5 = 1.0f;
            return new iu_0(arrayList, n17, n16, n15, n10, n14, n8, n3, n7, n4, f5, (String)object2);
        }
        object = new IllegalStateException();
        throw object;
    }
}


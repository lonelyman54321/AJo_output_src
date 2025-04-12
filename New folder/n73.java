/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class n73
implements d33 {
    public final /* synthetic */ int a;

    public /* synthetic */ n73() {
        this.a = 1;
    }

    public static final int b(int[] nArray, int n3) {
        int n4;
        int n7 = nArray.length;
        if ((n3 *= 5) >= n7) {
            n4 = nArray.length;
        } else {
            n7 = n3 + 4;
            n7 = nArray[n7];
            n4 = n73.p(nArray[++n3] >> 29) + n7;
        }
        return n4;
    }

    public static final boolean c(int[] nArray, int n3) {
        n3 *= 5;
        int n4 = 1;
        int n7 = nArray[n3 += n4];
        n3 = 0x4000000;
        if ((n7 &= n3) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public static final int d(int[] nArray, int n3) {
        n3 = n3 * 5 + 4;
        return nArray[n3];
    }

    public static final int e(int[] nArray, int n3) {
        n3 = n3 * 5 + 3;
        return nArray[n3];
    }

    public static final boolean f(int[] nArray, int n3) {
        n3 *= 5;
        int n4 = 1;
        int n7 = nArray[n3 += n4];
        n3 = 0x10000000;
        if ((n7 &= n3) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public static final boolean g(int[] nArray, int n3) {
        n3 *= 5;
        int n4 = 1;
        int n7 = nArray[n3 += n4];
        n3 = 0x20000000;
        if ((n7 &= n3) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public static final boolean h(int[] nArray, int n3) {
        n3 *= 5;
        int n4 = 1;
        int n7 = nArray[n3 += n4];
        n3 = 0x40000000;
        if ((n7 &= n3) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public static final int i(ArrayList arrayList, int n3, int n4) {
        int n7 = n73.q(arrayList, n3, n4);
        if (n7 < 0) {
            n7 = -(n7 + 1);
        }
        return n7;
    }

    public static final int j(int[] nArray, int n3) {
        n3 = n3 * 5 + 1;
        return nArray[n3] & 0x3FFFFFF;
    }

    public static final int k(int[] nArray, int n3) {
        int n4 = (n3 *= 5) + 4;
        n4 = nArray[n4];
        return n73.p(nArray[++n3] >> 30) + n4;
    }

    public static final int l(int[] nArray, int n3) {
        n3 = n3 * 5 + 2;
        return nArray[n3];
    }

    public static final int m(int[] nArray, int n3) {
        int n4 = (n3 *= 5) + 4;
        n4 = nArray[n4];
        return n73.p(nArray[++n3] >> 28) + n4;
    }

    public static final void n(int n3, int n4, int[] nArray) {
        boolean bl2 = n4 >= 0;
        p30_0.h(bl2);
        n3 = n3 * 5 + 3;
        nArray[n3] = n4;
    }

    public static final void o(int n3, int n4, int[] nArray) {
        int n7;
        int n8 = 1;
        n7 = n4 >= 0 && n4 < (n7 = 0x3FFFFFF) ? 1 : 0;
        p30_0.h(n7 != 0);
        n3 = n3 * 5 + n8;
        n8 = nArray[n3] & 0xFC000000;
        nArray[n3] = n4 |= n8;
    }

    public static final int p(int n3) {
        int n4 = 1;
        switch (n3) {
            default: {
                n4 = 3;
                break;
            }
            case 3: 
            case 5: 
            case 6: {
                n4 = 2;
                break;
            }
            case 0: {
                n4 = 0;
            }
            case 1: 
            case 2: 
            case 4: 
        }
        return n4;
    }

    public static final int q(ArrayList arrayList, int n3, int n4) {
        int n7 = arrayList.size() + -1;
        int n8 = 0;
        while (n8 <= n7) {
            int n10 = n8 + n7 >>> 1;
            Ae ae2 = (Ae)arrayList.get(n10);
            int n14 = ae2.a;
            if (n14 < 0) {
                n14 += n4;
            }
            if ((n14 = Intrinsics.compare(n14, n3)) < 0) {
                n8 = n10 + 1;
                continue;
            }
            if (n14 > 0) {
                n7 = n10 + -1;
                continue;
            }
            return n10;
        }
        return -(n8 + 1);
    }

    public es0_2 a(jb3_2 object) {
        object = b33.START;
        ps0_2 ps0_22 = new ps0_2(object);
        return ps0_22;
    }

    public String toString() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return super.toString();
            }
            case 1: 
        }
        return "SharingStarted.Eagerly";
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class zp$i
implements zp$e,
zp$l {
    public final float a;
    public final boolean b;
    public final Function2 c;
    public final float d;

    public zp$i() {
        throw null;
    }

    public zp$i(float f5, boolean bl2, Function2 function2) {
        this.a = f5;
        this.b = bl2;
        this.c = function2;
        this.d = f5;
    }

    public final float a() {
        return this.d;
    }

    public final void b(Vo0 object, int n3, int[] nArray, bp1_0 bp1_02, int[] nArray2) {
        int n4;
        int n7;
        int n8;
        int n10;
        bp1_0 bp1_03;
        int n14 = -1;
        int n15 = 1;
        int n16 = nArray.length;
        if (n16 == 0) {
            return;
        }
        float f5 = this.a;
        int n17 = object.e0(f5);
        n16 = (int)(this.b ? 1 : 0);
        int n18 = 0;
        if (n16 != 0 && bp1_02 == (bp1_03 = bp1_0.Rtl)) {
            n16 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n16 = 0;
            f5 = 0.0f;
            bp1_03 = null;
        }
        if (n16 == 0) {
            n14 = nArray.length;
            f5 = 0.0f;
            bp1_03 = null;
            n10 = 0;
            n8 = 0;
            n7 = 0;
            for (n16 = 0; n16 < n14; n16 += n15) {
                n8 = nArray[n16];
                int n19 = n7 + 1;
                int n20 = n3 - n8;
                nArray2[n7] = n10 = Math.min(n10, n20);
                n10 = n3 - n10 - n8;
                n10 = Math.min(n17, n10);
                n8 = nArray2[n7] + n8 + n10;
                n7 = n19;
                n4 = n8;
                n8 = n10;
                n10 = n4;
            }
        } else {
            n10 = 0;
            n8 = 0;
            for (n16 = nArray.length - n15; n14 < n16; n16 += n14) {
                n8 = nArray[n16];
                n7 = n3 - n8;
                nArray2[n16] = n10 = Math.min(n10, n7);
                n10 = n3 - n10 - n8;
                n10 = Math.min(n17, n10);
                n7 = nArray2[n16] + n8;
                n8 = n7 + n10;
                n4 = n8;
                n8 = n10;
                n10 = n4;
            }
        }
        if ((object = this.c) != null && (n10 -= n8) < n3) {
            Integer n21 = n3 - n10;
            object = (Number)object.invoke(n21, (Object)bp1_02);
            n17 = ((Number)object).intValue();
            n3 = nArray2.length;
            while (n18 < n3) {
                int n22;
                nArray2[n18] = n22 = nArray2[n18] + n17;
                n18 += n15;
            }
        }
    }

    public final void c(Vo0 vo0, int n3, int[] nArray, int[] nArray2) {
        bp1_0 bp1_02 = bp1_0.Ltr;
        this.b(vo0, n3, nArray, bp1_02, nArray2);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zp$i;
        if (!bl3) {
            return false;
        }
        object = (zp$i)object;
        float f5 = this.a;
        float f6 = ((zp$i)object).a;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        bl3 = this.b;
        boolean bl4 = ((zp$i)object).b;
        if (bl3 != bl4) {
            return false;
        }
        Function2 function2 = this.c;
        object = ((zp$i)object).c;
        boolean bl5 = Intrinsics.areEqual(function2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        float f5 = this.a;
        int n3 = Float.floatToIntBits(f5) * 31;
        int n4 = this.b;
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        Function2 function2 = this.c;
        if (function2 == null) {
            n4 = 0;
            function2 = null;
        } else {
            n4 = function2.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = this.b;
        Object object = bl2 ? "" : "Absolute";
        stringBuilder.append((String)object);
        stringBuilder.append("Arrangement#spacedAligned(");
        object = xs0_0.b(this.a);
        stringBuilder.append(object);
        stringBuilder.append(", ");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


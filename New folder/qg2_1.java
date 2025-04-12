/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from qg2
 */
public final class qg2_1 {
    public float[] a;
    public double[] b;
    public double[] c;
    public XP1 d;
    public int e;

    public final void a(double d2, float f5) {
        float[] fArray = this.a;
        int n3 = fArray.length + 1;
        double[] dArray = this.b;
        int n4 = Arrays.binarySearch(dArray, d2);
        if (n4 < 0) {
            n4 = -n4 + -1;
        }
        Object[] objectArray = Arrays.copyOf(this.b, n3);
        this.b = objectArray;
        objectArray = Arrays.copyOf(this.a, n3);
        this.a = (float[])objectArray;
        objectArray = new double[n3];
        this.c = objectArray;
        objectArray = this.b;
        int n7 = n4 + 1;
        n3 = n3 - n4 + -1;
        System.arraycopy(objectArray, n4, objectArray, n7, n3);
        this.b[n4] = d2;
        this.a[n4] = f5;
    }

    public final double b(double d2) {
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object <= 0) {
            return d5;
        }
        d5 = 1.0;
        double d9 = d2 - d5;
        object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object >= 0) {
            return d5;
        }
        double[] dArray = this.b;
        int n3 = Arrays.binarySearch(dArray, d2);
        if (n3 < 0) {
            n3 = -n3 + -1;
        }
        float[] fArray = this.a;
        float f5 = fArray[n3];
        int n4 = n3 + -1;
        float f6 = fArray[n4];
        double d12 = f5 - f6;
        double[] dArray2 = this.b;
        double d13 = dArray2[n3];
        double d14 = dArray2[n4];
        double d15 = this.c[n4];
        d5 = f6;
        d13 = (d12 /= (d13 -= d14)) * d14;
        d5 -= d13;
        d13 = (d2 - d14) * d5 + d15;
        d2 *= d2;
        d14 *= d14;
        return (d2 - d14) * d12 / 2.0 + d13;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final double c(double d2, double d5) {
        d2 = this.b(d2) + d5;
        int n3 = this.e;
        double d7 = Math.PI * 2;
        double d9 = 4.0;
        double d12 = 2.0;
        double d13 = 1.0;
        switch (n3) {
            default: {
                return Math.sin(d7 * d2);
            }
            case 7: {
                XP1 xP1 = this.d;
                return xP1.b(d2 %= d13);
            }
            case 6: {
                d2 = Math.abs(d2 * d9 % d9 - d12);
                d2 = d13 - d2;
                d2 *= d2;
                return d13 - d2;
            }
            case 5: {
                return Math.cos((d5 + d2) * d7);
            }
            case 4: {
                d2 = (d2 * d12 + d13) % d12;
                return d13 - d2;
            }
            case 3: {
                return (d2 * d12 + d13) % d12 - d13;
            }
            case 2: {
                d2 = Math.abs((d2 * d9 + d13) % d9 - d12);
                return d13 - d2;
            }
            case 1: 
        }
        return Math.signum(0.5 - (d2 %= d13));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("pos =");
        String string2 = Arrays.toString(this.b);
        stringBuilder.append(string2);
        stringBuilder.append(" period=");
        string2 = Arrays.toString(this.a);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}


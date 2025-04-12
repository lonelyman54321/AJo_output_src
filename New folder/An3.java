/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

public abstract class An3 {
    public zf0_1 a;
    public int b;
    public int[] c;
    public float[][] d;
    public int e;
    public String f;
    public float[] g;
    public boolean h;
    public long i;
    public float j;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float a(float f5) {
        int n3 = this.b;
        float f6 = (float)Math.PI * 2;
        float f7 = 2.0f;
        float f8 = 1.0f;
        switch (n3) {
            default: {
                return (float)Math.sin(f5 * f6);
            }
            case 6: {
                n3 = 0x40800000;
                float f11 = 4.0f;
                f5 = Math.abs(f5 * f11 % f11 - f7);
                f5 = f8 - f5;
                f5 *= f5;
                return f8 - f5;
            }
            case 5: {
                return (float)Math.cos(f5 * f6);
            }
            case 4: {
                f5 = (f5 * f7 + f8) % f7;
                return f8 - f5;
            }
            case 3: {
                return (f5 * f7 + f8) % f7 - f8;
            }
            case 2: {
                f5 = Math.abs(f5);
                return f8 - f5;
            }
            case 1: 
        }
        return Math.signum(f5 * f6);
    }

    public void b(float f5, float f6, float f7, int n3, int n4) {
        int n7;
        int n8 = this.e;
        this.c[n8] = n3;
        float[] fArray = this.d[n8];
        fArray[0] = f5;
        int n10 = 1;
        fArray[n10] = f6;
        fArray[2] = f7;
        this.b = n7 = Math.max(this.b, n4);
        this.e = n7 = this.e + n10;
    }

    public void c(int n3) {
        zf0_1 zf0_12;
        int n4;
        int n7;
        int n8;
        int n10;
        float[][] fArray;
        An3 an3 = this;
        int n14 = this.e;
        if (n14 == 0) {
            PrintStream printStream = System.err;
            CharSequence charSequence = new StringBuilder("Error no points added to ");
            String string2 = this.f;
            charSequence.append(string2);
            charSequence = charSequence.toString();
            printStream.println((String)charSequence);
            return;
        }
        int n15 = 1;
        int[] nArray = this.c;
        int n16 = nArray.length + 10;
        Object[] objectArray = new int[n16];
        objectArray[0] = n14 -= n15;
        objectArray[n15] = 0;
        n14 = 2;
        int n17 = 2;
        while (true) {
            fArray = an3.d;
            if (n17 <= 0) break;
            n10 = n17 + -1;
            n8 = objectArray[n10];
            n7 = n17 + -2;
            n4 = objectArray[n7];
            if (n8 < n4) {
                int n18;
                int n19;
                int n20 = nArray[n4];
                int n21 = n8;
                for (n19 = n8; n19 < n4; ++n19) {
                    int n22 = nArray[n19];
                    if (n22 > n20) continue;
                    int n24 = nArray[n21];
                    nArray[n21] = n22;
                    nArray[n19] = n24;
                    float[] fArray2 = fArray[n21];
                    float[] fArray3 = fArray[n19];
                    fArray[n21] = fArray3;
                    fArray[n19] = fArray2;
                    ++n21;
                }
                n20 = nArray[n21];
                nArray[n21] = n19 = nArray[n4];
                nArray[n4] = n20;
                float[] fArray4 = fArray[n21];
                float[] fArray5 = fArray[n4];
                fArray[n21] = fArray5;
                fArray[n4] = fArray4;
                objectArray[n7] = n18 = n21 + -1;
                objectArray[n10] = n8;
                n18 = n17 + 1;
                objectArray[n17] = n4;
                n17 += 2;
                objectArray[n18] = ++n21;
                continue;
            }
            n17 = n7;
        }
        n17 = 0;
        double[][] dArray = null;
        for (n16 = 1; n16 < (n10 = nArray.length); ++n16) {
            n10 = nArray[n16];
            n8 = n16 + -1;
            if (n10 == (n8 = nArray[n8])) continue;
            ++n17;
        }
        if (n17 == 0) {
            n17 = 1;
        }
        objectArray = new double[n17];
        int[] nArray2 = new int[n14];
        nArray2[n15] = 3;
        nArray2[0] = n17;
        dArray = (double[][])Array.newInstance(Double.TYPE, nArray2);
        nArray2 = null;
        n8 = 0;
        for (n10 = 0; n10 < (n7 = an3.e); ++n10) {
            double d2;
            double d5;
            if (n10 > 0) {
                n7 = nArray[n10];
                n4 = n10 + -1;
                if (n7 == (n4 = nArray[n4])) continue;
            }
            n7 = nArray[n10];
            double d7 = (double)n7 * 0.01;
            objectArray[n8] = (int)d7;
            double[] dArray2 = dArray[n8];
            float[] fArray6 = fArray[n10];
            dArray2[0] = d5 = (double)fArray6[0];
            float f5 = fArray6[n15];
            dArray2[n15] = d5 = (double)f5;
            float f6 = fArray6[n14];
            dArray2[n14] = d2 = (double)f6;
            ++n8;
        }
        n10 = n3;
        an3.a = zf0_12 = zf0_1.a(n3, objectArray, dArray);
    }

    public final String toString() {
        int n3;
        CharSequence charSequence = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i3 = 0; i3 < (n3 = this.e); ++i3) {
            charSequence = nn_2.a((String)charSequence, "[");
            n3 = this.c[i3];
            ((StringBuilder)charSequence).append(n3);
            ((StringBuilder)charSequence).append(" , ");
            Object object = this.d[i3];
            object = decimalFormat.format(object);
            ((StringBuilder)charSequence).append((String)object);
            object = "] ";
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}


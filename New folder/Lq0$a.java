/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StatFs
 */
import android.os.StatFs;
import java.io.File;
import kotlin.ranges.f;

public final class Lq0$a {
    public hn2_2 a;
    public final vn1_2 b;
    public final double c;
    public final long d;
    public final long e;
    public final em0_2 f;

    public Lq0$a() {
        Object object = hm0_2.a;
        this.b = object;
        this.c = 0.02;
        this.d = 0xA00000L;
        this.e = 0xFA00000L;
        object = ir0_2.a;
        this.f = object = em0_2.b;
    }

    public final NE2 a() {
        hn2_2 hn2_22 = this.a;
        if (hn2_22 != null) {
            NE2 nE2;
            long l2;
            vn1_2 vn1_22;
            double d2 = this.c;
            long l3 = 0L;
            double d5 = 0.0;
            double d7 = d2 - d5;
            double d9 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (d9 > 0) {
                Object object = hn2_22.e();
                ((File)object).mkdir();
                object = ((File)object).getAbsolutePath();
                vn1_22 = new StatFs((String)object);
                long l4 = vn1_22.getBlockCountLong();
                double d12 = l4;
                d2 *= d12;
                l3 = vn1_22.getBlockSizeLong();
                d5 = l3;
                l4 = (long)(d2 *= d5);
                long l7 = this.d;
                long l8 = this.e;
                try {
                    l2 = kotlin.ranges.f.i(l4, l7, l8);
                }
                catch (Exception exception) {
                    l2 = this.d;
                }
            } else {
                l2 = 0L;
                d2 = 0.0;
            }
            vn1_22 = this.b;
            em0_2 em0_22 = this.f;
            NE2 nE22 = nE2;
            nE2 = new NE2(l2, vn1_22, hn2_22, em0_22);
            return nE2;
        }
        String string2 = "directory == null".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}


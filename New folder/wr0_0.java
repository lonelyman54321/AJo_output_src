/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;

/*
 * Renamed from Wr0
 */
public final class wr0_0 {
    public String a;
    public String b;
    public float c;
    public Wr0$a d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        String string2 = this.b;
        float f5 = zy_2.b(n3, 31, string2);
        float f6 = this.c;
        n3 = (int)(f5 + f6) * 31;
        int n4 = (this.d.ordinal() + n3) * 31;
        n3 = this.e;
        n4 += n3;
        long l2 = Float.floatToRawIntBits(this.f);
        n4 *= 31;
        long l3 = l2 >>> 32;
        n3 = (int)(l2 ^ l3);
        n4 = (n4 + n3) * 31;
        n3 = this.h;
        return n4 + n3;
    }
}


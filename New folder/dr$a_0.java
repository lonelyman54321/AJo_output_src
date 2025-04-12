/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 */
import android.media.AudioAttributes;

/*
 * Renamed from dr$a
 */
public final class dr$a_0 {
    public final AudioAttributes a;

    public dr$a_0(dr_1 dr_12) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        int n3 = dr_12.a;
        builder = builder.setContentType(n3);
        n3 = dr_12.b;
        builder = builder.setFlags(n3);
        n3 = dr_12.c;
        builder = builder.setUsage(n3);
        n3 = gz3.a;
        int n4 = 29;
        if (n3 >= n4) {
            n4 = dr_12.d;
            br_0.a(builder, n4);
        }
        if (n3 >= (n4 = 32)) {
            int n7 = dr_12.e;
            cr_0.a(builder, n7);
        }
        dr_12 = builder.build();
        this.a = dr_12;
    }
}


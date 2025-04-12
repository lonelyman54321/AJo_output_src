/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;

public final class Bz0 {
    public Parcel a;

    public final void a(byte by2) {
        this.a.writeByte(by2);
    }

    public final void b(float f5) {
        this.a.writeFloat(f5);
    }

    public final void c(long l2) {
        boolean bl2;
        long l3 = Dm3.b(l2);
        long l4 = 0L;
        boolean bl3 = Fm3.a(l3, l4);
        int n3 = 0;
        if (!bl3) {
            long l7 = 0x100000000L;
            bl3 = Fm3.a(l3, l7);
            if (bl3) {
                n3 = 1;
            } else {
                l7 = 0x200000000L;
                bl2 = Fm3.a(l3, l7);
                if (bl2) {
                    n3 = 2;
                }
            }
        }
        this.a((byte)n3);
        l3 = Dm3.b(l2);
        bl2 = Fm3.a(l3, l4);
        if (!bl2) {
            float f5 = Dm3.c(l2);
            this.b(f5);
        }
    }
}


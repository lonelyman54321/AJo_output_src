/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.Magnifier
 */
import android.widget.Magnifier;

public final class nt2$a
extends mt2$a {
    public final void b(long l2, long l3, float f5) {
        boolean bl2;
        boolean bl3 = Float.isNaN(f5);
        if (!bl3) {
            Magnifier magnifier = this.a;
            magnifier.setZoom(f5);
        }
        if (bl2 = h72.c(l3)) {
            Magnifier magnifier = this.a;
            float f6 = e72.d(l2);
            float f7 = e72.e(l2);
            float f8 = e72.d(l3);
            float f11 = e72.e(l3);
            magnifier.show(f6, f7, f8, f11);
        } else {
            Magnifier magnifier = this.a;
            float f12 = e72.d(l2);
            float f14 = e72.e(l2);
            magnifier.show(f12, f14);
        }
    }
}


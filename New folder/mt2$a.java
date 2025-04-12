/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.Magnifier
 */
import android.widget.Magnifier;

public class mt2$a
implements kt2_0 {
    public final Magnifier a;

    public mt2$a(Magnifier magnifier) {
        this.a = magnifier;
    }

    public final long a() {
        int n3 = this.a.getWidth();
        int n4 = this.a.getHeight();
        return dj1.a(n3, n4);
    }

    public void b(long l2, long l3, float f5) {
        Magnifier magnifier = this.a;
        float f6 = e72.d(l2);
        float f7 = e72.e(l2);
        magnifier.show(f6, f7);
    }

    public final void c() {
        this.a.update();
    }

    public final void dismiss() {
        this.a.dismiss();
    }
}


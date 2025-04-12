/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.a;

public final class uD3$b
extends ud3_1 {
    public final float[] g;
    public a h;

    public uD3$b() {
        float[] fArray = new float[1];
        this.g = fArray;
    }

    public final void c(a a2) {
        this.h = a2;
    }

    public final void f(float f5, View view) {
        f5 = this.a(f5);
        float[] fArray = this.g;
        fArray[0] = f5;
        Qf0.b(this.h, view, fArray);
    }
}


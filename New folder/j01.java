/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.EdgeEffect
 */
import android.content.Context;
import android.widget.EdgeEffect;

public final class j01
extends EdgeEffect {
    public final float a;
    public float b;

    public j01(Context object) {
        super(object);
        float f5;
        object = ap1_0.a(object);
        float f6 = 1.0f;
        this.a = f5 = object.a * f6;
    }

    public final void onAbsorb(int n3) {
        this.b = 0.0f;
        super.onAbsorb(n3);
    }

    public final void onPull(float f5) {
        this.b = 0.0f;
        super.onPull(f5);
    }

    public final void onPull(float f5, float f6) {
        this.b = 0.0f;
        super.onPull(f5, f6);
    }

    public final void onRelease() {
        this.b = 0.0f;
        super.onRelease();
    }
}


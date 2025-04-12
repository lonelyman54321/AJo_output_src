/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.transition;

import android.view.View;
import androidx.core.view.ViewCompat$c;

public final class ChangeTransform$f {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public ChangeTransform$f(View view) {
        float f5;
        float f6;
        this.a = f6 = view.getTranslationX();
        this.b = f6 = view.getTranslationY();
        this.c = f6 = ViewCompat$c.h(view);
        this.d = f6 = view.getScaleX();
        this.e = f6 = view.getScaleY();
        this.f = f6 = view.getRotationX();
        this.g = f6 = view.getRotationY();
        this.h = f5 = view.getRotation();
    }

    public final boolean equals(Object object) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        float f14;
        float f15;
        float f16;
        Object object2 = object instanceof ChangeTransform$f;
        boolean bl2 = false;
        if (!object2) {
            return false;
        }
        object = (ChangeTransform$f)object;
        float f17 = ((ChangeTransform$f)object).a;
        float f18 = this.a;
        float f19 = f17 - f18;
        object2 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
        if (!(object2 || (object2 = (f16 = (f17 = ((ChangeTransform$f)object).b) - (f18 = this.b)) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1)) || (object2 = (f15 = (f17 = ((ChangeTransform$f)object).c) - (f18 = this.c)) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1)) || (object2 = (f14 = (f17 = ((ChangeTransform$f)object).d) - (f18 = this.d)) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1)) || (object2 = (f12 = (f17 = ((ChangeTransform$f)object).e) - (f18 = this.e)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) || (object2 = (f11 = (f17 = ((ChangeTransform$f)object).f) - (f18 = this.f)) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) || (object2 = (f8 = (f17 = ((ChangeTransform$f)object).g) - (f18 = this.g)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) || (f7 = (f6 = (f5 = ((ChangeTransform$f)object).h) - (f17 = this.h)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false)) {
            bl2 = true;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        float f5 = this.a;
        boolean bl2 = false;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object != false) {
            n3 = Float.floatToIntBits(f5);
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        n3 *= 31;
        float f7 = this.b;
        float f8 = f7 - 0.0f;
        float f11 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (f11 != false) {
            object = Float.floatToIntBits(f7);
        } else {
            object = false;
            f7 = 0.0f;
        }
        n3 = (n3 + object) * 31;
        f7 = this.c;
        float f12 = f7 - 0.0f;
        f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (f11 != false) {
            object = Float.floatToIntBits(f7);
        } else {
            object = false;
            f7 = 0.0f;
        }
        n3 = (n3 + object) * 31;
        f7 = this.d;
        float f14 = f7 - 0.0f;
        f11 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (f11 != false) {
            object = Float.floatToIntBits(f7);
        } else {
            object = false;
            f7 = 0.0f;
        }
        n3 = (n3 + object) * 31;
        f7 = this.e;
        float f15 = f7 - 0.0f;
        f11 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (f11 != false) {
            object = Float.floatToIntBits(f7);
        } else {
            object = false;
            f7 = 0.0f;
        }
        n3 = (n3 + object) * 31;
        f7 = this.f;
        float f16 = f7 - 0.0f;
        f11 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        if (f11 != false) {
            object = Float.floatToIntBits(f7);
        } else {
            object = false;
            f7 = 0.0f;
        }
        n3 = (n3 + object) * 31;
        f7 = this.g;
        float f17 = f7 - 0.0f;
        f11 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
        if (f11 != false) {
            object = Float.floatToIntBits(f7);
        } else {
            object = false;
            f7 = 0.0f;
        }
        n3 = (n3 + object) * 31;
        f7 = this.h;
        float f18 = f7 - 0.0f;
        bl2 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        if (bl2) {
            n4 = Float.floatToIntBits(f7);
        }
        return n3 + n4;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Path
 *  android.util.AttributeSet
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.transition;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.transition.PathMotion;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion
extends PathMotion {
    public static final float d = (float)Math.tan(Math.toRadians(35.0));
    public final float a;
    public final float b;
    public final float c;

    public ArcMotion() {
        float f5;
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = f5 = d;
    }

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        float f6;
        float f7 = 0.0f;
        String string2 = null;
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = f6 = d;
        Object object = af3.h;
        context = context.obtainStyledAttributes(attributeSet, object);
        attributeSet = (XmlPullParser)attributeSet;
        object = "minimumVerticalAngle";
        boolean n3 = dt3.f((XmlPullParser)attributeSet, (String)object);
        if (!n3) {
            boolean bl2 = false;
            f6 = 0.0f;
            object = null;
        } else {
            int n4 = 1;
            f6 = context.getFloat(n4, 0.0f);
        }
        this.b = f6 = ArcMotion.a(f6);
        object = "minimumHorizontalAngle";
        boolean bl3 = dt3.f((XmlPullParser)attributeSet, (String)object);
        if (bl3) {
            boolean bl4 = false;
            f6 = 0.0f;
            object = null;
            f7 = context.getFloat(0, 0.0f);
        }
        this.a = f7 = ArcMotion.a(f7);
        string2 = "maximumAngle";
        int n7 = dt3.f((XmlPullParser)attributeSet, string2);
        f7 = 70.0f;
        if (n7 != 0) {
            n7 = 2;
            f5 = 2.8E-45f;
            f7 = context.getFloat(n7, f7);
        }
        this.c = f5 = ArcMotion.a(f7);
        context.recycle();
    }

    public static float a(float f5) {
        float f6;
        float f7 = 0.0f;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object >= 0 && (object = (f6 = f5 - (f7 = 90.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) <= 0) {
            return (float)Math.tan(Math.toRadians(f5 / 2.0f));
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        throw illegalArgumentException;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Path getPath(float f5, float f6, float f7, float f8) {
        float f11;
        void var13_16;
        float f12;
        Path path = new Path();
        path.moveTo(f5, f6);
        float f14 = f7 - f5;
        float f15 = f8 - f6;
        float f16 = f14 * f14;
        float f17 = f15 * f15 + f16;
        f16 = f5 + f7;
        float f18 = 2.0f;
        f16 /= f18;
        float f19 = (f6 + f8) / f18;
        float f20 = 0.25f * f17;
        float f22 = f6 == f8 ? 0 : (f6 > f8 ? 1 : -1);
        if (f22 > 0) {
            boolean bl2 = true;
            f12 = Float.MIN_VALUE;
        } else {
            boolean bl3 = false;
            f12 = 0.0f;
        }
        float f23 = Math.abs(f14);
        float f24 = Math.abs(f15);
        float f25 = f23 == f24 ? 0 : (f23 < f24 ? -1 : 1);
        if (f25 < 0) {
            f14 = Math.abs(f17 /= (f15 *= f18));
            if (var13_16 != false) {
                f14 += f8;
                f15 = f7;
            } else {
                f14 += f6;
                f15 = f5;
            }
            f17 = this.b;
        } else {
            f17 /= (f14 *= f18);
            if (var13_16 != false) {
                f14 = f6;
                f15 = f17 += f5;
            } else {
                f15 = f7 - f17;
                f14 = f8;
            }
            f17 = this.a;
        }
        f12 = f20 * f17 * f17;
        f17 = f16 - f15;
        f23 = f19 - f14;
        f17 *= f17;
        f23 = f23 * f23 + f17;
        f17 = this.c;
        f20 = f20 * f17 * f17;
        boolean bl4 = false;
        f17 = 0.0f;
        float f26 = f23 == f12 ? 0 : (f23 < f12 ? -1 : 1);
        if (f26 >= 0) {
            Object object = f23 == f20 ? 0 : (f23 > f20 ? 1 : -1);
            if (object > 0) {
                f12 = f20;
            } else {
                boolean bl5 = false;
                f12 = 0.0f;
            }
        }
        if (bl4 = (f11 = f12 - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) {
            double d2 = Math.sqrt(f12 /= f23);
            f17 = (float)d2;
            f15 = xu0_1.a(f15, f16, f17, f16);
            f14 = xu0_1.a(f14, f19, f17, f19);
        }
        f5 = (f5 + f15) / f18;
        f16 = (f6 + f14) / f18;
        f17 = (f15 + f7) / f18;
        f18 = (f14 + f8) / f18;
        f15 = f5;
        f19 = f7;
        f20 = f8;
        path.cubicTo(f5, f16, f17, f18, f7, f8);
        return path;
    }
}


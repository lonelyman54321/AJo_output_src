/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.WrapContentElement;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class j {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final WrapContentElement d;
    public static final WrapContentElement e;
    public static final WrapContentElement f;
    public static final WrapContentElement g;
    public static final WrapContentElement h;
    public static final WrapContentElement i;

    static {
        Object object = Hq0.Horizontal;
        float f5 = 1.0f;
        Object object2 = new FillElement((Hq0)((Object)object), f5);
        a = object2;
        Hq0 hq0 = Hq0.Vertical;
        object2 = new FillElement(hq0, f5);
        b = object2;
        Hq0 hq02 = Hq0.Both;
        object2 = new FillElement(hq02, f5);
        c = object2;
        object2 = Nc$a.n;
        dj3_0 dj3_02 = new dj3_0((Nc$b)object2);
        Object object3 = new WrapContentElement((Hq0)((Object)object), false, dj3_02, object2);
        d = object3;
        object2 = Nc$a.m;
        dj3_02 = new dj3_0((Nc$b)object2);
        object3 = new WrapContentElement((Hq0)((Object)object), false, dj3_02, object2);
        e = object3;
        object2 = Nc$a.k;
        object3 = new bj3_0((Nc$c)object2);
        object = new WrapContentElement(hq0, false, (Function2)object3, object2);
        f = object;
        object2 = Nc$a.j;
        object3 = new bj3_0((Nc$c)object2);
        object = new WrapContentElement(hq0, false, (Function2)object3, object2);
        g = object;
        object2 = Nc$a.e;
        object3 = new cj3_0((Nc)object2);
        object = new WrapContentElement(hq02, false, (Function2)object3, object2);
        h = object;
        object2 = Nc$a.a;
        object3 = new cj3_0((Nc)object2);
        object = new WrapContentElement(hq02, false, (Function2)object3, object2);
        i = object;
    }

    public static final LP1 a(LP1 lP1, float f5, float f6) {
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = new UnspecifiedConstraintsElement(f5, f6);
        return lP1.then(unspecifiedConstraintsElement);
    }

    public static final LP1 b(LP1 lP1, float f5) {
        FillElement fillElement;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object == false) {
            fillElement = b;
        } else {
            FillElement fillElement2;
            Hq0 hq0 = Hq0.Vertical;
            fillElement = fillElement2 = new FillElement(hq0, f5);
        }
        return lP1.then(fillElement);
    }

    public static final LP1 c(LP1 lP1, float f5) {
        FillElement fillElement;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object == false) {
            fillElement = a;
        } else {
            FillElement fillElement2;
            Hq0 hq0 = Hq0.Horizontal;
            fillElement = fillElement2 = new FillElement(hq0, f5);
        }
        return lP1.then(fillElement);
    }

    public static final LP1 d(LP1 lP1, float f5) {
        ji1$a ji1$a = ji1.a;
        SizeElement sizeElement = new SizeElement(0.0f, f5, 0.0f, f5, ji1$a, 5);
        return lP1.then(sizeElement);
    }

    public static final LP1 e(float f5, float f6) {
        ji1$a ji1$a = ji1.a;
        SizeElement sizeElement = new SizeElement(0.0f, f5, 0.0f, f6, ji1$a, 5);
        return sizeElement;
    }

    public static final LP1 f(LP1 lP1) {
        float f5 = VS.c;
        ji1$a ji1$a = ji1.a;
        SizeElement sizeElement = new SizeElement(f5, f5, f5, f5, false, ji1$a);
        return lP1.then(sizeElement);
    }

    public static LP1 g(LP1 lP1, float f5, float f6, float f7, float f8, int n3) {
        int n4 = n3 & 2;
        float f11 = n4 != 0 ? 0.0f / 0.0f : f6;
        int n7 = n3 & 4;
        float f12 = n7 != 0 ? 0.0f / 0.0f : f7;
        n7 = n3 & 8;
        float f14 = n7 != 0 ? 0.0f / 0.0f : f8;
        ji1$a ji1$a = ji1.a;
        SizeElement sizeElement = new SizeElement(f5, f11, f12, f14, false, ji1$a);
        return lP1.then(sizeElement);
    }

    public static final LP1 h(LP1 lP1, float f5) {
        ji1$a ji1$a = ji1.a;
        SizeElement sizeElement = new SizeElement(f5, f5, f5, f5, true, ji1$a);
        return lP1.then(sizeElement);
    }

    public static final LP1 i(LP1 lP1, float f5, float f6) {
        ji1$a ji1$a = ji1.a;
        SizeElement sizeElement = new SizeElement(f5, f6, f5, f6, true, ji1$a);
        return lP1.then(sizeElement);
    }

    public static final LP1 j(LP1 lP1, float f5, float f6, float f7, float f8) {
        ji1$a ji1$a = ji1.a;
        SizeElement sizeElement = new SizeElement(f5, f6, f7, f8, true, ji1$a);
        return lP1.then(sizeElement);
    }

    public static final LP1 k(LP1 lP1, float f5) {
        ji1$a ji1$a = ji1.a;
        SizeElement sizeElement = new SizeElement(f5, 0.0f, f5, 0.0f, ji1$a, 10);
        return lP1.then(sizeElement);
    }

    public static final LP1 l(float f5, float f6) {
        ji1$a ji1$a = ji1.a;
        SizeElement sizeElement = new SizeElement(f5, 0.0f, f6, 0.0f, ji1$a, 10);
        return sizeElement;
    }

    public static LP1 m(LP1 lP1) {
        Object object = Nc$a.k;
        boolean bl2 = Intrinsics.areEqual(object, object);
        if (bl2) {
            object = f;
        } else {
            Object object2 = Nc$a.j;
            bl2 = Intrinsics.areEqual(object, object2);
            if (bl2) {
                object = g;
            } else {
                Hq0 hq0 = Hq0.Vertical;
                bj3_0 bj3_02 = new bj3_0((Nc$c)object);
                object = object2 = new WrapContentElement(hq0, false, bj3_02, object);
            }
        }
        return lP1.then((LP1)object);
    }

    public static LP1 n(LP1 lP1, Gx object, int n3) {
        Object object2 = Nc$a.e;
        if ((n3 &= 1) != 0) {
            object = object2;
        }
        if ((n3 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0)) != 0) {
            object = h;
        } else {
            Object object3 = Nc$a.a;
            n3 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
            if (n3 != 0) {
                object = i;
            } else {
                object2 = Hq0.Both;
                cj3_0 cj3_02 = new cj3_0((Nc)object);
                object = object3 = new WrapContentElement((Hq0)((Object)object2), false, cj3_02, object);
            }
        }
        return lP1.then((LP1)object);
    }

    public static LP1 o(LP1 lP1) {
        Object object = Nc$a.n;
        boolean bl2 = Intrinsics.areEqual(object, object);
        if (bl2) {
            object = d;
        } else {
            Object object2 = Nc$a.m;
            bl2 = Intrinsics.areEqual(object, object2);
            if (bl2) {
                object = e;
            } else {
                Hq0 hq0 = Hq0.Horizontal;
                dj3_0 dj3_02 = new dj3_0((Nc$b)object);
                object = object2 = new WrapContentElement(hq0, false, dj3_02, object);
            }
        }
        return lP1.then((LP1)object);
    }
}


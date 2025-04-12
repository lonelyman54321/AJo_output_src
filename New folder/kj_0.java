/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Shader
 *  android.text.TextPaint
 */
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kj
 */
public final class kj_0
extends TextPaint {
    public ei a;
    public Jj3 b;
    public int c;
    public b13_0 d;
    public ZD e;
    public mp0 f;
    public C63 g;
    public Qt0 h;

    public final fm2 a() {
        ei ei2 = this.a;
        if (ei2 != null) {
            return ei2;
        }
        this.a = ei2 = new ei((Paint)this);
        return ei2;
    }

    public final void b(int n3) {
        int n4 = this.c;
        if ((n4 = (int)(zy_0.a(n3, n4) ? 1 : 0)) != 0) {
            return;
        }
        this.a().d(n3);
        this.c = n3;
    }

    public final void c(ZD object, long l2, float f5) {
        block9: {
            Object object2;
            block12: {
                long l3;
                long l4;
                boolean bl2;
                Object object3;
                boolean bl3;
                block11: {
                    block10: {
                        block8: {
                            object2 = null;
                            if (object != null) break block8;
                            this.f = null;
                            this.e = null;
                            this.g = null;
                            this.setShader(null);
                            break block9;
                        }
                        bl3 = object instanceof i93_0;
                        if (!bl3) break block10;
                        object = (i93_0)object;
                        long l7 = Tj3.a(((i93_0)object).a, f5);
                        this.d(l7);
                        break block9;
                    }
                    bl3 = object instanceof Z03;
                    if (!bl3) break block9;
                    object3 = this.e;
                    bl3 = Intrinsics.areEqual(object3, object);
                    bl2 = false;
                    if (!bl3) break block11;
                    object3 = this.g;
                    if (object3 == null) {
                        bl3 = false;
                        object3 = null;
                    } else {
                        l4 = ((C63)object3).a;
                        bl3 = C63.a(l4, l2);
                    }
                    if (bl3) break block12;
                }
                if (bl3 = (l3 = l2 - (l4 = 9205357640488583168L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) {
                    bl2 = true;
                }
                if (bl2) {
                    this.e = object;
                    this.g = object3 = new C63(l2);
                    object3 = new kj$a((ZD)object, l2);
                    this.f = object = J83.e((Function0)object3);
                }
            }
            object = this.a();
            Object object4 = this.f;
            if (object4 != null) {
                object2 = object4 = ((mp0)object4).getValue();
                object2 = (Shader)object4;
            }
            object = (ei)object;
            ((ei)object).i((Shader)object2);
            lj_1.c(this, f5);
        }
    }

    public final void d(long l2) {
        long l3 = 16;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            int n3 = zx_0.i(l2);
            this.setColor(n3);
            n3 = 0;
            this.f = null;
            this.e = null;
            this.g = null;
            this.setShader(null);
        }
    }

    public final void e(Qt0 object) {
        if (object == null) {
            return;
        }
        Object object2 = this.h;
        boolean bl2 = Intrinsics.areEqual(object2, object);
        if (!bl2) {
            this.h = object;
            object2 = rM0.a;
            bl2 = Intrinsics.areEqual(object, object2);
            if (bl2) {
                object = Paint.Style.FILL;
                this.setStyle((Paint.Style)object);
            } else {
                bl2 = object instanceof re3_1;
                if (bl2) {
                    this.a().m(1);
                    object2 = this.a();
                    object = (re3_1)object;
                    float f5 = ((re3_1)object).a;
                    object2.n(f5);
                    object2 = this.a();
                    f5 = ((re3_1)object).b;
                    object2.k(f5);
                    object2 = this.a();
                    int n3 = ((re3_1)object).d;
                    object2.e(n3);
                    object2 = this.a();
                    n3 = ((re3_1)object).c;
                    object2.c(n3);
                    object2 = this.a();
                    object = ((re3_1)object).e;
                    object2.g((li)object);
                }
            }
        }
    }

    public final void f(b13_0 b13_02) {
        if (b13_02 == null) {
            return;
        }
        b13_0 b13_03 = this.d;
        boolean bl2 = Intrinsics.areEqual(b13_03, b13_02);
        if (!bl2) {
            this.d = b13_02;
            b13_03 = b13_0.d;
            boolean bl3 = Intrinsics.areEqual(b13_02, b13_03);
            if (bl3) {
                this.clearShadowLayer();
            } else {
                b13_02 = this.d;
                float f5 = b13_02.c;
                float f6 = 0.0f;
                b13_0 b13_04 = null;
                float f7 = f5 - 0.0f;
                Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                if (object == false) {
                    bl2 = true;
                    f5 = Float.MIN_VALUE;
                }
                float f8 = e72.d(b13_02.b);
                b13_04 = this.d;
                long l2 = b13_04.b;
                f6 = e72.e(l2);
                b13_0 b13_05 = this.d;
                long l3 = b13_05.a;
                int n3 = zx_0.i(l3);
                this.setShadowLayer(f5, f8, f6, n3);
            }
        }
    }

    public final void g(Jj3 jj3) {
        if (jj3 == null) {
            return;
        }
        Jj3 jj32 = this.b;
        int n3 = Intrinsics.areEqual(jj32, jj3);
        if (n3 == 0) {
            this.b = jj3;
            int n4 = jj3.a;
            n3 = n4 | 1;
            boolean bl2 = false;
            if (n3 == n4) {
                n4 = 1;
            } else {
                n4 = 0;
                jj3 = null;
            }
            this.setUnderlineText(n4 != 0);
            jj3 = this.b;
            jj3.getClass();
            n4 = jj3.a;
            n3 = n4 | 2;
            if (n3 == n4) {
                bl2 = true;
            }
            this.setStrikeThruText(bl2);
        }
    }
}


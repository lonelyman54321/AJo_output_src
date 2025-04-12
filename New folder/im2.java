/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class im2 {
    private float alpha = 1.0f;
    private TX colorFilter;
    private final Function1 drawLambda;
    private fm2 layerPaint;
    private bp1_0 layoutDirection;
    private boolean useLayer;

    public im2() {
        Object object;
        this.layoutDirection = object = bp1_0.Ltr;
        super(this);
        this.drawLambda = object;
    }

    private final void configureAlpha(float f5) {
        float f6 = this.alpha;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            object = this.applyAlpha(f5);
            if (object == false) {
                f6 = 1.0f;
                float f8 = f5 - f6;
                object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (object == false) {
                    fm2 fm22 = this.layerPaint;
                    if (fm22 != null) {
                        fm22.b(f5);
                    }
                    object = false;
                    f6 = 0.0f;
                    fm22 = null;
                    this.useLayer = false;
                } else {
                    fm2 fm23 = this.obtainPaint();
                    fm23.b(f5);
                    object = true;
                    f6 = Float.MIN_VALUE;
                    this.useLayer = object;
                }
            }
            this.alpha = f5;
        }
    }

    private final void configureColorFilter(TX tX) {
        Object object = this.colorFilter;
        boolean bl2 = Intrinsics.areEqual(object, tX);
        if (!bl2) {
            bl2 = this.applyColorFilter(tX);
            if (!bl2) {
                if (tX == null) {
                    object = this.layerPaint;
                    if (object != null) {
                        object.l(null);
                    }
                    bl2 = false;
                    object = null;
                    this.useLayer = false;
                } else {
                    object = this.obtainPaint();
                    object.l(tX);
                    this.useLayer = bl2 = true;
                }
            }
            this.colorFilter = tX;
        }
    }

    private final void configureLayoutDirection(bp1_0 bp1_02) {
        bp1_0 bp1_03 = this.layoutDirection;
        if (bp1_03 != bp1_02) {
            this.applyLayoutDirection(bp1_02);
            this.layoutDirection = bp1_02;
        }
    }

    public static /* synthetic */ void draw-x_KDEd0$default(im2 object, Kt0 kt0, long l2, float f5, TX tX, int n3, Object object2) {
        if (object2 == null) {
            float f6;
            int n4;
            int n7 = n3 & 2;
            if (n7 != 0) {
                n4 = 1065353216;
                f5 = 1.0f;
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            n4 = n3 & 4;
            if (n4 != 0) {
                tX = null;
            }
            ((im2)object).draw-x_KDEd0(kt0, l2, f6, tX);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        throw object;
    }

    private final fm2 obtainPaint() {
        fm2 fm22 = this.layerPaint;
        if (fm22 == null) {
            this.layerPaint = fm22 = fi.a();
        }
        return fm22;
    }

    public boolean applyAlpha(float f5) {
        return false;
    }

    public boolean applyColorFilter(TX tX) {
        return false;
    }

    public boolean applyLayoutDirection(bp1_0 bp1_02) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void draw-x_KDEd0(Kt0 object, long l2, float f5, TX object2) {
        float f6;
        float f7;
        float f8;
        float f11;
        block7: {
            Throwable throwable2;
            block9: {
                block8: {
                    fm2 fm22;
                    Object object3;
                    aG2 aG22;
                    this.configureAlpha(f5);
                    this.configureColorFilter((TX)object2);
                    object2 = object.getLayoutDirection();
                    this.configureLayoutDirection((bp1_0)((Object)object2));
                    f11 = C63.d(object.l());
                    f8 = C63.d(l2);
                    f11 -= f8;
                    long l3 = object.l();
                    f8 = C63.b(l3);
                    f7 = C63.b(l2);
                    yl_0 yl_02 = object.M0().a;
                    yl_02.c(0.0f, 0.0f, f11, f8 -= f7);
                    f7 = -0.0f;
                    float f12 = f5 - 0.0f;
                    float f14 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (f14 <= 0) break block7;
                    try {
                        float f15;
                        f5 = C63.d(l2);
                        float f16 = f5 - 0.0f;
                        f14 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                        if (f14 <= 0 || (f14 = (f15 = (f5 = C63.b(l2)) - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1)) <= 0) break block7;
                        f14 = (float)this.useLayer;
                        if (f14 == false) break block8;
                        f5 = C63.d(l2);
                        f6 = C63.b(l2);
                        l2 = bo1_1.a(f5, f6);
                        long l4 = 0L;
                        aG22 = cg2_0.d(l4, l2);
                        object3 = object.M0();
                        object3 = ((xL$b)object3).a();
                        fm22 = this.obtainPaint();
                    }
                    catch (Throwable throwable2) {}
                    try {
                        object3.s(aG22, fm22);
                        this.onDraw((Kt0)object);
                    }
                    catch (Throwable throwable3) {
                        object3.h();
                        throw throwable3;
                    }
                    object3.h();
                    break block7;
                    break block9;
                }
                this.onDraw((Kt0)object);
                break block7;
            }
            object = object.M0().a;
            float f17 = -f11;
            f5 = -f8;
            ((yl_0)object).c(f7, f7, f17, f5);
            throw throwable2;
        }
        object = object.M0().a;
        f6 = -f11;
        float f18 = -f8;
        ((yl_0)object).c(f7, f7, f6, f18);
    }

    public abstract long getIntrinsicSize-NH-jbRc();

    public abstract void onDraw(Kt0 var1);
}


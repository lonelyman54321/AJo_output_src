/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.accompanist.swiperefresh.CircularProgressPainter$arrow$2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class CircularProgressPainter
extends im2 {
    public static final int $stable = 8;
    private final tr1_0 alpha$delegate;
    private final tr1_0 arcRadius$delegate;
    private final rq1_2 arrow$delegate;
    private final tr1_0 arrowEnabled$delegate;
    private final tr1_0 arrowHeight$delegate;
    private final tr1_0 arrowScale$delegate;
    private final tr1_0 arrowWidth$delegate;
    private final tr1_0 color$delegate;
    private final tr1_0 endTrim$delegate;
    private final tr1_0 rotation$delegate;
    private final tr1_0 startTrim$delegate;
    private final tr1_0 strokeWidth$delegate;

    public CircularProgressPainter() {
        long l2 = OX.l;
        Object object = new OX(l2);
        Object object2 = J83.g(object);
        this.color$delegate = object2;
        float f5 = 1.0f;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = J83.g(Float.valueOf(f5));
        this.alpha$delegate = parcelableSnapshotMutableState;
        float f6 = 0.0f;
        object = new xs0_0(f6);
        this.arcRadius$delegate = object = J83.g(object);
        float f7 = 5;
        xs0_0 xs0_02 = new xs0_0(f7);
        this.strokeWidth$delegate = object = J83.g(xs0_02);
        this.arrowEnabled$delegate = object = J83.g(Boolean.FALSE);
        object = new xs0_0(f6);
        this.arrowWidth$delegate = object = J83.g(object);
        object = new xs0_0(f6);
        parcelableSnapshotMutableState = J83.g(object);
        this.arrowHeight$delegate = parcelableSnapshotMutableState;
        object2 = J83.g(Float.valueOf(f5));
        this.arrowScale$delegate = object2;
        this.arrow$delegate = object2 = yr1_2.b(CircularProgressPainter$arrow$2.INSTANCE);
        parcelableSnapshotMutableState = J83.g(Float.valueOf(0.0f));
        this.startTrim$delegate = parcelableSnapshotMutableState;
        parcelableSnapshotMutableState = J83.g(Float.valueOf(0.0f));
        this.endTrim$delegate = parcelableSnapshotMutableState;
        this.rotation$delegate = object2 = J83.g(Float.valueOf(0.0f));
    }

    private final void drawArrow(Kt0 kt0, float f5, float f6, aG2 object) {
        this.getArrow().reset();
        this.getArrow().a(0.0f, 0.0f);
        Object object2 = this.getArrow();
        float f7 = this.getArrowWidth-D9Ej5fM();
        f7 = kt0.J0(f7);
        float f8 = this.getArrowScale() * f7;
        object2.d(f8, 0.0f);
        object2 = this.getArrow();
        float f11 = this.getArrowWidth-D9Ej5fM();
        f11 = kt0.J0(f11);
        f7 = this.getArrowScale() * f11;
        f11 = 2;
        f7 /= f11;
        f11 = this.getArrowHeight-D9Ej5fM();
        f11 = kt0.J0(f11);
        f8 = this.getArrowScale() * f11;
        object2.d(f7, f8);
        float f12 = ((aG2)object).d();
        f11 = ((aG2)object).c();
        f12 = Math.min(f12, f11);
        f11 = 2.0f;
        f12 /= f11;
        f7 = this.getArrowWidth-D9Ej5fM();
        f7 = kt0.J0(f7);
        f8 = this.getArrowScale() * f7 / f11;
        gn2 gn22 = this.getArrow();
        long l2 = ((aG2)object).b();
        float f14 = e72.d(l2) + f12 - f8;
        long l3 = ((aG2)object).b();
        float f15 = e72.e(l3);
        f12 = this.getStrokeWidth-D9Ej5fM();
        f12 = kt0.J0(f12) / f11 + f15;
        long l4 = h72.a(f14, f12);
        gn22.k(l4);
        object = this.getArrow();
        object.close();
        f5 += f6;
        long l7 = kt0.X0();
        object2 = kt0.M0();
        long l8 = ((xL$b)object2).l();
        Object object3 = ((xL$b)object2).a();
        object3.p();
        try {
            object3 = ((xL$b)object2).a;
            ((yl_0)object3).d(l7, f5);
            gn2 gn23 = this.getArrow();
            long l12 = this.getColor-0d7_KjU();
            float f16 = this.getAlpha();
            int n3 = 56;
            Jt0.h(kt0, gn23, l12, f16, null, n3);
            return;
        }
        finally {
            jz.b((xL$b)object2, l8);
        }
    }

    private final gn2 getArrow() {
        return (gn2)this.arrow$delegate.getValue();
    }

    public boolean applyAlpha(float f5) {
        this.setAlpha(f5);
        return true;
    }

    public final float getAlpha() {
        return ((Number)this.alpha$delegate.getValue()).floatValue();
    }

    public final float getArcRadius-D9Ej5fM() {
        return ((xs0_0)this.arcRadius$delegate.getValue()).a;
    }

    public final boolean getArrowEnabled() {
        return (Boolean)this.arrowEnabled$delegate.getValue();
    }

    public final float getArrowHeight-D9Ej5fM() {
        return ((xs0_0)this.arrowHeight$delegate.getValue()).a;
    }

    public final float getArrowScale() {
        return ((Number)this.arrowScale$delegate.getValue()).floatValue();
    }

    public final float getArrowWidth-D9Ej5fM() {
        return ((xs0_0)this.arrowWidth$delegate.getValue()).a;
    }

    public final long getColor-0d7_KjU() {
        return ((OX)this.color$delegate.getValue()).a;
    }

    public final float getEndTrim() {
        return ((Number)this.endTrim$delegate.getValue()).floatValue();
    }

    public long getIntrinsicSize-NH-jbRc() {
        return 9205357640488583168L;
    }

    public final float getRotation() {
        return ((Number)this.rotation$delegate.getValue()).floatValue();
    }

    public final float getStartTrim() {
        return ((Number)this.startTrim$delegate.getValue()).floatValue();
    }

    public final float getStrokeWidth-D9Ej5fM() {
        return ((xs0_0)this.strokeWidth$delegate.getValue()).a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDraw(Kt0 kt0) {
        void var2_4;
        long l3;
        xL$b xL$b;
        block14: {
            long l2;
            xL$b xL$b2;
            block16: {
                Object object;
                block15: {
                    int n8;
                    re3_1 re3_12;
                    long l15;
                    long l14;
                    float f15;
                    float f14;
                    int n3;
                    aG2 aG22;
                    float f11;
                    float f8;
                    long l8;
                    float f7;
                    float f6;
                    Kt0 kt02 = kt0;
                    object = "<this>";
                    Intrinsics.checkNotNullParameter(kt0, (String)object);
                    float f5 = this.getRotation();
                    long l7 = kt0.X0();
                    xL$b xL$b3 = kt0.M0();
                    long l4 = xL$b3.l();
                    Object object2 = xL$b3.a();
                    object2.p();
                    try {
                        object2 = xL$b3.a;
                        ((yl_0)object2).d(l7, f5);
                        f5 = this.getArcRadius-D9Ej5fM();
                        f5 = kt0.J0(f5);
                        f6 = this.getStrokeWidth-D9Ej5fM();
                        f6 = kt0.J0(f6);
                        f7 = 2.0f;
                    }
                    catch (Throwable throwable) {
                        object = this;
                        xL$b = xL$b3;
                        l3 = l4;
                        break block14;
                    }
                    f6 = f6 / f7 + f5;
                    {
                        l3 = kt0.l();
                        l3 = bo1_1.b(l3);
                        f5 = e72.d(l3) - f6;
                    }
                    {
                        l3 = kt0.l();
                        l3 = bo1_1.b(l3);
                        f7 = e72.e(l3) - f6;
                    }
                    {
                        l8 = kt0.l();
                        l8 = bo1_1.b(l8);
                        f8 = e72.d(l8) + f6;
                    }
                    {
                        long l12 = kt0.l();
                        l12 = bo1_1.b(l12);
                        f11 = e72.e(l12) + f6;
                    }
                    {
                        aG22 = new aG2(f5, f7, f8, f11);
                        f6 = this.getStartTrim();
                        f8 = this.getRotation();
                        f6 += f8;
                        n3 = 360;
                    }
                    f8 = n3;
                    float f12 = f6 * f8;
                    {
                        f6 = this.getEndTrim();
                        f11 = this.getRotation();
                        f6 = (f6 + f11) * f8;
                        f14 = f6 - f12;
                    }
                    {
                        l8 = this.getColor-0d7_KjU();
                        f15 = this.getAlpha();
                        l14 = h72.a(f5, f7);
                        f5 = aG22.d();
                        f6 = aG22.c();
                        l15 = bo1_1.a(f5, f6);
                        f5 = this.getStrokeWidth-D9Ej5fM();
                        float f16 = kt0.J0(f5);
                        int n4 = 26;
                        int n7 = 2;
                        re3_12 = new re3_1(f16, 0.0f, n7, 0, null, n4);
                        n8 = 768;
                        object = kt0;
                        l7 = l8;
                        f8 = f12;
                        f11 = f14;
                        f14 = f15;
                        xL$b2 = xL$b3;
                        l2 = l4;
                    }
                    try {
                        Jt0.b(kt0, l8, f12, f11, l14, l15, f15, re3_12, n8);
                        boolean bl2 = this.getArrowEnabled();
                        if (!bl2) break block15;
                        object = this;
                        f6 = f11;
                    }
                    catch (Throwable throwable) {
                        object = this;
                    }
                    try {
                        this.drawArrow(kt0, f12, f11, aG22);
                    }
                    finally {
                        xL$b xL$b4 = xL$b2;
                        l3 = l2;
                        break block16;
                    }
                }
                object = this;
            }
            jz.b(xL$b2, l2);
            return;
        }
        jz.b(xL$b, l3);
        throw var2_4;
    }

    public final void setAlpha(float f5) {
        tr1_0 tr1_02 = this.alpha$delegate;
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }

    public final void setArcRadius-0680j_4(float f5) {
        tr1_0 tr1_02 = this.arcRadius$delegate;
        xs0_0 xs0_02 = new xs0_0(f5);
        tr1_02.setValue(xs0_02);
    }

    public final void setArrowEnabled(boolean bl2) {
        tr1_0 tr1_02 = this.arrowEnabled$delegate;
        Boolean bl3 = bl2;
        tr1_02.setValue(bl3);
    }

    public final void setArrowHeight-0680j_4(float f5) {
        tr1_0 tr1_02 = this.arrowHeight$delegate;
        xs0_0 xs0_02 = new xs0_0(f5);
        tr1_02.setValue(xs0_02);
    }

    public final void setArrowScale(float f5) {
        tr1_0 tr1_02 = this.arrowScale$delegate;
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }

    public final void setArrowWidth-0680j_4(float f5) {
        tr1_0 tr1_02 = this.arrowWidth$delegate;
        xs0_0 xs0_02 = new xs0_0(f5);
        tr1_02.setValue(xs0_02);
    }

    public final void setColor-8_81llA(long l2) {
        tr1_0 tr1_02 = this.color$delegate;
        OX oX = new OX(l2);
        tr1_02.setValue(oX);
    }

    public final void setEndTrim(float f5) {
        tr1_0 tr1_02 = this.endTrim$delegate;
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }

    public final void setRotation(float f5) {
        tr1_0 tr1_02 = this.rotation$delegate;
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }

    public final void setStartTrim(float f5) {
        tr1_0 tr1_02 = this.startTrim$delegate;
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }

    public final void setStrokeWidth-0680j_4(float f5) {
        tr1_0 tr1_02 = this.strokeWidth$delegate;
        xs0_0 xs0_02 = new xs0_0(f5);
        tr1_02.setValue(xs0_02);
    }
}


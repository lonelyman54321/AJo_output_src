/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Outline
 *  android.os.Build$VERSION
 *  android.view.DisplayListCanvas
 *  android.view.RenderNode
 *  android.view.View
 */
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.internal.Intrinsics;

public final class VI2
implements Pp0 {
    public static boolean g = true;
    public final RenderNode a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public VI2(AndroidComposeView androidComposeView) {
        String string2 = "Compose";
        androidComposeView = RenderNode.create((String)string2, (View)androidComposeView);
        this.a = androidComposeView;
        boolean bl2 = g;
        if (bl2) {
            int n3;
            float f5 = androidComposeView.getScaleX();
            androidComposeView.setScaleX(f5);
            f5 = androidComposeView.getScaleY();
            androidComposeView.setScaleY(f5);
            f5 = androidComposeView.getTranslationX();
            androidComposeView.setTranslationX(f5);
            f5 = androidComposeView.getTranslationY();
            androidComposeView.setTranslationY(f5);
            f5 = androidComposeView.getElevation();
            androidComposeView.setElevation(f5);
            f5 = androidComposeView.getRotation();
            androidComposeView.setRotation(f5);
            f5 = androidComposeView.getRotationX();
            androidComposeView.setRotationX(f5);
            f5 = androidComposeView.getRotationY();
            androidComposeView.setRotationY(f5);
            f5 = androidComposeView.getCameraDistance();
            androidComposeView.setCameraDistance(f5);
            f5 = androidComposeView.getPivotX();
            androidComposeView.setPivotX(f5);
            f5 = androidComposeView.getPivotY();
            androidComposeView.setPivotY(f5);
            bl2 = androidComposeView.getClipToOutline();
            androidComposeView.setClipToOutline(bl2);
            bl2 = false;
            f5 = 0.0f;
            string2 = null;
            androidComposeView.setClipToBounds(false);
            float f6 = androidComposeView.getAlpha();
            androidComposeView.setAlpha(f6);
            androidComposeView.isValid();
            androidComposeView.setLeftTopRightBottom(0, 0, 0, 0);
            androidComposeView.offsetLeftAndRight(0);
            androidComposeView.offsetTopAndBottom(0);
            int bl3 = Build.VERSION.SDK_INT;
            int n4 = 28;
            if (bl3 >= n4) {
                mj2_0 mj2_02 = mj2_0.a;
                int n7 = mj2_02.a((RenderNode)androidComposeView);
                mj2_02.c((RenderNode)androidComposeView, n7);
                n7 = mj2_02.b((RenderNode)androidComposeView);
                mj2_02.d((RenderNode)androidComposeView, n7);
            }
            if (bl3 >= (n3 = 24)) {
                kJ2 kJ22 = kJ2.a;
                kJ22.a((RenderNode)androidComposeView);
            } else {
                iJ2 iJ22 = iJ2.a;
                iJ22.a((RenderNode)androidComposeView);
            }
            androidComposeView.setLayerType(0);
            boolean bl4 = androidComposeView.hasOverlappingRendering();
            androidComposeView.setHasOverlappingRendering(bl4);
            g = false;
        }
    }

    public final void A(int n3) {
        int n4;
        this.b = n4 = this.b + n3;
        this.d = n4 = this.d + n3;
        this.a.offsetLeftAndRight(n3);
    }

    public final void B(float f5) {
        this.a.setPivotX(f5);
    }

    public final void C(float f5) {
        this.a.setPivotY(f5);
    }

    public final void D(Outline outline) {
        this.a.setOutline(outline);
    }

    public final void E(int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 28;
        if (n4 >= n7) {
            mj2_0 mj2_02 = mj2_0.a;
            RenderNode renderNode = this.a;
            mj2_02.c(renderNode, n3);
        }
    }

    public final void F(boolean bl2) {
        this.a.setClipToOutline(bl2);
    }

    public final void G(int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 28;
        if (n4 >= n7) {
            mj2_0 mj2_02 = mj2_0.a;
            RenderNode renderNode = this.a;
            mj2_02.d(renderNode, n3);
        }
    }

    public final float H() {
        return this.a.getElevation();
    }

    public final void b(float f5) {
        this.a.setAlpha(f5);
    }

    public final void c(float f5) {
        this.a.setTranslationY(f5);
    }

    public final void d(float f5) {
        this.a.setScaleX(f5);
    }

    public final void f(float f5) {
        RenderNode renderNode = this.a;
        f5 = -f5;
        renderNode.setCameraDistance(f5);
    }

    public final void g(float f5) {
        this.a.setRotationX(f5);
    }

    public final float getAlpha() {
        return this.a.getAlpha();
    }

    public final int getBottom() {
        return this.e;
    }

    public final int getHeight() {
        int n3 = this.e;
        int n4 = this.c;
        return n3 - n4;
    }

    public final int getLeft() {
        return this.b;
    }

    public final int getRight() {
        return this.d;
    }

    public final int getTop() {
        return this.c;
    }

    public final int getWidth() {
        int n3 = this.d;
        int n4 = this.b;
        return n3 - n4;
    }

    public final void h(float f5) {
        this.a.setRotationY(f5);
    }

    public final void i() {
    }

    public final void j(float f5) {
        this.a.setRotation(f5);
    }

    public final void k(float f5) {
        this.a.setScaleY(f5);
    }

    public final void m(float f5) {
        this.a.setTranslationX(f5);
    }

    public final void n() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            kJ2 kJ22 = kJ2.a;
            RenderNode renderNode = this.a;
            kJ22.a(renderNode);
        } else {
            iJ2 iJ22 = iJ2.a;
            RenderNode renderNode = this.a;
            iJ22.a(renderNode);
        }
    }

    public final void o(int n3) {
        boolean bl2 = true;
        boolean bl3 = y30_0.a(n3, (int)(bl2 ? 1 : 0));
        int n4 = 2;
        if (bl3) {
            this.a.setLayerType(n4);
            RenderNode renderNode = this.a;
            renderNode.setHasOverlappingRendering(bl2);
        } else {
            n3 = (int)(y30_0.a(n3, n4) ? 1 : 0);
            bl3 = false;
            if (n3 != 0) {
                this.a.setLayerType(0);
                RenderNode renderNode = this.a;
                renderNode.setHasOverlappingRendering(false);
            } else {
                this.a.setLayerType(0);
                RenderNode renderNode = this.a;
                renderNode.setHasOverlappingRendering(bl2);
            }
        }
    }

    public final boolean p() {
        return this.a.isValid();
    }

    public final void q(Canvas canvas) {
        Intrinsics.checkNotNull(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        canvas = (DisplayListCanvas)canvas;
        RenderNode renderNode = this.a;
        canvas.drawRenderNode(renderNode);
    }

    public final void r(boolean bl2) {
        this.f = bl2;
        this.a.setClipToBounds(bl2);
    }

    public final boolean s(int n3, int n4, int n7, int n8) {
        this.b = n3;
        this.c = n4;
        this.d = n7;
        this.e = n8;
        return this.a.setLeftTopRightBottom(n3, n4, n7, n8);
    }

    public final void t(float f5) {
        this.a.setElevation(f5);
    }

    public final void u(int n3) {
        int n4;
        this.c = n4 = this.c + n3;
        this.e = n4 = this.e + n3;
        this.a.offsetTopAndBottom(n3);
    }

    public final boolean v() {
        return this.a.setHasOverlappingRendering(true);
    }

    public final boolean w() {
        return this.f;
    }

    public final void x(zl_0 zl_02, gn2 gn22, gJ2$b gJ2$b) {
        RenderNode renderNode = this.a;
        int n3 = this.getWidth();
        int n4 = this.getHeight();
        renderNode = renderNode.start(n3, n4);
        Canvas canvas = zl_02.a().v();
        mf_0 mf_02 = zl_02.a();
        RenderNode renderNode2 = renderNode;
        renderNode2 = (Canvas)renderNode;
        mf_02.w((Canvas)renderNode2);
        mf_02 = zl_02.a();
        if (gn22 != null) {
            mf_02.p();
            hl_0.a(mf_02, gn22);
        }
        gJ2$b.invoke(mf_02);
        if (gn22 != null) {
            mf_02.h();
        }
        zl_02.a().w(canvas);
        this.a.end((DisplayListCanvas)renderNode);
    }

    public final boolean y() {
        return this.a.getClipToOutline();
    }

    public final void z(Matrix matrix) {
        this.a.getMatrix(matrix);
    }
}


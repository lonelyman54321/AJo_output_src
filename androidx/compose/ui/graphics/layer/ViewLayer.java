/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Outline
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package androidx.compose.ui.graphics.layer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.layer.ViewLayer$a;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.graphics.layer.a$a;
import kotlin.jvm.functions.Function1;

public final class ViewLayer
extends View {
    public static final ViewLayer$a k;
    public final View a;
    public final zl_0 b;
    public final xl_0 c;
    public boolean d;
    public Outline e;
    public boolean f;
    public Vo0 g;
    public bp1_0 h;
    public Function1 i;
    public W01 j;

    static {
        ViewLayer$a viewLayer$a;
        k = viewLayer$a = new ViewOutlineProvider();
    }

    public ViewLayer(View object, zl_0 zl_02, xl_0 xl_02) {
        Context context = object.getContext();
        super(context);
        this.a = object;
        this.b = zl_02;
        this.c = xl_02;
        object = k;
        this.setOutlineProvider((ViewOutlineProvider)object);
        this.f = true;
        object = ft0.a;
        this.g = object;
        object = bp1_0.Ltr;
        this.h = object;
        androidx.compose.ui.graphics.layer.a.a.getClass();
        object = a$a.b;
        this.i = object;
        this.setWillNotDraw(false);
        this.setClipBounds(null);
    }

    public final void dispatchDraw(Canvas object) {
        Object object2 = this;
        zl_0 zl_02 = this.b;
        mf_0 mf_02 = zl_02.a;
        Object object3 = mf_02.a;
        Object object4 = object;
        mf_02.a = object;
        object4 = this.g;
        Object object5 = this.h;
        int n3 = this.getWidth();
        float f5 = n3;
        int n4 = this.getHeight();
        float f6 = n4;
        long l2 = bo1_1.a(f5, f6);
        W01 w01 = this.j;
        Function1 function1 = this.i;
        xl_0 xl_02 = this.c;
        Vo0 vo0 = xl_02.b.c();
        xL$b xL$b = xl_02.b;
        bp1_0 bp1_02 = xL$b.e();
        iL iL2 = xL$b.a();
        object = iL2;
        long l3 = xL$b.l();
        object2 = xL$b.b;
        xL$b.g((Vo0)object4);
        xL$b.i((bp1_0)((Object)object5));
        xL$b.f(mf_02);
        xL$b.b(l2);
        xL$b.b = w01;
        mf_02.p();
        try {
            function1.invoke(xl_02);
            mf_02.h();
            xL$b.g(vo0);
            xL$b.i(bp1_02);
            object4 = iL2;
            xL$b.f(iL2);
            xL$b.b(l3);
            xL$b.b = object2;
            zl_02.a.a = object3;
            object2 = this;
            this.d = false;
            return;
        }
        catch (Throwable throwable) {
            object4 = object;
            object3 = object2;
            object2 = this;
            object5 = throwable;
            mf_02.h();
            xL$b.g(vo0);
            xL$b.i(bp1_02);
            xL$b.f((iL)object);
            xL$b.b(l3);
            xL$b.b = object3;
            throw throwable;
        }
    }

    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f;
    }

    public final zl_0 getCanvasHolder() {
        return this.b;
    }

    public final View getOwnerView() {
        return this.a;
    }

    public final boolean hasOverlappingRendering() {
        return this.f;
    }

    public final void invalidate() {
        boolean bl2 = this.d;
        if (!bl2) {
            this.d = bl2 = true;
            super.invalidate();
        }
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean bl2) {
        boolean bl3 = this.f;
        if (bl3 != bl2) {
            this.f = bl2;
            this.invalidate();
        }
    }

    public final void setDrawParams(Vo0 vo0, bp1_0 bp1_02, W01 w01, Function1 function1) {
        this.g = vo0;
        this.h = bp1_02;
        this.i = function1;
        this.j = w01;
    }

    public final void setInvalidated(boolean bl2) {
        this.d = bl2;
    }
}


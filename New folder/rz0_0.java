/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.R$id;

/*
 * Renamed from rZ0
 */
public final class rz0_0
extends ViewGroup
implements oZ0 {
    public static final /* synthetic */ int g;
    public ViewGroup a;
    public View b;
    public final View c;
    public int d;
    public Matrix e;
    public final rZ0$a f;

    public rz0_0(View view) {
        Object object = view.getContext();
        super(object);
        super(this);
        this.f = object;
        this.c = view;
        this.setWillNotDraw(false);
        this.setClipChildren(false);
        this.setLayerType(2, null);
    }

    public final void a(ViewGroup viewGroup, View view) {
        this.a = viewGroup;
        this.b = view;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int n3 = R$id.ghost_view;
        View view = this.c;
        view.setTag(n3, (Object)this);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        rZ0$a rZ0$a = this.f;
        viewTreeObserver.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)rZ0$a);
        n3 = 4;
        ee3_0.c(view, n3);
        viewTreeObserver = view.getParent();
        if (viewTreeObserver != null) {
            viewTreeObserver = (View)view.getParent();
            viewTreeObserver.invalidate();
        }
    }

    public final void onDetachedFromWindow() {
        View view = this.c;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        rZ0$a rZ0$a = this.f;
        viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)rZ0$a);
        ee3_0.c(view, 0);
        int n3 = R$id.ghost_view;
        rZ0$a = null;
        view.setTag(n3, null);
        viewTreeObserver = view.getParent();
        if (viewTreeObserver != null) {
            view = (View)view.getParent();
            view.invalidate();
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        CL.a(canvas, true);
        Matrix matrix = this.e;
        canvas.setMatrix(matrix);
        matrix = this.c;
        ee3_0.c((View)matrix, 0);
        matrix.invalidate();
        ee3_0.c((View)matrix, 4);
        long l2 = this.getDrawingTime();
        this.drawChild(canvas, (View)matrix, l2);
        CL.a(canvas, false);
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
    }

    public final void setVisibility(int n3) {
        super.setVisibility(n3);
        int n4 = R$id.ghost_view;
        View view = this.c;
        rz0_0 rz0_02 = (rz0_0)view.getTag(n4);
        if (rz0_02 == this) {
            n3 = n3 == 0 ? 4 : 0;
            ee3_0.c(view, n3);
        }
    }
}


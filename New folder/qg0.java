/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bumptech.glide.R$id;
import java.util.ArrayList;

public abstract class qg0
implements ki3_1 {
    public static final int c = R$id.glide_custom_view_target_tag;
    public final qg0$a a;
    public final View b;

    public qg0(View view) {
        qg0$a qg0$a;
        dV0.c(view, "Argument must not be null");
        this.b = view;
        this.a = qg0$a = new qg0$a(view);
    }

    public final void a(K63 object) {
        qg0$a qg0$a = this.a;
        Object object2 = qg0$a.a;
        int n3 = object2.getPaddingLeft();
        int n4 = object2.getPaddingRight() + n3;
        ViewGroup.LayoutParams layoutParams = object2.getLayoutParams();
        int n7 = 0;
        if (layoutParams != null) {
            n3 = layoutParams.width;
        } else {
            n3 = 0;
            layoutParams = null;
        }
        int n8 = object2.getWidth();
        n8 = qg0$a.a(n8, n3, n4);
        layoutParams = qg0$a.a;
        n4 = layoutParams.getPaddingTop();
        int n10 = layoutParams.getPaddingBottom() + n4;
        ViewGroup.LayoutParams layoutParams2 = layoutParams.getLayoutParams();
        if (layoutParams2 != null) {
            n7 = layoutParams2.height;
        }
        n4 = layoutParams.getHeight();
        n4 = qg0$a.a(n4, n7, n10);
        n7 = -1 << -1;
        if (n8 <= 0 && n8 != n7 || n4 <= 0 && n4 != n7) {
            object2 = qg0$a.b;
            n4 = (int)(((ArrayList)object2).contains(object) ? 1 : 0);
            if (n4 == 0) {
                ((ArrayList)object2).add(object);
            }
            if ((object = qg0$a.c) == null) {
                object = layoutParams.getViewTreeObserver();
                qg0$a.c = object2 = new qg0$a$a(qg0$a);
                object.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object2);
            }
        } else {
            object.b(n8, n4);
        }
    }

    public final void c(Drawable drawable2) {
    }

    public final void e(Drawable object) {
        object = this.a;
        ViewTreeObserver viewTreeObserver = object.a.getViewTreeObserver();
        boolean bl2 = viewTreeObserver.isAlive();
        if (bl2) {
            qg0$a$a qg0$a$a = object.c;
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)qg0$a$a);
        }
        object.c = null;
        object.b.clear();
    }

    public final void g(LJ2 lJ2) {
        View view = this.b;
        int n3 = c;
        view.setTag(n3, (Object)lJ2);
    }

    public final LJ2 getRequest() {
        Object object = this.b;
        int n3 = c;
        if ((object = object.getTag(n3)) != null) {
            n3 = object instanceof LJ2;
            if (n3 != 0) {
                return (LJ2)object;
            }
            object = new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
            throw object;
        }
        return null;
    }

    public final void h(K63 k63) {
        this.a.b.remove(k63);
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Target for: ");
        View view = this.b;
        stringBuilder.append(view);
        return stringBuilder.toString();
    }
}


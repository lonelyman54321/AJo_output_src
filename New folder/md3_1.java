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

/*
 * Renamed from MD3
 */
public abstract class md3_1
extends Gw {
    public static final int c = R$id.glide_custom_view_target_tag;
    public final View a;
    public final MD3$a b;

    public md3_1(View view) {
        MD3$a mD3$a;
        dV0.c(view, "Argument must not be null");
        this.a = view;
        this.b = mD3$a = new MD3$a(view);
    }

    public final void a(K63 object) {
        MD3$a mD3$a = this.b;
        Object object2 = mD3$a.a;
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
        n8 = mD3$a.a(n8, n3, n4);
        layoutParams = mD3$a.a;
        n4 = layoutParams.getPaddingTop();
        int n10 = layoutParams.getPaddingBottom() + n4;
        ViewGroup.LayoutParams layoutParams2 = layoutParams.getLayoutParams();
        if (layoutParams2 != null) {
            n7 = layoutParams2.height;
        }
        n4 = layoutParams.getHeight();
        n4 = mD3$a.a(n4, n7, n10);
        n7 = -1 << -1;
        if (n8 <= 0 && n8 != n7 || n4 <= 0 && n4 != n7) {
            object2 = mD3$a.b;
            n4 = (int)(((ArrayList)object2).contains(object) ? 1 : 0);
            if (n4 == 0) {
                ((ArrayList)object2).add(object);
            }
            if ((object = mD3$a.c) == null) {
                object = layoutParams.getViewTreeObserver();
                mD3$a.c = object2 = new MD3$a$a(mD3$a);
                object.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object2);
            }
        } else {
            object.b(n8, n4);
        }
    }

    public void e(Drawable object) {
        object = this.b;
        ViewTreeObserver viewTreeObserver = object.a.getViewTreeObserver();
        boolean bl2 = viewTreeObserver.isAlive();
        if (bl2) {
            MD3$a$a mD3$a$a = object.c;
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)mD3$a$a);
        }
        object.c = null;
        object.b.clear();
    }

    public final void g(LJ2 lJ2) {
        View view = this.a;
        int n3 = c;
        view.setTag(n3, (Object)lJ2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final LJ2 getRequest() {
        void var1_6;
        View view = this.a;
        int n3 = c;
        Object object = view.getTag(n3);
        if (object == null) return var1_6;
        n3 = object instanceof LJ2;
        if (n3 == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            throw illegalArgumentException;
        }
        LJ2 lJ2 = (LJ2)object;
        return var1_6;
    }

    public final void h(K63 k63) {
        this.b.b.remove(k63);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Target for: ");
        View view = this.a;
        stringBuilder.append(view);
        return stringBuilder.toString();
    }
}


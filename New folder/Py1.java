/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.ScrollView
 *  android.widget.TextView
 */
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.ril.ajio.databinding.FragmentLoginLayoutNewBinding;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Py1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ ry1_1 b;

    public /* synthetic */ Py1(ViewTreeObserver viewTreeObserver, ry1_1 ry1_12) {
        this.a = viewTreeObserver;
        this.b = ry1_12;
    }

    public final void onGlobalLayout() {
        block11: {
            Object object;
            int n3;
            Object object2 = this.b;
            Intrinsics.checkNotNullParameter(object2, "this$0");
            Object object3 = this.a;
            if (object3 != null && (n3 = object3.isAlive()) != 0) {
                object = ((ry1_1)object2).p;
                object3.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object);
            }
            object3 = new Rect();
            object = ((Fragment)object2).getView();
            if (object != null) {
                object.getWindowVisibleDisplayFrame((Rect)object3);
            }
            object = ((Fragment)object2).getView();
            Jy1 jy1 = null;
            if (object != null && (object = object.getRootView()) != null) {
                n3 = object.getHeight();
            } else {
                n3 = 0;
                object = null;
            }
            int n4 = ((Rect)object3).bottom;
            n4 = n3 - n4;
            double d2 = n4;
            double d5 = n3;
            double d7 = 0.15;
            double d9 = d2 - (d5 *= d7);
            double d12 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
            if (d12 > 0) {
                object2 = ((ry1_1)object2).r;
                if (object2 != null && (object3 = ((FragmentLoginLayoutNewBinding)object2).rootView) != null && (object = ((FragmentLoginLayoutNewBinding)object2).scrollRootView) != null && (object2 = ((FragmentLoginLayoutNewBinding)object2).emptyViewLogin) != null) {
                    jy1 = new Jy1((TextView)object2, (ScrollView)object, (ConstraintLayout)((Object)object3));
                    long l2 = 100;
                    object.postDelayed((Runnable)jy1, l2);
                }
            } else {
                object2 = ((ry1_1)object2).r;
                if (object2 == null) break block11;
                object2 = ((FragmentLoginLayoutNewBinding)object2).scrollRootView;
                if (object2 == null) break block11;
                try {
                    object2.scrollTo(0, 0);
                    object2 = Unit.a;
                }
                catch (IllegalStateException illegalStateException) {
                    object3 = yn3_0.a;
                    String string2 = "exception ";
                    object = new StringBuilder(string2);
                    ((StringBuilder)object).append(illegalStateException);
                    ((StringBuilder)object).append(" at scrollview");
                    Object object4 = ((StringBuilder)object).toString();
                    object = new Object[]{};
                    ((yn3$a)object3).a((String)object4, (Object[])object);
                    object4 = Unit.a;
                }
            }
        }
    }
}


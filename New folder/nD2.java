/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

public final class nD2
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ wd2_0 b;

    public /* synthetic */ nD2(ViewTreeObserver viewTreeObserver, wd2_0 wd2_02) {
        this.a = viewTreeObserver;
        this.b = wd2_02;
    }

    public final void onGlobalLayout() {
        Object object;
        int n3;
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.a;
        Object[] objectArray = null;
        if (object3 != null && (n3 = object3.isAlive()) != 0) {
            object = yn3_0.a;
            String string2 = "remove observer called";
            Object[] objectArray2 = new Object[]{};
            ((yn3$a)object).a(string2, objectArray2);
            object = ((wd2_0)object2).K;
            object3.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object);
        }
        object3 = new Rect();
        object = ((Fragment)object2).getView();
        if (object != null) {
            object.getWindowVisibleDisplayFrame((Rect)object3);
        }
        if ((object = ((Fragment)object2).getView()) != null && (object = object.getRootView()) != null) {
            n3 = object.getHeight();
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = object3.bottom;
        double d2 = n3 - n4;
        double d5 = n3;
        double d7 = 0.15;
        double d9 = d2 - (d5 *= d7);
        n4 = (int)(d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1));
        if (n4 > 0) {
            object3 = yn3_0.a;
            object = "Keyboard open";
            objectArray = new Object[]{};
            object3.a((String)object, objectArray);
            object2 = ((wd2_0)object2).u;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollView");
                object2 = null;
            }
            ai0_2.s((NestedScrollView)object2);
        } else {
            object2 = ((wd2_0)object2).D;
            if (object2 != null) {
                object2.clearFocus();
            }
            object2 = yn3_0.a;
            object3 = "Keyboard closed";
            objectArray = new Object[]{};
            ((yn3$a)object2).a((String)object3, objectArray);
        }
    }
}


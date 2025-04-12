/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.customviews.widgets.AjioEditText;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fD0
 */
public final class fd0_0 {
    public static wq0 a(int n3, int n4, int n7) {
        int n8 = -2;
        if (n3 == n8) {
            return wq0$b.a;
        }
        if ((n3 -= n7) > 0) {
            wq0$a wq0$a = new wq0$a(n3);
            return wq0$a;
        }
        if ((n4 -= n7) > 0) {
            wq0$a wq0$a = new wq0$a(n4);
            return wq0$a;
        }
        return null;
    }

    public static B63 b(id3_1 object) {
        int n3;
        View view;
        Object object2 = object.getView().getLayoutParams();
        int n4 = -1;
        int n7 = object2 != null ? object2.width : -1;
        View view2 = object.getView();
        int n8 = view2.getWidth();
        int n10 = object.b();
        int n14 = 0;
        View view3 = null;
        if (n10 != 0) {
            view = object.getView();
            n10 = view.getPaddingLeft();
            View view4 = object.getView();
            n3 = view4.getPaddingRight() + n10;
        } else {
            n3 = 0;
            Object var10_11 = null;
        }
        object2 = fd0_0.a(n7, n8, n3);
        n8 = 0;
        view2 = null;
        if (object2 == null) {
            return null;
        }
        view = object.getView().getLayoutParams();
        if (view != null) {
            n4 = view.height;
        }
        view = object.getView();
        n10 = view.getHeight();
        n3 = (int)(object.b() ? 1 : 0);
        if (n3 != 0) {
            view3 = object.getView();
            n14 = view3.getPaddingTop();
            object = object.getView();
            int n15 = object.getPaddingBottom();
            n14 += n15;
        }
        if ((object = fd0_0.a(n4, n10, n14)) == null) {
            return null;
        }
        B63 b63 = new B63((wq0)object2, (wq0)object);
        return b63;
    }

    public static int c(AjioEditText ajioEditText) {
        Intrinsics.checkNotNull(ajioEditText);
        ajioEditText = ajioEditText.getText();
        Intrinsics.checkNotNull(ajioEditText);
        return ajioEditText.length();
    }
}


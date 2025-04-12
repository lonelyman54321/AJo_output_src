/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$OnHierarchyChangeListener
 *  android.view.WindowInsets
 *  android.window.SplashScreenView
 */
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from za3$a
 */
public final class za3$a_0
implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ za3_1 a;
    public final /* synthetic */ Activity b;

    public za3$a_0(za3_1 za3_12, Activity activity) {
        this.a = za3_12;
        this.b = activity;
    }

    public final void onChildViewAdded(View view, View object) {
        boolean bl2 = xa3_0.a(object);
        if (bl2) {
            view = ya3_1.a(object);
            object = this.a;
            object.getClass();
            Intrinsics.checkNotNullParameter(view, "child");
            WindowInsets windowInsets = ua3_0.a(wa3_1.a());
            Intrinsics.checkNotNullExpressionValue(windowInsets, "Builder().build()");
            int n3 = -1 << -1;
            int n4 = -1 >>> 1;
            Rect rect = new Rect(n3, n3, n4, n4);
            view = va3_0.a((SplashScreenView)view).computeSystemWindowInsets(windowInsets, rect);
            if (windowInsets == view) {
                bl2 = rect.isEmpty();
            }
            object.getClass();
            view = (ViewGroup)this.b.getWindow().getDecorView();
            object = null;
            view.setOnHierarchyChangeListener(null);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
    }
}


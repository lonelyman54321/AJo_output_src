/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.LayoutTransition
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/*
 * Renamed from lk
 */
public final class lk_0 {
    public static final ViewGroup.MarginLayoutParams a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int n3 = -1;
        a = marginLayoutParams = new ViewGroup.MarginLayoutParams(n3, n3);
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public static boolean a(View view) {
        int n3 = view instanceof ViewGroup;
        if (n3 != 0) {
            view = (ViewGroup)view;
            LayoutTransition layoutTransition = view.getLayoutTransition();
            boolean bl2 = true;
            if (layoutTransition != null && (n3 = layoutTransition.isChangingLayout()) != 0) {
                return bl2;
            }
            n3 = view.getChildCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                View view2 = view.getChildAt(i3);
                boolean bl3 = lk_0.a(view2);
                if (!bl3) continue;
                return bl2;
            }
        }
        return false;
    }
}


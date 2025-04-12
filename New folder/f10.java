/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;

public final class f10 {
    public static final ViewGroup.LayoutParams a;

    static {
        ViewGroup.LayoutParams layoutParams;
        int n3 = -2;
        a = layoutParams = new ViewGroup.LayoutParams(n3, n3);
    }

    public static void a(ComponentActivity componentActivity, u10 u102) {
        ViewGroup viewGroup = (ViewGroup)componentActivity.getWindow().getDecorView().findViewById(0x1020002);
        Object object = null;
        int n3 = (viewGroup = viewGroup.getChildAt(0)) instanceof ComposeView;
        if ((viewGroup = n3 != 0 ? (ComposeView)viewGroup : null) != null) {
            viewGroup.setParentCompositionContext(null);
            viewGroup.setContent(u102);
        } else {
            n3 = 6;
            viewGroup = new ComposeView((Context)componentActivity, null, n3, 0);
            viewGroup.setParentCompositionContext(null);
            viewGroup.setContent(u102);
            u102 = componentActivity.getWindow().getDecorView();
            object = VD3.a((View)u102);
            if (object == null) {
                VD3.b((View)u102, componentActivity);
            }
            if ((object = ae3_0.a((View)u102)) == null) {
                ae3_0.b((View)u102, componentActivity);
            }
            if ((object = ZD3.a((View)u102)) == null) {
                ZD3.b((View)u102, componentActivity);
            }
            u102 = a;
            componentActivity.setContentView((View)viewGroup, (ViewGroup.LayoutParams)u102);
        }
    }
}


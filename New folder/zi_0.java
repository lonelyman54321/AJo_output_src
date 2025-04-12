/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.compose.ui.window.PopupLayout;

/*
 * Renamed from zi
 */
public final class zi_0
implements Cr0 {
    public final /* synthetic */ PopupLayout a;

    public zi_0(PopupLayout popupLayout) {
        this.a = popupLayout;
    }

    public final void dispose() {
        PopupLayout popupLayout = this.a;
        popupLayout.c();
        ((Object)((Object)popupLayout)).getClass();
        VD3.b((View)popupLayout, null);
        popupLayout.n.removeViewImmediate((View)popupLayout);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.ListPopupWindow;

class ActivityChooserView$2
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ActivityChooserView a;

    public ActivityChooserView$2(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public final void onGlobalLayout() {
        Object object = this.a;
        boolean bl2 = object.b();
        if (bl2) {
            bl2 = object.isShown();
            if (!bl2) {
                object = object.getListPopupWindow();
                ((ListPopupWindow)object).dismiss();
            } else {
                ListPopupWindow listPopupWindow = object.getListPopupWindow();
                listPopupWindow.show();
                object = object.g;
                if (object != null && (object = ((Q2)object).a) != null) {
                    object = (ActionMenuPresenter)object;
                    bl2 = true;
                    ((ActionMenuPresenter)object).d(bl2);
                }
            }
        }
    }
}


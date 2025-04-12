/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.PopupWindow$OnDismissListener
 */
package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.ActivityChooserView$e;

public final class ActivityChooserView$f
implements AdapterView.OnItemClickListener,
View.OnClickListener,
View.OnLongClickListener,
PopupWindow.OnDismissListener {
    public final /* synthetic */ ActivityChooserView a;

    public ActivityChooserView$f(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public final void onClick(View object) {
        ActivityChooserView activityChooserView = this.a;
        FrameLayout frameLayout = activityChooserView.f;
        ActivityChooserView$e activityChooserView$e = activityChooserView.a;
        if (object != frameLayout) {
            activityChooserView = activityChooserView.d;
            if (object == activityChooserView) {
                ((Object)((Object)activityChooserView$e)).getClass();
                object = new IllegalStateException("No data model. Did you call #setDataModel?");
                throw object;
            }
            object = new IllegalArgumentException();
            throw object;
        }
        activityChooserView.a();
        ((Object)((Object)activityChooserView$e)).getClass();
        throw null;
    }

    public final void onDismiss() {
        Object object = this.a;
        PopupWindow.OnDismissListener onDismissListener = ((ActivityChooserView)((Object)object)).j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        if ((object = ((ActivityChooserView)((Object)object)).g) != null && (object = ((Q2)object).a) != null) {
            object = (ActionMenuPresenter)object;
            onDismissListener = null;
            ((ActionMenuPresenter)object).d(false);
        }
    }

    public final void onItemClick(AdapterView object, View view, int n3, long l2) {
        ((Object)((Object)((ActivityChooserView$e)object.getAdapter()))).getClass();
        object = this.a;
        ((ActivityChooserView)((Object)object)).a();
        ((Object)((Object)((ActivityChooserView)((Object)object)).a)).getClass();
        throw null;
    }

    public final boolean onLongClick(View object) {
        ActivityChooserView activityChooserView = this.a;
        FrameLayout frameLayout = activityChooserView.f;
        if (object == frameLayout) {
            ((Object)((Object)activityChooserView.a)).getClass();
            throw null;
        }
        object = new IllegalArgumentException();
        throw object;
    }
}


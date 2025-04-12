/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.FrameLayout
 */
package androidx.appcompat.widget;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.ForwardingListener;

public final class ActivityChooserView$c
extends ForwardingListener {
    public final /* synthetic */ ActivityChooserView j;

    public ActivityChooserView$c(ActivityChooserView activityChooserView, FrameLayout frameLayout) {
        this.j = activityChooserView;
        super((View)frameLayout);
    }

    public final q43 b() {
        return this.j.getListPopupWindow();
    }

    public final boolean c() {
        Object object = this.j;
        boolean bl2 = object.b();
        if (!bl2 && (bl2 = object.k)) {
            ((Object)((Object)object.a)).getClass();
            object = new IllegalStateException("No data model. Did you call #setDataModel?");
            throw object;
        }
        return true;
    }

    public final boolean d() {
        this.j.a();
        return true;
    }
}


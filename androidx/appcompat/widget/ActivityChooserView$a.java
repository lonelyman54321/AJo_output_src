/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 */
package androidx.appcompat.widget;

import android.database.DataSetObserver;
import androidx.appcompat.widget.ActivityChooserView;

public final class ActivityChooserView$a
extends DataSetObserver {
    public final /* synthetic */ ActivityChooserView a;

    public ActivityChooserView$a(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public final void onChanged() {
        super.onChanged();
        this.a.a.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        super.onInvalidated();
        this.a.a.notifyDataSetInvalidated();
    }
}


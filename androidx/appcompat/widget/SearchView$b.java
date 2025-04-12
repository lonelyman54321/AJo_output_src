/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.SearchView;

public final class SearchView$b
implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView a;

    public SearchView$b(SearchView searchView) {
        this.a = searchView;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = this.a;
        View.OnFocusChangeListener onFocusChangeListener = object.w;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(object, bl2);
        }
    }
}


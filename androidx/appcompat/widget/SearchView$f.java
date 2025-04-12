/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

public final class SearchView$f
implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView a;

    public SearchView$f(SearchView searchView) {
        this.a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int n3, KeyEvent keyEvent) {
        this.a.k();
        return true;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 */
package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

public final class SearchView$a
implements TextWatcher {
    public final /* synthetic */ SearchView a;

    public SearchView$a(SearchView searchView) {
        this.a = searchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        SearchView searchView = this.a;
        Object object = searchView.a.getText();
        searchView.I = object;
        n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
        n7 = n4 ^ 1;
        searchView.p(n7 != 0);
        n7 = (int)(searchView.G ? 1 : 0);
        int n8 = 8;
        if (n7 != 0 && (n7 = (int)(searchView.z ? 1 : 0)) == 0 && n4 != 0) {
            object = searchView.f;
            object.setVisibility(n8);
            n8 = 0;
        }
        searchView.h.setVisibility(n8);
        searchView.l();
        searchView.o();
        object = searchView.v;
        if (object != null && (n4 = (int)(TextUtils.equals((CharSequence)charSequence, (CharSequence)(object = searchView.H)) ? 1 : 0)) == 0) {
            object = searchView.v;
            String string2 = charSequence.toString();
            object.q1(string2);
        }
        charSequence = charSequence.toString();
        searchView.H = charSequence;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.SearchableInfo
 *  android.content.Intent
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 */
package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

public final class SearchView$e
implements View.OnKeyListener {
    public final /* synthetic */ SearchView a;

    public SearchView$e(SearchView searchView) {
        this.a = searchView;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final boolean onKey(View object, int n3, KeyEvent keyEvent) {
        void var2_7;
        void var3_8;
        int n4;
        SearchView searchView = this.a;
        Object object2 = searchView.L;
        boolean bl2 = false;
        if (object2 == null) {
            return false;
        }
        object2 = searchView.a;
        int n7 = object2.isPopupShowing();
        int n8 = 66;
        int n10 = 1;
        if (n7 != 0 && (n7 = object2.getListSelection()) != (n4 = -1)) {
            SearchableInfo searchableInfo = searchView.L;
            if (searchableInfo == null) {
                return bl2;
            }
            gf0_0 gf0_02 = searchView.A;
            if (gf0_02 == null) {
                return bl2;
            }
            int n14 = var3_8.getAction();
            if (n14 != 0) return bl2;
            n14 = (int)(var3_8.hasNoModifiers() ? 1 : 0);
            if (n14 == 0) return bl2;
            if (var2_7 != n8 && var2_7 != (n14 = 84) && var2_7 != (n14 = 61)) {
                int n15;
                n14 = 21;
                if (var2_7 != n14 && var2_7 != (n15 = 22)) {
                    n14 = 19;
                    if (var2_7 != n14) return bl2;
                    object2.getListSelection();
                    return bl2;
                }
                if (var2_7 == n14) {
                    n14 = 0;
                    Object var1_4 = null;
                } else {
                    n14 = object2.length();
                }
                object2.setSelection(n14);
                object2.setListSelection(0);
                object2.clearListSelection();
                ((SearchView$SearchAutoComplete)object2).a();
                return true;
            } else {
                n14 = object2.getListSelection();
                searchView.h(n14);
            }
            return true;
        }
        Editable editable = object2.getText();
        n7 = TextUtils.getTrimmedLength((CharSequence)editable);
        if (n7 == 0) {
            return false;
        }
        n7 = (int)(var3_8.hasNoModifiers() ? 1 : 0);
        if (n7 == 0) return false;
        int n16 = var3_8.getAction();
        if (n16 != n10) return false;
        if (var2_7 != n8) return false;
        object.cancelLongPress();
        String string2 = object2.getText().toString();
        Intent intent = searchView.d(null, "android.intent.action.SEARCH", null, string2);
        searchView.getContext().startActivity(intent);
        return n10 != 0;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.SearchableInfo
 *  android.content.ActivityNotFoundException
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 */
package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

public final class SearchView$d
implements View.OnClickListener {
    public final /* synthetic */ SearchView a;

    public SearchView$d(SearchView searchView) {
        this.a = searchView;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View object) {
        SearchView searchView = this.a;
        ImageView imageView = searchView.e;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = searchView.a;
        if (object == imageView) {
            searchView.q(false);
            searchView$SearchAutoComplete.requestFocus();
            boolean bl2 = true;
            searchView$SearchAutoComplete.setImeVisibility(bl2);
            View.OnClickListener onClickListener = searchView.x;
            if (onClickListener == null) return;
            onClickListener.onClick((View)searchView);
            return;
        }
        ImageView imageView2 = searchView.g;
        if (object == imageView2) {
            searchView.g();
            return;
        }
        ImageView imageView3 = searchView.f;
        if (object == imageView3) {
            searchView.k();
            return;
        }
        ImageView imageView4 = searchView.h;
        if (object != imageView4) {
            if (object != searchView$SearchAutoComplete) return;
            searchView.f();
            return;
        }
        SearchableInfo searchableInfo = searchView.L;
        if (searchableInfo == null) {
            return;
        }
        try {
            void var1_7;
            boolean bl3 = searchableInfo.getVoiceSearchLaunchWebSearch();
            if (!bl3) {
                bl3 = searchableInfo.getVoiceSearchLaunchRecognizer();
                if (!bl3) return;
                Intent intent = searchView.t;
                Intent intent2 = searchView.e(intent, searchableInfo);
                searchView = searchView.getContext();
                searchView.startActivity(intent2);
                return;
            }
            Intent intent = searchView.s;
            searchView$SearchAutoComplete = new Intent(intent);
            ComponentName componentName = searchableInfo.getSearchActivity();
            if (componentName == null) {
                boolean bl4 = false;
                Object var1_5 = null;
            } else {
                String string2 = componentName.flattenToShortString();
            }
            String string3 = "calling_package";
            searchView$SearchAutoComplete.putExtra(string3, (String)var1_7);
            Context context = searchView.getContext();
            context.startActivity((Intent)searchView$SearchAutoComplete);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            return;
        }
    }
}


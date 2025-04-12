/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.search;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchBarAnimationHelper;

public final class c
implements Runnable {
    public final /* synthetic */ SearchBarAnimationHelper a;
    public final /* synthetic */ SearchBar b;
    public final /* synthetic */ View c;
    public final /* synthetic */ AppBarLayout d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ c(SearchBarAnimationHelper searchBarAnimationHelper, SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean bl2) {
        this.a = searchBarAnimationHelper;
        this.b = searchBar;
        this.c = view;
        this.d = appBarLayout;
        this.e = bl2;
    }

    public final void run() {
        AppBarLayout appBarLayout = this.d;
        boolean bl2 = this.e;
        SearchBarAnimationHelper searchBarAnimationHelper = this.a;
        SearchBar searchBar = this.b;
        View view = this.c;
        SearchBarAnimationHelper.b(searchBarAnimationHelper, searchBar, view, appBarLayout, bl2);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.search;

import com.google.android.material.search.SearchViewAnimationHelper;

public final class j
implements Runnable {
    public final /* synthetic */ SearchViewAnimationHelper a;

    public /* synthetic */ j(SearchViewAnimationHelper searchViewAnimationHelper) {
        this.a = searchViewAnimationHelper;
    }

    public final void run() {
        SearchViewAnimationHelper.a(this.a);
    }
}


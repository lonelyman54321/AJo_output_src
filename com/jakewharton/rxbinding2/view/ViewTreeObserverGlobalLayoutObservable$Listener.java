/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.jakewharton.rxbinding2.view;

import android.view.ViewTreeObserver;
import io.reactivex.android.MainThreadDisposable;

final class ViewTreeObserverGlobalLayoutObservable$Listener
extends MainThreadDisposable
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final void a() {
        throw null;
    }

    public final void onGlobalLayout() {
        Object object = this.a;
        boolean bl2 = object.get();
        if (bl2) {
            return;
        }
        object = t42_0.INSTANCE;
        throw null;
    }
}


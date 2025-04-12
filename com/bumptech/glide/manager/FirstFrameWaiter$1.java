/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnDrawListener
 */
package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.manager.FirstFrameWaiter;
import com.bumptech.glide.manager.FirstFrameWaiter$1$1;

public final class FirstFrameWaiter$1
implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ FirstFrameWaiter b;

    public FirstFrameWaiter$1(FirstFrameWaiter firstFrameWaiter, View view) {
        this.b = firstFrameWaiter;
        this.a = view;
    }

    public final void onDraw() {
        FirstFrameWaiter$1$1 firstFrameWaiter$1$1 = new FirstFrameWaiter$1$1(this, this);
        dz3.f().post((Runnable)firstFrameWaiter$1$1);
    }
}


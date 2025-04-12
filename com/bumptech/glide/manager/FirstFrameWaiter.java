/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 */
package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import com.bumptech.glide.manager.FirstFrameWaiter$1;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class FirstFrameWaiter
implements TW0 {
    public final Set a;
    public volatile boolean b;

    public FirstFrameWaiter() {
        Object object = new WeakHashMap();
        this.a = object = Collections.newSetFromMap(object);
    }

    public final void b(Activity activity) {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        Set set = this.a;
        bl2 = set.add(activity);
        if (!bl2) {
            return;
        }
        activity = activity.getWindow().getDecorView();
        set = activity.getViewTreeObserver();
        FirstFrameWaiter$1 firstFrameWaiter$1 = new FirstFrameWaiter$1(this, (View)activity);
        set.addOnDrawListener(firstFrameWaiter$1);
    }
}


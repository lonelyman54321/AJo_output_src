/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.getkeepsafe.taptargetview;

import android.view.View;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.ViewTapTarget$1;
import com.getkeepsafe.taptargetview.ViewUtil;

class ViewTapTarget
extends TapTarget {
    final View view;

    public ViewTapTarget(View object, CharSequence charSequence, CharSequence charSequence2) {
        super(charSequence, charSequence2);
        if (object != null) {
            this.view = object;
            return;
        }
        super("Given null view to target");
        throw object;
    }

    public void onReady(Runnable runnable2) {
        View view = this.view;
        ViewTapTarget$1 viewTapTarget$1 = new ViewTapTarget$1(this, runnable2);
        ViewUtil.onLaidOut(view, viewTapTarget$1);
    }
}


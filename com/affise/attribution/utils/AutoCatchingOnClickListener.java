/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.affise.attribution.utils;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AutoCatchingOnClickListener
implements View.OnClickListener {
    private final Function1 afterClickListenerAction;
    private final View.OnClickListener oldClickListener;

    public AutoCatchingOnClickListener(View.OnClickListener onClickListener, Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "afterClickListenerAction");
        this.oldClickListener = onClickListener;
        this.afterClickListenerAction = function1;
    }

    public void onClick(View view) {
        Object object = this.oldClickListener;
        if (object != null) {
            object.onClick(view);
        }
        if (view != null) {
            object = this.afterClickListenerAction;
            object.invoke(view);
        }
    }
}


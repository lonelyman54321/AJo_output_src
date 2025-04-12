/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 */
package com.affise.attribution.utils;

import android.app.Activity;
import android.view.View;
import com.affise.attribution.utils.ActivityActionsManagerImpl;
import com.affise.attribution.utils.ActivityClickCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class ActivityActionsManagerImpl$addListener$3$1
extends Lambda
implements Function1 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ActivityActionsManagerImpl this$0;

    public ActivityActionsManagerImpl$addListener$3$1(ActivityActionsManagerImpl activityActionsManagerImpl, Activity activity) {
        this.this$0 = activityActionsManagerImpl;
        this.$activity = activity;
        super(1);
    }

    public final void invoke(View view) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(view, "view");
        Object object = ActivityActionsManagerImpl.access$getOnActivityClickListeners$p(this.this$0);
        Activity activity = this.$activity;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            ActivityClickCallback activityClickCallback = (ActivityClickCallback)object.next();
            activityClickCallback.handle(activity, view);
        }
    }
}


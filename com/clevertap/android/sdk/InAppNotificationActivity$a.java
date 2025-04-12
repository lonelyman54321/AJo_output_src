/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk;

import com.clevertap.android.sdk.InAppNotificationActivity;

public final class InAppNotificationActivity$a
extends W72 {
    public final /* synthetic */ InAppNotificationActivity a;

    public InAppNotificationActivity$a(InAppNotificationActivity inAppNotificationActivity) {
        this.a = inAppNotificationActivity;
        super(true);
    }

    public final void handleOnBackPressed() {
        InAppNotificationActivity inAppNotificationActivity = this.a;
        inAppNotificationActivity.finish();
        inAppNotificationActivity.s2(null, true);
    }
}


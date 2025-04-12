/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 */
package com.facebook.login;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.DeviceAuthDialog;

public final class DeviceAuthDialog$c
extends Dialog {
    public final /* synthetic */ DeviceAuthDialog a;

    public DeviceAuthDialog$c(DeviceAuthDialog deviceAuthDialog, FragmentActivity fragmentActivity, int n3) {
        this.a = deviceAuthDialog;
        super((Context)fragmentActivity, n3);
    }

    public final void onBackPressed() {
        this.a.getClass();
        super.onBackPressed();
    }
}


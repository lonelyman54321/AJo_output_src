/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.util.AttributeSet
 */
package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.widget.DeviceLoginButton$a;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.LoginButton$b;
import kotlin.jvm.internal.Intrinsics;

public final class DeviceLoginButton
extends LoginButton {
    public Uri z;

    public DeviceLoginButton(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        super(context, attributeSet, n3);
    }

    public final Uri getDeviceRedirectUri() {
        return this.z;
    }

    public LoginButton$b getNewLoginClickListener() {
        DeviceLoginButton$a deviceLoginButton$a = new DeviceLoginButton$a(this);
        return deviceLoginButton$a;
    }

    public final void setDeviceRedirectUri(Uri uri) {
        this.z = uri;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.login.widget;

import com.facebook.login.e;
import com.facebook.login.j;
import com.facebook.login.widget.DeviceLoginButton;
import com.facebook.login.widget.LoginButton$b;
import kotlin.jvm.internal.Intrinsics;

public final class DeviceLoginButton$a
extends LoginButton$b {
    public final /* synthetic */ DeviceLoginButton b;

    public DeviceLoginButton$a(DeviceLoginButton deviceLoginButton) {
        this.b = deviceLoginButton;
        super(deviceLoginButton);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j a() {
        DeviceLoginButton deviceLoginButton = this.b;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        try {
            Object object;
            block6: {
                object = e.m;
                object = e.class;
                boolean bl3 = td0.b(object);
                if (!bl3) {
                    try {
                        object = e.m;
                        break block6;
                    }
                    catch (Throwable throwable) {
                        td0.a(object, throwable);
                    }
                }
                bl2 = false;
                object = null;
            }
            object = ((hh3_2)object).getValue();
            object = (e)object;
            Enum enum_ = deviceLoginButton.getDefaultAudience();
            object.getClass();
            String string2 = "defaultAudience";
            Intrinsics.checkNotNullParameter(enum_, string2);
            ((j)object).b = enum_;
            enum_ = uy1.DEVICE_AUTH;
            string2 = "loginBehavior";
            Intrinsics.checkNotNullParameter(enum_, string2);
            ((j)object).a = enum_;
            deviceLoginButton.getDeviceRedirectUri();
            td0.b(object);
            return object;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return null;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.DeviceAuthMethodHandler$b;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginMethodHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

public class DeviceAuthMethodHandler
extends LoginMethodHandler {
    public static final Parcelable.Creator CREATOR;
    public static final DeviceAuthMethodHandler$b d;
    public static ScheduledThreadPoolExecutor e;
    public final String c;

    static {
        Object object = new Object();
        d = object;
        object = new Object();
        CREATOR = object;
    }

    public DeviceAuthMethodHandler(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        super(parcel);
        this.c = "device_auth";
    }

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        super(loginClient);
        this.c = "device_auth";
    }

    public final int describeContents() {
        return 0;
    }

    public final String f() {
        return this.c;
    }

    public final int l(LoginClient$Request loginClient$Request) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(loginClient$Request, "request");
        Object object = this.e().f();
        if (object != null && !(bl2 = object.isFinishing())) {
            DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
            object = ((FragmentActivity)object).getSupportFragmentManager();
            String string2 = "login_with_facebook";
            deviceAuthDialog.show((FragmentManager)object, string2);
            deviceAuthDialog.Wa(loginClient$Request);
        }
        return 1;
    }
}


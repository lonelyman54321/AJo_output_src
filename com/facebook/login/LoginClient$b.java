/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginMethodHandler;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class LoginClient$b
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        Object object2;
        int n3;
        Object object3 = "source";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        LoginClient loginClient = new Object();
        loginClient.b = n3 = -1;
        object3 = LoginMethodHandler.class.getClassLoader();
        object3 = object.readParcelableArray((ClassLoader)object3);
        if (object3 == null) {
            object3 = new Parcelable[]{};
        }
        ArrayList<Parcelable> arrayList = new ArrayList<Parcelable>();
        int n4 = ((Parcelable[])object3).length;
        int n7 = 0;
        while (true) {
            object2 = null;
            if (n7 >= n4) break;
            Object object4 = object3[n7];
            boolean bl2 = object4 instanceof LoginMethodHandler;
            if (bl2) {
                object2 = object4;
                object2 = (LoginMethodHandler)object4;
            }
            if (object2 != null) {
                object4 = "<set-?>";
                Intrinsics.checkNotNullParameter(loginClient, (String)object4);
                object2.b = loginClient;
            }
            if (object2 != null) {
                arrayList.add((Parcelable)object2);
            }
            ++n7;
        }
        object3 = new LoginMethodHandler[]{};
        object3 = (LoginMethodHandler[])arrayList.toArray((T[])object3);
        loginClient.a = object3;
        loginClient.b = n3 = object.readInt();
        object3 = LoginClient$Request.class.getClassLoader();
        loginClient.g = object3 = (LoginClient$Request)object.readParcelable((ClassLoader)object3);
        object3 = lz3_0.J(object);
        if (object3 != null) {
            object3 = fh1_2.q((Map)object3);
        } else {
            n3 = 0;
            object3 = null;
        }
        loginClient.h = object3;
        object = lz3_0.J(object);
        if (object != null) {
            object2 = fh1_2.q((Map)object);
        }
        loginClient.i = object2;
        return loginClient;
    }

    public final Object[] newArray(int n3) {
        return new LoginClient[n3];
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.i$b;
import androidx.navigation.NavBackStackEntryState$a;
import androidx.navigation.d;
import androidx.navigation.h;
import androidx.navigation.i;
import kotlin.jvm.internal.Intrinsics;

public final class NavBackStackEntryState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final Bundle c;
    public final Bundle d;

    static {
        NavBackStackEntryState$a navBackStackEntryState$a = new Object();
        CREATOR = navBackStackEntryState$a;
    }

    public NavBackStackEntryState(Parcel parcel) {
        int n3;
        Intrinsics.checkNotNullParameter(parcel, "inParcel");
        Object object = parcel.readString();
        Intrinsics.checkNotNull(object);
        this.a = object;
        this.b = n3 = parcel.readInt();
        object = NavBackStackEntryState.class;
        ClassLoader classLoader = ((Class)object).getClassLoader();
        classLoader = parcel.readBundle(classLoader);
        this.c = classLoader;
        object = ((Class)object).getClassLoader();
        parcel = parcel.readBundle((ClassLoader)object);
        Intrinsics.checkNotNull(parcel);
        this.d = parcel;
    }

    public NavBackStackEntryState(d d2) {
        int n3;
        String string2;
        Intrinsics.checkNotNullParameter(d2, "entry");
        this.a = string2 = d2.f;
        this.b = n3 = d2.b.g;
        string2 = d2.a();
        this.c = string2;
        this.d = string2;
        Intrinsics.checkNotNullParameter(string2, "outBundle");
        d2.i.c((Bundle)string2);
    }

    public final d a(Context context, i i3, i$b i$b, h h3) {
        Object object;
        Intrinsics.checkNotNullParameter(context, "context");
        Object object2 = "destination";
        Intrinsics.checkNotNullParameter(i3, (String)object2);
        String string2 = "hostLifecycleState";
        Intrinsics.checkNotNullParameter((Object)i$b, string2);
        Bundle bundle = this.c;
        if (bundle != null) {
            object = context.getClassLoader();
            bundle.setClassLoader((ClassLoader)object);
        } else {
            bundle = null;
        }
        Intrinsics.checkNotNullParameter(i3, (String)object2);
        Intrinsics.checkNotNullParameter((Object)i$b, string2);
        String string3 = this.a;
        Intrinsics.checkNotNullParameter(string3, "id");
        Bundle bundle2 = this.d;
        object = object2;
        object2 = new d(context, i3, bundle, i$b, h3, string3, bundle2);
        return object2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = this.a;
        parcel.writeString(string2);
        n3 = this.b;
        parcel.writeInt(n3);
        string2 = this.c;
        parcel.writeBundle((Bundle)string2);
        string2 = this.d;
        parcel.writeBundle((Bundle)string2);
    }
}


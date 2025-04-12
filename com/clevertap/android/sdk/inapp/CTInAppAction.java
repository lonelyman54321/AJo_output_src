/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.CTInAppAction$a;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class CTInAppAction
implements Parcelable {
    public static final CTInAppAction$a CREATOR;
    public xf1_1 a;
    public String b;
    public HashMap c;
    public CustomTemplateInAppData d;
    public boolean e;

    static {
        CTInAppAction$a cTInAppAction$a;
        CREATOR = cTInAppAction$a = new Object();
    }

    public CTInAppAction(Parcel parcel) {
        Object object;
        Object object2 = null;
        if (parcel != null && (object = parcel.readString()) != null) {
            xf1$a xf1$a = xf1_1.Companion;
            xf1$a.getClass();
            object = xf1$a.a(object);
        } else {
            object = null;
        }
        this.a = object;
        object = parcel != null ? parcel.readString() : null;
        this.b = object;
        object = parcel != null ? parcel.readHashMap(null) : null;
        boolean bl2 = object instanceof HashMap;
        if (!bl2) {
            object = null;
        }
        this.c = (HashMap)object;
        if (parcel != null) {
            object2 = CustomTemplateInAppData.class.getClassLoader();
            parcel = parcel.readParcelable((ClassLoader)object2);
            object2 = parcel;
            object2 = (CustomTemplateInAppData)parcel;
        }
        this.d = (CustomTemplateInAppData)object2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.a;
        object = object != null ? object.toString() : null;
        parcel.writeString((String)object);
        object = this.b;
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeMap((Map)object);
        object = this.d;
        parcel.writeParcelable((Parcelable)object, n3);
    }
}


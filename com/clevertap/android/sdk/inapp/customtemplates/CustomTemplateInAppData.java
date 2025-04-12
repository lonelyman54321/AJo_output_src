/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp.customtemplates;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$a;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class CustomTemplateInAppData
implements Parcelable {
    public static final CustomTemplateInAppData$a CREATOR;
    public String a;
    public boolean b;
    public String c;
    public String d;
    public JSONObject e;

    static {
        CustomTemplateInAppData$a customTemplateInAppData$a;
        CREATOR = customTemplateInAppData$a = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CustomTemplateInAppData(Parcel object) {
        byte by2;
        boolean bl2;
        String string2;
        String string3 = null;
        if (object != null) {
            string2 = object.readString();
        } else {
            bl2 = false;
            string2 = null;
        }
        this.a = string2;
        bl2 = false;
        string2 = null;
        boolean bl3 = true;
        if (object != null && (by2 = object.readByte()) == 0) {
            bl2 = true;
        }
        this.b = bl2 ^= bl3;
        if (object != null) {
            string2 = object.readString();
        } else {
            bl2 = false;
            string2 = null;
        }
        this.c = string2;
        if (object != null) {
            string2 = object.readString();
        } else {
            bl2 = false;
            string2 = null;
        }
        this.d = string2;
        if (object != null) {
            string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            try {
                String string4 = object.readString();
                if (string4 != null) {
                    super(string4);
                    string3 = string2;
                }
            }
            catch (JSONException jSONException) {}
        }
        this.e = string3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        boolean bl4 = true;
        if (this == object) {
            return bl4;
        }
        String string2 = null;
        if (object != null) {
            object2 = object.getClass();
        } else {
            bl3 = false;
            object2 = null;
        }
        bl3 = Intrinsics.areEqual(CustomTemplateInAppData.class, object2);
        if (!bl3) {
            return false;
        }
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData");
        object = (CustomTemplateInAppData)object;
        object2 = this.a;
        String string3 = ((CustomTemplateInAppData)object).a;
        bl3 = Intrinsics.areEqual(object2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.b;
        boolean bl5 = ((CustomTemplateInAppData)object).b;
        if (bl3 != bl5) {
            return false;
        }
        object2 = this.c;
        string3 = ((CustomTemplateInAppData)object).c;
        bl3 = Intrinsics.areEqual(object2, string3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        string3 = ((CustomTemplateInAppData)object).d;
        bl3 = Intrinsics.areEqual(object2, string3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        if (object2 != null) {
            object2 = object2.toString();
        } else {
            bl3 = false;
            object2 = null;
        }
        object = ((CustomTemplateInAppData)object).e;
        if (object != null) {
            string2 = object.toString();
        }
        if (!(bl2 = Intrinsics.areEqual(object2, string2))) {
            return false;
        }
        return bl4;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = 0;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n3 *= 31;
        int n7 = this.b;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        String string3 = this.c;
        if (string3 != null) {
            n7 = string3.hashCode();
        } else {
            n7 = 0;
            string3 = null;
        }
        n3 = (n3 + n7) * 31;
        string3 = this.d;
        if (string3 != null) {
            n7 = string3.hashCode();
        } else {
            n7 = 0;
            string3 = null;
        }
        n3 = (n3 + n7) * 31;
        string3 = this.e;
        if (string3 != null && (string3 = string3.toString()) != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.a;
        parcel.writeString(string2);
        n3 = (int)(this.b ? 1 : 0);
        parcel.writeByte((byte)n3);
        string2 = this.c;
        parcel.writeString(string2);
        string2 = this.d;
        parcel.writeString(string2);
        string2 = this.e;
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(parcel, string3);
        if (string2 != null) {
            string2 = string2.toString();
        } else {
            n3 = 0;
            string2 = null;
        }
        parcel.writeString(string2);
    }
}


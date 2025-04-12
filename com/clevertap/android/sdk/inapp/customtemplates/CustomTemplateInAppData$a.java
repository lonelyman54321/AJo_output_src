/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp.customtemplates;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class CustomTemplateInAppData$a
implements Parcelable.Creator {
    public static CustomTemplateInAppData a(JSONObject jSONObject) {
        boolean bl2 = false;
        Object object = null;
        if (jSONObject == null) {
            return null;
        }
        ei_1 ei_12 = ei_1.CTInAppTypeCustomCodeTemplate;
        Object object2 = ei_1.fromString(jSONObject.optString("type"));
        if (ei_12 == object2) {
            object2 = new CustomTemplateInAppData(null);
            ((CustomTemplateInAppData)object2).a = object = ym1_1.a("templateName", jSONObject);
            ((CustomTemplateInAppData)object2).b = bl2 = jSONObject.optBoolean("isAction");
            ((CustomTemplateInAppData)object2).c = object = ym1_1.a("templateId", jSONObject);
            ((CustomTemplateInAppData)object2).d = object = ym1_1.a("templateDescription", jSONObject);
            ((CustomTemplateInAppData)object2).e = jSONObject = jSONObject.optJSONObject("vars");
            object = object2;
        }
        return object;
    }

    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        CustomTemplateInAppData customTemplateInAppData = new CustomTemplateInAppData(parcel);
        return customTemplateInAppData;
    }

    public final Object[] newArray(int n3) {
        return new CustomTemplateInAppData[n3];
    }
}


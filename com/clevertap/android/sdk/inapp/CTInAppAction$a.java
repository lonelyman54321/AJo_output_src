/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$a;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class CTInAppAction$a
implements Parcelable.Creator {
    public static CTInAppAction a(JSONObject jSONObject) {
        boolean bl2 = false;
        Object object = null;
        if (jSONObject == null) {
            return null;
        }
        CTInAppAction cTInAppAction = new CTInAppAction(null);
        Object object2 = "type";
        String string2 = ym1_1.a((String)object2, jSONObject);
        if (string2 != null) {
            xf1_1.Companion.getClass();
            object = xf1$a.a(string2);
        }
        cTInAppAction.a = object;
        object = ym1_1.a("android", jSONObject);
        cTInAppAction.b = object;
        CustomTemplateInAppData.CREATOR.getClass();
        object = CustomTemplateInAppData$a.a(jSONObject);
        cTInAppAction.d = object;
        cTInAppAction.e = bl2 = jSONObject.optBoolean("fbSettings");
        object = jSONObject.optString((String)object2);
        object2 = "kv";
        bl2 = ((String)object2).equalsIgnoreCase((String)object);
        if (bl2 && (bl2 = jSONObject.has((String)object2))) {
            jSONObject = jSONObject.optJSONObject((String)object2);
            object = cTInAppAction.c;
            if (object == null) {
                object = new HashMap();
            }
            if (jSONObject != null) {
                boolean bl3;
                object2 = jSONObject.keys();
                string2 = "keyValuesJson.keys()";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                while (bl3 = object2.hasNext()) {
                    string2 = (String)object2.next();
                    String string3 = jSONObject.optString(string2);
                    int n3 = string3.length();
                    if (n3 <= 0) continue;
                    String string4 = "key";
                    Intrinsics.checkNotNullExpressionValue(string2, string4);
                    object.put(string2, string3);
                }
                cTInAppAction.c = object;
            }
        }
        return cTInAppAction;
    }

    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        CTInAppAction cTInAppAction = new CTInAppAction(parcel);
        return cTInAppAction;
    }

    public final Object[] newArray(int n3) {
        return new CTInAppAction[n3];
    }
}


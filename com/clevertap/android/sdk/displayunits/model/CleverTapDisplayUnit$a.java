/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class CleverTapDisplayUnit$a
implements Parcelable.Creator {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object createFromParcel(Parcel object) {
        Exception exception2;
        CleverTapDisplayUnit cleverTapDisplayUnit;
        block5: {
            JSONObject jSONObject;
            byte by2;
            Object object2;
            block4: {
                block3: {
                    cleverTapDisplayUnit = new Object();
                    try {
                        object2 = object.readString();
                        cleverTapDisplayUnit.g = object2;
                        object2 = ih_1.class;
                        object2 = ((Class)object2).getClassLoader();
                        object2 = object.readValue((ClassLoader)object2);
                        object2 = (ih_1)((Object)object2);
                        cleverTapDisplayUnit.f = object2;
                        object2 = object.readString();
                        cleverTapDisplayUnit.a = object2;
                        by2 = object.readByte();
                        byte by4 = 1;
                        jSONObject = null;
                        if (by2 != by4) break block3;
                        object2 = new ArrayList();
                        cleverTapDisplayUnit.b = object2;
                        Object object3 = CleverTapDisplayUnitContent.class;
                        object3 = ((Class)object3).getClassLoader();
                        object.readList((List)object2, (ClassLoader)object3);
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                cleverTapDisplayUnit.b = null;
            }
            object2 = object.readHashMap(null);
            cleverTapDisplayUnit.c = object2;
            by2 = object.readByte();
            if (by2 != 0) {
                object2 = object.readString();
                jSONObject = new JSONObject((String)object2);
            }
            cleverTapDisplayUnit.e = jSONObject;
            object = object.readString();
            cleverTapDisplayUnit.d = object;
            return cleverTapDisplayUnit;
        }
        String string2 = "Error Creating Display Unit from parcel : ";
        StringBuilder stringBuilder = new StringBuilder(string2);
        String string3 = exception2.getLocalizedMessage();
        stringBuilder.append(string3);
        cleverTapDisplayUnit.d = string3 = stringBuilder.toString();
        b.d();
        return cleverTapDisplayUnit;
    }

    public final Object[] newArray(int n3) {
        return new CleverTapDisplayUnit[n3];
    }
}


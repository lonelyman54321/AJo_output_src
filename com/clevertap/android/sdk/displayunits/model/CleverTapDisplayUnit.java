/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit$a;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class CleverTapDisplayUnit
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public ArrayList b;
    public HashMap c;
    public String d;
    public JSONObject e;
    public ih_1 f;
    public String g;

    static {
        CleverTapDisplayUnit$a cleverTapDisplayUnit$a = new Object();
        CREATOR = cleverTapDisplayUnit$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CleverTapDisplayUnit(JSONObject object, String object2, ih_1 object3, String string2, ArrayList object4, JSONObject jSONObject, String string3) {
        block5: {
            this.e = object;
            this.g = object2;
            this.f = object3;
            this.a = string2;
            this.b = object4;
            object = null;
            if (jSONObject != null) {
                boolean bl2;
                block6: {
                    try {
                        object2 = jSONObject.keys();
                        if (object2 == null) break block5;
                        object3 = null;
                        break block6;
                    }
                    catch (Exception exception) {}
                    exception.getLocalizedMessage();
                    com.clevertap.android.sdk.b.d();
                    break block5;
                }
                while (bl2 = object2.hasNext()) {
                    string2 = object2.next();
                    object4 = jSONObject.getString(string2);
                    boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                    if (bl3) continue;
                    if (object3 == null) {
                    }
                    ((HashMap)object3).put(string2, object4);
                }
                object = object3;
            }
        }
        this.c = object;
        this.d = string3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CleverTapDisplayUnit a(JSONObject jSONObject) {
        CleverTapDisplayUnit cleverTapDisplayUnit;
        Exception exception2;
        Object object;
        block7: {
            boolean bl2;
            Object object2;
            boolean bl3;
            String string2;
            String string3;
            Object object3;
            String string4;
            String string5;
            block8: {
                block6: {
                    object = "custom_kv";
                    string5 = "content";
                    string4 = "bg";
                    object3 = "type";
                    string3 = "wzrk_id";
                    try {
                        boolean bl4 = jSONObject.has(string3);
                        string3 = bl4 ? jSONObject.getString(string3) : "0_0";
                        string2 = string3;
                        bl3 = jSONObject.has(object3);
                        bl4 = false;
                        if (!bl3) break block6;
                    }
                    catch (Exception exception2) {
                        break block7;
                    }
                    object3 = jSONObject.getString(object3);
                    object2 = object3 = ih_1.type(object3);
                    break block8;
                }
                object2 = null;
            }
            int n3 = jSONObject.has(string4);
            string4 = n3 != 0 ? jSONObject.getString(string4) : "";
            String string6 = string4;
            int n4 = jSONObject.has(string5);
            if (n4 != 0) {
                string5 = jSONObject.getJSONArray(string5);
            } else {
                bl2 = false;
                string5 = null;
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            if (string5 != null) {
                string4 = null;
                for (n4 = 0; n4 < (n3 = string5.length()); ++n4) {
                    object3 = string5.getJSONObject(n4);
                    object3 = CleverTapDisplayUnitContent.a((JSONObject)object3);
                    string3 = ((CleverTapDisplayUnitContent)object3).c;
                    bl3 = TextUtils.isEmpty((CharSequence)string3);
                    if (!bl3) continue;
                    arrayList.add((String)object3);
                }
            }
            Object object4 = (bl2 = jSONObject.has((String)object)) ? (object = jSONObject.getJSONObject((String)object)) : null;
            return new CleverTapDisplayUnit(jSONObject, string2, (ih_1)((Object)object2), string6, arrayList, (JSONObject)object4, null);
        }
        exception2.getLocalizedMessage();
        com.clevertap.android.sdk.b.d();
        object = new StringBuilder("Error Creating Display Unit from JSON : ");
        String string7 = exception2.getLocalizedMessage();
        ((StringBuilder)object).append(string7);
        String string8 = ((StringBuilder)object).toString();
        object = cleverTapDisplayUnit;
        return new CleverTapDisplayUnit(null, "", null, null, null, null, string8);
    }

    public final int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        Exception exception2;
        block6: {
            Object object;
            StringBuilder stringBuilder;
            block7: {
                String string2;
                block5: {
                    try {
                        int n3;
                        int n4;
                        stringBuilder = new StringBuilder();
                        object = "[";
                        stringBuilder.append((String)object);
                        object = " Unit id- ";
                        stringBuilder.append((String)object);
                        object = this.g;
                        stringBuilder.append((String)object);
                        object = ", Type- ";
                        stringBuilder.append((String)object);
                        object = this.f;
                        object = object != null ? ((ih_1)((Object)object)).toString() : null;
                        stringBuilder.append((String)object);
                        object = ", bgColor- ";
                        stringBuilder.append((String)object);
                        object = this.a;
                        stringBuilder.append((String)object);
                        object = this.b;
                        if (object == null || (n4 = ((ArrayList)object).isEmpty()) != 0) break block5;
                        string2 = null;
                        for (n4 = 0; n4 < (n3 = ((ArrayList)object).size()); ++n4) {
                            Object object2 = ((ArrayList)object).get(n4);
                            if ((object2 = (CleverTapDisplayUnitContent)object2) == null) continue;
                            String string3 = ", Content Item:";
                            stringBuilder.append(string3);
                            stringBuilder.append(n4);
                            string3 = " ";
                            stringBuilder.append(string3);
                            object2 = ((CleverTapDisplayUnitContent)object2).toString();
                            stringBuilder.append((String)object2);
                            object2 = "\n";
                            stringBuilder.append((String)object2);
                        }
                    }
                    catch (Exception exception2) {
                        break block6;
                    }
                }
                if ((object = this.c) == null) break block7;
                string2 = ", Custom KV:";
                stringBuilder.append(string2);
                stringBuilder.append(object);
            }
            object = ", JSON -";
            stringBuilder.append((String)object);
            object = this.e;
            stringBuilder.append(object);
            object = ", Error-";
            stringBuilder.append((String)object);
            object = this.d;
            stringBuilder.append((String)object);
            object = " ]";
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
        ((Object)exception2).toString();
        com.clevertap.android.sdk.b.d();
        return super.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.g;
        parcel.writeString(object);
        object = this.f;
        parcel.writeValue(object);
        object = this.a;
        parcel.writeString(object);
        n3 = 1;
        Cloneable cloneable = this.b;
        if (cloneable == null) {
            parcel.writeByte((byte)0);
        } else {
            parcel.writeByte((byte)n3);
            parcel.writeList((List)((Object)cloneable));
        }
        cloneable = this.c;
        parcel.writeMap((Map)((Object)cloneable));
        cloneable = this.e;
        if (cloneable == null) {
            parcel.writeByte((byte)0);
        } else {
            parcel.writeByte((byte)n3);
            object = cloneable.toString();
            parcel.writeString(object);
        }
        object = this.d;
        parcel.writeString(object);
    }
}


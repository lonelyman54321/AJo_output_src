/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFh1dSDK;
import com.appsflyer.internal.AFi1uSDK;
import com.appsflyer.internal.AFi1xSDK;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AFh1cSDK {
    public AFi1uSDK getCurrencyIso4217Code;
    public final AFh1dSDK getMediationNetwork;
    public final AFi1xSDK getMonetizationNetwork;

    public AFh1cSDK(JSONObject object) {
        Intrinsics.checkNotNullParameter(object, "");
        Object object2 = AFh1cSDK.AFAdRevenueData(object);
        this.getCurrencyIso4217Code = object2;
        this.getMediationNetwork = object2 = AFh1cSDK.getRevenue(object);
        object = AFh1cSDK.getMonetizationNetwork(object);
        this.getMonetizationNetwork = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static AFi1uSDK AFAdRevenueData(JSONObject object) {
        Object object2;
        Object object3;
        block9: {
            Throwable throwable2;
            block8: {
                block7: {
                    Object object4;
                    double d2;
                    String string2;
                    String string3;
                    int n3;
                    long l2;
                    ArrayList<String> arrayList;
                    object3 = "";
                    object2 = null;
                    try {
                        arrayList = tl2_2.b;
                        arrayList = "r_debugger";
                        object = AFh1cSDK.getRevenue(object, (String)((Object)arrayList));
                        if (object == null) break block7;
                        arrayList = "ttl";
                        l2 = object.getLong((String)((Object)arrayList));
                        arrayList = "counter";
                        n3 = object.getInt((String)((Object)arrayList));
                        arrayList = "app_ver";
                        string3 = object.optString((String)((Object)arrayList), (String)object3);
                        arrayList = "sdk_ver";
                        string2 = object.optString((String)((Object)arrayList), (String)object3);
                        arrayList = "ratio";
                        double d5 = 1.0;
                        d2 = object.optDouble((String)((Object)arrayList), d5);
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    float f5 = (float)d2;
                    arrayList = "tags";
                    object = object.optJSONArray((String)((Object)arrayList));
                    if (object != null) {
                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                        arrayList = new ArrayList<String>();
                        int n4 = object.length();
                        object4 = null;
                        for (int i3 = 0; i3 < n4; ++i3) {
                            String string4 = object.getString(i3);
                            Intrinsics.checkNotNullExpressionValue(string4, (String)object3);
                            arrayList.add(string4);
                        }
                        object4 = arrayList;
                    } else {
                        object4 = object = mz0_2.a;
                    }
                    Intrinsics.checkNotNullExpressionValue(string3, (String)object3);
                    Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
                    object = new AFi1uSDK(l2, f5, (List)object4, n3, string3, string2);
                    break block9;
                }
                object = null;
                break block9;
            }
            object3 = tl2_2.b;
            object = vl2_2.a(throwable2);
        }
        object3 = tl2_2.b;
        boolean bl2 = object instanceof tL2$b;
        if (bl2) {
            return (AFi1uSDK)object2;
        }
        object2 = object;
        return (AFi1uSDK)object2;
    }

    private static AFi1xSDK getMonetizationNetwork(JSONObject object) {
        Object object2;
        block8: {
            Throwable throwable2;
            Object object3;
            block9: {
                block7: {
                    object2 = null;
                    try {
                        object3 = tl2_2.b;
                        object3 = "meta_data";
                    }
                    catch (Throwable throwable2) {}
                    object = AFh1cSDK.getRevenue(object, (String)object3);
                    if (object == null) break block7;
                    object3 = "send_rate";
                    double d2 = 1.0;
                    double d5 = object.optDouble((String)object3, d2);
                    object = new AFi1xSDK(d5);
                    break block8;
                    break block9;
                }
                object = null;
                break block8;
            }
            object3 = tl2_2.b;
            object = vl2_2.a(throwable2);
        }
        boolean bl2 = object instanceof tL2$b;
        if (!bl2) {
            object2 = object;
        }
        return (AFi1xSDK)object2;
    }

    private static AFh1dSDK getRevenue(JSONObject object) {
        Object object2;
        block11: {
            Throwable throwable2;
            Object object3;
            block12: {
                block10: {
                    object2 = null;
                    try {
                        object3 = tl2_2.b;
                        object3 = "exc_mngr";
                    }
                    catch (Throwable throwable2) {}
                    object = AFh1cSDK.getRevenue(object, (String)object3);
                    if (object == null) break block10;
                    object3 = "sdk_ver";
                    String string2 = object.getString((String)object3);
                    object3 = "min";
                    int n3 = -1;
                    int n4 = object.optInt((String)object3, n3);
                    object3 = "expire";
                    int n7 = object.optInt((String)object3, n3);
                    object3 = "ttl";
                    long l2 = -1;
                    l2 = object.optLong((String)object3, l2);
                    object = new AFh1dSDK(string2, n4, n7, l2);
                    break block11;
                    break block12;
                }
                object = null;
                break block11;
            }
            object3 = tl2_2.b;
            object = vl2_2.a(throwable2);
        }
        boolean bl2 = object instanceof tL2$b;
        if (!bl2) {
            object2 = object;
        }
        return (AFh1dSDK)object2;
    }

    private static JSONObject getRevenue(JSONObject jSONObject, String string2) {
        boolean bl2 = jSONObject.has(string2);
        if (bl2) {
            jSONObject = jSONObject.getJSONArray(string2).optJSONObject(0);
            string2 = "data";
            if ((jSONObject = jSONObject.optJSONObject(string2)) != null) {
                return jSONObject.optJSONObject("v1");
            }
        }
        return null;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Object object2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        if (object != null) {
            object2 = object.getClass();
        } else {
            bl2 = false;
            object2 = null;
        }
        bl2 = Intrinsics.areEqual(AFh1cSDK.class, object2);
        if (!bl2) {
            return false;
        }
        Intrinsics.checkNotNull(object, "");
        object = (AFh1cSDK)object;
        object2 = this.getMediationNetwork;
        Object object3 = ((AFh1cSDK)object).getMediationNetwork;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) {
            return false;
        }
        object2 = this.getMonetizationNetwork;
        object3 = ((AFh1cSDK)object).getMonetizationNetwork;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) {
            return false;
        }
        object2 = this.getCurrencyIso4217Code;
        object = ((AFh1cSDK)object).getCurrencyIso4217Code;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3;
        int n4;
        AFh1dSDK aFh1dSDK = this.getMediationNetwork;
        int n7 = 0;
        if (aFh1dSDK != null) {
            n4 = aFh1dSDK.hashCode();
        } else {
            n4 = 0;
            aFh1dSDK = null;
        }
        n4 *= 31;
        Object object = this.getMonetizationNetwork;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.getCurrencyIso4217Code;
        if (object != null) {
            n7 = ((AFi1uSDK)object).hashCode();
        }
        return n4 + n7;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.jioads.native.parser;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.carousel.data.b;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public JSONArray A;
    public JSONArray B;
    public JSONObject C;
    public JSONObject D;
    public ArrayList E;
    public ArrayList F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public final ArrayList U;
    public b V;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public Object r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public JSONArray z;

    public a() {
        ArrayList arrayList;
        new ArrayList();
        this.E = arrayList = new ArrayList();
        this.F = arrayList = new ArrayList();
        this.U = arrayList = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList a(JSONArray jSONArray) {
        JioAds$LogLevel jioAds$LogLevel;
        Serializable serializable2;
        Serializable serializable;
        String string3;
        block8: {
            JioAds$LogLevel jioAds$LogLevel2;
            block7: {
                block9: {
                    string3 = "message";
                    int n3 = 0;
                    serializable = null;
                    if (jSONArray == null) return serializable;
                    try {
                        serializable2 = new ArrayList();
                    }
                    catch (Exception exception) {
                        break block7;
                    }
                    catch (JSONException jSONException) {
                        break block8;
                    }
                    try {
                        n3 = jSONArray.length();
                        int i3 = 0;
                        Object string2 = null;
                        while (i3 < n3) {
                            String string4 = jSONArray.getString(i3);
                            ((ArrayList)serializable2).add(string4);
                            ++i3;
                        }
                        return serializable2;
                    }
                    catch (Exception exception) {
                    }
                    catch (JSONException jSONException) {
                        break block9;
                    }
                    serializable = serializable2;
                    break block7;
                }
                serializable = serializable2;
                break block8;
            }
            String string5 = "Exception while parsing json array: ";
            serializable2 = new StringBuilder(string5);
            ((StringBuilder)serializable2).append((Object)jioAds$LogLevel2);
            Intrinsics.checkNotNullParameter(((StringBuilder)serializable2).toString(), string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            jioAds$LogLevel2 = JioAds$LogLevel.NONE;
            return serializable;
        }
        String string6 = "Exception while parsing JSONException: ";
        serializable2 = new StringBuilder(string6);
        ((StringBuilder)serializable2).append((Object)jioAds$LogLevel);
        Intrinsics.checkNotNullParameter(((StringBuilder)serializable2).toString(), string3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        jioAds$LogLevel = JioAds$LogLevel.NONE;
        return serializable;
    }

    public final void b(String string2, JSONObject jSONObject) {
        int n3;
        int n4;
        a a2 = this;
        String string3 = string2;
        Object object = jSONObject;
        ArrayList arrayList = this.U;
        Intrinsics.checkNotNullParameter(jSONObject, "nativeJsonObject");
        this.C = jSONObject;
        Object object2 = "title";
        boolean bl2 = jSONObject.isNull((String)object2);
        String string4 = "";
        object2 = bl2 ? string4 : jSONObject.getString((String)object2);
        a2.b = object2;
        object2 = nn_2.a(string3, " : Title: ");
        Object object3 = a2.b;
        Object object4 = "message";
        ir3_0.b((StringBuilder)object2, object3, (String)object4);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = nn_2.a(string3, " : Description: ");
        String string5 = a2.l;
        d90_0.b((StringBuilder)object3, string5, (String)object4, (JioAds$Companion)object2);
        object2 = "obj";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.c = object2;
        object2 = "cmpid";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.d = object2;
        object2 = "ctatext";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.f = object2;
        object2 = "ctatxtcol";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.i = object2;
        object2 = "ctabtncol";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.j = object2;
        object2 = "ctaurl";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.g = object2;
        object2 = "brandUrl";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.h = object2;
        object2 = "ctafb";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.k = object2;
        object2 = "prmPkg";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.I = object2;
        object2 = "sltId";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.L = object2;
        object2 = "contId";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.J = object2;
        object2 = "secContId";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.K = object2;
        object2 = "cat";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.M = object2;
        object2 = "brand";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.N = object2;
        object2 = "ecomSrc";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.O = object2;
        object2 = "exp";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.Q = object2;
        object2 = "cur";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.R = object2;
        object2 = "disPer";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.S = object2;
        object2 = "disPrc";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.T = object2;
        object2 = "seg";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.P = object2;
        object2 = "desc";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.l = object2;
        object2 = "downloads";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.m = object2;
        object2 = "price";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.n = object2;
        object2 = "iconimage";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.o = object2;
        object2 = "mainimage";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.p = object2;
        object2 = "mediumimage";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.q = object2;
        object2 = "sponsored";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.s = object2;
        object2 = "desc2";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.t = object2;
        object2 = "rating";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.a = object2;
        object2 = "likes";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.u = object2;
        object2 = "salePrice";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.v = object2;
        object2 = "phone";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.w = object2;
        object2 = "address";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.x = object2;
        object2 = "displayUrl";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.y = object2;
        object2 = "video";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? string4 : object.getString((String)object2);
        a2.H = object2;
        object2 = "linkFallback";
        bl2 = object.isNull((String)object2);
        if (!bl2) {
            object.getString((String)object2);
        }
        object2 = "mediaView";
        bl2 = object.isNull((String)object2);
        if (bl2) {
            n4 = 0;
            object2 = null;
        } else {
            object2 = object.get((String)object2);
        }
        a2.r = object2;
        object2 = "type";
        bl2 = object.isNull((String)object2);
        object2 = bl2 ? "Jio" : object.getString((String)object2);
        a2.G = object2;
        object2 = object.optJSONArray("imptrackers");
        a2.z = object2;
        com.jio.jioads.native.parser.a.a((JSONArray)object2);
        object2 = object.optJSONArray("clktrackers");
        a2.A = object2;
        a2.E = object2 = com.jio.jioads.native.parser.a.a((JSONArray)object2);
        object2 = object.optJSONArray("viewableimptrackers");
        a2.B = object2;
        a2.F = object2 = com.jio.jioads.native.parser.a.a((JSONArray)object2);
        object2 = "customimage";
        bl2 = object.isNull((String)object2);
        string5 = null;
        if (!bl2 && (object = object.optJSONArray((String)object2)) != null) {
            n4 = object.length();
            if (n4 > 0) {
                object = object.getJSONObject(0);
            } else {
                n3 = 0;
                object = null;
            }
            a2.D = object;
        }
        a2.e = string3;
        string3 = a2.C;
        if (string3 != null && (string3 = string3.optJSONArray((String)(object = "cards"))) != null) {
            n3 = string3.length();
            object2 = null;
            for (n4 = 0; n4 < n3; ++n4) {
                Object object5;
                Object object6;
                Object object7;
                int n7;
                String string6;
                String string7;
                Object object8;
                object3 = string3.getJSONObject(n4);
                if (arrayList == null) continue;
                if (object3 != null) {
                    object8 = object3.optString("t", string4);
                    string7 = object8;
                } else {
                    string7 = null;
                }
                if (object3 != null) {
                    object8 = object3.optString("d", string4);
                    string6 = object8;
                } else {
                    string6 = null;
                }
                if (object3 != null) {
                    n7 = object3.optInt("w", 0);
                    object7 = object8 = Integer.valueOf(n7);
                } else {
                    object7 = null;
                }
                if (object3 != null) {
                    n7 = object3.optInt("h", 0);
                    object6 = object8 = Integer.valueOf(n7);
                } else {
                    object6 = null;
                }
                Object object9 = object3 != null ? (object8 = object3.optString("u", string4)) : null;
                Object object10 = object3 != null ? (object8 = object3.optString("cta", string4)) : null;
                Object object11 = object3 != null ? (object8 = object3.optString("lpu", string4)) : null;
                Object object12 = object3 != null ? (object8 = object3.optString("fb", string4)) : null;
                if (object3 != null) {
                    object8 = "ar";
                    object3 = object3.optString((String)object8, string4);
                } else {
                    bl2 = false;
                    object3 = null;
                }
                object8 = object5;
                object4 = object5;
                object5 = object10;
                object10 = object11;
                object11 = object12;
                object12 = object3;
                ((com.jio.jioads.carousel.data.a)object8)(string7, string6, (Integer)object7, (Integer)object6, (String)object9, (String)object5, (String)object10, (String)object11, (String)object3);
                arrayList.add(object8);
            }
            string3 = a2.e;
            if (string3 != null && (object = a2.d) != null) {
                Intrinsics.checkNotNull(string3);
                object2 = a2.d;
                Intrinsics.checkNotNull(object2);
                object3 = "null cannot be cast to non-null type kotlin.collections.List<com.jio.jioads.carousel.data.CarouselData.CarouselItem>";
                Intrinsics.checkNotNull(arrayList, object3);
                object = new b(string3, (String)object2, arrayList);
                a2.V = object;
            }
        }
    }

    public final boolean c(JioAdView$AD_TYPE object) {
        boolean bl2;
        JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INFEED;
        boolean bl3 = false;
        if (object != jioAdView$AD_TYPE && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.H)))) {
            String string2;
            object = this.H;
            boolean bl4 = true;
            if (object != null && (bl2 = StringsKt.F((CharSequence)object, string2 = "<vast", false)) == bl4 || (object = this.H) != null && (bl2 = StringsKt.F((CharSequence)object, string2 = "<VAST", false)) == bl4 && ((object = this.H) != null && (bl2 = StringsKt.F((CharSequence)object, string2 = "</vast>", false)) == bl4 || (object = this.H) != null && (bl2 = StringsKt.F((CharSequence)object, string2 = "</VAST>", false)) == bl4)) {
                bl3 = true;
            }
        }
        return bl3;
    }
}


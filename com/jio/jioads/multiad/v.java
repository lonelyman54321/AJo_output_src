/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.jio.jioads.multiad;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.multiad.N;
import com.jio.jioads.multiad.model.a;
import com.jio.jioads.multiad.model.b;
import com.jio.jioads.multiad.model.c;
import com.jio.jioads.multiad.model.d;
import com.jio.jioads.multiad.model.e;
import com.jio.jioads.multiad.model.f;
import com.jio.jioads.multiad.model.g;
import com.jio.jioads.multiad.model.h;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class v {
    public h a;

    public static e c(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "response");
        Intrinsics.checkNotNullParameter(object2, "adspotId");
        JSONObject jSONObject = new JSONObject((String)object);
        object = new e();
        Object object3 = "asi";
        boolean bl2 = jSONObject.has((String)object3);
        if (bl2 && (object3 = jSONObject.optJSONObject((String)object3)) != null && (object2 = object3.optJSONObject((String)object2)) != null) {
            ((e)object).b = object3 = v.e(object2.optJSONObject("config"));
            ((e)object).a = object2 = v.f((JSONObject)object2);
            object2 = "vr";
            boolean bl3 = jSONObject.has((String)object2);
            if (bl3 && (object3 = ((e)object).b) != null) {
                int n3 = jSONObject.optInt((String)object2);
                ((c)object3).b = object2 = Integer.valueOf(n3);
            }
        }
        return object;
    }

    public static c e(JSONObject object) {
        Object object2 = null;
        if (object != null) {
            c c2 = new Object();
            c2.a = null;
            c2.b = null;
            c2.c = null;
            c2.d = null;
            c2.e = null;
            c2.f = null;
            c2.g = null;
            c2.h = null;
            c2.i = null;
            c2.j = null;
            c2.k = null;
            c2.l = null;
            c2.m = null;
            c2.n = null;
            c2.o = null;
            c2.p = null;
            c2.q = null;
            c2.r = null;
            c2.s = null;
            c2.t = null;
            c2.u = null;
            object2 = object.optInt("adrt");
            c2.g = object2;
            object2 = object.optInt("at");
            c2.e = object2;
            object2 = object.optInt("ma");
            c2.d = object2;
            object2 = object.optInt("mdt");
            c2.h = object2;
            object2 = object.optInt("plr");
            c2.i = object2;
            object2 = object.optInt("nwhit");
            c2.j = object2;
            object2 = object.optInt("pmnd");
            c2.m = object2;
            object2 = object.optInt("pmxd");
            c2.n = object2;
            object2 = object.optInt("pod");
            c2.k = object2;
            object2 = object.optInt("podc");
            c2.l = object2;
            object2 = object.optInt("rwin");
            c2.f = object2;
            object2 = object.optInt("te");
            c2.c = object2;
            object2 = object.optInt("vr");
            c2.b = object2;
            c2.a = object2 = object.optString("med");
            c2.o = object2 = Integer.valueOf(object.optInt("eac"));
            c2.p = object2 = Integer.valueOf(object.optInt("mat"));
            c2.q = object2 = Integer.valueOf(object.optInt("tms"));
            c2.r = object2 = Integer.valueOf(object.optInt("lna"));
            c2.s = object2 = object.optString("adseq");
            c2.t = object2 = Integer.valueOf(object.optInt("asid"));
            object = object.optInt("fre");
            c2.u = object;
            return c2;
        }
        return null;
    }

    public static HashMap f(JSONObject jSONObject) {
        Object object;
        boolean bl2;
        Object object2 = jSONObject;
        if (jSONObject != null && (bl2 = jSONObject.has((String)(object = "cmps")))) {
            boolean bl3;
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            object2 = jSONObject.optJSONObject((String)object);
            if (object2 != null) {
                object = object2.keys();
            } else {
                bl3 = false;
                object = null;
            }
            if (object != null) {
                boolean bl4;
                while (bl4 = object.hasNext()) {
                    int n3;
                    Object object3;
                    boolean bl5;
                    JSONObject jSONObject2;
                    Object object4;
                    Object object5;
                    String string2 = (String)object.next();
                    Object object6 = object2.optJSONObject(string2);
                    if (object6 == null) continue;
                    HashMap<String, f> hashMap2 = "pgm";
                    int n4 = Intrinsics.areEqual(string2, hashMap2);
                    Object object7 = "mod";
                    int n7 = 0;
                    Object object8 = null;
                    String string3 = "surl";
                    if (n4 == 0) {
                        boolean bl6;
                        Intrinsics.checkNotNull(string2);
                        hashMap2 = new HashMap<String, f>();
                        object5 = object6.keys();
                        Intrinsics.checkNotNull(object5);
                        while (bl6 = object5.hasNext()) {
                            Object object9;
                            int n8;
                            int n10;
                            String string4 = (String)object5.next();
                            Object object10 = object6.optJSONObject(string4);
                            if (object10 == null) continue;
                            f f5 = new f();
                            f5.f = false;
                            f5.a = string4;
                            f5.l = string2;
                            Object object11 = "wt";
                            f5.c = n10 = object10.optInt((String)object11);
                            String string5 = "config";
                            object8 = object10.optJSONObject(string5);
                            if (object8 != null) {
                                object4 = new Object();
                                jSONObject2 = object2;
                                ((g)object4).a = null;
                                ((g)object4).b = null;
                                ((g)object4).c = null;
                                ((g)object4).d = null;
                                ((g)object4).b = object2 = object8.optString("e");
                                ((g)object4).a = object2 = object8.optString("fcr");
                                ((g)object4).c = object2 = Integer.valueOf(object8.optInt("aci"));
                                n8 = object8.optInt("cart");
                                ((g)object4).d = object2 = Integer.valueOf(n8);
                            } else {
                                jSONObject2 = object2;
                                bl5 = false;
                                object4 = null;
                            }
                            f5.b = object4;
                            object2 = object10.optJSONObject("ads");
                            if (object2 != null) {
                                boolean bl7;
                                object4 = new HashMap();
                                object8 = object2.keys();
                                Intrinsics.checkNotNull(object8);
                                while (bl7 = object8.hasNext()) {
                                    object10 = (String)object8.next();
                                    object3 = object;
                                    object = object2.optJSONObject((String)object10);
                                    if (object != null) {
                                        String string6;
                                        Object object12;
                                        long l2;
                                        Object object13 = object2;
                                        object2 = new Object();
                                        object9 = object5;
                                        n4 = 0;
                                        ((a)object2).b = null;
                                        ((a)object2).c = null;
                                        ((a)object2).d = null;
                                        ((a)object2).e = null;
                                        Object object14 = object7;
                                        ((a)object2).f = l2 = 0L;
                                        ((a)object2).a = object10;
                                        object5 = object.optJSONObject(string5);
                                        if (object5 != null) {
                                            object7 = new Object();
                                            object12 = object8;
                                            n7 = 0;
                                            ((b)object7).a = null;
                                            ((b)object7).b = null;
                                            ((b)object7).c = null;
                                            ((b)object7).d = null;
                                            ((b)object7).e = null;
                                            ((b)object7).f = null;
                                            ((b)object7).g = null;
                                            ((b)object7).h = null;
                                            ((b)object7).i = null;
                                            ((b)object7).j = null;
                                            ((b)object7).k = null;
                                            ((b)object7).l = null;
                                            ((b)object7).m = null;
                                            ((b)object7).n = null;
                                            ((b)object7).o = null;
                                            ((b)object7).p = null;
                                            ((b)object7).q = null;
                                            ((b)object7).g = object8 = object5.optString("cid");
                                            ((b)object7).b = object8 = object5.optString("fbk");
                                            ((b)object7).f = object8 = object5.optString("fmt");
                                            object5.optString("ltc");
                                            ((b)object7).a = object8 = object5.optString("mdc");
                                            ((b)object7).e = object8 = object5.optString("skd");
                                            ((b)object7).c = object8 = object5.optString("vce");
                                            ((b)object7).d = object8 = object5.optString("vd");
                                            ((b)object7).h = object8 = object5.optString("adr");
                                            ((b)object7).k = object8 = object5.optString("ao");
                                            ((b)object7).m = object8 = object5.optString("inl");
                                            ((b)object7).i = object8 = object5.optString("im");
                                            ((b)object7).j = object8 = object5.optString("vim");
                                            ((b)object7).n = object8 = object5.optString((String)object11);
                                            ((b)object7).p = object8 = object5.optString("oia");
                                            ((b)object7).q = object8 = object5.optString("mim");
                                            ((b)object7).o = object8 = object5.optString("strm");
                                            object8 = "wh";
                                            ((b)object7).l = object5 = object5.optString((String)object8);
                                        } else {
                                            object12 = object8;
                                            n3 = 0;
                                            object7 = null;
                                        }
                                        ((a)object2).e = object7;
                                        ((a)object2).b = object5 = object.optString("ad");
                                        object5 = object14;
                                        object = object.optJSONObject((String)object14);
                                        if (object != null) {
                                            n3 = (int)(object.has(string3) ? 1 : 0);
                                            if (n3 != 0 && (object7 = object.optJSONArray(string3)) != null) {
                                                object8 = new ArrayList();
                                                object14 = object11;
                                                int n14 = object7.length();
                                                string6 = string5;
                                                string5 = null;
                                                for (n10 = 0; n10 < n14; ++n10) {
                                                    object11 = object7.optString(n10);
                                                    ((ArrayList)object8).add(object11);
                                                }
                                                ((a)object2).c = object8;
                                            } else {
                                                object14 = object11;
                                                string6 = string5;
                                            }
                                            object7 = "trgt";
                                            n7 = (int)(object.has((String)object7) ? 1 : 0);
                                            if (n7 != 0 && (object = object.optJSONObject((String)object7)) != null && (n7 = (int)(object.has((String)(object7 = "cde")) ? 1 : 0)) != 0) {
                                                ((a)object2).d = object = object.optString((String)object7);
                                            }
                                        } else {
                                            object14 = object11;
                                            string6 = string5;
                                        }
                                        Intrinsics.checkNotNull(object10);
                                        ((HashMap)object4).put(object10, object2);
                                        object7 = object5;
                                        object = object3;
                                        object2 = object13;
                                        object5 = object9;
                                        object11 = object14;
                                        object8 = object12;
                                        string5 = string6;
                                        continue;
                                    }
                                    object = object3;
                                }
                                object3 = object;
                                object9 = object5;
                                object5 = object7;
                                object2 = object4;
                            } else {
                                object3 = object;
                                object9 = object5;
                                object5 = object7;
                                n8 = 0;
                                object2 = null;
                            }
                            f5.d = object2;
                            Intrinsics.checkNotNull(string4);
                            hashMap2.put(string4, f5);
                            object7 = object5;
                            object2 = jSONObject2;
                            object = object3;
                            object5 = object9;
                            n7 = 0;
                            object8 = null;
                        }
                        jSONObject2 = object2;
                        object3 = object;
                        hashMap.put(string2, hashMap2);
                        continue;
                    }
                    jSONObject2 = object2;
                    object3 = object;
                    object5 = object7;
                    object2 = new HashMap();
                    object4 = "ad_url";
                    bl3 = object6.has((String)object4);
                    if (bl3) {
                        boolean bl8;
                        long l3;
                        object = new f();
                        ((f)object).f = n3 = 1;
                        ((f)object).l = hashMap2;
                        object4 = object6.optString((String)object4);
                        ((f)object).g = object4;
                        object4 = object6.optString("pgm_expiry");
                        object7 = "optString(...)";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                        ((f)object).i = l3 = Long.parseLong((String)object4);
                        object4 = "ad_params";
                        n7 = object6.has((String)object4);
                        if (n7 != 0 && (object4 = object6.optJSONObject((String)object4)) != null) {
                            object8 = object4.optString("method");
                            Intrinsics.checkNotNullExpressionValue(object8, (String)object7);
                            ((f)object).k = n3 = Integer.parseInt((String)object8);
                            object7 = "query";
                            object4 = object4.optString((String)object7);
                            ((f)object).j = object4;
                        }
                        if ((bl5 = object6.has((String)object5)) && (object4 = object6.optJSONObject((String)object5)) != null && (bl8 = object4.has(string3))) {
                            object4 = object4.optJSONArray(string3);
                            object6 = new ArrayList();
                            if (object4 != null) {
                                n4 = object4.length();
                                object8 = null;
                                for (n7 = 0; n7 < n4; ++n7) {
                                    object7 = object4.optString(n7);
                                    ((ArrayList)object6).add(object7);
                                }
                            }
                            ((f)object).h = object6;
                        }
                        ((HashMap)object2).put(hashMap2, object);
                    }
                    Intrinsics.checkNotNull(string2);
                    hashMap.put(string2, object2);
                    object2 = jSONObject2;
                    object = object3;
                }
            }
            return hashMap;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h a(String object, String object2) {
        Exception exception2;
        Object object3;
        block5: {
            String string2;
            Object object4;
            block4: {
                Intrinsics.checkNotNullParameter(object, "response");
                object3 = "packageName";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                try {
                    Object object5 = new Object();
                    object4 = null;
                    ((h)object5).a = null;
                    ((h)object5).b = null;
                    this.a = object5;
                    object5 = N.a;
                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                    object5 = N.d;
                    string2 = "master_config_";
                    if (object5 == null) break block4;
                    object4 = new StringBuilder(string2);
                    ((StringBuilder)object4).append((String)object2);
                    object4 = ((StringBuilder)object4).toString();
                    object4 = object5 = ((ConcurrentHashMap)object5).get(object4);
                    object4 = (JSONObject)object5;
                }
                catch (Exception exception2) {
                    break block5;
                }
            }
            if (object4 == null) {
                object4 = new JSONObject((String)object);
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = "jsonObject";
                Intrinsics.checkNotNullParameter(object4, (String)object);
                object = N.d;
                if (object != null) {
                    object2 = string2.concat((String)object2);
                    object = ((ConcurrentHashMap)object).put(object2, object4);
                    object = (JSONObject)object;
                }
            }
            object = "config";
            object = object4.optJSONObject((String)object);
            this.d((JSONObject)object);
            object = "asi";
            object = object4.optJSONObject((String)object);
            this.b((JSONObject)object);
            return this.a;
        }
        Intrinsics.checkNotNullParameter("Exception while parsing Master Config", "message");
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = Utility.INSTANCE;
        String string3 = ((Utility)object3).printStacktrace(exception2);
        com.jio.jioads.jioreel.tracker.model.b.g(string3, (JioAds$Companion)object2);
        return this.a;
    }

    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean bl2;
            Iterator iterator = jSONObject.keys();
            Intrinsics.checkNotNull(iterator);
            while (bl2 = iterator.hasNext()) {
                int n3;
                String string2 = (String)iterator.next();
                Object object = jSONObject.optJSONObject(string2);
                if (object == null) continue;
                e e2 = new e();
                Object object2 = v.e(object.optJSONObject("config"));
                e2.b = object2;
                object2 = object.optJSONObject("pacing");
                boolean bl3 = false;
                object2 = object2 != null ? object2.toString() : null;
                e2.c = object2;
                object2 = object.optJSONArray("ad-op");
                ArrayList<Object> arrayList = new ArrayList<Object>();
                if (object2 != null && (n3 = object2.length()) > 0) {
                    n3 = object2.length();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        Object object3 = object2.get(0);
                        object3 = object3 != null ? object3.toString() : null;
                        Intrinsics.checkNotNull(object3);
                        arrayList.add(object3);
                    }
                }
                e2.d = arrayList;
                object2 = "bkp";
                bl3 = object.has((String)object2);
                if (bl3) {
                    object = v.f(object.optJSONObject((String)object2));
                    e2.a = object;
                }
                object = this.a;
                Intrinsics.checkNotNull(object);
                object = ((h)object).a;
                if (object == null) {
                    object = this.a;
                    Intrinsics.checkNotNull(object);
                    ((h)object).a = object2 = new Object();
                }
                object = this.a;
                Intrinsics.checkNotNull(object);
                object = ((h)object).a;
                Intrinsics.checkNotNull(object);
                Intrinsics.checkNotNull(string2);
                object.put(string2, e2);
            }
        }
    }

    public final void d(JSONObject object) {
        Object object2 = this.a;
        if (object2 != null && object != null) {
            object2 = new Object();
            ((d)object2).a = null;
            ((d)object2).b = null;
            ((d)object2).c = null;
            ((d)object2).d = null;
            String string2 = "te";
            boolean bl2 = object.has(string2);
            if (bl2) {
                object.optString(string2);
            }
            if (bl2 = object.has(string2 = "ae")) {
                ((d)object2).c = string2 = object.optString(string2);
            }
            if (bl2 = object.has(string2 = "csl")) {
                ((d)object2).a = string2 = object.optString(string2);
            }
            if (bl2 = object.has(string2 = "ls")) {
                ((d)object2).b = string2 = object.optString(string2);
            }
            if (bl2 = object.has(string2 = "loc")) {
                object = object.optString(string2);
                ((d)object2).d = object;
            }
            object = this.a;
            Intrinsics.checkNotNull(object);
            object.b = object2;
        }
    }
}


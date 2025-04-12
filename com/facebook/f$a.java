/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 *  org.json.JSONTokener
 */
package com.facebook;

import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.b;
import com.facebook.e;
import com.facebook.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class f$a {
    public static ArrayList a(List object, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(object, "requests");
        object = (Iterable)object;
        int n3 = yx_2.o((Iterable)object, 10);
        ArrayList<f> arrayList = new ArrayList<f>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            GraphRequest graphRequest = (GraphRequest)object.next();
            FacebookRequestError facebookRequestError = new FacebookRequestError(facebookException);
            f f5 = new f(graphRequest, httpURLConnection, facebookRequestError);
            arrayList.add(f5);
        }
        return arrayList;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f b(GraphRequest var0, HttpURLConnection var1_1, Object var2_2, Object var3_3) {
        block26: {
            block25: {
                block22: {
                    block24: {
                        block23: {
                            var4_4 = var0;
                            var5_5 = var1_1;
                            var6_6 = var2_2;
                            var7_7 = "body";
                            var8_8 = "FACEBOOK_NON_JSON_RESULT";
                            var9_9 = var2_2 instanceof JSONObject;
                            var10_10 = false;
                            var11_11 = null;
                            if (!var9_9) break block26;
                            var6_6 = (JSONObject)var2_2;
                            var12_12 = "error_code";
                            var13_13 = "error";
                            var14_14 = "code";
                            var15_15 = "singleResult";
                            Intrinsics.checkNotNullParameter(var6_6, (String)var15_15);
                            try {
                                var16_16 = var6_6.has((String)var14_14);
                                if (!var16_16) break block22;
                                var17_17 = var6_6.getInt((String)var14_14);
                                var15_15 = lz3_0.t((String)var7_7, (String)var8_8, (JSONObject)var6_6);
                                if (var15_15 != null) {
                                }
                                ** GOTO lbl130
                            }
                            catch (JSONException v0) {
                                break block22;
                            }
                            var18_18 = var15_15 instanceof JSONObject;
                            if (!var18_18) ** GOTO lbl130
                            var19_19 = var15_15;
                            {
                                var19_19 = (JSONObject)var15_15;
                                var18_18 = var19_19.has((String)var13_13);
                                var20_20 = false;
                                var21_21 = null;
                                var22_22 = "error_subcode";
                                var23_23 = -1 != 0;
                                if (!var18_18) ** GOTO lbl79
                                var12_12 = var15_15;
                                var12_12 = (JSONObject)var15_15;
                                var12_12 = lz3_0.t((String)var13_13, null, (JSONObject)var12_12);
                                if ((var12_12 = (JSONObject)var12_12) == null) break block23;
                                var13_13 = "type";
                                var13_13 = var12_12.optString((String)var13_13, null);
                                break block24;
                            }
                        }
                        var13_13 = null;
                    }
                    if (var12_12 == null) ** GOTO lbl50
                    var19_19 = "message";
                    {
                        block28: {
                            block27: {
                                var19_19 = var12_12.optString((String)var19_19, null);
                                break block27;
lbl50:
                                // 1 sources

                                var18_18 = false;
                                var19_19 = null;
                            }
                            var24_24 = var12_12 != null ? var12_12.optInt((String)var14_14, (int)var23_23) : -1 != 0;
                            if (var12_12 != null) {
                                var23_23 = var12_12.optInt((String)var22_22, (int)var23_23);
                            }
                            if (var12_12 != null) {
                                var22_22 = "error_user_msg";
                                var22_22 = var12_12.optString((String)var22_22, null);
                            } else {
                                var22_22 = null;
                            }
                            if (var12_12 != null) {
                                var25_26 = "error_user_title";
                                var25_26 = var12_12.optString((String)var25_26, null);
                            } else {
                                var26_27 = false;
                                var25_26 = null;
                            }
                            if (var12_12 != null) {
                                var11_11 = "is_transient";
                                var20_20 = var12_12.optBoolean((String)var11_11, false);
                            }
                            var27_28 = var25_26;
                            var28_29 = var20_20;
                            var29_30 = var22_22;
                            var20_20 = var23_23;
                            var26_27 = true;
                            var22_22 = var13_13;
                            var23_23 = var24_24;
                            var13_13 = var19_19;
                            break block28;
lbl79:
                            // 1 sources

                            var11_11 = var15_15;
                            var11_11 = (JSONObject)var15_15;
                            var10_10 = var11_11.has((String)var12_12);
                            var13_13 = "error_reason";
                            var14_14 = "error_msg";
                            if (var10_10) ** GOTO lbl-1000
                            var11_11 = var15_15;
                            var11_11 = (JSONObject)var15_15;
                            var10_10 = var11_11.has((String)var14_14);
                            if (var10_10) ** GOTO lbl-1000
                            var11_11 = var15_15;
                            var11_11 = (JSONObject)var15_15;
                            var10_10 = var11_11.has((String)var13_13);
                            if (!var10_10) {
                                var13_13 = null;
                                var26_27 = false;
                                var25_26 = null;
                                var20_20 = -1 != 0;
                                var22_22 = null;
lbl98:
                                // 2 sources

                                while (true) {
                                    var27_28 = null;
                                    var29_30 = null;
                                    var28_29 = false;
                                    break;
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                var11_11 = var15_15;
                                var11_11 = (JSONObject)var15_15;
                                var18_18 = false;
                                var19_19 = null;
                                var11_11 = var11_11.optString((String)var13_13, null);
                                var13_13 = var15_15;
                                var13_13 = (JSONObject)var15_15;
                                var13_13 = var13_13.optString((String)var14_14, null);
                                var14_14 = var15_15;
                                var14_14 = (JSONObject)var15_15;
                                var9_9 = var14_14.optInt((String)var12_12, (int)var23_23);
                                var14_14 = var15_15;
                                var14_14 = (JSONObject)var15_15;
                                var24_25 = var14_14.optInt((String)var22_22, (int)var23_23);
                                var23_23 = var9_9;
                                var22_22 = var11_11;
                                var20_20 = var24_25;
                                var26_27 = true;
                                ** continue;
                            }
                        }
                        if (var26_27) {
                            var15_15 = (JSONObject)var15_15;
                            var19_19 = var12_12;
                            var26_27 = var23_23;
                            var30_31 = var13_13;
                            var12_12 = new FacebookRequestError((int)var17_17, (int)var23_23, (int)var20_20, (String)var22_22, (String)var13_13, (String)var27_28, var29_30, var3_3, null, var28_29);
                            break block25;
                        }
lbl130:
                        // 4 sources

                        if (var17_17 <= (var9_9 = 299 != 0) && (var9_9 = 200 != 0) <= var17_17) break block22;
                        var10_10 = var6_6.has((String)var7_7);
                        if (var10_10) {
                            var11_11 = lz3_0.t((String)var7_7, (String)var8_8, (JSONObject)var6_6);
                            var11_11 = (JSONObject)var11_11;
                        }
                        var27_28 = null;
                        var29_30 = null;
                        var28_29 = false;
                        var26_27 = -1 != 0;
                        var20_20 = -1 != 0;
                        var22_22 = null;
                        var23_23 = false;
                        var30_31 = null;
                        var19_19 = var12_12;
                        var12_12 = new FacebookRequestError((int)var17_17, (int)var26_27, (int)var20_20, null, null, null, null, var3_3, null, false);
                        break block25;
                    }
                }
                var9_9 = false;
                var12_12 = null;
            }
            if (var12_12 != null) {
                var12_12.toString();
                var31_32 = 190;
                var32_33 = var12_12.b;
                if (var32_33 != var31_32) return new f((GraphRequest)var4_4, var5_5, (FacebookRequestError)var12_12);
                var6_6 = var4_4.a;
                var7_7 = lz3_0.a;
                if (var6_6 == null) return new f((GraphRequest)var4_4, var5_5, (FacebookRequestError)var12_12);
                var7_7 = AccessToken.l;
                var7_7 = AccessToken$b.b();
                var31_32 = (int)Intrinsics.areEqual(var6_6, var7_7);
                if (var31_32 == 0) return new f((GraphRequest)var4_4, var5_5, (FacebookRequestError)var12_12);
                var32_33 = var12_12.c;
                var31_32 = 493;
                if (var32_33 != var31_32) {
                    var31_32 = 0;
                    var6_6 = null;
                    AccessToken$b.d(null);
                    return new f((GraphRequest)var4_4, var5_5, (FacebookRequestError)var12_12);
                } else {
                    var6_6 = AccessToken$b.b();
                    if (var6_6 == null) return new f((GraphRequest)var4_4, var5_5, (FacebookRequestError)var12_12);
                    var7_7 = new Date();
                    var6_6 = var6_6.a;
                    var31_32 = (int)var7_7.after((Date)var6_6);
                    if (var31_32 != 0) return new f((GraphRequest)var4_4, var5_5, (FacebookRequestError)var12_12);
                    var6_6 = b.f.a().c;
                    if (var6_6 == null) return new f((GraphRequest)var4_4, var5_5, (FacebookRequestError)var12_12);
                    Intrinsics.checkNotNullParameter(var6_6, "current");
                    var19_19 = var8_8 = var6_6.b;
                    var19_19 = (Collection)var8_8;
                    var33_35 = var8_8 = var6_6.c;
                    var33_35 = (Collection)var8_8;
                    var25_26 = var8_8 = var6_6.d;
                    var25_26 = (Collection)var8_8;
                    var22_22 = new Date();
                    var30_31 = new Date();
                    var21_21 = var6_6.f;
                    var8_8 = var6_6.j;
                    var13_13 = var6_6.e;
                    var14_14 = var6_6.h;
                    var15_15 = var6_6.i;
                    var11_11 = var7_7;
                    var27_28 = var8_8;
                    var7_7 = new AccessToken((String)var13_13, (String)var14_14, (String)var15_15, (Collection)var19_19, (Collection)var33_35, (Collection)var25_26, var21_21, (Date)var22_22, (Date)var30_31, (Date)var8_8);
                    AccessToken$b.d((AccessToken)var7_7);
                }
                return new f((GraphRequest)var4_4, var5_5, (FacebookRequestError)var12_12);
            }
            var32_34 = (var6_6 = lz3_0.t((String)var7_7, (String)var8_8, (JSONObject)var6_6)) instanceof JSONObject;
            if (var32_34) {
                var6_6 = (JSONObject)var6_6;
                var8_8 = var6_6.toString();
                return new f((GraphRequest)var4_4, var5_5, (String)var8_8, (JSONObject)var6_6);
            }
            var32_34 = var6_6 instanceof JSONArray;
            if (var32_34) {
                var8_8 = var6_6;
                var8_8 = (JSONArray)var6_6;
                var6_6 = var8_8.toString();
                Intrinsics.checkNotNullParameter(var4_4, "request");
                Intrinsics.checkNotNullParameter(var6_6, "rawResponse");
                Intrinsics.checkNotNullParameter(var8_8, "graphObjects");
                var6_6 = var11_11;
                var4_4 = var0;
                var5_5 = var1_1;
                return new f(var0, var1_1, null, (JSONArray)var8_8, null);
            }
            var6_6 = JSONObject.NULL;
            var7_7 = "NULL";
            Intrinsics.checkNotNullExpressionValue(var6_6, (String)var7_7);
        }
        if (var6_6 == (var7_7 = JSONObject.NULL)) {
            var6_6 = var6_6.toString();
            return new f((GraphRequest)var4_4, var5_5, (String)var6_6, null);
        }
        var6_6 = var6_6.getClass().getSimpleName();
        var6_6 = "Got unexpected object type in response, class: ".concat((String)var6_6);
        var4_4 = new FacebookException((String)var6_6);
        throw var4_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList c(InputStream object, HttpURLConnection object2, e object3) {
        int n3;
        Object object4;
        Object[] objectArray;
        Object object5;
        int n4;
        String string2;
        Object object6;
        int n7;
        Object object7;
        Object[] objectArray2;
        block18: {
            block17: {
                block16: {
                    block15: {
                        JSONException jSONException2;
                        block12: {
                            IOException iOException2;
                            block11: {
                                int n8;
                                objectArray2 = "requests";
                                Intrinsics.checkNotNullParameter(object3, (String)objectArray2);
                                object = lz3_0.K((InputStream)object);
                                Object object8 = sx1.d;
                                object8 = Ax1.INCLUDE_RAW_RESPONSES;
                                Integer n10 = ((String)object).length();
                                int n14 = 2;
                                object7 = new Object[n14];
                                object7[0] = n10;
                                n7 = 1;
                                object7[n7] = object;
                                object6 = "Response (raw)\n  Size: %d\n  Response:\n%s\n";
                                string2 = "Response";
                                sx1$a.b((Ax1)((Object)object8), string2, (String)object6, (Object[])object7);
                                Intrinsics.checkNotNullParameter(object, "responseString");
                                Intrinsics.checkNotNullParameter(object3, (String)objectArray2);
                                objectArray2 = new JSONTokener((String)object);
                                objectArray2 = objectArray2.nextValue();
                                Intrinsics.checkNotNullExpressionValue(objectArray2, "resultObject");
                                object8 = ((e)object3).c;
                                n4 = ((ArrayList)object8).size();
                                object7 = new ArrayList(n4);
                                if (n4 != n7) break block15;
                                object6 = (GraphRequest)((e)object3).get(0);
                                try {
                                    object5 = new JSONObject();
                                    objectArray = "body";
                                    object5.put((String)objectArray, (Object)objectArray2);
                                    n8 = object2 != null ? ((HttpURLConnection)object2).getResponseCode() : 200;
                                }
                                catch (IOException iOException2) {
                                    break block11;
                                }
                                catch (JSONException jSONException2) {
                                    break block12;
                                }
                                object4 = "code";
                                object5.put((String)object4, n8);
                                objectArray = new JSONArray();
                                objectArray.put(object5);
                                break block16;
                            }
                            object4 = new FacebookRequestError(iOException2);
                            objectArray = new f((GraphRequest)object6, (HttpURLConnection)object2, (FacebookRequestError)object4);
                            ((ArrayList)object7).add(objectArray);
                            break block15;
                        }
                        object4 = new FacebookRequestError((Exception)((Object)jSONException2));
                        objectArray = new f((GraphRequest)object6, (HttpURLConnection)object2, (FacebookRequestError)object4);
                        ((ArrayList)object7).add(objectArray);
                    }
                    objectArray = objectArray2;
                }
                n3 = objectArray instanceof JSONArray;
                if (n3 == 0) break block17;
                object6 = objectArray;
                object6 = (JSONArray)objectArray;
                int n15 = object6.length();
                if (n15 == n4) break block18;
            }
            object = new FacebookException("Unexpected number of results");
            throw object;
        }
        n4 = object6.length();
        n3 = 0;
        object6 = null;
        while (true) {
            block13: {
                FacebookRequestError facebookRequestError;
                JSONException jSONException3;
                Object object9;
                block14: {
                    if (n3 >= n4) {
                        object2 = sx1.d;
                        object2 = Ax1.REQUESTS;
                        object = ((String)object).length();
                        object3 = ((e)object3).b;
                        objectArray2 = new Object[3];
                        objectArray2[0] = object3;
                        objectArray2[n7] = object;
                        objectArray2[n14] = object7;
                        sx1$a.b((Ax1)((Object)object2), string2, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", objectArray2);
                        return object7;
                    }
                    object5 = (GraphRequest)((e)object3).get(n3);
                    object4 = objectArray;
                    try {
                        object4 = (JSONArray)objectArray;
                        object4 = object4.get(n3);
                        object9 = "obj";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object9);
                        object4 = f$a.b((GraphRequest)object5, (HttpURLConnection)object2, object4, objectArray2);
                        ((ArrayList)object7).add(object4);
                        break block13;
                    }
                    catch (FacebookException facebookException) {
                    }
                    catch (JSONException jSONException3) {
                        break block14;
                    }
                    facebookRequestError = new FacebookRequestError(facebookException);
                    object9 = new f((GraphRequest)object5, (HttpURLConnection)object2, facebookRequestError);
                    ((ArrayList)object7).add(object9);
                    break block13;
                }
                facebookRequestError = new FacebookRequestError((Exception)((Object)jSONException3));
                object9 = new f((GraphRequest)object5, (HttpURLConnection)object2, facebookRequestError);
                ((ArrayList)object7).add(object9);
            }
            n3 += n7;
        }
    }
}


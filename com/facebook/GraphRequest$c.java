/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.ParcelFileDescriptor
 *  android.text.TextUtils
 *  android.util.Pair
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.facebook.GraphRequest$a;
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$d;
import com.facebook.GraphRequest$e;
import com.facebook.GraphRequest$g;
import com.facebook.b;
import com.facebook.c;
import com.facebook.e;
import com.facebook.f$a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class GraphRequest$c {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String a(Object object) {
        Object object2 = GraphRequest.j;
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof Boolean;
        if (bl2) return object.toString();
        bl2 = object instanceof Number;
        if (bl2) return object.toString();
        bl2 = object instanceof Date;
        if (!bl2) {
            object = new IllegalArgumentException("Unsupported parameter type.");
            throw object;
        }
        String string2 = "yyyy-MM-dd'T'HH:mm:ssZ";
        Locale locale = Locale.US;
        object2 = new SimpleDateFormat(string2, locale);
        object = (Date)object;
        object = ((DateFormat)object2).format((Date)object);
        object2 = "iso8601DateFormat.format(value)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        return object;
    }

    public static HttpURLConnection b(URL object) {
        Object object2;
        int n3 = 2;
        object = ((URL)object).openConnection();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.net.HttpURLConnection");
        object = (HttpURLConnection)object;
        Object[] objectArray = GraphRequest.l;
        if (objectArray == null) {
            objectArray = StringCompanionObject.INSTANCE;
            objectArray = new Object[n3];
            objectArray[0] = "FBAndroidSDK";
            int n4 = 1;
            objectArray[n4] = "18.0.2";
            String string2 = "%s.%s";
            String string3 = "format(format, *args)";
            GraphRequest.l = xh2_0.a(objectArray, n3, string2, string3);
            object2 = lz3_0.a;
        }
        object2 = GraphRequest.l;
        ((URLConnection)object).setRequestProperty("User-Agent", (String)object2);
        object2 = Locale.getDefault().toString();
        ((URLConnection)object).setRequestProperty("Accept-Language", (String)object2);
        ((HttpURLConnection)object).setChunkedStreamingMode(0);
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList c(e object) {
        void var0_3;
        Object object2;
        block6: {
            HttpURLConnection httpURLConnection;
            block7: {
                Throwable throwable;
                Intrinsics.checkNotNullParameter(object, "requests");
                Xz3.e((Collection)object);
                object2 = null;
                try {
                    httpURLConnection = GraphRequest$c.p((e)object);
                    throwable = null;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (Exception exception) {
                    httpURLConnection = null;
                }
                if (httpURLConnection != null) {
                    try {
                        object = GraphRequest$c.d((e)object, httpURLConnection);
                        break block7;
                    }
                    catch (Throwable throwable3) {
                        object2 = httpURLConnection;
                        break block6;
                    }
                }
                ArrayList arrayList = ((e)object).c;
                FacebookException facebookException = new RuntimeException(throwable);
                object2 = f$a.a(arrayList, null, facebookException);
                GraphRequest$c.m((e)object, (ArrayList)object2);
                object = object2;
            }
            lz3_0.l(httpURLConnection);
            return object;
        }
        lz3_0.l(object2);
        throw var0_3;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList d(e object, HttpURLConnection object2) {
        Throwable throwable222;
        Object object3;
        block11: {
            int n3;
            Object[] objectArray;
            Object object4;
            int n4;
            block10: {
                FacebookException facebookException322;
                String string2;
                int n7;
                block12: {
                    n4 = 2;
                    n7 = 1;
                    object3 = "connection";
                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                    object4 = "requests";
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    objectArray = "Response <Error>: %s";
                    string2 = "Response";
                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    n3 = 0;
                    object3 = null;
                    try {
                        int n8 = FacebookSdk.h();
                        if (n8 != 0) {
                            int n10;
                            n8 = ((HttpURLConnection)object2).getResponseCode();
                            object3 = n8 >= (n10 = 400) ? ((HttpURLConnection)object2).getErrorStream() : ((URLConnection)object2).getInputStream();
                            object4 = f$a.c((InputStream)object3, (HttpURLConnection)object2, (e)object);
                            break block10;
                        }
                        object4 = "GraphRequest can't be used when Facebook SDK isn't fully initialized";
                    }
                    catch (Throwable throwable222) {
                        break block11;
                    }
                    FacebookException facebookException2 = new FacebookException((String)object4);
                    throw facebookException2;
                    catch (Exception exception) {
                    }
                    catch (FacebookException facebookException322) {
                        break block12;
                    }
                    Object object5 = sx1.d;
                    object5 = Ax1.REQUESTS;
                    Object[] objectArray2 = new Object[n7];
                    objectArray2[0] = exception;
                    sx1$a.b((Ax1)((Object)object5), string2, (String)objectArray, objectArray2);
                    objectArray = new RuntimeException(exception);
                    object4 = f$a.a((List)object, (HttpURLConnection)object2, (FacebookException)objectArray);
                    break block10;
                }
                Object object6 = sx1.d;
                object6 = Ax1.REQUESTS;
                Object[] objectArray3 = new Object[n7];
                objectArray3[0] = facebookException322;
                sx1$a.b((Ax1)((Object)object6), string2, (String)objectArray, objectArray3);
                object4 = f$a.a((List)object, (HttpURLConnection)object2, facebookException322);
            }
            lz3_0.e((Closeable)object3);
            lz3_0.l((URLConnection)object2);
            object2 = ((e)object).c;
            int n14 = ((ArrayList)object2).size();
            n3 = object4.size();
            if (n14 != n3) {
                object3 = StringCompanionObject.INSTANCE;
                object3 = Locale.US;
                object4 = object4.size();
                object2 = n14;
                objectArray = new Object[n4];
                objectArray[0] = object4;
                objectArray[n7] = object2;
                object2 = IV0.a(objectArray, n4, (Locale)object3, "Received %d responses while expecting %d", "format(locale, format, *args)");
                object = new FacebookException((String)object2);
                throw object;
            }
            GraphRequest$c.m((e)object, (ArrayList)object4);
            object = b.f.a();
            object2 = ((b)object).c;
            if (object2 == null) {
                return object4;
            }
            Object object7 = new Date();
            long l2 = ((Date)object7).getTime();
            object3 = ((AccessToken)object2).f;
            n3 = (int)(((F1)((Object)object3)).canExtendToken() ? 1 : 0);
            if (n3 == 0) return object4;
            object3 = ((b)object).e;
            long l3 = ((Date)object3).getTime();
            long l4 = 3600000L;
            long l7 = (l3 = l2 - l3) - l4;
            n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n3 <= 0) return object4;
            object2 = ((AccessToken)object2).g;
            l3 = ((Date)object2).getTime();
            long l8 = (l2 -= l3) - (l3 = 86400000L);
            n14 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
            if (n14 <= 0) return object4;
            object2 = Looper.getMainLooper();
            n14 = (int)(Intrinsics.areEqual(object2, object7 = Looper.myLooper()) ? 1 : 0);
            if (n14 != 0) {
                ((b)object).a();
                return object4;
            }
            object7 = Looper.getMainLooper();
            object2 = new Handler((Looper)object7);
            object7 = new A1(object, 0);
            object2.post((Runnable)object7);
            return object4;
        }
        lz3_0.e((Closeable)object3);
        throw throwable222;
    }

    public static boolean e(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Bitmap;
        if (!(bl3 || (bl3 = object instanceof byte[]) || (bl3 = object instanceof Uri) || (bl3 = object instanceof ParcelFileDescriptor) || (bl2 = object instanceof GraphRequest$ParcelableResourceWithMimeType))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean f(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof String;
        if (!(bl3 || (bl3 = object instanceof Boolean) || (bl3 = object instanceof Number) || (bl2 = object instanceof Date))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static GraphRequest g(AccessToken accessToken, String string2, GraphRequest$b graphRequest$b) {
        GraphRequest graphRequest = new GraphRequest(accessToken, string2, null, null, graphRequest$b, 32);
        return graphRequest;
    }

    public static GraphRequest h(AccessToken accessToken, GraphRequest$d object) {
        o01_0 o01_02 = new o01_0((GraphRequest$d)object);
        object = new GraphRequest(accessToken, "me", null, null, o01_02, 32);
        return object;
    }

    public static GraphRequest i(AccessToken accessToken, String string2, JSONObject jSONObject, GraphRequest$b graphRequest$b) {
        Qa1 qa1 = Qa1.POST;
        GraphRequest graphRequest = new GraphRequest(accessToken, string2, null, qa1, graphRequest$b, 32);
        graphRequest.c = jSONObject;
        return graphRequest;
    }

    /*
     * Unable to fully structure code
     */
    public static void j(JSONObject var0, String var1_1, GraphRequest$e var2_2) {
        var3_3 = GraphRequest.k.matcher(var1_1);
        var4_4 = var3_3.matches();
        var5_5 = true;
        if (var4_4 != 0) {
            var3_3 = var3_3.group((int)var5_5);
            var6_6 = "matcher.group(1)";
            Intrinsics.checkNotNullExpressionValue(var3_3, var6_6);
        } else {
            var3_3 = var1_1;
        }
        var6_6 = "me/";
        var4_4 = kotlin.text.b.s((String)var3_3, var6_6, false);
        if (var4_4 == 0 && (var7_7 = kotlin.text.b.s((String)var3_3, var6_6 = "/me/", false)) == 0) {
            while (true) {
                var8_8 = 0;
                var1_1 = null;
                break;
            }
        } else {
            var3_3 = ":";
            var4_4 = 6;
            var7_7 = StringsKt.O(var1_1, (String)var3_3, 0, false, var4_4);
            var9_9 = "?";
            var8_8 = StringsKt.O(var1_1, (String)var9_9, 0, false, var4_4);
            if (var7_7 <= (var4_4 = 3) || var8_8 != (var4_4 = -1) && var7_7 >= var8_8) ** continue;
            var8_8 = 1;
        }
        var3_3 = var0.keys();
        while ((var4_4 = (int)var3_3.hasNext()) != 0) {
            var6_6 = (String)var3_3.next();
            var9_9 = var0.opt(var6_6);
            if (var8_8 != 0 && (var11_11 = kotlin.text.b.i(var6_6, var10_10 = "image", var5_5))) {
                var11_11 = true;
            } else {
                var11_11 = false;
                var10_10 = null;
            }
            Intrinsics.checkNotNullExpressionValue(var6_6, "key");
            var12_12 = "value";
            Intrinsics.checkNotNullExpressionValue(var9_9, var12_12);
            GraphRequest$c.k(var6_6, var9_9, var2_2, var11_11);
        }
    }

    public static void k(String object, Object object2, GraphRequest$e graphRequest$e, boolean bl2) {
        int n3 = 1;
        boolean bl3 = false;
        Locale locale = null;
        Object object3 = object2.getClass();
        Class<JSONArray> clazz = JSONObject.class;
        int n4 = clazz.isAssignableFrom((Class<?>)object3);
        int n7 = 2;
        if (n4 != 0) {
            object3 = "null cannot be cast to non-null type org.json.JSONObject";
            Intrinsics.checkNotNull(object2, (String)object3);
            object2 = (JSONObject)object2;
            if (bl2) {
                object3 = object2.keys();
                while ((n4 = object3.hasNext()) != 0) {
                    clazz = (String)object3.next();
                    Object object4 = StringCompanionObject.INSTANCE;
                    object4 = new Object[n7];
                    object4[0] = object;
                    object4[n3] = clazz;
                    String string2 = "format(format, *args)";
                    object4 = xh2_0.a(object4, n7, "%s[%s]", string2);
                    clazz = object2.opt((String)((Object)clazz));
                    String string3 = "jsonObject.opt(propertyName)";
                    Intrinsics.checkNotNullExpressionValue(clazz, string3);
                    GraphRequest$c.k((String)object4, clazz, graphRequest$e, bl2);
                }
            } else {
                String string4 = "id";
                bl3 = object2.has(string4);
                if (bl3) {
                    object2 = object2.optString(string4);
                    string4 = "jsonObject.optString(\"id\")";
                    Intrinsics.checkNotNullExpressionValue(object2, string4);
                    GraphRequest$c.k((String)object, object2, graphRequest$e, bl2);
                } else {
                    string4 = "url";
                    bl3 = object2.has(string4);
                    if (bl3) {
                        object2 = object2.optString(string4);
                        string4 = "jsonObject.optString(\"url\")";
                        Intrinsics.checkNotNullExpressionValue(object2, string4);
                        GraphRequest$c.k((String)object, object2, graphRequest$e, bl2);
                    } else {
                        string4 = "fbsdk:create_object";
                        n3 = object2.has(string4);
                        if (n3 != 0) {
                            object2 = object2.toString();
                            string4 = "jsonObject.toString()";
                            Intrinsics.checkNotNullExpressionValue(object2, string4);
                            GraphRequest$c.k((String)object, object2, graphRequest$e, bl2);
                        }
                    }
                }
            }
        } else {
            clazz = JSONArray.class;
            n4 = clazz.isAssignableFrom((Class<?>)object3);
            if (n4 != 0) {
                object3 = "null cannot be cast to non-null type org.json.JSONArray";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (JSONArray)object2;
                int n8 = object2.length();
                clazz = null;
                for (n4 = 0; n4 < n8; n4 += n3) {
                    Object object5 = StringCompanionObject.INSTANCE;
                    object5 = Locale.ROOT;
                    Object object6 = n4;
                    Object object7 = new Object[n7];
                    object7[0] = object;
                    object7[n3] = object6;
                    String string5 = "format(locale, format, *args)";
                    object5 = IV0.a(object7, n7, (Locale)object5, "%s[%d]", string5);
                    object6 = object2.opt(n4);
                    object7 = "jsonArray.opt(i)";
                    Intrinsics.checkNotNullExpressionValue(object6, (String)object7);
                    GraphRequest$c.k((String)object5, object6, graphRequest$e, bl2);
                    continue;
                }
            } else {
                Class clazz2 = String.class;
                bl2 = clazz2.isAssignableFrom((Class<?>)object3);
                if (!(bl2 || (bl2 = (clazz2 = Number.class).isAssignableFrom((Class<?>)object3)) || (bl2 = (clazz2 = Boolean.class).isAssignableFrom((Class<?>)object3)))) {
                    clazz2 = Date.class;
                    bl2 = clazz2.isAssignableFrom((Class<?>)object3);
                    if (bl2) {
                        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.util.Date");
                        object2 = (Date)object2;
                        String string6 = "yyyy-MM-dd'T'HH:mm:ssZ";
                        locale = Locale.US;
                        clazz2 = new SimpleDateFormat(string6, locale);
                        object2 = ((DateFormat)((Object)clazz2)).format((Date)object2);
                        clazz2 = "iso8601DateFormat.format(date)";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)((Object)clazz2));
                        graphRequest$e.a((String)object, (String)object2);
                    } else {
                        object = GraphRequest.j;
                        object = lz3_0.a;
                        object = FacebookSdk.a;
                    }
                } else {
                    object2 = object2.toString();
                    graphRequest$e.a((String)object, (String)object2);
                }
            }
        }
    }

    public static void l(e e2, sx1 sx12, int n3, URL object, OutputStream outputStream, boolean bl2) {
        Object object2;
        block26: {
            block25: {
                int n4;
                Object object3;
                Object object4;
                Object object5;
                boolean bl3;
                AccessToken accessToken;
                int n7;
                HashMap<Object, Object> hashMap;
                int n8;
                Object[] objectArray;
                Object object6;
                Object object7;
                GraphRequest$g graphRequest$g;
                Object object8;
                int n14;
                Object object9;
                block23: {
                    block24: {
                        Object object10;
                        Object object11;
                        Object object12;
                        object2 = e2;
                        object9 = sx12;
                        n14 = 2;
                        object8 = outputStream;
                        boolean n10 = bl2;
                        graphRequest$g = new GraphRequest$g(outputStream, sx12, bl2);
                        object8 = "  Attachments:\n";
                        boolean bl4 = false;
                        object7 = null;
                        object6 = "string";
                        objectArray = "key";
                        n8 = 1;
                        int n15 = n3;
                        if (n3 != n8) break block24;
                        object2 = (GraphRequest)e2.c.get(0);
                        Object object13 = new HashMap();
                        object7 = ((GraphRequest)object2).d.keySet().iterator();
                        while ((n8 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                            object12 = (String)object7.next();
                            object11 = ((GraphRequest)object2).d.get((String)object12);
                            boolean bl5 = GraphRequest$c.e(object11);
                            if (!bl5) continue;
                            Intrinsics.checkNotNullExpressionValue(object12, (String)objectArray);
                            object10 = new GraphRequest$a((GraphRequest)object2, object11);
                            ((HashMap)object13).put(object12, object10);
                        }
                        if (object9 != null) {
                            object7 = "  Parameters:\n";
                            Intrinsics.checkNotNullParameter(object7, (String)object6);
                            sx12.c();
                        }
                        object7 = ((GraphRequest)object2).d;
                        object12 = object7.keySet().iterator();
                        while ((n15 = (int)(object12.hasNext() ? 1 : 0)) != 0) {
                            object11 = (String)object12.next();
                            object10 = object7.get((String)object11);
                            boolean bl6 = GraphRequest$c.f(object10);
                            if (!bl6) continue;
                            Intrinsics.checkNotNullExpressionValue(object11, (String)objectArray);
                            graphRequest$g.g((String)object11, object10, (GraphRequest)object2);
                        }
                        if (object9 != null) {
                            Intrinsics.checkNotNullParameter(object8, (String)object6);
                            sx12.c();
                        }
                        GraphRequest$c.n(object13, graphRequest$g);
                        object2 = ((GraphRequest)object2).c;
                        if (object2 != null) {
                            object9 = ((URL)object).getPath();
                            object13 = "url.path";
                            Intrinsics.checkNotNullExpressionValue(object9, (String)object13);
                            GraphRequest$c.j((JSONObject)object2, (String)object9, graphRequest$g);
                        }
                        break block25;
                    }
                    e2.getClass();
                    hashMap = ((AbstractCollection)e2).iterator();
                    while ((n7 = hashMap.hasNext()) != 0) {
                        accessToken = ((GraphRequest)hashMap.next()).a;
                        if (accessToken == null) continue;
                        hashMap = accessToken.h;
                        break block23;
                    }
                    hashMap = GraphRequest.j;
                    hashMap = FacebookSdk.b();
                }
                n7 = ((String)((Object)hashMap)).length();
                if (n7 == 0) break block26;
                graphRequest$g.a("batch_app_id", (String)((Object)hashMap));
                hashMap = new HashMap<Object, Object>();
                accessToken = new JSONArray();
                Object object14 = e2.iterator();
                while (bl3 = object14.hasNext()) {
                    boolean bl7;
                    GraphRequest graphRequest = (GraphRequest)object14.next();
                    graphRequest.getClass();
                    JSONObject jSONObject = new JSONObject();
                    Object object15 = q03.b();
                    object15 = graphRequest.h((String)object15);
                    graphRequest.a();
                    object15 = Uri.parse((String)graphRequest.b((String)object15, n8 != 0));
                    Object object16 = StringCompanionObject.INSTANCE;
                    object16 = object15.getPath();
                    object15 = object15.getQuery();
                    Object[] objectArray2 = object14;
                    object14 = new Object[n14];
                    object14[0] = object16;
                    object14[n8] = object15;
                    object14 = xh2_0.a(object14, n14, "%s?%s", "format(format, *args)");
                    jSONObject.put("relative_url", object14);
                    object16 = graphRequest.h;
                    jSONObject.put("method", object16);
                    object15 = graphRequest.a;
                    if (object15 != null) {
                        object16 = sx1.d;
                        object15 = ((AccessToken)object15).e;
                        ((sx1$a)object16).d((String)object15);
                    }
                    object15 = new ArrayList();
                    object16 = graphRequest.d.keySet().iterator();
                    while (true) {
                        int n16 = object16.hasNext();
                        object5 = GraphRequest.j;
                        if (n16 == 0) break;
                        object4 = object16.next();
                        object3 = object4;
                        object3 = (String)object4;
                        object7 = graphRequest.d.get((String)object3);
                        n8 = (int)(GraphRequest$c.e(object7) ? 1 : 0);
                        if (n8 != 0) {
                            object3 = StringCompanionObject.INSTANCE;
                            object3 = Locale.ROOT;
                            n16 = hashMap.size();
                            object4 = n16;
                            object = object16;
                            object16 = new Object[n14];
                            n4 = 0;
                            object16[0] = "file";
                            int n17 = 1;
                            object16[n17] = object4;
                            object4 = object8;
                            object5 = object6;
                            object8 = IV0.a((Object[])object16, n14, (Locale)object3, "%s%d", "format(locale, format, *args)");
                            ((ArrayList)object15).add(object8);
                            object6 = new GraphRequest$a(graphRequest, object7);
                            hashMap.put(object8, object6);
                            object16 = object;
                            object8 = object4;
                            object6 = object5;
                        }
                        bl7 = false;
                        object7 = null;
                        n8 = 1;
                    }
                    object4 = object8;
                    object5 = object6;
                    boolean bl8 = ((ArrayList)object15).isEmpty();
                    if (!bl8) {
                        object8 = TextUtils.join((CharSequence)",", (Iterable)object15);
                        object7 = "attached_files";
                        jSONObject.put((String)object7, object8);
                    }
                    if ((object8 = graphRequest.c) != null) {
                        object7 = new ArrayList();
                        object6 = new c((ArrayList)object7);
                        GraphRequest$c.j((JSONObject)object8, (String)object14, (GraphRequest$e)object6);
                        object8 = TextUtils.join((CharSequence)"&", (Iterable)object7);
                        object7 = "body";
                        jSONObject.put((String)object7, object8);
                    }
                    accessToken.put(jSONObject);
                    object14 = objectArray2;
                    object8 = object4;
                    object6 = object5;
                    bl7 = false;
                    object7 = null;
                    n8 = 1;
                }
                object4 = object8;
                object5 = object6;
                Object object17 = "batch";
                Intrinsics.checkNotNullParameter(object17, (String)objectArray);
                Intrinsics.checkNotNullParameter(accessToken, "requestJsonArray");
                Intrinsics.checkNotNullParameter(object2, "requests");
                object8 = graphRequest$g.a;
                boolean bl9 = object8 instanceof gk2_0;
                object6 = "requestJsonArray.toString()";
                if (!bl9) {
                    object2 = accessToken.toString();
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
                    graphRequest$g.a((String)object17, (String)object2);
                } else {
                    boolean bl10;
                    int n18;
                    Intrinsics.checkNotNull(object8, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                    object8 = (gk2_0)object8;
                    boolean bl11 = false;
                    graphRequest$g.c((String)object17, null, null);
                    object7 = new Object[]{};
                    graphRequest$g.b("[", object7);
                    object2 = e2.iterator();
                    n14 = 0;
                    object17 = null;
                    while ((n18 = object2.hasNext()) != 0) {
                        n18 = 1;
                        n4 = n14 + 1;
                        objectArray = (GraphRequest)object2.next();
                        object3 = accessToken.getJSONObject(n14);
                        object8.a((GraphRequest)objectArray);
                        if (n14 > 0) {
                            object17 = object3.toString();
                            objectArray = new Object[n18];
                            bl10 = false;
                            object14 = null;
                            objectArray[0] = object17;
                            object17 = ",%s";
                            graphRequest$g.b((String)object17, objectArray);
                        } else {
                            bl10 = false;
                            object14 = null;
                            object17 = object3.toString();
                            objectArray = new Object[n18];
                            objectArray[0] = object17;
                            object17 = "%s";
                            graphRequest$g.b((String)object17, objectArray);
                        }
                        n14 = n4;
                    }
                    bl10 = false;
                    object14 = null;
                    object17 = new Object[]{};
                    graphRequest$g.b("]", object17);
                    object2 = graphRequest$g.b;
                    if (object2 != null) {
                        object17 = accessToken.toString();
                        Intrinsics.checkNotNullExpressionValue(object17, (String)object6);
                        object8 = "    batch";
                        ((sx1)object2).a(object17, (String)object8);
                    }
                }
                if (object9 != null) {
                    object2 = object4;
                    object17 = object5;
                    Intrinsics.checkNotNullParameter(object4, (String)object5);
                    sx12.c();
                }
                GraphRequest$c.n(hashMap, graphRequest$g);
            }
            return;
        }
        object2 = new FacebookException("App ID was not specified at the request or Settings.");
        throw object2;
    }

    public static void m(e e2, ArrayList object) {
        Intrinsics.checkNotNullParameter(e2, "requests");
        Intrinsics.checkNotNullParameter(object, "responses");
        ArrayList arrayList = e2.c;
        int n3 = arrayList.size();
        ArrayList<GraphRequest$b> arrayList2 = new ArrayList<GraphRequest$b>();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = (GraphRequest)e2.c.get(i3);
            GraphRequest$b graphRequest$b = ((GraphRequest)object2).g;
            if (graphRequest$b == null) continue;
            object2 = ((GraphRequest)object2).g;
            Object e5 = object.get(i3);
            graphRequest$b = new Pair(object2, e5);
            arrayList2.add(graphRequest$b);
        }
        int n4 = arrayList2.size();
        if (n4 > 0) {
            n3 = 0;
            arrayList = null;
            object = new N01(0, arrayList2, e2);
            e2 = e2.a;
            if (e2 != null) {
                e2.post((Runnable)object);
            } else {
                ((N01)object).run();
            }
        }
    }

    public static void n(HashMap object, GraphRequest$g graphRequest$g) {
        boolean bl2;
        object = ((HashMap)object).entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            Object object3 = GraphRequest.j;
            object3 = ((GraphRequest$a)object2.getValue()).b;
            boolean bl3 = GraphRequest$c.e(object3);
            if (!bl3) continue;
            object3 = (String)object2.getKey();
            Object object4 = ((GraphRequest$a)object2.getValue()).b;
            object2 = ((GraphRequest$a)object2.getValue()).a;
            graphRequest$g.g((String)object3, object4, (GraphRequest)object2);
        }
    }

    /*
     * Exception decompiling
     */
    public static void o(e var0, HttpURLConnection var1_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 22[TRYBLOCK] [23 : 722->727)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HttpURLConnection p(e e2) {
        MalformedURLException malformedURLException2;
        Object object;
        block9: {
            IOException iOException2;
            Object object2;
            block10: {
                int n3;
                Object object3;
                block8: {
                    block7: {
                        int n4;
                        object = "could not construct request body";
                        object2 = "requests";
                        Intrinsics.checkNotNullParameter(e2, (String)object2);
                        Intrinsics.checkNotNullParameter(e2, (String)object2);
                        object2 = ((AbstractCollection)e2).iterator();
                        while ((n4 = object2.hasNext()) != 0) {
                            object3 = (GraphRequest)object2.next();
                            Object object4 = Qa1.GET;
                            Object object5 = ((GraphRequest)object3).h;
                            if (object4 != object5) continue;
                            object4 = ((GraphRequest)object3).d;
                            object5 = "fields";
                            boolean bl2 = lz3_0.A((String)(object4 = object4.getString((String)object5)));
                            if (!bl2) continue;
                            object4 = sx1.d;
                            object4 = Ax1.DEVELOPER_ERRORS;
                            String string2 = "GET requests for /";
                            object5 = new StringBuilder(string2);
                            object3 = ((GraphRequest)object3).b;
                            if (object3 == null) {
                                object3 = "";
                            }
                            ((StringBuilder)object5).append((String)object3);
                            ((StringBuilder)object5).append(" should contain an explicit \"fields\" parameter.");
                            object3 = ((StringBuilder)object5).toString();
                            object5 = "Request";
                            sx1$a.c((Ax1)((Object)object4), (String)object5, (String)object3);
                        }
                        try {
                            object2 = e2.c;
                            n3 = ((ArrayList)object2).size();
                            n4 = 1;
                            if (n3 != n4) break block7;
                            object2 = e2.c;
                            n4 = 0;
                            object3 = null;
                            object2 = ((ArrayList)object2).get(0);
                            object2 = (GraphRequest)object2;
                            object2 = ((GraphRequest)object2).g();
                            object3 = new URL((String)object2);
                            break block8;
                        }
                        catch (MalformedURLException malformedURLException2) {
                            break block9;
                        }
                    }
                    object2 = q03.b();
                    object3 = new URL((String)object2);
                }
                n3 = 0;
                object2 = null;
                try {
                    object2 = GraphRequest$c.b((URL)object3);
                    GraphRequest$c.o(e2, (HttpURLConnection)object2);
                    return object2;
                }
                catch (JSONException jSONException) {
                }
                catch (IOException iOException2) {
                    break block10;
                }
                lz3_0.l((URLConnection)object2);
                object2 = new RuntimeException((String)object, jSONException);
                throw object2;
            }
            lz3_0.l((URLConnection)object2);
            object2 = new RuntimeException((String)object, iOException2);
            throw object2;
        }
        object = new RuntimeException("could not construct URL for request", malformedURLException2);
        throw object;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.hardware.display.DisplayManager
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Environment
 *  android.os.Parcel
 *  android.os.StatFs
 *  android.telephony.TelephonyManager
 *  android.util.DisplayMetrics
 *  android.webkit.CookieManager
 *  android.webkit.CookieSyncManager
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 *  org.json.JSONTokener
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$c;
import com.facebook.j;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/*
 * Renamed from lz3
 */
public final class lz3_0 {
    public static final lz3_0 a;
    public static int b;
    public static long c;
    public static long d;
    public static long e;
    public static String f;
    public static String g;
    public static String h;
    public static String i;
    public static Locale j;

    static {
        long l2;
        Object object = new lz3_0();
        a = object;
        c = l2 = (long)-1;
        d = l2;
        e = l2;
        f = object = "";
        g = object;
        h = "NoCarrier";
        i = object;
    }

    public static final boolean A(String string2) {
        boolean bl2;
        if (string2 != null && (bl2 = string2.length())) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static final boolean B(Uri object) {
        boolean bl2;
        String string2;
        String string3;
        boolean bl3;
        if (object != null && ((bl3 = (string3 = "http").equalsIgnoreCase(string2 = object.getScheme())) || (bl3 = (string3 = "https").equalsIgnoreCase(string2 = object.getScheme())) || (bl2 = (string2 = "fbstaging").equalsIgnoreCase((String)(object = object.getScheme()))))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static final ArrayList C(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "jsonArray");
        ArrayList<String> arrayList = new ArrayList<String>();
        int n3 = jSONArray.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = jSONArray.getString(i3);
            arrayList.add(string2);
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final HashMap D(String hashMap) {
        JSONObject jSONObject;
        HashMap hashMap2 = "str";
        Intrinsics.checkNotNullParameter(hashMap, (String)((Object)hashMap2));
        int n3 = ((String)((Object)hashMap)).length();
        if (n3 == 0) {
            return new HashMap();
        }
        hashMap2 = new HashMap();
        try {
            jSONObject = new JSONObject(hashMap);
            hashMap = jSONObject.keys();
        }
        catch (JSONException jSONException) {
            return new HashMap();
        }
        while (true) {
            boolean bl2 = hashMap.hasNext();
            if (!bl2) return hashMap2;
            break;
        }
        {
            Object object = hashMap.next();
            object = (String)object;
            String string2 = "key";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            string2 = jSONObject.getString(object);
            String string3 = "jsonObject.getString(key)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            hashMap2.put(object, string2);
            continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String E(Map object) {
        String string2 = "map";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object.isEmpty();
        String string3 = "";
        if (bl2) {
            return string3;
        }
        try {
            boolean bl3;
            string2 = new JSONObject();
            object = object.entrySet();
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                Object object2 = object.next();
                object2 = (Map.Entry)object2;
                Object object3 = object2.getKey();
                object3 = (String)object3;
                object2 = object2.getValue();
                object2 = (String)object2;
                string2.put(object3, object2);
            }
            string3 = string2.toString();
        }
        catch (JSONException jSONException) {}
        object = "{\n      try {\n        va\u2026\n        \"\"\n      }\n    }";
        Intrinsics.checkNotNullExpressionValue(string3, object);
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Bundle F(String object) {
        int n3 = 1;
        Bundle bundle = new Bundle();
        int n4 = lz3_0.A((String)object);
        if (n4 == 0) {
            if (object == null) {
                String string2 = "Required value was null.".toString();
                object = new IllegalStateException(string2);
                throw object;
            }
            String[] stringArray = new String[]{"&"};
            int n7 = 6;
            object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n7);
            stringArray = new String[]{};
            object = object.toArray(stringArray);
            n4 = ((Object)object).length;
            for (int i3 = 0; i3 < n4; i3 += n3) {
                Object object2 = object[i3];
                String[] stringArray2 = new String[]{"="};
                Collection collection = StringsKt.a0((CharSequence)object2, stringArray2, false, 0, n7);
                String[] stringArray3 = new String[]{};
                String[] stringArray4 = collection.toArray(stringArray3);
                try {
                    int n8 = stringArray4.length;
                    int n10 = 2;
                    String string3 = "UTF-8";
                    if (n8 == n10) {
                        String string5 = stringArray4[0];
                        string5 = URLDecoder.decode(string5, string3);
                        String string7 = stringArray4[n3];
                        string7 = URLDecoder.decode(string7, string3);
                        bundle.putString(string5, string7);
                        continue;
                    }
                    n8 = stringArray4.length;
                    if (n8 != n3) continue;
                    String string9 = stringArray4[0];
                    string9 = URLDecoder.decode(string9, string3);
                    String string10 = "";
                    bundle.putString(string9, string10);
                    continue;
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    FacebookSdk facebookSdk = FacebookSdk.a;
                }
            }
        }
        return bundle;
    }

    public static final void G(Bundle bundle, JSONArray object) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string2 = "media";
        boolean bl2 = object instanceof boolean[];
        if (bl2) {
            object = (boolean[])object;
            bundle.putBooleanArray(string2, (boolean[])object);
        } else {
            bl2 = object instanceof double[];
            if (bl2) {
                object = (double[])object;
                bundle.putDoubleArray(string2, (double[])object);
            } else {
                bl2 = object instanceof int[];
                if (bl2) {
                    object = (int[])object;
                    bundle.putIntArray(string2, (int[])object);
                } else {
                    bl2 = object instanceof long[];
                    if (bl2) {
                        object = (long[])object;
                        bundle.putLongArray(string2, (long[])object);
                    } else {
                        object = object.toString();
                        bundle.putString(string2, (String)object);
                    }
                }
            }
        }
    }

    public static final void H(Bundle bundle, String string2, String string3) {
        String string4 = "b";
        Intrinsics.checkNotNullParameter(bundle, string4);
        boolean bl2 = lz3_0.A(string3);
        if (!bl2) {
            bundle.putString(string2, string3);
        }
    }

    public static final void I(Uri object, Bundle bundle, String string2) {
        String string3 = "b";
        Intrinsics.checkNotNullParameter(bundle, string3);
        if (object != null) {
            object = object.toString();
            lz3_0.H(bundle, string2, (String)object);
        }
    }

    public static final HashMap J(Parcel parcel) {
        String string2 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, string2);
        int n3 = parcel.readInt();
        if (n3 < 0) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (string3 == null || string4 == null) continue;
            hashMap.put(string3, string4);
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String K(InputStream closeable) {
        BufferedInputStream bufferedInputStream;
        Object object;
        block7: {
            Object object2;
            object = null;
            try {
                bufferedInputStream = new BufferedInputStream((InputStream)closeable);
            }
            catch (Throwable throwable) {
                bufferedInputStream = null;
                object = throwable;
                closeable = null;
                break block7;
            }
            try {
                closeable = new InputStreamReader(bufferedInputStream);
            }
            catch (Throwable throwable) {
                closeable = null;
                break block7;
            }
            try {
                int n3;
                int n4;
                object = new StringBuilder();
                int n7 = 2048;
                object2 = new char[n7];
                while ((n4 = ((Reader)closeable).read((char[])object2)) != (n3 = -1)) {
                    n3 = 0;
                    ((StringBuilder)object).append((char[])object2, 0, n4);
                }
            }
            catch (Throwable throwable) {
                break block7;
            }
            object = ((StringBuilder)object).toString();
            object2 = "{\n      bufferedInputStr\u2026gBuilder.toString()\n    }";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            lz3_0.e(bufferedInputStream);
            lz3_0.e(closeable);
            return object;
        }
        lz3_0.e(bufferedInputStream);
        lz3_0.e(closeable);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void L(Runnable runnable2) {
        Executor executor;
        try {
            executor = FacebookSdk.d();
        }
        catch (Exception exception) {
            return;
        }
        executor.execute(runnable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void M(JSONObject jSONObject, zq_0 object, String clazz, boolean bl2, Context object2) {
        int n3;
        Object object3;
        block14: {
            block22: {
                block24: {
                    int n4;
                    block23: {
                        Throwable throwable2;
                        block13: {
                            Object object4;
                            Object object5;
                            block12: {
                                block18: {
                                    block19: {
                                        block21: {
                                            lz3_0 lz3_02;
                                            block20: {
                                                int n7;
                                                block15: {
                                                    String string2;
                                                    block17: {
                                                        block16: {
                                                            Intrinsics.checkNotNullParameter(jSONObject, "params");
                                                            Intrinsics.checkNotNullParameter(object2, "context");
                                                            object5 = kJ0$b.ServiceUpdateCompliance;
                                                            int n8 = kj0_0.b((kJ0$b)((Object)object5));
                                                            string2 = "anon_id";
                                                            if (n8 == 0) {
                                                                jSONObject.put(string2, (Object)clazz);
                                                            }
                                                            jSONObject.put("application_tracking_enabled", bl2 ^= true);
                                                            object3 = FacebookSdk.a;
                                                            bl2 = com.facebook.j.b();
                                                            object4 = "advertiser_id_collection_enabled";
                                                            jSONObject.put((String)object4, bl2);
                                                            bl2 = false;
                                                            object3 = null;
                                                            if (object == null) break block14;
                                                            n8 = kj0_0.b((kJ0$b)((Object)object5));
                                                            n7 = 31;
                                                            lz3_02 = a;
                                                            if (n8 == 0) break block15;
                                                            n8 = Build.VERSION.SDK_INT;
                                                            if (n8 < n7) break block16;
                                                            lz3_02.getClass();
                                                            n8 = (int)(lz3_0.z((Context)object2) ? 1 : 0);
                                                            if (n8 == 0) break block17;
                                                            n8 = (int)(((zq_0)object).e ? 1 : 0);
                                                            if (n8 == 0) {
                                                                jSONObject.put(string2, clazz);
                                                            }
                                                            break block15;
                                                        }
                                                        lz3_02.getClass();
                                                    }
                                                    jSONObject.put(string2, (Object)clazz);
                                                }
                                                if ((clazz = ((zq_0)object).c) == null) break block18;
                                                n4 = kj0_0.b((kJ0$b)((Object)object5));
                                                object5 = "attribution";
                                                if (!n4) break block19;
                                                n4 = Build.VERSION.SDK_INT;
                                                if (n4 < n7) break block20;
                                                lz3_02.getClass();
                                                n4 = (int)(lz3_0.z((Context)object2) ? 1 : 0);
                                                if (!n4) break block21;
                                                n4 = (int)(((zq_0)object).e ? 1 : 0);
                                                if (!n4) {
                                                    clazz = ((zq_0)object).c;
                                                    jSONObject.put((String)object5, (Object)clazz);
                                                }
                                                break block18;
                                            }
                                            lz3_02.getClass();
                                        }
                                        clazz = ((zq_0)object).c;
                                        jSONObject.put((String)object5, (Object)clazz);
                                        break block18;
                                    }
                                    clazz = ((zq_0)object).c;
                                    jSONObject.put((String)object5, (Object)clazz);
                                }
                                if ((clazz = ((zq_0)object).a()) != null) {
                                    clazz = "advertiser_id";
                                    object2 = ((zq_0)object).a();
                                    jSONObject.put((String)((Object)clazz), object2);
                                    n4 = ((zq_0)object).e ^ true;
                                    object2 = "advertiser_tracking_enabled";
                                    jSONObject.put((String)object2, n4 != 0);
                                }
                                if (n4 = ((zq_0)object).e) break block22;
                                clazz = com.facebook.appevents.j.a;
                                clazz = com.facebook.appevents.j.class;
                                n3 = td0.b(clazz);
                                if (n3 != 0) break block23;
                                try {
                                    object2 = com.facebook.appevents.j.c;
                                    n3 = ((AtomicBoolean)object2).get();
                                    object5 = com.facebook.appevents.j.a;
                                    if (n3 != 0) break block12;
                                    ((com.facebook.appevents.j)object5).b();
                                }
                                catch (Throwable throwable2) {
                                    break block13;
                                }
                            }
                            object2 = new HashMap();
                            object4 = com.facebook.appevents.j.d;
                            ((HashMap)object2).putAll(object4);
                            object5 = ((com.facebook.appevents.j)object5).a();
                            ((HashMap)object2).putAll(object5);
                            clazz = lz3_0.E((Map)object2);
                            break block24;
                        }
                        td0.a(clazz, throwable2);
                    }
                    n4 = 0;
                    clazz = null;
                }
                n3 = ((String)((Object)clazz)).length();
                if (n3 != 0) {
                    object2 = "ud";
                    jSONObject.put((String)object2, (Object)clazz);
                }
            }
            if ((object = ((zq_0)object).d) != null) {
                clazz = "installer_package";
                jSONObject.put((String)((Object)clazz), object);
            }
        }
        object = Fo.b.a();
        clazz = "campaign_ids";
        if (object != null && (n3 = td0.b(object)) == 0) {
            object2 = "key";
            try {
                Intrinsics.checkNotNullParameter(clazz, (String)object2);
                object2 = ((Fo)object).a();
                object3 = object2.getString((String)((Object)clazz), null);
            }
            catch (Throwable throwable) {
                td0.a(object, throwable);
            }
        }
        if (object3 != null) {
            jSONObject.put((String)((Object)clazz), object3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void N(Context var0, JSONObject var1_1) {
        block84: {
            var2_2 = "mounted";
            Intrinsics.checkNotNullParameter(var1_1, "params");
            Intrinsics.checkNotNullParameter(var0, "appContext");
            var3_3 = new JSONArray();
            var3_3.put((Object)"a2");
            var4_4 = lz3_0.a;
            var4_4.getClass();
            var5_5 = lz3_0.c;
            var7_6 = -1;
            var9_7 = 0.0 / 0.0;
            var11_8 = 0;
            var12_9 /* !! */  = var5_5 == var7_6 ? 0 : (var5_5 < var7_6 ? -1 : 1);
            if (var12_9 /* !! */  == false) break block84;
            var5_5 = System.currentTimeMillis();
            var7_6 = lz3_0.c;
            var5_5 -= var7_6;
            var7_6 = 1800000L;
            var9_7 = 8.89318E-318;
            var12_9 /* !! */  = (long)(var5_5 == var7_6 ? 0 : (var5_5 < var7_6 ? -1 : 1));
            if (var12_9 /* !! */  < 0) ** GOTO lbl116
        }
        lz3_0.c = var5_5 = System.currentTimeMillis();
        var4_4 = TimeZone.getDefault();
        var13_10 = new Date();
        var14_11 = var4_4.inDaylightTime((Date)var13_10);
        var13_10 = var4_4.getDisplayName(var14_11, 0);
        var15_12 = "tz.getDisplayName(tz.inD\u2026(Date()), TimeZone.SHORT)";
        Intrinsics.checkNotNullExpressionValue(var13_10, (String)var15_12);
        lz3_0.f = var13_10;
        var4_4 = var4_4.getID();
        var13_10 = "tz.id";
        try {
            Intrinsics.checkNotNullExpressionValue(var4_4, (String)var13_10);
            lz3_0.g = var4_4;
        }
        catch (AssertionError | Exception v0) {}
        var4_4 = lz3_0.h;
        var13_10 = "NoCarrier";
        var16_13 = Intrinsics.areEqual(var4_4, var13_10);
        if (var16_13 != '\u0000') {
            var4_4 = "phone";
            var4_4 = var0.getSystemService((String)var4_4);
            var13_10 = "null cannot be cast to non-null type android.telephony.TelephonyManager";
            Intrinsics.checkNotNull(var4_4, (String)var13_10);
            var4_4 = (TelephonyManager)var4_4;
            var4_4 = var4_4.getNetworkOperatorName();
            var13_10 = "telephonyManager.networkOperatorName";
            Intrinsics.checkNotNullExpressionValue(var4_4, (String)var13_10);
            lz3_0.h = var4_4;
        }
lbl62:
        // 4 sources

        while (true) {
            var5_5 = 4742290407621132288L;
            var17_14 = 1.073741824E9;
            var15_12 = Environment.getExternalStorageState();
            var19_15 = Intrinsics.areEqual(var2_2, var15_12);
            if (var19_15 == 0) ** GOTO lbl84
            var15_12 = Environment.getExternalStorageDirectory();
            var15_12 = var15_12.getPath();
            var20_16 = new StatFs((String)var15_12);
            var19_15 = var20_16.getBlockCount();
            var21_17 = var19_15;
            var19_15 = var20_16.getBlockSize();
            var7_6 = var19_15;
            var21_17 *= var7_6;
            lz3_0.d = var21_17;
lbl84:
            // 2 sources

            var7_6 = lz3_0.d;
            var9_7 = (double)var7_6 / var17_14;
            var7_6 = Math.round(var9_7);
            lz3_0.d = var7_6;
lbl90:
            // 2 sources

            while (true) {
                var15_12 = Environment.getExternalStorageState();
                var23_18 = Intrinsics.areEqual(var2_2, var15_12);
                if (var23_18 == 0) ** GOTO lbl110
                var2_2 = Environment.getExternalStorageDirectory();
                var2_2 = var2_2.getPath();
                var15_12 = new StatFs((String)var2_2);
                var23_18 = var15_12.getAvailableBlocks();
                var21_17 = var23_18;
                var23_18 = var15_12.getBlockSize();
                var7_6 = var23_18;
                var21_17 *= var7_6;
                lz3_0.e = var21_17;
lbl110:
                // 2 sources

                var7_6 = lz3_0.e;
                var9_7 = (double)var7_6 / var17_14;
                var5_5 = Math.round(var9_7);
                lz3_0.e = var5_5;
lbl116:
                // 3 sources

                while (true) {
                    block82: {
                        var2_2 = var0.getPackageName();
                        var16_13 = '\uffffffff';
                        var13_10 = var0.getPackageManager();
                        var13_10 = var13_10.getPackageInfo((String)var2_2, 0);
                        if (var13_10 != null) break block82;
                        return;
                    }
                    var16_13 = var13_10.versionCode;
                    var13_10 = var13_10.versionName;
                    lz3_0.i = var13_10;
lbl132:
                    // 2 sources

                    while (true) {
                        block85: {
                            var3_3.put(var2_2);
                            var3_3.put((int)var16_13);
                            var2_2 = lz3_0.i;
                            var3_3.put(var2_2);
                            var2_2 = Build.VERSION.RELEASE;
                            var3_3.put(var2_2);
                            var2_2 = Build.MODEL;
                            var3_3.put(var2_2);
                            var2_2 = var0.getResources();
                            var2_2 = var2_2.getConfiguration();
                            try {
                                var2_2 = var2_2.locale;
                            }
                            catch (Exception v1) {
                                var2_2 = Locale.getDefault();
                            }
                            lz3_0.j = var2_2;
                            var2_2 = new StringBuilder();
                            var4_4 = lz3_0.j;
                            var14_11 = false;
                            var13_10 = null;
                            if (var4_4 != null) {
                                var4_4 = var4_4.getLanguage();
                            } else {
                                var16_13 = '\u0000';
                                var4_4 = null;
                            }
                            var15_12 = "";
                            if (var4_4 == null) {
                                var4_4 = var15_12;
                            }
                            var2_2.append((String)var4_4);
                            var16_13 = '_';
                            var2_2.append(var16_13);
                            var4_4 = lz3_0.j;
                            if (var4_4 != null) {
                                var4_4 = var4_4.getCountry();
                            } else {
                                var16_13 = '\u0000';
                                var4_4 = null;
                            }
                            if (var4_4 != null) {
                                var15_12 = var4_4;
                            }
                            var2_2.append((String)var15_12);
                            var2_2 = var2_2.toString();
                            var3_3.put(var2_2);
                            var2_2 = lz3_0.f;
                            var3_3.put(var2_2);
                            var2_2 = lz3_0.h;
                            var3_3.put(var2_2);
                            var7_6 = 0L;
                            var9_7 = 0.0;
                            var2_2 = "display";
                            var0 = var0.getSystemService((String)var2_2);
                            var23_18 = var0 instanceof DisplayManager;
                            if (var23_18 != 0) {
                                var0 = (DisplayManager)var0;
                            } else {
                                var24_19 = 0;
                                var0 = null;
                                var25_20 = 0.0f;
                            }
                            if (var0 != null) {
                                var13_10 = var0.getDisplay(0);
                            }
                            if (var13_10 == null) break block85;
                            var0 = new DisplayMetrics();
                            var13_10.getMetrics((DisplayMetrics)var0);
                            var23_18 = var0.widthPixels;
                            var11_8 = var0.heightPixels;
                            var25_20 = var0.density;
                            var9_7 = var25_20;
lbl219:
                            // 2 sources

                            while (true) {
                                var24_19 = var11_8;
                                var11_8 = var23_18;
                                ** GOTO lbl230
                                break;
                            }
                            catch (Exception v2) {
                                var11_8 = var23_18;
                            }
                        }
lbl226:
                        // 2 sources

                        while (true) {
                            var24_19 = 0;
                            var25_20 = 0.0f;
                            var0 = null;
lbl230:
                            // 2 sources

                            var3_3.put(var11_8);
                            var3_3.put(var24_19);
                            var2_2 = "#.##";
                            var0 = new DecimalFormat((String)var2_2);
                            var0 = var0.format(var9_7);
                            var3_3.put(var0);
                            var24_19 = lz3_0.b;
                            if (var24_19 <= 0) {
                                block83: {
                                    var2_2 = "/sys/devices/system/cpu/";
                                    try {
                                        var0 = new File((String)var2_2);
                                    }
                                    catch (Exception v3) {}
                                    var2_2 = new Object();
                                    var0 = var0.listFiles((FilenameFilter)var2_2);
                                    if (var0 == null) break block83;
                                    var24_19 = ((Object)var0).length;
                                    lz3_0.b = var24_19;
                                }
                                if ((var24_19 = lz3_0.b) <= 0) {
                                    var0 = Runtime.getRuntime();
                                    var24_19 = var0.availableProcessors();
                                    var23_18 = 1;
                                    lz3_0.b = var24_19 = Math.max(var24_19, var23_18);
                                }
                                var24_19 = lz3_0.b;
                            }
                            var3_3.put(var24_19);
                            var5_5 = lz3_0.d;
                            var3_3.put(var5_5);
                            var5_5 = lz3_0.e;
                            var3_3.put(var5_5);
                            var0 = lz3_0.g;
                            var3_3.put(var0);
                            var2_2 = var3_3.toString();
                            var1_1.put("extinfo", var2_2);
                            return;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            break;
        }
        catch (Exception v4) {
            ** continue;
        }
        catch (Exception v5) {
            ** continue;
        }
        catch (Exception v6) {
            ** continue;
        }
        catch (PackageManager.NameNotFoundException v7) {
            ** continue;
        }
        catch (Exception v8) {
            ** continue;
        }
        catch (Exception v9) {
            ** continue;
        }
    }

    public static final String O(String object) {
        if (object == null) {
            object = null;
        } else {
            a.getClass();
            Object object2 = Charsets.UTF_8;
            object = ((String)object).getBytes((Charset)object2);
            Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).getBytes(charset)");
            object2 = "SHA-256";
            object = lz3_0.u((String)object2, (byte[])object);
        }
        return object;
    }

    public static final void P(Parcel parcel, Map object) {
        Object object2 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, (String)object2);
        if (object == null) {
            int n3 = -1;
            parcel.writeInt(n3);
        } else {
            int n4 = object.size();
            parcel.writeInt(n4);
            object = object.entrySet().iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (Map.Entry)object.next();
                String string2 = (String)object2.getKey();
                object2 = (String)object2.getValue();
                parcel.writeString(string2);
                parcel.writeString((String)object2);
            }
        }
    }

    public static final boolean a(Object object, Object object2) {
        boolean bl2;
        if (object == null) {
            if (object2 == null) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
        } else {
            bl2 = Intrinsics.areEqual(object, object2);
        }
        return bl2;
    }

    public static final Uri b(Bundle bundle, String object, String string2) {
        Uri.Builder builder = new Uri.Builder();
        Object object2 = "https";
        builder.scheme((String)object2);
        builder.authority((String)object);
        builder.path(string2);
        if (bundle != null) {
            boolean bl2;
            object = bundle.keySet().iterator();
            while (bl2 = object.hasNext()) {
                string2 = (String)object.next();
                object2 = bundle.get(string2);
                boolean bl3 = object2 instanceof String;
                if (!bl3) continue;
                object2 = (String)object2;
                builder.appendQueryParameter(string2, (String)object2);
            }
        }
        bundle = builder.build();
        Intrinsics.checkNotNullExpressionValue(bundle, "builder.build()");
        return bundle;
    }

    public static void c(Context context, String string2) {
        CookieSyncManager.createInstance((Context)context).sync();
        context = CookieManager.getInstance();
        String[] stringArray = context.getCookie(string2);
        if (stringArray == null) {
            return;
        }
        String[] stringArray2 = new String[]{";"};
        int n3 = 6;
        stringArray = StringsKt.a0((CharSequence)stringArray, stringArray2, false, 0, n3);
        stringArray2 = new String[]{};
        for (String string3 : stringArray.toArray(stringArray2)) {
            Object object = new String[]{"="};
            Collection collection = StringsKt.a0(string3, (String[])object, false, 0, n3);
            String[] stringArray3 = collection.toArray((T[])(object = new String[0]));
            int n4 = stringArray3.length;
            if (n4 <= 0) continue;
            object = new StringBuilder();
            String string4 = stringArray3[0];
            int n7 = string4.length();
            int n8 = 1;
            n7 -= n8;
            int n10 = 0;
            boolean bl2 = false;
            while (n10 <= n7) {
                int n14 = !bl2 ? n10 : n7;
                n14 = string4.charAt(n14);
                int n15 = 32;
                n14 = Intrinsics.compare(n14, n15);
                n14 = n14 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n14 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n10;
                    continue;
                }
                if (n14 == 0) break;
                n7 += -1;
            }
            String string5 = ((Object)string4.subSequence(n10, ++n7)).toString();
            ((StringBuilder)object).append(string5);
            ((StringBuilder)object).append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
            String string6 = ((StringBuilder)object).toString();
            context.setCookie(string2, string6);
        }
        context.removeExpiredCookie();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void d(Context context) {
        String string2;
        Object object = "context";
        Intrinsics.checkNotNullParameter(context, (String)object);
        try {
            object = a;
            string2 = "facebook.com";
        }
        catch (Exception exception) {
            return;
        }
        object.getClass();
        lz3_0.c(context, string2);
        object = ".facebook.com";
        lz3_0.c(context, (String)object);
        object = "https://facebook.com";
        lz3_0.c(context, (String)object);
        object = "https://.facebook.com";
        lz3_0.c(context, (String)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static final String f(String string2) {
        boolean bl2 = lz3_0.A(string2);
        if (bl2) {
            string2 = "";
        }
        return string2;
    }

    public static final HashSet g(JSONArray jSONArray) {
        int n3;
        if (jSONArray != null && (n3 = jSONArray.length()) != 0) {
            HashSet<String> hashSet = new HashSet<String>();
            int n4 = jSONArray.length();
            for (int i3 = 0; i3 < n4; ++i3) {
                String string2 = jSONArray.getString(i3);
                String string3 = "jsonArray.getString(i)";
                Intrinsics.checkNotNullExpressionValue(string2, string3);
                hashSet.add(string2);
            }
            return hashSet;
        }
        return null;
    }

    public static final ArrayList h(JSONArray jSONArray) {
        ArrayList<String> arrayList = "jsonArray";
        Intrinsics.checkNotNullParameter(jSONArray, (String)((Object)arrayList));
        arrayList = new ArrayList<String>();
        int n3 = jSONArray.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = jSONArray.getString(i3);
            String string3 = "jsonArray.getString(i)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            try {
                arrayList.add(string2);
                continue;
            }
            catch (JSONException jSONException) {
                arrayList = new ArrayList<String>();
                break;
            }
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    public static final HashMap i(JSONObject var0) {
        Intrinsics.checkNotNullParameter(var0, "jsonObject");
        var1_1 = new HashMap<String, Object>();
        var2_2 = var0.names();
        if (var2_2 == null) {
            return var1_1;
        }
        var3_3 = var2_2.length();
        block8: for (var4_4 = 0; var4_4 < var3_3; ++var4_4) {
            var5_5 = var2_2.getString(var4_4);
            var6_6 = "keys.getString(i)";
            Intrinsics.checkNotNullExpressionValue(var5_5, (String)var6_6);
            var6_6 = var0.get(var5_5);
            var7_7 = var6_6 instanceof JSONObject;
            if (var7_7) {
                var6_6 = (JSONObject)var6_6;
                var6_6 = lz3_0.i((JSONObject)var6_6);
            }
            var8_8 = "value";
            Intrinsics.checkNotNullExpressionValue(var6_6, var8_8);
            var1_1.put(var5_5, var6_6);
lbl27:
            // 2 sources

            continue block8;
        }
        return var1_1;
        catch (JSONException v0) {
            ** continue;
        }
    }

    public static final HashMap j(JSONObject jSONObject) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Iterator iterator = jSONObject.keys();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            String string3 = jSONObject.optString(string2);
            if (string3 == null) continue;
            String string4 = "key";
            Intrinsics.checkNotNullExpressionValue(string2, string4);
            hashMap.put(string2, string3);
        }
        return hashMap;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int k(InputStream inputStream, OutputStream outputStream) {
        void var1_4;
        Object object;
        block8: {
            int n3;
            BufferedInputStream bufferedInputStream;
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            int n4 = 0;
            object = null;
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
                n4 = 8192;
            }
            catch (Throwable throwable) {
                // empty catch block
                break block8;
            }
            try {
                int n8;
                int n7;
                object = new byte[n4];
                n3 = 0;
                while ((n7 = ((InputStream)bufferedInputStream).read((byte[])object)) != (n8 = -1)) {
                    outputStream.write((byte[])object, 0, n7);
                    n3 += n7;
                }
            }
            catch (Throwable throwable) {
                object = bufferedInputStream;
                break block8;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return n3;
        }
        if (object != null) {
            ((BufferedInputStream)object).close();
        }
        if (inputStream != null) {
            inputStream.close();
        }
        throw var1_4;
    }

    public static final void l(URLConnection uRLConnection) {
        boolean bl2;
        if (uRLConnection != null && (bl2 = uRLConnection instanceof HttpURLConnection)) {
            uRLConnection = (HttpURLConnection)uRLConnection;
            ((HttpURLConnection)uRLConnection).disconnect();
        }
    }

    public static final String m(Context object) {
        if (object == null) {
            object = "null";
        } else {
            Object object2 = object.getApplicationContext();
            if (object == object2) {
                object = "unknown";
            } else {
                object = object.getClass().getSimpleName();
                object2 = "{\n      context.javaClass.simpleName\n    }";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            }
        }
        return object;
    }

    public static final String n(Context object) {
        int n3;
        Object object2;
        block10: {
            block9: {
                object2 = "context";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = FacebookSdk.a;
                Xz3.h();
                object2 = FacebookSdk.f;
                if (object2 == null) break block9;
                return object2;
            }
            object2 = object.getApplicationInfo();
            n3 = ((ApplicationInfo)object2).labelRes;
            if (n3 != 0) break block10;
            object = ((ApplicationInfo)object2).nonLocalizedLabel;
            object = object.toString();
        }
        object = object.getString(n3);
        object2 = "context.getString(stringId)";
        try {
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        }
        catch (Exception exception) {
            object = "";
        }
        return object;
    }

    public static final Date o(Bundle object, String string2, Date date) {
        block11: {
            long l2;
            Date date2;
            block10: {
                boolean bl2;
                block9: {
                    Intrinsics.checkNotNullParameter(date, "dateBase");
                    date2 = null;
                    if (object == null) {
                        return null;
                    }
                    bl2 = (object = object.get(string2)) instanceof Long;
                    if (!bl2) break block9;
                    object = (Number)object;
                    l2 = ((Number)object).longValue();
                    break block10;
                }
                bl2 = object instanceof String;
                if (!bl2) break block11;
                try {
                    object = (String)object;
                }
                catch (NumberFormatException numberFormatException) {}
                l2 = Long.parseLong((String)object);
            }
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) {
                long l7 = Long.MAX_VALUE;
                object = new Date(l7);
            } else {
                long l8 = date.getTime();
                long l12 = 1000L;
                l2 = l2 * l12 + l8;
                date2 = new Date(l2);
                object = date2;
            }
            return object;
        }
        return null;
    }

    public static final JSONObject p() {
        Throwable throwable2;
        Class<lz3_0> clazz;
        block9: {
            block8: {
                String string2;
                Object object;
                clazz = lz3_0.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                try {
                    object = FacebookSdk.a();
                    string2 = "com.facebook.sdk.DataProcessingOptions";
                }
                catch (Throwable throwable2) {}
                object = object.getSharedPreferences(string2, 0);
                string2 = "data_processing_options";
                object = object.getString(string2, null);
                if (object == null) break block8;
                try {
                    string2 = new JSONObject((String)object);
                    return string2;
                }
                catch (JSONException jSONException) {}
                break block9;
            }
            return null;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    public static final void q(lz3$a object, String object2) {
        Object object3 = "accessToken";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object, "callback");
        Object object4 = gb2_0.a;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = (JSONObject)gb2_0.a.get(object2);
        if (object3 != null) {
            object.a((JSONObject)object3);
            return;
        }
        object3 = new jz3((lz3$a)object, (String)object2);
        a.getClass();
        object = new Bundle();
        object4 = AccessToken.l;
        object4 = AccessToken$b.b();
        if (object4 == null || (object4 = ((AccessToken)object4).k) == null) {
            object4 = "facebook";
        }
        String string2 = "instagram";
        boolean bl2 = Intrinsics.areEqual(object4, string2);
        object4 = bl2 ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
        object.putString("fields", (String)object4);
        object.putString("access_token", (String)object2);
        object2 = GraphRequest.j;
        object2 = GraphRequest$c.h(null, null);
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        ((GraphRequest)object2).d = object;
        object = Qa1.GET;
        ((GraphRequest)object2).k((Qa1)((Object)object));
        ((GraphRequest)object2).j((GraphRequest$b)object3);
        ((GraphRequest)object2).d();
    }

    /*
     * WARNING - void declaration
     */
    public static final Method r(Class genericDeclaration, String string2, Class ... classArray) {
        void var0_3;
        Object[] objectArray;
        void var1_4;
        Intrinsics.checkNotNullParameter(genericDeclaration, "clazz");
        Intrinsics.checkNotNullParameter(var1_4, "methodName");
        String string3 = "parameterTypes";
        Intrinsics.checkNotNullParameter(objectArray, string3);
        int n3 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n3);
        objectArray = (Class[])objectArray;
        try {
            Method method = ((Class)genericDeclaration).getMethod((String)var1_4, (Class<?>[])objectArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Object var0_2 = null;
        }
        return var0_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Method s(String genericDeclaration, String string2, Class ... classArray) {
        Intrinsics.checkNotNullParameter(genericDeclaration, "className");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        String string3 = "parameterTypes";
        Intrinsics.checkNotNullParameter(classArray, string3);
        try {
            genericDeclaration = Class.forName(genericDeclaration);
            string3 = "clazz";
            Intrinsics.checkNotNullExpressionValue(genericDeclaration, string3);
            int n3 = classArray.length;
            classArray = Arrays.copyOf(classArray, n3);
            return lz3_0.r(genericDeclaration, string2, classArray);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    public static final Object t(String object, String string2, JSONObject jSONObject) {
        boolean bl2;
        String string3 = "jsonObject";
        Intrinsics.checkNotNullParameter(jSONObject, string3);
        object = jSONObject.opt((String)object);
        if (object != null && (bl2 = object instanceof String)) {
            object = (String)object;
            jSONObject = new JSONTokener((String)object);
            object = jSONObject.nextValue();
        }
        if (object != null && !(bl2 = object instanceof JSONObject) && !(bl2 = object instanceof JSONArray)) {
            if (string2 != null) {
                jSONObject = new JSONObject();
                jSONObject.putOpt(string2, object);
                object = jSONObject;
            } else {
                object = new FacebookException("Got an unexpected non-JSON object.");
                throw object;
            }
        }
        return object;
    }

    public static String u(String object, byte[] object2) {
        try {
            object = MessageDigest.getInstance((String)object);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(object, "hash");
        ((MessageDigest)object).update((byte[])object2);
        object = ((MessageDigest)object).digest();
        object2 = new StringBuilder;
        ((StringBuilder)object2)();
        String string2 = "digest";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        for (Object object3 : object) {
            int n3 = object3 >> 4 & 0xF;
            String string3 = Integer.toHexString(n3);
            ((StringBuilder)object2).append(string3);
            object3 = object3 & 0xF;
            String string4 = Integer.toHexString((int)object3);
            ((StringBuilder)object2).append(string4);
        }
        object = ((StringBuilder)object2).toString();
        Intrinsics.checkNotNullExpressionValue(object, "builder.toString()");
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Object v(Object object, Method method, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        Object object2 = null;
        int n3 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n3);
        try {
            return method.invoke(object, objectArray);
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean w() {
        boolean bl2 = true;
        try {
            boolean bl3;
            Object object = "android.intent.action.VIEW";
            Object object2 = new Intent((String)object);
            object = StringCompanionObject.INSTANCE;
            object = "fb%s://applinks";
            Object object3 = FacebookSdk.b();
            Object[] objectArray = new Object[bl2];
            objectArray[0] = object3;
            object3 = Arrays.copyOf(objectArray, (int)(bl2 ? 1 : 0));
            object = String.format((String)object, (Object[])object3);
            object3 = "format(format, *args)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            object = Uri.parse((String)object);
            object2.setData((Uri)object);
            object = FacebookSdk.a();
            object3 = object.getPackageManager();
            object = object.getPackageName();
            int n3 = 65536;
            object2 = object3.queryIntentActivities((Intent)object2, n3);
            object3 = "packageManager.queryInte\u2026nager.MATCH_DEFAULT_ONLY)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            object2 = object2.iterator();
            while (bl3 = object2.hasNext()) {
                object3 = object2.next();
                object3 = (ResolveInfo)object3;
                object3 = object3.activityInfo;
                object3 = object3.packageName;
                bl3 = Intrinsics.areEqual(object, object3);
                if (!bl3) continue;
                return bl2;
            }
            return false;
        }
        catch (Exception exception) {}
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean x(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 27;
        if (n3 >= n4) {
            PackageManager packageManager = object.getPackageManager();
            object2 = "android.hardware.type.pc";
            return packageManager.hasSystemFeature((String)object2);
        }
        String string2 = Build.DEVICE;
        if (string2 == null) return false;
        Intrinsics.checkNotNullExpressionValue(string2, "DEVICE");
        String string3 = ".+_cheets|cheets_.+";
        object2 = new Regex(string3);
        boolean bl2 = ((Regex)object2).c(string2);
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean y() {
        Class<lz3_0> clazz = lz3_0.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return false;
        }
        try {
            JSONObject jSONObject = lz3_0.p();
            if (jSONObject == null) {
                return false;
            }
            String string2 = "data_processing_options";
            try {
                String string3;
                jSONObject = jSONObject.getJSONArray(string2);
                int n3 = jSONObject.length();
                for (int i3 = 0; i3 < n3; string3 = string3.toLowerCase(), ++i3) {
                    string3 = jSONObject.getString(i3);
                    String string4 = "options.getString(i)";
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    string4 = "this as java.lang.String).toLowerCase()";
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    string4 = "ldu";
                    boolean bl3 = Intrinsics.areEqual(string3, string4);
                    if (!bl3) continue;
                    return true;
                }
                return false;
            }
            catch (Exception exception) {}
            return false;
        }
        catch (Throwable throwable22222) {}
        td0.a(clazz, throwable22222);
        return false;
    }

    public static boolean z(Context object) {
        boolean bl2;
        boolean bl3 = true;
        Object object2 = new Class[bl3];
        object2[0] = Context.class;
        String string2 = "com.google.android.gms.common.GooglePlayServicesUtil";
        Object[] objectArray = "isGooglePlayServicesAvailable";
        if ((object2 = lz3_0.s(string2, (String)objectArray, object2)) == null) {
            return false;
        }
        string2 = null;
        objectArray = new Object[bl3];
        objectArray[0] = object;
        object = lz3_0.v(null, (Method)object2, objectArray);
        boolean bl4 = object instanceof Integer;
        if (!bl4 || !(bl2 = Intrinsics.areEqual(object, object2 = Integer.valueOf(0)))) {
            bl3 = false;
        }
        return bl3;
    }
}


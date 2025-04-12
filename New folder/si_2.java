/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothAdapter
 *  android.content.Context
 *  android.database.sqlite.SQLiteException
 *  android.net.ConnectivityManager
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from sI
 */
public final class si_2 {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject a(mp0_0 var0, E80 var1_1, boolean var2_2, boolean var3_3) {
        var4_4 = new JSONObject();
        var1_1.getClass();
        var5_5 = new StringBuilder();
        var6_6 = var0.e().b;
        var5_5.append(var6_6);
        var7_7 = "";
        var5_5.append(var7_7);
        var5_5 = var5_5.toString();
        var4_4.put("Build", var5_5);
        var5_5 = var0.e().m;
        var4_4.put("Version", var5_5);
        var5_5 = var0.e().k;
        var4_4.put("OS Version", var5_5);
        var5_5 = var0.e();
        var8_8 = var5_5.l;
        var4_4.put("SDK Version", (int)var8_8);
        var9_9 = var0.i();
        if (var9_9 != null) {
            var9_9 = "GoogleAdID";
            if (var3_3) {
                var9_9 = "mt_GoogleAdID";
            }
            var10_10 = var0.i();
            var4_4.put((String)var9_9, var10_10);
            var10_10 = "GoogleAdIDLimit";
            var9_9 = var0.a;
            synchronized (var9_9) {
                var8_8 = var0.i;
            }
            var4_4.put((String)var10_10, var8_8);
        }
        var10_10 = "Make";
        var9_9 = var0.e();
        var9_9 = var9_9.g;
        var4_4.put((String)var10_10, var9_9);
        var10_10 = "Model";
        var9_9 = var0.e();
        var9_9 = var9_9.h;
        var4_4.put((String)var10_10, var9_9);
        var10_10 = "Carrier";
        var9_9 = var0.e();
        var9_9 = var9_9.c;
        var4_4.put((String)var10_10, var9_9);
        var10_10 = "useIP";
        var4_4.put((String)var10_10, var2_2);
        var10_10 = "OS";
        var9_9 = var0.e();
        var9_9 = var9_9.j;
        var4_4.put((String)var10_10, var9_9);
        var10_10 = "wdt";
        var9_9 = var0.e();
        var11_11 = var9_9.n;
        var4_4.put((String)var10_10, var11_11);
        var10_10 = "hgt";
        var9_9 = var0.e();
        var11_11 = var9_9.f;
        var4_4.put((String)var10_10, var11_11);
        var10_10 = "dpi";
        var9_9 = var0.e();
        var13_12 = var9_9.e;
        var4_4.put((String)var10_10, var13_12);
        var10_10 = "dt";
        var9_9 = var0.e;
        var13_12 = mp0_0.h((Context)var9_9);
        var4_4.put((String)var10_10, var13_12);
        var10_10 = "locale";
        var13_12 = 0;
        var9_9 = null;
        var8_8 = TextUtils.isEmpty(null);
        if (var8_8) {
            var5_5 = var0.e();
            var5_5 = var5_5.q;
        } else {
            var8_8 = false;
            var5_5 = null;
        }
        var4_4.put((String)var10_10, var5_5);
        var3_3 = Build.VERSION.SDK_INT;
        var8_8 = 28 != 0;
        if (var3_3 >= var8_8) {
            var10_10 = "abckt";
            var5_5 = var0.e();
            var5_5 = var5_5.o;
            var4_4.put((String)var10_10, var5_5);
        }
        var10_10 = var0.e;
        var10_10 = hg1_1.b((Context)var10_10);
        var10_10.getClass();
        b.j();
        var10_10 = hg1_1.s;
        var8_8 = TextUtils.isEmpty((CharSequence)var10_10);
        if (!var8_8) {
            var5_5 = "proxyDomain";
            var4_4.put((String)var5_5, var10_10);
        }
        var10_10 = var0.e;
        var10_10 = hg1_1.b((Context)var10_10);
        var10_10.getClass();
        b.j();
        var10_10 = hg1_1.t;
        var8_8 = TextUtils.isEmpty((CharSequence)var10_10);
        if (!var8_8) {
            var5_5 = "spikyProxyDomain";
            var4_4.put((String)var5_5, var10_10);
        }
        var10_10 = var0.e;
        var10_10 = hg1_1.b((Context)var10_10);
        var3_3 = var10_10.e;
        var8_8 = true;
        if (var3_3) {
            var10_10 = "sslpin";
            var4_4.put((String)var10_10, var8_8);
        }
        var10_10 = var0.e;
        var10_10 = hg1_1.b((Context)var10_10);
        var10_10 = var10_10.h;
        var3_3 = TextUtils.isEmpty((CharSequence)var10_10);
        if (!var3_3) {
            var10_10 = "fcmsid";
            var4_4.put((String)var10_10, var8_8);
        }
        var10_10 = var0.e();
        var10_10 = var10_10.d;
        if (var10_10 != null && (var6_6 = (int)var10_10.equals(var7_7 = "")) == 0) {
            var7_7 = "cc";
            var4_4.put(var7_7, var10_10);
        }
        if (!var2_2) ** GOTO lbl193
        var10_10 = var0.e;
        var14_13 = "android.permission.ACCESS_NETWORK_STATE";
        var2_2 = var10_10.checkCallingOrSelfPermission((String)var14_13);
        if (var2_2) ** GOTO lbl-1000
        var14_13 = "connectivity";
        var14_13 = var10_10.getSystemService((String)var14_13);
        if ((var14_13 = (ConnectivityManager)var14_13) != null) {
            if ((var14_13 = var14_13.getActiveNetworkInfo()) == null || (var3_3 = var14_13.getType()) != var8_8 || !(var2_2 = var14_13.isConnected())) {
                var8_8 = false;
                var5_5 = null;
            }
            var14_13 = var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = false;
            var14_13 = null;
        }
        if (var14_13 != null) {
            var10_10 = "wifi";
            var4_4.put((String)var10_10, var14_13);
        }
        var14_13 = var0.e;
        try {
            var10_10 = var14_13.getPackageManager();
            var5_5 = "android.permission.BLUETOOTH";
            var14_13 = var14_13.getPackageName();
            var2_2 = var10_10.checkPermission((String)var5_5, (String)var14_13);
            if (!var2_2 && (var14_13 = BluetoothAdapter.getDefaultAdapter()) != null) {
                var2_2 = var14_13.isEnabled();
                var9_9 = var2_2;
            }
        }
        catch (Throwable v0) {}
        if (var9_9 == null) ** GOTO lbl181
        var14_13 = "BluetoothEnabled";
        try {
            var4_4.put((String)var14_13, var9_9);
lbl181:
            // 2 sources

            var14_13 = var0.e();
            var14_13 = var14_13.a;
            if (var14_13 != null) {
                var10_10 = "BluetoothVersion";
                var4_4.put((String)var10_10, var14_13);
            }
            var14_13 = var0.e();
            var14_13 = var14_13.i;
            if (var14_13 != null) {
                var10_10 = "Radio";
                var4_4.put((String)var10_10, var14_13);
            }
lbl193:
            // 4 sources

            var14_13 = "LIAMC";
            var0 = var0.e();
            var15_14 = var0.p;
            var4_4.put((String)var14_13, var15_14);
            var0 = var1_1.o;
            var0 = var0.entrySet();
            var0 = var0.iterator();
            while (var16_15 = var0.hasNext()) {
                var1_1 = var0.next();
                var1_1 = (Map.Entry)var1_1;
                var14_13 = var1_1.getKey();
                var14_13 = (String)var14_13;
                var1_1 = var1_1.getValue();
                var4_4.put((String)var14_13, var1_1);
            }
            return var4_4;
        }
        catch (Throwable v1) {}
        return var4_4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JSONObject b(da3_1 object) {
        int n3;
        JSONObject jSONObject = new JSONObject();
        String string2 = "c";
        try {
            n3 = ((da3_1)object).a;
        }
        catch (JSONException jSONException) {
            return jSONObject;
        }
        jSONObject.put(string2, n3);
        string2 = "d";
        object = ((da3_1)object).b;
        jSONObject.put(string2, object);
        return jSONObject;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONArray c(mh0_0 mh0_02) {
        Object object;
        Object object2;
        int n3;
        block20: {
            synchronized (mh0_02) {
                Object object3;
                block18: {
                    Throwable throwable2222;
                    block19: {
                        int n4;
                        block17: {
                            boolean bl2 = mh0_02.d;
                            n3 = 0;
                            if (bl2) break block17;
                            object2 = new String[]{};
                            break block20;
                        }
                        object2 = ci3_1.PUSH_NOTIFICATIONS;
                        object = ((ci3_1)((Object)object2)).getTableName();
                        object2 = new ArrayList();
                        object3 = mh0_02.c;
                        object3 = object3.getReadableDatabase();
                        String string2 = "isRead = 0";
                        b b2 = null;
                        object3 = object3.query((String)object, null, string2, null, null, null, null);
                        if (object3 == null) break block18;
                        try {
                            while ((n4 = object3.moveToNext()) != 0) {
                                object = "data";
                                n4 = object3.getColumnIndex((String)object);
                                if (n4 < 0) continue;
                                object = object3.getString(n4);
                                b2 = mh0_02.b;
                                b2.a();
                                ((ArrayList)object2).add(object);
                            }
                        }
                        catch (Throwable throwable2222) {
                            break block19;
                        }
                        object = Unit.a;
                        n4 = 0;
                        object = null;
                        xj3_1.b((Closeable)object3, null);
                        break block18;
                    }
                    try {
                        throw throwable2222;
                    }
                    catch (Throwable throwable3) {
                        try {
                            xj3_1.b((Closeable)object3, throwable2222);
                            throw throwable3;
                        }
                        catch (Throwable throwable4) {}
                        throw throwable4;
                        catch (SQLiteException sQLiteException) {}
                    }
                    object3 = mh0_02.b;
                    object3.getClass();
                    b.n();
                }
                object3 = new String[]{};
                object2 = ((ArrayList)object2).toArray((T[])object3);
                object3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (String[])object2;
            }
        }
        mh0_02 = new JSONArray();
        int n7 = ((Object)object2).length;
        while (n3 < n7) {
            object = object2[n3];
            b.j();
            mh0_02.put(object);
            ++n3;
        }
        return mh0_02;
    }

    public static JSONObject d(String string2, b b2, String string3) {
        Object object;
        block5: {
            if (string2 != null) {
                try {
                    object = new JSONObject(string2);
                    break block5;
                }
                catch (Throwable throwable) {
                    String string4 = "Error reading guid cache: ";
                    object = new StringBuilder(string4);
                    String string5 = throwable.toString();
                    ((StringBuilder)object).append(string5);
                    string5 = ((StringBuilder)object).toString();
                    b2.b(string3, string5);
                }
            }
            object = null;
        }
        if (object == null) {
            object = new JSONObject();
        }
        return object;
    }
}


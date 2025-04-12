/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
import android.net.Uri;
import com.clevertap.android.sdk.b;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ge0
 */
public final class ge0_0 {
    public final le0_1 a;
    public final String b;
    public String c;
    public String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final b i;
    public final String j;
    public final Map k;
    public final Map l;
    public final String m;
    public int n;

    public ge0_0(ix3 ix32, String string2, String string3, String string4, String string5, String string6, String string7, String pairArray, String pairArray2, String string8, b b2, String string9) {
        Object object = ix32;
        Pair[] pairArray3 = pairArray;
        Object object2 = pairArray2;
        Object object3 = string8;
        Object object4 = b2;
        Object object5 = string9;
        int n3 = 2;
        int n4 = 1;
        int n7 = 3;
        Intrinsics.checkNotNullParameter(ix32, "httpClient");
        String string10 = "clevertap-prod.com";
        Intrinsics.checkNotNullParameter(string10, "defaultDomain");
        Intrinsics.checkNotNullParameter(pairArray, "accountId");
        Intrinsics.checkNotNullParameter(pairArray2, "accountToken");
        Intrinsics.checkNotNullParameter(string8, "sdkVersion");
        Intrinsics.checkNotNullParameter(b2, "logger");
        Intrinsics.checkNotNullParameter(string9, "logTag");
        this.a = ix32;
        this.b = string10;
        object = string2;
        this.c = string2;
        object = string3;
        this.d = string3;
        object = string4;
        this.e = string4;
        object = string5;
        this.f = string5;
        object = string6;
        this.g = string6;
        object = string7;
        this.h = string7;
        this.i = b2;
        this.j = string9;
        object = new Pair("Content-Type", "application/json; charset=utf-8");
        object4 = new Pair("X-CleverTap-Account-ID", pairArray);
        object5 = new Pair("X-CleverTap-Token", pairArray2);
        object2 = new Pair[n7];
        object2[0] = object;
        object2[n4] = object4;
        object2[n3] = object5;
        this.k = object = fh1_2.i(object2);
        object = new Pair("os", "Android");
        super("t", string8);
        object3 = new Pair("z", pairArray);
        pairArray3 = new Pair[n7];
        pairArray3[0] = object;
        pairArray3[n4] = object2;
        pairArray3[n3] = object3;
        this.l = object = fh1_2.i(pairArray3);
        this.m = "-spiky";
    }

    public final jj2_0 a(String string2, String object, String string3, boolean bl2, Map map2) {
        boolean bl3;
        Object object2 = new Uri.Builder();
        String string4 = "https";
        object2 = object2.scheme(string4);
        string2 = object2.authority(string2).appendPath((String)object);
        Intrinsics.checkNotNullExpressionValue(string2, "Builder()\n            .s\u2026 .appendPath(relativeUrl)");
        object = this.l.entrySet().iterator();
        while (bl3 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            string4 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            string2.appendQueryParameter(string4, (String)object2);
        }
        if (bl2) {
            int n3;
            long l2 = System.currentTimeMillis();
            long l3 = 1000;
            this.n = n3 = (int)(l2 /= l3);
            object = String.valueOf(n3);
            object = string2.appendQueryParameter("ts", (String)object);
            String string5 = "appendQueryParameter(\"ts\u2026estampSeconds.toString())";
            Intrinsics.checkNotNullExpressionValue(object, string5);
        }
        string2 = string2.build();
        Intrinsics.checkNotNullExpressionValue(string2, "builder.build()");
        jj2_0 jj2_02 = new jj2_0((Uri)string2, map2, string3);
        return jj2_02;
    }

    public final String b(boolean bl2) {
        String string2 = this.e;
        boolean bl3 = qi_2.e(string2);
        if (bl3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            String string3 = bl2 ? this.m : "";
            stringBuilder.append(string3);
            stringBuilder.append(".");
            string3 = this.b;
            stringBuilder.append(string3);
            string3 = stringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "StringBuilder().apply(builderAction).toString()");
            return string3;
        }
        string2 = bl2 ? this.g : this.f;
        bl3 = qi_2.e(string2);
        if (bl3) {
            return string2;
        }
        String string4 = bl2 ? this.d : this.c;
        return string4;
    }

    /*
     * Unable to fully structure code
     */
    public final el2_1 c(boolean var1_1) {
        var2_2 = this.e;
        var3_3 = qi_2.e((String)var2_2);
        var4_4 = this.h;
        var5_5 = this.b;
        if (var3_3) {
            var2_2 = Ex0.a((String)var2_2);
            var6_6 = var1_1 != false ? this.m : "";
            var2_2.append((String)var6_6);
            var2_2.append(".");
            var2_2.append(var5_5);
            var5_5 = var2_2.toString();
            var6_6 = "StringBuilder().apply(builderAction).toString()";
            Intrinsics.checkNotNullExpressionValue(var5_5, (String)var6_6);
            while (true) {
                var7_7 = var5_5;
                break;
            }
        } else {
            var2_2 = var1_1 != false ? this.g : this.f;
            var3_3 = qi_2.e((String)var2_2);
            if (var3_3) {
                var7_7 = var2_2;
            } else {
                var8_8 = qi_2.e(var4_4);
                if (var8_8) {
                    Intrinsics.checkNotNull(var4_4);
                    var7_7 = var4_4;
                } else {
                    if (!(var8_8 = qi_2.e((String)(var6_6 = var1_1 != false ? this.d : this.c)))) ** continue;
                    var7_7 = var6_6;
                }
            }
        }
        var1_1 = qi_2.e(var4_4);
        var2_2 = this.k;
        if (var1_1 && (var1_1 = Intrinsics.areEqual(var7_7, var4_4))) {
            Intrinsics.checkNotNull(var4_4);
            var9_9 = "X-CleverTap-Handshake-Domain";
            var6_6 = new Pair(var9_9, var4_4);
            var10_10 = var6_6 = fh1_2.l((Map)var2_2, (Pair)var6_6);
        } else {
            var10_10 = var2_2;
        }
        var6_6 = this.a((String)var7_7, "hello", null, false, (Map)var10_10);
        var2_2 = new StringBuilder("Performing handshake with ");
        var9_9 = var6_6.a;
        var2_2.append(var9_9);
        var2_2 = var2_2.toString();
        var9_9 = this.i;
        var4_4 = this.j;
        var9_9.b(var4_4, (String)var2_2);
        return this.a.a((jj2_0)var6_6);
    }
}


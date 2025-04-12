/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.facebook;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$c;
import com.facebook.d;
import com.facebook.e;
import com.facebook.f;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

public final class GraphRequest {
    public static final String j;
    public static final Pattern k;
    public static volatile String l;
    public final AccessToken a;
    public final String b;
    public JSONObject c;
    public Bundle d;
    public Object e;
    public final String f;
    public GraphRequest$b g;
    public Qa1 h;
    public boolean i;

    static {
        Object object = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).toCharArray()");
        StringBuilder stringBuilder = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int n3 = secureRandom.nextInt(11) + 30;
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2 = ((char[])object).length;
            c2 = secureRandom.nextInt(c2);
            c2 = object[c2];
            stringBuilder.append(c2);
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "buffer.toString()");
        j = object;
        k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest() {
        this(null, null, null, null, null, 63);
    }

    public GraphRequest(AccessToken object, String string2, Bundle bundle, Qa1 qa1, GraphRequest$b graphRequest$b, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            object = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            bundle = null;
        }
        if ((n4 = n3 & 8) != 0) {
            qa1 = null;
        }
        if ((n3 &= 0x10) != 0) {
            graphRequest$b = null;
        }
        this.a = object;
        this.b = string2;
        this.f = null;
        this.j(graphRequest$b);
        this.k(qa1);
        if (bundle != null) {
            super(bundle);
            this.d = object;
        } else {
            super();
            this.d = object;
        }
        this.f = object = FacebookSdk.e();
    }

    public static String f() {
        Object object = FacebookSdk.b();
        String string2 = FacebookSdk.c();
        int n3 = ((String)object).length();
        if (n3 > 0 && (n3 = string2.length()) > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            char c2 = '|';
            stringBuilder.append(c2);
            stringBuilder.append(string2);
            object = stringBuilder.toString();
        } else {
            object = lz3_0.a;
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final void a() {
        var1_1 = this.d;
        var2_2 = this.e();
        var3_3 = false;
        var4_4 = null;
        if (var2_2 != null) {
            var5_5 = "|";
            var6_7 = StringsKt.F((CharSequence)var2_2, var5_5, false);
        } else {
            var6_7 = false;
            var5_6 = null;
        }
        var7_8 = "access_token";
        if (var2_2 != null && (var9_10 = kotlin.text.b.s((String)var2_2, var8_9 = "IG", false)) && !var6_7 && (var9_10 = this.i())) ** GOTO lbl-1000
        var2_2 = FacebookSdk.f();
        var4_4 = "instagram.com";
        var9_10 = Intrinsics.areEqual(var2_2, var4_4);
        var3_3 = true;
        if (var9_10) {
            var9_10 = this.i();
            var3_3 ^= var9_10;
        }
        if (!var3_3 && !var6_7) lbl-1000:
        // 2 sources

        {
            var2_2 = GraphRequest.f();
            var1_1.putString(var7_8, (String)var2_2);
        } else {
            var2_2 = this.e();
            if (var2_2 != null) {
                var1_1.putString(var7_8, (String)var2_2);
            }
        }
        var9_10 = var1_1.containsKey(var7_8);
        if (!var9_10) {
            FacebookSdk.c();
            var2_2 = lz3_0.a;
        }
        var1_1.putString("sdk", "android");
        var1_1.putString("format", "json");
        FacebookSdk.i(Ax1.GRAPH_API_DEBUG_INFO);
        FacebookSdk.i(Ax1.GRAPH_API_DEBUG_WARNING);
    }

    public final String b(String object, boolean bl2) {
        boolean bl3;
        Object object2;
        Object object3;
        int n3 = 1;
        if (!bl2 && (object3 = this.h) == (object2 = Qa1.POST)) {
            return object;
        }
        object = Uri.parse((String)object).buildUpon();
        object3 = this.d.keySet().iterator();
        while (bl3 = object3.hasNext()) {
            boolean bl4;
            object2 = (String)object3.next();
            Object[] objectArray = this.d.get((String)object2);
            if (objectArray == null) {
                objectArray = "";
            }
            if (bl4 = GraphRequest$c.f(objectArray)) {
                objectArray = GraphRequest$c.a(objectArray).toString();
                object.appendQueryParameter((String)object2, (String)objectArray);
                continue;
            }
            object2 = this.h;
            Qa1 qa1 = Qa1.GET;
            if (object2 == qa1) continue;
            object3 = StringCompanionObject.INSTANCE;
            object3 = Locale.US;
            object2 = objectArray.getClass().getSimpleName();
            objectArray = new Object[n3];
            objectArray[0] = object2;
            object3 = IV0.a(objectArray, n3, (Locale)object3, "Unsupported parameter type for GET request: %s", "format(locale, format, *args)");
            object = new IllegalArgumentException((String)object3);
            throw object;
        }
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "uriBuilder.toString()");
        return object;
    }

    public final f c() {
        FacebookException facebookException = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(this, "request");
        Object object = new GraphRequest[n3];
        object[0] = this;
        Object object2 = "requests";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = tp_2.M((Object[])object);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = new e((Collection)object);
        object = GraphRequest$c.c((e)object2);
        int n4 = object.size();
        if (n4 == n3) {
            return (f)object.get(0);
        }
        facebookException = new FacebookException("invalid state: expected a single response");
        throw facebookException;
    }

    public final d d() {
        Object object = new GraphRequest[]{this};
        Object object2 = "requests";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = tp_2.M(object);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        e e2 = new e((Collection)object);
        Intrinsics.checkNotNullParameter(e2, (String)object2);
        Xz3.e(e2);
        object = new d(e2);
        object2 = FacebookSdk.d();
        Object[] objectArray = new Void[]{};
        object.executeOnExecutor((Executor)object2, objectArray);
        return object;
    }

    public final String e() {
        Object object = this.a;
        Object object2 = "access_token";
        if (object != null) {
            Bundle bundle = this.d;
            boolean bl2 = bundle.containsKey((String)object2);
            if (!bl2) {
                object2 = sx1.d;
                object = ((AccessToken)object).e;
                ((sx1$a)object2).d((String)object);
                return object;
            }
        } else {
            object = this.d;
            boolean bl3 = object.containsKey((String)object2);
            if (!bl3) {
                return GraphRequest.f();
            }
        }
        return this.d.getString((String)object2);
    }

    public final String g() {
        String string2;
        int n3;
        int n4 = 1;
        Object object = this.h;
        Object[] objectArray = Qa1.POST;
        String string3 = "format(format, *args)";
        if (object == objectArray && (object = this.b) != null && (n3 = kotlin.text.b.h((String)object, (String)(objectArray = "/videos"), false)) != 0) {
            n3 = q03.a;
            object = StringCompanionObject.INSTANCE;
            object = FacebookSdk.f();
            objectArray = new Object[n4];
            objectArray[0] = object;
            object = "https://graph-video.%s";
            string2 = xh2_0.a(objectArray, n4, (String)object, string3);
        } else {
            object = FacebookSdk.f();
            Intrinsics.checkNotNullParameter(object, "subdomain");
            objectArray = StringCompanionObject.INSTANCE;
            objectArray = new Object[n4];
            objectArray[0] = object;
            object = "https://graph.%s";
            string2 = xh2_0.a(objectArray, n4, (String)object, string3);
        }
        string2 = this.h(string2);
        this.a();
        return this.b(string2, false);
    }

    public final String h(String object) {
        String string2;
        int n3 = 2;
        int n4 = 1;
        Object object2 = FacebookSdk.f();
        boolean bl2 = Intrinsics.areEqual(object2, string2 = "instagram.com");
        bl2 = !bl2 ? true : this.i() ^ n4;
        string2 = "format(format, *args)";
        if (!bl2) {
            object = StringCompanionObject.INSTANCE;
            object = new Object[n4];
            object2 = FacebookSdk.t;
            object[0] = object2;
            object2 = "https://graph.%s";
            object = xh2_0.a(object, n4, (String)object2, string2);
        }
        object2 = StringCompanionObject.INSTANCE;
        object2 = k;
        String string3 = this.b;
        object2 = object2.matcher(string3);
        bl2 = object2.matches();
        String string4 = "%s/%s";
        if (!bl2) {
            object2 = this.f;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object2;
            objectArray[n4] = string3;
            string3 = xh2_0.a(objectArray, n3, string4, string2);
        }
        object2 = new Object[n3];
        object2[0] = object;
        object2[n4] = string3;
        return xh2_0.a(object2, n3, string4, string2);
    }

    public final boolean i() {
        boolean bl2;
        boolean bl3;
        boolean bl4 = false;
        String string2 = this.b;
        if (string2 == null) {
            return false;
        }
        CharSequence charSequence = new StringBuilder("^/?");
        String string3 = FacebookSdk.b();
        charSequence.append(string3);
        string3 = "/?.*";
        charSequence.append(string3);
        charSequence = charSequence.toString();
        boolean bl5 = this.i;
        if (bl5 || (bl3 = Pattern.matches((String)charSequence, string2)) || (bl2 = Pattern.matches((String)(charSequence = "^/?app/?.*"), string2))) {
            bl4 = true;
        }
        return bl4;
    }

    public final void j(GraphRequest$b graphRequest$b) {
        FacebookSdk.i(Ax1.GRAPH_API_DEBUG_INFO);
        FacebookSdk.i(Ax1.GRAPH_API_DEBUG_WARNING);
        this.g = graphRequest$b;
    }

    public final void k(Qa1 qa1) {
        if (qa1 == null) {
            qa1 = Qa1.GET;
        }
        this.h = qa1;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("{Request:  accessToken: ");
        Object object = this.a;
        if (object == null) {
            object = "null";
        }
        charSequence.append(object);
        charSequence.append(", graphPath: ");
        object = this.b;
        charSequence.append((String)object);
        charSequence.append(", graphObject: ");
        object = this.c;
        charSequence.append(object);
        charSequence.append(", httpMethod: ");
        object = this.h;
        charSequence.append(object);
        charSequence.append(", parameters: ");
        object = this.d;
        charSequence.append(object);
        charSequence.append("}");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder()\n        \u2026(\"}\")\n        .toString()");
        return charSequence;
    }
}


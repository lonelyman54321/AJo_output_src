/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.facebook;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f {
    public static final /* synthetic */ int e;
    public final HttpURLConnection a;
    public final JSONObject b;
    public final FacebookRequestError c;
    public final JSONObject d;

    public f(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        Intrinsics.checkNotNullParameter(graphRequest, "request");
        Intrinsics.checkNotNullParameter(facebookRequestError, "error");
        this(graphRequest, httpURLConnection, null, null, facebookRequestError);
    }

    public f(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String string2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(graphRequest, "request");
        Intrinsics.checkNotNullParameter(string2, "rawResponse");
        this(graphRequest, httpURLConnection, jSONObject, null, null);
    }

    public f(GraphRequest graphRequest, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        Intrinsics.checkNotNullParameter(graphRequest, "request");
        this.a = httpURLConnection;
        this.b = jSONObject;
        this.c = facebookRequestError;
        this.d = jSONObject;
    }

    public final String toString() {
        int n3;
        Object object;
        String string2;
        Object object2;
        int n4;
        block12: {
            block11: {
                n4 = 1;
                object2 = StringCompanionObject.INSTANCE;
                object2 = Locale.US;
                string2 = "%d";
                object = this.a;
                if (object == null) break block11;
                n3 = ((HttpURLConnection)object).getResponseCode();
                break block12;
            }
            n3 = 200;
        }
        object = n3;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object;
        CharSequence charSequence = Arrays.copyOf(objectArray, n4);
        charSequence = String.format((Locale)object2, string2, (Object[])charSequence);
        object2 = "format(locale, format, *args)";
        try {
            Intrinsics.checkNotNullExpressionValue(charSequence, (String)object2);
        }
        catch (IOException iOException) {
            charSequence = "unknown";
        }
        charSequence = Gn.a("{Response:  responseCode: ", (String)charSequence, ", graphObject: ");
        object2 = this.b;
        ((StringBuilder)charSequence).append(object2);
        ((StringBuilder)charSequence).append(", error: ");
        object2 = this.c;
        ((StringBuilder)charSequence).append(object2);
        ((StringBuilder)charSequence).append("}");
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder()\n        \u2026(\"}\")\n        .toString()");
        return charSequence;
    }
}


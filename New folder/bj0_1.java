/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.net.Uri;
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.FirebaseEvents;
import java.util.Collection;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from Bj0
 */
public final class bj0_1 {
    public static final String a(String string2, String object) {
        boolean bl2;
        int n3;
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(object, "Url");
        Object object2 = Pattern.quote("?");
        Intrinsics.checkNotNullExpressionValue(object2, "quote(...)");
        Object object3 = new Regex((String)object2);
        object = ((Regex)object3).e((CharSequence)object);
        int n4 = object.isEmpty();
        if (n4 == 0) {
            n4 = object.size();
            object2 = object.listIterator(n4);
            while ((n3 = object2.hasPrevious()) != 0) {
                object3 = (String)object2.previous();
                n3 = ((String)object3).length();
                if (n3 == 0) continue;
                object = (Iterable)object;
                n4 = object2.nextIndex() + 1;
                object = CollectionsKt.f0((Iterable)object, n4);
                break;
            }
        } else {
            object = mz0_2.a;
        }
        object = (Collection)object;
        n4 = 0;
        object2 = null;
        object3 = new String[]{};
        object = object.toArray((T[])object3);
        n3 = ((String[])object).length + -1;
        object = object[n3];
        String string3 = "&";
        object3 = new StringTokenizer((String)object, string3);
        while (bl2 = ((StringTokenizer)object3).hasMoreTokens()) {
            int n7;
            object = ((StringTokenizer)object3).nextToken();
            Intrinsics.checkNotNull(object);
            int n8 = StringsKt.F((CharSequence)object, string2, false);
            if (n8 == 0 || (n8 = string2.length() + 1) >= (n7 = ((String)object).length())) continue;
            int n10 = string2.length() + 1;
            string2 = ((String)object).substring(n10);
            Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
            return string2;
        }
        return "";
    }

    public static final String b(String object, String stringArray) {
        Intrinsics.checkNotNullParameter(object, "url");
        Intrinsics.checkNotNullParameter(stringArray, "delimit");
        Regex regex = new Regex((String)stringArray);
        object = regex.e((CharSequence)object);
        int n3 = object.isEmpty();
        int n4 = 1;
        if (n3 == 0) {
            int n7;
            n3 = object.size();
            stringArray = object.listIterator(n3);
            while ((n7 = stringArray.hasPrevious()) != 0) {
                String string2 = (String)stringArray.previous();
                n7 = string2.length();
                if (n7 == 0) continue;
                object = (Iterable)object;
                n3 = stringArray.nextIndex() + n4;
                object = CollectionsKt.f0((Iterable)object, n3);
                break;
            }
        } else {
            object = mz0_2.a;
        }
        object = (Collection)object;
        stringArray = new String[]{};
        object = object.toArray(stringArray);
        n3 = ((String[])object).length;
        object = n3 > n4 ? object[n4] : "";
        return object;
    }

    public static final String c(String string2, String string3) {
        block1: {
            boolean bl2;
            Intrinsics.checkNotNullParameter(string2, "url");
            Intrinsics.checkNotNullParameter(string3, "pattern");
            String string4 = "/";
            Intrinsics.checkNotNullParameter(string4, "delimiter");
            StringTokenizer stringTokenizer = new StringTokenizer(string2, string4);
            while (bl2 = stringTokenizer.hasMoreTokens()) {
                boolean bl3;
                string2 = stringTokenizer.nextToken();
                bl2 = b.i(string2, string3, bl3 = true);
                if (!bl2) continue;
                string2 = stringTokenizer.nextToken();
                break block1;
            }
            string2 = "";
        }
        return string2;
    }

    public static final String d(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        String string4 = "queryParam";
        Intrinsics.checkNotNullParameter(string3, string4);
        string2 = Uri.parse((String)string2);
        try {
            string2 = string2.getQueryParameter(string3);
        }
        catch (Exception exception) {
            string2 = "";
        }
        return string2;
    }

    public static final String e(String string2) {
        String string3 = "url";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = StringsKt.N(string2, '?', 0, false, 6);
        int n4 = -1;
        if (n3 != n4) {
            string2 = string2.substring(0, n3);
            string3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        }
        return string2;
    }

    public static final void f(Uri object) {
        String string2;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "uri");
        Object object2 = object.getQueryParameterNames();
        String string3 = "utm_source";
        boolean bl3 = object2.contains(string3);
        String string4 = "direct";
        String string5 = bl3 ? object.getQueryParameter(string3) : string4;
        String string6 = "utm_medium";
        boolean bl4 = object2.contains(string6);
        String string7 = bl4 ? object.getQueryParameter(string6) : string4;
        String string8 = "utm_campaign";
        boolean bl5 = object2.contains(string8);
        String string9 = bl5 ? object.getQueryParameter(string8) : string4;
        String string10 = "utm_term";
        boolean bl6 = object2.contains(string10);
        if (bl6) {
            string9 = object.getQueryParameter(string10);
        }
        if (bl2 = object2.contains(string2 = "utm_content")) {
            string9 = object.getQueryParameter(string2);
        }
        object = new HashMap();
        object2 = String.valueOf(string5);
        object.put("UTM_Source", object2);
        object2 = String.valueOf(string7);
        object.put("UTM_medium", object2);
        object2 = String.valueOf(string9);
        object.put("UTM_campaign", object2);
        object.put("UTM_term", string4);
        object.put("UTM_content", string4);
        object2 = AnalyticsManager.Companion.getInstance().getCt();
        AnalyticsData$Builder analyticsData$Builder = new AnalyticsData$Builder();
        object = analyticsData$Builder.eventMap((HashMap)object).build();
        ((CleverTapEvents)object2).launchedUTM((AnalyticsData)object);
        object = new Bundle();
        object.putString(string6, string7);
        object.putString(string3, string5);
        object.putString(string8, string9);
        object.putString(string10, string4);
        object.putString(string2, string4);
        FirebaseEvents.Companion.getInstance().sendEvent("app_open", (Bundle)object);
    }
}


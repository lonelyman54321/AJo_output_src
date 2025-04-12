/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.UrlQuerySanitizer
 *  android.net.UrlQuerySanitizer$ValueSanitizer
 *  android.os.Bundle
 *  org.json.JSONObject
 */
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import com.clevertap.android.sdk.b;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONObject;

public final class Yw3 {
    public static Bundle a(String iterator, boolean bl2) {
        Bundle bundle;
        block17: {
            if (iterator == null) {
                iterator = new Iterator();
                return iterator;
            }
            bundle = new Bundle();
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            boolean bl3 = true;
            urlQuerySanitizer.setAllowUnregisteredParamaters(bl3);
            Object object = UrlQuerySanitizer.getAllButNulLegal();
            urlQuerySanitizer.setUnregisteredParameterValueSanitizer((UrlQuerySanitizer.ValueSanitizer)object);
            urlQuerySanitizer.parseUrl((String)((Object)iterator));
            iterator = urlQuerySanitizer.getParameterSet();
            try {
                iterator = iterator.iterator();
            }
            catch (Throwable throwable) {}
            while (true) {
                bl3 = iterator.hasNext();
                if (!bl3) break block17;
                break;
            }
            {
                String string2;
                block18: {
                    object = iterator.next();
                    object = (String)object;
                    string2 = null;
                    string2 = Yw3.d((String)object, urlQuerySanitizer, false);
                    if (string2 == null) continue;
                    if (bl2) break block18;
                    String string3 = "wzrk_c2a";
                    boolean bl4 = ((String)object).equals(string3);
                    if (bl4) break block18;
                    string3 = "UTF-8";
                    string2 = URLDecoder.decode(string2, string3);
                    bundle.putString((String)object, string2);
                    continue;
                }
                bundle.putString((String)object, string2);
                continue;
            }
        }
        return bundle;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JSONObject b(Uri object) {
        JSONObject jSONObject;
        block17: {
            boolean bl2;
            UrlQuerySanitizer urlQuerySanitizer;
            String string2 = "medium";
            jSONObject = new JSONObject();
            try {
                urlQuerySanitizer = new UrlQuerySanitizer();
                bl2 = true;
            }
            catch (Throwable throwable) {
                return jSONObject;
            }
            urlQuerySanitizer.setAllowUnregisteredParamaters(bl2);
            object = object.toString();
            urlQuerySanitizer.parseUrl((String)object);
            object = "source";
            object = Yw3.c((String)object, urlQuerySanitizer);
            String string3 = Yw3.c(string2, urlQuerySanitizer);
            String string4 = "campaign";
            string4 = Yw3.c(string4, urlQuerySanitizer);
            String string5 = "us";
            jSONObject.put(string5, object);
            object = "um";
            jSONObject.put((String)object, (Object)string3);
            object = "uc";
            jSONObject.put((String)object, (Object)string4);
            object = "wzrk_";
            object = ((String)object).concat(string2);
            object = Yw3.d((String)object, urlQuerySanitizer, bl2);
            if (object == null) break block17;
            string2 = "^email$|^social$|^search$";
            boolean bl3 = ((String)object).matches(string2);
            if (!bl3) break block17;
            string2 = "wm";
            jSONObject.put(string2, object);
        }
        int n3 = 4;
        jSONObject.toString(n3);
        b.c();
        return jSONObject;
    }

    public static String c(String string2, UrlQuerySanitizer urlQuerySanitizer) {
        String string3 = "utm_".concat(string2);
        boolean bl2 = true;
        if ((string3 = Yw3.d(string3, urlQuerySanitizer, bl2)) == null && (string3 = Yw3.d(string2 = "wzrk_".concat(string2), urlQuerySanitizer, bl2)) == null) {
            return null;
        }
        return string3;
    }

    public static String d(String string2, UrlQuerySanitizer urlQuerySanitizer, boolean n3) {
        if (string2 != null) {
            block6: {
                string2 = urlQuerySanitizer.getValue(string2);
                if (string2 == null) {
                    return null;
                }
                if (n3 == 0) break block6;
                int n4 = string2.length();
                n3 = 120;
                if (n4 <= n3) break block6;
                n4 = 0;
                urlQuerySanitizer = null;
                try {
                    string2 = string2.substring(0, n3);
                }
                catch (Throwable throwable) {
                    b.l();
                }
            }
            return string2;
        }
        return null;
    }
}


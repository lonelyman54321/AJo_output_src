/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.b;

/*
 * Renamed from HG1
 */
public final class hg1_1 {
    public static hg1_1 o;
    public static String p;
    public static String q;
    public static String r;
    public static String s;
    public static String t;
    public static String u;
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final boolean j;
    public final String k;
    public final String l;
    public final String[] m;
    public final int n;

    public hg1_1(Context stringArray) {
        int n3;
        String string2;
        Object object;
        block19: {
            int n4;
            String string3;
            object = stringArray.getPackageManager();
            stringArray = stringArray.getPackageName();
            int n7 = 128;
            stringArray = object.getApplicationInfo((String)stringArray, n7);
            try {
                stringArray = stringArray.metaData;
            }
            catch (Throwable throwable) {
                stringArray = null;
            }
            if (stringArray == null) {
            }
            if ((object = p) == null) {
                object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_ACCOUNT_ID");
                p = object;
            }
            if ((object = q) == null) {
                object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_TOKEN");
                q = object;
            }
            if ((object = r) == null) {
                object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_REGION");
                r = object;
            }
            if ((object = s) == null) {
                object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_PROXY_DOMAIN");
                s = object;
            }
            if ((object = t) == null) {
                object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_SPIKY_PROXY_DOMAIN");
                t = object;
            }
            if ((object = u) == null) {
                object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_HANDSHAKE_DOMAIN");
                u = object;
            }
            object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_NOTIFICATION_ICON");
            this.c = object;
            object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_USE_GOOGLE_AD_ID");
            string2 = "1";
            this.a = n3 = string2.equals(object);
            object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_DISABLE_APP_LAUNCHED");
            this.b = n3 = string2.equals(object);
            object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_INAPP_EXCLUDE");
            this.d = object;
            object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_SSL_PINNING");
            this.e = n3 = string2.equals(object);
            object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_BACKGROUND_SYNC");
            this.f = n3 = string2.equals(object);
            object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_USE_CUSTOM_ID");
            this.g = n3 = string2.equals(object);
            object = hg1_1.a((Bundle)stringArray, "FCM_SENDER_ID");
            if (object != null) {
                string3 = "id:";
                String string4 = "";
                object = ((String)object).replace(string3, string4);
            }
            this.h = object;
            n3 = 0;
            object = null;
            string3 = "CLEVERTAP_ENCRYPTION_LEVEL";
            string3 = hg1_1.a((Bundle)stringArray, string3);
            int n8 = Integer.parseInt(string3);
            if (n8 < 0 || n8 > (n4 = 1)) break block19;
            n3 = n8;
        }
        try {
            com.clevertap.android.sdk.b.j();
        }
        catch (Throwable throwable) {
            throwable.getCause();
            com.clevertap.android.sdk.b.l();
        }
        this.n = n3;
        this.i = object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_APP_PACKAGE");
        object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_BETA");
        n3 = (int)(string2.equals(object) ? 1 : 0);
        this.j = n3;
        this.k = object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_INTENT_SERVICE");
        this.l = object = hg1_1.a((Bundle)stringArray, "CLEVERTAP_DEFAULT_CHANNEL_ID");
        object = "CLEVERTAP_IDENTIFIER";
        stringArray = hg1_1.a((Bundle)stringArray, (String)object);
        n3 = (int)(TextUtils.isEmpty((CharSequence)stringArray) ? 1 : 0);
        if (n3 == 0) {
            object = ",";
            stringArray = stringArray.split((String)object);
        } else {
            stringArray = q50_0.g;
        }
        this.m = stringArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(Bundle object, String string2) {
        String string3 = null;
        try {
            object = object.get(string2);
            if (object == null) return string3;
        }
        catch (Throwable throwable) {
            return string3;
        }
        return object.toString();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static hg1_1 b(Context object) {
        Class<hg1_1> clazz = hg1_1.class;
        synchronized (clazz) {
            try {
                hg1_1 hg1_12 = o;
                if (hg1_12 != null) return o;
                o = hg1_12 = new hg1_1((Context)object);
                return o;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}


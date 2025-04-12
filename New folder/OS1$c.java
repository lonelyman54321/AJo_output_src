/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;

public final class OS1$c
extends OS1$e {
    public final String b() {
        return "com.facebook.katana.ProxyAuth";
    }

    public final String c() {
        return "com.facebook.katana";
    }

    public final void e() {
        Object object = FacebookSdk.a().getApplicationInfo();
        int n3 = object.targetSdkVersion;
        int n4 = 30;
        if (n3 >= n4 && (n4 = (int)(td0.b(object = os1_1.class) ? 1 : 0)) == 0) {
            try {
                object = os1_1.a;
            }
            catch (Throwable throwable) {
                td0.a(object, throwable);
            }
        }
    }
}


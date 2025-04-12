/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;

/*
 * Renamed from GP1
 */
public final class gp1_1
implements Runnable {
    public final void run() {
        block10: {
            Class<hp1_1> clazz = hp1_1.class;
            boolean bl2 = td0.b(clazz);
            if (!bl2) {
                Object object = jj1.a;
                object = jj1.class;
                boolean bl3 = td0.b(object);
                if (bl3) break block10;
                bl3 = true;
                jj1.b = bl3;
                String string2 = "FBSDKFeatureIntegritySample";
                String string3 = FacebookSdk.b();
                bl3 = zk0_1.b(string2, string3, false);
                try {
                    jj1.c = bl3;
                }
                catch (Throwable throwable) {
                    try {
                        td0.a(object, throwable);
                    }
                    catch (Throwable throwable2) {
                        td0.a(clazz, throwable2);
                    }
                }
            }
        }
    }
}


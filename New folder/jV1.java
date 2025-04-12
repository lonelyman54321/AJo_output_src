/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.net.NetworkInfo
 *  android.os.Build$VERSION
 */
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

public final class jV1 {
    public static final /* synthetic */ int a;

    static {
        Intrinsics.checkNotNullExpressionValue(qx1.b("NetworkStateTracker"), "tagWithPrefix(\"NetworkStateTracker\")");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final hv1_0 a(ConnectivityManager connectivityManager) {
        boolean bl2;
        int n3;
        boolean bl3;
        boolean bl4;
        NetworkInfo networkInfo;
        block5: {
            Object object;
            block4: {
                object = "<this>";
                Intrinsics.checkNotNullParameter(connectivityManager, (String)object);
                networkInfo = connectivityManager.getActiveNetworkInfo();
                bl4 = true;
                bl3 = networkInfo != null && (bl3 = networkInfo.isConnected());
                Intrinsics.checkNotNullParameter(connectivityManager, (String)object);
                int n4 = Build.VERSION.SDK_INT;
                int n7 = 23;
                if (n4 >= n7) {
                    try {
                        Intrinsics.checkNotNullParameter(connectivityManager, (String)object);
                        Network network = jk2_0.a(connectivityManager);
                        Intrinsics.checkNotNullParameter(connectivityManager, (String)object);
                        if ((network = connectivityManager.getNetworkCapabilities(network)) == null) break block4;
                        Intrinsics.checkNotNullParameter(network, (String)object);
                        n3 = 16;
                        n3 = (int)(network.hasCapability(n3) ? 1 : 0);
                        break block5;
                    }
                    catch (SecurityException securityException) {
                        object = qx1.a();
                        object.getClass();
                    }
                }
            }
            n3 = 0;
            object = null;
        }
        boolean bl5 = connectivityManager.isActiveNetworkMetered();
        if (networkInfo == null || (bl2 = networkInfo.isRoaming())) {
            bl4 = false;
        }
        return new hv1_0(bl3, n3 != 0, bl5, bl4);
    }
}


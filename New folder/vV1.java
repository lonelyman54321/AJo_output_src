/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Intrinsics;

public final class vV1 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(ConnectivityManager object) {
        Exception exception2;
        block5: {
            Network network;
            try {
                network = jk2_0.a(object);
                if (network == null) {
                    return "UNKNOWN-ACTIVE_NETWORK_INFO";
                }
            }
            catch (Exception exception2) {
                break block5;
            }
            if ((object = object.getNetworkCapabilities(network)) == null) {
                return "UNKNOWN-NETWORK_CAPABILITIES";
            }
            int n3 = 1;
            if ((n3 = (int)(object.hasTransport(n3) ? 1 : 0)) != 0) {
                return "WIFI";
            }
            n3 = 0;
            network = null;
            boolean bl2 = object.hasTransport(0);
            if (!bl2) return "UNKNOWN-NETWORK_TYPE";
            return "MOBILE_INTERNET";
        }
        yn3_0.a.e(exception2);
        return "UNKNOWN-EXCEPTION";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static String b(ContextWrapper object) {
        void var0_5;
        int n3;
        Integer n4;
        int n7;
        block8: {
            block9: {
                TelephonyManager telephonyManager;
                block7: {
                    telephonyManager = (TelephonyManager)object.getSystemService("phone");
                    String string2 = "android.permission.READ_PHONE_STATE";
                    n7 = t70.checkSelfPermission((Context)object, string2);
                    if (n7 != 0) {
                        return "UNKNOWN-MISSING_PERMISSIONS";
                    }
                    n7 = Build.VERSION.SDK_INT;
                    int n8 = 24;
                    n4 = null;
                    if (n7 < n8) break block7;
                    if (telephonyManager == null) break block8;
                    n7 = uv1_0.a(telephonyManager);
                    break block9;
                }
                if (telephonyManager == null) break block8;
                n7 = telephonyManager.getNetworkType();
            }
            n4 = n7;
        }
        if (!(n4 != null && (n7 = n4.intValue()) == (n3 = 1) || n4 != null && (n7 = n4.intValue()) == (n3 = 2) || n4 != null && (n7 = n4.intValue()) == (n3 = 4) || n4 != null && (n7 = n4.intValue()) == (n3 = 7) || n4 != null && (n7 = n4.intValue()) == (n3 = 11))) {
            if (!(n4 != null && (n7 = n4.intValue()) == (n3 = 3) || n4 != null && (n7 = n4.intValue()) == (n3 = 5) || n4 != null && (n7 = n4.intValue()) == (n3 = 6) || n4 != null && (n7 = n4.intValue()) == (n3 = 8) || n4 != null && (n7 = n4.intValue()) == (n3 = 9) || n4 != null && (n7 = n4.intValue()) == (n3 = 10) || n4 != null && (n7 = n4.intValue()) == (n3 = 12) || n4 != null && (n7 = n4.intValue()) == (n3 = 14) || n4 != null && (n7 = n4.intValue()) == (n3 = 15))) {
                if (n4 != null && (n7 = n4.intValue()) == (n3 = 13)) {
                    return var0_5;
                }
                String string3 = "UNKNOWN-MOBILE_NETWORK";
                return var0_5;
            }
            String string4 = "3G";
            return var0_5;
        }
        String string5 = "2G";
        return var0_5;
    }

    public static String c(Context object) {
        String string2;
        String string3;
        String string4;
        int n3;
        block6: {
            block10: {
                block9: {
                    String string5;
                    block7: {
                        block8: {
                            boolean bl2;
                            Intrinsics.checkNotNullParameter(object, "context");
                            object = object.getSystemService("connectivity");
                            string5 = "null cannot be cast to non-null type android.net.ConnectivityManager";
                            Intrinsics.checkNotNull(object, string5);
                            object = (ConnectivityManager)object;
                            n3 = Build.VERSION.SDK_INT;
                            int n4 = 23;
                            string4 = "Mobile";
                            string3 = "Wifi";
                            string2 = "NoNetwork";
                            if (n3 < n4) break block6;
                            n3 = ((String)(object = vV1.a((ConnectivityManager)object))).hashCode();
                            if (n3 == (n4 = -879003074)) break block7;
                            n4 = 2664213;
                            if (n3 == n4) break block8;
                            n4 = 433141802;
                            if (n3 != n4 || !(bl2 = ((String)object).equals(string5 = "UNKNOWN"))) break block9;
                            string4 = "UNKNOWN-NETWORK_TYPE";
                            break block10;
                        }
                        string5 = "WIFI";
                        boolean bl3 = ((String)object).equals(string5);
                        if (!bl3) break block9;
                        string4 = string3;
                        break block10;
                    }
                    string5 = "MOBILE_INTERNET";
                    boolean bl4 = ((String)object).equals(string5);
                    if (bl4) break block10;
                }
                string4 = string2;
            }
            return string4;
        }
        if ((object = object.getActiveNetworkInfo()) == null) {
            return string2;
        }
        n3 = (int)(object.isConnectedOrConnecting() ? 1 : 0);
        if (n3 == 0) {
            return string2;
        }
        int n7 = object.getType();
        if (n7 != 0) {
            n3 = 1;
            string4 = n7 != n3 ? string2 : string3;
        }
        return string4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String d(ContextWrapper contextWrapper) {
        Object object = "context";
        Intrinsics.checkNotNullParameter(contextWrapper, (String)object);
        int n3 = vV1.e((Context)contextWrapper);
        String string2 = "UNKNOWN-NETWORK_TYPE";
        if (n3 == 0) {
            return string2;
        }
        object = contextWrapper.getSystemService("connectivity");
        String string3 = "null cannot be cast to non-null type android.net.ConnectivityManager";
        Intrinsics.checkNotNull(object, string3);
        object = (ConnectivityManager)object;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        String string4 = "WIFI";
        if (n4 >= n7) {
            n4 = (int)(Intrinsics.areEqual(object = vV1.a((ConnectivityManager)object), string4) ? 1 : 0);
            if (n4 != 0) {
                return string4;
            }
            string3 = "MOBILE_INTERNET";
            n3 = (int)(Intrinsics.areEqual(object, string3) ? 1 : 0);
            if (n3 == 0) return string2;
            return vV1.b(contextWrapper);
        }
        if ((object = object.getActiveNetworkInfo()) == null) {
            return "UNKNOWN-ACTIVE_NETWORK_INFO";
        }
        n4 = (int)(object.isConnectedOrConnecting() ? 1 : 0);
        if (n4 == 0) return string2;
        n3 = object.getType();
        if (n3 == 0) return vV1.b(contextWrapper);
        int n8 = 1;
        if (n3 == n8) return string4;
        return string2;
    }

    public static final boolean e(Context object) {
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        object = object.getSystemService("connectivity");
        String string2 = "null cannot be cast to non-null type android.net.ConnectivityManager";
        Intrinsics.checkNotNull(object, string2);
        object = (ConnectivityManager)object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            boolean bl3;
            n3 = (int)(Intrinsics.areEqual(object = vV1.a((ConnectivityManager)object), string2 = "WIFI") ? 1 : 0);
            if (n3 != 0 || (bl3 = Intrinsics.areEqual(object, string2 = "MOBILE_INTERNET"))) {
                bl2 = true;
            }
            return bl2;
        }
        if ((object = object.getActiveNetworkInfo()) != null) {
            return object.isConnected();
        }
        return false;
    }
}


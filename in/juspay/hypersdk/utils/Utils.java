/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Bundle;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utils {
    private static final String LOG_TAG = "Utils";

    public static boolean checkIfGranted(JuspayServices juspayServices, String string2) {
        Object object;
        String string3 = "permissions not found:";
        Object object2 = juspayServices.getContext();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        boolean bl2 = true;
        if (n3 >= n4) {
            int n7 = jq1_1.b(object2, string2);
            if (n7 != 0) {
                bl2 = false;
            }
            return bl2;
        }
        try {
            object = object2.getPackageManager();
        }
        catch (Throwable throwable) {
            SdkTracker sdkTracker = juspayServices.getSdkTracker();
            String string4 = cP.a("Exception trying to fetch permission info: ", string2, " returning FALSE");
            sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "util", string4, throwable);
            return false;
        }
        object2 = object2.getPackageName();
        int n8 = object.checkPermission(string2, (String)object2);
        if (n8 == 0) {
            return bl2;
        }
        object2 = LOG_TAG;
        object = new StringBuilder(string3);
        ((StringBuilder)object).append(string2);
        string3 = ((StringBuilder)object).toString();
        juspayServices.sdkDebug((String)object2, string3);
        return false;
    }

    public static boolean checkIfVPNConnected(Context context) {
        boolean bl2;
        String string2 = "connectivity";
        context = (ConnectivityManager)context.getSystemService(string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            string2 = jk2_0.a((ConnectivityManager)context);
            if (string2 != null) {
                if ((context = context.getNetworkCapabilities((Network)string2)) != null && (bl2 = context.hasTransport(n3 = 4))) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    context = null;
                }
            } else {
                bl2 = Utils.isVpnConnectedForLowerVersion((ConnectivityManager)context);
            }
        } else {
            bl2 = Utils.isVpnConnectedForLowerVersion((ConnectivityManager)context);
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean contains(JSONArray jSONArray, Object object) {
        try {
            int n3;
            for (int n4 = 0; n4 < (n3 = jSONArray.length()); ++n4) {
                Object object2 = jSONArray.get(n4);
                n3 = (int)(object2.equals(object) ? 1 : 0);
                if (n3 == 0) continue;
                return true;
            }
            return false;
        }
        catch (JSONException jSONException) {}
        return false;
    }

    public static JSONArray defaultNonNull(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    public static JSONObject defaultNonNull(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return jSONObject;
    }

    public static void deleteRecursive(File file) {
        boolean bl2 = file.exists();
        if (!bl2) {
            return;
        }
        bl2 = file.isDirectory();
        if (bl2) {
            File[] fileArray = file.listFiles();
            int n3 = 0;
            if (fileArray == null) {
                fileArray = new File[]{};
            }
            int n4 = fileArray.length;
            while (n3 < n4) {
                File file2 = fileArray[n3];
                Utils.deleteRecursive(file2);
                ++n3;
            }
        }
        file.delete();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String getIPAddress(JuspayServices juspayServices) {
        Object object;
        Object object2;
        Iterator iterator;
        Iterator iterator2 = NetworkInterface.getNetworkInterfaces();
        iterator2 = Collections.list(iterator2);
        try {
            iterator2 = iterator2.iterator();
        }
        catch (Exception exception) {
            iterator = juspayServices.getSdkTracker();
            String string2 = "util";
            String string3 = "Failed to Retreive IP address";
            object2 = "action";
            object = "system";
            ((SdkTracker)((Object)iterator)).trackException((String)object2, (String)object, string2, string3, exception);
        }
        block19: while (true) {
            boolean bl2 = iterator2.hasNext();
            if (!bl2) return "";
            iterator = iterator2.next();
            iterator = (NetworkInterface)((Object)iterator);
            iterator = ((NetworkInterface)((Object)iterator)).getInetAddresses();
            iterator = Collections.list(iterator);
            iterator = iterator.iterator();
            while (true) {
                boolean bl3 = iterator.hasNext();
                if (!bl3) continue block19;
                object2 = iterator.next();
                object2 = (InetAddress)object2;
                boolean bl4 = ((InetAddress)object2).isLoopbackAddress();
                if (bl4) continue;
                object = ((InetAddress)object2).getHostAddress();
                if (object == null) continue;
                object2 = ((InetAddress)object2).getHostAddress();
                object = Locale.getDefault();
                object2 = ((String)object2).toUpperCase((Locale)object);
                bl4 = Utils.isIPv4Address((String)object2);
                if (bl4) return object2;
                continue;
                break;
            }
            break;
        }
        return "";
    }

    public static String getLogLevelFromThrowable(Throwable throwable) {
        boolean bl2 = throwable instanceof Error;
        if (bl2) {
            return "critical";
        }
        boolean bl3 = throwable instanceof Exception;
        if (bl3) {
            return "error";
        }
        return "warning";
    }

    public static ActivityManager.MemoryInfo getMemoryInfo(Context object) {
        block8: {
            ActivityManager.MemoryInfo memoryInfo;
            block7: {
                block6: {
                    String string2;
                    try {
                        memoryInfo = new ActivityManager.MemoryInfo();
                        if (object == null) break block6;
                        string2 = "activity";
                    }
                    catch (Exception exception) {}
                    object = object.getSystemService(string2);
                    object = (ActivityManager)object;
                    break block7;
                }
                object = null;
            }
            if (object == null) break block8;
            object.getMemoryInfo(memoryInfo);
            return memoryInfo;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public static byte[] gzipContent(byte[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [7 : 67->73)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static boolean includes(JSONArray jSONArray, Object object) {
        int n3;
        if (jSONArray == null) {
            return false;
        }
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            Object object2 = jSONArray.opt(i3);
            n3 = (int)(object.equals(object2) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }

    public static boolean isIPv4Address(String stringArray) {
        int n3;
        String string2 = "\\.";
        int n4 = (stringArray = stringArray.split(string2)).length;
        if (n4 != (n3 = 4)) {
            return false;
        }
        for (String string3 : stringArray) {
            try {
                int n7;
                int n8 = Integer.parseInt(string3);
                if (n8 >= 0 && n8 <= (n7 = 255)) {
                    continue;
                }
            }
            catch (NumberFormatException numberFormatException) {}
            return false;
        }
        return true;
    }

    private static boolean isVpnConnectedForLowerVersion(ConnectivityManager connectivityManager) {
        for (Network network : connectivityManager.getAllNetworks()) {
            int n3;
            boolean bl2;
            if ((network = connectivityManager.getNetworkCapabilities(network)) == null || !(bl2 = network.hasTransport(n3 = 4))) continue;
            return true;
        }
        return false;
    }

    public static JSONArray optJSONArray(JSONObject jSONObject, String string2) {
        if ((jSONObject = jSONObject.optJSONArray(string2)) == null) {
            jSONObject = new JSONArray();
        }
        return jSONObject;
    }

    public static JSONObject optJSONObject(JSONObject jSONObject, String string2) {
        if ((jSONObject = jSONObject.optJSONObject(string2)) == null) {
            jSONObject = new JSONObject();
        }
        return jSONObject;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static JSONObject toJSON(Bundle var0) {
        block18: {
            var1_1 = new JSONObject();
            if (var0 == null) break block18;
            var2_2 = var0.keySet();
            try {
                var2_2 = var2_2.iterator();
            }
            catch (Exception v0) {}
            while (true) {
                var3_3 = var2_2.hasNext();
                if (!var3_3) break block18;
                break;
            }
            {
                block19: {
                    var4_4 /* !! */  = var2_2.next();
                    var4_4 /* !! */  = (String)var4_4 /* !! */ ;
                    var5_5 = var0.get(var4_4 /* !! */ );
                    if (var5_5 != null) break block19;
                    var5_5 = JSONObject.NULL;
                    var1_1.put(var4_4 /* !! */ , var5_5);
                    continue;
                }
                var6_6 = var5_5 instanceof ArrayList;
                if (var6_6) {
                    var5_5 = (ArrayList)var5_5;
                    var5_5 = Utils.toJSONArray((ArrayList)var5_5);
                    var1_1.put(var4_4 /* !! */ , var5_5);
                    continue;
                }
                var6_6 = var5_5 instanceof Bundle;
                if (!var6_6) ** GOTO lbl46
                var5_5 = (Bundle)var5_5;
                var5_5 = Utils.toJSON((Bundle)var5_5);
                var1_1.put(var4_4 /* !! */ , var5_5);
                continue;
lbl46:
                // 1 sources

                var5_5 = String.valueOf(var5_5);
                var1_1.put(var4_4 /* !! */ , var5_5);
                continue;
            }
        }
        return var1_1;
    }

    public static JSONArray toJSONArray(ArrayList object) {
        boolean bl2;
        JSONArray jSONArray = new JSONArray();
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = object.next();
            boolean bl3 = object2 instanceof ArrayList;
            if (bl3) {
                object2 = Utils.toJSONArray((ArrayList)object2);
                jSONArray.put(object2);
                continue;
            }
            bl3 = object2 instanceof JSONObject;
            if (bl3) {
                jSONArray.put(object2);
                continue;
            }
            object2 = String.valueOf(object2);
            jSONArray.put(object2);
        }
        return jSONArray;
    }
}


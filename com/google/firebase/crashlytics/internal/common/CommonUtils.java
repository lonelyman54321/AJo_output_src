/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.hardware.SensorManager
 *  android.net.ConnectivityManager
 *  android.os.Build
 *  android.os.Debug
 *  android.os.StatFs
 */
package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CommonUtils {
    static final String BUILD_IDS_ARCH_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_arch";
    static final String BUILD_IDS_BUILD_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_build_id";
    static final String BUILD_IDS_LIB_NAMES_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_lib";
    public static final int DEVICE_STATE_BETAOS = 8;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
    public static final int DEVICE_STATE_ISSIMULATOR = 1;
    public static final int DEVICE_STATE_JAILBROKEN = 2;
    public static final int DEVICE_STATE_VENDORINTERNAL = 16;
    private static final String GOLDFISH = "goldfish";
    private static final char[] HEX_VALUES;
    static final String LEGACY_MAPPING_FILE_ID_RESOURCE_NAME = "com.crashlytics.android.build_id";
    public static final String LEGACY_SHARED_PREFS_NAME = "com.crashlytics.prefs";
    static final String MAPPING_FILE_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.mapping_file_id";
    private static final String RANCHU = "ranchu";
    private static final String SDK = "sdk";
    private static final String SHA1_INSTANCE = "SHA-1";
    public static final String SHARED_PREFS_NAME = "com.google.firebase.crashlytics";

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[16];
        char[] cArray3 = cArray;
        cArray2[0] = 48;
        cArray3[1] = 49;
        cArray2[2] = 50;
        cArray3[3] = 51;
        cArray2[4] = 52;
        cArray3[5] = 53;
        cArray2[6] = 54;
        cArray3[7] = 55;
        cArray2[8] = 56;
        cArray3[9] = 57;
        cArray2[10] = 97;
        cArray3[11] = 98;
        cArray2[12] = 99;
        cArray3[13] = 100;
        cArray2[14] = 101;
        cArray3[15] = 102;
        HEX_VALUES = cArray;
    }

    public static long calculateFreeRamInBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long calculateTotalRamInBytes(Context object) {
        Class<CommonUtils> clazz = CommonUtils.class;
        synchronized (clazz) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            String string2 = "activity";
            object = object.getSystemService(string2);
            object = (ActivityManager)object;
            object.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
    }

    public static long calculateUsedDiskSpaceInBytes(String string2) {
        StatFs statFs = new StatFs(string2);
        long l2 = statFs.getBlockSize();
        long l3 = (long)statFs.getBlockCount() * l2;
        long l4 = statFs.getAvailableBlocks();
        return l3 - (l2 *= l4);
    }

    public static boolean canTryConnection(Context context) {
        boolean bl2;
        String string2 = "android.permission.ACCESS_NETWORK_STATE";
        boolean bl3 = CommonUtils.checkPermission(context, string2);
        boolean bl4 = true;
        if (bl3 && ((context = ((ConnectivityManager)context.getSystemService(string2 = "connectivity")).getActiveNetworkInfo()) == null || !(bl2 = context.isConnectedOrConnecting()))) {
            bl4 = false;
        }
        return bl4;
    }

    public static boolean checkPermission(Context context, String string2) {
        int n3 = context.checkCallingOrSelfPermission(string2);
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            context = null;
        }
        return n3 != 0;
    }

    public static void closeOrLog(Closeable closeable, String string2) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (IOException iOException) {
                Logger logger = Logger.getLogger();
                logger.e(string2, iOException);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (RuntimeException runtimeException) {
                throw runtimeException;
            }
            catch (Exception exception) {}
        }
    }

    public static String createInstanceIdFrom(String ... object) {
        int n3;
        String string2 = null;
        if (object != null && (n3 = ((String[])object).length) != 0) {
            int n4;
            Object object2 = new ArrayList();
            for (String string3 : object) {
                if (string3 == null) continue;
                String string4 = "";
                string3 = string3.replace("-", string4);
                Locale locale = Locale.US;
                string3 = string3.toLowerCase(locale);
                ((ArrayList)object2).add(string3);
            }
            Collections.sort(object2);
            object = new StringBuilder();
            object2 = ((ArrayList)object2).iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                String string5 = (String)object2.next();
                ((StringBuilder)object).append(string5);
            }
            n3 = ((String)(object = ((StringBuilder)object).toString())).length();
            if (n3 > 0) {
                string2 = CommonUtils.sha1((String)object);
            }
        }
        return string2;
    }

    public static boolean getBooleanResourceValue(Context context, String string2, boolean bl2) {
        Object object;
        if (context != null && (object = context.getResources()) != null) {
            String string3 = "bool";
            int n3 = CommonUtils.getResourcesIdentifier(context, string2, string3);
            if (n3 > 0) {
                return object.getBoolean(n3);
            }
            object = "string";
            int n4 = CommonUtils.getResourcesIdentifier(context, string2, (String)object);
            if (n4 > 0) {
                return Boolean.parseBoolean(context.getString(n4));
            }
        }
        return bl2;
    }

    public static List getBuildIdInfo(Context object) {
        int n3 = 2;
        int n4 = 3;
        int n7 = 1;
        ArrayList<BuildIdInfo> arrayList = new ArrayList<BuildIdInfo>();
        Object object2 = BUILD_IDS_LIB_NAMES_RESOURCE_NAME;
        Object object3 = "array";
        int n8 = CommonUtils.getResourcesIdentifier((Context)object, (String)object2, (String)object3);
        Object object4 = BUILD_IDS_ARCH_RESOURCE_NAME;
        int n10 = CommonUtils.getResourcesIdentifier((Context)object, (String)object4, (String)object3);
        String string2 = BUILD_IDS_BUILD_ID_RESOURCE_NAME;
        int n14 = CommonUtils.getResourcesIdentifier((Context)object, string2, (String)object3);
        if (n8 != 0 && n10 != 0 && n14 != 0) {
            object2 = object.getResources().getStringArray(n8);
            string2 = object.getResources();
            object4 = string2.getStringArray(n10);
            n14 = ((String[])object2).length;
            int n15 = ((String[])(object = object.getResources().getStringArray(n14))).length;
            if (n14 == n15 && (n14 = ((String[])object4).length) == (n15 = ((String[])object).length)) {
                for (int i3 = 0; i3 < (n3 = ((String[])object).length); i3 += n7) {
                    String string3 = object2[i3];
                    object3 = object4[i3];
                    string2 = object[i3];
                    BuildIdInfo buildIdInfo = new BuildIdInfo(string3, (String)object3, string2);
                    arrayList.add(buildIdInfo);
                }
                return arrayList;
            }
            object3 = Logger.getLogger();
            object2 = ((String[])object2).length;
            object4 = ((String[])object4).length;
            object = ((String[])object).length;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object2;
            objectArray[n7] = object4;
            objectArray[n3] = object;
            object = String.format("Lengths did not match: %d %d %d", objectArray);
            ((Logger)object3).d((String)object);
            return arrayList;
        }
        object = Logger.getLogger();
        object2 = n8;
        object4 = n10;
        object3 = n14;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object2;
        objectArray[n7] = object4;
        objectArray[n3] = object3;
        String string4 = String.format("Could not find resources: %d %d %d", objectArray);
        object.d(string4);
        return arrayList;
    }

    public static int getCpuArchitectureInt() {
        return CommonUtils$Architecture.getValue().ordinal();
    }

    public static int getDeviceState() {
        int n3;
        int n4;
        int n32 = CommonUtils.isEmulator();
        boolean bl2 = CommonUtils.isRooted();
        if (bl2) {
            n4 = n32 | 2;
        }
        if (bl2 = CommonUtils.isDebuggerAttached()) {
            n3 = n4 | 4;
        }
        return n3;
    }

    public static SharedPreferences getLegacySharedPrefs(Context context) {
        return context.getSharedPreferences(LEGACY_SHARED_PREFS_NAME, 0);
    }

    public static String getMappingFileId(Context object) {
        String string2 = MAPPING_FILE_ID_RESOURCE_NAME;
        String string3 = "string";
        int n3 = CommonUtils.getResourcesIdentifier(object, string2, string3);
        if (n3 == 0) {
            string2 = LEGACY_MAPPING_FILE_ID_RESOURCE_NAME;
            n3 = CommonUtils.getResourcesIdentifier(object, string2, string3);
        }
        object = n3 != 0 ? object.getResources().getString(n3) : null;
        return object;
    }

    public static boolean getProximitySensorEnabled(Context context) {
        int n3 = CommonUtils.isEmulator();
        boolean bl2 = false;
        if (n3 != 0) {
            return false;
        }
        String string2 = "sensor";
        context = (SensorManager)context.getSystemService(string2);
        n3 = 8;
        if ((context = context.getDefaultSensor(n3)) != null) {
            bl2 = true;
        }
        return bl2;
    }

    public static String getResourcePackageName(Context context) {
        Object object;
        block7: {
            object = context.getApplicationContext().getApplicationInfo();
            int n3 = object.icon;
            if (n3 > 0) {
                Object object2 = context.getResources();
                object = object2.getResourcePackageName(n3);
                object2 = "android";
                boolean bl2 = ((String)object2).equals(object);
                if (!bl2) break block7;
                try {
                    object = context.getPackageName();
                }
                catch (Resources.NotFoundException notFoundException) {
                    object = context.getPackageName();
                }
            } else {
                object = context.getPackageName();
            }
        }
        return object;
    }

    public static int getResourcesIdentifier(Context object, String string2, String string3) {
        Resources resources = object.getResources();
        object = CommonUtils.getResourcePackageName(object);
        return resources.getIdentifier(string2, string3, (String)object);
    }

    public static SharedPreferences getSharedPrefs(Context context) {
        return context.getSharedPreferences(SHARED_PREFS_NAME, 0);
    }

    private static String hash(String string2, String string3) {
        return CommonUtils.hash(string2.getBytes(), string3);
    }

    private static String hash(byte[] byArray, String object) {
        try {
            object = MessageDigest.getInstance((String)object);
            ((MessageDigest)object).update(byArray);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            Logger logger = Logger.getLogger();
            StringBuilder stringBuilder = new StringBuilder("Could not create hashing algorithm: ");
            stringBuilder.append((String)object);
            stringBuilder.append(", returning empty string.");
            object = stringBuilder.toString();
            logger.e((String)object, noSuchAlgorithmException);
            return "";
        }
        return CommonUtils.hexify(((MessageDigest)object).digest());
    }

    public static String hexify(byte[] object) {
        int n3;
        int n4 = ((byte[])object).length * 2;
        char[] cArray = new char[n4];
        for (int i3 = 0; i3 < (n3 = ((byte[])object).length); ++i3) {
            n3 = object[i3];
            int n7 = n3 & 0xFF;
            int n8 = i3 * 2;
            char[] cArray2 = HEX_VALUES;
            n7 >>>= 4;
            cArray[n8] = n7 = cArray2[n7];
            n3 &= 0xF;
            cArray[++n8] = n3 = cArray2[n3];
        }
        object = new String;
        object(cArray);
        return object;
    }

    public static boolean isAppDebuggable(Context context) {
        context = context.getApplicationInfo();
        int n3 = context.flags & 2;
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            context = null;
        }
        return n3 != 0;
    }

    public static boolean isDebuggerAttached() {
        boolean bl2 = Debug.isDebuggerConnected();
        bl2 = bl2 || (bl2 = Debug.waitingForDebugger());
        return bl2;
    }

    public static boolean isEmulator() {
        boolean bl2;
        String string2 = Build.PRODUCT;
        String string3 = SDK;
        boolean bl3 = string2.contains(string3);
        if (!(bl3 || (bl2 = (string2 = Build.HARDWARE).contains(string3 = GOLDFISH)) || (bl3 = string2.contains(string3 = RANCHU)))) {
            bl3 = false;
            string2 = null;
        } else {
            bl3 = true;
        }
        return bl3;
    }

    public static boolean isLoggingEnabled(Context context) {
        return false;
    }

    public static boolean isRooted() {
        String string2;
        boolean bl2;
        boolean bl3 = CommonUtils.isEmulator();
        Object object = Build.TAGS;
        boolean bl4 = true;
        if (!bl3 && object != null && (bl2 = ((String)object).contains(string2 = "test-keys"))) {
            return bl4;
        }
        string2 = "/system/app/Superuser.apk";
        object = new File(string2);
        bl2 = ((File)object).exists();
        if (bl2) {
            return bl4;
        }
        string2 = "/system/xbin/su";
        object = new File(string2);
        if (!bl3 && (bl3 = ((File)object).exists())) {
            return bl4;
        }
        return false;
    }

    public static boolean nullSafeEquals(String string2, String string3) {
        if (string2 == null) {
            boolean bl2;
            if (string3 == null) {
                bl2 = true;
            } else {
                bl2 = false;
                string2 = null;
            }
            return bl2;
        }
        return string2.equals(string3);
    }

    public static String padWithZerosToMaxIntWidth(int n3) {
        if (n3 >= 0) {
            Locale locale = Locale.US;
            Integer n4 = n3;
            Object[] objectArray = new Object[]{n4};
            return String.format(locale, "%1$10s", objectArray).replace(' ', '0');
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("value must be zero or greater");
        throw illegalArgumentException;
    }

    public static String sha1(String string2) {
        return CommonUtils.hash(string2, SHA1_INSTANCE);
    }

    public static String streamToString(InputStream object) {
        Scanner scanner = new Scanner((InputStream)object);
        boolean bl2 = ((Scanner)(object = scanner.useDelimiter("\\A"))).hasNext();
        object = bl2 ? ((Scanner)object).next() : "";
        return object;
    }
}


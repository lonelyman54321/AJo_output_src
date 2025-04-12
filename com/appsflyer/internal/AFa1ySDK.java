/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Process
 */
package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1lSDK;
import com.appsflyer.internal.AFa1ySDK$1;
import com.appsflyer.internal.AFa1ySDK$AFa1uSDK;
import com.appsflyer.internal.AFa1ySDK$AFa1ySDK;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public final class AFa1ySDK {
    private static AFa1ySDK getMonetizationNetwork;
    private final Map AFAdRevenueData;

    public AFa1ySDK() {
        AFa1ySDK$1 aFa1ySDK$1 = new AFa1ySDK$1(this);
        this.AFAdRevenueData = aFa1ySDK$1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String AFAdRevenueData() {
        StringBuilder stringBuilder;
        String string2;
        block14: {
            int n3;
            Object object;
            int n4;
            Object object2;
            block13: {
                string2 = ";";
                stringBuilder = new StringBuilder();
                try {
                    object2 = Thread.getAllStackTraces();
                    object2 = object2.entrySet();
                    object2 = object2.iterator();
                    n4 = 0;
                    object = null;
                    int n7 = 0;
                    int n8 = 0;
                    block4: while (true) {
                        boolean bl2;
                        if (!(bl2 = object2.hasNext())) {
                            n3 = 1;
                            if (n7 > n3) {
                                object2 = "mz;";
                                stringBuilder.append((String)object2);
                            }
                            break block13;
                        }
                        Object object3 = object2.next();
                        object3 = (Map.Entry)object3;
                        object3 = object3.getValue();
                        object3 = (StackTraceElement[])object3;
                        int n10 = ((E)object3).length;
                        int n14 = 0;
                        while (true) {
                            boolean bl3;
                            String string3;
                            if (n14 >= n10) continue block4;
                            Object object4 = object3[n14];
                            Object object5 = object4.toString();
                            int n15 = ((String)object5).contains(string3 = "de.robv.android.xposed");
                            if (n15 != 0 && n8 <= (n15 = 2)) {
                                ++n8;
                                object5 = AFa1ySDK$AFa1uSDK.getCurrencyIso4217Code;
                                object5 = ((AFa1ySDK$AFa1uSDK)((Object)object5)).AFAdRevenueData;
                                stringBuilder.append((String)object5);
                                object5 = ((StackTraceElement)object4).getMethodName();
                                string3 = "main";
                                n15 = (int)(object5.equals(string3) ? 1 : 0);
                                if (n15 != 0) {
                                    object5 = "+a";
                                    stringBuilder.append((String)object5);
                                }
                                if ((n15 = (int)((object5 = ((StackTraceElement)object4).getMethodName()).equals(string3 = "handleHookedMethod") ? 1 : 0)) != 0) {
                                    object5 = "+h";
                                    stringBuilder.append((String)object5);
                                }
                                stringBuilder.append(string2);
                            }
                            if (bl3 = (object4 = ((StackTraceElement)object4).getClassName()).equals(object5 = "com.android.internal.os.ZygoteInit")) {
                                ++n7;
                            }
                            ++n14;
                        }
                        break;
                    }
                }
                catch (Throwable throwable) {}
                object = "hooking check error";
                AFLogger.afErrorLogForExcManagerOnly((String)object, throwable);
            }
            try {
                object = "/proc/";
                object2 = new StringBuilder((String)object);
                n4 = Process.myPid();
                ((StringBuilder)object2).append(n4);
                object = "/maps";
                ((StringBuilder)object2).append((String)object);
                object2 = object2.toString();
                object = "frida";
                n3 = AFa1ySDK.AFAdRevenueData((String)object2, (String)object);
                if (n3 == 0) break block14;
                object2 = AFa1ySDK$AFa1uSDK.getRevenue;
                object2 = ((AFa1ySDK$AFa1uSDK)((Object)object2)).AFAdRevenueData;
                stringBuilder.append((String)object2);
                n3 = Build.VERSION.SDK_INT;
                n4 = 29;
                if (n3 < n4 && (n3 = (int)(AFa1ySDK.AFAdRevenueData((String)(object2 = "/proc/net/tcp"), (String)(object = "69A2")) ? 1 : 0)) != 0) {
                    object2 = "+prt";
                    stringBuilder.append((String)object2);
                }
            }
            catch (Exception exception) {
                AFLogger.afErrorLogForExcManagerOnly("frida detection error", exception);
                String string4 = exception.getMessage();
                object = Locale.getDefault();
                string4 = string4.toLowerCase((Locale)object);
                stringBuilder.append(string4);
            }
        }
        stringBuilder.append(string2);
        return ((Object)stringBuilder).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean AFAdRevenueData(String object, String string2) {
        FileNotFoundException fileNotFoundException2;
        block7: {
            IOException iOException2;
            block6: {
                Object object2 = new File((String)object);
                try {
                    boolean bl2;
                    object = new FileInputStream((File)object2);
                    HashSet hashSet = Charset.defaultCharset();
                    Object object3 = new InputStreamReader((InputStream)object, (Charset)((Object)hashSet));
                    object2 = new BufferedReader((Reader)object3);
                    object3 = Locale.getDefault();
                    string2 = string2.toLowerCase((Locale)object3);
                    do {
                        if ((object3 = ((BufferedReader)object2).readLine()) == null) {
                            ((Reader)object2).close();
                            ((InputStream)object).close();
                            return false;
                        }
                        Object object4 = Locale.getDefault();
                        object3 = object3.toLowerCase((Locale)object4);
                        object4 = "[\\s.,\\]\\-:/_\\[]";
                        object3 = object3.split((String)object4);
                    } while (!(bl2 = (hashSet = new HashSet(object3 = Arrays.asList(object3))).contains(string2)));
                    ((Reader)object2).close();
                    ((InputStream)object).close();
                    return true;
                }
                catch (Exception exception) {
                }
                catch (IOException iOException2) {
                    break block6;
                }
                catch (FileNotFoundException fileNotFoundException2) {
                    break block7;
                }
                string2 = "GF";
                AFLogger.afErrorLogForExcManagerOnly(string2, exception);
                Exception exception = new Exception(string2);
                throw exception;
            }
            string2 = "IOF";
            AFLogger.afErrorLogForExcManagerOnly(string2, iOException2);
            Exception exception = new Exception(string2);
            throw exception;
        }
        string2 = "FNF";
        AFLogger.afErrorLogForExcManagerOnly(string2, fileNotFoundException2);
        Exception exception = new Exception(string2);
        throw exception;
    }

    private AFa1lSDK getCurrencyIso4217Code() {
        Object object;
        AFa1lSDK aFa1lSDK = new AFa1lSDK();
        Iterator iterator = this.AFAdRevenueData;
        iterator = iterator.entrySet();
        try {
            iterator = iterator.iterator();
        }
        catch (Exception exception) {
            object = "failed to create props";
            AFLogger.afErrorLogForExcManagerOnly((String)object, exception);
        }
        while (true) {
            boolean bl2 = iterator.hasNext();
            if (!bl2) break;
            object = iterator.next();
            object = (Map.Entry)object;
            Object object2 = object.getValue();
            object2 = (String)object2;
            if ((object2 = AFa1ySDK.getCurrencyIso4217Code(object2)) == null) continue;
            String string2 = "";
            boolean bl3 = object2.equals(string2);
            if (bl3) continue;
            object = object.getKey();
            object = (String)object;
            aFa1lSDK.getCurrencyIso4217Code((String)object, object2);
            continue;
            break;
        }
        return aFa1lSDK;
    }

    private static String getCurrencyIso4217Code(String object) {
        String string2 = null;
        int n3 = 1;
        Object object2 = null;
        Object object3 = "android.os.SystemProperties";
        object3 = Class.forName((String)object3);
        String string3 = "get";
        Class[] classArray = new Class[n3];
        Class<String> clazz = String.class;
        classArray[0] = clazz;
        object3 = ((Class)object3).getMethod(string3, classArray);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        object = ((Method)object3).invoke(null, objectArray);
        try {
            object2 = object = (String)object;
        }
        catch (Exception exception) {
            string2 = "error in props rfl";
            AFLogger.afErrorLogForExcManagerOnly(string2, exception);
        }
        return object2;
    }

    public static AFa1ySDK getMediationNetwork() {
        AFa1ySDK aFa1ySDK = getMonetizationNetwork;
        if (aFa1ySDK == null) {
            getMonetizationNetwork = aFa1ySDK = new AFa1ySDK();
        }
        return getMonetizationNetwork;
    }

    private static boolean getMediationNetwork(Context context) {
        context = context.getApplicationInfo();
        int n3 = context.flags & 2;
        return n3 != 0;
    }

    private static boolean getMediationNetwork(String string2) {
        return string2.matches("\\d+");
    }

    private AFa1lSDK getMonetizationNetwork(Context object) {
        AFa1lSDK aFa1lSDK = new AFa1lSDK();
        Object object2 = AFa1ySDK$AFa1ySDK.getRevenue;
        object2 = object2.getMonetizationNetwork;
        Object object3 = AFa1ySDK.AFAdRevenueData();
        aFa1lSDK.getCurrencyIso4217Code((String)object2, object3);
        object2 = AFa1ySDK$AFa1ySDK.getCurrencyIso4217Code;
        object2 = object2.getMonetizationNetwork;
        boolean bl2 = AFa1ySDK.getMediationNetwork(object);
        object3 = aFa1lSDK.getMediationNetwork;
        object2 = AFa1lSDK.getCurrencyIso4217Code((String)object2);
        object = bl2;
        try {
            ((AbstractMap)object3).put(object2, object);
        }
        catch (Throwable throwable) {
            object2 = "failed to perform analysis checks";
            AFLogger.afErrorLogForExcManagerOnly((String)object2, throwable);
        }
        return aFa1lSDK;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object getRevenue(Context object, String object2) {
        Exception exception2;
        String string2;
        block4: {
            block3: {
                string2 = null;
                if (object2 != null) {
                    try {
                        boolean bl2 = AFa1ySDK.getMediationNetwork((String)object2);
                        if (bl2) break block3;
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                string2 = "invalid timestamp";
            }
            object2 = new AFa1lSDK();
            String string3 = "pr";
            AFa1lSDK aFa1lSDK = this.getCurrencyIso4217Code();
            ((AFa1lSDK)object2).getCurrencyIso4217Code(string3, aFa1lSDK);
            string3 = "an";
            object = this.getMonetizationNetwork((Context)object);
            ((AFa1lSDK)object2).getCurrencyIso4217Code(string3, object);
            return object2;
        }
        AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", exception2);
        return string2;
    }
}


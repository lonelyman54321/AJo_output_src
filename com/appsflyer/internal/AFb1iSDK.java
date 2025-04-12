/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1rSDK;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Random;

public final class AFb1iSDK {
    private static String getCurrencyIso4217Code;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String getCurrencyIso4217Code(AFd1nSDK object, AFd1rSDK object2) {
        Class<AFb1iSDK> clazz = AFb1iSDK.class;
        synchronized (clazz) {
            Throwable throwable2;
            block13: {
                Object object3;
                try {
                    object3 = ((AFd1nSDK)object).AFAdRevenueData;
                    if (object3 == null) {
                        return getCurrencyIso4217Code;
                    }
                }
                catch (Throwable throwable2) {
                    break block13;
                }
                {
                    block14: {
                        Exception exception2;
                        block12: {
                            object3 = getCurrencyIso4217Code;
                            if (object3 != null) return getCurrencyIso4217Code;
                            object3 = "AF_INSTALLATION";
                            String string2 = null;
                            if ((object3 = object2.getMonetizationNetwork((String)object3, null)) != null) {
                                getCurrencyIso4217Code = object3;
                            } else {
                                block11: {
                                    block10: {
                                        try {
                                            object = ((AFd1nSDK)object).AFAdRevenueData;
                                            object = object.getFilesDir();
                                            string2 = "AF_INSTALLATION";
                                            object3 = new File((File)object, string2);
                                            boolean bl2 = ((File)object3).exists();
                                            if (bl2) break block10;
                                            long l2 = System.currentTimeMillis();
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append(l2);
                                            object3 = "-";
                                            ((StringBuilder)object).append((String)object3);
                                            object3 = new SecureRandom();
                                            l2 = ((Random)object3).nextLong();
                                            l2 = Math.abs(l2);
                                            ((StringBuilder)object).append(l2);
                                            getCurrencyIso4217Code = object = object.toString();
                                            break block11;
                                        }
                                        catch (Exception exception2) {
                                            break block12;
                                        }
                                    }
                                    getCurrencyIso4217Code = object = AFb1iSDK.getCurrencyIso4217Code((File)object3);
                                    ((File)object3).delete();
                                }
                                object = getCurrencyIso4217Code;
                                object3 = "AF_INSTALLATION";
                                object2.AFAdRevenueData((String)object3, (String)object);
                            }
                            break block14;
                        }
                        object2 = "Error getting AF unique ID";
                        AFLogger.afErrorLog((String)object2, exception2);
                    }
                    object = getCurrencyIso4217Code;
                    if (object == null) return getCurrencyIso4217Code;
                    object = AppsFlyerProperties.getInstance();
                    object2 = "uid";
                    object3 = getCurrencyIso4217Code;
                    ((AppsFlyerProperties)object).set((String)object2, (String)object3);
                    return getCurrencyIso4217Code;
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String getCurrencyIso4217Code(File object) {
        void var0_7;
        Object object2;
        Object object3;
        block14: {
            block17: {
                RandomAccessFile randomAccessFile;
                block16: {
                    String string2;
                    block15: {
                        object3 = "Exception while trying to close the InstallationFile";
                        object2 = null;
                        try {
                            string2 = "r";
                            randomAccessFile = new RandomAccessFile((File)object, string2);
                        }
                        catch (Throwable throwable) {
                            break block14;
                        }
                        catch (IOException iOException) {
                            randomAccessFile = null;
                            break block15;
                        }
                        try {
                            long l2 = randomAccessFile.length();
                            int n3 = (int)l2;
                            object2 = new byte[n3];
                            randomAccessFile.readFully((byte[])object2);
                            randomAccessFile.close();
                        }
                        catch (Throwable throwable) {
                            object2 = randomAccessFile;
                            break block14;
                        }
                        catch (IOException iOException) {
                            RandomAccessFile randomAccessFile2 = randomAccessFile;
                            randomAccessFile = object2;
                            object2 = randomAccessFile2;
                            break block15;
                        }
                        try {
                            randomAccessFile.close();
                        }
                        catch (IOException iOException) {
                            AFLogger.afErrorLog((String)object3, iOException);
                        }
                        break block17;
                    }
                    string2 = "Exception while reading InstallationFile: ";
                    {
                        AFLogger.afErrorLog(string2, (Throwable)object);
                        if (object2 == null) break block16;
                    }
                    try {
                        ((RandomAccessFile)object2).close();
                    }
                    catch (IOException iOException) {
                        AFLogger.afErrorLog((String)object3, iOException);
                    }
                }
                object2 = randomAccessFile;
            }
            if (object2 == null) {
                object3 = null;
                object2 = new byte[0];
            }
            object3 = Charset.defaultCharset();
            return new String((byte[])object2, (Charset)object3);
        }
        if (object2 == null) throw var0_7;
        try {
            ((RandomAccessFile)object2).close();
            throw var0_7;
        }
        catch (IOException iOException) {
            AFLogger.afErrorLog((String)object3, iOException);
        }
        throw var0_7;
    }
}


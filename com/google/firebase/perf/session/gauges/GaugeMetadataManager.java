/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 */
package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GaugeMetadataManager {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ActivityManager activityManager;
    private final Context appContext;
    private final ActivityManager.MemoryInfo memoryInfo;
    private final Runtime runtime;

    public GaugeMetadataManager(Context context) {
        Runtime runtime = Runtime.getRuntime();
        this(runtime, context);
    }

    public GaugeMetadataManager(Runtime runtime, Context context) {
        this.runtime = runtime;
        this.appContext = context;
        runtime = (ActivityManager)context.getSystemService("activity");
        this.activityManager = runtime;
        this.memoryInfo = context;
        runtime.getMemoryInfo((ActivityManager.MemoryInfo)context);
    }

    public int getDeviceRamSizeKb() {
        StorageUnit storageUnit = StorageUnit.BYTES;
        long l2 = this.memoryInfo.totalMem;
        return Utils.saturatedIntCast(storageUnit.toKilobytes(l2));
    }

    public int getMaxAppJavaHeapMemoryKb() {
        StorageUnit storageUnit = StorageUnit.BYTES;
        long l2 = this.runtime.maxMemory();
        return Utils.saturatedIntCast(storageUnit.toKilobytes(l2));
    }

    public int getMaxEncouragedAppJavaHeapMemoryKb() {
        StorageUnit storageUnit = StorageUnit.MEGABYTES;
        long l2 = this.activityManager.getMemoryClass();
        return Utils.saturatedIntCast(storageUnit.toKilobytes(l2));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int readTotalRAM(String charSequence) {
        Object object;
        IOException iOException2;
        Object object2;
        String string2;
        block11: {
            NumberFormatException numberFormatException2;
            block10: {
                string2 = "' file: ";
                object2 = new FileReader((String)charSequence);
                BufferedReader bufferedReader = new BufferedReader((Reader)object2);
                {
                    Throwable throwable2;
                    block15: {
                        block14: {
                            int n3;
                            block13: {
                                block12: {
                                    catch (NumberFormatException numberFormatException2) {
                                        break block10;
                                    }
                                    catch (IOException iOException2) {
                                        break block11;
                                    }
                                    try {
                                        while ((object2 = bufferedReader.readLine()) != null) {
                                            object = "MemTotal";
                                            boolean bl2 = ((String)object2).startsWith((String)object);
                                            if (!bl2) continue;
                                            object = "\\d+";
                                            object2 = ((Pattern)(object = Pattern.compile((String)object))).matcher((CharSequence)object2);
                                            bl2 = ((Matcher)object2).find();
                                            if (!bl2) break block12;
                                            object2 = ((Matcher)object2).group();
                                            n3 = Integer.parseInt((String)object2);
                                            break block13;
                                        }
                                        break block14;
                                    }
                                    catch (Throwable throwable2) {
                                        break block15;
                                    }
                                }
                                n3 = 0;
                                object2 = null;
                            }
                            bufferedReader.close();
                            return n3;
                        }
                        bufferedReader.close();
                        return 0;
                    }
                    try {
                        bufferedReader.close();
                        throw throwable2;
                    }
                    catch (Throwable throwable3) {}
                    {
                        throwable2.addSuppressed(throwable3);
                        throw throwable2;
                    }
                }
            }
            object2 = logger;
            object = "Unable to parse '";
            charSequence = Gn.a((String)object, (String)charSequence, string2);
            string2 = numberFormatException2.getMessage();
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            ((AndroidLogger)object2).warn((String)charSequence);
            return 0;
        }
        object2 = logger;
        object = "Unable to read '";
        charSequence = Gn.a((String)object, (String)charSequence, string2);
        string2 = iOException2.getMessage();
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        ((AndroidLogger)object2).warn((String)charSequence);
        return 0;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1kSDK;
import com.appsflyer.internal.AFb1uSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class AFb1lSDK
implements AFb1uSDK {
    private final AFd1nSDK getMonetizationNetwork;

    public AFb1lSDK(AFd1nSDK aFd1nSDK) {
        this.getMonetizationNetwork = aFd1nSDK;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static AFb1kSDK AFAdRevenueData(File object) {
        void var0_7;
        Reader reader;
        String string2;
        block13: {
            InputStreamReader inputStreamReader;
            Object object2;
            block14: {
                string2 = "could not close load reader";
                reader = null;
                object2 = new FileInputStream((File)object);
                Object object3 = Charset.defaultCharset();
                inputStreamReader = new InputStreamReader((InputStream)object2, (Charset)object3);
                long l2 = ((File)object).length();
                int n3 = (int)l2;
                object2 = new char[n3];
                inputStreamReader.read((char[])object2);
                object3 = new AFb1kSDK((char[])object2);
                ((AFb1kSDK)object3).getRevenue = object = ((File)object).getName();
                try {
                    ((Reader)inputStreamReader).close();
                    return object3;
                }
                catch (IOException iOException) {
                    AFLogger.afErrorLogForExcManagerOnly(string2, iOException);
                }
                return object3;
                catch (Throwable throwable) {
                    break block13;
                }
                catch (Exception exception) {
                    inputStreamReader = null;
                    break block14;
                }
                catch (Throwable throwable) {
                    reader = inputStreamReader;
                    break block13;
                }
                catch (Exception exception) {}
            }
            object2 = "error while loading request from cache";
            {
                AFLogger.afErrorLogForExcManagerOnly((String)object2, (Throwable)object);
                if (inputStreamReader == null) return null;
            }
            try {
                ((Reader)inputStreamReader).close();
                return null;
            }
            catch (IOException iOException) {
                AFLogger.afErrorLogForExcManagerOnly(string2, iOException);
            }
            return null;
        }
        if (reader == null) throw var0_7;
        try {
            reader.close();
            throw var0_7;
        }
        catch (IOException iOException) {
            AFLogger.afErrorLogForExcManagerOnly(string2, iOException);
        }
        throw var0_7;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String AFAdRevenueData(AFb1kSDK object) {
        void var1_8;
        Object object2;
        String string2;
        block15: {
            Object object3;
            Object object4;
            block16: {
                CharSequence charSequence;
                Object object5;
                Object object6;
                block17: {
                    int n3;
                    int n4;
                    object4 = "AFRequestCache";
                    string2 = "could not close cache writer";
                    object2 = null;
                    try {
                        object6 = this.getMonetizationNetwork;
                        object6 = ((AFd1nSDK)object6).AFAdRevenueData;
                        object6 = object6.getFilesDir();
                        object3 = new File((File)object6, (String)object4);
                        n4 = ((File)object3).exists();
                        if (n4 == 0) {
                            ((File)object3).mkdir();
                            return null;
                        }
                    }
                    catch (Throwable throwable) {
                        break block15;
                    }
                    catch (Exception exception) {
                        object4 = null;
                        break block16;
                    }
                    if ((object3 = ((File)object3).listFiles()) != null && (n3 = ((File[])object3).length) > (n4 = 40)) {
                        object = AFLogger.INSTANCE;
                        object4 = AFh1vSDK.component3;
                        object3 = "reached cache limit, not caching request";
                        ((AFh1uSDK)object).i((AFh1vSDK)((Object)object4), (String)object3);
                        return null;
                    }
                    object3 = AFLogger.INSTANCE;
                    object6 = AFh1vSDK.component3;
                    object5 = "caching request with URL: ";
                    charSequence = new StringBuilder((String)object5);
                    object5 = ((AFb1kSDK)object).AFAdRevenueData;
                    charSequence.append((String)object5);
                    charSequence = ((Object)charSequence).toString();
                    ((AFh1uSDK)object3).i((AFh1vSDK)((Object)object6), (String)charSequence);
                    long l2 = System.currentTimeMillis();
                    charSequence = Long.toString(l2);
                    Object object7 = this.getMonetizationNetwork;
                    object7 = ((AFd1nSDK)object7).AFAdRevenueData;
                    object7 = object7.getFilesDir();
                    Object object8 = new File((File)object7, (String)object4);
                    object5 = new File((File)object8, (String)charSequence);
                    ((File)object5).createNewFile();
                    object5 = ((File)object5).getPath();
                    int n7 = 1;
                    object8 = new FileOutputStream((String)object5, n7 != 0);
                    object5 = Charset.defaultCharset();
                    object4 = new OutputStreamWriter((OutputStream)object8, (Charset)object5);
                    object5 = "version=";
                    try {
                        ((Writer)object4).write((String)object5);
                        object5 = ((AFb1kSDK)object).getMonetizationNetwork;
                        ((Writer)object4).write((String)object5);
                        int n8 = 10;
                        ((Writer)object4).write(n8);
                        object8 = "url=";
                        ((Writer)object4).write((String)object8);
                        object8 = ((AFb1kSDK)object).AFAdRevenueData;
                        ((Writer)object4).write((String)object8);
                        ((Writer)object4).write(n8);
                        object8 = "data=";
                        ((Writer)object4).write((String)object8);
                        object8 = ((AFb1kSDK)object).getMonetizationNetwork();
                        n7 = 2;
                        object8 = Base64.encodeToString((byte[])object8, (int)n7);
                        ((Writer)object4).write((String)object8);
                        ((Writer)object4).write(n8);
                        object = ((AFb1kSDK)object).getCurrencyIso4217Code;
                        if (object == null) break block17;
                        object8 = "type=";
                        ((Writer)object4).write((String)object8);
                        object = ((Enum)object).name();
                        ((Writer)object4).write((String)object);
                        ((Writer)object4).write(n8);
                    }
                    catch (Throwable throwable) {
                        object2 = object4;
                        break block15;
                    }
                    catch (Exception exception) {
                        break block16;
                    }
                }
                ((Writer)object4).flush();
                object = "done, cacheKey: ";
                object5 = String.valueOf(charSequence);
                object = ((String)object).concat((String)object5);
                ((AFh1uSDK)object3).i((AFh1vSDK)((Object)object6), (String)object);
                try {
                    ((Writer)object4).close();
                    return charSequence;
                }
                catch (IOException iOException) {
                    AFLogger.afErrorLogForExcManagerOnly(string2, iOException);
                }
                return charSequence;
            }
            object3 = "CACHE: Could not cache request";
            {
                AFLogger.afErrorLog((String)object3, (Throwable)object);
                if (object4 == null) return null;
            }
            try {
                ((Writer)object4).close();
                return null;
            }
            catch (IOException iOException) {
                AFLogger.afErrorLogForExcManagerOnly(string2, iOException);
            }
            return null;
        }
        if (object2 == null) throw var1_8;
        try {
            ((Writer)object2).close();
            throw var1_8;
        }
        catch (IOException iOException) {
            AFLogger.afErrorLogForExcManagerOnly(string2, iOException);
        }
        throw var1_8;
    }

    public final boolean AFAdRevenueData(String string2) {
        Comparable<File> comparable = this.getMonetizationNetwork.AFAdRevenueData.getFilesDir();
        Object object = new File((File)comparable, "AFRequestCache");
        comparable = new Comparable<File>((File)object, string2);
        object = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.component3;
        CharSequence charSequence = new StringBuilder("Deleting ");
        charSequence.append(string2);
        String string3 = " from cache";
        charSequence.append(string3);
        charSequence = ((Object)charSequence).toString();
        ((AFh1uSDK)object).i(aFh1vSDK, (String)charSequence);
        boolean bl2 = ((File)comparable).exists();
        if (bl2) {
            try {
                return ((File)comparable).delete();
            }
            catch (Exception exception) {
                comparable = new Comparable<File>("CACHE: Could not delete ");
                ((StringBuilder)comparable).append(string2);
                ((StringBuilder)comparable).append(string3);
                AFLogger.afErrorLog(comparable.toString(), exception);
                return false;
            }
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getCurrencyIso4217Code() {
        Exception exception2;
        block6: {
            int n3;
            File[] fileArray;
            String string2;
            try {
                Object object = this.getMonetizationNetwork;
                object = ((AFd1nSDK)object).AFAdRevenueData;
                object = object.getFilesDir();
                string2 = "AFRequestCache";
                fileArray = new File((File)object, string2);
                n3 = fileArray.exists();
                if (n3 == 0) {
                    fileArray.mkdir();
                    return;
                }
            }
            catch (Exception exception2) {
                break block6;
            }
            if ((fileArray = fileArray.listFiles()) == null) {
                return;
            }
            n3 = fileArray.length;
            int n4 = 0;
            string2 = null;
            while (true) {
                if (n4 >= n3) {
                    return;
                }
                File file = fileArray[n4];
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.component3;
                String string3 = "Found cached request";
                CharSequence charSequence = new StringBuilder(string3);
                string3 = file.getName();
                ((StringBuilder)charSequence).append(string3);
                charSequence = ((Object)charSequence).toString();
                aFLogger.i(aFh1vSDK, (String)charSequence);
                string3 = "Deleting ";
                charSequence = new StringBuilder(string3);
                string3 = file.getName();
                ((StringBuilder)charSequence).append(string3);
                string3 = " from cache";
                ((StringBuilder)charSequence).append(string3);
                charSequence = ((Object)charSequence).toString();
                aFLogger.i(aFh1vSDK, (String)charSequence);
                file.delete();
                ++n4;
            }
        }
        AFLogger.afErrorLog("CACHE: Could not cache request", exception2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List getMediationNetwork() {
        Exception exception2;
        ArrayList<Object> arrayList;
        block5: {
            CharSequence charSequence;
            int n3;
            File[] fileArray;
            String string2;
            block4: {
                arrayList = new ArrayList<Object>();
                try {
                    Object object = this.getMonetizationNetwork;
                    object = ((AFd1nSDK)object).AFAdRevenueData;
                    object = object.getFilesDir();
                    string2 = "AFRequestCache";
                    fileArray = new File((File)object, string2);
                    n3 = fileArray.exists();
                    if (n3 != 0) break block4;
                    fileArray.mkdir();
                }
                catch (Exception exception2) {
                    break block5;
                }
            }
            if ((fileArray = fileArray.listFiles()) == null) {
                return arrayList;
            }
            n3 = fileArray.length;
            string2 = null;
            for (int n4 = 0; n4 < n3; charSequence = ((Object)charSequence).toString(), ++n4) {
                Object object = fileArray[n4];
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.component3;
                String string3 = "Found cached request";
                charSequence = new StringBuilder(string3);
                string3 = ((File)object).getName();
                charSequence.append(string3);
                aFLogger.i(aFh1vSDK, (String)charSequence);
                object = AFb1lSDK.AFAdRevenueData((File)object);
                arrayList.add(object);
            }
            return arrayList;
        }
        String string4 = "CACHE: Could not get cached requests";
        AFLogger.afErrorLog(string4, exception2);
        return arrayList;
    }

    public final void getMonetizationNetwork() {
        Exception exception2;
        block12: {
            block11: {
                Object object;
                String string2 = "AFRequestCache";
                try {
                    object = this.getMonetizationNetwork;
                }
                catch (Exception exception2) {
                    break block12;
                }
                object = ((AFd1nSDK)object).AFAdRevenueData;
                object = object.getFilesDir();
                File file = new File((File)object, string2);
                boolean bl2 = file.exists();
                if (bl2) break block11;
                object = this.getMonetizationNetwork;
                object = ((AFd1nSDK)object).AFAdRevenueData;
                object = object.getFilesDir();
                file = new File((File)object, string2);
                file.mkdir();
            }
            return;
        }
        AFLogger.afErrorLog("CACHE: Could not create cache directory", exception2);
    }
}


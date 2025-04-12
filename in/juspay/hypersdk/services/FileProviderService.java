/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.services;

import android.content.Context;
import android.os.Environment;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SdkInfo;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.services.FileProviderService$Mode;
import in.juspay.hypersdk.services.FileProviderService$TempWriter;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.services.Workspace;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.json.JSONObject;

public class FileProviderService
implements FileProviderInterface {
    private static final String LOG_TAG = "FileProviderService";
    private final Map fileCache;
    private final List fileCacheWhiteList;
    private final JuspayServices juspayServices;
    private final boolean shouldCheckInternalAssets;
    private final Workspace workspace;

    public FileProviderService(JuspayServices object) {
        Cloneable cloneable;
        this.fileCache = cloneable = new Cloneable();
        this.fileCacheWhiteList = cloneable;
        this.shouldCheckInternalAssets = true;
        this.juspayServices = object;
        this.workspace = object = ((JuspayServices)object).getWorkspace();
    }

    public static /* synthetic */ Workspace access$000(FileProviderService fileProviderService) {
        return fileProviderService.workspace;
    }

    public static /* synthetic */ JuspayServices access$100(FileProviderService fileProviderService) {
        return fileProviderService.juspayServices;
    }

    public static /* synthetic */ boolean access$200(FileProviderService fileProviderService, Context context, File file, byte[] byArray, boolean bl2) {
        return fileProviderService.writeToFile(context, file, byArray, bl2);
    }

    public static /* synthetic */ String[] access$300(File file) {
        return FileProviderService.listFiles(file);
    }

    public static /* synthetic */ String access$400(String string2) {
        return FileProviderService.asDecryptedJSA(string2);
    }

    public static /* synthetic */ File access$500(FileProviderService fileProviderService, Context context, String string2) {
        return fileProviderService.getFileFromInternalStorage(context, string2);
    }

    private static String asDecryptedJSA(String string2) {
        return FileProviderService.replaceExtension(string2, ".jsa", ".jsajs");
    }

    private static String asEncryptedJSA(String string2) {
        return FileProviderService.replaceExtension(string2, ".jsajs", ".jsa");
    }

    private void cacheFile(String string2, String object) {
        this.fileCache.put(string2, object);
        object = this.juspayServices;
        StringBuilder stringBuilder = new StringBuilder("Caching file: ");
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        ((JuspayServices)object).sdkDebug(LOG_TAG, string2);
    }

    private void copyFile(Context object, String object2, String string2) {
        object2 = this.getFileFromInternalStorage((Context)object, (String)object2);
        object = this.getFileFromInternalStorage((Context)object, string2);
        this.copyFile((File)object2, (File)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean copyFile(File object, File object2) {
        FileNotFoundException fileNotFoundException;
        Object object3;
        block17: {
            Exception exception;
            block16: {
                Object object4 = "copyFile: ";
                object3 = this.juspayServices;
                String string2 = LOG_TAG;
                StringBuilder stringBuilder = new StringBuilder((String)object4);
                object4 = ((File)object).getAbsolutePath();
                stringBuilder.append((String)object4);
                object4 = "   ";
                stringBuilder.append((String)object4);
                object4 = ((File)object2).getAbsolutePath();
                stringBuilder.append((String)object4);
                object4 = stringBuilder.toString();
                ((JuspayServices)object3).sdkDebug(string2, (String)object4);
                object4 = new FileInputStream((File)object);
                {
                    Throwable throwable3222222;
                    block18: {
                        catch (Exception exception2) {
                            exception = exception2;
                            break block16;
                        }
                        catch (FileNotFoundException fileNotFoundException2) {
                            fileNotFoundException = fileNotFoundException2;
                            break block17;
                        }
                        object3 = new FileOutputStream((File)object2);
                        int n3 = 1024;
                        {
                            Throwable throwable22222222;
                            block19: {
                                catch (Throwable throwable3222222) {
                                    break block18;
                                }
                                try {
                                    int n4;
                                    int n7;
                                    object2 = new byte[n3];
                                    while ((n7 = ((InputStream)object4).read((byte[])object2)) != (n4 = -1)) {
                                        ((OutputStream)object3).write((byte[])object2, 0, n7);
                                    }
                                }
                                catch (Throwable throwable22222222) {
                                    break block19;
                                }
                                ((OutputStream)object3).flush();
                                {
                                    ((OutputStream)object3).close();
                                }
                                {
                                    ((InputStream)object4).close();
                                    return true;
                                }
                            }
                            try {
                                ((OutputStream)object3).close();
                                throw throwable22222222;
                            }
                            catch (Throwable throwable4) {}
                            {
                                throwable22222222.addSuppressed(throwable4);
                                throw throwable22222222;
                            }
                        }
                    }
                    try {
                        ((InputStream)object4).close();
                        throw throwable3222222;
                    }
                    catch (Throwable throwable5) {}
                    {
                        throwable3222222.addSuppressed(throwable5);
                        throw throwable3222222;
                    }
                }
            }
            object3 = this.juspayServices.getSdkTracker();
            StringBuilder stringBuilder = new StringBuilder("Exception: ");
            object = ((File)object).getName();
            stringBuilder.append((String)object);
            String string3 = stringBuilder.toString();
            ((SdkTracker)object3).trackException("action", "system", "file_provider_service", string3, exception);
            return false;
        }
        object3 = this.juspayServices.getSdkTracker();
        StringBuilder stringBuilder = new StringBuilder("File not found: ");
        object = ((File)object).getName();
        stringBuilder.append((String)object);
        String string4 = stringBuilder.toString();
        ((SdkTracker)object3).trackException("action", "system", "file_provider_service", string4, fileNotFoundException);
        return false;
    }

    private void deleteFileFromCache(String string2) {
        boolean bl2 = this.isFileCached(string2);
        if (bl2) {
            Map map2 = this.fileCache;
            map2.remove(string2);
        }
    }

    private File getFileFromInternalStorage(Context object, String object2) {
        boolean bl2;
        Object object3 = this.juspayServices;
        CharSequence charSequence = new StringBuilder("Context while reading Internal Storage :");
        charSequence.append(object);
        object = charSequence.toString();
        charSequence = LOG_TAG;
        ((JuspayServices)object3).sdkDebug((String)charSequence, (String)object);
        object = this.juspayServices;
        String string2 = "Getting file from internal storage. Filename: ";
        object3 = new StringBuilder(string2);
        ((StringBuilder)object3).append((String)object2);
        object3 = ((StringBuilder)object3).toString();
        ((JuspayServices)object).sdkDebug((String)charSequence, (String)object3);
        object = this.workspace.open((String)object2);
        object2 = ((File)object).getParentFile();
        if (object2 != null && !(bl2 = ((File)object2).exists())) {
            ((File)object2).mkdirs();
        }
        return object;
    }

    private boolean isFileCached(String string2) {
        return this.fileCache.containsKey(string2);
    }

    private static String[] listFiles(File objectArray) {
        boolean bl2 = objectArray.exists();
        if (bl2) {
            objectArray = objectArray.listFiles();
            TreeSet<Object> treeSet = new TreeSet<Object>();
            if (objectArray != null) {
                for (Object object : objectArray) {
                    boolean bl3 = ((File)object).isFile();
                    if (!bl3) continue;
                    object = FileProviderService.asEncryptedJSA(FileProviderService.stripSdkNameAndVersion(((File)object).getName()));
                    treeSet.add(object);
                }
            }
            objectArray = new String[]{};
            return (String[])treeSet.toArray(objectArray);
        }
        return null;
    }

    private InputStream openAsset(Context context, String string2) {
        return this.workspace.openAsset(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String readFromAssets(Context object, String string2) {
        Exception exception2;
        SdkTracker sdkTracker;
        block3: {
            String string3;
            Object object2 = "Done reading ";
            Object object3 = "Read JSA Asset file ";
            Object object4 = this.juspayServices;
            sdkTracker = ((JuspayServices)object4).getSdkTracker();
            try {
                object = this.getAssetFileAsByte((Context)object, string2);
                object4 = "jsa";
                boolean bl2 = string2.endsWith((String)object4);
                string3 = LOG_TAG;
                if (bl2) {
                    object2 = this.juspayServices;
                    object4 = new StringBuilder((String)object3);
                    ((StringBuilder)object4).append(string2);
                    object3 = " with encrypted hash - ";
                    ((StringBuilder)object4).append((String)object3);
                    object3 = EncryptionHelper.md5((byte[])object);
                    ((StringBuilder)object4).append((String)object3);
                    object3 = ((StringBuilder)object4).toString();
                    ((JuspayServices)object2).sdkDebug(string3, (String)object3);
                    object2 = "v1";
                    object = EncryptionHelper.decryptThenGunzip((byte[])object, (String)object2);
                    return new String((byte[])object);
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object3 = this.juspayServices;
            object4 = new StringBuilder((String)object2);
            ((StringBuilder)object4).append(string2);
            object2 = " from assets";
            ((StringBuilder)object4).append((String)object2);
            object2 = ((StringBuilder)object4).toString();
            ((JuspayServices)object3).sdkDebug(string3, (String)object2);
            return new String((byte[])object);
        }
        String string4 = kp1_0.c("Exception trying to read from file: ", string2);
        sdkTracker.trackException("action", "system", "file_provider_service", string4, exception2);
        return null;
    }

    private void readFromInputStream(ByteArrayOutputStream byteArrayOutputStream, InputStream inputStream) {
        int n3;
        int n4;
        int n7 = 4096;
        byte[] byArray = new byte[n7];
        while ((n4 = inputStream.read(byArray)) != (n3 = -1)) {
            n3 = 0;
            byteArrayOutputStream.write(byArray, 0, n4);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String readFromInternalStorage(Context object, String string2) {
        Object object2;
        Object object3;
        SdkTracker sdkTracker;
        block25: {
            Object object4 = "Returning null from internal storage for ";
            string2 = this.appendSdkNameAndVersion(string2);
            Object object5 = this.juspayServices.getSdkInfo();
            boolean bl2 = ((SdkInfo)object5).usesLocalAssets();
            if (bl2) {
                return null;
            }
            object5 = new StringBuilder();
            sdkTracker = this.juspayServices.getSdkTracker();
            object3 = "jsa";
            boolean bl3 = string2.endsWith((String)object3);
            if (bl3) {
                if ((object = (Object)this.decryptGunzipInternalStorage((Context)object, string2)) != null) {
                    return new String((byte[])object);
                }
                String string3 = "system";
                String string4 = "warning";
                String string5 = "file_provider_service";
                String string6 = "readFromInternalStorage";
                String string7 = ((String)object4).concat(string2);
                object3 = sdkTracker;
                sdkTracker.trackAction(string3, string4, string5, string6, string7);
                return null;
            }
            object = this.getFileFromInternalStorage((Context)object, string2);
            object4 = new FileInputStream((File)object);
            {
                Throwable throwable3;
                block26: {
                    catch (Exception exception) {
                        object2 = exception;
                        break block25;
                    }
                    object = new InputStreamReader((InputStream)object4);
                    {
                        Throwable throwable22;
                        block27: {
                            catch (Throwable throwable3) {
                                break block26;
                            }
                            object3 = new BufferedReader((Reader)object);
                            {
                                Throwable throwable42;
                                block28: {
                                    catch (Throwable throwable22) {
                                        break block27;
                                    }
                                    while (true) {
                                        char c2;
                                        try {
                                            c2 = ((BufferedReader)object3).read();
                                            char c3 = '\uffffffff';
                                            if (c2 == c3) break;
                                        }
                                        catch (Throwable throwable42) {
                                            break block28;
                                        }
                                        c2 = c2;
                                        {
                                            ((StringBuilder)object5).append(c2);
                                            continue;
                                        }
                                        break;
                                    }
                                    {
                                        ((BufferedReader)object3).close();
                                    }
                                    {
                                        ((InputStreamReader)object).close();
                                        String string8 = "system";
                                        String string9 = "debug";
                                        String string10 = "file_provider_service";
                                        String string11 = "readFromInternalStorage";
                                        object = new StringBuilder();
                                        object3 = "Returning the file content without decryption for ";
                                        ((StringBuilder)object).append((String)object3);
                                        ((StringBuilder)object).append(string2);
                                        object2 = ((StringBuilder)object).toString();
                                        object3 = sdkTracker;
                                        sdkTracker.trackAction(string8, string9, string10, string11, object2);
                                        object = ((StringBuilder)object5).toString();
                                    }
                                    {
                                        ((FileInputStream)object4).close();
                                        return object;
                                    }
                                }
                                try {
                                    ((BufferedReader)object3).close();
                                    throw throwable42;
                                }
                                catch (Throwable throwable5) {}
                                {
                                    throwable42.addSuppressed(throwable5);
                                    throw throwable42;
                                }
                            }
                        }
                        try {
                            ((InputStreamReader)object).close();
                            throw throwable22;
                        }
                        catch (Throwable throwable6) {}
                        {
                            throwable22.addSuppressed(throwable6);
                            throw throwable22;
                        }
                    }
                }
                try {
                    ((FileInputStream)object4).close();
                    throw throwable3;
                }
                catch (Throwable throwable7) {}
                {
                    throwable3.addSuppressed(throwable7);
                    throw throwable3;
                }
            }
        }
        object3 = sdkTracker;
        sdkTracker.trackException("action", "system", "file_provider_service", "read from internal storage failed", (Throwable)object2);
        return null;
    }

    private static String replaceExtension(String string2, String string3, String string4) {
        boolean bl2 = string2.endsWith(string3);
        if (bl2) {
            string2 = string2.replace(string3, string4);
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String stripSdkNameAndVersion(String string2) {
        int n3;
        int n4 = 46;
        try {
            n4 = string2.lastIndexOf(n4);
            n3 = 95;
        }
        catch (Exception exception) {
            return string2;
        }
        int n7 = string2.lastIndexOf(n3, n4) + -1;
        n3 = string2.lastIndexOf(n3, n7);
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = string2.substring(0, n3);
        stringBuilder.append(string3);
        String string4 = string2.substring(n4);
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void updateFallback(Context object, String string2, String string3) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        String string4;
        Object object6;
        block6: {
            block5: {
                String string5;
                String string6;
                String string7;
                String string8;
                String string9;
                block4: {
                    object6 = "jp_blocked_hash";
                    string4 = "latest_hash";
                    object5 = "updateFallback: we didn;t get the file name from blocked hash ";
                    object4 = "updateFallback: got the file name ";
                    object3 = "jsa";
                    boolean bl2 = string3.endsWith((String)object3);
                    if (!bl2) return;
                    bl2 = this.isFilePresent((Context)object, string3);
                    if (!bl2) return;
                    object3 = this.juspayServices;
                    object2 = UX.c("updateFallback: starting", string3, "  ", string2);
                    string9 = LOG_TAG;
                    ((JuspayServices)object3).sdkDebug(string9, (String)object2);
                    try {
                        object3 = this.decryptGunzipInternalStorage((Context)object, string3);
                        object3 = EncryptionHelper.md5((byte[])object3);
                        object2 = this.workspace;
                        string8 = "{}";
                        object2 = ((Workspace)object2).getFromSharedPreference((String)object6, string8);
                        string8 = new JSONObject((String)object2);
                        object2 = this.juspayServices;
                        string7 = "updateFallback: got the blocked hash";
                        ((JuspayServices)object2).sdkDebug(string9, string7);
                        boolean bl3 = string8.has(string2);
                        string7 = "updateFallback: file copied";
                        string6 = "updateFallback: wonderful.. copying to the fallback";
                        string5 = "fb/";
                        if (!bl3) {
                            string2 = string5.concat(string3);
                            this.copyFile((Context)object, string3, string2);
                            object = this.juspayServices;
                            string2 = ((String)object5).concat(string3);
                            ((JuspayServices)object).sdkDebug(string9, string2);
                            object = this.juspayServices;
                            ((JuspayServices)object).sdkDebug(string9, string6);
                            object = this.juspayServices;
                            ((JuspayServices)object).sdkDebug(string9, string7);
                            return;
                        }
                        object5 = this.juspayServices;
                        object2 = new StringBuilder((String)object4);
                        ((StringBuilder)object2).append(string2);
                        object4 = ((StringBuilder)object2).toString();
                        ((JuspayServices)object5).sdkDebug(string9, (String)object4);
                        object5 = string8.getJSONObject(string2);
                        boolean bl4 = object5.has(string4);
                        if (!bl4) break block4;
                        object4 = object5.getString(string4);
                        bl4 = ((String)object4).equals(object3);
                        if (bl4) return;
                    }
                    catch (Exception exception) {
                        object2 = exception;
                        break block5;
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        object2 = fileNotFoundException;
                        break block6;
                    }
                }
                object4 = this.juspayServices;
                ((JuspayServices)object4).sdkDebug(string9, string6);
                object4 = string5.concat(string3);
                this.copyFile((Context)object, string3, (String)object4);
                object5.remove(string4);
                string8.put(string2, object5);
                object = this.workspace;
                string2 = string8.toString();
                ((Workspace)object).writeToSharedPreference((String)object6, string2);
                object = this.juspayServices;
                ((JuspayServices)object).sdkDebug(string9, string7);
                return;
            }
            object6 = this.juspayServices.getSdkTracker();
            String string10 = "Exception: ";
            object3 = string10.concat(string3);
            object5 = "system";
            object4 = "auto_fallback";
            string4 = "action";
            ((SdkTracker)object6).trackException(string4, (String)object5, (String)object4, (String)object3, (Throwable)object2);
            return;
        }
        object6 = this.juspayServices.getSdkTracker();
        String string11 = "File not found: ";
        object3 = string11.concat(string3);
        object5 = "system";
        object4 = "auto_fallback";
        string4 = "action";
        ((SdkTracker)object6).trackException(string4, (String)object5, (String)object4, (String)object3, (Throwable)object2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean writeToFile(Context var1_1, File var2_9, byte[] var3_10, boolean var4_15) {
        block21: {
            block20: {
                var1_1 = "Exception writing decrypted js file ";
                var5_16 = "temp_";
                var6_18 = this.juspayServices.getSdkTracker();
                if (var4_15) ** GOTO lbl53
                var7_19 = var2_9.getName();
                var8_20 = ".jsa";
                var4_15 = var7_19.contains((CharSequence)var8_20);
                if (!var4_15) ** GOTO lbl53
                var7_19 = var2_9.getName();
                var7_19 = FileProviderService.asDecryptedJSA(var7_19);
                var9_21 = var2_9.getParentFile();
                var10_22 = new StringBuilder((String)var5_16);
                var10_22.append(var7_19);
                var5_16 = var10_22.toString();
                var8_20 = new File((File)var9_21, (String)var5_16);
                var5_16 = new FileOutputStream((File)var8_20);
                var9_21 = "v1";
                var3_10 /* !! */  = EncryptionHelper.decryptThenGunzip(var3_10 /* !! */ , (String)var9_21);
                var5_16.write(var3_10 /* !! */ );
                var3_10 /* !! */  = (byte[])new File;
                var9_21 = var2_9.getParentFile();
                var3_10 /* !! */ ((File)var9_21, var7_19);
                var8_20.renameTo((File)var3_10 /* !! */ );
                var5_16.close();
                return true;
                catch (Throwable var3_12) {
                    try {
                        var5_16.close();
                        throw var3_12;
                    }
                    catch (Throwable var5_17) {
                        try {
                            var3_12.addSuppressed(var5_17);
                            throw var3_12;
                        }
                        catch (Exception var3_11) {
                            var11_23 = var3_11;
                        }
                    }
                }
                var9_21 = "action";
                var10_22 = "system";
                var12_24 = "file_provider_service";
                var3_13 = new StringBuilder((String)var1_1);
                var3_13.append(var7_19);
                var13_25 = var3_13.toString();
                var8_20 = var6_18;
                var6_18.trackException((String)var9_21, (String)var10_22, var12_24, var13_25, var11_23);
                return true;
lbl53:
                // 2 sources

                var1_1 = new FileOutputStream((File)var2_9);
                var1_1.write(var3_10 /* !! */ );
                var1_1.close();
                return true;
                catch (Throwable var3_14) {
                    try {
                        var1_1.close();
                        throw var3_14;
                    }
                    catch (Throwable var1_5) {
                        try {
                            var3_14.addSuppressed(var1_5);
                            throw var3_14;
                        }
                        catch (Exception var1_2) {
                            var11_23 = var1_2;
                        }
                        catch (IOException var1_3) {
                            var11_23 = var1_3;
                            break block20;
                        }
                        catch (FileNotFoundException var1_4) {
                            var11_23 = var1_4;
                            break block21;
                        }
                    }
                }
                var3_10 /* !! */  = (byte[])"Exception: ";
                var1_6 = new StringBuilder((String)var3_10 /* !! */ );
                var2_9 = var2_9.getName();
                var1_6.append((String)var2_9);
                var13_26 = var1_6.toString();
                var10_22 = "system";
                var12_24 = "file_provider_service";
                var9_21 = "action";
                var8_20 = var6_18;
                var6_18.trackException((String)var9_21, (String)var10_22, var12_24, var13_26, var11_23);
                return false;
            }
            var3_10 /* !! */  = (byte[])"IOException: ";
            var1_7 = new StringBuilder((String)var3_10 /* !! */ );
            var2_9 = var2_9.getName();
            var1_7.append((String)var2_9);
            var13_27 = var1_7.toString();
            var10_22 = "system";
            var12_24 = "file_provider_service";
            var9_21 = "action";
            var8_20 = var6_18;
            var6_18.trackException((String)var9_21, (String)var10_22, var12_24, var13_27, var11_23);
            return false;
        }
        var3_10 /* !! */  = (byte[])"File not found: ";
        var1_8 = new StringBuilder((String)var3_10 /* !! */ );
        var2_9 = var2_9.getName();
        var1_8.append((String)var2_9);
        var13_28 = var1_8.toString();
        var10_22 = "system";
        var12_24 = "file_provider_service";
        var9_21 = "action";
        var8_20 = var6_18;
        var6_18.trackException((String)var9_21, (String)var10_22, var12_24, var13_28, var11_23);
        return false;
    }

    private boolean writeToFile(Context context, String object, byte[] byArray, boolean bl2) {
        String string2 = this.appendSdkNameAndVersion((String)object);
        this.updateFallback(context, (String)object, string2);
        this.deleteFileFromCache(string2);
        object = this.getFileFromInternalStorage(context, string2);
        return this.writeToFile(context, (File)object, byArray, bl2);
    }

    public void addToFileCacheWhiteList(String string2) {
        this.fileCacheWhiteList.add(string2);
    }

    public String appendSdkNameAndVersion(String charSequence) {
        int n3;
        Object object = this.juspayServices.getSdkInfo();
        int n4 = ((String)charSequence).lastIndexOf(46);
        String string2 = "_";
        if (n4 > 0 && n4 < (n3 = ((String)charSequence).length() + -1)) {
            String string3 = ((String)charSequence).substring(0, n4);
            charSequence = ((String)charSequence).substring(n4);
            StringBuilder stringBuilder = nn_2.a(string3, string2);
            string3 = ((SdkInfo)object).getSdkName();
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            object = ((SdkInfo)object).getSdkVersion();
            stringBuilder.append((String)object);
            stringBuilder.append((String)charSequence);
            return stringBuilder.toString();
        }
        charSequence = nn_2.a((String)charSequence, string2);
        String string4 = ((SdkInfo)object).getSdkName();
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(string2);
        object = ((SdkInfo)object).getSdkVersion();
        ((StringBuilder)charSequence).append((String)object);
        return ((StringBuilder)charSequence).toString();
    }

    public byte[] decryptGunzipAssetFile(Context object, String string2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        byte[] byArray = new byte[]{};
        try {
            byArray = this.getAssetFileAsByte((Context)object, string2);
        }
        catch (Exception exception) {
            object = "Exception in reading ";
            String string3 = cP.a((String)object, string2, " from assets");
            String string4 = "system";
            String string5 = "file_provider_service";
            String string6 = "action";
            sdkTracker.trackException(string6, string4, string5, string3, exception);
        }
        return EncryptionHelper.decryptThenGunzip(byArray, "v1");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] decryptGunzipInternalStorage(Context var1_1, String var2_4) {
        block11: {
            var3_5 = "FileProviderService";
            var4_6 = " from internal storage";
            var5_7 = "Read Encrypted file from internalStorage - ";
            var6_8 = "Exception in reading ";
            var7_9 = this.juspayServices.getSdkTracker();
            var8_10 = FileProviderService.asDecryptedJSA(var2_4);
            var8_10 = this.getFileFromInternalStorage(var1_1 /* !! */ , (String)var8_10);
            var9_14 = var8_10.exists();
            if (!var9_14) ** GOTO lbl46
            var10_15 = var8_10.length();
            var12_16 = (int)var10_15;
            var13_17 = new byte[var12_16];
            var14_19 = new FileInputStream((File)var8_10);
            var15_20 = var14_19.read((byte[])var13_17);
            if (var15_20 != var12_16) ** GOTO lbl21
            var14_19.close();
            return var13_17;
lbl21:
            // 1 sources

            var14_19.close();
            ** GOTO lbl46
            catch (Throwable var8_12) {
                try {
                    var14_19.close();
                    throw var8_12;
                }
                catch (Throwable var13_18) {
                    try {
                        var8_12.addSuppressed(var13_18);
                        throw var8_12;
                    }
                    catch (Exception var8_11) {
                        var16_21 = var8_11;
                    }
                }
            }
            var13_17 = "action";
            var17_22 = "system";
            var14_19 = "file_provider_service";
            try {
                var8_10 = new StringBuilder(var6_8);
                var18_23 = FileProviderService.asDecryptedJSA(var2_4);
                var8_10.append(var18_23);
                var8_10.append((String)var4_6);
                var18_23 = var8_10.toString();
                var8_10 = var7_9;
                var7_9.trackException((String)var13_17, var17_22, (String)var14_19, var18_23, var16_21);
lbl46:
                // 3 sources

                var1_1 /* !! */  = (Context)this.getInternalStorageFileAsByte(var1_1 /* !! */ , var2_4);
                var8_10 = this.juspayServices;
                var13_17 = new StringBuilder((String)var5_7);
                var13_17.append(var2_4);
                var5_7 = " with encrypted hash - ";
                var13_17.append((String)var5_7);
                var5_7 = EncryptionHelper.md5((byte[])var1_1 /* !! */ );
                var13_17.append((String)var5_7);
                var5_7 = var13_17.toString();
                var8_10.sdkDebug(var3_5, (String)var5_7);
                var5_7 = "v1";
                return EncryptionHelper.decryptThenGunzip((byte[])var1_1 /* !! */ , (String)var5_7);
            }
            catch (Exception var1_2) {
                var16_21 = var1_2;
            }
            catch (FileNotFoundException var1_3) {
                break block11;
            }
            var18_24 = cP.a(var6_8, var2_4, (String)var4_6);
            var8_13 = var7_9;
            var7_9.trackException("action", "system", "file_provider_service", var18_24, var1_2);
            return null;
        }
        var4_6 = this.juspayServices;
        var5_7 = new StringBuilder("No File to decrypt in internal storage: ");
        var5_7.append(var2_4);
        var2_4 = var5_7.toString();
        var4_6.sdkDebug(var3_5, var2_4);
        throw var1_3;
    }

    public boolean deleteFileFromInternalStorage(Context object, String string2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        Object object2 = this.juspayServices;
        RemoteAssetService remoteAssetService = ((JuspayServices)object2).getRemoteAssetService();
        object = this.getFileFromInternalStorage((Context)object, string2);
        boolean bl2 = ((File)object).exists();
        String string3 = LOG_TAG;
        if (bl2) {
            object2 = this.juspayServices;
            CharSequence charSequence = new StringBuilder("Deleting ");
            charSequence.append(string2);
            charSequence.append(" from internal storage");
            charSequence = charSequence.toString();
            ((JuspayServices)object2).sdkDebug(string3, (String)charSequence);
            JuspayLogger.e(string3, "FILE CORRUPTED. DISABLING SDK");
            object2 = new StringBuilder("Deleted file ");
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
            JuspayLogger.d(string3, (String)object2);
            String string4 = "file_provider_service";
            String string5 = "file_corrupted";
            charSequence = "warning";
            object2 = sdkTracker;
            sdkTracker.trackAction("system", (String)charSequence, string4, string5, string2);
            object2 = ".zip";
            string3 = ".jsa";
            string2 = string2.replace((CharSequence)object2, string3);
            try {
                remoteAssetService.resetMetadata(string2);
            }
            catch (Exception exception) {
                string4 = "file_provider_service";
                string5 = "Error while resetting etag";
                string3 = "action";
                charSequence = "system";
                object2 = sdkTracker;
                sdkTracker.trackException(string3, (String)charSequence, string4, string5, exception);
            }
            return ((File)object).delete();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" not found");
        object = ((StringBuilder)object).toString();
        JuspayLogger.e(string3, (String)object);
        return false;
    }

    /*
     * Exception decompiling
     */
    public byte[] getAssetFileAsByte(Context var1_1, String var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [9 : 61->66)] java.lang.Throwable
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

    public byte[] getAssetFileAsByte(String string2) {
        Context context = this.juspayServices.getContext();
        return this.getAssetFileAsByte(context, string2);
    }

    /*
     * Exception decompiling
     */
    public byte[] getInternalStorageFileAsByte(Context var1_1, String var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [16 : 108->116)] java.lang.Throwable
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

    public boolean isFilePresent(Context object, String string2) {
        boolean bl2;
        block4: {
            Object object2 = this.workspace;
            String string3 = this.appendSdkNameAndVersion(string2);
            object2 = ((Workspace)object2).open(string3);
            boolean bl3 = ((File)object2).exists();
            bl2 = true;
            if (bl3) {
                return bl2;
            }
            try {
                object = this.openAsset((Context)object, string2);
                if (object == null) break block4;
            }
            catch (IOException iOException) {
                return false;
            }
            ((InputStream)object).close();
        }
        return bl2;
    }

    public String[] listFiles(String string2) {
        return FileProviderService.listFiles(this.workspace.open(string2));
    }

    public FileProviderService$TempWriter newTempWriter(String string2) {
        Object object;
        FileProviderService$Mode fileProviderService$Mode;
        try {
            fileProviderService$Mode = FileProviderService$Mode.NEW;
        }
        catch (FileNotFoundException fileNotFoundException) {
            object = new RuntimeException(fileNotFoundException);
            throw object;
        }
        object = new FileProviderService$TempWriter(this, string2, fileProviderService$Mode);
        return object;
    }

    public FileProviderService$TempWriter reOpenTempWriter(String string2) {
        FileProviderService$Mode fileProviderService$Mode = FileProviderService$Mode.RE_OPEN;
        FileProviderService$TempWriter fileProviderService$TempWriter = new FileProviderService$TempWriter(this, string2, fileProviderService$Mode);
        return fileProviderService$TempWriter;
    }

    public String readFromCache(String object) {
        boolean bl2 = this.isFileCached((String)object);
        if (bl2) {
            String string2 = (String)this.fileCache.get(object);
            Object object2 = this.juspayServices;
            CharSequence charSequence = new StringBuilder("Returning cached value of the file: ");
            charSequence.append((String)object);
            object = charSequence.toString();
            charSequence = LOG_TAG;
            ((JuspayServices)object2).sdkDebug((String)charSequence, (String)object);
            object = this.juspayServices;
            object2 = new StringBuilder("Cached: ");
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
            ((JuspayServices)object).sdkDebug((String)charSequence, (String)object2);
            return string2;
        }
        return null;
    }

    public String readFromFile(Context context, String string2) {
        return this.readFromFile(context, string2, true);
    }

    public String readFromFile(Context object, String string2, boolean bl2) {
        boolean bl3;
        String string3;
        if (bl2) {
            string3 = this.readFromCache(string2);
        } else {
            bl2 = false;
            string3 = null;
        }
        if (string3 == null) {
            string3 = this.readFromInternalStorage((Context)object, string2);
        }
        if (string3 == null) {
            string3 = this.readFromAssets((Context)object, string2);
        }
        if ((bl3 = (object = this.fileCacheWhiteList).contains(string2)) && string3 != null) {
            this.cacheFile(string2, string3);
        }
        if (string3 == null) {
            string3 = "";
        }
        return string3;
    }

    public String readFromFile(String string2) {
        Context context = this.juspayServices.getContext();
        return this.readFromFile(context, string2, true);
    }

    public void renewFile(String string2, String string3, long l2) {
        RemoteAssetService remoteAssetService = this.juspayServices.getRemoteAssetService();
        Context context = this.juspayServices.getContext();
        remoteAssetService.renewFile(context, string2, null, string3, l2);
    }

    public boolean updateCertificate(Context context, String string2, byte[] byArray) {
        return this.writeToFile(context, string2, byArray, true);
    }

    public boolean updateFile(Context context, String string2, byte[] byArray) {
        return this.writeToFile(context, string2, byArray, false);
    }

    public boolean updateFile(String string2, byte[] byArray) {
        Context context = this.juspayServices.getContext();
        return this.writeToFile(context, string2, byArray, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String writeFileToDisk(Context object, String charSequence, String object2) {
        Exception exception2;
        String string2;
        block3: {
            string2 = LOG_TAG;
            try {
                Object object3 = Environment.DIRECTORY_DOWNLOADS;
                object = object.getExternalFilesDirs((String)object3);
                object3 = null;
                object = object[0];
                object = ((File)object).getAbsolutePath();
                object3 = new File((String)object);
                ((File)object3).mkdirs();
                object = new File((File)object3, (String)object2);
                ((File)object).createNewFile();
                boolean bl2 = ((File)object).exists();
                if (bl2) {
                    object2 = new FileWriter((File)object);
                    ((Writer)object2).write((String)charSequence);
                    ((Writer)object2).flush();
                    ((Writer)object2).close();
                    object = new JSONObject();
                    charSequence = "error";
                    object2 = "false";
                    object.put((String)charSequence, object2);
                    charSequence = "data";
                    object.put((String)charSequence, object3);
                    return object.toString();
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object = "Exception in creating the file";
            JuspayLogger.d(string2, (String)object);
            return "{\"error\":\"true\",\"data\":\"unknown_error::Exception in creating the file\"}";
        }
        charSequence = new StringBuilder("Exception in downloading the file :");
        ((StringBuilder)charSequence).append(exception2);
        charSequence = ((StringBuilder)charSequence).toString();
        JuspayLogger.d(string2, (String)charSequence);
        charSequence = new StringBuilder("unknown_error::");
        ((StringBuilder)charSequence).append(exception2);
        String string3 = ((StringBuilder)charSequence).toString();
        return cP.a("{\"error\":\"true\",\"data\":\"", string3, "\"}");
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.services;

import android.content.Context;
import android.os.AsyncTask;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.RemoteAssetService$AssetDownloadTask;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.network.NetUtils;
import in.juspay.hypersdk.utils.network.SessionizedNetUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RemoteAssetService {
    private static final String LOG_TAG = "RemoteAssetService";
    private static final JSONArray fileDownloadTimes;
    private JSONObject assetMetadata;
    private final JuspayServices juspayServices;
    private final String sdkName;
    private final Workspace workspace;

    static {
        JSONArray jSONArray;
        fileDownloadTimes = jSONArray = new JSONArray();
    }

    public RemoteAssetService(JuspayServices object) {
        Workspace workspace;
        this.juspayServices = object;
        this.workspace = workspace = ((JuspayServices)object).getWorkspace();
        this.sdkName = object = ((JuspayServices)object).getSdkInfo().getSdkName();
    }

    public static /* synthetic */ boolean access$000(RemoteAssetService remoteAssetService, Context context, String string2, String string3, long l2) {
        return remoteAssetService.getContent(context, string2, string3, l2);
    }

    public static /* synthetic */ void access$100(RemoteAssetService remoteAssetService, Context context, String string2, long l2) {
        remoteAssetService.updateCertificates(context, string2, l2);
    }

    public static /* synthetic */ JuspayServices access$200(RemoteAssetService remoteAssetService) {
        return remoteAssetService.juspayServices;
    }

    public static /* synthetic */ JSONArray access$300() {
        return fileDownloadTimes;
    }

    private String decideAndUpdateInternalStorage(Context context, byte[] byArray, String string2, String string3) {
        boolean bl2;
        boolean bl3;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        Object object = EncryptionHelper.md5(byArray);
        if (object == null) {
            object = "";
        }
        String string4 = object;
        object = this.juspayServices;
        CharSequence charSequence = new StringBuilder("hashInDisk: ");
        charSequence.append(string2);
        charSequence = charSequence.toString();
        String string5 = LOG_TAG;
        ((JuspayServices)object).sdkDebug(string5, (String)charSequence);
        object = this.juspayServices;
        charSequence = "newHash: ".concat(string4);
        ((JuspayServices)object).sdkDebug(string5, (String)charSequence);
        object = new StringBuilder("Hash of used file '");
        String string6 = BW0.b((StringBuilder)object, string3, "' is now ", string4);
        String string7 = "remote_asset_service";
        String string8 = "remote_asset_service_update_hash";
        charSequence = "system";
        string5 = "info";
        object = sdkTracker;
        sdkTracker.trackAction((String)charSequence, string5, string7, string8, string6);
        object = "'";
        if (string2 != null && (bl3 = string2.equals(string4))) {
            string6 = cP.a("Remote hash is same as disk hash. Not updating asset '", string3, (String)object);
            string7 = "remote_asset_service";
            string8 = "remote_asset_service_compare_hash";
            charSequence = "system";
            string5 = "info";
            object = sdkTracker;
            sdkTracker.trackAction((String)charSequence, string5, string7, string8, string6);
            bl2 = false;
            context = null;
        } else {
            string2 = "Remote hash differs from disk hash. Updating asset '";
            string6 = cP.a(string2, string3, (String)object);
            string7 = "remote_asset_service";
            string8 = "remote_asset_service_compare_hash";
            charSequence = "system";
            string5 = "info";
            object = sdkTracker;
            sdkTracker.trackAction((String)charSequence, string5, string7, string8, string6);
            bl2 = fileProviderService.updateFile(context, string3, byArray);
        }
        if (!bl2) {
            string4 = null;
        }
        return string4;
    }

    private byte[] download(String object, String string2) {
        Object object2 = new HashMap();
        long l2 = System.currentTimeMillis();
        Object object3 = String.valueOf(l2);
        ((HashMap)object2).put("ts", object3);
        ((HashMap)object2).put("If-None-Match", object);
        ((HashMap)object2).put("Accept-Encoding", "gzip");
        object = this.juspayServices;
        object3 = new StringBuilder("START fetching content from: ");
        ((StringBuilder)object3).append(string2);
        object3 = ((StringBuilder)object3).toString();
        String string3 = LOG_TAG;
        ((JuspayServices)object).sdkDebug(string3, (String)object3);
        object3 = this.juspayServices;
        object3 = ((JuspayServices)object3).getSessionInfo();
        string3 = null;
        object = new SessionizedNetUtils((SessionInfo)object3, 0, 0, false);
        try {
            object = ((NetUtils)object).fetchIfModified(string2, (Map)object2);
        }
        catch (Exception exception) {
            object2 = this.juspayServices.getSdkTracker();
            String string4 = "remote_asset_service";
            String string5 = "Error While Downloading File";
            object3 = LOG_TAG;
            string3 = "action";
            String string6 = "system";
            ((SdkTracker)object2).trackAndLogException((String)object3, string3, string6, string4, string5, exception);
            object = null;
        }
        return object;
    }

    private long getAssetTtl() {
        Workspace workspace = this.workspace;
        String string2 = String.valueOf(3600000L);
        return Long.parseLong(workspace.getFromSharedPreference("REMOTE_ASSET_TTL_MILLISECONDS", string2));
    }

    private boolean getContent(Context context, String string2, long l2) {
        return this.getContent(context, string2, null, l2);
    }

    private boolean getContent(Context context, String string2, String string3, long l2) {
        boolean bl2;
        String string4;
        String string5;
        RemoteAssetService remoteAssetService = this;
        Object object = context;
        Object object2 = this.juspayServices.getSessionInfo();
        Object object3 = this.juspayServices.getSdkTracker();
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        boolean bl3 = ((SessionInfo)object2).isVerifyAssetsEnabled();
        String string6 = ".jsa";
        String string7 = ".zip";
        if (!bl3) {
            object2 = string2;
            object2 = string2.replace(string7, string6);
        } else {
            object2 = string2;
        }
        String string8 = "/";
        int n3 = ((String)object2).lastIndexOf(string8);
        int n4 = 1;
        string8 = string3 == null ? ((String)object2).substring(n3 += n4) : string3;
        string6 = string8.replace(string7, string6);
        Object object4 = remoteAssetService.getMetadata(string6);
        String string9 = "lastChecked";
        String string10 = object4.getString(string9);
        String string11 = ".hash";
        String string12 = "zipHashInDisk";
        String string13 = "hashInDisk";
        if (string10 != null) {
            string10 = object4.getString(string13);
            string5 = object4.getString(string12);
        } else {
            boolean bl4 = string8.contains(string7);
            string5 = "";
            if (!bl4) {
                string10 = string8.concat(string11);
                string10 = fileProviderService.readFromFile((Context)object, string10);
            } else {
                string10 = string5;
            }
        }
        byte[] byArray = remoteAssetService.download(string5, (String)object2);
        string3 = string5;
        string5 = null;
        if (byArray != null) {
            String string14;
            string4 = string14 = EncryptionHelper.md5(byArray);
            bl2 = true;
        } else {
            string4 = string3;
            bl2 = false;
            Object var26_26 = null;
        }
        byArray = remoteAssetService.unZipAndVerify((Context)object, byArray, string8);
        if (byArray == null) {
            if (!bl2) {
                object4 = UX.c("ETAG matches for '", string8, "'. Not downloading from ", (String)object2);
                ((SdkTracker)object3).trackAction("system", "info", "remote_asset_service", "remote_asset_service_etag_match", object4);
                return false;
            }
            object3 = fileProviderService.readFromFile((Context)object, string6, false).getBytes();
            byArray = EncryptionHelper.v1Encrypt((byte[])object3);
        }
        if (byArray != null) {
            object3 = remoteAssetService.juspayServices;
            object2 = "DONE fetching content from: ".concat((String)object2);
            string5 = LOG_TAG;
            ((JuspayServices)object3).sdkDebug(string5, (String)object2);
            object2 = remoteAssetService.juspayServices;
            object3 = new String(byArray);
            string3 = string12;
            string12 = "Text: ";
            object3 = string12.concat((String)object3);
            ((JuspayServices)object2).sdkDebug(string5, (String)object3);
        } else {
            string3 = string12;
        }
        object2 = remoteAssetService.decideAndUpdateInternalStorage((Context)object, byArray, string10, string6);
        if (object2 != null) {
            boolean bl5 = string8.contains(string7);
            if (!bl5) {
                object3 = string8.concat(string11);
                fileProviderService.writeFileToDisk((Context)object, (String)object2, (String)object3);
            }
            long l3 = System.currentTimeMillis();
            object4.put(string9, l3);
            object4.put(string13, object2);
            object = string3;
            object2 = string4;
            object4.put(string3, (Object)string4);
            remoteAssetService.setMetadata(string6, (JSONObject)object4);
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void setMetadata(String object, JSONObject object2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object3;
                block3: {
                    try {
                        object3 = this.assetMetadata;
                        if (object3 != null) break block3;
                        this.getMetadata((String)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object3 = this.assetMetadata;
                object3.put((String)object, object2);
                object = this.workspace;
                object2 = this.assetMetadata;
                object2 = object2.toString();
                object3 = "asset_metadata.json";
                ((Workspace)object).writeToSharedPreference((String)object3, (String)object2);
                return;
            }
            throw throwable2;
        }
    }

    private byte[] unZipAndVerify(Context object, byte[] byArray, String string2) {
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        object = fileProviderService.getAssetFileAsByte((Context)object, "remoteAssetPublicKey");
        return RemoteAssetService.unZipAndVerify(byArray, string2, (byte[])object, sdkTracker);
    }

    /*
     * Exception decompiling
     */
    public static byte[] unZipAndVerify(byte[] var0, String var1_4, byte[] var2_13, SdkTracker var3_15) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [7, 6 : 83->87)] java.lang.Throwable
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String unzipAndUpdateInternalStorage(Context var1_1, byte[] var2_4) {
        block14: {
            var3_7 = this.juspayServices.getFileProviderService();
            var4_8 = EncryptionHelper.md5((byte[])var2_4);
            if (var4_8 == null) {
                var4_8 = "";
            }
            var6_10 = new ByteArrayInputStream((byte[])var2_4);
            var5_9 = new ZipInputStream((InputStream)var6_10);
            while (true) {
                while ((var2_4 = (Object)var5_9.getNextEntry()) != null) {
                    var6_10 = var2_4.getName();
                    var7_11 = var2_4.isDirectory();
                    if (var7_11) continue;
                    var2_4 = new ByteArrayOutputStream();
                    ** GOTO lbl18
                }
                break;
                {
                    block15: {
                        catch (Throwable var1_3) {
                            break block14;
                        }
lbl18:
                        // 1 sources

                        try {
                            while ((var8_12 = var5_9.read()) != (var9_13 = -1)) {
                                var2_4.write(var8_12);
                            }
                        }
                        catch (Throwable var1_2) {
                            break block15;
                        }
                        var10_14 = var2_4.toByteArray();
                        var3_7.updateCertificate(var1_1, (String)var6_10, var10_14);
                        {
                            var2_4.close();
                            continue;
                        }
                    }
                    try {
                        var2_4.close();
                        throw var1_2;
                    }
                    catch (Throwable var2_5) {}
                    {
                        var1_2.addSuppressed(var2_5);
                        throw var1_2;
                    }
                }
                break;
            }
            var5_9.close();
            return var4_8;
        }
        try {
            var5_9.close();
            throw var1_3;
        }
        catch (Throwable var2_6) {
            var1_3.addSuppressed(var2_6);
        }
        throw var1_3;
    }

    private void updateCertificates(Context context, String string2, long l2) {
        Object object;
        boolean bl2;
        String string3;
        CharSequence charSequence;
        RemoteAssetService remoteAssetService = this;
        Object object2 = context;
        String string4 = string2;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        JSONObject jSONObject = this.getMetadata(string2);
        int n3 = string2.lastIndexOf("/");
        int n4 = 1;
        String string5 = string2.substring(n3 += n4);
        String string6 = "lastChecked";
        Object object3 = jSONObject.getString(string6);
        Object object4 = "zipHashInDisk";
        String string7 = "hashInDisk";
        if (object3 != null) {
            object3 = jSONObject.getString(string7);
            charSequence = jSONObject.getString((String)object4);
        } else {
            object3 = "";
            charSequence = object3;
        }
        Object object5 = remoteAssetService.download((String)charSequence, string4);
        if (object5 != null) {
            charSequence = EncryptionHelper.md5(object5);
            string3 = charSequence;
            bl2 = true;
        } else {
            n4 = 0;
            object = null;
            string3 = charSequence;
            bl2 = false;
        }
        Object object6 = remoteAssetService.unZipAndVerify((Context)object2, (byte[])object5, string5);
        object = remoteAssetService.juspayServices;
        charSequence = "DONE fetching content from: ".concat(string4);
        object5 = LOG_TAG;
        ((JuspayServices)object).sdkDebug((String)object5, (String)charSequence);
        object = remoteAssetService.juspayServices;
        byte[] byArray = object6;
        charSequence = new StringBuilder("hashInDisk: ");
        ((StringBuilder)charSequence).append((String)object3);
        object3 = ((StringBuilder)charSequence).toString();
        ((JuspayServices)object).sdkDebug((String)object5, (String)object3);
        remoteAssetService.juspayServices.sdkDebug((String)object5, "newHash: ");
        object3 = new StringBuilder("Hash of used file '");
        ((StringBuilder)object3).append(string5);
        ((StringBuilder)object3).append("' is now ");
        String string8 = ((StringBuilder)object3).toString();
        object5 = "remote_asset_service";
        object6 = "remote_asset_service_update_hash";
        object = "system";
        charSequence = "info";
        object3 = sdkTracker;
        String string9 = object4;
        object4 = byArray;
        String string10 = string3;
        string3 = string8;
        sdkTracker.trackAction((String)object, (String)charSequence, (String)object5, (String)object6, string8);
        if (byArray == null) {
            if (!bl2) {
                object2 = "ETAG matches for '";
                string3 = UX.c((String)object2, string5, "'. Not downloading from ", string4);
                object5 = "remote_asset_service";
                object6 = "remote_asset_service_etag_match";
                object = "system";
                charSequence = "info";
                sdkTracker.trackAction((String)object, (String)charSequence, (String)object5, (String)object6, string3);
            }
        } else {
            object2 = remoteAssetService.unzipAndUpdateInternalStorage((Context)object2, byArray);
            long l3 = System.currentTimeMillis();
            jSONObject.put(string6, l3);
            jSONObject.put(string7, object2);
            object2 = string9;
            charSequence = string10;
            jSONObject.put(string9, (Object)string10);
            remoteAssetService.setMetadata(string4, jSONObject);
        }
    }

    public boolean getContent(Context context, String string2) {
        long l2 = this.getAssetTtl();
        return this.getContent(context, string2, l2);
    }

    public JSONArray getFileDownloadTimes() {
        return fileDownloadTimes;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject getMetadata(String var1_1) {
        var2_4 = "assetMetadata: ";
        synchronized (this) {
            block7: {
                var3_5 = this.juspayServices;
                var4_6 = var3_5.getSdkTracker();
                var5_7 = this.workspace;
                var6_9 = "asset_metadata.json";
                var7_11 = "{}";
                var5_7 = var5_7.getFromSharedPreference(var6_9, var7_11);
                var3_5 = new JSONObject((String)var5_7);
                this.assetMetadata = var3_5;
                var3_5 = this.juspayServices;
                var4_6 = new StringBuilder((String)var2_4);
                var2_4 = this.assetMetadata;
                var4_6.append(var2_4);
                ** GOTO lbl20
                {
                    catch (Throwable var1_2) {
                        break block7;
                    }
lbl20:
                    // 1 sources

                    var2_4 = var4_6.toString();
                    var4_6 = "RemoteAssetService";
                    var3_5.sdkDebug((String)var4_6, (String)var2_4);
                    var2_4 = this.assetMetadata;
                    var8_13 = var2_4.has((String)var1_1);
                    if (!var8_13) {
                        var2_4 = this.assetMetadata;
                        var3_5 = new JSONObject();
                        var2_4.put((String)var1_1, var3_5);
                        var2_4 = this.assetMetadata;
                        var2_4 = var2_4.get((String)var1_1);
                        var2_4 = (JSONObject)var2_4;
                        var3_5 = "lastChecked";
                        var4_6 = null;
                        var2_4.put((String)var3_5, 0);
                        var2_4 = this.assetMetadata;
                        var2_4 = var2_4.get((String)var1_1);
                        var2_4 = (JSONObject)var2_4;
                        var3_5 = "hashInDisk";
                        var4_6 = "";
                        var2_4.put((String)var3_5, var4_6);
                        var2_4 = this.assetMetadata;
                        var2_4 = var2_4.get((String)var1_1);
                        var2_4 = (JSONObject)var2_4;
                        var3_5 = "zipHashInDisk";
                        var4_6 = "";
                        var2_4.put((String)var3_5, var4_6);
                    }
                    var2_4 = this.assetMetadata;
                    var1_1 = var2_4.get((String)var1_1);
                    return (JSONObject)var1_1;
                    catch (JSONException var1_3) {}
                    var5_8 = "RemoteAssetService";
                    var6_10 = "action";
                    var7_12 = "system";
                    var9_14 = "remote_asset_service";
                    var10_15 = "Exception trying to read from KeyStore: asset_metadata.json";
                    {
                        var4_6.trackAndLogException(var5_8, var6_10, var7_12, var9_14, var10_15, var1_3);
                        var3_5 = "Unexpected internal error.";
                        var2_4 = new RuntimeException((String)var3_5, var1_3);
                        throw var2_4;
                    }
                }
            }
            throw var1_2;
        }
    }

    public void renewFile(Context context, String string2, String string3, long l2) {
        long l3 = this.getAssetTtl();
        this.renewFile(context, string2, string3, l3, null, l2);
    }

    public void renewFile(Context context, String string2, String string3, long l2, String string4, long l3) {
        RemoteAssetService$AssetDownloadTask remoteAssetService$AssetDownloadTask;
        Object object = this.juspayServices;
        Object[] objectArray = new StringBuilder("Looking to renew file: ");
        objectArray.append(string2);
        objectArray = objectArray.toString();
        object.sdkDebug(LOG_TAG, (String)objectArray);
        object = remoteAssetService$AssetDownloadTask;
        objectArray = context;
        remoteAssetService$AssetDownloadTask = new RemoteAssetService$AssetDownloadTask(context, string2, string4, string3, l2, this, l3);
        object = AsyncTask.THREAD_POOL_EXECUTOR;
        objectArray = new Void[]{};
        remoteAssetService$AssetDownloadTask.executeOnExecutor((Executor)object, objectArray);
    }

    public void renewFile(Context context, String string2, String string3, String string4, long l2) {
        long l3 = this.getAssetTtl();
        this.renewFile(context, string2, string3, l3, string4, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void resetMetadata(String object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        object2 = this.assetMetadata;
                        if (object2 != null) break block3;
                        this.getMetadata((String)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = this.assetMetadata;
                object2.remove((String)object);
                object = this.workspace;
                object2 = this.assetMetadata;
                object2 = object2.toString();
                String string2 = "asset_metadata.json";
                ((Workspace)object).writeToSharedPreference(string2, (String)object2);
                return;
            }
            throw throwable2;
        }
    }
}


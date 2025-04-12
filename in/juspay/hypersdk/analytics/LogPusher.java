/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import android.util.Log;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.analytics.LogChannel;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.analytics.LogPusher$IterableJSONArray;
import in.juspay.hypersdk.analytics.LogPusher$LogPushTimerTask;
import in.juspay.hypersdk.analytics.LogUtils;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.security.JOSEUtils;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.JuspayHttpsResponse;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LogPusher {
    private static final String TAG = "LogPusher";
    private final Map channels;
    private JSONObject channelsFromSdkConfig;
    private boolean isSandboxEnv = false;
    private final JSONArray logChannelsConfig;
    private final LogConfig logConfig;
    private int logFlushTimerTaskErrorCounter = 0;
    private int setHeaderParametersErrorCounter = 0;
    private boolean stopPushingLogs = false;
    private final Workspace workspace;

    public LogPusher(Workspace object, LogConfig logConfig) {
        JSONObject jSONObject;
        this.channels = jSONObject = new HashMap();
        this.channelsFromSdkConfig = jSONObject = new JSONObject();
        this.logChannelsConfig = jSONObject;
        this.workspace = object;
        this.logConfig = logConfig;
        object = logConfig.channels;
        this.channelsFromSdkConfig = object;
        object = new nw1_2(this);
        ExecutorManager.runOnLogsPool((Runnable)object);
    }

    public static /* synthetic */ void a(LogPusher logPusher, String string2, JSONObject jSONObject) {
        logPusher.lambda$setLogHeaderValues$4(string2, jSONObject);
    }

    public static /* synthetic */ int access$100(LogPusher logPusher, JSONArray jSONArray, LogChannel logChannel) {
        return logPusher.pushLogsToServer(jSONArray, logChannel);
    }

    private boolean addChannel(String string2, int n3, long l2, String object, String charSequence, JSONObject jSONObject, JSONObject jSONObject2, Map map2, int n4, String string3, String string4) {
        Map map3 = this.channels;
        boolean bl2 = map3.containsKey(string2);
        Object object2 = this.makeChannel(string2, n3, l2, (String)object, (String)charSequence, jSONObject, jSONObject2, map2, n4, string3, string4);
        Object object3 = this.channels;
        object3.put(string2, object2);
        if (!bl2) {
            object3 = this.workspace;
            String string5 = "LOG_CHANNEL_NAMES";
            object = "";
            object3 = ((Workspace)object3).getFromSharedPreference(string5, (String)object);
            charSequence = Ex0.a((String)object3);
            int n7 = ((String)object3).length();
            if (n7 != 0) {
                object = ",";
            }
            object3 = h30_0.a((StringBuilder)charSequence, (String)object, string2);
            object = this.workspace;
            ((Workspace)object).writeToSharedPreference(string5, (String)object3);
        }
        object3 = this.workspace;
        string2 = kp1_0.c("LOG_CHANNEL_INFO_", string2);
        object2 = ((LogChannel)object2).toString();
        ((Workspace)object3).writeToSharedPreference(string2, (String)object2);
        return true;
    }

    public static /* synthetic */ void b(LogPusher logPusher, Queue queue) {
        logPusher.lambda$addLogsFromSessioniser$1(queue);
    }

    public static /* synthetic */ void c(LogPusher logPusher, JSONObject jSONObject) {
        logPusher.lambda$addLogsToPersistedQueue$0(jSONObject);
    }

    public static /* synthetic */ void d(LogPusher logPusher) {
        logPusher.loadSavedChannels();
    }

    public static /* synthetic */ void e(LogPusher logPusher, String string2, JSONObject jSONObject) {
        logPusher.lambda$setHeaders$3(string2, jSONObject);
    }

    public static /* synthetic */ void f(LogPusher logPusher, Iterable iterable) {
        logPusher.lambda$addLogLines$2(iterable);
    }

    private String getEndPoint(LogChannel object) {
        boolean bl2 = this.isSandboxEnv;
        object = bl2 ? ((LogChannel)object).getEndpointSBX() : ((LogChannel)object).getEndPointProd();
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private JSONArray getLogChannels(JSONObject object) {
        void var2_16;
        int n3;
        void var2_12;
        String string2;
        boolean bl2;
        void var2_10;
        JSONArray jSONArray = new JSONArray();
        String string3 = "channels";
        int n4 = object.has(string3);
        if (n4 != 0) {
            JSONArray jSONArray2 = object.optJSONArray(string3);
        }
        string3 = "default";
        if ((var2_10 == null || (n4 = var2_10.length()) == 0) && (bl2 = object.has(string2 = "channel"))) {
            if (var2_10 == null) {
                JSONArray jSONArray3 = new JSONArray();
            }
            String string4 = object.optString(string2, string3);
            var2_12.put((Object)string4);
        }
        if (var2_12 == null || (n3 = var2_12.length()) == 0) {
            void var1_6;
            JSONArray jSONArray4 = this.logConfig.defaultChannels;
            if (jSONArray4 != null) {
                String string5 = this.logConfig.defaultChannels.toString();
                JSONArray jSONArray5 = new JSONArray(string5);
            } else {
                JSONArray jSONArray6 = new JSONArray();
            }
            void var2_15 = var1_6;
            var1_6.put((Object)string3);
        }
        return var2_16;
    }

    private RSAPublicKey getLogEncryptionKey(LogChannel logChannel) {
        boolean bl2 = this.isSandboxEnv;
        logChannel = bl2 ? logChannel.getKeySBX() : logChannel.getKeyProd();
        try {
            return JOSEUtils.JWKtoRSAPublicKey((JSONObject)logChannel);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String getLogEncryptionLevel(LogChannel logChannel) {
        return logChannel.getEncryptionLevel();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List getSNRanges(JSONArray object) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int n3;
        Object object2;
        Object object3;
        int n4;
        int n7;
        Object object4 = new TreeSet();
        Object object5 = null;
        for (n7 = 0; n7 < (n4 = object.length()); ++n7) {
            JSONException jSONException2;
            block7: {
                block6: {
                    try {
                        object3 = object.getJSONObject(n7);
                        object2 = "sn";
                        n4 = object3.getInt((String)object2);
                        object2 = n4;
                        n3 = ((TreeSet)object4).contains(object2);
                        if (n3 == 0) break block6;
                        object2 = TAG;
                        charSequence2 = new StringBuilder();
                        charSequence = "Duplicate SN in logs: ";
                        ((StringBuilder)charSequence2).append((String)charSequence);
                        ((StringBuilder)charSequence2).append(n4);
                        charSequence2 = ((StringBuilder)charSequence2).toString();
                        JuspayLogger.w((String)object2, (String)charSequence2);
                    }
                    catch (JSONException jSONException2) {
                        break block7;
                    }
                }
                object3 = n4;
                ((TreeSet)object4).add(object3);
                continue;
            }
            object4 = new RuntimeException(jSONException2);
            throw object4;
        }
        object = new ArrayList();
        n7 = (int)(((TreeSet)object4).isEmpty() ? 1 : 0);
        if (n7 == 0) {
            object5 = (Integer)((TreeSet)object4).first();
            n7 = (Integer)object5;
            object3 = (Integer)((TreeSet)object4).first() + 1;
            object4 = ((TreeSet)object4).tailSet(object3).iterator();
            n4 = n7;
            while (true) {
                n3 = object4.hasNext();
                charSequence2 = "-";
                if (n3 == 0) break;
                int n8 = n7 + 1;
                object2 = (Integer)object4.next();
                n3 = (Integer)object2;
                if (n8 != n3) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(n4);
                    ((StringBuilder)charSequence).append((String)charSequence2);
                    ((StringBuilder)charSequence).append(n7);
                    object5 = ((StringBuilder)charSequence).toString();
                    ((ArrayList)object).add(object5);
                    n4 = n3;
                }
                n7 = n3;
            }
            object4 = new StringBuilder();
            ((StringBuilder)object4).append(n4);
            ((StringBuilder)object4).append((String)charSequence2);
            ((StringBuilder)object4).append(n7);
            object4 = ((StringBuilder)object4).toString();
            ((ArrayList)object).add(object4);
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$addLogLines$2(Iterable var1_1) {
        block16: {
            block13: {
                var2_2 = this;
                var3_3 = "PERSISTENT_LOGS_WRITING_FILE";
                var4_4 = ".dat";
                var5_5 = "juspay-logs-queue-";
                try {
                    var6_6 = var1_1.iterator();
lbl7:
                    // 4 sources

                    while ((var7_7 = var6_6.hasNext()) != 0) {
                        var8_8 /* !! */  = var6_6.next();
                        var8_8 /* !! */  = (JSONObject)var8_8 /* !! */ ;
                        break block13;
                    }
                    return;
                }
                catch (Exception var8_11) {
                    var2_2.logFlushTimerTaskErrorCounter = var7_7 = var2_2.logFlushTimerTaskErrorCounter + 1;
                    var39_39 = 2;
                    if (var7_7 > var39_39) return;
                    var40_40 = "log_pusher";
                    var41_41 = "Exception while flushing the logs to persisted queue file";
                    var42_42 = "LogPusher";
                    var43_43 = "action";
                    var44_44 = "system";
                    SdkTracker.trackAndLogBootException(var42_42, var43_43, var44_44, var40_40, var41_41, var8_11);
                    return;
                }
            }
            try {
                var9_12 = var2_2.shouldDropLog((JSONObject)var8_8 /* !! */ );
                if (var9_12) ** GOTO lbl7
                var10_13 = var2_2.getLogChannels((JSONObject)var8_8 /* !! */ );
                var11_14 = 0;
lbl29:
                // 2 sources

                while (var11_14 < (var12_15 = var10_13.length())) {
                    block14: {
                        var14_17 = var2_2.channels;
                        var13_16 = var10_13.getString(var11_14);
                        var15_18 = var14_17.containsKey(var13_16);
                        if (!var15_18) {
                            while (true) {
                                var14_17 = var6_6;
                                break block14;
                                break;
                            }
                        }
                        var14_17 = var2_2.getChannelObject(var13_16);
                        var17_20 /* !! */  = new StringBuilder();
                        var17_20 /* !! */ .append(var3_3);
                        var17_20 /* !! */ .append(var13_16);
                        var17_20 /* !! */  = var17_20 /* !! */ .toString();
                        var18_21 = var2_2.workspace;
                        var19_22 = LogUtils.getFromSharedPreference((String)var17_20 /* !! */ , (Workspace)var18_21);
                        var20_23 = -1;
                        if (var19_22 == var20_23) {
                            var19_22 = 0;
                            var17_20 /* !! */  = null;
                        }
                        if (var14_17 == null) ** continue;
                        var18_21 = new StringBuilder();
                        var18_21.append(var8_8 /* !! */ );
                        var21_24 = "LOG_DELIMITER";
                        var18_21.append((String)var21_24);
                        var18_21 = var18_21.toString();
                        var21_24 = StandardCharsets.UTF_8;
                        var18_21 = var18_21.getBytes((Charset)var21_24);
                        var22_25 = var2_2.workspace;
                        var23_26 = new StringBuilder();
                        var23_26.append(var5_5);
                        var23_26.append(var13_16);
                        var23_26.append(var19_22);
                        var23_26.append(var4_4);
                        var23_26 = var23_26.toString();
                        var23_26 = var22_25.openInCache((String)var23_26);
                        var24_27 = var23_26.length();
                        var23_26 = var8_8 /* !! */ .toString();
                        var23_26 = var23_26.getBytes((Charset)var21_24);
                        var14_17.addToLogsQueue((byte[])var23_26);
                        var26_28 = ((Object)var18_21).length;
                        var14_17 = var6_6;
                        var27_29 = var26_28;
                        var24_27 += var27_29;
                        try {
                            var23_26 = var2_2.logConfig;
                            var27_29 = var23_26.maxLogFileSize;
                            var16_19 = (int)(var24_27 == var27_29 ? 0 : (var24_27 < var27_29 ? -1 : 1));
                            if (var16_19 > 0) ** break block15
                            var23_26 = var2_2.workspace;
                            var29_30 = new StringBuilder();
                            var29_30.append(var5_5);
                            var29_30.append(var13_16);
                            var29_30.append(var19_22);
                            var29_30.append(var4_4);
                            var29_30 = var29_30.toString();
                            var23_26 = var23_26.openInCache((String)var29_30);
                            var30_31 = true;
                            var29_30 = new FileOutputStream((File)var23_26, var30_31);
                            var29_30.write((byte[])var18_21);
                            var29_30.close();
                        }
                        catch (Exception var8_9) {
                            ** GOTO lbl-1000
                        }
                    }
                    var16_19 = var11_14;
                    break block16;
                }
                ** GOTO lbl7
            }
            catch (Exception var8_10) {
                var14_17 = var6_6;
                ** GOTO lbl-1000
            }
            {
                var31_32 = ((Object)var18_21).length;
                var27_29 = var31_32;
                var16_19 = var11_14;
                var32_33 = var23_26.maxLogLineSize;
                cfr_temp_0 = var27_29 - var32_33;
                var26_28 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var26_28 > 0) break block16;
                var23_26 = var2_2.workspace;
                var29_30 = new StringBuilder();
                var29_30.append(var3_3);
                var29_30.append(var13_16);
                var29_30 = var29_30.toString();
                var6_6 = String.valueOf(var19_22);
                var23_26.writeToSharedPreference((String)var29_30, (String)var6_6);
                var23_26 = var2_2.workspace;
                var29_30 = new StringBuilder();
                var29_30.append(var5_5);
                var29_30.append(var13_16);
                var29_30.append(var19_22);
                var29_30.append(var4_4);
                var29_30 = var29_30.toString();
                var23_26 = var23_26.openInCache((String)var29_30);
                var30_31 = true;
                var29_30 = new FileOutputStream((File)var23_26, var30_31);
                var29_30.write((byte[])var18_21);
                var29_30.close();
                break block16;
                break;
            }
        }
        var11_14 = var16_19 + 1;
        var6_6 = var14_17;
        ** GOTO lbl29
lbl-1000:
        // 2 sources

        {
            var7_7 = var2_2.logFlushTimerTaskErrorCounter;
            var26_28 = 1;
            var2_2.logFlushTimerTaskErrorCounter = var7_7 += var26_28;
            var26_28 = 2;
            if (var7_7 <= var26_28) {
                var34_34 = "LogPusher";
                var35_35 = "action";
                var36_36 = "system";
                var37_37 = "log_pusher";
                var38_38 = "Exception while flushing the logs to persisted queue file";
                SdkTracker.trackAndLogBootException(var34_34, var35_35, var36_36, var37_37, var38_38, var8_8 /* !! */ );
            }
            var6_6 = var14_17;
            ** GOTO lbl7
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$addLogsFromSessioniser$1(Queue iterator) {
        try {
            LogConfig logConfig = this.logConfig;
            boolean bl2 = logConfig.shouldPush;
            if (!bl2) {
                return;
            }
            iterator = iterator.iterator();
            while (bl2 = iterator.hasNext()) {
                int n3;
                logConfig = iterator.next();
                boolean bl3 = this.shouldDropLog((JSONObject)(logConfig = (JSONObject)logConfig));
                if (bl3) continue;
                JSONArray jSONArray = this.getLogChannels((JSONObject)logConfig);
                for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
                    Object object = this.channels;
                    Object object2 = jSONArray.getString(i3);
                    boolean bl4 = object.containsKey(object2);
                    if (!bl4) continue;
                    object2 = this.getChannelObject((String)object2);
                    object = logConfig.toString();
                    Charset charset = StandardCharsets.UTF_8;
                    object = ((String)object).getBytes(charset);
                    int n4 = ((Object)object).length;
                    long l2 = n4;
                    LogConfig logConfig2 = this.logConfig;
                    long l3 = logConfig2.maxLogLineSize;
                    long l4 = l2 - l3;
                    Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object3 > 0) continue;
                    ((LogChannel)object2).addToLogsQueue((byte[])object);
                }
            }
            return;
        }
        catch (Exception exception) {}
    }

    private /* synthetic */ void lambda$addLogsToPersistedQueue$0(JSONObject object) {
        block18: {
            Object object2 = this.logConfig;
            boolean bl2 = ((LogConfig)object2).shouldPush;
            if (!bl2) {
                return;
            }
            object2 = JuspayCoreLib.getApplicationContext();
            if (object2 == null) break block18;
            Object object3 = JuspayCoreLib.getApplicationContext();
            object3 = object3.getCacheDir();
            String string2 = "juspay-crash-logFile.dat";
            object2 = new File((File)object3, string2);
            object3 = new StringBuilder();
            object = object.toString();
            ((StringBuilder)object3).append((String)object);
            object = "LOG_DELIMITER";
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            object3 = StandardCharsets.UTF_8;
            object = object.getBytes((Charset)object3);
            int n3 = ((JSONObject)object).length;
            long l2 = n3;
            LogConfig logConfig = this.logConfig;
            long l3 = logConfig.maxLogLineSize;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 >= 0) break block18;
            boolean bl3 = true;
            object3 = new FileOutputStream((File)object2, bl3);
            try {
                ((FileOutputStream)object3).write((byte[])object);
                ((FileOutputStream)object3).close();
            }
            catch (Exception exception) {
                object2 = TAG;
                object3 = "addLogsToPersistedQueue failed";
                JuspayLogger.e((String)object2, (String)object3, exception);
            }
        }
    }

    private /* synthetic */ void lambda$setHeaders$3(String object, JSONObject jSONObject) {
        boolean bl2;
        object = this.getChannelObject((String)object);
        Iterator iterator = jSONObject.keys();
        while (bl2 = iterator.hasNext()) {
            Map map2;
            String string2 = (String)iterator.next();
            try {
                map2 = ((LogChannel)object).getHeaders();
            }
            catch (JSONException jSONException) {}
            String string3 = jSONObject.getString(string2);
            map2.put(string2, string3);
        }
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void lambda$setLogHeaderValues$4(String var1_1, JSONObject var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [17 : 255->259)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void loadSavedChannels() {
        int n3;
        Object object;
        JSONArray jSONArray;
        Object object2;
        Object object3;
        LogPusher logPusher = this;
        LogConfig logConfig = this.logConfig;
        int n4 = logConfig.shouldPush;
        if (n4 == 0) {
            return;
        }
        JSONObject jSONObject = this.channelsFromSdkConfig;
        if (jSONObject != null) {
            object3 = jSONObject.keys();
            while ((n4 = object3.hasNext()) != 0) {
                String string2 = (String)object3.next();
                try {
                    object2 = logPusher.channelsFromSdkConfig;
                    object2 = object2.get(string2);
                    object2 = object2.toString();
                    logPusher.addChannelFromJS((String)object2, string2);
                }
                catch (JSONException jSONException) {
                    String string3 = Log.getStackTraceString((Throwable)jSONException);
                    object2 = TAG;
                    JuspayLogger.e((String)object2, string3);
                }
            }
        }
        if ((jSONArray = logPusher.logChannelsConfig) != null) {
            Object var2_8 = null;
            try {
                for (n4 = 0; n4 < (n3 = (object3 = logPusher.logChannelsConfig).length()); object3 = object3.getString((String)object), ++n4) {
                    object3 = logPusher.logChannelsConfig;
                    object3 = object3.getJSONObject(n4);
                    object2 = object3.toString();
                    object = "channel";
                    logPusher.addChannelFromJS((String)object2, (String)object3);
                }
            }
            catch (JSONException jSONException) {}
        }
        Workspace workspace = logPusher.workspace;
        object3 = "LOG_CHANNEL_NAMES";
        Object object4 = "";
        String[] stringArray = workspace.getFromSharedPreference((String)object3, (String)object4).split(",");
        logPusher.workspace.writeToSharedPreference((String)object3, (String)object4);
        object3 = logPusher.logConfig;
        int n7 = ((LogConfig)object3).maxRetryPerBatch;
        long l2 = ((LogConfig)object3).maxLogsPerPush;
        Object object5 = ((LogConfig)object3).prodLogUrl;
        Object object6 = ((LogConfig)object3).sandboxLogUrl;
        JSONObject jSONObject2 = ((LogConfig)object3).publicKey;
        JSONObject jSONObject3 = ((LogConfig)object3).publicKeySandbox;
        Object object7 = new HashMap();
        object3 = logPusher.logConfig;
        int n8 = ((LogConfig)object3).defaultPriority;
        String string4 = ((LogConfig)object3).encryptionLevel;
        object2 = "default";
        String string5 = "all";
        object3 = this;
        Object object8 = string4;
        string4 = string5;
        String string6 = object4;
        object4 = object8;
        this.addChannel((String)object2, n7, l2, (String)object5, (String)object6, jSONObject2, jSONObject3, (Map)object7, n8, string5, (String)object8);
        object3 = "default";
        object8 = logPusher.getChannelObject((String)object3);
        int n10 = stringArray.length;
        int n14 = 0;
        string4 = null;
        while (true) {
            void var19_37;
            void var29_47;
            int n15;
            block23: {
                block25: {
                    block26: {
                        void var24_42;
                        void var2_12;
                        block24: {
                            Object object9;
                            if (n14 >= n10) {
                                LogConfig logConfig2 = logPusher.logConfig;
                                n7 = logConfig2.maxRetryPerBatch;
                                l2 = logConfig2.maxLogsPerPush;
                                object5 = logConfig2.prodLogUrl;
                                object6 = logConfig2.sandboxLogUrl;
                                jSONObject2 = ((LogChannel)object8).getKeyProd();
                                jSONObject3 = ((LogChannel)object8).getKeySBX();
                                object7 = ((LogChannel)object8).getHeaders();
                                object4 = logPusher.logConfig.encryptionLevel;
                                object3 = this;
                                LogChannel logChannel = this.makeChannel("", n7, l2, (String)object5, (String)object6, jSONObject2, jSONObject3, (Map)object7, 1, "all", (String)object4);
                                logPusher.pushOldChannelLogs(logChannel);
                                return;
                            }
                            var24_42 = var2_12[n14];
                            object3 = logPusher.workspace;
                            object = "LOG_CHANNEL_INFO_";
                            object2 = new StringBuilder((String)object);
                            ((StringBuilder)object2).append((String)var24_42);
                            object2 = ((StringBuilder)object2).toString();
                            object3 = ((Workspace)object3).getFromSharedPreference((String)object2, string6);
                            object2 = logPusher.channels;
                            int n16 = object2.containsKey(var24_42);
                            if (n16 == 0) {
                                object2 = logPusher.workspace;
                                object9 = new StringBuilder((String)object);
                                ((StringBuilder)object9).append((String)var24_42);
                                object = ((StringBuilder)object9).toString();
                                ((Workspace)object2).removeFromSharedPreference((String)object);
                            }
                            if ((n16 = ((String)object3).length()) == 0) break block24;
                            try {
                                object2 = new JSONObject((String)object3);
                                object3 = "retryAttempts";
                                object = logPusher.logConfig;
                                n7 = ((LogConfig)object).maxRetryPerBatch;
                                n7 = object2.optInt((String)object3, n7);
                                object3 = "batchCount";
                                object9 = logPusher.logConfig;
                                l2 = ((LogConfig)object9).maxLogsPerPush;
                                l2 = object2.optLong((String)object3, l2);
                                object3 = "logsUrlKey";
                                object5 = logPusher.logConfig;
                                object5 = ((LogConfig)object5).prodLogUrl;
                                object5 = object2.optString((String)object3, (String)object5);
                                object3 = "logsUrlKeySandbox";
                                object6 = logPusher.logConfig;
                                object6 = ((LogConfig)object6).sandboxLogUrl;
                                object6 = object2.optString((String)object3, (String)object6);
                                object3 = "publicKey";
                                jSONObject2 = object2.getJSONObject((String)object3);
                                object3 = "publicKeySandbox";
                                jSONObject3 = object2.getJSONObject((String)object3);
                                object7 = "headers";
                                object7 = object2.getString((String)object7);
                                object3 = new JSONObject((String)object7);
                                object7 = LogUtils.toMap((JSONObject)object3);
                                object3 = "priority";
                                void var19_35 = var2_12;
                            }
                            catch (JSONException jSONException) {}
                            try {
                                LogConfig logConfig3 = logPusher.logConfig;
                                n4 = logConfig3.defaultPriority;
                                n4 = object2.optInt((String)object3, n4);
                                object3 = "environment";
                                n15 = n14;
                                string4 = "all";
                            }
                            catch (JSONException jSONException) {}
                            string4 = object2.optString((String)object3, string4);
                            object3 = "encryptionLevel";
                            int n17 = n10;
                            object4 = logPusher.logConfig;
                            object4 = ((LogConfig)object4).encryptionLevel;
                            object4 = object2.optString((String)object3, (String)object4);
                            object3 = this;
                            object2 = var24_42;
                            var29_47 = var24_42;
                            n8 = n4;
                            n4 = n14;
                            n15 = n10;
                            try {
                                object3 = this.makeChannel((String)var24_42, n7, l2, (String)object5, (String)object6, jSONObject2, jSONObject3, (Map)object7, n8, string4, (String)object4);
                                break block23;
                            }
                            catch (JSONException jSONException) {}
                            catch (JSONException jSONException) {
                                var29_47 = var24_42;
                                n4 = n15;
                                n15 = n17;
                            }
                            break block25;
                            catch (JSONException jSONException) {
                                var29_47 = var24_42;
                                n4 = n15;
                            }
                            break block26;
                        }
                        void var19_36 = var2_12;
                        var29_47 = var24_42;
                        n4 = n14;
                    }
                    n15 = n10;
                }
                n3 = 0;
                object3 = null;
            }
            if (object3 == null) {
                object3 = logPusher.logConfig;
                n7 = ((LogConfig)object3).maxRetryPerBatch;
                l2 = ((LogConfig)object3).maxLogsPerPush;
                object5 = ((LogConfig)object3).prodLogUrl;
                object6 = ((LogConfig)object3).sandboxLogUrl;
                jSONObject2 = ((LogChannel)object8).getKeyProd();
                jSONObject3 = ((LogChannel)object8).getKeySBX();
                object7 = ((LogChannel)object8).getHeaders();
                object4 = logPusher.logConfig.encryptionLevel;
                n8 = 1;
                string4 = "all";
                object3 = this;
                object2 = var29_47;
                object3 = this.makeChannel((String)var29_47, n7, l2, (String)object5, (String)object6, jSONObject2, jSONObject3, (Map)object7, n8, string4, (String)object4);
            }
            logPusher.pushOldChannelLogs((LogChannel)object3);
            n14 = n4 + 1;
            void var2_15 = var19_37;
            n10 = n15;
        }
    }

    private LogChannel makeChannel(String string2, int n3, long l2, String string3, String string4, JSONObject jSONObject, JSONObject jSONObject2, Map map2, int n4, String string5, String string6) {
        LogChannel logChannel = new LogChannel(n3, l2, string2, string3, string4, jSONObject, jSONObject2, map2, n4, string5, string6);
        return logChannel;
    }

    private void pushAllFiles(int n3, int n4, LogChannel object) {
        while (n3 <= n4) {
            Object object2 = this.workspace;
            Object object3 = new StringBuilder("juspay-logs-queue-");
            String string2 = ((LogChannel)object).getChannelName();
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(n3);
            string2 = ".dat";
            ((StringBuilder)object3).append(string2);
            object3 = ((StringBuilder)object3).toString();
            object2 = ((Workspace)object2).openInCache((String)object3);
            if (object2 != null) {
                boolean bl2 = ((File)object2).exists();
                if (bl2 && (bl2 = LogUtils.isFileEligibleToPush((File)object2, (LogConfig)(object3 = this.logConfig)))) {
                    this.pushFileContentToServer((File)object2, (LogChannel)object);
                } else {
                    ((File)object2).delete();
                }
            }
            ++n3;
        }
        Object object4 = JuspayCoreLib.getApplicationContext();
        if (object4 != null) {
            object4 = this.getChannelObject("default");
            Object object5 = this.workspace;
            object = "juspay-crash-logFile.dat";
            boolean bl3 = ((File)(object5 = ((Workspace)object5).openInCache((String)object))).exists();
            if (bl3 && (bl3 = LogUtils.isFileEligibleToPush((File)object5, (LogConfig)(object = this.logConfig)))) {
                this.pushFileContentToServer((File)object5, (LogChannel)object4);
            } else {
                ((File)object5).delete();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void pushFileContentToServer(File file, LogChannel logChannel) {
        if (file == null) return;
        Queue queue = LogUtils.getLogsFromFile(file);
        try {
            JSONArray jSONArray = new JSONArray();
            boolean bl2 = true;
            while (true) {
                long l2;
                long l3;
                long l4;
                long l7;
                long l8;
                int n3;
                if ((n3 = queue.size()) <= 0) {
                    if (!bl2) return;
                    file.delete();
                    return;
                }
                while (((l8 = (l7 = (l4 = logChannel.getBatchCount()) - (l3 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false || (l8 = (l2 = (l4 = (long)(n3 = jSONArray.length())) - (l3 = logChannel.getBatchCount())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) < 0) && (n3 = queue.size()) > 0) {
                    Object e2 = queue.poll();
                    jSONArray.put(e2);
                }
                int n4 = this.pushLogsToServer(jSONArray, logChannel);
                if (n4 != (n3 = 200)) {
                    n4 = 0;
                    jSONArray = null;
                    bl2 = false;
                }
                jSONArray = new JSONArray();
            }
        }
        catch (Exception exception) {
            return;
        }
    }

    private int pushLogsToServer(JSONArray object, LogChannel object2) {
        Object object3;
        Object object4;
        Object object5;
        Object object6 = new JSONObject();
        object6.put("data", object);
        object6 = object6.toString();
        Object object7 = StandardCharsets.UTF_8;
        byte[] byArray = ((String)object6).getBytes((Charset)object7);
        object6 = LogPusher.getLogEncryptionLevel((LogChannel)object2);
        object7 = this.getLogEncryptionKey((LogChannel)object2);
        int n3 = 10000;
        Object object8 = new NetUtils(n3, n3);
        Map map2 = ((LogChannel)object2).getHeaders();
        n3 = (int)(JuspayCoreLib.isAppDebuggable() ? 1 : 0);
        if (n3 != 0) {
            object5 = this.getSNRanges((JSONArray)object);
            object4 = new StringBuilder();
            boolean bl2 = (object5 = object5.iterator()).hasNext();
            if (bl2) {
                while (true) {
                    object3 = (CharSequence)object5.next();
                    ((StringBuilder)object4).append((CharSequence)object3);
                    bl2 = object5.hasNext();
                    if (!bl2) break;
                    object3 = ",";
                    ((StringBuilder)object4).append((CharSequence)object3);
                }
            }
            object5 = ((StringBuilder)object4).toString();
            object4 = "x-jp-sn-ranges";
            map2.put(object4, object5);
        }
        object = String.valueOf(object.length());
        map2.put("x-logscount", object);
        object = ((LogChannel)object2).getChannelName();
        object5 = "channel";
        map2.put(object5, object);
        object = "encryption";
        boolean bl3 = ((String)object).equals(object6);
        if (bl3 && object7 != null) {
            byte[] byArray2 = EncryptionHelper.gzipThenEncrypt(byArray, (RSAPublicKey)object7);
            object2 = this.getEndPoint((LogChannel)object2);
            object3 = new URL((String)object2);
            JSONObject jSONObject = new JSONObject();
            String string2 = "application/x-godel-gzip-pubkey-encrypted";
            object2 = ((NetUtils)object8).doPost((URL)object3, byArray2, string2, map2, jSONObject, null);
            object = new JuspayHttpsResponse((cl2_2)object2);
        } else {
            object = "gzip";
            boolean bl4 = ((String)object).equals(object6);
            if (bl4) {
                byte[] byArray3 = Utils.gzipContent(byArray);
                object6 = "Content-Encoding";
                map2.put(object6, object);
                object2 = this.getEndPoint((LogChannel)object2);
                object3 = new URL((String)object2);
                JSONObject jSONObject = new JSONObject();
                String string3 = "application/gzip";
                object2 = ((NetUtils)object8).doPost((URL)object3, byArray3, string3, map2, jSONObject, null);
                object = new JuspayHttpsResponse((cl2_2)object2);
            } else {
                object2 = this.getEndPoint((LogChannel)object2);
                object4 = new URL((String)object2);
                JSONObject jSONObject = new JSONObject();
                Object var16_21 = null;
                object5 = object8;
                object8 = "application/json";
                object3 = map2;
                object2 = ((NetUtils)object5).doPost((URL)object4, byArray, (String)object8, map2, jSONObject, null);
                object = new JuspayHttpsResponse((cl2_2)object2);
            }
        }
        return ((JuspayHttpsResponse)object).responseCode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean addChannelFromJS(String string2, String string3) {
        LogPusher logPusher = this;
        Object object = "channelHeaders";
        Object object2 = "publicKeySandbox";
        Object object3 = "publicKey";
        try {
            String string4 = string2;
            JSONObject jSONObject = new JSONObject(string2);
            string4 = "retryAttempts";
            Object object4 = this.logConfig;
            int n3 = ((LogConfig)object4).maxRetryPerBatch;
            int n4 = jSONObject.optInt(string4, n3);
            object4 = "batchCount";
            Object object5 = this.logConfig;
            long l2 = ((LogConfig)object5).maxLogsPerPush;
            long l3 = jSONObject.optLong((String)object4, l2);
            Object object6 = "logsUrlKey";
            Object object7 = this.logConfig;
            object7 = ((LogConfig)object7).prodLogUrl;
            object6 = jSONObject.optString((String)object6, (String)object7);
            object7 = "logsUrlKeySandbox";
            HashMap hashMap = this.logConfig;
            hashMap = ((LogConfig)((Object)hashMap)).sandboxLogUrl;
            object7 = jSONObject.optString((String)object7, (String)((Object)hashMap));
            boolean bl2 = jSONObject.has((String)object3);
            if (bl2) {
                object3 = jSONObject.getJSONObject((String)object3);
            } else {
                object3 = this.logConfig;
                object3 = ((LogConfig)object3).publicKey;
            }
            hashMap = object3;
            int n7 = jSONObject.has((String)object2);
            if (n7 != 0) {
                object2 = jSONObject.getJSONObject((String)object2);
            } else {
                object2 = logPusher.logConfig;
                object2 = ((LogConfig)object2).publicKeySandbox;
            }
            Object object8 = object2;
            int n8 = jSONObject.has((String)object);
            if (n8 != 0) {
                object = jSONObject.getJSONObject((String)object);
                object = LogUtils.toMap(object);
            } else {
                object = new HashMap();
            }
            Object object9 = object;
            object = "priority";
            object2 = logPusher.logConfig;
            n8 = ((LogConfig)object2).defaultPriority;
            int n10 = jSONObject.optInt((String)object, n8);
            object = "environment";
            object2 = "all";
            String string5 = jSONObject.optString((String)object, (String)object2);
            object = "encryptionLevel";
            object2 = logPusher.logConfig;
            object2 = ((LogConfig)object2).encryptionLevel;
            String string6 = jSONObject.optString((String)object, (String)object2);
            object = this;
            object2 = string3;
            n7 = n4;
            object4 = object6;
            object5 = object7;
            object6 = hashMap;
            object7 = object8;
            hashMap = object9;
            object9 = string5;
            return this.addChannel(string3, n4, l3, (String)object4, (String)object5, (JSONObject)object6, (JSONObject)object8, hashMap, n10, string5, string6);
        }
        catch (JSONException jSONException) {
            return false;
        }
    }

    public void addLogLines(Iterable iterable) {
        boolean bl2 = this.stopPushingLogs;
        if (bl2) {
            return;
        }
        qw1_2 qw1_22 = new qw1_2(this, iterable);
        ExecutorManager.runOnLogsPool(qw1_22);
    }

    public void addLogLines(JSONArray jSONArray) {
        boolean bl2 = this.stopPushingLogs;
        if (!bl2) {
            Object object = this.logConfig;
            bl2 = ((LogConfig)object).shouldPush;
            if (bl2) {
                object = new LogPusher$IterableJSONArray(jSONArray);
                this.addLogLines((Iterable)object);
            }
        }
    }

    public void addLogsFromSessioniser(Queue queue) {
        ow1_2 ow1_22 = new ow1_2(this, queue);
        ExecutorManager.runOnLogsPool(ow1_22);
    }

    public void addLogsToPersistedQueue(JSONObject jSONObject) {
        mw1_2 mw1_22 = new mw1_2(this, jSONObject);
        ExecutorManager.runOnLogsPool(mw1_22);
    }

    public LogPusher$LogPushTimerTask createPusherTask() {
        Workspace workspace = this.workspace;
        LogConfig logConfig = this.logConfig;
        Map map2 = this.channels;
        LogPusher$LogPushTimerTask logPusher$LogPushTimerTask = new LogPusher$LogPushTimerTask(this, workspace, logConfig, map2, null);
        return logPusher$LogPushTimerTask;
    }

    public String[] getChannelNames() {
        Set set = this.channels.keySet();
        String[] stringArray = new String[]{};
        return set.toArray(stringArray);
    }

    public LogChannel getChannelObject(String string2) {
        Map map2 = this.channels;
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            return (LogChannel)this.channels.get(string2);
        }
        return (LogChannel)this.channels.get("default");
    }

    public void pushOldChannelLogs(LogChannel logChannel) {
        CharSequence charSequence;
        Object object = "PERSISTENT_LOGS_READING_FILE";
        Object object2 = new StringBuilder((String)object);
        Object object3 = logChannel.getChannelName();
        ((StringBuilder)object2).append((String)object3);
        object2 = ((StringBuilder)object2).toString();
        object3 = this.workspace;
        int n3 = LogUtils.getFromSharedPreference((String)object2, (Workspace)object3);
        int n4 = 0;
        object3 = null;
        int n7 = -1;
        if (n3 == n7) {
            object2 = this.workspace;
            charSequence = new StringBuilder((String)object);
            object = logChannel.getChannelName();
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            charSequence = String.valueOf(0);
            ((Workspace)object2).writeToSharedPreference((String)object, (String)charSequence);
            n3 = 0;
            object2 = null;
        }
        charSequence = "PERSISTENT_LOGS_WRITING_FILE";
        object = new StringBuilder((String)charSequence);
        Object object4 = logChannel.getChannelName();
        ((StringBuilder)object).append((String)object4);
        object = ((StringBuilder)object).toString();
        object4 = this.workspace;
        int n8 = LogUtils.getFromSharedPreference((String)object, (Workspace)object4);
        if (n8 == n7) {
            object = this.workspace;
            CharSequence charSequence2 = new StringBuilder((String)charSequence);
            charSequence = logChannel.getChannelName();
            charSequence2.append((String)charSequence);
            charSequence2 = charSequence2.toString();
            charSequence = String.valueOf(0);
            ((Workspace)object).writeToSharedPreference((String)charSequence2, (String)charSequence);
        } else {
            n4 = n8;
        }
        this.pushAllFiles(n3, n4, logChannel);
    }

    public void setEndPointSandbox(Boolean bl2) {
        boolean bl3;
        this.isSandboxEnv = bl3 = bl2.booleanValue();
    }

    public void setHeaders(JSONObject jSONObject, String string2) {
        lw1_2 lw1_22 = new lw1_2(this, string2, jSONObject);
        ExecutorManager.runOnLogsPool(lw1_22);
    }

    public void setLogHeaderValues(JSONObject jSONObject, String string2) {
        pw1_2 pw1_22 = new pw1_2(this, 0, string2, jSONObject);
        ExecutorManager.runOnLogsPool(pw1_22);
    }

    public void setPushState(boolean bl2) {
        this.stopPushingLogs = bl2 ^= true;
    }

    public boolean shouldDropLog(JSONObject object) {
        String string2;
        block5: {
            string2 = "channel";
            try {
                boolean bl2 = object.has(string2);
                if (bl2) break block5;
                return false;
            }
            catch (JSONException jSONException) {
                return false;
            }
        }
        Map map2 = this.channels;
        object = object.getString(string2);
        return map2.containsKey(object) ^ true;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.analytics.LogChannel;
import in.juspay.hypersdk.analytics.LogChannelExp;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.analytics.LogPusherExp$LogPushTimerTask;
import in.juspay.hypersdk.analytics.LogUtils;
import in.juspay.hypersdk.analytics.LogWorkspace;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.security.JOSEUtils;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.JuspayHttpsResponse;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LogPusherExp {
    private static final String TAG = "LogPusher";
    private final ConcurrentHashMap channels;
    private final File crashLogFile;
    private final ConcurrentHashMap fileCountMap;
    private boolean isExceptionTracked;
    private boolean isSandboxEnv;
    private final LogConfig logConfig;
    private int logFlushTimerTaskErrorCounter;
    private Timer logPushTimer;
    private TimerTask logPushTimerTask;
    private final LogWorkspace logWorkspace;
    private int setHeaderParametersErrorCounter;

    public LogPusherExp(Workspace object, LogConfig logConfig) {
        Object object2 = new ConcurrentHashMap();
        this.channels = object2;
        this.logFlushTimerTaskErrorCounter = 0;
        this.setHeaderParametersErrorCounter = 0;
        this.isSandboxEnv = false;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.logPushTimer = concurrentHashMap;
        this.fileCountMap = concurrentHashMap = new ConcurrentHashMap();
        this.isExceptionTracked = false;
        this.logWorkspace = object2 = new LogWorkspace((Workspace)object);
        this.logConfig = logConfig;
        this.crashLogFile = object = ((Workspace)object2).open("juspay-crash-logFile.dat");
        object = new ec1_2(this, 1);
        ExecutorManager.runOnLogSessioniserThread((Runnable)object);
    }

    public static /* synthetic */ boolean a(String string2, File file, String string3) {
        return string3.contains(string2);
    }

    public static /* synthetic */ LogConfig access$000(LogPusherExp logPusherExp) {
        return logPusherExp.logConfig;
    }

    public static /* synthetic */ void access$100(LogPusherExp logPusherExp) {
        logPusherExp.checkFolderLimit();
    }

    private static void acknowledgeLogsPushed(ArrayList object, LogChannelExp logChannelExp) {
        boolean bl2;
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            logChannelExp.pollLogsQueue(string2);
        }
    }

    private boolean addChannel(String string2, int n3, long l2, String string3, String string4, JSONObject jSONObject, JSONObject jSONObject2, Map map2, int n4, String string5, String string6, JSONArray jSONArray, JSONArray jSONArray2, String string7) {
        LogPusherExp logPusherExp = this;
        String string8 = string2;
        Object object = this.channels;
        boolean bl2 = ((ConcurrentHashMap)object).containsKey(string2);
        Object object2 = this.makeChannel(string2, n3, l2, string3, string4, jSONObject, jSONObject2, map2, n4, string5, string6, jSONArray, jSONArray2, string7);
        Object object3 = this.channels;
        ((ConcurrentHashMap)object3).put(string2, object2);
        if (!bl2) {
            object = this.logWorkspace;
            object3 = "LOG_CHANNEL_NAMES";
            Object object4 = "";
            object = ((Workspace)object).getFromSharedPreference((String)object3, (String)object4);
            StringBuilder stringBuilder = Ex0.a((String)object);
            bl2 = ((String)object).isEmpty();
            if (!bl2) {
                object4 = ",";
            }
            object = h30_0.a(stringBuilder, (String)object4, string2);
            object4 = logPusherExp.logWorkspace;
            ((Workspace)object4).writeToSharedPreference((String)object3, (String)object);
        }
        object = logPusherExp.logWorkspace;
        string8 = kp1_0.c("LOG_CHANNEL_INFO_", string2);
        object2 = ((LogChannelExp)object2).toString();
        ((Workspace)object).writeToSharedPreference(string8, (String)object2);
        return true;
    }

    public static /* synthetic */ void b(LogPusherExp logPusherExp, String string2, String string3) {
        logPusherExp.lambda$addLogLines$3(string2, string3);
    }

    public static /* synthetic */ void c(LogPusherExp logPusherExp, String string2, LogChannelExp logChannelExp) {
        logPusherExp.lambda$clearBacklog$0(string2, logChannelExp);
    }

    private void checkFolderLimit() {
        int n3;
        File[] fileArray = this.logWorkspace;
        Object object = "";
        if ((fileArray = fileArray.open((String)object)) != null && (n3 = fileArray.exists()) != 0 && (fileArray = fileArray.listFiles()) != null) {
            int n4;
            n3 = fileArray.length;
            int n7 = 0;
            long l2 = 0L;
            for (int i3 = 0; i3 < n3; ++i3) {
                long l3;
                File file = fileArray[i3];
                if (file == null || (n4 = file.exists()) == 0 || (n4 = file.isFile()) == 0) continue;
                l2 = l3 = file.length() + l2;
            }
            object = this.logConfig;
            long l4 = ((LogConfig)object).folderSizeLimit;
            long l7 = l2 - l4;
            n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n3 < 0) {
                return;
            }
            object = new Object();
            Arrays.sort(fileArray, object);
            object = this.logConfig;
            double d2 = ((LogConfig)object).folderSizeLimit;
            long l8 = 4605380978949069210L;
            double d5 = 0.8;
            l4 = (long)(d2 *= d5);
            n3 = fileArray.length;
            while (n7 < n3) {
                boolean bl2;
                File file = fileArray[n7];
                if (file != null && (bl2 = file.exists()) && (bl2 = file.isFile())) {
                    file.delete();
                    l8 = file.length();
                    l2 -= l8;
                }
                if ((n4 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1)) <= 0) break;
                ++n7;
            }
        }
    }

    public static /* synthetic */ void d(LogPusherExp logPusherExp) {
        logPusherExp.lambda$clearBacklog$1();
    }

    public static /* synthetic */ void e(LogPusherExp logPusherExp, JSONObject jSONObject) {
        logPusherExp.lambda$addLogsToPersistedQueue$2(jSONObject);
    }

    public static /* synthetic */ void f(LogPusherExp logPusherExp) {
        logPusherExp.pushCrashLogFile();
    }

    public static /* synthetic */ int g(File file, File file2) {
        return LogPusherExp.lambda$checkFolderLimit$4(file, file2);
    }

    public static int getBatchNum(String string2) {
        char c2;
        int n3 = string2.lastIndexOf(46);
        int n4 = n3 + -5;
        char c3 = string2.charAt(n4);
        if (c3 == (c2 = '-')) {
            string2 = string2.substring(n3 += -8, n4);
        } else {
            n4 = n3 + -3;
            string2 = string2.substring(n4, n3);
        }
        return Integer.parseInt(string2);
    }

    private static JSONArray getBatchNumArray(ArrayList object) {
        int n3;
        JSONArray jSONArray = new JSONArray();
        object = ((ArrayList)object).iterator();
        while ((n3 = object.hasNext()) != 0) {
            String string2 = (String)object.next();
            n3 = LogPusherExp.getBatchNum(string2);
            jSONArray.put(n3);
        }
        return jSONArray;
    }

    private LogChannelExp getChannelObject(String string2) {
        ConcurrentHashMap concurrentHashMap = this.channels;
        boolean bl2 = concurrentHashMap.containsKey(string2);
        if (bl2) {
            return (LogChannelExp)this.channels.get(string2);
        }
        return (LogChannelExp)this.channels.get("default");
    }

    private String getEndPoint(LogChannelExp object) {
        boolean bl2 = this.isSandboxEnv;
        object = bl2 ? ((LogChannel)object).getEndpointSBX() : ((LogChannel)object).getEndPointProd();
        return object;
    }

    private int getFileCount(String string2, File object) {
        int n3;
        int n4;
        Serializable serializable = this.fileCountMap;
        boolean n7 = ((ConcurrentHashMap)serializable).containsKey(string2);
        if (n7 && (serializable = (Integer)this.fileCountMap.get(string2)) != null) {
            return (Integer)serializable;
        }
        int n8 = string2.lastIndexOf(46);
        int n10 = n8 + -5;
        if ((n10 = (int)string2.charAt(n10)) == (n4 = 45)) {
            n3 = n8 + -4;
            object = string2.substring(n3, n8);
            n3 = Integer.parseInt((String)object);
        } else {
            n3 = this.traverseTheFile(string2, (File)object);
        }
        serializable = this.fileCountMap;
        Integer n14 = n3;
        ((ConcurrentHashMap)serializable).put(string2, n14);
        return n3;
    }

    private lm2 getFilesContent(ArrayList object) {
        int n3;
        Object object2 = new ArrayList();
        object = ((ArrayList)object).iterator();
        int n4 = 0;
        Object object3 = null;
        int n7 = 0;
        while ((n3 = object.hasNext()) != 0) {
            long l2;
            long l3;
            long l4;
            long l7;
            boolean bl2;
            String string2 = (String)object.next();
            File file = this.logWorkspace.open(string2);
            if (file == null || !(bl2 = file.exists()) || (l7 = (l4 = (l3 = file.length()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) continue;
            byte[] byArray = LogUtils.getLogsFromFileExp(file);
            int n8 = byArray.length;
            n4 += n8;
            ((ArrayList)object2).add(byArray);
            n3 = this.getFileCount(string2, file);
            n7 += n3;
        }
        object = ByteBuffer.allocate(n4);
        object2 = ((ArrayList)object2).iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object3 = (byte[])object2.next();
            ((ByteBuffer)object).put((byte[])object3);
        }
        object = ((ByteBuffer)object).array();
        object2 = n7;
        object3 = new lm2;
        object3(object, object2);
        return object3;
    }

    /*
     * Exception decompiling
     */
    private JSONObject getFirstLog(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private RSAPublicKey getLogEncryptionKey(LogChannelExp logChannelExp, int n3) {
        Object object;
        block8: {
            JSONArray jSONArray = logChannelExp.getFallBackPublicKeys();
            int n4 = jSONArray.length();
            if (n4 != 0 && n3 >= 0) {
                try {
                    jSONArray = logChannelExp.getFallBackPublicKeys();
                }
                catch (Exception exception) {}
                object = jSONArray.get(n3);
                object = (JSONObject)object;
                break block8;
            }
            n3 = 0;
            object = null;
        }
        if (object == null) {
            n3 = (int)(this.isSandboxEnv ? 1 : 0);
            object = n3 != 0 ? logChannelExp.getKeySBX() : logChannelExp.getKeyProd();
        }
        try {
            return JOSEUtils.JWKtoRSAPublicKey(object);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String getLogEncryptionLevel(LogChannelExp logChannelExp) {
        return logChannelExp.getEncryptionLevel();
    }

    public static /* synthetic */ void h(LogPusherExp logPusherExp) {
        logPusherExp.lambda$pushAllLogs$6();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void hitErrorUrl(String object, LogChannelExp logChannelExp, int n3) {
        NetUtils netUtils;
        HashMap<Object, Object> hashMap;
        String string2;
        String string3 = "session_id";
        Object object2 = "";
        try {
            string2 = logChannelExp.getErrorUrl();
            boolean bl2 = Objects.equals(string2, object2);
            if (bl2) return;
            string2 = this.getFirstLog((String)object);
            hashMap = new HashMap<Object, Object>();
        }
        catch (Exception exception) {
            return;
        }
        try {
            object2 = string2.optString(string3, (String)object2);
            hashMap.put(string3, object2);
            string3 = "start_with";
            object2 = "sn";
            netUtils = null;
            int n4 = string2.optInt((String)object2, 0);
            object2 = String.valueOf(n4);
            hashMap.put(string3, object2);
            string3 = "total_count";
            object2 = this.fileCountMap;
            n4 = (int)(((ConcurrentHashMap)object2).containsKey(object) ? 1 : 0);
            if (n4 != 0) {
                object2 = this.fileCountMap;
                object = ((ConcurrentHashMap)object2).get(object);
                object = String.valueOf(object);
            } else {
                object = "unknown";
            }
            hashMap.put(string3, object);
            object = "channel_name";
            string3 = logChannelExp.getChannelName();
            hashMap.put(object, string3);
            object = "response_code";
            String string4 = String.valueOf(n3);
            hashMap.put(object, string4);
        }
        catch (Exception exception) {}
        int n7 = 30000;
        netUtils = new NetUtils(n7, n7);
        String string5 = logChannelExp.getErrorUrl();
        HashMap hashMap2 = new HashMap();
        JSONObject jSONObject = new JSONObject();
        object = netUtils.doGet(string5, hashMap2, hashMap, jSONObject, null);
        if (object == null) return;
        ((cl2_2)object).close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$addLogLines$3(String object, String string2) {
        int n3;
        Exception exception2;
        Object object2;
        block4: {
            long l2;
            block3: {
                object2 = this.logConfig;
                boolean bl2 = ((LogConfig)object2).shouldPush;
                if (!bl2) {
                    return;
                }
                try {
                    object = this.getChannelObject((String)object);
                    if (object != null) break block3;
                    object = "default";
                    object = this.getChannelObject((String)object);
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object2 = this.logWorkspace;
            if ((object2 = ((Workspace)object2).open(string2)) == null) return;
            boolean bl3 = ((File)object2).exists();
            if (!bl3) return;
            long l3 = ((File)object2).length();
            long l4 = l3 - (l2 = 0L);
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 <= 0) return;
            ((LogChannelExp)object).addToLogsQueue(string2);
            return;
        }
        this.logFlushTimerTaskErrorCounter = n3 = this.logFlushTimerTaskErrorCounter + 1;
        int n4 = 2;
        if (n3 > n4) return;
        String string3 = "log_pusher";
        String string4 = "Exception while flushing the logs to persisted queue file";
        object2 = TAG;
        String string5 = "action";
        String string6 = "system";
        SdkTracker.trackAndLogBootException((String)object2, string5, string6, string3, string4, exception2);
    }

    private /* synthetic */ void lambda$addLogsToPersistedQueue$2(JSONObject jSONObject) {
        Object object = this.logConfig;
        boolean bl2 = ((LogConfig)object).shouldPush;
        if (!bl2) {
            return;
        }
        object = this.crashLogFile;
        try {
            LogUtils.writeLogToFileExp(jSONObject, (File)object);
        }
        catch (Exception exception) {
            object = TAG;
            String string2 = "addLogsToPersistedQueue failed";
            JuspayLogger.e((String)object, string2, exception);
        }
    }

    private static /* synthetic */ int lambda$checkFolderLimit$4(File file, File file2) {
        long l2 = file.lastModified();
        long l3 = file2.lastModified();
        return Long.compare(l2, l3);
    }

    private /* synthetic */ void lambda$clearBacklog$0(String string2, LogChannelExp object) {
        this.pushChannelFiles(string2, (LogChannelExp)object);
        object = this.logWorkspace;
        StringBuilder stringBuilder = new StringBuilder("LOG_CHANNEL_INFO_");
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        ((Workspace)object).removeFromSharedPreference(string2);
    }

    private /* synthetic */ void lambda$clearBacklog$1() {
        Object object = this.channels;
        String string2 = "default";
        object = (LogChannelExp)((ConcurrentHashMap)object).get(string2);
        this.pushChannelFiles(string2, (LogChannelExp)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$pushAllLogs$6() {
        Object object;
        boolean bl2;
        Iterator iterator = this.channels.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Exception exception2;
            Object object2;
            Object object3;
            Iterator iterator2;
            Object object4;
            boolean bl3;
            block8: {
                boolean bl4;
                boolean bl5;
                object = (LogChannelExp)iterator.next().getValue();
                bl3 = true;
                try {
                    object4 = new ArrayList();
                    iterator2 = ((LogChannelExp)object).getLogsQueueExp();
                    iterator2 = ((ArrayList)((Object)iterator2)).iterator();
                    while (bl5 = iterator2.hasNext()) {
                        object3 = iterator2.next();
                        object2 = ".ndjson";
                        bl4 = ((String)(object3 = (String)object3)).contains((CharSequence)object2);
                        if (!bl4 || (object3 = ((Workspace)(object2 = this.logWorkspace)).open((String)object3)) == null || !(bl4 = ((File)object3).exists())) continue;
                        ((ArrayList)object4).add(object3);
                    }
                }
                catch (Exception exception2) {
                    break block8;
                }
                this.pushNdJsonFiles((ArrayList)object4, (LogChannelExp)object, bl3);
                ((ArrayList)object4).clear();
                iterator2 = ((LogChannelExp)object).getLogsQueueExp();
                iterator2 = ((ArrayList)((Object)iterator2)).iterator();
                while (bl5 = iterator2.hasNext()) {
                    object3 = iterator2.next();
                    object2 = ".dat";
                    bl4 = ((String)(object3 = (String)object3)).contains((CharSequence)object2);
                    if (!bl4 || (object3 = ((Workspace)(object2 = this.logWorkspace)).open((String)object3)) == null || !(bl4 = ((File)object3).exists())) continue;
                    ((ArrayList)object4).add(object3);
                }
                this.pushDatFiles((ArrayList)object4, (LogChannelExp)object, bl3);
                continue;
            }
            bl2 = this.isExceptionTracked;
            if (!bl2) {
                object2 = "log_pusher";
                String string2 = "Error while creating the payload to post";
                object4 = TAG;
                iterator2 = "action";
                object3 = "system";
                SdkTracker.trackAndLogBootException((String)object4, (String)((Object)iterator2), object3, (String)object2, string2, exception2);
            }
            this.isExceptionTracked = bl3;
        }
        iterator = this.channels.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            object = iterator.next();
            String string3 = (String)object.getKey();
            object = (LogChannelExp)object.getValue();
            this.pushChannelFiles(string3, (LogChannelExp)object);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void loadSavedChannels() {
        String string2;
        Object object;
        String string3;
        int n3;
        Iterator iterator;
        JSONObject jSONObject = this.logConfig.channels;
        if (jSONObject != null) {
            iterator = jSONObject.keys();
            while ((n3 = iterator.hasNext()) != 0) {
                string3 = (String)iterator.next();
                try {
                    object = jSONObject.get(string3);
                    object = object.toString();
                    this.addChannelFromJS((String)object, string3);
                }
                catch (JSONException jSONException) {
                    String string4 = "log_pusher";
                    String string5 = "Exception while creating channel";
                    object = TAG;
                    string2 = "action";
                    String string6 = "system";
                    SdkTracker.trackAndLogBootException((String)object, string2, string6, string4, string5, jSONException);
                }
            }
        }
        if ((jSONObject = this.logConfig.logChannelsConfig) == null) return;
        iterator = null;
        try {
            for (int n4 = 0; n4 < (n3 = jSONObject.length()); string3 = string3.getString(string2), ++n4) {
                string3 = jSONObject.getJSONObject(n4);
                object = string3.toString();
                string2 = "channel";
                this.addChannelFromJS((String)object, string3);
            }
            return;
        }
        catch (JSONException jSONException) {}
    }

    private LogChannelExp makeChannel(String string2, int n3, long l2, String string3, String string4, JSONObject jSONObject, JSONObject jSONObject2, Map map2, int n4, String string5, String string6, JSONArray jSONArray, JSONArray jSONArray2, String string7) {
        LogChannelExp logChannelExp = new LogChannelExp(n3, l2, string2, string3, string4, jSONObject, jSONObject2, map2, n4, string5, string6, jSONArray, jSONArray2, string7);
        return logChannelExp;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void pushChannelFiles(String fileArray, LogChannelExp logChannelExp) {
        try {
            ArrayList<File> arrayList = this.logWorkspace;
            arrayList = ((LogWorkspace)((Object)arrayList)).logsDir;
            if (arrayList == null) return;
            boolean bl2 = ((File)((Object)arrayList)).exists();
            if (!bl2) return;
            bl2 = ((File)((Object)arrayList)).isDirectory();
            if (!bl2) return;
            ArrayList<File> arrayList2 = new ArrayList<File>((String)fileArray);
            fileArray = ((File)((Object)arrayList)).listFiles((FilenameFilter)((Object)arrayList2));
            arrayList = new ArrayList<File>();
            arrayList2 = new ArrayList<File>();
            if (fileArray != null) {
                for (File file : fileArray) {
                    Object object;
                    long l2;
                    boolean bl3;
                    if (file == null || !(bl3 = file.exists()) || !(bl3 = file.isFile())) continue;
                    long l3 = file.length();
                    long l4 = l3 - (l2 = 0L);
                    Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object2 > 0 && (bl3 = LogUtils.isFileEligibleToPush(file, (LogConfig)(object = this.logConfig)))) {
                        String string2;
                        object = file.getName();
                        bl3 = ((String)object).contains(string2 = ".ndjson");
                        if (bl3) {
                            arrayList.add(file);
                            continue;
                        }
                        arrayList2.add(file);
                        continue;
                    }
                    file.delete();
                }
            }
            this.pushNdJsonFiles(arrayList, logChannelExp, false);
            this.pushDatFiles(arrayList2, logChannelExp, false);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void pushCrashLogFile() {
        Object object = JuspayCoreLib.getApplicationContext();
        if (object != null) {
            boolean bl2;
            object = this.getChannelObject("default");
            File file = this.crashLogFile;
            if (file != null && (bl2 = file.exists())) {
                LogConfig logConfig;
                long l2;
                file = this.crashLogFile;
                long l3 = file.length();
                long l4 = l3 - (l2 = 0L);
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 > 0 && (bl2 = LogUtils.isFileEligibleToPush(file = this.crashLogFile, logConfig = this.logConfig))) {
                    file = this.crashLogFile;
                    this.pushFileContentToServer(file, (LogChannelExp)object);
                } else {
                    object = this.crashLogFile;
                    ((File)object).delete();
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void pushFileContentToServer(File file, LogChannelExp logChannelExp) {
        int n3;
        byte[] byArray = LogUtils.getLogsFromFileExp(file);
        Object object = file.getName();
        int n4 = this.getFileCount((String)object, file);
        try {
            object = new JSONArray();
            n3 = 1;
        }
        catch (Exception exception) {
            return;
        }
        JSONArray jSONArray = object.put(n3);
        object = this;
        int n7 = this.pushLogsToServer(byArray, n4, jSONArray, logChannelExp, false);
        int n8 = 200;
        if (n7 != n8) return;
        file.delete();
    }

    private int pushLogsToServer(byte[] object, int n3, JSONArray object2, LogChannelExp logChannelExp, boolean bl2) {
        boolean bl3;
        int n4;
        String string2 = LogPusherExp.getLogEncryptionLevel(logChannelExp);
        int n7 = logChannelExp.getRetryAttempts() + -1;
        RSAPublicKey rSAPublicKey = this.getLogEncryptionKey(logChannelExp, n7);
        int n8 = 10000;
        NetUtils netUtils = new NetUtils(n8, n8);
        Map map2 = logChannelExp.getHeaders();
        Object object3 = String.valueOf(n3);
        map2.put("x-logscount", object3);
        object3 = logChannelExp.getChannelName();
        Object object4 = "channel";
        map2.put(object4, object3);
        object3 = bl2 ? "ndjson" : "byte-d-json";
        String string3 = "x-log-format";
        map2.put(string3, object3);
        object3 = object2.toString();
        map2.put("x-batch-no", object3);
        object3 = this.getEndPoint(logChannelExp);
        object2 = logChannelExp.getFallBackUrls();
        int n10 = object2.length();
        if (n10 != 0 && (n4 = logChannelExp.getCurrentBatchRetryAttempts()) > 0) {
            n4 += -1;
            n3 = object2.length();
            object3 = object2.getString(n4 %= n3);
        }
        if ((bl3 = ((String)(object2 = "encryption")).equals(string2)) && rSAPublicKey != null) {
            byte[] byArray = EncryptionHelper.gzipThenEncryptExp((byte[])object, rSAPublicKey, map2);
            object4 = new URL((String)object3);
            JSONObject jSONObject = new JSONObject();
            String string5 = "application/x-godel-gzip-pubkey-encrypted";
            object3 = netUtils.doPost((URL)object4, byArray, string5, map2, jSONObject, null);
            object = new JuspayHttpsResponse((cl2_2)object3);
        } else {
            object2 = "gzip";
            n4 = (int)(((String)object2).equals(string2) ? 1 : 0);
            if (n4 != 0) {
                byte[] object5 = Utils.gzipContent((byte[])object);
                map2.put("Content-Encoding", object2);
                object4 = new URL((String)object3);
                JSONObject jSONObject = new JSONObject();
                String string6 = "application/gzip";
                object3 = netUtils.doPost((URL)object4, object5, string6, map2, jSONObject, null);
                object = new JuspayHttpsResponse((cl2_2)object3);
            } else {
                object4 = new URL((String)object3);
                JSONObject jSONObject = new JSONObject();
                String string4 = "application/json";
                Object object5 = object;
                object = netUtils.doPost((URL)object4, (byte[])object, string4, map2, jSONObject, null);
                object = object2 = new JuspayHttpsResponse((cl2_2)object);
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
        Object object = this;
        Object object2 = "fallBackPublicKeys";
        Object object3 = "fallBackUrls";
        Object object4 = "channelHeaders";
        Object object5 = "publicKeySandbox";
        Object object6 = "publicKey";
        try {
            Object object7 = string2;
            JSONObject jSONObject = new JSONObject(string2);
            object7 = "retryAttempts";
            Object object8 = this.logConfig;
            int n3 = ((LogConfig)object8).maxRetryPerBatch;
            int n4 = jSONObject.optInt((String)object7, n3);
            object8 = "batchCount";
            Object object9 = this.logConfig;
            long l2 = ((LogConfig)object9).maxLogsPerPush;
            long l3 = jSONObject.optLong((String)object8, l2);
            Object object10 = "logsUrlKey";
            Object object11 = this.logConfig;
            object11 = ((LogConfig)object11).prodLogUrl;
            object10 = jSONObject.optString((String)object10, (String)object11);
            object11 = "logsUrlKeySandbox";
            Object object12 = this.logConfig;
            object12 = ((LogConfig)object12).sandboxLogUrl;
            object11 = jSONObject.optString((String)object11, (String)object12);
            boolean bl2 = jSONObject.has((String)object6);
            if (bl2) {
                object6 = jSONObject.getJSONObject((String)object6);
            } else {
                object6 = this.logConfig;
                object6 = ((LogConfig)object6).publicKey;
            }
            object12 = object6;
            boolean bl3 = jSONObject.has((String)object5);
            if (bl3) {
                object5 = jSONObject.getJSONObject((String)object5);
            } else {
                object5 = ((LogPusherExp)object).logConfig;
                object5 = ((LogConfig)object5).publicKeySandbox;
            }
            Object object13 = object5;
            int n7 = jSONObject.has((String)object4);
            if (n7 != 0) {
                object4 = jSONObject.getJSONObject((String)object4);
                object4 = LogUtils.toMap(object4);
            } else {
                object4 = new HashMap();
            }
            Object object14 = object4;
            object4 = "priority";
            object5 = ((LogPusherExp)object).logConfig;
            n7 = ((LogConfig)object5).defaultPriority;
            int n8 = jSONObject.optInt((String)object4, n7);
            object4 = "environment";
            object5 = "all";
            String string4 = jSONObject.optString((String)object4, (String)object5);
            object4 = "encryptionLevelKey";
            object5 = ((LogPusherExp)object).logConfig;
            object5 = ((LogConfig)object5).encryptionLevel;
            String string5 = jSONObject.optString((String)object4, (String)object5);
            int n10 = jSONObject.has((String)object3);
            if (n10 != 0) {
                object3 = jSONObject.optJSONArray((String)object3);
            } else {
                object3 = ((LogPusherExp)object).logConfig;
                object3 = ((LogConfig)object3).fallBackUrl;
            }
            Object object15 = object3;
            boolean bl4 = jSONObject.has((String)object2);
            if (bl4) {
                object2 = jSONObject.optJSONArray((String)object2);
            } else {
                object2 = ((LogPusherExp)object).logConfig;
                object2 = ((LogConfig)object2).fallBackPublicKeys;
            }
            Object object16 = object2;
            object2 = "errorUrl";
            object3 = ((LogPusherExp)object).logConfig;
            object3 = ((LogConfig)object3).errorUrl;
            String string6 = jSONObject.optString((String)object2, (String)object3);
            object2 = this;
            object3 = string3;
            n10 = n4;
            String string7 = object10;
            object7 = object11;
            object8 = object12;
            object9 = object13;
            object10 = object14;
            object12 = string4;
            object13 = string5;
            object14 = object15;
            object = string6;
            return this.addChannel(string3, n4, l3, string7, (String)object11, (JSONObject)object8, (JSONObject)object9, (Map)object10, n8, string4, string5, (JSONArray)object15, (JSONArray)object16, string6);
        }
        catch (JSONException jSONException) {
            return false;
        }
    }

    public void addLogLines(String string2, String string3) {
        ww1_1 ww1_12 = new ww1_1(this, string2, string3);
        ExecutorManager.runOnLogPusherThread(ww1_12);
    }

    public void addLogsToPersistedQueue(JSONObject jSONObject) {
        sw1_2 sw1_22 = new sw1_2(this, jSONObject);
        ExecutorManager.runOnLogSessioniserThread(sw1_22);
    }

    /*
     * Exception decompiling
     */
    public void clearBacklog() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 19[TRYBLOCK] [22 : 313->322)] java.lang.Throwable
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

    public Set getChannelNames() {
        return this.channels.keySet();
    }

    public void pushAllLogs() {
        cc1_2 cc1_22 = new cc1_2(this, 1);
        ExecutorManager.runOnLogPusherThread(cc1_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void pushDatFiles(ArrayList iterator, LogChannelExp logChannelExp, boolean bl2) {
        try {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while (true) {
                long l2;
                long l3;
                long l4;
                long l7;
                boolean bl3;
                boolean bl4;
                if (!(bl4 = iterator.hasNext())) {
                    LogPusherExp.acknowledgeLogsPushed(arrayList, logChannelExp);
                    return;
                }
                Object object = iterator.next();
                if ((object = (File)object) != null && (bl3 = ((File)object).exists()) && (l7 = (l4 = (l3 = ((File)object).length()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                    String string2 = ((File)object).getName();
                    long l8 = ((File)object).length();
                    long l12 = l8 - l2;
                    Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object2 > 0) {
                        int n3;
                        byte[] byArray = LogUtils.getLogsFromFileExp((File)object);
                        l7 = this.getFileCount(string2, (File)object);
                        JSONArray jSONArray = new JSONArray();
                        int n4 = LogPusherExp.getBatchNum(string2);
                        JSONArray jSONArray2 = jSONArray.put(n4);
                        String string3 = null;
                        Object object3 = logChannelExp;
                        object2 = this.pushLogsToServer(byArray, (int)l7, jSONArray2, logChannelExp, false);
                        n4 = -1;
                        int n7 = 200;
                        if (object2 != n7 && ((l7 = (long)logChannelExp.getRetryAttempts()) == n4 || (l7 = (long)logChannelExp.getCurrentBatchRetryAttempts()) < (n3 = logChannelExp.getRetryAttempts()))) {
                            String string4 = "system";
                            String string5 = "error";
                            object3 = "log_pusher";
                            string3 = "error_response";
                            Integer n8 = (int)object2;
                            SdkTracker.trackBootAction(string4, string5, (String)object3, string3, n8);
                            l7 = logChannelExp.getCurrentBatchRetryAttempts() + 1;
                            logChannelExp.setCurrentBatchRetryAttempts((int)l7);
                        }
                        l7 = logChannelExp.getRetryAttempts();
                        n3 = 0;
                        Object var20_17 = null;
                        if (l7 != n4 && (n4 = logChannelExp.getCurrentBatchRetryAttempts()) >= (l7 = (long)logChannelExp.getRetryAttempts())) {
                            this.hitErrorUrl(string2, logChannelExp, (int)object2);
                            logChannelExp.setCurrentBatchRetryAttempts(0);
                            if (bl2) {
                                arrayList.add(string2);
                            }
                        }
                        if (object2 != n7) continue;
                        logChannelExp.setCurrentBatchRetryAttempts(0);
                        if (bl2) {
                            arrayList.add(string2);
                        }
                        ((File)object).delete();
                        continue;
                    }
                    if (bl2) {
                        arrayList.add(string2);
                    }
                    ((File)object).delete();
                    continue;
                }
                if (object == null || !bl2) continue;
                object = ((File)object).getName();
                arrayList.add(object);
            }
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void pushNdJsonFiles(ArrayList arrayList, LogChannelExp logChannelExp, boolean bl2) {
        LogPusherExp logPusherExp = this;
        ArrayList arrayList2 = arrayList;
        LogChannelExp logChannelExp2 = logChannelExp;
        try {
            ArrayList<Object> arrayList3 = new ArrayList<Object>();
            int n3 = 0;
            Object object = null;
            int n4 = 0;
            while (true) {
                int n7;
                block20: {
                    block18: {
                        block19: {
                            int n8;
                            int n10;
                            String string2;
                            Object object2;
                            int n14;
                            if (n3 >= (n14 = arrayList.size())) {
                                LogPusherExp.acknowledgeLogsPushed(arrayList3, logChannelExp2);
                                return;
                            }
                            long l2 = 0L;
                            long l3 = l2;
                            for (n7 = n3; n7 < (n3 = arrayList.size()); ++n7) {
                                long l4;
                                long l7;
                                long l8;
                                object = arrayList2.get(n7);
                                if ((object = (File)object) == null || !(object2 = ((File)object).exists())) continue;
                                string2 = ((File)object).getName();
                                n3 = logPusherExp.getFileCount(string2, (File)object);
                                object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                                if (object2 && (object2 = (l8 = (l7 = (long)n3 + l3) - (l4 = logChannelExp.getBatchCount())) == 0L ? 0 : (l8 < 0L ? -1 : 1)) > 0) break;
                                l7 = n3;
                                l3 += l7;
                            }
                            if ((n3 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1))) == 0) break block18;
                            object = new ArrayList();
                            for (n14 = n4; n14 < n7; ++n14) {
                                Object e2 = arrayList2.get(n14);
                                File file = (File)e2;
                                String string3 = file.getName();
                                ((ArrayList)object).add(string3);
                            }
                            Object object3 = logPusherExp.getFilesContent((ArrayList)object);
                            Object object4 = LogPusherExp.getBatchNumArray((ArrayList)object);
                            object = ((lm2)object3).a;
                            if (object == null) break block19;
                            Object object5 = object;
                            byte[] byArray = (byte[])object;
                            int n15 = byArray.length;
                            if (n15 <= 0) break block19;
                            Object object6 = object;
                            byte[] byArray2 = (byte[])object;
                            object = ((lm2)object3).b;
                            int n16 = 1;
                            if (object == null) {
                                n10 = 1;
                            } else {
                                object = (Integer)object;
                                n10 = n3 = ((Integer)object).intValue();
                            }
                            object2 = true;
                            object = this;
                            object3 = byArray2;
                            n15 = n10;
                            Object object7 = logChannelExp;
                            n3 = this.pushLogsToServer(byArray2, n10, (JSONArray)object4, logChannelExp, (boolean)object2);
                            n14 = -1;
                            n15 = 200;
                            if (n3 != n15 && ((n8 = logChannelExp.getRetryAttempts()) == n14 || (n8 = logChannelExp.getCurrentBatchRetryAttempts()) < (n10 = logChannelExp.getRetryAttempts()))) {
                                object4 = "system";
                                object7 = "error";
                                string2 = "log_pusher";
                                String string4 = "error_response";
                                Integer n17 = n3;
                                SdkTracker.trackBootAction((String)object4, (String)object7, string2, string4, n17);
                                n8 = logChannelExp.getCurrentBatchRetryAttempts() + n16;
                                logChannelExp2.setCurrentBatchRetryAttempts(n8);
                            }
                            if ((n8 = logChannelExp.getRetryAttempts()) != n14 && (n14 = logChannelExp.getCurrentBatchRetryAttempts()) >= (n8 = logChannelExp.getRetryAttempts())) {
                                for (n14 = n4; n14 < n7; ++n14) {
                                    object4 = arrayList2.get(n14);
                                    object4 = (File)object4;
                                    object4 = ((File)object4).getName();
                                    logPusherExp.hitErrorUrl((String)object4, logChannelExp2, n3);
                                    if (!bl2) continue;
                                    arrayList3.add(object4);
                                }
                                logChannelExp2.setCurrentBatchRetryAttempts(0);
                            }
                            if (n3 == n15) {
                                logChannelExp2.setCurrentBatchRetryAttempts(0);
                                while (n4 < n7) {
                                    if (bl2) {
                                        object = arrayList2.get(n4);
                                        object = (File)object;
                                        object = ((File)object).getName();
                                        arrayList3.add(object);
                                    }
                                    object = arrayList2.get(n4);
                                    object = (File)object;
                                    ((File)object).delete();
                                    ++n4;
                                }
                            }
                            break block20;
                        }
                        while (n4 < n7) {
                            if (bl2) {
                                object = arrayList2.get(n4);
                                object = (File)object;
                                object = ((File)object).getName();
                                arrayList3.add(object);
                            }
                            object = arrayList2.get(n4);
                            object = (File)object;
                            ((File)object).delete();
                            ++n4;
                        }
                        break block20;
                    }
                    while (n4 < n7) {
                        if (bl2) {
                            object = arrayList2.get(n4);
                            object = ((File)object).getName();
                            arrayList3.add(object);
                        }
                        object = arrayList2.get(n4);
                        ((File)object).delete();
                        ++n4;
                    }
                }
                n3 = n7;
                n4 = n7;
            }
        }
        catch (Exception exception) {
            return;
        }
    }

    public void setEndPointSandbox(Boolean bl2) {
        boolean bl3;
        this.isSandboxEnv = bl3 = bl2.booleanValue();
    }

    public void setHeaders(JSONObject jSONObject, String object) {
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
    public void setLogHeaderValues(JSONObject var1_1, String var2_2) {
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void startLogPusher() {
        Object object = this.logConfig;
        int n3 = ((LogConfig)object).shouldPush;
        if (n3 == 0) {
            return;
        }
        try {
            object = new Timer();
        }
        catch (Exception exception) {
            return;
        }
        this.logPushTimer = object;
        LogPusherExp$LogPushTimerTask logPusherExp$LogPushTimerTask = new LogPusherExp$LogPushTimerTask(this);
        this.logPushTimerTask = logPusherExp$LogPushTimerTask;
        Timer timer = this.logPushTimer;
        object = this.logConfig;
        n3 = ((LogConfig)object).logPostInterval;
        long l2 = n3;
        long l3 = 0L;
        timer.scheduleAtFixedRate((TimerTask)logPusherExp$LogPushTimerTask, l3, l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void stopLogPusherOnTerminate() {
        Object object = this.logConfig;
        boolean bl2 = ((LogConfig)object).shouldPush;
        if (!bl2) {
            return;
        }
        try {
            object = this.logPushTimer;
        }
        catch (Exception exception) {
            return;
        }
        ((Timer)object).cancel();
        object = new Timer();
        this.logPushTimer = object;
        object = new LogPusherExp$LogPushTimerTask(this);
        this.logPushTimerTask = object;
        ((LogPusherExp$LogPushTimerTask)object).run();
    }

    /*
     * Exception decompiling
     */
    public int traverseTheFile(String var1_1, File var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 19[TRYBLOCK] [24 : 352->355)] java.lang.Throwable
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
}


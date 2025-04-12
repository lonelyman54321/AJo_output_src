/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.hypersdk.analytics.LogSessioniserExp$LogSessioniserTimerTask;
import in.juspay.hypersdk.analytics.LogUtils;
import in.juspay.hypersdk.analytics.LogWorkspace;
import in.juspay.hypersdk.analytics.LoggerState;
import in.juspay.hypersdk.services.Workspace;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

public class LogSessioniserExp {
    private final AtomicInteger batchNumber;
    private ConcurrentHashMap currentFilesObj;
    private final ConcurrentLinkedQueue filesObj;
    private ConcurrentHashMap fosMap;
    private final LogConfig logConfig;
    private final LogPusherExp logPusherExp;
    private final LogWorkspace logWorkspace;
    private LoggerState loggerState;
    private final ConcurrentHashMap logsCount;
    private TimerTask moveToPusher;
    private Timer moveToPusherTimer;
    private final AtomicBoolean pushFileCreated;
    private String rawLogsrequestId;
    private boolean tempFlipDone;

    public LogSessioniserExp(Workspace workspace, LogConfig logConfig, LogPusherExp logPusherExp) {
        Object object = LogUtils.generateUUID().replace("-", "");
        this.rawLogsrequestId = object;
        this.moveToPusherTimer = object = new Timer();
        this.batchNumber = object = new AtomicInteger(0);
        this.tempFlipDone = false;
        this.pushFileCreated = object = new AtomicBoolean(false);
        object = LoggerState.IDLE;
        this.loggerState = object;
        object = new ConcurrentHashMap();
        this.fosMap = object;
        object = new ConcurrentHashMap();
        this.currentFilesObj = object;
        object = new ConcurrentLinkedQueue();
        this.filesObj = object;
        object = new ConcurrentHashMap();
        this.logsCount = object;
        object = new LogWorkspace(workspace);
        this.logWorkspace = object;
        this.logConfig = logConfig;
        this.logPusherExp = logPusherExp;
    }

    public static /* synthetic */ void a(LogSessioniserExp logSessioniserExp) {
        logSessioniserExp.lambda$stopLogSessioniserOnTerminate$0();
    }

    public static /* synthetic */ LogConfig access$100(LogSessioniserExp logSessioniserExp) {
        return logSessioniserExp.logConfig;
    }

    public static /* synthetic */ void access$200(LogSessioniserExp logSessioniserExp) {
        logSessioniserExp.pushToPusher();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void addToLogs(String var1_1, String var2_2, JSONObject var3_3) {
        block153: {
            block152: {
                block151: {
                    block147: {
                        block150: {
                            block149: {
                                block148: {
                                    block154: {
                                        block146: {
                                            block145: {
                                                block144: {
                                                    block143: {
                                                        block142: {
                                                            block141: {
                                                                block137: {
                                                                    block138: {
                                                                        block140: {
                                                                            block139: {
                                                                                var4_4 = this;
                                                                                var5_5 = var1_1;
                                                                                var6_6 = var2_2;
                                                                                var7_7 = var3_3;
                                                                                var8_8 = 1;
                                                                                var9_9 = this.logConfig;
                                                                                var9_9 = var9_9.fileFormat;
                                                                                var10_10 = "ndJson";
                                                                                var11_11 = var9_9.equals(var10_10);
                                                                                var10_10 = ".dat";
                                                                                var12_12 = ".ndjson";
                                                                                var9_9 = var11_11 != 0 ? var12_12 : var10_10;
                                                                                var13_13 = var4_4.currentFilesObj;
                                                                                var14_14 = var13_13.containsKey(var5_5);
                                                                                var15_15 = "%03d";
                                                                                var16_16 = '-';
                                                                                var17_17 = "logs-";
                                                                                if (var14_14 == 0) break block137;
                                                                                var13_13 = var4_4.currentFilesObj;
                                                                                var13_13 = var13_13.get(var5_5);
                                                                                var13_13 = (ArrayList)var13_13;
                                                                                if (var13_13 == null) break block138;
                                                                                var18_18 = var13_13.size() - var8_8;
                                                                                var13_13 = var13_13.get(var18_18);
                                                                                var13_13 = (String)var13_13;
                                                                                var19_19 = var4_4.logsCount;
                                                                                var19_19 = var19_19.get(var13_13);
                                                                                if (var19_19 == null) break block139;
                                                                                var19_19 = var4_4.logsCount;
                                                                                var19_19 = var19_19.get(var13_13);
                                                                                var19_19 = (lm2)var19_19;
                                                                                if (var19_19 == null) break block139;
                                                                                var19_19 = var19_19.a;
                                                                                if (var19_19 == null) break block139;
                                                                                var19_19 = (Integer)var19_19;
                                                                                var18_18 = var19_19.intValue();
                                                                                var20_20 = var18_18;
                                                                                var22_21 = var4_4.logConfig;
                                                                                var23_22 = var22_21.maxLogsPerPush;
                                                                                var25_23 = var20_20 == var23_22 ? 0 : (var20_20 < var23_22 ? -1 : 1);
                                                                                if (var25_23 < 0) break block139;
                                                                                var26_24 = new StringBuilder(var17_17);
                                                                                var26_24.append((String)var5_5);
                                                                                var26_24.append(var16_16);
                                                                                var26_24.append((String)var6_6);
                                                                                var26_24.append(var16_16);
                                                                                var6_6 = Locale.US;
                                                                                var27_25 = var4_4.batchNumber;
                                                                                var8_8 = var27_25.incrementAndGet();
                                                                                var27_25 = var8_8;
                                                                                var14_14 = 1;
                                                                                var28_26 = new Object[var14_14];
                                                                                var14_14 = 0;
                                                                                var13_13 = null;
                                                                                var28_26[0] = var27_25;
                                                                                var6_6 = String.format((Locale)var6_6, (String)var15_15, var28_26);
                                                                                var26_24.append((String)var6_6);
                                                                                var26_24.append((String)var9_9);
                                                                                var6_6 = var26_24.toString();
                                                                                break block140;
                                                                            }
                                                                            var6_6 = var13_13;
                                                                        }
lbl104:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var14_14 = 0;
                                                                            var13_13 = null;
                                                                            break block141;
                                                                            break;
                                                                        }
                                                                    }
                                                                    try {
                                                                        var26_24 = new StringBuilder(var17_17);
                                                                    }
                                                                    catch (Exception v0) {
                                                                        ** continue;
                                                                    }
                                                                    var26_24.append((String)var5_5);
                                                                    var26_24.append(var16_16);
                                                                    var26_24.append((String)var6_6);
                                                                    var26_24.append(var16_16);
                                                                    var6_6 = Locale.US;
                                                                    var27_25 = var4_4.batchNumber;
                                                                    var8_8 = var27_25.incrementAndGet();
                                                                    var27_25 = var8_8;
                                                                    var14_14 = 1;
                                                                    var28_26 = new Object[var14_14];
                                                                    var14_14 = 0;
                                                                    var13_13 = null;
                                                                    var28_26[0] = var27_25;
                                                                    var6_6 = String.format((Locale)var6_6, (String)var15_15, var28_26);
                                                                    var26_24.append((String)var6_6);
                                                                    var26_24.append((String)var9_9);
                                                                    var6_6 = var26_24.toString();
                                                                    ** continue;
                                                                }
                                                                var26_24 = new StringBuilder(var17_17);
                                                                var26_24.append((String)var5_5);
                                                                var26_24.append(var16_16);
                                                                var26_24.append((String)var6_6);
                                                                var26_24.append(var16_16);
                                                                var6_6 = Locale.US;
                                                                var27_25 = var4_4.batchNumber;
                                                                var8_8 = var27_25.incrementAndGet();
                                                                var27_25 = var8_8;
                                                                var14_14 = 1;
                                                                var28_26 = new Object[var14_14];
                                                                var14_14 = 0;
                                                                var13_13 = null;
                                                                var28_26[0] = var27_25;
                                                                var6_6 = String.format((Locale)var6_6, (String)var15_15, var28_26);
                                                                var26_24.append((String)var6_6);
                                                                var26_24.append((String)var9_9);
                                                                var6_6 = var26_24.toString();
                                                            }
                                                            var26_24 = var4_4.fosMap;
                                                            var29_27 = var26_24.containsKey(var6_6);
                                                            if (var29_27 == 0) break block142;
                                                            var26_24 = var4_4.fosMap;
                                                            var26_24 = var26_24.get(var6_6);
                                                            var26_24 = (FileOutputStream)var26_24;
                                                            break block143;
                                                        }
                                                        var29_27 = 0;
                                                        var26_24 = null;
                                                    }
                                                    if (var26_24 != null) break block154;
                                                    var26_24 = var4_4.logWorkspace;
                                                    var8_8 = (int)var4_4.tempFlipDone;
                                                    if (var8_8 != 0) break block144;
                                                    var27_25 = new StringBuilder();
                                                    var9_9 = "temp/";
                                                    var27_25.append((String)var9_9);
                                                    var27_25.append((String)var6_6);
                                                    ** GOTO lbl230
                                                }
                                                var27_25 = new StringBuilder();
                                                var9_9 = "original/";
                                                var27_25.append((String)var9_9);
                                                var27_25.append((String)var6_6);
lbl230:
                                                // 2 sources

                                                var27_25 = var27_25.toString();
                                                var26_24 = var26_24.open((String)var27_25);
                                                var11_11 = 1;
                                                var27_25 = new FileOutputStream((File)var26_24, (boolean)var11_11);
                                                var26_24 = var4_4.fosMap;
                                                var26_24.put(var6_6, var27_25);
                                                var26_24 = var4_4.currentFilesObj;
                                                var29_27 = var26_24.containsKey(var5_5);
                                                if (var29_27 == 0) break block145;
                                                var26_24 = var4_4.currentFilesObj;
                                                var5_5 = var26_24.get(var5_5);
                                                var5_5 = (ArrayList)var5_5;
                                                if (var5_5 == null) ** GOTO lbl265
                                                var5_5.add(var6_6);
                                                ** GOTO lbl265
                                            }
                                            var26_24 = new ArrayList();
                                            var26_24.add(var6_6);
                                            var9_9 = var4_4.currentFilesObj;
                                            var9_9.put(var5_5, var26_24);
lbl265:
                                            // 3 sources

                                            var5_5 = var4_4.pushFileCreated;
                                            var30_28 = (char)var5_5.get();
                                            if (var30_28 == '\u0000') break block146;
                                            var30_28 = (char)var4_4.tempFlipDone;
                                            if (var30_28 != '\u0000') break block146;
                                            var29_27 = 1;
                                            var5_5 = new ak_2(var4_4, var29_27);
                                            ExecutorManager.runOnBackgroundThread((Runnable)var5_5);
                                        }
                                        var26_24 = var27_25;
                                    }
                                    var5_5 = var4_4.logsCount;
                                    var30_28 = var5_5.containsKey(var6_6);
                                    var27_25 = "batch_number";
                                    if (var30_28 == '\u0000') ** GOTO lbl339
                                    var5_5 = var4_4.logsCount;
                                    var5_5 = var5_5.get(var6_6);
                                    var5_5 = (lm2)var5_5;
                                    if (var5_5 == null) break block147;
                                    var9_9 = var5_5.a;
                                    if (var9_9 != null) break block148;
                                    var11_11 = 0;
                                    var9_9 = null;
                                    break block149;
                                }
                                var9_9 = (Integer)var9_9;
                                var11_11 = var9_9.intValue();
                            }
                            var5_5 = var5_5.b;
                            if (var5_5 != null) break block150;
                            var30_28 = LogPusherExp.getBatchNum((String)var6_6);
                            break block151;
                        }
                        var5_5 = (Integer)var5_5;
                        var30_28 = var5_5.intValue();
                        break block151;
                    }
                    var30_28 = LogPusherExp.getBatchNum((String)var6_6);
                    var11_11 = 0;
                    var9_9 = null;
                }
                var13_13 = var4_4.logsCount;
                var31_29 = 1;
                var11_11 += var31_29;
                var9_9 = var11_11;
                var15_15 = (int)var30_28;
                var28_26 = new lm2(var9_9, var15_15);
                var13_13.put(var6_6, var28_26);
                var7_7.put((String)var27_25, (int)var30_28);
                ** GOTO lbl355
lbl339:
                // 1 sources

                var30_28 = LogPusherExp.getBatchNum((String)var6_6);
                var9_9 = var4_4.logsCount;
                var14_14 = 1;
                var13_13 = var14_14;
                var15_15 = (int)var30_28;
                var28_26 = new lm2(var13_13, var15_15);
                var9_9.put(var6_6, var28_26);
                var7_7.put((String)var27_25, (int)var30_28);
lbl355:
                // 2 sources

                var5_5 = var3_3.toString();
                var32_30 = var6_6.contains(var12_12);
                if (var32_30 == 0) break block152;
                var7_7 = new StringBuilder();
                var7_7.append((String)var5_5);
                var30_28 = '\n';
                var7_7.append(var30_28);
                var5_5 = var7_7.toString();
            }
            var7_7 = StandardCharsets.UTF_8;
            var5_5 = var5_5.getBytes((Charset)var7_7);
            var33_31 = var6_6.contains(var10_10);
            if (var33_31 == 0) break block153;
            var33_31 = ((Object)var5_5).length;
            var32_30 = 4;
            var7_7 = ByteBuffer.allocate(var32_30);
            var6_6 = var7_7.putInt(var33_31);
            var6_6 = var6_6.array();
            var26_24.write((byte[])var6_6);
        }
        var26_24.write((byte[])var5_5);
lbl391:
        // 2 sources

    }

    public static /* synthetic */ void b(LogSessioniserExp logSessioniserExp, ConcurrentHashMap concurrentHashMap, boolean bl2) {
        logSessioniserExp.lambda$pushToPusher$3(concurrentHashMap, bl2);
    }

    public static /* synthetic */ void c(LogSessioniserExp logSessioniserExp) {
        logSessioniserExp.updatePushFile();
    }

    public static /* synthetic */ void d(LogSessioniserExp logSessioniserExp, JSONObject jSONObject) {
        logSessioniserExp.lambda$addLogLine$1(jSONObject);
    }

    public static /* synthetic */ void e(LogSessioniserExp logSessioniserExp) {
        logSessioniserExp.lambda$startPushing$2();
    }

    private void getAllTempFiles(JSONObject jSONObject) {
        Iterator iterator;
        String string2;
        boolean bl2;
        Iterator<Object> iterator2 = this.filesObj.iterator();
        while (true) {
            bl2 = iterator2.hasNext();
            string2 = "";
            if (!bl2) break;
            iterator = (String)iterator2.next();
            try {
                jSONObject.put((String)((Object)iterator), (Object)string2);
            }
            catch (Exception exception) {}
        }
        iterator2 = this.currentFilesObj.entrySet().iterator();
        block11: while (bl2 = iterator2.hasNext()) {
            iterator = (Map.Entry)iterator2.next();
            iterator = iterator.getValue();
            iterator = (ArrayList)((Object)iterator);
            try {
                iterator = ((ArrayList)((Object)iterator)).iterator();
            }
            catch (Exception exception) {
                continue;
            }
            while (true) {
                boolean bl3 = iterator.hasNext();
                if (!bl3) continue block11;
                break;
            }
            {
                Object object = iterator.next();
                object = (String)object;
                jSONObject.put(object, (Object)string2);
                continue;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONArray getLogChannels(JSONObject object) {
        void var2_18;
        int n3;
        void var2_12;
        String string2;
        boolean bl2;
        int n4;
        JSONArray jSONArray = object.optJSONArray("channels");
        String string3 = "default";
        if ((jSONArray == null || (n4 = jSONArray.length()) == 0) && (bl2 = object.has(string2 = "channel"))) {
            if (jSONArray == null) {
                JSONArray jSONArray2 = new JSONArray();
            }
            String string4 = object.optString(string2, string3);
            var2_12.put((Object)string4);
        }
        if (var2_12 == null || (n3 = var2_12.length()) == 0) {
            void var1_8;
            try {
                LogConfig logConfig = this.logConfig;
                JSONArray jSONArray3 = logConfig.defaultChannels;
                if (jSONArray3 != null) {
                    LogConfig logConfig2 = this.logConfig;
                    JSONArray jSONArray4 = logConfig2.defaultChannels;
                    String string5 = jSONArray4.toString();
                    JSONArray jSONArray5 = new JSONArray(string5);
                } else {
                    JSONArray jSONArray6 = new JSONArray();
                }
            }
            catch (Exception exception) {
                JSONArray jSONArray7 = new JSONArray();
            }
            void var2_17 = var1_8;
            var1_8.put((Object)string3);
        }
        return var2_18;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int getLogCount(String string2) {
        Object v4 = this.logsCount.get(string2);
        if (v4 != null) {
            Object object;
            lm2 lm22 = (lm2)this.logsCount.get(string2);
            if (lm22 != null && (object = lm22.a) != null) {
                Integer n3 = (Integer)object;
                return n3;
            }
            File file = this.logWorkspace.open(string2);
            if (file == null) return 0;
            LogPusherExp logPusherExp = this.logPusherExp;
            return logPusherExp.traverseTheFile(string2, file);
        }
        File file = this.logWorkspace.open(string2);
        if (file == null) return 0;
        LogPusherExp logPusherExp = this.logPusherExp;
        return logPusherExp.traverseTheFile(string2, file);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$addLogLine$1(JSONObject var1_1) {
        var2_2 = 1;
        var3_3 = this.logConfig;
        var4_4 = var3_3.shouldPush;
        if (!var4_4) {
            return;
        }
        var3_3 = this.getLogChannels(var1_1);
        var5_5 = this.logPusherExp.getChannelNames();
        var6_6 = LoggerState.BUFFERING;
        var7_7 = this.loggerState;
        var8_8 = var6_6.equals((Object)var7_7);
        if (var8_8 && (var8_8 = this.shouldAllowLog(var1_1))) {
            var8_8 = true;
        } else {
            var8_8 = false;
            var6_6 = null;
        }
        var7_7 = null;
        block39: for (var9_9 = 0; var9_9 < (var10_10 = var3_3.length()); var9_9 += var2_2) {
            block45: {
                block46: {
                    if (!var8_8) break block46;
                    var11_11 = var3_3.getString(var9_9);
                    var12_12 = var5_5.contains(var11_11);
                    if (!var12_12) break block45;
                    var13_13 = this.logConfig;
                    var13_13 = var13_13.fileFormat;
                    var14_14 = "ndJson";
                    var12_12 = var13_13.equals(var14_14);
                    var13_13 = var12_12 != false ? ".ndjson" : ".dat";
                    var14_14 = new StringBuilder();
                    var15_15 = "logs-";
                    var14_14.append((String)var15_15);
                    var14_14.append(var11_11);
                    var15_15 = "-";
                    var14_14.append((String)var15_15);
                    var15_15 = this.rawLogsrequestId;
                    var14_14.append((String)var15_15);
                    var15_15 = Locale.US;
                    var16_16 = "-%03d";
                    var17_17 /* !! */  = this.batchNumber;
                    var18_18 = var17_17 /* !! */ .incrementAndGet();
                    var17_17 /* !! */  = Integer.valueOf(var18_18);
                    var19_19 = new Object[var2_2];
                    var19_19[0] = var17_17 /* !! */ ;
                    var15_15 = String.format((Locale)var15_15, var16_16, var19_19);
                    var14_14.append((String)var15_15);
                    var15_15 = "-0001";
                    var14_14.append((String)var15_15);
                    var14_14.append((String)var13_13);
                    var13_13 = var14_14.toString();
                    var14_14 = "batch_number";
                    var15_15 = this.batchNumber;
                    var20_20 = var15_15.get();
                    var1_1.put((String)var14_14, var20_20);
lbl82:
                    // 2 sources

                    while (true) {
                        var14_14 = this.logWorkspace;
                        var15_15 = new StringBuilder();
                        var16_16 = "original/";
                        var15_15.append(var16_16);
                        var15_15.append((String)var13_13);
                        var15_15 = var15_15.toString();
                        var14_14 = var14_14.open((String)var15_15);
                        LogUtils.writeLogToFileExp(var1_1, (File)var14_14);
                        var15_15 = this.logWorkspace;
                        var15_15 = var15_15.open((String)var13_13);
                        if (var14_14 == null || var15_15 == null) ** GOTO lbl106
                        var14_14.renameTo((File)var15_15);
lbl106:
                        // 2 sources

                        var14_14 = this.logPusherExp;
                        var14_14.addLogLines(var11_11, (String)var13_13);
                        break block45;
                        break;
                    }
                }
                var11_11 = var3_3.getString(var9_9);
                var12_12 = var5_5.contains(var11_11);
                if (!var12_12) break block45;
                var13_13 = this.rawLogsrequestId;
                this.addToLogs(var11_11, (String)var13_13, var1_1);
            }
lbl121:
            // 2 sources

        }
        return;
        catch (Exception v0) {
            ** continue;
        }
        catch (Exception v1) {
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$pushToPusher$3(ConcurrentHashMap concurrentHashMap, boolean bl2) {
        CharSequence charSequence;
        Object object;
        Object object2;
        Object object3;
        int n3;
        Object object4;
        boolean bl3;
        Object object5;
        Object object6;
        boolean bl4;
        LogSessioniserExp logSessioniserExp = this;
        int n4 = 1;
        Object object7 = LoggerState.BUFFERING;
        LoggerState loggerState = this.loggerState;
        boolean bl5 = object7.equals((Object)loggerState);
        String string2 = "-%04d";
        int n7 = 46;
        String string3 = "temp/";
        if (bl5) {
            object7 = concurrentHashMap.entrySet().iterator();
            while (bl4 = object7.hasNext()) {
                object6 = (ArrayList)((Map.Entry)object7.next()).getValue();
                object5 = new ArrayList();
                object6 = ((ArrayList)object6).iterator();
                while (bl3 = object6.hasNext()) {
                    boolean bl6;
                    object4 = (String)object6.next();
                    n3 = ((String)object4).lastIndexOf(n7);
                    object3 = new StringBuilder();
                    object2 = ((String)object4).substring(0, n3);
                    ((StringBuilder)object3).append((String)object2);
                    object2 = Locale.US;
                    int n8 = logSessioniserExp.getLogCount((String)object4);
                    object = n8;
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = object;
                    object2 = String.format((Locale)object2, string2, objectArray);
                    ((StringBuilder)object3).append((String)object2);
                    charSequence = ((String)object4).substring(n3);
                    ((StringBuilder)object3).append((String)charSequence);
                    charSequence = ((StringBuilder)object3).toString();
                    object3 = logSessioniserExp.logWorkspace;
                    object4 = string3.concat((String)object4);
                    object4 = ((Workspace)object3).open((String)object4);
                    object3 = logSessioniserExp.logWorkspace;
                    object2 = new StringBuilder(string3);
                    ((StringBuilder)object2).append((String)charSequence);
                    object2 = ((StringBuilder)object2).toString();
                    object3 = ((Workspace)object3).open((String)object2);
                    if (object4 == null || !(bl6 = ((File)object4).exists())) continue;
                    if (object3 != null) {
                        ((File)object4).renameTo((File)object3);
                    }
                    ((ArrayList)object5).add(charSequence);
                }
                object6 = logSessioniserExp.filesObj;
                ((ConcurrentLinkedQueue)object6).addAll(object5);
            }
        }
        if (bl5 = (object7 = LoggerState.PUSHING).equals(object6 = logSessioniserExp.loggerState)) {
            try {
                object7 = logSessioniserExp.filesObj;
                object7 = ((ConcurrentLinkedQueue)object7).iterator();
                while (bl4 = object7.hasNext()) {
                    object6 = object7.next();
                    object6 = (String)object6;
                    object5 = logSessioniserExp.logWorkspace;
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append(string3);
                    ((StringBuilder)object4).append((String)object6);
                    if ((object5 = ((Workspace)object5).open((String)(object4 = ((StringBuilder)object4).toString()))) == null || !(bl3 = ((File)object5).exists()) || (object6 = ((Workspace)(object4 = logSessioniserExp.logWorkspace)).open((String)object6)) == null) continue;
                    ((File)object5).renameTo((File)object6);
                }
            }
            catch (Exception exception) {}
            object7 = concurrentHashMap.entrySet().iterator();
            while (bl4 = object7.hasNext()) {
                object6 = (Map.Entry)object7.next();
                try {
                    boolean bl7;
                    object6 = object6.getValue();
                    object6 = (ArrayList)object6;
                    object6 = ((ArrayList)object6).iterator();
                    while (bl7 = object6.hasNext()) {
                        object5 = object6.next();
                        object5 = (String)object5;
                        object4 = logSessioniserExp.logWorkspace;
                        if (bl2) {
                            charSequence = new StringBuilder();
                            charSequence.append(string3);
                            charSequence.append((String)object5);
                        } else {
                            charSequence = new StringBuilder();
                            object3 = "original/";
                            charSequence.append((String)object3);
                            charSequence.append((String)object5);
                        }
                        if ((object4 = ((Workspace)object4).open((String)(charSequence = charSequence.toString()))) == null || (n3 = (int)(((File)object4).exists() ? 1 : 0)) == 0) continue;
                        n3 = ((String)object5).lastIndexOf(n7);
                        object3 = logSessioniserExp.logWorkspace;
                        object2 = new StringBuilder();
                        object = ((String)object5).substring(0, n3);
                        ((StringBuilder)object2).append((String)object);
                        object = Locale.US;
                        int n10 = logSessioniserExp.getLogCount((String)object5);
                        Integer n14 = n10;
                        Object[] objectArray = new Object[n4];
                        objectArray[0] = n14;
                        object = String.format((Locale)object, string2, objectArray);
                        ((StringBuilder)object2).append((String)object);
                        object5 = ((String)object5).substring(n3);
                        ((StringBuilder)object2).append((String)object5);
                        object5 = ((StringBuilder)object2).toString();
                        if ((object5 = ((Workspace)object3).open((String)object5)) == null) continue;
                        ((File)object4).renameTo((File)object5);
                    }
                }
                catch (Exception exception) {
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$startPushing$2() {
        LoggerState loggerState = LoggerState.PUSHING;
        Object object = this.loggerState;
        boolean bl2 = ((Object)((Object)loggerState)).equals(object);
        if (bl2) return;
        object = this.pushFileCreated;
        boolean bl3 = true;
        ((AtomicBoolean)object).set(bl3);
        this.updatePushFile();
        object = this.loggerState;
        synchronized (object) {
            this.loggerState = loggerState;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$stopLogSessioniserOnTerminate$0() {
        Object object;
        try {
            object = this.moveToPusher;
            if (object != null) {
                ((TimerTask)object).cancel();
            }
            object = this.moveToPusherTimer;
            ((Timer)object).cancel();
            object = this.logConfig;
            boolean bl2 = ((LogConfig)object).shouldPush;
            if (bl2) {
                this.pushToPusher();
            }
            object = LoggerState.TERMINATED;
            this.loggerState = object;
        }
        catch (Exception exception) {}
        object = this.logPusherExp;
        Objects.requireNonNull(object);
        gx1_1 gx1_12 = new gx1_1(object, 0);
        ExecutorManager.runOnLogPusherThread(gx1_12);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void pushToPusher() {
        boolean bl2;
        ConcurrentHashMap concurrentHashMap = LogUtils.generateUUID();
        Object object = "-";
        Object object2 = "";
        concurrentHashMap = ((String)((Object)concurrentHashMap)).replace((CharSequence)object, (CharSequence)object2);
        this.rawLogsrequestId = concurrentHashMap;
        concurrentHashMap = this.fosMap.entrySet().iterator();
        while (bl2 = concurrentHashMap.hasNext()) {
            object = (Map.Entry)concurrentHashMap.next();
            try {
                object = object.getValue();
                object = (FileOutputStream)object;
                ((FileOutputStream)object).close();
            }
            catch (Exception exception) {}
        }
        this.fosMap = concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap = this.currentFilesObj;
        this.currentFilesObj = object = new Object();
        object = this.loggerState;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                boolean bl3;
                Object object3;
                block7: {
                    block6: {
                        try {
                            object2 = LoggerState.PUSHING;
                            object3 = this.loggerState;
                            bl3 = object2.equals(object3);
                            if (!bl3 || (bl3 = this.tempFlipDone)) break block6;
                            this.tempFlipDone = bl3 = true;
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    bl3 = false;
                    object2 = null;
                }
                object3 = new fx1_2(this, concurrentHashMap, bl3);
                ExecutorManager.runOnBackgroundThread((Runnable)object3);
                return;
            }
            throw throwable2;
        }
    }

    private boolean shouldAllowLog(JSONObject jSONObject) {
        int n3;
        JSONArray jSONArray = this.logConfig.allowWhileBuffering;
        block13: for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            Iterator iterator;
            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            int n4 = jSONObject2.length();
            if (n4 <= 0) continue;
            try {
                iterator = jSONObject2.keys();
            }
            catch (Exception exception) {}
            block14: while (true) {
                boolean bl2 = iterator.hasNext();
                if (!bl2) break;
                Object object = iterator.next();
                object = (String)object;
                boolean bl3 = jSONObject.has(object);
                if (!bl3) continue block13;
                JSONArray jSONArray2 = jSONObject2.getJSONArray(object);
                int n7 = 0;
                while (true) {
                    int n8 = jSONArray2.length();
                    if (n7 >= n8) continue block13;
                    Object object2 = jSONArray2.get(n7);
                    Object object3 = jSONObject.get(object);
                    n8 = (int)(Objects.equals(object2, object3) ? 1 : 0);
                    if (n8 != 0) continue block14;
                    ++n7;
                    continue;
                    break;
                }
                break;
            }
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private void updatePushFile() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[CATCHBLOCK], 22[CATCHBLOCK]], but top level block is 19[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
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

    public void addLogLine(JSONObject jSONObject) {
        jx1_1 jx1_12 = new jx1_1(this, jSONObject);
        ExecutorManager.runOnLogSessioniserThread(jx1_12);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void startLogSessioniser() {
        LoggerState loggerState;
        LoggerState loggerState2 = LoggerState.PUSHING;
        LoggerState loggerState3 = this.loggerState;
        int n3 = ((Object)((Object)loggerState2)).equals((Object)loggerState3);
        if (n3 != 0) return;
        this.loggerState = loggerState = LoggerState.BUFFERING;
        try {
            Timer timer;
            LogPusherExp logPusherExp = this.logPusherExp;
            logPusherExp.startLogPusher();
            LogWorkspace logWorkspace = this.logWorkspace;
            String string2 = "temp/";
            File file = logWorkspace.open(string2);
            file.mkdirs();
            LogWorkspace logWorkspace2 = this.logWorkspace;
            String string3 = "original/";
            File file2 = logWorkspace2.open(string3);
            file2.mkdirs();
            this.moveToPusherTimer = timer = new Timer();
            n3 = 0;
            Object var1_9 = null;
            LogSessioniserExp$LogSessioniserTimerTask logSessioniserExp$LogSessioniserTimerTask = new LogSessioniserExp$LogSessioniserTimerTask(this, null);
            this.moveToPusher = logSessioniserExp$LogSessioniserTimerTask;
            Timer timer2 = this.moveToPusherTimer;
            LogConfig logConfig = this.logConfig;
            n3 = logConfig.logSessioniseInterval;
            long l2 = n3;
            long l3 = 0L;
            timer2.scheduleAtFixedRate((TimerTask)logSessioniserExp$LogSessioniserTimerTask, l3, l2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void startPushing() {
        hx1_1 hx1_12 = new hx1_1(this, 0);
        ExecutorManager.runOnLogSessioniserThread(hx1_12);
    }

    public void stopLogSessioniserOnTerminate() {
        ix1_1 ix1_12 = new ix1_1(this, 0);
        ExecutorManager.runOnLogSessioniserThread(ix1_12);
    }
}


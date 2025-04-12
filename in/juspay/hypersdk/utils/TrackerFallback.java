/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.utils;

import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.utils.LogType;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class TrackerFallback {
    private int count;
    private boolean enableTrackerFallback;
    private NetUtils netUtils;
    private List requiredKeysList;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TrackerFallback(JSONObject object) {
        int n3;
        this.count = n3 = 3;
        if (object == null) return;
        String string2 = "enableTrackerFallback";
        boolean bl2 = object.has(string2);
        if (!bl2) return;
        try {
            List<String> list;
            int n4;
            boolean bl3;
            String string3 = null;
            Object object2 = new NetUtils(0, 0);
            this.netUtils = object2;
            bl2 = true;
            this.enableTrackerFallback = bl3 = object.optBoolean(string2, bl2);
            string2 = "trackerFallbackAttempts";
            this.count = n4 = object.optInt(string2, n3);
            String string4 = "action";
            string2 = "orderId";
            object2 = "clientId";
            string3 = "merchantId";
            String string5 = "customerId";
            String string6 = "os";
            String string7 = "os_version";
            String string8 = "app_version";
            String string9 = "requestId";
            String[] stringArray = new String[]{string4, string2, object2, string3, string5, string6, string7, string8, string9};
            this.requiredKeysList = list = Arrays.asList(stringArray);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static /* synthetic */ void a(TrackerFallback trackerFallback, JuspayServices juspayServices, JSONObject jSONObject, LogType logType) {
        trackerFallback.lambda$log$0(juspayServices, jSONObject, logType);
    }

    private HashMap getQueryParams(JuspayServices object, JSONObject jSONObject, LogType logType) {
        boolean bl2;
        Object object2;
        Object object3 = new ArrayList();
        Object object4 = LogType.PROCESS_END;
        if (logType == object4) {
            ((ArrayList)object3).add("errorMessage");
            object2 = "errorCode";
            ((ArrayList)object3).add(object2);
        }
        if (logType == (object2 = LogType.INITIATE_RESULT) || logType == object4) {
            ((ArrayList)object3).add("client_id");
            object4 = "merchant_id";
            ((ArrayList)object3).add(object4);
        }
        object4 = jSONObject.optJSONObject("payload");
        object2 = ((JuspayServices)object).getSessionInfo().getSessionData();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object5 = this.requiredKeysList;
        String string2 = "";
        if (object5 != null) {
            boolean bl3;
            object5 = object5.iterator();
            while (bl3 = object5.hasNext()) {
                String string3;
                boolean bl4;
                String string4 = (String)object5.next();
                if (object4 != null && (bl4 = object4.has(string4))) {
                    string3 = object4.optString(string4, string2);
                    hashMap.put(string4, string3);
                    continue;
                }
                bl4 = object2.has(string4);
                if (bl4) {
                    string3 = object2.optString(string4, string2);
                    hashMap.put(string4, string3);
                    continue;
                }
                bl4 = jSONObject.has(string4);
                if (!bl4) continue;
                string3 = jSONObject.optString(string4, string2);
                hashMap.put(string4, string3);
            }
        }
        object3 = ((ArrayList)object3).iterator();
        while (bl2 = object3.hasNext()) {
            boolean bl5;
            object2 = (String)object3.next();
            if (object4 != null && (bl5 = object4.has((String)object2))) {
                object5 = object4.optString((String)object2, string2);
                hashMap.put(object2, object5);
                continue;
            }
            bl5 = jSONObject.has((String)object2);
            if (!bl5) continue;
            object5 = jSONObject.optString((String)object2, string2);
            hashMap.put(object2, object5);
        }
        object = ((JuspayServices)object).getSessionInfo().getSessionId();
        hashMap.put("sessionId", object);
        object = logType.name();
        hashMap.put("logtype", object);
        return hashMap;
    }

    /*
     * Exception decompiling
     */
    private void lambda$log$0(JuspayServices var1_1, JSONObject var2_3, LogType var3_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[CATCHBLOCK], 13[CATCHBLOCK]], but top level block is 12[TRYBLOCK]
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

    public void log(JSONObject jSONObject, JuspayServices juspayServices, LogType logType) {
        tp3_0 tp3_02 = new tp3_0(this, juspayServices, jSONObject, logType);
        ExecutorManager.runOnBackgroundThread(tp3_02);
    }
}


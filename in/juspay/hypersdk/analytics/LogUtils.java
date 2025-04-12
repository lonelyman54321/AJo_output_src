/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import android.content.Context;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONObject;

public class LogUtils {
    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public static int getFromSharedPreference(String string2, Workspace workspace) {
        return Integer.parseInt(workspace.getFromSharedPreference(string2, "-1"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Queue getLogsFromFile(File object) {
        int n3;
        LinkedList<JSONObject> linkedList = new LinkedList<JSONObject>();
        long l2 = ((File)object).length();
        int n4 = (int)l2;
        byte[] byArray = new byte[n4];
        try {
            Object object2 = new FileInputStream((File)object);
            ((FileInputStream)object2).read(byArray);
            ((FileInputStream)object2).close();
            object2 = StandardCharsets.UTF_8;
            object = new String(byArray, (Charset)object2);
            String string2 = "LOG_DELIMITER";
            object = ((String)object).split(string2);
            n3 = ((Object)object).length;
            n4 = 0;
            object2 = null;
        }
        catch (Exception exception) {}
        return linkedList;
        while (n4 < n3) {
            Object object3 = object[n4];
            try {
                JSONObject jSONObject = new JSONObject((String)object3);
                linkedList.add(jSONObject);
            }
            catch (Exception exception) {}
            ++n4;
        }
        return linkedList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte[] getLogsFromFileExp(File file) {
        FileInputStream fileInputStream;
        long l2 = file.length();
        int n3 = (int)l2;
        byte[] byArray = new byte[n3];
        try {
            fileInputStream = new FileInputStream(file);
        }
        catch (Exception exception) {
            return byArray;
        }
        fileInputStream.read(byArray);
        fileInputStream.close();
        return byArray;
    }

    public static boolean isFileEligibleToPush(File file, LogConfig logConfig) {
        boolean bl2 = false;
        if (file != null) {
            long l2 = file.lastModified();
            long l3 = (System.currentTimeMillis() - l2) / 1000L;
            l2 = 3600L;
            long l4 = logConfig.dontPushIfFileIsLastModifiedBeforeInHours;
            long l7 = (l3 /= l2) - l4;
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object < 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static Boolean isMinMemoryAvailable(LogConfig logConfig) {
        block5: {
            long l2;
            block7: {
                block6: {
                    Context context = JuspayCoreLib.getApplicationContext();
                    if (context == null) break block5;
                    try {
                        context = Utils.getMemoryInfo(context);
                        if (context == null) break block5;
                    }
                    catch (Exception exception) {}
                    long l3 = context.availMem;
                    long l4 = logConfig.minMemoryRequired;
                    l2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                    if (l2 < 0) break block6;
                    l2 = 1;
                    break block7;
                }
                l2 = 0;
                logConfig = null;
            }
            return (boolean)l2;
        }
        return Boolean.TRUE;
    }

    public static Map toMap(JSONObject jSONObject) {
        boolean bl2;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Iterator iterator = jSONObject.keys();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            String string3 = jSONObject.getString(string2);
            hashMap.put(string2, string3);
        }
        return hashMap;
    }

    /*
     * Exception decompiling
     */
    public static void writeLogToFileExp(JSONObject var0, File var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
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
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.MetaDataStore$1;
import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class MetaDataStore {
    private static final String KEY_USER_ID = "userId";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final FileStore fileStore;

    public MetaDataStore(FileStore fileStore) {
        this.fileStore = fileStore;
    }

    private static Map jsonToKeysData(String hashMap) {
        boolean bl2;
        JSONObject jSONObject = new JSONObject((String)((Object)hashMap));
        hashMap = new HashMap<String, String>();
        Iterator iterator = jSONObject.keys();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            String string3 = MetaDataStore.valueOrNull(jSONObject, string2);
            hashMap.put(string2, string3);
        }
        return hashMap;
    }

    private static List jsonToRolloutsState(String string2) {
        int n3;
        Object object = new JSONObject(string2);
        string2 = object.getJSONArray("rolloutsState");
        object = new ArrayList();
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            String string3 = string2.getString(i3);
            RolloutAssignment rolloutAssignment = RolloutAssignment.create(string3);
            try {
                ((ArrayList)object).add(rolloutAssignment);
                continue;
            }
            catch (Exception exception) {
                Logger logger = Logger.getLogger();
                String string4 = "Failed de-serializing rollouts state. ";
                StringBuilder stringBuilder = new StringBuilder(string4);
                stringBuilder.append(string3);
                string3 = stringBuilder.toString();
                logger.w(string3, exception);
            }
        }
        return object;
    }

    private String jsonToUserId(String string2) {
        JSONObject jSONObject = new JSONObject(string2);
        return MetaDataStore.valueOrNull(jSONObject, KEY_USER_ID);
    }

    private static String keysDataToJson(Map map2) {
        JSONObject jSONObject = new JSONObject(map2);
        return jSONObject.toString();
    }

    private static String rolloutsStateToJson(List list) {
        int n3;
        HashMap<String, JSONArray> hashMap = new HashMap<String, JSONArray>();
        JSONArray jSONArray = new JSONArray();
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            Object object = RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER;
            Object object2 = list.get(i3);
            object = object.encode(object2);
            object2 = new JSONObject((String)object);
            try {
                jSONArray.put(object2);
                continue;
            }
            catch (JSONException jSONException) {
                object2 = Logger.getLogger();
                String string2 = "Exception parsing rollout assignment!";
                ((Logger)object2).w(string2, jSONException);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        list = new JSONObject(hashMap);
        return list.toString();
    }

    private static void safeDeleteCorruptFile(File object) {
        boolean bl2 = ((File)object).exists();
        if (bl2 && (bl2 = ((File)object).delete())) {
            Logger logger = Logger.getLogger();
            String string2 = "Deleted corrupt file: ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            object = ((File)object).getAbsolutePath();
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            logger.i((String)object);
        }
    }

    private static void safeDeleteCorruptFile(File object, String string2) {
        boolean bl2 = ((File)object).exists();
        if (bl2 && (bl2 = ((File)object).delete())) {
            Logger logger = Logger.getLogger();
            object = ((File)object).getAbsolutePath();
            String string3 = "Deleted corrupt file: ";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append((String)object);
            stringBuilder.append("\nReason: ");
            stringBuilder.append(string2);
            object = stringBuilder.toString();
            logger.i((String)object);
        }
    }

    private static String userIdToJson(String string2) {
        MetaDataStore$1 metaDataStore$1 = new MetaDataStore$1(string2);
        return ((Object)((Object)metaDataStore$1)).toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String string2) {
        boolean bl2 = jSONObject.isNull(string2);
        String string3 = null;
        if (!bl2) {
            string3 = jSONObject.optString(string2, null);
        }
        return string3;
    }

    public File getInternalKeysFileForSession(String string2) {
        return this.fileStore.getSessionFile(string2, "internal-keys");
    }

    public File getKeysFileForSession(String string2) {
        return this.fileStore.getSessionFile(string2, "keys");
    }

    public File getRolloutsStateForSession(String string2) {
        return this.fileStore.getSessionFile(string2, "rollouts-state");
    }

    public File getUserDataFileForSession(String string2) {
        return this.fileStore.getSessionFile(string2, "user-data");
    }

    public Map readKeyData(String string2) {
        return this.readKeyData(string2, false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Map readKeyData(String var1_1, boolean var2_4) {
        block10: {
            block9: {
                block8: {
                    var3_5 = "Failed to close user metadata file.";
                    var4_6 = var2_4 != false ? this.getInternalKeysFileForSession((String)var1_1) : this.getKeysFileForSession((String)var1_1);
                    var5_8 = var4_6.exists();
                    if (!var5_8 || (var10_11 = (cfr_temp_0 = (var6_9 = var4_6.length()) - (var8_10 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) break block10;
                    var1_1 = null;
                    var11_12 = new FileInputStream(var4_6);
                    try {}
                    catch (Exception var1_3) {}
                    finally {
                        break block8;
                    }
                    catch (Throwable var4_7) {
                        var5_8 = false;
                        var11_12 = null;
                        var1_1 = var4_7;
                        break block9;
                    }
                    catch (Exception var12_13) {
                        var5_8 = false;
                        var11_12 = null;
                        var1_1 = var12_13;
                        ** GOTO lbl-1000
                    }
                }
                var1_1 = CommonUtils.streamToString(var11_12);
                var1_1 = MetaDataStore.jsonToKeysData((String)var1_1);
                CommonUtils.closeOrLog(var11_12, var3_5);
                return var1_1;
lbl-1000:
                // 1 sources

                {
                    var13_14 = Logger.getLogger();
                    var14_15 = "Error deserializing user metadata.";
                    var13_14.w(var14_15, (Throwable)var1_1);
                    MetaDataStore.safeDeleteCorruptFile(var4_6);
                }
                CommonUtils.closeOrLog(var11_12, var3_5);
                return Collections.emptyMap();
            }
            CommonUtils.closeOrLog(var11_12, var3_5);
            throw var1_1;
        }
        var1_1 = kp1_0.c("The file has a length of zero for session: ", (String)var1_1);
        MetaDataStore.safeDeleteCorruptFile(var4_6, (String)var1_1);
        return Collections.emptyMap();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List readRolloutsState(String var1_1) {
        block8: {
            block7: {
                var2_7 = "Failed to close rollouts state file.";
                var3_8 = "Loaded rollouts state:\n";
                var4_9 = this.getRolloutsStateForSession(var1_1);
                var5_10 = var4_9.exists();
                if (!var5_10 || (var10_13 = (cfr_temp_0 = (var6_11 = var4_9.length()) - (var8_12 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) break block8;
                var5_10 = false;
                var11_14 = null;
                try {
                    var12_15 = new FileInputStream(var4_9);
                }
                catch (Throwable var1_4) {
                    break block7;
                }
                catch (Exception var1_5) {
                    // empty catch block
                    ** GOTO lbl-1000
                }
                try {
                    var11_14 = CommonUtils.streamToString((InputStream)var12_15);
                    var11_14 = MetaDataStore.jsonToRolloutsState((String)var11_14);
                    var13_16 = Logger.getLogger();
                    var14_17 = new StringBuilder((String)var3_8);
                    var14_17.append(var11_14);
                    var3_8 = "\nfor session ";
                    var14_17.append((String)var3_8);
                    var14_17.append(var1_1);
                    var1_1 = var14_17.toString();
                    var13_16.d(var1_1);
                }
                catch (Throwable var1_2) {
                    var11_14 = var12_15;
                    break block7;
                }
                catch (Exception var1_3) {
                    var11_14 = var12_15;
                    ** GOTO lbl-1000
                }
                CommonUtils.closeOrLog((Closeable)var12_15, var2_7);
                return var11_14;
lbl-1000:
                // 2 sources

                {
                    var3_8 = Logger.getLogger();
                    var12_15 = "Error deserializing rollouts state.";
                    var3_8.w((String)var12_15, (Throwable)var1_1);
                    MetaDataStore.safeDeleteCorruptFile(var4_9);
                }
                CommonUtils.closeOrLog((Closeable)var11_14, var2_7);
                return Collections.emptyList();
            }
            CommonUtils.closeOrLog(var11_14, var2_7);
            throw var1_6;
        }
        var1_1 = kp1_0.c("The file has a length of zero for session: ", var1_1);
        MetaDataStore.safeDeleteCorruptFile(var4_9, var1_1);
        return Collections.emptyList();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String readUserId(String var1_1) {
        block8: {
            block7: {
                block9: {
                    var2_7 = "Failed to close user metadata file.";
                    var3_8 = "Loaded userId ";
                    var4_9 = this.getUserDataFileForSession(var1_1);
                    var5_10 = var4_9.exists();
                    var6_11 = null;
                    if (!var5_10 || !(var5_10 = (cfr_temp_0 = (var7_12 = var4_9.length()) - (var9_13 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) break block8;
                    var11_14 = new FileInputStream(var4_9);
                    ** try [egrp 1[TRYBLOCK] [5, 4 : 66->135)] { 
lbl10:
                    // 1 sources

                    break block9;
lbl11:
                    // 1 sources

                    catch (Throwable var1_2) {
                        var6_11 = var11_14;
                        break block7;
                    }
lbl14:
                    // 1 sources

                    catch (Exception var1_3) {
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var1_4) {
                        break block7;
                    }
                    catch (Exception var1_5) {
                        var5_10 = false;
                        var11_14 = null;
                        ** GOTO lbl-1000
                    }
                }
                var12_15 = CommonUtils.streamToString(var11_14);
                var12_15 = this.jsonToUserId(var12_15);
                var13_17 = Logger.getLogger();
                var14_18 = new StringBuilder((String)var3_8);
                var14_18.append(var12_15);
                var3_8 = " for session ";
                var14_18.append((String)var3_8);
                var14_18.append(var1_1);
                var1_1 = var14_18.toString();
                var13_17.d(var1_1);
                CommonUtils.closeOrLog(var11_14, (String)var2_7);
                return var12_15;
lbl-1000:
                // 2 sources

                {
                    var3_8 = Logger.getLogger();
                    var12_16 = "Error deserializing user metadata.";
                    var3_8.w(var12_16, (Throwable)var1_1);
                    MetaDataStore.safeDeleteCorruptFile(var4_9);
                }
                CommonUtils.closeOrLog(var11_14, (String)var2_7);
                return null;
            }
            CommonUtils.closeOrLog(var6_11, (String)var2_7);
            throw var1_6;
        }
        var2_7 = Logger.getLogger();
        var3_8 = new StringBuilder("No userId set for session ");
        var3_8.append(var1_1);
        var1_1 = var3_8.toString();
        var2_7.d(var1_1);
        MetaDataStore.safeDeleteCorruptFile(var4_9);
        return null;
    }

    public void writeKeyData(String string2, Map map2) {
        this.writeKeyData(string2, map2, false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeKeyData(String var1_1, Map var2_5, boolean var3_9) {
        block7: {
            var4_10 = "Failed to close key/value metadata file.";
            var1_1 = var3_9 != false ? this.getInternalKeysFileForSession((String)var1_1) : this.getKeysFileForSession((String)var1_1);
            var3_9 = false;
            var5_11 = null;
            try {
                var2_5 = MetaDataStore.keysDataToJson((Map)var2_5);
                var8_14 = new FileOutputStream((File)var1_1);
                var9_15 = MetaDataStore.UTF_8;
                var7_13 = new OutputStreamWriter((OutputStream)var8_14, var9_15);
                var6_12 = new BufferedWriter((Writer)var7_13);
            }
            catch (Throwable var1_3) {
                break block7;
            }
            catch (Exception var2_7) {
                // empty catch block
                ** GOTO lbl-1000
            }
            try {
                var6_12.write((String)var2_5);
                var6_12.flush();
            }
            catch (Throwable var1_2) {
                var5_11 = var6_12;
                break block7;
            }
            catch (Exception var2_6) {
                var5_11 = var6_12;
                ** GOTO lbl-1000
            }
            CommonUtils.closeOrLog((Closeable)var6_12, var4_10);
            return;
lbl-1000:
            // 2 sources

            {
                var6_12 = Logger.getLogger();
                var7_13 = "Error serializing key/value metadata.";
                var6_12.w((String)var7_13, (Throwable)var2_8);
                MetaDataStore.safeDeleteCorruptFile((File)var1_1);
            }
            CommonUtils.closeOrLog(var5_11, var4_10);
            return;
        }
        CommonUtils.closeOrLog(var5_11, var4_10);
        throw var1_4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeRolloutState(String var1_1, List var2_4) {
        block11: {
            block12: {
                block10: {
                    var3_7 = "Failed to close rollouts state file.";
                    var4_8 = this.getRolloutsStateForSession((String)var1_1);
                    var5_9 = var2_4.isEmpty();
                    if (var5_9) {
                        var1_1 = kp1_0.c("Rollout state is empty for session: ", (String)var1_1);
                        MetaDataStore.safeDeleteCorruptFile(var4_8, (String)var1_1);
                        return;
                    }
                    var1_1 = null;
                    var2_4 = MetaDataStore.rolloutsStateToJson((List)var2_4);
                    var8_12 = new FileOutputStream(var4_8);
                    var9_13 = MetaDataStore.UTF_8;
                    var7_11 = new OutputStreamWriter((OutputStream)var8_12, var9_13);
                    var6_10 = new BufferedWriter((Writer)var7_11);
                    try {}
                    catch (Exception var1_3) {}
                    finally {
                        break block10;
                    }
lbl19:
                    // 2 sources

                    while (true) {
                        CommonUtils.closeOrLog(var6_10, var3_7);
                        return;
                    }
                    catch (Throwable var2_5) {
                        var5_9 = false;
                        var6_10 = null;
                        var1_1 = var2_5;
                        break block11;
                    }
                    catch (Exception var2_6) {
                        var5_9 = false;
                        var6_10 = null;
                        var1_1 = var2_6;
                        break block12;
                    }
                }
                var6_10.write((String)var2_4);
                var6_10.flush();
                ** GOTO lbl19
            }
            var2_4 = Logger.getLogger();
            var7_11 = "Error serializing rollouts state.";
            var2_4.w((String)var7_11, (Throwable)var1_1);
            MetaDataStore.safeDeleteCorruptFile(var4_8);
            ** while (true)
        }
        CommonUtils.closeOrLog(var6_10, var3_7);
        throw var1_1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeUserData(String var1_1, String var2_7) {
        block7: {
            var3_8 = "Failed to close user metadata file.";
            var1_1 = this.getUserDataFileForSession((String)var1_1);
            var4_9 = null;
            try {
                var2_7 = MetaDataStore.userIdToJson((String)var2_7);
                var7_12 = new FileOutputStream((File)var1_1);
                var1_1 = MetaDataStore.UTF_8;
                var6_11 = new OutputStreamWriter((OutputStream)var7_12, (Charset)var1_1);
                var5_10 = new BufferedWriter(var6_11);
            }
            catch (Throwable var1_4) {
                break block7;
            }
            catch (Exception var1_5) {
                // empty catch block
                ** GOTO lbl-1000
            }
            try {
                var5_10.write((String)var2_7);
                var5_10.flush();
            }
            catch (Throwable var1_2) {
                var4_9 = var5_10;
                break block7;
            }
            catch (Exception var1_3) {
                var4_9 = var5_10;
                ** GOTO lbl-1000
            }
            CommonUtils.closeOrLog((Closeable)var5_10, var3_8);
            return;
lbl-1000:
            // 2 sources

            {
                var2_7 = Logger.getLogger();
                var5_10 = "Error serializing user metadata.";
                var2_7.w((String)var5_10, (Throwable)var1_1);
            }
            CommonUtils.closeOrLog(var4_9, var3_8);
            return;
        }
        CommonUtils.closeOrLog(var4_9, var3_8);
        throw var1_6;
    }
}


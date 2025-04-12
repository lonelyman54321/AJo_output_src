/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigStorageClient {
    private static final String JSON_STRING_ENCODING = "UTF-8";
    private static final Map clientInstances;
    private final Context context;
    private final String fileName;

    static {
        HashMap hashMap;
        clientInstances = hashMap = new HashMap();
    }

    private ConfigStorageClient(Context context, String string2) {
        this.context = context;
        this.fileName = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void clearInstancesForTest() {
        Class<ConfigStorageClient> clazz = ConfigStorageClient.class;
        synchronized (clazz) {
            Map map2 = clientInstances;
            map2.clear();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigStorageClient getInstance(Context object, String string2) {
        Class<ConfigStorageClient> clazz = ConfigStorageClient.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                Map map2;
                block4: {
                    try {
                        map2 = clientInstances;
                        boolean bl2 = map2.containsKey(string2);
                        if (bl2) break block4;
                        ConfigStorageClient configStorageClient = new ConfigStorageClient((Context)object, string2);
                        map2.put(string2, configStorageClient);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = map2.get(string2);
                return (ConfigStorageClient)object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Void clear() {
        synchronized (this) {
            Context context = this.context;
            String string2 = this.fileName;
            context.deleteFile(string2);
            return null;
        }
    }

    public String getFileName() {
        return this.fileName;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ConfigContainer read() {
        synchronized (this) {
            Object object;
            block11: {
                Throwable throwable2;
                Object object2;
                block10: {
                    object2 = null;
                    object = this.context;
                    String string2 = this.fileName;
                    object = object.openFileInput(string2);
                    int n3 = ((FileInputStream)object).available();
                    Object object3 = new byte[n3];
                    String string3 = null;
                    ((FileInputStream)object).read((byte[])object3, 0, n3);
                    string3 = JSON_STRING_ENCODING;
                    string2 = new String((byte[])object3, string3);
                    object3 = new JSONObject;
                    object3(string2);
                    object2 = ConfigContainer.copyOf((JSONObject)object3);
                    try {
                        ((FileInputStream)object).close();
                        return object2;
                    }
                    catch (Throwable throwable2) {}
                    catch (Throwable throwable3) {
                        break block10;
                    }
                    catch (FileNotFoundException | JSONException throwable4) {
                        break block11;
                    }
                    catch (Throwable throwable5) {
                        object = null;
                        object2 = throwable5;
                    }
                    catch (FileNotFoundException | JSONException throwable6) {
                        return null;
                    }
                }
                if (object == null) throw object2;
                ((FileInputStream)object).close();
                throw object2;
                throw throwable2;
            }
            if (object == null) return null;
            ((FileInputStream)object).close();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Void write(ConfigContainer object) {
        synchronized (this) {
            String string2;
            Object object2;
            try {
                object2 = this.context;
                string2 = this.fileName;
                object2 = object2.openFileOutput(string2, 0);
            }
            catch (Throwable throwable) {}
            try {
                object = ((ConfigContainer)object).toString();
                string2 = JSON_STRING_ENCODING;
                object = ((String)object).getBytes(string2);
                ((FileOutputStream)object2).write((byte[])object);
            }
            catch (Throwable throwable) {
                ((FileOutputStream)object2).close();
                throw throwable;
            }
            ((FileOutputStream)object2).close();
            return null;
            throw throwable;
        }
    }
}


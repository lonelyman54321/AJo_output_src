/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

public class CachedSettingsIo {
    private static final String SETTINGS_CACHE_FILENAME = "com.crashlytics.settings.json";
    private final File cachedSettingsFile;

    public CachedSettingsIo(FileStore object) {
        this.cachedSettingsFile = object = ((FileStore)object).getCommonFile(SETTINGS_CACHE_FILENAME);
    }

    private File getSettingsFile() {
        return this.cachedSettingsFile;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject readCachedSettings() {
        block10: {
            block11: {
                block9: {
                    var1_1 = "Error while closing settings cache file.";
                    var2_2 = Logger.getLogger();
                    var3_4 = "Checking for cached settings...";
                    var2_2.d((String)var3_4);
                    var2_2 = null;
                    var3_4 = this.getSettingsFile();
                    var4_9 = var3_4.exists();
                    if (!var4_9) ** GOTO lbl-1000
                    var5_10 = new FileInputStream((File)var3_4);
                    try {}
                    catch (Exception var3_5) {}
                    finally {
                        break block9;
                    }
                    catch (Throwable var3_6) {
                        var4_9 = false;
                        var5_10 = null;
                        var2_2 = var3_6;
                        break block10;
                    }
                    catch (Exception var3_7) {
                        var4_9 = false;
                        var5_10 = null;
                        ** GOTO lbl-1000
                    }
                }
                var3_4 = CommonUtils.streamToString(var5_10);
                var6_12 = new JSONObject((String)var3_4);
                var2_2 = var5_10;
                break block11;
lbl-1000:
                // 1 sources

                {
                    var3_4 = Logger.getLogger();
                    var5_11 = "Settings file does not exist.";
                    var3_4.v(var5_11);
                    var6_12 = null;
                }
            }
            CommonUtils.closeOrLog((Closeable)var2_2, var1_1);
            return var6_12;
lbl-1000:
            // 1 sources

            {
                var6_13 = Logger.getLogger();
                var7_14 = "Failed to fetch cached settings";
                var6_13.e(var7_14, (Throwable)var3_8);
            }
            CommonUtils.closeOrLog(var5_10, var1_1);
            return var2_2;
        }
        CommonUtils.closeOrLog(var5_10, var1_1);
        throw var2_2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeCachedSettings(long var1_1, JSONObject var3_2) {
        block7: {
            var4_3 = "Failed to close settings writer.";
            var5_4 = Logger.getLogger();
            var6_5 = "Writing settings to cache file...";
            var5_4.v(var6_5);
            if (var3_2 /* !! */  == null) return;
            var5_4 = null;
            var6_5 = "expires_at";
            try {
                var3_2 /* !! */ .put(var6_5, var1_1);
                var8_7 = this.getSettingsFile();
                var7_6 = new FileWriter((File)var8_7);
            }
            catch (Throwable var8_10) {
                break block7;
            }
            catch (Exception var8_11) {
                // empty catch block
                ** GOTO lbl-1000
            }
            try {
                var8_7 = var3_2 /* !! */ .toString();
                var7_6.write((String)var8_7);
                var7_6.flush();
            }
            catch (Throwable var8_8) {
                var5_4 = var7_6;
                break block7;
            }
            catch (Exception var8_9) {
                var5_4 = var7_6;
                ** GOTO lbl-1000
            }
            CommonUtils.closeOrLog((Closeable)var7_6, var4_3);
            return;
lbl-1000:
            // 2 sources

            {
                var7_6 = Logger.getLogger();
                var3_2 /* !! */  = "Failed to cache settings";
                var7_6.e((String)var3_2 /* !! */ , (Throwable)var8_12);
            }
            CommonUtils.closeOrLog((Closeable)var5_4, var4_3);
            return;
        }
        CommonUtils.closeOrLog((Closeable)var5_4, var4_3);
        throw var8_13;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class zzfsy {
    public static File zza(File file, boolean bl2) {
        if (bl2 && (bl2 = file.exists()) && !(bl2 = file.isDirectory())) {
            file.delete();
        }
        if (!(bl2 = file.exists())) {
            file.mkdirs();
        }
        return file;
    }

    public static File zzb(String object, String string2, File file) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object = zzfsy.zzc((String)object, file);
            File file2 = new File((File)object, string2);
            return file2;
        }
        return null;
    }

    public static File zzc(String string2, File file) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return null;
        }
        File file2 = new File(file, string2);
        zzfsy.zza(file2, false);
        return file2;
    }

    public static boolean zzd(File file) {
        boolean bl2;
        boolean bl3;
        boolean bl4 = file.exists();
        boolean bl5 = true;
        if (!bl4) {
            return bl5;
        }
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            int n3;
            bl3 = true;
            for (int i3 = 0; i3 < (n3 = fileArray.length); ++i3) {
                File file2 = fileArray[i3];
                bl3 = file2 != null && (n3 = (int)(zzfsy.zzd(file2) ? 1 : 0)) != 0 && bl3;
            }
        } else {
            bl3 = true;
        }
        if ((bl2 = file.delete()) && bl3) {
            return bl5;
        }
        return false;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zze(File file, byte[] byArray) {
        FileOutputStream fileOutputStream;
        block8: {
            void var0_3;
            block9: {
                FileOutputStream fileOutputStream2;
                block7: {
                    block6: {
                        int n3 = 0;
                        fileOutputStream = null;
                        fileOutputStream2 = new FileOutputStream(file);
                        try {
                            n3 = Build.VERSION.SDK_INT;
                            int n4 = 34;
                            if (n3 < n4) break block6;
                            file.setReadOnly();
                        }
                        catch (Throwable throwable) {
                            break block7;
                        }
                        catch (IOException iOException) {
                            fileOutputStream = fileOutputStream2;
                            break block8;
                        }
                    }
                    fileOutputStream2.write(byArray);
                    fileOutputStream2.flush();
                    IOUtils.closeQuietly(fileOutputStream2);
                    return true;
                }
                fileOutputStream = fileOutputStream2;
                break block9;
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            IOUtils.closeQuietly(fileOutputStream);
            throw var0_3;
            catch (IOException iOException) {}
        }
        IOUtils.closeQuietly(fileOutputStream);
        return false;
    }
}


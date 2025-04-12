/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build$VERSION
 *  android.os.Process
 */
package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import androidx.profileinstaller.ProfileInstallReceiver$a;
import androidx.profileinstaller.a;
import androidx.profileinstaller.c;
import androidx.profileinstaller.c$c;
import java.io.File;
import java.util.concurrent.Executor;

public class ProfileInstallReceiver
extends BroadcastReceiver {
    public final void onReceive(Context object, Intent object2) {
        block13: {
            int n3;
            boolean bl2;
            Object object3;
            String string2;
            block15: {
                block16: {
                    block14: {
                        if (object2 == null) {
                            return;
                        }
                        string2 = "androidx.profileinstaller.action.INSTALL_PROFILE";
                        object3 = object2.getAction();
                        bl2 = string2.equals(object3);
                        if (!bl2) break block14;
                        object2 = new Object();
                        object3 = new ProfileInstallReceiver$a(this);
                        bl2 = true;
                        c.b((Context)object, (Executor)object2, (c$c)object3, bl2);
                        break block13;
                    }
                    string2 = "androidx.profileinstaller.action.SKIP_FILE";
                    bl2 = string2.equals(object3);
                    n3 = 10;
                    if (!bl2) break block15;
                    if ((object2 = object2.getExtras()) == null) break block13;
                    object3 = "WRITE_SKIP_FILE";
                    boolean bl3 = ((String)object3).equals(object2 = object2.getString("EXTRA_SKIP_FILE_OPERATION"));
                    if (!bl3) break block16;
                    object2 = object.getApplicationContext().getPackageName();
                    object3 = object.getPackageManager();
                    bl2 = false;
                    string2 = null;
                    try {
                        object2 = object3.getPackageInfo((String)object2, 0);
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        int n4 = 7;
                        this.setResultCode(n4);
                        break block13;
                    }
                    object = object.getFilesDir();
                    c.a((PackageInfo)object2, (File)object);
                    this.setResultCode(n3);
                    break block13;
                }
                object3 = "DELETE_SKIP_FILE";
                boolean bl4 = ((String)object3).equals(object2);
                if (bl4) {
                    object = object.getFilesDir();
                    object3 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";
                    object2 = new File((File)object, (String)object3);
                    ((File)object2).delete();
                    int n7 = 11;
                    this.setResultCode(n7);
                }
                break block13;
            }
            string2 = "androidx.profileinstaller.action.SAVE_PROFILE";
            bl2 = string2.equals(object3);
            int n4 = 24;
            if (bl2) {
                int n10 = Build.VERSION.SDK_INT;
                if (n10 >= n4) {
                    Process.sendSignal((int)Process.myPid(), (int)n3);
                    n10 = 12;
                    this.setResultCode(n10);
                } else {
                    n10 = 13;
                    this.setResultCode(n10);
                }
            } else {
                string2 = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
                int n14 = string2.equals(object3);
                if (n14 != 0 && (object2 = object2.getExtras()) != null) {
                    object3 = "DROP_SHADER_CACHE";
                    boolean n15 = ((String)object3).equals(object2 = object2.getString("EXTRA_BENCHMARK_OPERATION"));
                    if (n15) {
                        int n7 = Build.VERSION.SDK_INT;
                        n14 = 34;
                        object = n7 >= n14 ? yx_0.a((Context)object).getCacheDir() : (n7 >= n4 ? yx_0.a((Context)object).getCodeCacheDir() : (n7 == (n14 = 23) ? object.getCodeCacheDir() : object.getCacheDir()));
                        int n16 = a.a((File)object);
                        if (n16 != 0) {
                            n16 = 14;
                            this.setResultCode(n16);
                        } else {
                            n16 = 15;
                            this.setResultCode(n16);
                        }
                    } else {
                        int n17 = 16;
                        this.setResultCode(n17);
                    }
                }
            }
        }
    }
}


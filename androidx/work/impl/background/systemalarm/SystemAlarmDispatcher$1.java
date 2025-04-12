/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$DequeueAndCheckForCompletion;
import java.util.Objects;

class SystemAlarmDispatcher$1
implements Runnable {
    public final /* synthetic */ SystemAlarmDispatcher a;

    public SystemAlarmDispatcher$1(SystemAlarmDispatcher systemAlarmDispatcher) {
        this.a = systemAlarmDispatcher;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        var1_1 = this.a.g;
        synchronized (var1_1) {
            var2_2 = this.a;
            var3_4 = var2_2.g;
            var4_5 = null;
            var3_4 = var3_4.get(0);
            var3_4 = (Intent)var3_4;
            var2_2.h = var3_4;
        }
        var1_1 = this.a.h;
        if (var1_1 == null) return;
        var1_1 = var1_1.getAction();
        var2_2 = this.a.h;
        var5_6 = var2_2.getIntExtra("KEY_START_ID", 0);
        var3_4 = qx1.a();
        Objects.toString(this.a.h);
        var3_4.getClass();
        var3_4 = this.a.a;
        var4_5 = new StringBuilder();
        var4_5.append((String)var1_1);
        var4_5.append(" (");
        var4_5.append(var5_6);
        var4_5.append(")");
        var1_1 = var4_5.toString();
        var1_1 = QE3.a((Context)var3_4, (String)var1_1);
        try {
            var3_4 = qx1.a();
            Objects.toString(var1_1);
            var3_4.getClass();
            var1_1.acquire();
            var3_4 = this.a;
            var4_5 = var3_4.f;
            var6_7 = var3_4.h;
            var4_5.c(var5_6, var6_7, (SystemAlarmDispatcher)var3_4);
            ** GOTO lbl61
        }
        catch (Throwable v0) {
            try {
                var2_2 = qx1.a();
                ** GOTO lbl-1000
            }
            catch (Throwable var2_3) {
                var3_4 = qx1.a();
                Objects.toString(var1_1);
                var3_4.getClass();
                var1_1.release();
                var1_1 = this.a.b.a();
                var4_5 = this.a;
                var3_4 = new SystemAlarmDispatcher$DequeueAndCheckForCompletion((SystemAlarmDispatcher)var4_5);
                var1_1.execute((Runnable)var3_4);
                throw var2_3;
            }
lbl61:
            // 1 sources

            var2_2 = qx1.a();
            var1_1.toString();
            var2_2.getClass();
            var1_1.release();
            var1_1 = this.a.b.a();
            var3_4 = this.a;
            var2_2 = new SystemAlarmDispatcher$DequeueAndCheckForCompletion((SystemAlarmDispatcher)var3_4);
lbl70:
            // 2 sources

            while (true) {
                var1_1.execute((Runnable)var2_2);
                return;
            }
lbl-1000:
            // 1 sources

            {
                var2_2.getClass();
            }
            var2_2 = qx1.a();
            Objects.toString(var1_1);
            var2_2.getClass();
            var1_1.release();
            var1_1 = this.a.b.a();
            var3_4 = this.a;
            var2_2 = new SystemAlarmDispatcher$DequeueAndCheckForCompletion((SystemAlarmDispatcher)var3_4);
            ** continue;
        }
    }
}


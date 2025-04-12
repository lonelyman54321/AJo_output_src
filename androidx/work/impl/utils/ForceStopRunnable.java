/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.AlarmManager
 *  android.app.ApplicationExitInfo
 *  android.app.PendingIntent
 *  android.app.job.JobInfo
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.database.sqlite.SQLiteAccessPermException
 *  android.database.sqlite.SQLiteCantOpenDatabaseException
 *  android.database.sqlite.SQLiteConstraintException
 *  android.database.sqlite.SQLiteDatabaseCorruptException
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteDiskIOException
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteFullException
 *  android.database.sqlite.SQLiteTableLockedException
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public class ForceStopRunnable
implements Runnable {
    public static final long e;
    public final Context a;
    public final ni3_1 b;
    public final ky2_1 c;
    public int d;

    static {
        qx1.b("ForceStopRunnable");
        e = TimeUnit.DAYS.toMillis(3650L);
    }

    public ForceStopRunnable(Context object, ni3_1 ni3_12) {
        this.a = object = object.getApplicationContext();
        this.b = ni3_12;
        object = ni3_12.g;
        this.c = object;
        this.d = 0;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        n3 = n3 >= n4 ? 0xA000000 : 0x8000000;
        Intent intent = new Intent();
        Class<ForceStopRunnable$BroadcastReceiver> clazz = ForceStopRunnable$BroadcastReceiver.class;
        Object object = new ComponentName(context, clazz);
        intent.setComponent(object);
        object = "ACTION_FORCE_STOP_RESCHEDULE";
        intent.setAction((String)object);
        int n7 = -1;
        context = PendingIntent.getBroadcast((Context)context, (int)n7, (Intent)intent, (int)n3);
        long l2 = System.currentTimeMillis();
        long l3 = e;
        l2 += l3;
        if (alarmManager != null) {
            n7 = 0;
            object = null;
            alarmManager.setExact(0, l2, (PendingIntent)context);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Throwable throwable3;
        Object object;
        block29: {
            Object object2;
            ni3_1 ni3_12;
            Object object3;
            Object object4;
            block30: {
                long l2;
                long l3;
                long l4;
                int n3;
                Object object5;
                boolean bl2;
                int n4;
                JobInfo jobInfo;
                Object object6;
                Object object7;
                Object object8;
                long l7;
                int n7;
                Object object9;
                int n8;
                int n10;
                block28: {
                    boolean bl3;
                    Object object10;
                    block32: {
                        block31: {
                            Throwable throwable22;
                            block27: {
                                int n14;
                                block26: {
                                    n10 = 1;
                                    object4 = "last_force_stop_ms";
                                    object3 = this.c;
                                    n8 = Build.VERSION.SDK_INT;
                                    object9 = this.a;
                                    ni3_12 = this.b;
                                    n7 = 23;
                                    l7 = -1;
                                    if (n8 < n7) break block31;
                                    object = ni3_12.c;
                                    n7 = gh3_0.f;
                                    object8 = el1_0.b((Context)object9);
                                    object7 = gh3_0.f((Context)object9, object8);
                                    object6 = ((WorkDatabase)object).c().b();
                                    if (object7 != null) {
                                        n14 = ((ArrayList)object7).size();
                                    } else {
                                        n14 = 0;
                                        jobInfo = null;
                                    }
                                    HashSet<Object> hashSet = new HashSet<Object>(n14);
                                    if (object7 != null && (n14 = (int)(((ArrayList)object7).isEmpty() ? 1 : 0)) == 0) {
                                        object7 = ((ArrayList)object7).iterator();
                                        while ((n14 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                                            jobInfo = (JobInfo)object7.next();
                                            object10 = gh3_0.g(jobInfo);
                                            if (object10 != null) {
                                                jobInfo = ((gI3)object10).a;
                                                hashSet.add(jobInfo);
                                                continue;
                                            }
                                            n14 = jobInfo.getId();
                                            gh3_0.a(object8, n14);
                                        }
                                    }
                                    object8 = object6.iterator();
                                    while ((n4 = object8.hasNext()) != 0) {
                                        object7 = (String)object8.next();
                                        n4 = hashSet.contains(object7);
                                        if (n4 != 0) continue;
                                        object8 = qx1.a();
                                        object8.getClass();
                                        n7 = 1;
                                        break block26;
                                    }
                                    n7 = 0;
                                    object8 = null;
                                }
                                if (n7 == 0) break block32;
                                ((FP2)object).beginTransaction();
                                try {
                                    object7 = ((WorkDatabase)object).f();
                                    object6 = object6.iterator();
                                    while ((n14 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                                        jobInfo = object6.next();
                                        jobInfo = (String)jobInfo;
                                        object7.b(l7, (String)jobInfo);
                                    }
                                }
                                catch (Throwable throwable22) {
                                    break block27;
                                }
                                ((FP2)object).setTransactionSuccessful();
                                ((FP2)object).endTransaction();
                                break block32;
                            }
                            ((FP2)object).endTransaction();
                            throw throwable22;
                        }
                        n7 = 0;
                        object8 = null;
                    }
                    object = ni3_12.c;
                    object7 = ((WorkDatabase)object).f();
                    object6 = ((WorkDatabase)object).e();
                    ((FP2)object).beginTransaction();
                    try {
                        jobInfo = object7.v();
                        bl2 = jobInfo.isEmpty() ^ n10;
                        if (!bl2) break block28;
                    }
                    catch (Throwable throwable3) {
                        break block29;
                    }
                    jobInfo = jobInfo.iterator();
                    while (bl3 = jobInfo.hasNext()) {
                        object10 = jobInfo.next();
                        object10 = (EI3)object10;
                        object5 = hI3$b.ENQUEUED;
                        object10 = ((EI3)object10).a;
                        object7.d((hI3$b)((Object)object5), (String)object10);
                        n3 = -512;
                        object7.w(n3, (String)object10);
                        object7.b(l7, (String)object10);
                    }
                }
                object6.deleteAll();
                ((FP2)object).setTransactionSuccessful();
                ((FP2)object).endTransaction();
                if (!bl2 && n7 == 0) {
                    n8 = 0;
                    object = null;
                } else {
                    n8 = 1;
                }
                object5 = ni3_12.g.a.b();
                object8 = "reschedule_needed";
                object5 = object5.a((String)object8);
                l7 = 0L;
                if (object5 != null && (n3 = (int)((l4 = (l3 = ((Long)object5).longValue()) - (l2 = 1L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0) {
                    qx1.a().getClass();
                    ni3_12.l();
                    Object object11 = ni3_12.g;
                    object11.getClass();
                    Intrinsics.checkNotNullParameter(object8, "key");
                    object3 = l7;
                    object4 = new Wx2((String)object8, (Long)object3);
                    object11 = ((ky2_1)object11).a.b();
                    object11.b((Wx2)object4);
                    return;
                }
                try {
                    n3 = Build.VERSION.SDK_INT;
                    n7 = 31;
                    n7 = n3 >= n7 ? 0x22000000 : 0x20000000;
                    object7 = new Intent();
                    jobInfo = ForceStopRunnable$BroadcastReceiver.class;
                    object6 = new ComponentName((Context)object9, jobInfo);
                    object7.setComponent(object6);
                    object6 = "ACTION_FORCE_STOP_RESCHEDULE";
                    object7.setAction((String)object6);
                    int n15 = -1;
                    object8 = PendingIntent.getBroadcast((Context)object9, (int)n15, (Intent)object7, (int)n7);
                    n4 = 30;
                    if (n3 >= n4) {
                        if (object8 != null) {
                            object8.cancel();
                        }
                        object5 = "activity";
                        object9 = object9.getSystemService((String)object5);
                        object9 = (ActivityManager)object9;
                        if ((object9 = wv0_0.a((ActivityManager)object9)) != null && (n3 = (int)(object9.isEmpty() ? 1 : 0)) == 0) {
                            object5 = ((ky2_1)object3).a;
                            object5 = ((WorkDatabase)object5).b();
                            if ((object5 = object5.a((String)object4)) != null) {
                                l7 = (Long)object5;
                            }
                            object5 = null;
                            for (n3 = 0; n3 < (n7 = object9.size()); n3 += n10) {
                                long l8;
                                object8 = object9.get(n3);
                                n4 = yv0_0.a((ApplicationExitInfo)(object8 = xV0.a(object8)));
                                if (n4 != (n15 = 10) || (n7 = (int)((l8 = (l3 = zv0_0.a((ApplicationExitInfo)object8)) - l7) == 0L ? 0 : (l8 < 0L ? -1 : 1))) < 0) {
                                    continue;
                                }
                                break block30;
                            }
                        }
                    } else if (object8 == null) {
                        ForceStopRunnable.b((Context)object9);
                        break block30;
                    }
                    if (n8 == 0) return;
                }
                catch (IllegalArgumentException | SecurityException runtimeException) {
                    object2 = qx1.a();
                    object2.getClass();
                    break block30;
                }
                qx1.a().getClass();
                a a2 = ni3_12.b;
                object4 = ni3_12.c;
                object3 = ni3_12.e;
                rt2_0.b(a2, (WorkDatabase)object4, (List)object3);
                return;
            }
            qx1.a().getClass();
            ni3_12.l();
            ni3_12.b.d.getClass();
            long l12 = System.currentTimeMillis();
            object3.getClass();
            object = l12;
            object2 = new Wx2((String)object4, (Long)object);
            object4 = ((ky2_1)object3).a.b();
            object4.b((Wx2)object2);
            return;
        }
        ((FP2)object).endTransaction();
        throw throwable3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block24: {
            var1_1 = this.b;
            var2_2 = var1_1.b;
            var2_2.getClass();
            var3_14 = 0;
            var4_15 = null;
            var3_14 = TextUtils.isEmpty(null);
            var5_16 = 1;
            var6_17 = this.a;
            if (var3_14 != 0) {
                var2_2 = qx1.a();
                var2_2.getClass();
                var7_18 = 1;
            } else {
                var7_18 = Gz2.a(var6_17, (a)var2_2);
                var4_15 = qx1.a();
                var4_15.getClass();
            }
            if (var7_18 == 0) {
                var1_1.k();
                return;
            }
lbl24:
            // 3 sources

            while (true) {
                ** try [egrp 3[TRYBLOCK] [8 : 83->88)] { 
lbl-1000:
                // 1 sources

                {
                    catch (SQLiteException var2_12) {
                        var4_15 = "Unexpected SQLite exception during migrations";
                        var9_23 = qx1.a();
                        var9_23.getClass();
                        var9_23 = new IllegalStateException((String)var4_15, var2_12);
                        var2_13 = var1_1.b;
                        var2_13.getClass();
                        throw var9_23;
                    }
                }
lbl36:
                // 1 sources

                ** GOTO lbl39
                break;
            }
            {
                catch (Throwable var2_3) {
                    break block24;
                }
lbl39:
                // 1 sources

                SH3.a(var6_17);
                var2_2 = qx1.a();
                var2_2.getClass();
                try {
                    this.a();
                    var1_1.k();
                    return;
                }
                catch (SQLiteTableLockedException var2_4) {
                }
                catch (SQLiteFullException var2_5) {
                }
                catch (SQLiteDiskIOException var2_6) {
                }
                catch (SQLiteDatabaseLockedException var2_7) {
                }
                catch (SQLiteDatabaseCorruptException var2_8) {
                }
                catch (SQLiteConstraintException var2_9) {
                }
                catch (SQLiteCantOpenDatabaseException var2_10) {
                }
                catch (SQLiteAccessPermException var2_11) {
                    // empty catch block
                }
                {
                    this.d = var3_14 = this.d + var5_16;
                    var8_19 = 3;
                    if (var3_14 >= var8_19) {
                        var3_14 = (int)Bx3.a(var6_17);
                        var4_15 = var3_14 != 0 ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                        var9_22 = qx1.a();
                        var9_22.getClass();
                        var9_22 = new IllegalStateException((String)var4_15, (Throwable)var2_2);
                        var2_2 = var1_1.b;
                        var2_2.getClass();
                        throw var9_22;
                    }
                    var2_2 = qx1.a();
                    var2_2.getClass();
                    var7_18 = this.d;
                }
                var10_20 = var7_18;
                var12_21 = 300L;
                {
                    Thread.sleep(var10_20 *= var12_21);
                    ** continue;
                }
            }
        }
        var1_1.k();
        throw var2_3;
    }
}


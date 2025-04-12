/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Trace
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.a;
import androidx.work.a$b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from nI3
 */
public final class ni3_1
extends li3_1 {
    public static ni3_1 k;
    public static ni3_1 l;
    public static final Object m;
    public final Context a;
    public final a b;
    public final WorkDatabase c;
    public final Si3 d;
    public final List e;
    public final kz2_0 f;
    public final ky2_1 g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final aq3 j;

    static {
        Object object;
        qx1.b("WorkManagerImpl");
        k = null;
        l = null;
        m = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public ni3_1(Context object, a object2, Si3 object3, WorkDatabase object4, List object5, kz2_0 kz2_02, aq3 object6) {
        Object object7 = null;
        this.h = false;
        object = object.getApplicationContext();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4 && (n3 = (int)(mI3.a((Context)object) ? 1 : 0)) != 0) {
            object = new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            throw object;
        }
        n4 = ((a)object2).h;
        Object object8 = qx1.a;
        // MONITORENTER : object8
        qx1 qx12 = qx1.b;
        if (qx12 == null) {
            qx1.b = object7;
        }
        this.a = object;
        this.d = object3;
        this.c = object4;
        this.f = kz2_02;
        this.j = object6;
        this.b = object2;
        this.e = object5;
        Intrinsics.checkNotNullParameter(object3, "taskExecutor");
        object6 = object3.b();
        Intrinsics.checkNotNullExpressionValue(object6, "taskExecutor.taskCoroutineDispatcher");
        object6 = kotlinx.coroutines.d.a((CoroutineContext)object6);
        this.g = object7 = new ky2_1((WorkDatabase)object4);
        object7 = object3.c();
        n4 = rt2_0.a;
        object8 = new ot2_2((VZ2)object7, (List)object5, (a)object2, (WorkDatabase)object4);
        kz2_02.a((fe0_0)object8);
        object5 = new ForceStopRunnable((Context)object, this);
        object3.d((Runnable)object5);
        Intrinsics.checkNotNullParameter(object6, "<this>");
        Intrinsics.checkNotNullParameter(object, "appContext");
        Intrinsics.checkNotNullParameter(object2, "configuration");
        object3 = "db";
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        int n7 = Gz2.a((Context)object, (a)object2);
        if (n7 == 0) return;
        object2 = ((WorkDatabase)object4).f().q();
        int n8 = 4;
        object5 = null;
        object3 = new qg3_2(n8, null);
        object4 = new dt0_1((es0_2)object2, (Qv3)object3);
        n7 = -1;
        object2 = ms0_1.h(ms0_1.c((es0_2)object4, n7));
        object3 = new Rv3((Context)object, null);
        object = new vt0_2((es0_2)object2, (Function2)object3);
        object2 = new rs0_2((vt0_2)object, null);
        int n10 = 3;
        Ae3.d((i90_0)object6, null, null, (Function2)object2, n10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ni3_1 h() {
        Object object = m;
        synchronized (object) {
            try {
                ni3_1 ni3_12 = k;
                if (ni3_12 == null) return l;
                return ni3_12;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ni3_1 i(Context object) {
        Object object2 = m;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                Object object3;
                try {
                    object3 = ni3_1.h();
                    if (object3 != null) return object3;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                boolean bl2 = (object = object.getApplicationContext()) instanceof a$b;
                if (bl2) {
                    object3 = object;
                    object3 = (a$b)object;
                    object3 = object3.a();
                    ni3_1.j(object, (a)object3);
                    return ni3_1.i(object);
                }
                object3 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.";
                object = new IllegalStateException((String)object3);
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void j(Context object, a object2) {
        Object object3 = m;
        synchronized (object3) {
            Throwable throwable2;
            block6: {
                ni3_1 ni3_12;
                try {
                    ni3_1 ni3_13;
                    ni3_12 = k;
                    if (ni3_12 != null && (ni3_13 = l) != null) {
                        object2 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.";
                        object = new IllegalStateException((String)object2);
                        throw object;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                if (ni3_12 == null) {
                    object = object.getApplicationContext();
                    ni3_12 = l;
                    if (ni3_12 == null) {
                        object = pi3_1.e(object, (a)object2);
                        l = object;
                    }
                    object = l;
                    k = object;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final qh3_2 a(List object) {
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            qh3_2 qh3_22 = new qh3_2(this, (List)object);
            return qh3_22;
        }
        object = new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        throw object;
    }

    public final J92 b(List object) {
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            qh3_2 qh3_22 = new qh3_2(this, (List)object);
            return qh3_22.Q();
        }
        object = new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        throw object;
    }

    public final J92 e(String string2, DE0 dE0, List list) {
        qh3_2 qh3_22 = new qh3_2(this, string2, dE0, list);
        return qh3_22.Q();
    }

    public final K92 f(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(this, "workManagerImpl");
        S40 s40 = this.b.m;
        String string3 = "CancelWorkByName_".concat(string2);
        SerialExecutorImpl serialExecutorImpl = this.d.c();
        Intrinsics.checkNotNullExpressionValue(serialExecutorImpl, "workManagerImpl.workTask\u2026ecutor.serialTaskExecutor");
        wk_1 wk_12 = new wk_1(this, string2);
        return O92.a(s40, string3, serialExecutorImpl, wk_12);
    }

    public final J92 g(String string2, CE0 object, hq2_0 object2) {
        Object object3 = CE0.UPDATE;
        if (object == object3) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(string2, "name");
            Intrinsics.checkNotNullParameter(object2, "workRequest");
            object = this.b.m;
            object3 = kp1_0.c("enqueueUniquePeriodic_", string2);
            SerialExecutorImpl serialExecutorImpl = this.d.c();
            Intrinsics.checkNotNullExpressionValue(serialExecutorImpl, "workTaskExecutor.serialTaskExecutor");
            ti3_0 ti3_02 = new ti3_0(this, (CI3)object2, string2);
            return O92.a((S40)object, (String)object3, serialExecutorImpl, ti3_02);
        }
        object3 = CE0.KEEP;
        object = object == object3 ? DE0.KEEP : DE0.REPLACE;
        object2 = Collections.singletonList(object2);
        object3 = new qh3_2(this, string2, (DE0)((Object)object), (List)object2);
        return ((qh3_2)object3).Q();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k() {
        Object object = m;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    boolean bl2 = true;
                    try {
                        this.h = bl2;
                        BroadcastReceiver.PendingResult pendingResult = this.i;
                        if (pendingResult == null) break block3;
                        pendingResult.finish();
                        bl2 = false;
                        pendingResult = null;
                        this.i = null;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l() {
        Throwable throwable2;
        int n3;
        boolean bl2;
        block5: {
            S40 s40 = this.b.m;
            int n4 = 4;
            vr0_2 vr0_22 = new vr0_2(this, n4);
            Intrinsics.checkNotNullParameter(s40, "<this>");
            String string2 = "ReschedulingWork";
            Intrinsics.checkNotNullParameter(string2, "label");
            String string3 = "block";
            Intrinsics.checkNotNullParameter(vr0_22, string3);
            s40.getClass();
            bl2 = gp3_0.b();
            n3 = 1;
            if (bl2) {
                try {
                    s40.a(string2);
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            vr0_22.invoke();
            InlineMarker.finallyStart(n3);
            if (bl2) {
                Trace.endSection();
            }
            InlineMarker.finallyEnd(n3);
            return;
        }
        InlineMarker.finallyStart(n3);
        if (bl2) {
            Trace.endSection();
        }
        InlineMarker.finallyEnd(n3);
        throw throwable2;
    }
}


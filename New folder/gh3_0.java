/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gh3
 */
public final class gh3_0
implements mt2_0 {
    public static final /* synthetic */ int f;
    public final Context a;
    public final JobScheduler b;
    public final Dh3 c;
    public final WorkDatabase d;
    public final a e;

    static {
        qx1.b("SystemJobScheduler");
    }

    public gh3_0(Context context, WorkDatabase workDatabase, a a2) {
        JobScheduler jobScheduler = el1_0.b(context);
        xj2_2 xj2_22 = a2.d;
        boolean bl2 = a2.l;
        Dh3 dh3 = new Dh3(context, xj2_22, bl2);
        this.a = context;
        this.b = jobScheduler;
        this.c = dh3;
        this.d = workDatabase;
        this.e = a2;
    }

    public static void a(JobScheduler object, int n3) {
        try {
            object.cancel(n3);
        }
        catch (Throwable throwable) {
            object = qx1.a();
            Locale locale = Locale.getDefault();
            Object object2 = n3;
            int n4 = 1;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object2;
            object2 = "Exception while trying to cancel job (%d)";
            String.format(locale, (String)object2, objectArray);
            object.getClass();
        }
    }

    public static ArrayList d(Context object, JobScheduler object2, String string2) {
        if ((object = gh3_0.f((Context)object, (JobScheduler)object2)) == null) {
            return null;
        }
        int n3 = 2;
        object2 = new ArrayList(n3);
        object = ((ArrayList)object).iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            boolean bl2;
            Object object3 = (JobInfo)object.next();
            Object object4 = gh3_0.g(object3);
            if (object4 == null || !(bl2 = string2.equals(object4 = ((gI3)object4).a))) continue;
            n3 = object3.getId();
            object3 = n3;
            ((ArrayList)object2).add(object3);
        }
        return object2;
    }

    public static ArrayList f(Context object, JobScheduler object2) {
        boolean bl2;
        if ((object2 = el1_0.a((JobScheduler)object2)) == null) {
            return null;
        }
        int n3 = object2.size();
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        ComponentName componentName = SystemJobService.class;
        ComponentName componentName2 = new ComponentName((Context)object, componentName);
        object = object2.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (JobInfo)object.next();
            componentName = object2.getService();
            boolean bl3 = componentName2.equals((Object)componentName);
            if (!bl3) continue;
            arrayList.add(object2);
        }
        return arrayList;
    }

    public static gI3 g(JobInfo object) {
        block7: {
            String string2 = "EXTRA_WORK_SPEC_ID";
            if ((object = object.getExtras()) != null) {
                gI3 gI32;
                String string3;
                int n3;
                try {
                    n3 = object.containsKey(string2);
                    if (n3 == 0) break block7;
                    string3 = "EXTRA_WORK_SPEC_GENERATION";
                    gI32 = null;
                }
                catch (NullPointerException nullPointerException) {}
                n3 = object.getInt(string3, 0);
                object = object.getString(string2);
                gI32 = new gI3((String)object, n3);
                return gI32;
            }
        }
        return null;
    }

    public final void b(String string2) {
        int n3;
        Object object = this.a;
        JobScheduler jobScheduler = this.b;
        if ((object = gh3_0.d((Context)object, jobScheduler, string2)) != null && (n3 = ((ArrayList)object).isEmpty()) == 0) {
            object = ((ArrayList)object).iterator();
            while ((n3 = object.hasNext()) != 0) {
                Integer n4 = (Integer)object.next();
                n3 = n4;
                gh3_0.a(jobScheduler, n3);
            }
            object = this.d.c();
            object.e(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(EI3 ... eI3Array) {
        Throwable throwable2;
        WorkDatabase workDatabase = this.d;
        ad1_0 ad1_02 = new ad1_0(workDatabase);
        int n3 = eI3Array.length;
        int n4 = 0;
        while (true) {
            block15: {
                Object object;
                int n7;
                a a2;
                WorkDatabase workDatabase2;
                String string2;
                Object object2;
                Object object3;
                Object object4;
                block17: {
                    block16: {
                        if (n4 >= n3) {
                            return;
                        }
                        object4 = eI3Array[n4];
                        workDatabase.beginTransaction();
                        try {
                            object3 = workDatabase.f();
                            object2 = ((EI3)object4).a;
                            object3 = object3.i((String)object2);
                            if (object3 == null) {
                                object4 = qx1.a();
                                object4.getClass();
                                workDatabase.setTransactionSuccessful();
                                break block15;
                            }
                            object3 = ((EI3)object3).b;
                            object2 = hI3$b.ENQUEUED;
                            if (object3 != object2) {
                                object4 = qx1.a();
                                object4.getClass();
                                workDatabase.setTransactionSuccessful();
                                break block15;
                            }
                            object3 = JI3.a((EI3)object4);
                            object2 = workDatabase.c();
                            object2 = object2.c((gI3)object3);
                            string2 = "workDatabase.runInTransa\u2026d\n            }\n        )";
                            workDatabase2 = ad1_02.a;
                            a2 = this.e;
                            if (object2 == null) break block16;
                        }
                        catch (Throwable throwable2) {
                            break;
                        }
                        n7 = ((sh3_0)object2).c;
                        break block17;
                    }
                    a2.getClass();
                    n7 = a2.i;
                    object = new yc1_0(ad1_02, n7);
                    Object object5 = workDatabase2.runInTransaction((Callable)object);
                    Intrinsics.checkNotNullExpressionValue(object5, string2);
                    object5 = (Number)object5;
                    n7 = ((Number)object5).intValue();
                }
                if (object2 == null) {
                    object2 = "generationalId";
                    Intrinsics.checkNotNullParameter(object3, object2);
                    int n8 = ((gI3)object3).b;
                    object3 = ((gI3)object3).a;
                    object2 = new sh3_0((String)object3, n8, n7);
                    object3 = workDatabase.c();
                    object3.d((sh3_0)object2);
                }
                this.h((EI3)object4, n7);
                int n10 = Build.VERSION.SDK_INT;
                int n14 = 23;
                if (n10 == n14) {
                    object3 = this.a;
                    object2 = this.b;
                    object = ((EI3)object4).a;
                    if ((object3 = gh3_0.d((Context)object3, (JobScheduler)object2, (String)object)) != null) {
                        object2 = n7;
                        n14 = ((ArrayList)object3).indexOf(object2);
                        if (n14 >= 0) {
                            ((ArrayList)object3).remove(n14);
                        }
                        if ((n14 = (int)(((ArrayList)object3).isEmpty() ? 1 : 0)) == 0) {
                            object3 = ((ArrayList)object3).get(0);
                            object3 = (Integer)object3;
                            n10 = (Integer)object3;
                        } else {
                            a2.getClass();
                            n10 = a2.i;
                            object2 = new yc1_0(ad1_02, n10);
                            object3 = workDatabase2.runInTransaction((Callable)object2);
                            Intrinsics.checkNotNullExpressionValue(object3, string2);
                            object3 = (Number)object3;
                            n10 = ((Number)object3).intValue();
                        }
                        this.h((EI3)object4, n10);
                    }
                }
                workDatabase.setTransactionSuccessful();
            }
            workDatabase.endTransaction();
            ++n4;
        }
        workDatabase.endTransaction();
        throw throwable2;
    }

    public final boolean e() {
        return true;
    }

    public final void h(EI3 eI3, int n3) {
        IllegalStateException illegalStateException2;
        int n4;
        Object object;
        Object object2;
        int n7;
        Object object3;
        block22: {
            block21: {
                object3 = this.c.a(eI3, n3);
                qx1.a().getClass();
                n7 = 0;
                object2 = null;
                object = this.b;
                n4 = object.schedule((JobInfo)object3);
                if (n4 != 0) break block21;
                object3 = qx1.a();
                object3.getClass();
                n4 = (int)(eI3.q ? 1 : 0);
                if (n4 == 0) break block21;
                object3 = eI3.r;
                object = sg2.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
                if (object3 != object) break block21;
                eI3.q = false;
                object3 = qx1.a();
                object3.getClass();
                try {
                    this.h(eI3, n3);
                }
                catch (IllegalStateException illegalStateException2) {
                    break block22;
                }
                catch (Throwable throwable) {
                    qx1 qx12 = qx1.a();
                    eI3.toString();
                    qx12.getClass();
                }
            }
            return;
        }
        n3 = el1_0.a;
        Object object4 = this.a;
        Intrinsics.checkNotNullParameter(object4, "context");
        object3 = this.d;
        Intrinsics.checkNotNullParameter(object3, "workDatabase");
        object = this.e;
        Object object5 = "configuration";
        Intrinsics.checkNotNullParameter(object, (String)object5);
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 31;
        n10 = n8 >= n10 ? 150 : 100;
        object3 = ((WorkDatabase)object3).f().f();
        n4 = ((ArrayList)object3).size();
        int n14 = 34;
        String string2 = "<faulty JobScheduler failed to getPendingJobs>";
        if (n8 >= n14) {
            object5 = el1_0.b((Context)object4);
            List list = el1_0.a((JobScheduler)object5);
            if (list != null) {
                Object object6;
                int n15;
                if ((object5 = gh3_0.f((Context)object4, (JobScheduler)object5)) != null) {
                    n15 = list.size();
                    n8 = ((ArrayList)object5).size();
                    n15 -= n8;
                } else {
                    n15 = 0;
                    string2 = null;
                }
                n8 = 0;
                object5 = null;
                if (n15 == 0) {
                    n15 = 0;
                    string2 = null;
                } else {
                    object6 = " of which are not owned by WorkManager";
                    string2 = UX.a(n15, (String)object6);
                }
                object6 = object4.getSystemService("jobscheduler");
                String string3 = "null cannot be cast to non-null type android.app.job.JobScheduler";
                Intrinsics.checkNotNull(object6, string3);
                object6 = (JobScheduler)object6;
                object4 = gh3_0.f((Context)object4, (JobScheduler)object6);
                if (object4 != null) {
                    n7 = ((ArrayList)object4).size();
                }
                if (n7 != 0) {
                    object4 = " from WorkManager in the default namespace";
                    object5 = UX.a(n7, (String)object4);
                }
                object4 = new StringBuilder();
                n7 = list.size();
                ((StringBuilder)object4).append(n7);
                ((StringBuilder)object4).append(" jobs in \"androidx.work.systemjobscheduler\" namespace");
                object4 = ((StringBuilder)object4).toString();
                object4 = new String[]{object4, string2, object5};
                object2 = "elements";
                Intrinsics.checkNotNullParameter(object4, (String)object2);
                list = tp_2.y((Object[])object4);
                string3 = null;
                int n16 = 62;
                object6 = null;
                string2 = CollectionsKt.R(list, ",\n", null, null, null, n16);
            }
        } else {
            object2 = el1_0.b((Context)object4);
            if ((object4 = gh3_0.f((Context)object4, (JobScheduler)object2)) != null) {
                object2 = new StringBuilder();
                n3 = ((ArrayList)object4).size();
                ((StringBuilder)object2).append(n3);
                object4 = " jobs from WorkManager";
                ((StringBuilder)object2).append((String)object4);
                string2 = ((StringBuilder)object2).toString();
            }
        }
        object4 = Fh3.a(n10, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", string2, ".\nThere are ");
        ((StringBuilder)object4).append(n4);
        ((StringBuilder)object4).append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
        n4 = object.k;
        object4 = tu.a((StringBuilder)object4, n4, '.');
        qx1.a().getClass();
        object3 = new IllegalStateException((String)object4, illegalStateException2);
        throw object3;
    }
}


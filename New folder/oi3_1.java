/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oI3
 */
public final class oi3_1
extends FunctionReferenceImpl
implements jx0_2 {
    public static final oi3_1 a;

    static {
        oi3_1 oi3_12;
        a = oi3_12 = new FunctionReferenceImpl(6, pi3_1.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        Object object7;
        Object[] objectArray;
        int n3 = 2;
        int n4 = 1;
        Object object8 = object;
        object8 = (Context)object;
        Object object9 = object2;
        object9 = (a)object2;
        Object object10 = object3;
        object10 = (Si3)object3;
        Object object11 = object4;
        object11 = (WorkDatabase)object4;
        Object object12 = object5;
        object12 = (aq3)object5;
        Object object13 = object6;
        object13 = (kz2_0)object6;
        Intrinsics.checkNotNullParameter(object8, "p0");
        Intrinsics.checkNotNullParameter(object9, "p1");
        Intrinsics.checkNotNullParameter(object10, "p2");
        Intrinsics.checkNotNullParameter(object11, "p3");
        Intrinsics.checkNotNullParameter(object12, "p4");
        Object object14 = "p5";
        Intrinsics.checkNotNullParameter(object13, (String)object14);
        int n7 = rt2_0.a;
        n7 = Build.VERSION.SDK_INT;
        int n8 = 23;
        if (n7 >= n8) {
            object14 = new gh3_0((Context)object8, (WorkDatabase)object11, (a)object9);
            dk2_0.a((Context)object8, SystemJobService.class, n4 != 0);
            object11 = qx1.a();
            object11.getClass();
        } else {
            object11 = ((a)object9).d;
            object14 = "androidx.work.impl.background.gcm.GcmScheduler";
            try {
                object14 = Class.forName((String)object14);
                objectArray = new Class[n3];
                object7 = Context.class;
                objectArray[0] = object7;
                object7 = TV.class;
                objectArray[n4] = object7;
                object14 = ((Class)object14).getConstructor((Class<?>[])objectArray);
                objectArray = new Object[n3];
                objectArray[0] = object8;
                objectArray[n4] = object11;
                object11 = ((Constructor)object14).newInstance(objectArray);
                object11 = (mt2_0)object11;
                object14 = qx1.a();
                object14.getClass();
            }
            catch (Throwable throwable) {
                qx1.a().getClass();
                object11 = null;
            }
            object14 = object11;
            if (object11 == null) {
                object14 = new nh3_0((Context)object8);
                dk2_0.a((Context)object8, SystemAlarmService.class, n4 != 0);
                object11 = qx1.a();
                object11.getClass();
            }
        }
        objectArray = object14;
        Intrinsics.checkNotNullExpressionValue(object14, "createBestAvailableBackg\u2026kDatabase, configuration)");
        object14 = new ki3_2((kz2_0)object13, (Si3)object10);
        object11 = object7;
        object7 = new androidx.work.impl.background.greedy.a((Context)object8, (a)object9, (aq3)object12, (kz2_0)object13, (ki3_2)object14, (Si3)object10);
        Object[] objectArray2 = new mt2_0[n3];
        objectArray2[0] = objectArray;
        objectArray2[n4] = object7;
        return xx_2.i(objectArray2);
    }
}


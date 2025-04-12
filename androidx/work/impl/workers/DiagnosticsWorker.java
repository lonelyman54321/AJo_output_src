/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c$a;
import androidx.work.c$a$c;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public final class DiagnosticsWorker
extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "parameters");
        super(context, workerParameters);
    }

    public final c$a doWork() {
        boolean bl2;
        Object object = ni3_1.i(this.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(applicationContext)");
        Object object2 = ((ni3_1)object).c;
        Intrinsics.checkNotNullExpressionValue(object2, "workManager.workDatabase");
        Object object3 = ((WorkDatabase)object2).f();
        tI3 tI32 = ((WorkDatabase)object2).d();
        LI3 lI3 = ((WorkDatabase)object2).g();
        object2 = ((WorkDatabase)object2).c();
        ((ni3_1)object).b.d.getClass();
        long l2 = System.currentTimeMillis();
        long l3 = TimeUnit.DAYS.toMillis(1L);
        object = object3.c(l2 -= l3);
        ArrayList arrayList = object3.v();
        object3 = object3.n();
        int n3 = object.isEmpty() ^ 1;
        if (n3 != 0) {
            qx1 qx12 = qx1.a();
            qx12.getClass();
            qx12 = qx1.a();
            Sp0.a(tI32, lI3, (th3_1)object2, (List)object);
            qx12.getClass();
        }
        if (bl2 = arrayList.isEmpty() ^ true) {
            object = qx1.a();
            n3 = Sp0.a;
            object.getClass();
            object = qx1.a();
            Sp0.a(tI32, lI3, (th3_1)object2, arrayList);
            object.getClass();
        }
        if (bl2 = object3.isEmpty() ^ true) {
            object = qx1.a();
            object.getClass();
            object = qx1.a();
            Sp0.a(tI32, lI3, (th3_1)object2, (List)object3);
            object.getClass();
        }
        object = new c$a$c();
        Intrinsics.checkNotNullExpressionValue(object, "success()");
        return object;
    }
}


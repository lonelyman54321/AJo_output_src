/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.work.WorkerParameters$a;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class WI3$a {
    public final a a;
    public final Si3 b;
    public final BV0 c;
    public final WorkDatabase d;
    public final EI3 e;
    public final List f;
    public final Context g;
    public WorkerParameters$a h;

    public WI3$a(Context object, a a2, Si3 si3, BV0 bV0, WorkDatabase workDatabase, EI3 eI3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(a2, "configuration");
        Intrinsics.checkNotNullParameter(si3, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(bV0, "foregroundProcessor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(eI3, "workSpec");
        Intrinsics.checkNotNullParameter(arrayList, "tags");
        this.a = a2;
        this.b = si3;
        this.c = bV0;
        this.d = workDatabase;
        this.e = eI3;
        this.f = arrayList;
        object = object.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "context.applicationContext");
        this.g = object;
        this.h = object;
    }
}


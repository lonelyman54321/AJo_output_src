/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yi0
 */
public final class yi0_0 {
    public final Context a;
    public final String b;
    public final yg3$c c;
    public final FP2$e d;
    public final List e;
    public final boolean f;
    public final FP2$d g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final Set l;
    public final List m;
    public final List n;

    public yi0_0(Context context, String string2, yg3$c yg3$c, FP2$e fP2$e, List list, boolean bl2, FP2$d fP2$d, Executor executor, Executor executor2, boolean bl3, boolean bl4, Set set, List list2, List list3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(yg3$c, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(fP2$e, "migrationContainer");
        Intrinsics.checkNotNullParameter((Object)fP2$d, "journalMode");
        Intrinsics.checkNotNullParameter(executor, "queryExecutor");
        Intrinsics.checkNotNullParameter(executor2, "transactionExecutor");
        Intrinsics.checkNotNullParameter(list2, "typeConverters");
        Intrinsics.checkNotNullParameter(list3, "autoMigrationSpecs");
        this.a = context;
        this.b = string2;
        this.c = yg3$c;
        this.d = fP2$e;
        this.e = list;
        this.f = bl2;
        this.g = fP2$d;
        this.h = executor;
        this.i = executor2;
        this.j = bl3;
        this.k = bl4;
        this.l = set;
        this.m = list2;
        this.n = list3;
    }

    public final boolean a(int n3, int n4) {
        Integer n7;
        Set set;
        boolean bl2 = false;
        if (n3 > n4 && (n4 = (int)(this.k ? 1 : 0)) != 0) {
            return false;
        }
        n4 = (int)(this.j ? 1 : 0);
        if (n4 != 0 && ((set = this.l) == null || (n3 = (int)(set.contains(n7 = Integer.valueOf(n3)) ? 1 : 0)) == 0)) {
            bl2 = true;
        }
        return bl2;
    }
}


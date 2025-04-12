/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from WK
 */
public final class wk_1
extends Lambda
implements Function0 {
    public final /* synthetic */ String c;
    public final /* synthetic */ ni3_1 d;

    public wk_1(ni3_1 ni3_12, String string2) {
        this.c = string2;
        this.d = ni3_12;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Intrinsics.checkNotNullParameter(object, "name");
        Object object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "workManagerImpl");
        Object object3 = ((ni3_1)object2).c;
        Intrinsics.checkNotNullExpressionValue(object3, "workManagerImpl.workDatabase");
        TK tK = new TK((WorkDatabase)object3, (String)object, (ni3_1)object2);
        ((FP2)object3).runInTransaction(tK);
        object3 = ((ni3_1)object2).b;
        object = ((ni3_1)object2).c;
        object2 = ((ni3_1)object2).e;
        rt2_0.b((a)object3, (WorkDatabase)object, (List)object2);
        return Unit.a;
    }
}


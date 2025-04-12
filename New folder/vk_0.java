/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from VK
 */
public final class vk_0
extends Lambda
implements Function0 {
    public final /* synthetic */ ni3_1 c;
    public final /* synthetic */ UUID d;

    public vk_0(ni3_1 ni3_12, UUID uUID) {
        this.c = ni3_12;
        this.d = uUID;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Object object2 = ((ni3_1)object).c;
        Intrinsics.checkNotNullExpressionValue(object2, "workManagerImpl.workDatabase");
        UUID uUID = this.d;
        Object object3 = new UK((ni3_1)object, uUID);
        ((FP2)object2).runInTransaction((Runnable)object3);
        object2 = ((ni3_1)object).b;
        object3 = ((ni3_1)object).c;
        object = ((ni3_1)object).e;
        rt2_0.b((a)object2, (WorkDatabase)object3, (List)object);
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import com.jio.jioads.common.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Pe
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ Pe(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        int n3 = this.c;
        switch (n3) {
            default: {
                Object object = (b)this.d;
                if (object == null) return "";
                if ((object = object.P()) != null) return object;
                return "";
            }
            case 1: {
                Object object = (ni3_1)this.d;
                Object object2 = ((ni3_1)object).c;
                Intrinsics.checkNotNullExpressionValue(object2, "workManagerImpl.workDatabase");
                Object object3 = new XK((WorkDatabase)object2, (ni3_1)object);
                ((FP2)object2).runInTransaction((Runnable)object3);
                object2 = ((ni3_1)object).b;
                object3 = ((ni3_1)object).c;
                object = ((ni3_1)object).e;
                rt2_0.b((a)object2, (WorkDatabase)object3, (List)object);
                return Unit.a;
            }
            case 0: 
        }
        Object object = (Re)this.d;
        Object object4 = ((Re)object).l.getValue();
        if (object4 != null) return object4;
        object4 = ((Re)object).j;
        float f5 = ((D83)object4).c();
        boolean bl2 = Float.isNaN(f5);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((Re)object).g;
        if (bl2) return parcelableSnapshotMutableState.getValue();
        Object object5 = parcelableSnapshotMutableState.getValue();
        parcelableSnapshotMutableState = null;
        object = ((Re)object).c(f5, 0.0f, object5);
        return object;
    }
}


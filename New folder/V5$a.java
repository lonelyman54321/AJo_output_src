/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.k$e;
import com.ril.ajio.services.data.ajiocash.ActivePoints;
import kotlin.jvm.internal.Intrinsics;

public final class V5$a
extends k$e {
    public final boolean a(Object object, Object object2) {
        object = (ActivePoints)object;
        object2 = (ActivePoints)object2;
        Intrinsics.checkNotNullParameter(object, "oldItem");
        Intrinsics.checkNotNullParameter(object2, "newItem");
        object = ((ActivePoints)object).getItemId();
        object2 = ((ActivePoints)object2).getItemId();
        return Intrinsics.areEqual(object, object2);
    }

    public final boolean b(Object object, Object object2) {
        object = (ActivePoints)object;
        object2 = (ActivePoints)object2;
        Intrinsics.checkNotNullParameter(object, "oldItem");
        Intrinsics.checkNotNullParameter(object2, "newItem");
        object = ((ActivePoints)object).getItemId();
        object2 = ((ActivePoints)object2).getItemId();
        return Intrinsics.areEqual(object, object2);
    }
}


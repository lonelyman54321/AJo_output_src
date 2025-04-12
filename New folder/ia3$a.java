/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.k$e;
import com.ril.ajio.services.data.ajiocash.SpendHistory;
import kotlin.jvm.internal.Intrinsics;

public final class ia3$a
extends k$e {
    public final boolean a(Object object, Object object2) {
        object = (SpendHistory)object;
        object2 = (SpendHistory)object2;
        Intrinsics.checkNotNullParameter(object, "oldItem");
        Intrinsics.checkNotNullParameter(object2, "newItem");
        object = ((SpendHistory)object).getOrderId();
        object2 = ((SpendHistory)object2).getOrderId();
        return Intrinsics.areEqual(object, object2);
    }

    public final boolean b(Object object, Object object2) {
        object = (SpendHistory)object;
        object2 = (SpendHistory)object2;
        Intrinsics.checkNotNullParameter(object, "oldItem");
        Intrinsics.checkNotNullParameter(object2, "newItem");
        object = ((SpendHistory)object).getOrderId();
        object2 = ((SpendHistory)object2).getOrderId();
        return Intrinsics.areEqual(object, object2);
    }
}


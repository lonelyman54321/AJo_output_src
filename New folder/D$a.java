/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.k$e;
import com.ril.ajio.services.data.Credit.CreditActivityDetails;
import kotlin.jvm.internal.Intrinsics;

public final class D$a
extends k$e {
    public final boolean a(Object object, Object object2) {
        object = (CreditActivityDetails)object;
        object2 = (CreditActivityDetails)object2;
        Intrinsics.checkNotNullParameter(object, "oldItem");
        Intrinsics.checkNotNullParameter(object2, "newItem");
        object = ((CreditActivityDetails)object).getReturnReferenceid();
        object2 = ((CreditActivityDetails)object2).getReturnReferenceid();
        return Intrinsics.areEqual(object, object2);
    }

    public final boolean b(Object object, Object object2) {
        object = (CreditActivityDetails)object;
        object2 = (CreditActivityDetails)object2;
        Intrinsics.checkNotNullParameter(object, "oldItem");
        Intrinsics.checkNotNullParameter(object2, "newItem");
        object = ((CreditActivityDetails)object).getReturnReferenceid();
        object2 = ((CreditActivityDetails)object2).getReturnReferenceid();
        return Intrinsics.areEqual(object, object2);
    }
}


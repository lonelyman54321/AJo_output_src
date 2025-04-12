/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import kotlin.jvm.internal.Intrinsics;

public final class cq3
implements F62 {
    public final /* synthetic */ TransactionActivity a;

    public /* synthetic */ cq3(TransactionActivity transactionActivity) {
        this.a = transactionActivity;
    }

    public final void onChanged(Object object) {
        object = (String)object;
        Object object2 = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = ((TransactionActivity)object2).Z;
        if (object2 != null) {
            ((sU)object2).d.setText((CharSequence)object);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionBinding");
        throw null;
    }
}


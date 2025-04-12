/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fq3
 */
public final class fq3_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ C13 b;
    public final /* synthetic */ TransactionActivity c;

    public fq3_0(C13 c13, TransactionActivity transactionActivity, f80_0 f80_02) {
        this.b = c13;
        this.c = transactionActivity;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        C13 c13 = this.b;
        TransactionActivity transactionActivity = this.c;
        object = new fq3_0(c13, transactionActivity, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fq3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fq3_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        TransactionActivity transactionActivity = this.c;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            int n7 = R$string.chucker_share_transaction_title;
            TransactionActivity transactionActivity2 = this.c;
            String string2 = transactionActivity2.getString(n7);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_share_transaction_title)");
            n7 = R$string.chucker_share_transaction_subject;
            String string3 = transactionActivity.getString(n7);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.chucker_share_transaction_subject)");
            this.a = n4;
            C13 c13 = this.b;
            String string4 = "transaction.txt";
            String string5 = "transaction";
            object = D13.a(c13, transactionActivity2, string4, string2, string3, string5, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (Intent)object;
        if (object != null) {
            transactionActivity.startActivity((Intent)object);
        }
        return Unit.a;
    }
}


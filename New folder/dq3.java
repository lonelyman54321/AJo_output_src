/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 */
import android.view.MenuItem;
import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import kotlin.jvm.internal.Intrinsics;

public final class dq3
implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ TransactionActivity a;

    public /* synthetic */ dq3(TransactionActivity transactionActivity) {
        this.a = transactionActivity;
    }

    public final boolean onMenuItemClick(MenuItem object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((TransactionActivity)object).p2();
        Object object2 = ((Hq3)object).b.d();
        Intrinsics.checkNotNull(object2);
        boolean bl2 = (Boolean)object2;
        boolean bl3 = true;
        object = ((Hq3)object).a;
        object2 = bl2 ^= bl3;
        ((LiveData)object).k(object2);
        return bl3;
    }
}


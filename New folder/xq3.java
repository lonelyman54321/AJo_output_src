/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 */
import android.view.MenuItem;
import kotlin.jvm.internal.Intrinsics;

public final class xq3
implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ aq3_0 a;

    public /* synthetic */ xq3(aq3_0 aq3_02) {
        this.a = aq3_02;
    }

    public final boolean onMenuItemClick(MenuItem object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object.getClass();
        Object object2 = System.currentTimeMillis();
        object2 = Intrinsics.stringPlus("chucker-export-", object2);
        ((aq3_0)object).c.a(object2);
        return true;
    }
}


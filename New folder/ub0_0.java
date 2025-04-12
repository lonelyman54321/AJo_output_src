/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.services.data.returnexchange.dropatstore.DropAtStoreReturn;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UB0
 */
public final class ub0_0
implements F62 {
    public final /* synthetic */ ExReturnAddressActivity a;

    public /* synthetic */ ub0_0(ExReturnAddressActivity exReturnAddressActivity) {
        this.a = exReturnAddressActivity;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged(Object object) {
        boolean bl2;
        ArrayList arrayList;
        object = (DataCallback)object;
        ExReturnAddressActivity exReturnAddressActivity = this.a;
        Intrinsics.checkNotNullParameter(exReturnAddressActivity, "this$0");
        Intrinsics.checkNotNullParameter(object, "dropAtStoreListDataCallback");
        cp$a cp$a = cp_1.Companion;
        int n3 = nn_2.b(cp$a, (DataCallback)object);
        if (n3 == 0) return;
        n3 = exReturnAddressActivity.isFinishing();
        if (n3 != 0) return;
        AjioLoaderView ajioLoaderView = exReturnAddressActivity.k0;
        if (ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
        n3 = ((DataCallback)object).getStatus();
        int n4 = 1;
        if (n3 != 0) {
            int n7 = ((DataCallback)object).getStatus();
            if (n7 != n4) return;
            exReturnAddressActivity.A2(n4 != 0);
            return;
        }
        if ((object = (DropAtStoreReturn)((DataCallback)object).getData()) != null && (arrayList = ((DropAtStoreReturn)object).getStoreNodes()) != null) {
            object = ((DropAtStoreReturn)object).getStoreNodes();
            String string2 = "getStoreNodes(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            bl2 = object.isEmpty() ^ n4;
            if (bl2) {
                exReturnAddressActivity.A2(n4 != 0);
                return;
            }
        }
        bl2 = false;
        object = null;
        exReturnAddressActivity.A2(false);
    }
}


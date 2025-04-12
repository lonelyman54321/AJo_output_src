/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from N12
 */
public final class n12_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n12_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                pa3_1 pa3_12 = (pa3_1)this.b;
                Intrinsics.checkNotNullParameter(pa3_12, "this$0");
                pa3_12.k.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (String)object;
        Object object2 = (NewProductDetailsFragment)this.b;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        XC2 xC2 = null;
        if (!bl2) {
            object3 = ((Fragment)object2).getActivity();
            if (object3 != null && !(bl2 = (object3 = ((Fragment)object2).requireActivity()).isFinishing())) {
                bl2 = TextUtils.isEmpty((CharSequence)object);
                if (bl2) {
                    ((NewProductDetailsFragment)object2).Qb(null);
                } else {
                    object3 = ((NewProductDetailsFragment)object2).ib();
                    n3 = ((NewProductDetailsFragment)object2).hb();
                    object3.getClass();
                    RecentlyViewedDaoHelper.INSTANCE.setStoreId(n3);
                    object = ((ZC2)object3).a.a((String)object, "BackGround_RecentlyViewedProductList");
                    object2 = new WC2(object3, 0);
                    xC2 = new XC2((WC2)object2);
                    int n4 = 3;
                    object2 = new l8_0(object3, n4);
                    int n7 = 2;
                    H02 h02 = new H02(object2, n7);
                    object = ((g53_0)object).f(xC2, h02);
                    object2 = ((ZC2)object3).b;
                    ((t30_0)object2).b((yr0_2)object);
                }
            }
        } else {
            ((NewProductDetailsFragment)object2).Qb(null);
        }
        return Unit.a;
    }
}


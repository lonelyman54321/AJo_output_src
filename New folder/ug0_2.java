/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.view.fragment.CustomerCareFragment;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Ug0
 */
public final class ug0_2
implements Function1 {
    public final /* synthetic */ CustomerCareFragment a;

    public /* synthetic */ ug0_2(CustomerCareFragment customerCareFragment) {
        this.a = customerCareFragment;
    }

    public final Object invoke(Object object) {
        CustomerCareFragment customerCareFragment = this.a;
        object = (DataCallback)object;
        return CustomerCareFragment.Sa(customerCareFragment, (DataCallback)object);
    }
}


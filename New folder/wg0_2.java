/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.view.fragment.CustomerCareFragment;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Wg0
 */
public final class wg0_2
implements Function1 {
    public final /* synthetic */ CustomerCareFragment a;

    public /* synthetic */ wg0_2(CustomerCareFragment customerCareFragment) {
        this.a = customerCareFragment;
    }

    public final Object invoke(Object object) {
        CustomerCareFragment customerCareFragment = this.a;
        object = (DataCallback)object;
        return CustomerCareFragment.Ta(customerCareFragment, (DataCallback)object);
    }
}


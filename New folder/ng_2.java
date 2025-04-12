/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.itemdetail.CCItemDetailFragment;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from nG
 */
public final class ng_2
implements Function1 {
    public final /* synthetic */ CCItemDetailFragment a;

    public /* synthetic */ ng_2(CCItemDetailFragment cCItemDetailFragment) {
        this.a = cCItemDetailFragment;
    }

    public final Object invoke(Object object) {
        CCItemDetailFragment cCItemDetailFragment = this.a;
        object = (DataCallback)object;
        return CCItemDetailFragment.Sa(cCItemDetailFragment, (DataCallback)object);
    }
}


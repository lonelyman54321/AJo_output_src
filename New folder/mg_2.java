/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.itemdetail.CCItemDetailFragment;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from mG
 */
public final class mg_2
implements Function1 {
    public final /* synthetic */ CCItemDetailFragment a;

    public /* synthetic */ mg_2(CCItemDetailFragment cCItemDetailFragment) {
        this.a = cCItemDetailFragment;
    }

    public final Object invoke(Object object) {
        CCItemDetailFragment cCItemDetailFragment = this.a;
        object = (DataCallback)object;
        return CCItemDetailFragment.Ra(cCItemDetailFragment, (DataCallback)object);
    }
}


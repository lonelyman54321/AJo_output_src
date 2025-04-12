/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.view.fragment.CCComplaintListFragment;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from dG
 */
public final class dg_2
implements Function1 {
    public final /* synthetic */ CCComplaintListFragment a;

    public /* synthetic */ dg_2(CCComplaintListFragment cCComplaintListFragment) {
        this.a = cCComplaintListFragment;
    }

    public final Object invoke(Object object) {
        CCComplaintListFragment cCComplaintListFragment = this.a;
        object = (DataCallback)object;
        return CCComplaintListFragment.Pa(cCComplaintListFragment, (DataCallback)object);
    }
}


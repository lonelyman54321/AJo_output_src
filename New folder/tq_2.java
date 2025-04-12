/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.callmeback.CcCallMeFragment;

/*
 * Renamed from TQ
 */
public final class tq_2
implements F62 {
    public final /* synthetic */ CcCallMeFragment a;

    public /* synthetic */ tq_2(CcCallMeFragment ccCallMeFragment) {
        this.a = ccCallMeFragment;
    }

    public final void onChanged(Object object) {
        CcCallMeFragment ccCallMeFragment = this.a;
        object = (DataCallback)object;
        CcCallMeFragment.Oa(ccCallMeFragment, (DataCallback)object);
    }
}


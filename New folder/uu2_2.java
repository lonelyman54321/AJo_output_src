/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.view.fragment.SearchFaqFragment;

/*
 * Renamed from UU2
 */
public final class uu2_2
implements F62 {
    public final /* synthetic */ SearchFaqFragment a;

    public /* synthetic */ uu2_2(SearchFaqFragment searchFaqFragment) {
        this.a = searchFaqFragment;
    }

    public final void onChanged(Object object) {
        SearchFaqFragment searchFaqFragment = this.a;
        object = (DataCallback)object;
        SearchFaqFragment.Oa(searchFaqFragment, (DataCallback)object);
    }
}


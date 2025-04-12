/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.ondemand.customercare.view.fragment.SearchFaqFragment;

/*
 * Renamed from WU2
 */
public final class wu2_2
implements View.OnClickListener {
    public final /* synthetic */ SearchFaqFragment a;

    public /* synthetic */ wu2_2(SearchFaqFragment searchFaqFragment) {
        this.a = searchFaqFragment;
    }

    public final void onClick(View view) {
        SearchFaqFragment.Qa(this.a, view);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.view.KeyEvent;
import android.widget.TextView;
import com.ril.ajio.ondemand.customercare.view.fragment.SearchFaqFragment;

/*
 * Renamed from VU2
 */
public final class vu2_2
implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchFaqFragment a;

    public /* synthetic */ vu2_2(SearchFaqFragment searchFaqFragment) {
        this.a = searchFaqFragment;
    }

    public final boolean onEditorAction(TextView textView, int n3, KeyEvent keyEvent) {
        return SearchFaqFragment.Sa(this.a, textView, n3, keyEvent);
    }
}


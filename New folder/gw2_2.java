/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.search.SearchView;

/*
 * Renamed from gW2
 */
public final class gw2_2
implements View.OnClickListener {
    public final /* synthetic */ SearchView a;

    public /* synthetic */ gw2_2(SearchView searchView) {
        this.a = searchView;
    }

    public final void onClick(View view) {
        SearchView.j(this.a, view);
    }
}


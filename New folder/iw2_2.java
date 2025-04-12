/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f;
import com.google.android.material.search.SearchView;

/*
 * Renamed from iW2
 */
public final class iw2_2
implements T72 {
    public final /* synthetic */ ViewGroup.MarginLayoutParams a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ iw2_2(ViewGroup.MarginLayoutParams marginLayoutParams, int n3, int n4) {
        this.a = marginLayoutParams;
        this.b = n3;
        this.c = n4;
    }

    public final f onApplyWindowInsets(View view, f f5) {
        int n3 = this.c;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.a;
        int n4 = this.b;
        return SearchView.b(marginLayoutParams, n4, n3, view, f5);
    }
}


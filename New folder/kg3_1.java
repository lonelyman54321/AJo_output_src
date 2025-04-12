/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kg3
 */
public final class kg3_1 {
    public final View a;
    public final MV2 b;
    public final mu1_1 c;
    public final yw2_0 d;
    public final TextView e;
    public final View f;
    public final TextView g;
    public final View h;
    public final ImageView i;

    public kg3_1(View view, MV2 mV2, mu1_1 mu1_12, yw2_0 yw2_02) {
        Intrinsics.checkNotNullParameter(view, "parentView");
        Intrinsics.checkNotNullParameter(mV2, "searchSuggestionListener");
        Intrinsics.checkNotNullParameter(mu1_12, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(yw2_02, "searchViewModel");
        this.a = view;
        this.b = mV2;
        this.c = mu1_12;
        this.d = yw2_02;
        int n3 = R$id.sorry_msg;
        mV2 = (TextView)view.findViewById(n3);
        this.e = mV2;
        n3 = R$id.search_suggest_store_container;
        mV2 = view.findViewById(n3);
        this.f = mV2;
        n3 = R$id.search_suggest_store_tv;
        mV2 = (TextView)view.findViewById(n3);
        this.g = mV2;
        n3 = R$id.searchSuggestionContainer;
        mV2 = view.findViewById(n3);
        this.h = mV2;
        n3 = R$id.suggest_store_logo;
        view = (ImageView)view.findViewById(n3);
        this.i = view;
    }
}


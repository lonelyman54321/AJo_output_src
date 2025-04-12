/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ho2
 */
public final class ho2_2
extends BottomSheetDialogFragment {
    public TextView a;
    public View.OnClickListener b;
    public RecyclerView c;
    public TextView d;
    public String e;
    public String f;

    public ho2_2() {
        String string2;
        this.e = string2 = "";
        this.f = string2;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = this.getDialog();
        if (bundle != null && (bundle = bundle.getWindow()) != null) {
            int n3 = R$style.bottomDialogAnimation;
            bundle.setWindowAnimations(n3);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.PinCodeBottomSheetFragment;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_lux_review_bag_revamp;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.fragment_review_bag_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.frbTvTitle;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "findViewById(...)");
        object2 = (TextView)object2;
        int n4 = R$id.frbTvInfo;
        this.a = object3 = (TextView)object.findViewById(n4);
        n4 = R$id.frbRvItems;
        object3 = (RecyclerView)object.findViewById(n4);
        this.c = object3;
        n4 = R$id.frbTvReviewBag;
        object = (TextView)object.findViewById(n4);
        this.d = object;
        object = this.f;
        object2.setText((CharSequence)object);
        object = this.a;
        if (object != null) {
            object2 = hv3_0.f(this.e);
            object.setText((CharSequence)object2);
        }
        if ((object = this.c) != null) {
            n3 = 8;
            object.setVisibility(n3);
        }
        if ((object = this.d) != null) {
            n4 = 1;
            object2 = new uZ1(this, n4);
            object.setOnClickListener((View.OnClickListener)object2);
        }
    }
}


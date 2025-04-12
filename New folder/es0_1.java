/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from es0
 */
public final class es0_1
extends BottomSheetDialogFragment {
    public static final es0$a Companion;
    public boolean a;

    static {
        es0$a es0$a;
        Companion = es0$a = new Object();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getArguments();
        if (bundle != null) {
            bundle = this.getArguments();
            Intrinsics.checkNotNull(bundle);
            String string2 = "DOD_SIZE";
            boolean bl2 = bundle.containsKey(string2);
            if (bl2) {
                bundle = this.getArguments();
                Intrinsics.checkNotNull(bundle);
                this.a = bl2 = bundle.getBoolean(string2);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.dod_bottom_sheet_pop_up_view;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n3 = R$id.dod_bottom_sheet_pop_up_msg_tv;
        object = (TextView)view.findViewById(n3);
        int n4 = R$id.main_title;
        TextView textView = (TextView)view.findViewById(n4);
        int n7 = R$id.dod_bottom_sheet_pop_up_ends_in_layout;
        LinearLayout linearLayout = (LinearLayout)view.findViewById(n7);
        int n8 = R$id.dod_bottom_sheet_pop_up_ends_in_tv;
        TextView textView2 = (TextView)view.findViewById(n8);
        int n10 = R$id.dod_bottom_sheet_pop_up_ok_tv;
        view = (TextView)view.findViewById(n10);
        n10 = R$string.dod_stock_over_msg;
        object.setText(n10);
        object = null;
        linearLayout.setVisibility(0);
        n3 = R$string.dod_pop_up_ends_in;
        textView2.setText(n3);
        n3 = (int)(this.a ? 1 : 0);
        if (n3 != 0) {
            object = "Deal Stock is Over";
            textView.setText((CharSequence)object);
            n3 = 8;
            linearLayout.setVisibility(n3);
        }
        object = new ds0_0(this, 0);
        view.setOnClickListener((View.OnClickListener)object);
    }

    public final void show(FragmentManager object, String object2) {
        Object object3 = "manager";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object.getClass();
        object3 = new a((FragmentManager)object);
        object = "beginTransaction(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object);
        object = null;
        boolean bl2 = true;
        ((a)object3).h(0, this, (String)object2, (int)(bl2 ? 1 : 0));
        try {
            ((a)object3).o(bl2, bl2);
        }
        catch (IllegalStateException illegalStateException) {
            object2 = yn3_0.a;
            ((yn3$a)object2).e(illegalStateException);
        }
    }
}


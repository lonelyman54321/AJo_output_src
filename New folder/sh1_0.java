/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sh1
 */
public final class sh1_0
extends BottomSheetDialogFragment {
    public static final sh1$a Companion;

    static {
        sh1$a sh1$a;
        Companion = sh1$a = new Object();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.PinCodeBottomSheetFragment;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.info_bottom_sheet_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, bundle);
        int n3 = R$id.btn_okay;
        bundle = object.findViewById(n3);
        int n4 = R$id.close_dialog;
        View view = object.findViewById(n4);
        int n7 = R$id.info_title;
        AjioTextView ajioTextView = (AjioTextView)object.findViewById(n7);
        int n8 = R$id.info_desc;
        Object object2 = (AjioTextView)object.findViewById(n8);
        int n10 = R$id.parent_layout;
        object = (LinearLayout)object.findViewById(n10);
        Object object3 = Looper.getMainLooper();
        Object object4 = new Handler(object3);
        object3 = new ph1_0((LinearLayout)object);
        long l2 = 300L;
        object4.postDelayed((Runnable)object3, l2);
        object = h40_0.a;
        object = h40_0.m0();
        object4 = "ratingInfoPopUpDescription";
        int n14 = object.has((String)object4);
        object3 = "";
        if (n14 != 0) {
            object = h40_0.m0().getString((String)object4);
            Intrinsics.checkNotNull(object);
        } else {
            object = object3;
        }
        n14 = object.length();
        if (n14 > 0) {
            object = h40_0.m0();
            n14 = (int)(object.has((String)object4) ? 1 : 0);
            if (n14 != 0) {
                object = h40_0.m0().getString((String)object4);
                Intrinsics.checkNotNull(object);
            } else {
                object = object3;
            }
            object2.setText((CharSequence)object);
        }
        if ((n14 = (int)((object = h40_0.m0()).has((String)(object2 = "ratingInfoPopUpTitle")) ? 1 : 0)) != 0) {
            object = h40_0.m0().getString((String)object2);
            Intrinsics.checkNotNull(object);
        } else {
            object = object3;
        }
        n14 = object.length();
        if (n14 > 0) {
            object = h40_0.m0();
            n14 = (int)(object.has((String)object2) ? 1 : 0);
            if (n14 != 0) {
                object = h40_0.m0();
                object3 = object.getString((String)object2);
                Intrinsics.checkNotNull(object3);
            }
            ajioTextView.setText((CharSequence)object3);
        }
        object = new qh1_0(this, 0);
        bundle.setOnClickListener((View.OnClickListener)object);
        object = new rh1(this);
        view.setOnClickListener((View.OnClickListener)object);
    }
}


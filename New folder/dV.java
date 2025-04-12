/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.PlpListViewEvents;
import kotlin.jvm.internal.Intrinsics;

public final class dV
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ dV(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                bG1 bG12 = (bG1)this.b;
                Intrinsics.checkNotNullParameter(bG12, "this$0");
                object = PlpListViewEvents.Companion.getInstance();
                Yj2 yj2 = bG12.G0;
                object.logToggleButtonClickEvent(yj2);
                object = bG12.G0;
                yj2 = Yj2.LIST;
                object = object == yj2 ? Yj2.GRID : yj2;
                bG12.G0 = object;
                ImageView imageView = bG12.T0;
                if (imageView != null) {
                    if (object == yj2) {
                        n3 = R$drawable.ic_plp_grid_view;
                        imageView.setBackgroundResource(n3);
                        object = imageView.getContext();
                        int n4 = R$string.acc_grid_view;
                        object = object.getString(n4);
                        imageView.setContentDescription((CharSequence)object);
                    } else {
                        n3 = R$drawable.ic_plp_list_view;
                        imageView.setBackgroundResource(n3);
                        object = imageView.getContext();
                        int n7 = R$string.acc_list_view;
                        object = object.getString(n7);
                        imageView.setContentDescription((CharSequence)object);
                    }
                }
                bG12.Ab();
                return;
            }
            case 0: 
        }
        fv_0 fv_02 = (fv_0)this.b;
        Intrinsics.checkNotNullParameter(fv_02, "this$0");
        fv_02.dismiss();
    }
}


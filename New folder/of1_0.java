/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Home.LuxeFooterData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oF1
 */
public final class of1_0
extends RecyclerView$B {
    public final mf1_0 a;
    public final TextView b;

    public of1_0(View view, mf1_0 mf1_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(mf1_02, "luxeFooterClickListener");
        super(view);
        this.a = mf1_02;
        int n3 = R$id.luxe_footer_title_tv;
        view = (TextView)view.findViewById(n3);
        this.b = view;
    }

    public final void w(LuxeFooterData luxeFooterData) {
        Intrinsics.checkNotNullParameter(luxeFooterData, "luxeFooterData");
        String string2 = luxeFooterData.getTitle();
        Object object = this.b;
        object.setText((CharSequence)string2);
        string2 = luxeFooterData.getLink();
        if (string2 != null) {
            string2 = this.itemView;
            object = new nf1_0(this, luxeFooterData);
            string2.setOnClickListener((View.OnClickListener)object);
        }
    }
}


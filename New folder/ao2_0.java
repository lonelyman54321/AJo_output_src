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
import com.ril.ajio.R$id;

/*
 * Renamed from Ao2
 */
public final class ao2_0
extends rw_2 {
    public final TextView b;
    public final View c;

    public ao2_0(View view, dv_0 dv_02) {
        super(view);
        Object object;
        int n3 = R$id.row_payment_earning;
        this.c = object = view.findViewById(n3);
        n3 = R$id.row_payment_earning_tv_info;
        object = (TextView)view.findViewById(n3);
        this.b = object;
        n3 = R$id.row_payment_earning_lbl_moreinfo;
        view = (TextView)view.findViewById(n3);
        super(dv_02);
        view.setOnClickListener((View.OnClickListener)object);
    }

    public final void w(float f5) {
        StringBuilder stringBuilder = null;
        Object object = this.c;
        float f6 = f5 - 0.0f;
        Object object2 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object2 == false) {
            int n3 = 8;
            f5 = 1.1E-44f;
            object.setVisibility(n3);
        } else {
            object2 = false;
            object.setVisibility(0);
            String string2 = kq2_1.a(f5);
            object = "You earn \u20b9";
            stringBuilder = new StringBuilder((String)object);
            stringBuilder.append(string2);
            stringBuilder.append(" on AJIO wallet");
            string2 = stringBuilder.toString();
            stringBuilder = this.b;
            stringBuilder.setText(string2);
        }
    }
}


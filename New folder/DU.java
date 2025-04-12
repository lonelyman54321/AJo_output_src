/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.chuckerteam.chucker.R$layout;

public final class DU
implements BC3 {
    public final TextView a;
    public final TextView b;

    public DU(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    public static DU bind(View object) {
        if (object != null) {
            object = (TextView)object;
            DU dU = new DU((TextView)object, (TextView)object);
            return dU;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static DU inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_transaction_item_body_line;
        return DU.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}


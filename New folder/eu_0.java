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

/*
 * Renamed from EU
 */
public final class eu_0
implements BC3 {
    public final TextView a;
    public final TextView b;

    public eu_0(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    public static eu_0 bind(View object) {
        if (object != null) {
            object = (TextView)object;
            eu_0 eu_02 = new eu_0((TextView)object, (TextView)object);
            return eu_02;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static eu_0 inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_transaction_item_headers;
        return eu_0.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}


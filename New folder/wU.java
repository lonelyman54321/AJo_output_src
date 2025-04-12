/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;

public final class wU
implements BC3 {
    public final FrameLayout a;
    public final RecyclerView b;
    public final TextView c;
    public final LinearLayout d;

    public wU(FrameLayout frameLayout, RecyclerView recyclerView, TextView textView, LinearLayout linearLayout) {
        this.a = frameLayout;
        this.b = recyclerView;
        this.c = textView;
        this.d = linearLayout;
    }

    public static wU bind(View object) {
        LinearLayout linearLayout;
        TextView textView;
        int n3 = R$id.transactionsRecyclerView;
        RecyclerView recyclerView = (RecyclerView)object.findViewById(n3);
        if (recyclerView != null && (textView = (TextView)object.findViewById(n3 = R$id.tutorialLink)) != null && (linearLayout = (LinearLayout)object.findViewById(n3 = R$id.tutorialView)) != null) {
            object = (FrameLayout)object;
            wU wU2 = new wU((FrameLayout)object, recyclerView, textView, linearLayout);
            return wU2;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static wU inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_fragment_transaction_list;
        return wU.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}


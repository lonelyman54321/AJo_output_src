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

public final class vU
implements BC3 {
    public final FrameLayout a;
    public final RecyclerView b;
    public final TextView c;
    public final LinearLayout d;

    public vU(FrameLayout frameLayout, RecyclerView recyclerView, TextView textView, LinearLayout linearLayout) {
        this.a = frameLayout;
        this.b = recyclerView;
        this.c = textView;
        this.d = linearLayout;
    }

    public static vU bind(View object) {
        LinearLayout linearLayout;
        TextView textView;
        int n3 = R$id.errorsRecyclerView;
        RecyclerView recyclerView = (RecyclerView)object.findViewById(n3);
        if (recyclerView != null && (textView = (TextView)object.findViewById(n3 = R$id.tutorialLink)) != null && (linearLayout = (LinearLayout)object.findViewById(n3 = R$id.tutorialView)) != null) {
            object = (FrameLayout)object;
            vU vU2 = new vU((FrameLayout)object, recyclerView, textView, linearLayout);
            return vU2;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static vU inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_fragment_throwable_list;
        return vU.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}


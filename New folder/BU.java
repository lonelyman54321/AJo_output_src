/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;

public final class BU
implements BC3 {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public BU(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
    }

    public static BU bind(View object) {
        View view;
        int n3 = R$id.clazz;
        View view2 = view = object.findViewById(n3);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.date;
            View view3 = view = object.findViewById(n3);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.message;
                View view4 = view = object.findViewById(n3);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.tag;
                    View view5 = view = object.findViewById(n3);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (LinearLayout)object;
                        BU bU = new BU((LinearLayout)object2, (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5);
                        return bU;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static BU inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_list_item_throwable;
        return BU.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}


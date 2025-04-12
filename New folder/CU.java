/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;

public final class CU
implements BC3 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;
    public final TextView h;

    public CU(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView, TextView textView6) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = textView5;
        this.g = imageView;
        this.h = textView6;
    }

    public static CU bind(View object) {
        View view;
        int n3 = R$id.code;
        View view2 = view = object.findViewById(n3);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.duration;
            View view3 = view = object.findViewById(n3);
            view3 = (TextView)view;
            if (view3 != null && (view = (Guideline)object.findViewById(n3 = R$id.guideline)) != null) {
                n3 = R$id.host;
                View view4 = view = object.findViewById(n3);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.path;
                    View view5 = view = object.findViewById(n3);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.size;
                        View view6 = view = object.findViewById(n3);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.ssl;
                            View view7 = view = object.findViewById(n3);
                            view7 = (ImageView)view;
                            if (view7 != null) {
                                n3 = R$id.timeStart;
                                View view8 = view = object.findViewById(n3);
                                view8 = (TextView)view;
                                if (view8 != null) {
                                    Object object2 = object;
                                    object2 = (ConstraintLayout)((Object)object);
                                    CU cU = new CU((ConstraintLayout)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5, (TextView)view6, (ImageView)view7, (TextView)view8);
                                    return cU;
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CU inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_list_item_transaction;
        return CU.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}


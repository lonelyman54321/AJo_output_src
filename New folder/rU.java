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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;
import com.google.android.material.appbar.MaterialToolbar;

public final class rU
implements BC3 {
    public final CoordinatorLayout a;
    public final BU b;
    public final TextView c;
    public final MaterialToolbar d;
    public final TextView e;

    public rU(CoordinatorLayout coordinatorLayout, BU bU, TextView textView, MaterialToolbar materialToolbar, TextView textView2) {
        this.a = coordinatorLayout;
        this.b = bU;
        this.c = textView;
        this.d = materialToolbar;
        this.e = textView2;
    }

    public static rU bind(View object) {
        int n3 = R$id.throwableItem;
        View view = object.findViewById(n3);
        if (view != null) {
            BU bU = BU.bind(view);
            n3 = R$id.throwableStacktrace;
            View view2 = view = object.findViewById(n3);
            view2 = (TextView)view;
            if (view2 != null) {
                n3 = R$id.toolbar;
                Object object2 = view = object.findViewById(n3);
                object2 = (MaterialToolbar)view;
                if (object2 != null) {
                    n3 = R$id.toolbarTitle;
                    View view3 = view = object.findViewById(n3);
                    view3 = (TextView)view;
                    if (view3 != null) {
                        Object object3 = object;
                        object3 = (CoordinatorLayout)object;
                        rU rU2 = new rU((CoordinatorLayout)object3, bU, (TextView)view2, (MaterialToolbar)object2, (TextView)view3);
                        return rU2;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static rU inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_activity_throwable;
        return rU.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}


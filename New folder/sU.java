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
import androidx.viewpager.widget.ViewPager;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

public final class sU
implements BC3 {
    public final CoordinatorLayout a;
    public final TabLayout b;
    public final MaterialToolbar c;
    public final TextView d;
    public final ViewPager e;

    public sU(CoordinatorLayout coordinatorLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, TextView textView, ViewPager viewPager) {
        this.a = coordinatorLayout;
        this.b = tabLayout;
        this.c = materialToolbar;
        this.d = textView;
        this.e = viewPager;
    }

    public static sU bind(View object) {
        View view;
        int n3 = R$id.tabLayout;
        Object object2 = view = object.findViewById(n3);
        object2 = (TabLayout)view;
        if (object2 != null) {
            n3 = R$id.toolbar;
            Object object3 = view = object.findViewById(n3);
            object3 = (MaterialToolbar)view;
            if (object3 != null) {
                n3 = R$id.toolbarTitle;
                View view2 = view = object.findViewById(n3);
                view2 = (TextView)view;
                if (view2 != null) {
                    n3 = R$id.viewPager;
                    Object object4 = view = object.findViewById(n3);
                    object4 = (ViewPager)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (CoordinatorLayout)object;
                        sU sU2 = new sU((CoordinatorLayout)object5, (TabLayout)((Object)object2), (MaterialToolbar)object3, (TextView)view2, (ViewPager)((Object)object4));
                        return sU2;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static sU inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_activity_transaction;
        return sU.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}


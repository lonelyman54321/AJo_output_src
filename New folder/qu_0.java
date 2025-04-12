/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

/*
 * Renamed from qU
 */
public final class qu_0
implements BC3 {
    public final LinearLayout a;
    public final TabLayout b;
    public final MaterialToolbar c;
    public final ViewPager d;

    public qu_0(LinearLayout linearLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, ViewPager viewPager) {
        this.a = linearLayout;
        this.b = tabLayout;
        this.c = materialToolbar;
        this.d = viewPager;
    }

    public static qu_0 bind(View object) {
        ViewPager viewPager;
        MaterialToolbar materialToolbar;
        int n3 = R$id.tabLayout;
        TabLayout tabLayout = (TabLayout)object.findViewById(n3);
        if (tabLayout != null && (materialToolbar = (MaterialToolbar)object.findViewById(n3 = R$id.toolbar)) != null && (viewPager = (ViewPager)object.findViewById(n3 = R$id.viewPager)) != null) {
            object = (LinearLayout)object;
            qu_0 qu_02 = new qu_0((LinearLayout)object, tabLayout, materialToolbar, viewPager);
            return qu_02;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static qu_0 inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_activity_main;
        return qu_0.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qc0
 */
public final class qc0_2
implements TabLayout$OnTabSelectedListener {
    public final /* synthetic */ pc0_2 a;

    public qc0_2(pc0_2 pc0_22) {
        this.a = pc0_22;
    }

    public final void onTabReselected(TabLayout$Tab tabLayout$Tab) {
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
    }

    public final void onTabSelected(TabLayout$Tab tabLayout$Tab) {
        Object object = "tab";
        Intrinsics.checkNotNullParameter(tabLayout$Tab, (String)object);
        tabLayout$Tab = tabLayout$Tab.getCustomView();
        if (tabLayout$Tab != null) {
            int n3 = R$id.coupon_list_type;
            tabLayout$Tab = (TextView)tabLayout$Tab.findViewById(n3);
            n3 = hv3_0.m(R$color.blue);
            tabLayout$Tab.setTextColor(n3);
            object = FontsManager.getInstance();
            Context context = this.a.getContext();
            int n4 = 8;
            object = ((FontsManager)object).getTypefaceWithFont(context, n4);
            tabLayout$Tab.setTypeface((Typeface)object);
        }
    }

    public final void onTabUnselected(TabLayout$Tab tabLayout$Tab) {
        Object object = "tab";
        Intrinsics.checkNotNullParameter(tabLayout$Tab, (String)object);
        tabLayout$Tab = tabLayout$Tab.getCustomView();
        if (tabLayout$Tab != null) {
            int n3 = R$id.coupon_list_type;
            tabLayout$Tab = (TextView)tabLayout$Tab.findViewById(n3);
            n3 = hv3_0.m(R$color.blue);
            tabLayout$Tab.setTextColor(n3);
            object = FontsManager.getInstance();
            Context context = this.a.getContext();
            int n4 = 5;
            object = ((FontsManager)object).getTypefaceWithFont(context, n4);
            tabLayout$Tab.setTypeface((Typeface)object);
        }
    }
}


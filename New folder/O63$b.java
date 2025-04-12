/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class O63$b
implements TabLayout$OnTabSelectedListener {
    public final /* synthetic */ O63 a;

    public O63$b(O63 o63) {
        this.a = o63;
    }

    public final void onTabReselected(TabLayout$Tab tabLayout$Tab) {
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
    }

    public final void onTabSelected(TabLayout$Tab object) {
        Intrinsics.checkNotNullParameter(object, "tab");
        int n3 = ((TabLayout$Tab)object).getPosition();
        O63 o63 = this.a;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                o63.M = object = "cm";
                n3 = o63.N;
                ArrayList arrayList = o63.O;
                o63.s(n3, arrayList);
            }
        } else {
            o63.M = object = "in";
            n3 = o63.N;
            ArrayList arrayList = o63.O;
            o63.s(n3, arrayList);
        }
    }

    public final void onTabUnselected(TabLayout$Tab tabLayout$Tab) {
        Intrinsics.checkNotNullParameter(tabLayout$Tab, "tab");
    }
}


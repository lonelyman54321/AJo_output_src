/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from X61
 */
public final class x61_0
extends Uk2 {
    public final List c;
    public final g71_0 d;
    public final String e;
    public nh_2 f;

    public x61_0(List list, g71_0 g71_02, String string2) {
        Intrinsics.checkNotNullParameter(list, "bannerList");
        Intrinsics.checkNotNullParameter(g71_02, "homeComponentClickListener");
        Intrinsics.checkNotNullParameter(string2, "parentPosition");
        this.c = list;
        this.d = g71_02;
        this.e = string2;
    }

    public final void a(ViewGroup viewGroup, int n3, Object object) {
        Intrinsics.checkNotNullParameter(viewGroup, "collection");
        Intrinsics.checkNotNullParameter(object, "view");
        object = (View)object;
        viewGroup.removeView((View)object);
    }

    public final int c() {
        int n3;
        List list = this.c;
        int n4 = list.size();
        int n7 = n4 > (n3 = 1) ? -1 >>> 1 : list.size();
        return n7;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object f(int n3, ViewGroup viewGroup) {
        int n4;
        x61_0 x61_02 = this;
        int n7 = n3;
        Object object = viewGroup;
        Intrinsics.checkNotNullParameter(viewGroup, "collection");
        Object object2 = this.c;
        int n8 = object2.size();
        n8 = n3 % n8;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n10 = R$layout.home_image_layout;
        int n14 = 0;
        Object object3 = null;
        View view = layoutInflater.inflate(n10, viewGroup, false);
        String string2 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout";
        Intrinsics.checkNotNull(view, string2);
        ConstraintLayout constraintLayout = (ConstraintLayout)view;
        viewGroup.addView((View)constraintLayout);
        Object object4 = object = object2.get(n8);
        object4 = (BannerData)object;
        int n15 = R$id.homeImageContainer;
        object = (ConstraintLayout)constraintLayout.findViewById(n15);
        object2 = ((BannerData)object4).getAltText();
        if (object2 != null && (n4 = ((String)object2).length()) != 0) {
            object2 = ((BannerData)object4).getAltText();
        } else {
            cp_1.Companion.getClass();
            cp$a.e().getClass();
            object2 = cp_1.M(n3);
            n10 = R$string.acc_banner;
            string2 = hv3_0.K(n10);
            object3 = " ";
            object2 = n1.a((String)object2, (String)object3, string2);
        }
        object.setContentDescription((CharSequence)object2);
        n15 = (int)(((BannerData)object4).getShowTimer() ? 1 : 0);
        object2 = "|";
        string2 = x61_02.e;
        if (n15 != 0) {
            object = nh_2.Companion;
            object3 = ((BannerData)object4).getTimerEndTime();
            long l2 = 0L;
            long l3 = object3 != null ? (Long)object3 : l2;
            object.getClass();
            n15 = (int)(nh$a_0.a(l3) ? 1 : 0);
            if (n15 != 0) {
                Object object5;
                n14 = R$id.timerContainer;
                View view2 = constraintLayout.findViewById(n14);
                n14 = R$id.info;
                Object object6 = object3 = constraintLayout.findViewById(n14);
                object6 = (TextView)object3;
                n14 = R$id.days;
                Object object7 = object3 = constraintLayout.findViewById(n14);
                object7 = (TextView)object3;
                n14 = R$id.days_postfix;
                Object object8 = object3 = constraintLayout.findViewById(n14);
                object8 = (TextView)object3;
                n14 = R$id.hours;
                Object object9 = object3 = constraintLayout.findViewById(n14);
                object9 = (TextView)object3;
                n14 = R$id.minutes;
                Object object10 = object3 = constraintLayout.findViewById(n14);
                object10 = (TextView)object3;
                n14 = R$id.seconds;
                Object object11 = object3 = constraintLayout.findViewById(n14);
                object11 = (TextView)object3;
                object3 = ((BannerData)object4).getTimerEndTime();
                if (object3 != null) {
                    l2 = (Long)object3;
                }
                oh_2 oh_22 = object5;
                object5 = new oh_2(view2, (TextView)object6, (TextView)object7, (TextView)object8, (TextView)object9, (TextView)object10, (TextView)object11, l2);
                x61_02.f = object = new nh_2((oh_2)object5);
                object5 = ((BannerData)object4).getTimerLabel();
                ((nh_2)object).a((String)object5);
                n15 = R$id.timerContainer;
                View view3 = constraintLayout.findViewById(n15);
                String string3 = LO1.a(n7, string2, (String)object2);
                g71_0 g71_02 = x61_02.d;
                oh_22 = null;
                object3 = constraintLayout;
                V81.b(constraintLayout, (BannerData)object4, g71_02, view3, false, string3);
                return constraintLayout;
            }
        }
        n7 = 0;
        x61_02.f = null;
        String string4 = LO1.a(n8, string2, (String)object2);
        g71_0 g71_03 = x61_02.d;
        Object var29_32 = null;
        int n16 = 24;
        object3 = constraintLayout;
        V81.c(constraintLayout, (BannerData)object4, g71_03, null, string4, n16);
        return constraintLayout;
    }

    public final boolean g(View view, Object object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(view, "view");
        String string2 = "object";
        Intrinsics.checkNotNullParameter(object, string2);
        if (view == object) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import com.ril.ajio.kmm.shared.model.home.transform.SubComponentT;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class V81 {
    public static int a = 1;

    public static ImageView a(ConstraintLayout constraintLayout, int n3, int n4, String string2, boolean bl2) {
        int n7;
        Intrinsics.checkNotNullParameter((Object)constraintLayout, "container");
        Context context = constraintLayout.getContext();
        ImageView imageView = new ImageView(context);
        context = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType((ImageView.ScaleType)context);
        int n8 = a;
        a = n7 = n8 + 1;
        imageView.setId(n8);
        ai0_2.m((View)imageView);
        context = new ViewGroup.LayoutParams(n3, n4);
        ai0_2.m((View)constraintLayout);
        constraintLayout.addView((View)imageView, (ViewGroup.LayoutParams)context);
        boolean bl3 = true;
        if (bl2) {
            da$a da$a = new da$a();
            da$a.k = bl3;
            da$a.b = n4 = R$drawable.item_dummy_noimg;
            da$a.c = n4 = R$drawable.component_placeholder;
            da$a.a = n4;
            da$a.r = bl3;
            da$a.s = bl3;
            n4 = R$string.acc_icon_product_placeholder;
            String string3 = hv3_0.K(n4);
            da$a.b(string3);
            da$a.n = string2;
            da$a.u = imageView;
            da$a.i = bl3;
            da$a.a();
        } else {
            da$a da$a = new da$a();
            da$a.k = bl3;
            da$a.r = bl3;
            da$a.s = bl3;
            n4 = R$string.acc_icon_product_placeholder;
            String string4 = hv3_0.K(n4);
            da$a.b(string4);
            da$a.n = string2;
            da$a.u = imageView;
            da$a.i = bl3;
            da$a.a();
        }
        return imageView;
    }

    public static void b(ConstraintLayout constraintLayout, BannerData bannerData, g71_0 g71_02, View view, boolean n3, String string2) {
        int n4;
        int n7;
        Object object;
        int n8;
        int n10;
        View view2;
        int n14;
        int n15;
        int n16;
        ConstraintLayout constraintLayout2 = constraintLayout;
        BannerData bannerData2 = bannerData;
        g71_0 g71_03 = g71_02;
        String string3 = string2;
        Intrinsics.checkNotNullParameter((Object)constraintLayout, "container");
        Intrinsics.checkNotNullParameter(bannerData, "banner");
        Intrinsics.checkNotNullParameter(g71_02, "homeComponentClickListener");
        Intrinsics.checkNotNullParameter(string2, "creativeSlot");
        int n17 = bannerData.getWidth();
        int n18 = bannerData.getHeight();
        Object object2 = bannerData.getBannerUrl();
        int n19 = n3;
        ImageView imageView = V81.a(constraintLayout, n17, n18, (String)object2, n3 != 0);
        Iterator iterator = bannerData.getAltText();
        if (iterator == null) {
            n18 = R$string.acc_banner;
            iterator = Ft2.a(hv3_0.K(n18), string2);
        }
        imageView.setContentDescription((CharSequence)((Object)iterator));
        if (view != null) {
            iterator = new Iterator();
            ((b)((Object)iterator)).e(constraintLayout2);
            n16 = imageView.getId();
            n19 = view.getId();
            n15 = 4;
            n14 = 3;
            ((b)((Object)iterator)).f(n16, n14, n19, n15);
            ((b)((Object)iterator)).b(constraintLayout2);
        }
        if ((iterator = bannerData.getSubComponents()) != null) {
            iterator = ((Iterable)((Object)iterator)).iterator();
            while ((n16 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = (SubComponentT)iterator.next();
                n19 = ((SubComponentT)object2).getWidth();
                n15 = ((SubComponentT)object2).getHeight();
                String string4 = ((SubComponentT)object2).getImageUrl();
                view2 = V81.a(constraintLayout2, n19, n15, string4, true);
                b b2 = new b();
                b2.e(constraintLayout2);
                n14 = view2.getId();
                n10 = imageView.getId();
                n8 = ((SubComponentT)object2).getX();
                object = b2;
                b2.g(n14, 6, n10, 6, n8);
                n14 = view2.getId();
                n10 = imageView.getId();
                n8 = ((SubComponentT)object2).getY();
                n7 = 3;
                n4 = 3;
                b2.g(n14, n7, n10, n4, n8);
                b2.b(constraintLayout2);
            }
        }
        if ((iterator = bannerData.getHotspots()) != null) {
            iterator = ((Iterable)((Object)iterator)).iterator();
            while ((n16 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = (HotSpotT)iterator.next();
                object = constraintLayout.getContext();
                view2 = new View((Context)object);
                ai0_2.m(view2);
                n15 = ((HotSpotT)object2).getWidth();
                n14 = ((HotSpotT)object2).getHeight();
                n7 = a;
                a = n10 = n7 + 1;
                view2.setId(n7);
                ai0_2.m(view2);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n15, n14);
                ai0_2.m((View)constraintLayout);
                constraintLayout2.addView(view2, layoutParams);
                object = new b();
                ((b)object).e(constraintLayout2);
                n4 = view2.getId();
                int n20 = imageView.getId();
                int n21 = ((HotSpotT)object2).getX();
                ((b)object).g(n4, 6, n20, 6, n21);
                n4 = view2.getId();
                n20 = imageView.getId();
                n21 = ((HotSpotT)object2).getY();
                n8 = 3;
                int n22 = 3;
                ((b)object).g(n4, n8, n20, n22, n21);
                ((b)object).b(constraintLayout2);
                object = new U81((HotSpotT)object2, g71_03, bannerData2, string3);
                view2.setOnClickListener((View.OnClickListener)object);
            }
        }
    }

    public static /* synthetic */ void c(ConstraintLayout constraintLayout, BannerData bannerData, g71_0 g71_02, View view, String string2, int n3) {
        boolean bl2;
        int n4;
        int n7 = n3 & 8;
        if (n7 != 0) {
            n4 = 0;
            view = null;
        }
        View view2 = view;
        n4 = n3 & 0x10;
        if (n4 != 0) {
            n4 = 1;
            bl2 = true;
        } else {
            n4 = 0;
            view = null;
            bl2 = false;
        }
        n4 = n3 & 0x20;
        if (n4 != 0) {
            string2 = "";
        }
        V81.b(constraintLayout, bannerData, g71_02, view2, bl2, string2);
    }
}


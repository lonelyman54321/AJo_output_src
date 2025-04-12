/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.kmm.shared.model.home.HomeDataUtil;
import com.ril.ajio.kmm.shared.model.home.transform.PositionInfo;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.Hotspot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zv
 */
public final class zv_1
extends Uk2 {
    public final List c;
    public final Av d;

    public zv_1(ArrayList arrayList, Av av2) {
        Intrinsics.checkNotNullParameter(arrayList, "bannerList");
        this.c = arrayList;
        this.d = av2;
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

    public final Object f(int n3, ViewGroup viewGroup) {
        int n4;
        zv_1 zv_12 = this;
        ViewGroup viewGroup2 = viewGroup;
        Intrinsics.checkNotNullParameter(viewGroup, "collection");
        Object object = this.c;
        int n7 = object.size();
        n7 = n3 % n7;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n8 = R$layout.banner_carousel_item;
        layoutInflater = layoutInflater.inflate(n8, viewGroup, false);
        n8 = R$id.containerImgCL;
        Object object2 = (ConstraintLayout)layoutInflater.findViewById(n8);
        object = (Banner)object.get(n7);
        Object object3 = HomeDataUtil.INSTANCE;
        Double d2 = ((Banner)object).getWidth();
        Object object4 = ((Banner)object).getHeight();
        int n10 = hv3_0.F();
        Object object5 = hv3_0.a;
        object5.getClass();
        int n14 = hv3_0.E();
        Object object6 = new ScreenInfo(n10, n14);
        Object object7 = null;
        object3 = ((HomeDataUtil)object3).getViewDimen(d2, (Double)object4, (ScreenInfo)object6, null);
        Intrinsics.checkNotNull(object2);
        int n15 = ((ScreenInfo)object3).getWidth();
        int n16 = ((ScreenInfo)object3).getHeight();
        object6 = ((Banner)object).getBannerUrl();
        n10 = 1;
        d2 = V81.a(object2, n15, n16, (String)object6, n10 != 0);
        object4 = ((Banner)object).getAltText();
        if (object4 == null) {
            object4 = d2.getContext();
            n4 = R$string.acc_banner;
            object4 = object4.getString(n4);
            object6 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object6);
        }
        d2.setContentDescription((CharSequence)object4);
        Intrinsics.checkNotNull(layoutInflater);
        object4 = ((Banner)object).getBannerType();
        object6 = "AD";
        n16 = (int)(Intrinsics.areEqual(object4, object6) ? 1 : 0);
        if (n16 == 0 && (n16 = (int)(Intrinsics.areEqual(object4 = ((Banner)object).getBannerType(), object6 = "EXTERNAL_AD") ? 1 : 0)) == 0) {
            object4 = ((Banner)object).getHotspots();
            if (object4 != null && (n16 = (object4 = (Collection)object4).isEmpty() ^ n10) == n10) {
                Intrinsics.checkNotNullParameter(object2, "container");
                Intrinsics.checkNotNullParameter(d2, "parent");
                Intrinsics.checkNotNullParameter(object, "banner");
                Intrinsics.checkNotNullParameter(object3, "screenInfo");
                object4 = ((Banner)object).getHotspots();
                if (object4 != null) {
                    object4 = ((Iterable)object4).iterator();
                    while ((n4 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                        int n17;
                        object6 = (Hotspot)object4.next();
                        object7 = HomeDataUtil.INSTANCE;
                        object5 = ((Hotspot)object6).getWidth();
                        Double d5 = ((Hotspot)object6).getHeight();
                        object5 = ((HomeDataUtil)object7).getChildViewDimens((Double)object5, d5, (ScreenInfo)object3);
                        d5 = ((Hotspot)object6).getX();
                        Double d7 = ((Hotspot)object6).getY();
                        object7 = ((HomeDataUtil)object7).getViewPos(d5, d7, (ScreenInfo)object3);
                        d7 = object2.getContext();
                        d5 = new View((Context)d7);
                        ai0_2.m((View)d5);
                        int n18 = ((ScreenInfo)object5).getWidth();
                        n14 = ((ScreenInfo)object5).getHeight();
                        int n19 = V81.a;
                        V81.a = n17 = n19 + 1;
                        d5.setId(n19);
                        ai0_2.m((View)d5);
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n18, n14);
                        ai0_2.m((View)object2);
                        object2.addView((View)d5, layoutParams);
                        object5 = new b();
                        ((b)object5).e((ConstraintLayout)((Object)object2));
                        int n20 = d5.getId();
                        int n21 = d2.getId();
                        int n22 = ((PositionInfo)object7).getX();
                        ((b)object5).g(n20, 6, n21, 6, n22);
                        n20 = d5.getId();
                        n21 = d2.getId();
                        n22 = ((PositionInfo)object7).getY();
                        int n24 = 3;
                        int n25 = 3;
                        ((b)object5).g(n20, n24, n21, n25, n22);
                        ((b)object5).b((ConstraintLayout)((Object)object2));
                        object5 = zv_12.d;
                        object7 = new T81((Av)object5, (Banner)object, n7, (Hotspot)object6);
                        d5.setOnClickListener((View.OnClickListener)object7);
                    }
                }
            }
        } else {
            object2 = new yv_1(zv_12, (Banner)object, n7);
            layoutInflater.setOnClickListener((View.OnClickListener)object2);
        }
        viewGroup2.addView((View)layoutInflater);
        return layoutInflater;
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


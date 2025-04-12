/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ril.ajio.pdprefresh.view.BasePDPNewAjioView;
import com.ril.ajio.pdprefresh.view.PDPAssuredGiftView;
import com.ril.ajio.pdprefresh.view.PDPInviteView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Uh2
 */
public final class uh2_1
extends Uk2 {
    public final uh2_0 c;
    public final ArrayList d;
    public final float e;
    public final hq_0 f;
    public final boolean g;
    public final int h;

    public uh2_1(uh2_0 uh2_02, ArrayList arrayList, float f5, hq_0 hq_02, boolean bl2) {
        int n3;
        Intrinsics.checkNotNullParameter(uh2_02, "referralWidgetInfo");
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        Intrinsics.checkNotNullParameter(hq_02, "onAssuredGiftClickListener");
        this.c = uh2_02;
        this.d = arrayList;
        this.e = f5;
        this.f = hq_02;
        this.g = bl2;
        this.h = n3 = arrayList.size();
    }

    public final void a(ViewGroup viewGroup, int n3, Object object) {
        Intrinsics.checkNotNullParameter(viewGroup, "collection");
        Intrinsics.checkNotNullParameter(object, "view");
        object = (View)object;
        viewGroup.removeView((View)object);
    }

    public final int c() {
        int n3 = this.h;
        int n4 = 1;
        if (n3 > n4) {
            n3 = -1 >>> 1;
        }
        return n3;
    }

    public final Object f(int n3, ViewGroup viewGroup) {
        BasePDPNewAjioView basePDPNewAjioView;
        Intrinsics.checkNotNullParameter(viewGroup, "collection");
        Object object = this.d;
        Object object2 = ((ArrayList)object).get(n3 %= 2);
        String string2 = "AssuredGift";
        boolean bl2 = Intrinsics.areEqual(object2, string2);
        boolean bl3 = this.g;
        String string3 = "getContext(...)";
        if (bl2) {
            object = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(object, string3);
            basePDPNewAjioView = new PDPAssuredGiftView((Context)object);
            basePDPNewAjioView.b = bl3;
            object = this.f;
            basePDPNewAjioView.setListener((hq_0)object);
            basePDPNewAjioView.setData();
        } else {
            basePDPNewAjioView = ((ArrayList)object).get(n3);
            if ((n3 = (int)(Intrinsics.areEqual((Object)basePDPNewAjioView, object = "InviteFlow") ? 1 : 0)) != 0) {
                object = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object2 = this.c;
                basePDPNewAjioView = new PDPInviteView((Context)object, (uh2_0)object2);
                ((PDPInviteView)basePDPNewAjioView).k = bl3;
                float f5 = this.e;
                ((PDPInviteView)basePDPNewAjioView).setAmount(f5);
                ((PDPInviteView)basePDPNewAjioView).setData();
            } else {
                n3 = 0;
                basePDPNewAjioView = null;
            }
        }
        viewGroup.addView((View)basePDPNewAjioView);
        Intrinsics.checkNotNull((Object)basePDPNewAjioView);
        return basePDPNewAjioView;
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


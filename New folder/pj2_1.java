/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasImageHolder;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder;
import com.ril.ajio.pdprefresh.view.BasePDPNewAjioView;
import com.ril.ajio.services.data.Product.fleek.PostsResponse;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Media;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pj2
 */
public final class pj2_1
extends Uk2 {
    public final yi2_1 c;
    public final ma_2 d;
    public final bf3_1 e;
    public final yh2_1 f;
    public final SparseArray g;
    public final List h;
    public final Integer i;

    public pj2_1(yi2_1 object, ma_2 object2, bf3_1 bf3_12, yh2_1 yh2_12) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(object2, "ajioVideoPlayer");
        Intrinsics.checkNotNullParameter(bf3_12, "stylishIdeasCallback");
        String string2 = "adapter";
        Intrinsics.checkNotNullParameter(yh2_12, string2);
        this.c = object;
        this.d = object2;
        this.e = bf3_12;
        this.f = yh2_12;
        this.g = object2;
        object2 = null;
        if (object != null && (object = object.N6()) != null) {
            object = ((PostsResponse)object).getComponents();
        } else {
            n3 = 0;
            object = null;
        }
        this.h = object;
        if (object != null) {
            n3 = object.size();
            object2 = n3;
        }
        this.i = object2;
    }

    public final void a(ViewGroup viewGroup, int n3, Object object) {
        Intrinsics.checkNotNullParameter(viewGroup, "collection");
        Intrinsics.checkNotNullParameter(object, "view");
        this.g.remove(n3);
        object = (View)object;
        viewGroup.removeView((View)object);
    }

    public final int c() {
        int n3;
        Integer n4 = this.i;
        if (n4 != null) {
            n3 = n4;
        } else {
            n3 = 0;
            n4 = null;
        }
        return n3;
    }

    public final Object f(int n3, ViewGroup viewGroup) {
        boolean bl2;
        Object object;
        Intrinsics.checkNotNullParameter(viewGroup, "collection");
        Object object2 = this.h;
        Object object3 = null;
        if (object2 != null && (object = (PostsResponse$Component)object2.get(n3)) != null && (object = ((PostsResponse$Component)object).getSubcomponent()) != null && (object = (PostsResponse$Component$Subcomponent)CollectionsKt.firstOrNull((List)object)) != null && (object = ((PostsResponse$Component$Subcomponent)object).getMedia()) != null && (object = (PostsResponse$Component$Subcomponent$Media)CollectionsKt.firstOrNull((List)object)) != null) {
            object = ((PostsResponse$Component$Subcomponent$Media)object).getMediaType();
        } else {
            bl2 = false;
            object = null;
        }
        bl2 = Intrinsics.areEqual(object, "IMAGE");
        Object object4 = "getContext(...)";
        if (bl2) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, (String)object4);
            if (object2 != null) {
                object3 = object2 = object2.get(n3);
                object3 = (PostsResponse$Component)object2;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            object2 = this.c;
            Intrinsics.checkNotNullParameter(object2, "pdpInfoProvider");
            object4 = this.e;
            String string2 = "stylishIdeasCallback";
            Intrinsics.checkNotNullParameter(object4, string2);
            object = new BasePDPNewAjioView(context);
            ((PDPStylingIdeasImageHolder)((Object)object)).d = object3;
            ((PDPStylingIdeasImageHolder)((Object)object)).e = object4;
            ((PDPStylingIdeasImageHolder)((Object)object)).setPdpInfoProvider((yi2_1)object2);
            ((PDPStylingIdeasImageHolder)((Object)object)).g = n3;
            ((PDPStylingIdeasImageHolder)((Object)object)).a(context);
            ((PDPStylingIdeasImageHolder)((Object)object)).setData();
        } else {
            PDPStylingIdeasVideoHolder pDPStylingIdeasVideoHolder;
            object = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
            object4 = object2 != null ? (object2 = (PostsResponse$Component)CollectionsKt.N(n3, (List)object2)) : null;
            Object object5 = this.c;
            Object object6 = this.d;
            bf3_1 bf3_12 = this.e;
            yh2_1 yh2_12 = this.f;
            object2 = pDPStylingIdeasVideoHolder;
            object3 = object;
            object = object5;
            object5 = object6;
            object6 = bf3_12;
            pDPStylingIdeasVideoHolder = new PDPStylingIdeasVideoHolder((Context)object3, (yi2_1)object, (PostsResponse$Component)object4, (ma_2)object5, bf3_12, n3, yh2_12);
            pDPStylingIdeasVideoHolder.setData();
            object = pDPStylingIdeasVideoHolder;
        }
        this.g.put(n3, object);
        viewGroup.addView((View)object);
        return object;
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


/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.stl.fragment.ShopTheLookFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from D33$a
 */
public final class d33$a_0
implements fs0_2 {
    public final /* synthetic */ ShopTheLookFragment a;

    public d33$a_0(ShopTheLookFragment shopTheLookFragment) {
        this.a = shopTheLookFragment;
    }

    public final Object emit(Object object, f80_0 object2) {
        int n3;
        int n4;
        String string2;
        boolean bl2;
        object = (HashMap)object;
        object2 = mz0_2.a;
        Object object3 = ((HashMap)object).entrySet().iterator();
        while (bl2 = object3.hasNext()) {
            object2 = object3.next();
            string2 = "next(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object2 = (List)object2.getValue();
        }
        object3 = this.a;
        ((ShopTheLookFragment)object3).Ra().getClass();
        ArrayList arrayList = e43_0.d(object2);
        object2 = ((ShopTheLookFragment)object3).f;
        bl2 = false;
        string2 = null;
        Object object4 = "shopTheLookBannerDetailsAdapter";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n4 = 0;
            object2 = null;
        }
        object2.getClass();
        Intrinsics.checkNotNullParameter(arrayList, "productList");
        ((w33)object2).b = arrayList;
        object2 = ((ShopTheLookFragment)object3).a;
        Object object5 = "stlHomeRv";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n4 = 0;
            object2 = null;
        }
        n4 = ShopTheLookFragment.Pa((RecyclerView)object2);
        Object object6 = ((ShopTheLookFragment)object3).f;
        if (object6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object6 = null;
        }
        ((RecyclerView$f)object6).notifyItemChanged(n4);
        object = ((HashMap)object).keySet();
        Intrinsics.checkNotNullExpressionValue(object, "<get-keys>(...)");
        object = CollectionsKt.K((Iterable)object);
        object4 = new Pair(object, arrayList);
        int n7 = 1;
        object = new Pair[n7];
        object[0] = object4;
        object = fh1_2.h((Pair[])object);
        object4 = ((ShopTheLookFragment)object3).Ra();
        object4.getClass();
        object6 = "bannerProductsMap";
        Intrinsics.checkNotNullParameter(object, (String)object6);
        object4 = ((e43_0)object4).c;
        ((HashMap)object4).putAll(object);
        ShopTheLookFragment.Oa((ShopTheLookFragment)object3, n4);
        object = eb_2.a;
        object = ((ShopTheLookFragment)object3).e;
        object2 = "bannersList";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object = null;
        }
        if ((object4 = ((ShopTheLookFragment)object3).a) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object4 = null;
        }
        if ((object = ((BannerData)object.get(n3 = ShopTheLookFragment.Pa((RecyclerView)object4))).getDynamicPageMetadata()) != null) {
            object = ((DynamicPageMetadata)object).getDuration();
        } else {
            n7 = 0;
            object = null;
        }
        n7 = (int)(eb_2.d((Long)object) ? 1 : 0);
        int n8 = 3;
        object4 = "products";
        if (n7 != 0) {
            object = ((ShopTheLookFragment)object3).Ra();
            object6 = ((ShopTheLookFragment)object3).e;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object6 = null;
            }
            if ((object2 = ((ShopTheLookFragment)object3).a) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n4 = 0;
                object2 = null;
            }
            n4 = ShopTheLookFragment.Pa((RecyclerView)object2);
            object5 = object2 = object6.get(n4);
            object5 = (BannerData)object2;
            object2 = ((ShopTheLookFragment)object3).Qa();
            long l2 = object2 != null ? ((b33_0)object2).J : 0L;
            object.getClass();
            Intrinsics.checkNotNullParameter(arrayList, (String)object4);
            Intrinsics.checkNotNullParameter(object5, "bannerData");
            object = md3_0.c((jD3)object);
            object4 = object2;
            object2 = new a43_0(arrayList, (BannerData)object5, l2, null);
            Ae3.d((i90_0)object, null, null, (Function2)object2, n8);
        } else {
            object = ((ShopTheLookFragment)object3).Ra();
            object.getClass();
            Intrinsics.checkNotNullParameter(arrayList, (String)object4);
            object = md3_0.c((jD3)object);
            object2 = new z33_0(arrayList, null);
            Ae3.d((i90_0)object, null, null, (Function2)object2, n8);
        }
        return Unit.a;
    }
}


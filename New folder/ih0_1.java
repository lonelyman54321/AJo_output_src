/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.pdprefresh.fragments.d;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.reviewRatings.ImageMap;
import com.ril.ajio.services.data.reviewRatings.LargeSize;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import com.ril.ajio.services.data.reviewRatings.Thumbnail;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ih0
 */
public final class ih0_1
implements Function0 {
    public final /* synthetic */ lt1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ d c;

    public /* synthetic */ ih0_1(lt1 lt12, int n3, d d2) {
        this.a = lt12;
        this.b = n3;
        this.c = d2;
    }

    public final Object invoke() {
        Object object;
        int n3;
        Object object2;
        int n4;
        boolean bl2;
        Object object3;
        ArrayList arrayList;
        int n7;
        ih0_1 ih0_12 = this;
        int n8 = 1;
        Object object4 = this.a;
        Intrinsics.checkNotNullParameter(object4, "$review");
        d d2 = this.c;
        Intrinsics.checkNotNullParameter(d2, "this$0");
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        Object object5 = rz3_0.Companion;
        Object object6 = (wk1_0)((lt1)object4).d.getValue();
        object5.getClass();
        Intrinsics.checkNotNullParameter(object6, "reviewList");
        object5 = new ArrayList();
        Object object7 = new LinkedHashMap();
        object6.getClass();
        Object object8 = new X0$b((x0_0)object6);
        while ((n7 = ((X0$b)object8).hasNext()) != 0) {
            object6 = (ProductReview)((X0$b)object8).next();
            if (object6 == null) continue;
            arrayList = new ArrayList();
            object3 = ((ProductReview)object6).getReviewId();
            bl2 = object7.containsKey(object3);
            if (bl2) {
                arrayList = ((ProductReview)object6).getReviewId();
                if ((arrayList = (ArrayList)((LinkedHashMap)object7).get(arrayList)) == null) continue;
                arrayList.add(object6);
                continue;
            }
            arrayList.add(object6);
            if ((object6 = ((ProductReview)object6).getReviewId()) == null) continue;
            n7 = ((Number)object6).intValue();
            object6 = n7;
            object6 = ((AbstractMap)object7).put(object6, arrayList);
        }
        object6 = ((LinkedHashMap)object7).entrySet().iterator();
        while (true) {
            n4 = object6.hasNext();
            arrayList = null;
            if (n4 == 0) break;
            object8 = (ArrayList)object6.next().getValue();
            object2 = (ProductReview)CollectionsKt.N(0, (List)object8);
            int n10 = ((ArrayList)object8).size();
            for (int i3 = 1; i3 < n10; i3 += n8) {
                boolean bl3;
                Object object9;
                Object object10 = (ProductReview)CollectionsKt.N(i3, (List)object8);
                Object object11 = object10 != null && (object10 = ((ProductReview)object10).getImageMap()) != null && (object10 = ((ImageMap)object10).getThumbnail()) != null && (object10 = (Thumbnail)CollectionsKt.N(0, (List)object10)) != null ? (object10 = ((Thumbnail)object10).getImageId()) : null;
                object10 = (ProductReview)CollectionsKt.N(i3, (List)object8);
                Object object12 = object10 != null && (object10 = ((ProductReview)object10).getImageMap()) != null && (object10 = ((ImageMap)object10).getThumbnail()) != null && (object10 = (Thumbnail)CollectionsKt.N(0, (List)object10)) != null ? (object10 = ((Thumbnail)object10).getImageUrl()) : null;
                object10 = (ProductReview)CollectionsKt.N(i3, (List)object8);
                Object object13 = object10 != null && (object10 = ((ProductReview)object10).getImageMap()) != null && (object10 = ((ImageMap)object10).getThumbnail()) != null && (object10 = (Thumbnail)CollectionsKt.N(0, (List)object10)) != null ? (object10 = ((Thumbnail)object10).getParentImageId()) : null;
                int n14 = 2;
                object10 = object9;
                object3 = object9;
                object9 = object11;
                object11 = null;
                ((Thumbnail)object10)((Integer)object9, null, (String)object12, (String)object13, n14, null);
                object9 = (ProductReview)CollectionsKt.N(i3, (List)object8);
                Object object14 = object9 != null && (object9 = ((ProductReview)object9).getImageMap()) != null && (object9 = ((ImageMap)object9).getThumbnail()) != null && (object9 = (Thumbnail)CollectionsKt.N(0, (List)object9)) != null ? (object9 = ((Thumbnail)object9).getImageId()) : null;
                object9 = (ProductReview)CollectionsKt.N(i3, (List)object8);
                Object object15 = object9 != null && (object9 = ((ProductReview)object9).getImageMap()) != null && (object9 = ((ImageMap)object9).getThumbnail()) != null && (object9 = (Thumbnail)CollectionsKt.N(0, (List)object9)) != null ? (object9 = ((Thumbnail)object9).getImageUrl()) : null;
                int n15 = 2;
                object10 = new LargeSize((Integer)object14, null, (String)object15, n15, null);
                if (object2 != null && (object9 = ((ProductReview)object2).getImageMap()) != null && (object9 = ((ImageMap)object9).getThumbnail()) != null && !(bl3 = ((ArrayList)object9).contains(object3)) && (object9 = ((ProductReview)object2).getImageMap()) != null && (object9 = ((ImageMap)object9).getThumbnail()) != null) {
                    ((ArrayList)object9).add(object3);
                }
                if (object2 == null || (object3 = ((ProductReview)object2).getImageMap()) == null || (object3 = ((ImageMap)object3).getLargeSize()) == null || (bl2 = ((ArrayList)object3).contains(object10)) || (object3 = ((ProductReview)object2).getImageMap()) == null || (object3 = ((ImageMap)object3).getLargeSize()) == null) continue;
                ((ArrayList)object3).add(object10);
            }
            if (object2 == null) continue;
            ((ArrayList)object5).add(object2);
        }
        ((LinkedHashMap)object7).clear();
        n7 = ((ArrayList)object5).size();
        object7 = null;
        for (n3 = 0; n3 < n7; n3 += n8) {
            object8 = (ProductReview)((ArrayList)object5).get(n3);
            object3 = rz3_0.Companion;
            Intrinsics.checkNotNull(object8);
            object3.getClass();
            object8 = Rz3$a.f((ProductReview)object8);
            arrayList2.add(object8);
        }
        object5 = LD2.a;
        n7 = ih0_12.b;
        object5 = (ProductReview)((lt1)object4).b(n7);
        object5 = object5 != null ? ((ProductReview)object5).getReviewId() : null;
        object5 = String.valueOf(object5);
        object7 = d2.g;
        if (object7 != null) {
            object7 = ((Product)object7).getCode();
        } else {
            n3 = 0;
            object7 = null;
        }
        object8 = d2.g;
        if (object8 != null) {
            object8 = ((Product)object8).getName();
        } else {
            n4 = 0;
            object8 = null;
        }
        object3 = d2.g;
        if (object3 != null) {
            object3 = ((Product)object3).getBrickCode();
        } else {
            bl2 = false;
            object3 = null;
        }
        object2 = "review photos - viewed";
        LD2.c((String)object2, (String)object5, (String)object7, (String)object8, (String)object3);
        object5 = d2.getActivity();
        if (object5 != null && (object5 = ((FragmentActivity)object5).getSupportFragmentManager()) != null && (object = (ProductReview)((lt1)object4).b(n3 = ((wk1_0)(object7 = (wk1_0)((lt1)object4).d.getValue())).a() - n8)) != null && (object = ((ProductReview)object).getPageNumber()) != null) {
            n3 = ((Number)object).intValue();
            object = (ProductReview)((lt1)object4).b(0);
            if (object != null && (object = ((ProductReview)object).getTotalPages()) != null) {
                n4 = ((Number)object).intValue();
                object = EO2.Companion;
                object3 = d2.h;
                int n16 = 20;
                object2 = n16;
                Product product = d2.g;
                object.getClass();
                arrayList = null;
                object = EO2$a.a(arrayList2, n7, n3, n4, false, (String)object3, (Integer)object2, product);
                object4 = "ReviewImageBottomSheet";
                ((DialogFragment)object).show((FragmentManager)object5, (String)object4);
            }
        }
        d2.dismiss();
        return Unit.a;
    }
}


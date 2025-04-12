/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import com.ril.ajio.services.data.fleek.feedModel.PostData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Nd3
 */
public final class nd3_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ld3_1 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ RecyclerView d;
    public final /* synthetic */ PostData e;

    public nd3_2(ld3_1 ld3_12, ArrayList arrayList, RecyclerView recyclerView, PostData postData, f80_0 f80_02) {
        this.b = ld3_12;
        this.c = arrayList;
        this.d = recyclerView;
        this.e = postData;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.c;
        List list = object2;
        list = (ArrayList)object2;
        ld3_1 ld3_12 = this.b;
        RecyclerView recyclerView = this.d;
        PostData postData = this.e;
        object2 = object;
        object = new nd3_2(ld3_12, (ArrayList)list, recyclerView, postData, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nd3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nd3_2)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var1_6;
        Object object2;
        Object object3;
        Object object4 = j90_0.COROUTINE_SUSPENDED;
        boolean bl2 = this.a;
        boolean bl3 = true;
        ld3_1 ld3_12 = this.b;
        if (bl2) {
            if (bl2 != bl3) {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw illegalStateException;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            ld3$a_0 ld3$a_0 = ld3_1.Companion;
            e43_0 e43_02 = ld3_12.Qa();
            object2 = object3 = this.c;
            object2 = (Iterable)object3;
            int n3 = 63;
            object3 = CollectionsKt.R((Iterable)object2, null, null, null, null, n3);
            this.a = bl3;
            object2 = null;
            Object object5 = e43_02.e((String)object3, false, this);
            if (object5 == object4) {
                return object4;
            }
        }
        dl2_2 dl2_22 = (dl2_2)var1_6;
        object4 = dl2_22.a;
        boolean bl4 = ((cl2_2)object4).d();
        object3 = this.d;
        if (bl4) {
            void var1_11;
            int n4;
            RecentlyViewedProducts recentlyViewedProducts = (RecentlyViewedProducts)dl2_22.b;
            bl4 = false;
            object4 = null;
            if (recentlyViewedProducts != null) {
                List list = recentlyViewedProducts.getProducts();
            } else {
                n4 = 0;
                Object var1_10 = null;
            }
            object2 = ld3_1.Companion;
            ld3_12.Ya((RecyclerView)object3, bl3, (List)var1_11);
            object3 = nu1_0.a(ld3_12);
            object2 = this.e;
            Nd3$a nd3$a = new Nd3$a(ld3_12, (PostData)object2, (List)var1_11, null);
            n4 = 3;
            Ae3.d((i90_0)object3, null, null, nd3$a, n4);
        } else {
            ShimmerFrameLayout shimmerFrameLayout = ld3_12.r;
            if (shimmerFrameLayout != null) {
                ai0_2.i((View)shimmerFrameLayout);
            }
            ld3_12.Sa((RecyclerView)object3);
        }
        ShimmerFrameLayout shimmerFrameLayout = ld3_12.r;
        if (shimmerFrameLayout != null) {
            ai0_2.i((View)shimmerFrameLayout);
        }
        return Unit.a;
    }
}


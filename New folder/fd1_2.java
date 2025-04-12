/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.BrandCategoryData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fD1
 */
public final class fd1_2
implements F62 {
    public final /* synthetic */ gd1_2 a;

    public /* synthetic */ fd1_2(gd1_2 gd1_22) {
        this.a = gd1_22;
    }

    public final void onChanged(Object object) {
        int n3;
        object = (DataCallback)object;
        gd1_2 gd1_22 = this.a;
        Intrinsics.checkNotNullParameter(gd1_22, "this$0");
        Object object2 = gd1_22.g;
        if (object2 != null) {
            object2.stopLoader();
        }
        if ((n3 = nn_2.b((cp$a)(object2 = cp_1.Companion), (DataCallback)object)) != 0 && object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
            gd1_22.h = object = (BrandCategoryData)((DataCallback)object).getData();
            gd1_22.Oa();
        }
    }
}


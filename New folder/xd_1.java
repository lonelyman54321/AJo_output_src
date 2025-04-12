/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.BrandItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xd
 */
public final class xd_1
implements Function1 {
    public final /* synthetic */ BrandItemData a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ yT1 d;

    public /* synthetic */ xd_1(BrandItemData brandItemData, dr0_0 dr0_02, p83_0 p83_02, yT1 yT12) {
        this.a = brandItemData;
        this.b = dr0_02;
        this.c = p83_02;
        this.d = yT12;
    }

    public final Object invoke(Object object) {
        object = (BrandItemData)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$item");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$fleekViewModel");
        yT1 yT12 = this.d;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        Intrinsics.checkNotNullParameter(object, "it");
        Object object4 = sq0_1.a;
        object2 = ((BrandItemData)object2).getName();
        object4 = "";
        if (object2 == null) {
            object2 = object4;
        }
        object3 = (String)((dr0_0)object3).M0.a.getValue();
        int n3 = this.c.size();
        String string2 = String.valueOf(n3);
        Intrinsics.checkNotNullParameter(object2, "label");
        Intrinsics.checkNotNullParameter("brand click", "action");
        Intrinsics.checkNotNullParameter(object3, "searchTerm");
        Intrinsics.checkNotNullParameter(string2, "customMetric");
        c80 c802 = sq0_1.d;
        qq0_2 qq0_22 = new qq0_2((String)object2, (String)object3, string2, null);
        int n4 = 3;
        Ae3.d(c802, null, null, qq0_22, n4);
        object2 = ((BrandItemData)object).getName();
        if (object2 != null) {
            object4 = object2;
        }
        sq0_1.g((String)object4, "logo");
        object2 = ((BrandItemData)object).getId();
        ((BrandItemData)object).getCode();
        dr0_0.G((String)object2, yT12);
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iH0
 */
public final class ih0_0
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ yT1 b;

    public /* synthetic */ ih0_0(dr0_0 dr0_02, yT1 yT12) {
        this.a = dr0_02;
        this.b = yT12;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3;
        object = (ResourceOwner)object;
        object2 = (String)object2;
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        Object object4 = sq0_1.a;
        object4 = "";
        if (object2 == null) {
            object2 = object4;
        }
        if (object == null || (object3 = ((ResourceOwner)object).getName()) == null) {
            object3 = object4;
        }
        String string2 = null;
        String string3 = object != null ? ((ResourceOwner)object).getName() : null;
        Intrinsics.checkNotNullParameter(object2, "themeName");
        Intrinsics.checkNotNullParameter(object3, "brandName");
        c80 c802 = sq0_1.d;
        mq0_1 mq0_12 = new mq0_1((String)object2, (String)object3, string3, null);
        int n3 = 3;
        Ae3.d(c802, null, null, mq0_12, n3);
        if (object != null && (object2 = ((ResourceOwner)object).getName()) != null) {
            object4 = object2;
        }
        object2 = "logo";
        sq0_1.g((String)object4, (String)object2);
        if (object != null) {
            string2 = ((ResourceOwner)object).getId();
        }
        if (object != null) {
            ((ResourceOwner)object).getCode();
        }
        dr0_02.getClass();
        dr0_0.G(string2, yT12);
        return Unit.a;
    }
}


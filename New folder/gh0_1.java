/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gH0
 */
public final class gh0_1
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ gh0_1(Component component, int n3, dr0_0 dr0_02) {
        this.a = component;
        this.b = n3;
        this.c = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Integer)object;
        int n3 = (Integer)object;
        object2 = (Subcomponent)object2;
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Intrinsics.checkNotNullParameter(object2, "subComponent");
        int n4 = 0;
        wq0_0 wq0_02 = new wq0_0(0);
        Object object3 = this.a;
        String string2 = ((Component)object3).getHeading();
        Object object4 = "";
        if (string2 == null) {
            string2 = object4;
        }
        wq0_02.a = string2;
        if ((object3 = ((Component)object3).getHeading()) != null) {
            object4 = object3;
        }
        wq0_02.b = object3 = "fleek_insert_brand_discover_menu_".concat((String)object4);
        object2 = ((Subcomponent)object2).getResourceOwner();
        object2 = object2 != null ? ((ResourceOwner)object2).getName() : null;
        wq0_02.c = object2;
        object2 = new StringBuilder();
        n4 = this.b;
        wq0_02.d = object = Xd0.a("|", n4, n3, (StringBuilder)object2);
        dr0_02.k(wq0_02);
        return Unit.a;
    }
}


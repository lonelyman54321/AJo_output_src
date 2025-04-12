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
 * Renamed from bH0
 */
public final class bh0_2
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ yT1 d;

    public /* synthetic */ bh0_2(Component component, int n3, dr0_0 dr0_02, yT1 yT12) {
        this.a = component;
        this.b = n3;
        this.c = dr0_02;
        this.d = yT12;
    }

    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        Object object3;
        Object object4;
        object = (Subcomponent)object;
        object2 = (Integer)object2;
        int n3 = (Integer)object2;
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.d;
        Object object5 = "$fleekAppNavigationController";
        Intrinsics.checkNotNullParameter(yT12, (String)object5);
        if (object == null || (object5 = ((Subcomponent)object).getResourceOwner()) == null || (object5 = ((ResourceOwner)object5).getName()) == null) {
            object5 = "";
        }
        String string2 = "fleek_insert_productonly_".concat((String)object5);
        if (object != null && (object4 = ((Subcomponent)object).getResourceOwner()) != null) {
            object4 = ((ResourceOwner)object4).isFollowed();
            object3 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object4, object3);
        } else {
            bl2 = false;
            object4 = null;
        }
        object4 = bl2 ? "following" : "follow";
        object3 = this.a.getHeading();
        String string3 = " - ";
        object4 = n1.a((String)object3, string3, (String)object4);
        object3 = sq0_1.a;
        object3 = new StringBuilder();
        int n4 = this.b;
        String string4 = "|";
        object2 = Xd0.a(string4, n4, n3, (StringBuilder)object3);
        sq0_1.h((String)object5, string2, (String)object4, (String)object2);
        n3 = 0;
        object2 = null;
        object5 = object != null && (object5 = ((Subcomponent)object).getResourceOwner()) != null ? ((ResourceOwner)object5).getName() : null;
        string2 = "logo";
        sq0_1.g((String)object5, string2);
        if (object != null && (object5 = ((Subcomponent)object).getResourceOwner()) != null) {
            object2 = ((ResourceOwner)object5).getId();
        }
        if (object != null && (object = ((Subcomponent)object).getResourceOwner()) != null) {
            ((ResourceOwner)object).getCode();
        }
        dr0_02.getClass();
        dr0_0.G((String)object2, yT12);
        return Unit.a;
    }
}


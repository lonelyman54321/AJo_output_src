/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class WG0
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ WG0(Component component, int n3, dr0_0 dr0_02) {
        this.a = component;
        this.b = n3;
        this.c = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        Object object3;
        object = (Integer)object;
        int n3 = (Integer)object;
        object2 = (Subcomponent)object2;
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Intrinsics.checkNotNullParameter(object2, "subComponent");
        Object object4 = ((Subcomponent)object2).getResourceOwner();
        if (object4 == null || (object4 = ((ResourceOwner)object4).getName()) == null) {
            object4 = "";
        }
        String string2 = "fleek_insert_contentonly_".concat((String)object4);
        if ((object2 = ((Subcomponent)object2).getResourceOwner()) != null) {
            object2 = ((ResourceOwner)object2).isFollowed();
            object3 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object2, object3);
        } else {
            bl2 = false;
            object2 = null;
        }
        object2 = bl2 ? "following" : "follow";
        object2 = n1.a(this.a.getHeading(), " - ", (String)object2);
        object3 = new wq0_0(0);
        ((wq0_0)object3).a = object4;
        ((wq0_0)object3).b = string2;
        ((wq0_0)object3).c = object2;
        object2 = new StringBuilder();
        int n4 = this.b;
        ((wq0_0)object3).d = object = Xd0.a("|", n4, n3, (StringBuilder)object2);
        dr0_02.k((wq0_0)object3);
        return Unit.a;
    }
}


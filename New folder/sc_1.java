/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sC
 */
public final class sc_1
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ yp0_0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ sc_1(dr0_0 dr0_02, Component component, c80 c802, yp0_0 yp0_02, String string2, String string3) {
        this.a = dr0_02;
        this.b = component;
        this.c = c802;
        this.d = yp0_02;
        this.e = string2;
        this.f = string3;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        i90_0 i90_02 = this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        yp0_0 yp0_02 = this.d;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        Object object2 = this.b;
        Object object3 = ((Component)object2).getSubcomponents();
        if (object3 != null && (object3 = (Subcomponent)CollectionsKt.firstOrNull((List)object3)) != null && (object3 = ((Subcomponent)object3).getResourceOwner()) != null) {
            ((ResourceOwner)object3).getName();
        }
        object.getClass();
        object3 = z40_0.Companion;
        object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a.b("fleek_share_brand_message");
        Object object4 = ((Component)object2).getSubcomponents();
        object4 = object4 != null && (object4 = (Subcomponent)CollectionsKt.firstOrNull((List)object4)) != null && (object4 = ((Subcomponent)object4).getResourceOwner()) != null ? ((ResourceOwner)object4).getId() : null;
        object4 = kp1_0.c("https://www.ajiogram.ajio.com/brand/", (String)object4);
        Object object5 = ((Component)object2).getSubcomponents();
        object5 = object5 != null && (object5 = (Subcomponent)CollectionsKt.firstOrNull((List)object5)) != null && (object5 = ((Subcomponent)object5).getResourceOwner()) != null ? ((ResourceOwner)object5).getId() : null;
        String string2 = "BRAND_PAGE";
        object5 = dr0_0.n((String)object5, string2);
        object2 = ((Component)object2).getSubcomponents();
        object2 = object2 != null && (object2 = (Subcomponent)CollectionsKt.firstOrNull((List)object2)) != null && (object2 = ((Subcomponent)object2).getResourceOwner()) != null ? ((ResourceOwner)object2).getLogo() : null;
        ((dr0_0)object).c0((String)object3, (String)object4, (ShareActionRequestBody)object5, (String)object2);
        object2 = this.e;
        object3 = this.f;
        object = new yc_2(yp0_02, (String)object2, (String)object3, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}


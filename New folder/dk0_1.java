/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dK0
 */
public final class dk0_1
implements Function0 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ dk0_1(dr0_0 dr0_02, Component component, String string2, String string3) {
        this.a = component;
        this.b = dr0_02;
        this.c = string2;
        this.d = string3;
    }

    public final Object invoke() {
        int n3;
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Component component = this.a;
        Object object2 = component.getSubcomponent();
        Object object3 = null;
        object2 = object2 != null && (object2 = (Subcomponent)CollectionsKt.firstOrNull((List)object2)) != null && (object2 = ((Subcomponent)object2).getCta()) != null ? ((Cta)object2).getRedirectionUrl() : null;
        Object object4 = this.c;
        Object object5 = "FEED";
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            Object object6 = component.getSubComponentsOwner();
            if (object6 != null) {
                object6 = ((SubcomponentsOwner)object6).getName();
            } else {
                n3 = 0;
                object6 = null;
            }
            object.getClass();
            object6 = dr0_0.m((String)object6);
            object4 = dr0_0.n((String)object4, (String)object5);
            object5 = component.getSubComponentsOwner();
            if (object5 != null) {
                object3 = ((SubcomponentsOwner)object5).getLogo();
            }
            ((dr0_0)object).c0((String)object6, (String)object2, (ShareActionRequestBody)object4, (String)object3);
        } else {
            object2 = component.getSubComponentsOwner();
            object2 = object2 != null ? ((SubcomponentsOwner)object2).getName() : null;
            object.getClass();
            object2 = dr0_0.m((String)object2);
            Object object7 = component.getSubComponentsOwner();
            if (object7 != null) {
                object7 = ((SubcomponentsOwner)object7).getId();
            } else {
                n3 = 0;
                object7 = null;
            }
            Object object8 = component.getSubComponentsOwner();
            object8 = object8 != null ? ((SubcomponentsOwner)object8).getCode() : null;
            String string2 = "https://www.ajiogram.ajio.com/s/";
            String string3 = "?brandPageCode=";
            object7 = UX.c(string2, (String)object7, string3, (String)object8);
            object4 = dr0_0.n((String)object4, (String)object5);
            object5 = component.getSubComponentsOwner();
            if (object5 != null) {
                object3 = ((SubcomponentsOwner)object5).getLogo();
            }
            ((dr0_0)object).c0((String)object2, (String)object7, (ShareActionRequestBody)object4, (String)object3);
        }
        object2 = pp0_0.a;
        object2 = this.d;
        object3 = "";
        if (object2 == null) {
            object2 = object3;
        }
        object.getClass();
        object = dr0_0.x(component);
        if (object != null) {
            object3 = object;
        }
        pp0_0.c((String)object2, (String)object3);
        return Unit.a;
    }
}


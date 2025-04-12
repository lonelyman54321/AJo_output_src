/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sK0
 */
public final class sk0_2
implements Function0 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ sk0_2(dr0_0 dr0_02, Activity activity, Component component) {
        this.a = component;
        this.b = activity;
        this.c = dr0_02;
    }

    public final Object invoke() {
        boolean bl2;
        Object object = this.c;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Object object2 = this.a;
        Object object3 = ((Component)object2).getSubcomponent();
        String string2 = null;
        object3 = object3 != null && (object3 = (Subcomponent)CollectionsKt.firstOrNull((List)object3)) != null && (object3 = ((Subcomponent)object3).getCta()) != null ? ((Cta)object3).getRedirectionUrl() : null;
        Object object4 = this.b;
        if (object3 != null && (bl2 = ((String)object3).length())) {
            object = new Bundle();
            Object object5 = ((Component)object2).getSubComponentsOwner();
            if (object5 != null) {
                object5 = ((SubcomponentsOwner)object5).getCode();
            } else {
                bl2 = false;
                object5 = null;
            }
            object2 = ((Component)object2).getSubComponentsOwner();
            if (object2 != null) {
                string2 = ((SubcomponentsOwner)object2).getName();
            }
            object2 = new lk0_2((Bundle)object);
            ai0_2.r((Function2)object2, object5, string2);
            object2 = kj0_1.g();
            ((kj0_1)object2).r((Activity)object4, (String)object3, (Bundle)object);
        } else if (object4 != null) {
            object3 = ((Component)object2).getSubComponentsOwner();
            object3 = object3 != null ? ((SubcomponentsOwner)object3).getCode() : null;
            Object object6 = ((Component)object2).getSubComponentsOwner();
            if (object6 != null) {
                object6 = ((SubcomponentsOwner)object6).getName();
            } else {
                bl2 = false;
                object6 = null;
            }
            mk0_2 mk0_22 = new mk0_2((dr0_0)object, (Activity)object4);
            ai0_2.r(mk0_22, object3, object6);
            object = pp0_0.a;
            object = ((Component)object2).getSubComponentsOwner();
            if (object == null || (object = ((SubcomponentsOwner)object).getName()) == null) {
                object = "";
            }
            object2 = ((Component)object2).getPostId();
            Intrinsics.checkNotNullParameter(object, "label");
            object3 = new Bundle();
            bl2 = true;
            object3.putBoolean("isUnseen", bl2);
            object3.putString("post_id", (String)object2);
            object2 = pp0_0.b;
            object4 = new np0_2((String)object, (Bundle)object3, null);
            int n3 = 3;
            Ae3.d((i90_0)object2, null, null, (Function2)object4, n3);
        }
        return Unit.a;
    }
}


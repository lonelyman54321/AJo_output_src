/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fH0
 */
public final class fh0_1
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ dr0_0 d;

    public /* synthetic */ fh0_1(Component component, int n3, Activity activity, dr0_0 dr0_02) {
        this.a = component;
        this.b = n3;
        this.c = activity;
        this.d = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3;
        object = (Subcomponent)object;
        object2 = (Integer)object2;
        int n3 = (Integer)object2;
        dr0_0 dr0_02 = this.d;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object4 = sq0_1.a;
        object4 = this.a;
        Object object5 = ((Component)object4).getHeading();
        Object object6 = "";
        if (object5 == null) {
            object5 = object6;
        }
        if (object == null || (object3 = ((Subcomponent)object).getResourceOwner()) == null || (object3 = ((ResourceOwner)object3).getName()) == null) {
            object3 = object6;
        }
        Intrinsics.checkNotNullParameter(object5, "title");
        c80 c802 = sq0_1.d;
        String string2 = null;
        Object object7 = new oq0_2((String)object5, (String)object3, null);
        int n4 = 3;
        Ae3.d(c802, null, null, (Function2)object7, n4);
        object5 = ((Component)object4).getHeading();
        if (object5 == null) {
            object5 = object6;
        }
        if ((object4 = ((Component)object4).getHeading()) == null) {
            object4 = object6;
        }
        object3 = "fleek_insert_brand_discover_menu_";
        object4 = ((String)object3).concat((String)object4);
        if (object != null && (object3 = ((Subcomponent)object).getResourceOwner()) != null && (object3 = ((ResourceOwner)object3).getName()) != null) {
            object6 = object3;
        }
        object3 = new StringBuilder();
        int n7 = this.b;
        object7 = "|";
        object2 = Xd0.a((String)object7, n7, n3, (StringBuilder)object3);
        sq0_1.h((String)object5, (String)object4, (String)object6, (String)object2);
        object2 = this.c;
        if (object2 != null) {
            object4 = object != null && (object4 = ((Subcomponent)object).getResourceOwner()) != null ? ((ResourceOwner)object4).getName() : null;
            if (object != null && (object5 = ((Subcomponent)object).getResourceOwner()) != null) {
                string2 = ((ResourceOwner)object5).getCode();
            }
            object5 = new rh0_0(dr0_02, (Activity)object2, (Subcomponent)object);
            ai0_2.r((Function2)object5, object4, string2);
        }
        return Unit.a;
    }
}


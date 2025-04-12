/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.FnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zC
 */
public final class zc_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ Resource b;
    public final /* synthetic */ Component c;

    public zc_2(yp0_0 yp0_02, Resource resource, Component component, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = resource;
        this.c = component;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Resource resource = this.b;
        Component component = this.c;
        yp0_0 yp0_02 = this.a;
        object = new zc_2(yp0_02, resource, component, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zc_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zc_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        Object object2;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.c.getHeading();
        if (object == null) {
            object = "";
        }
        object3 = this.a;
        object3.getClass();
        Intrinsics.checkNotNullParameter(object, "widgetName");
        Bundle bundle = new Bundle();
        Object object4 = od3_2.a();
        bundle.putString("store_type", (String)object4);
        object4 = od3_2.a();
        bundle.putString("contains_store", (String)object4);
        object4 = this.b;
        if (object4 != null) {
            object2 = ((Resource)object4).getId();
        } else {
            n3 = 0;
            object2 = null;
        }
        String string2 = "product_id";
        bundle.putString(string2, (String)object2);
        if (object4 != null) {
            object2 = ((Resource)object4).getName();
        } else {
            n3 = 0;
            object2 = null;
        }
        string2 = "product_name";
        bundle.putString(string2, (String)object2);
        if (object4 != null && (object2 = ((Resource)object4).getFnlColorVariantData()) != null) {
            object2 = ((FnlColorVariantData)object2).getBrandName();
        } else {
            n3 = 0;
            object2 = null;
        }
        string2 = "product_brand";
        bundle.putString(string2, (String)object2);
        if (object4 != null) {
            object2 = ((Resource)object4).getType();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            if (object4 != null) {
                object2 = ((Resource)object4).getType();
            } else {
                n3 = 0;
                object2 = null;
            }
            string2 = "product_brick";
            bundle.putString(string2, (String)object2);
        }
        object4 = object4 != null && (object4 = ((Resource)object4).getFnlColorVariantData()) != null ? ((FnlColorVariantData)object4).getBrandName() : null;
        object = UX.c("fleek_insert_", (String)object4, "_", (String)object);
        bundle.putString("item_list", (String)object);
        object = new ap0_2((yp0_0)object3, bundle, null);
        Ae3.d(((yp0_0)object3).d, null, null, (Function2)object, 3);
        return Unit.a;
    }
}


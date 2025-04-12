/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from xC
 */
public final class xc_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ p83_0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;

    public xc_2(yp0_0 yp0_02, String string2, Ref$ObjectRef ref$ObjectRef, p83_0 p83_02, int n3, String string3, int n4, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = string2;
        this.c = ref$ObjectRef;
        this.d = p83_02;
        this.e = n3;
        this.f = string3;
        this.g = n4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.f;
        int n3 = this.g;
        yp0_0 yp0_02 = this.a;
        String string3 = this.b;
        Ref$ObjectRef ref$ObjectRef = this.c;
        p83_0 p83_02 = this.d;
        int n4 = this.e;
        object = new xc_2(yp0_02, string3, ref$ObjectRef, p83_02, n4, string2, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xc_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xc_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.b;
        if (object == null) {
            object = "";
        }
        object2 = this.c.element;
        Object object3 = this.d;
        int n3 = this.e;
        object3 = (object3 = (Subcomponent)((p83_0)object3).get(n3)) != null ? ((Subcomponent)object3).getType() : null;
        Object object4 = new StringBuilder("unseen - ");
        ((StringBuilder)object4).append(object2);
        ((StringBuilder)object4).append(" - ");
        ((StringBuilder)object4).append((String)object3);
        object2 = ((StringBuilder)object4).toString();
        object3 = new StringBuilder("fleek_post_");
        object4 = this.f;
        object3 = h30_0.a((StringBuilder)object3, (String)object4, "}");
        object4 = new StringBuilder();
        int n4 = this.g;
        String string2 = Xd0.a("|", n4, n3, (StringBuilder)object4);
        object4 = this.a;
        object4.getClass();
        Intrinsics.checkNotNullParameter(object, "bannerId");
        Intrinsics.checkNotNullParameter(object2, "creativeName");
        Intrinsics.checkNotNullParameter(object3, "bannerName");
        String string3 = "brand screen";
        Bundle bundle = dm_1.a(string2, "bannerPosition", string3, "screenName");
        String string4 = od3_2.a();
        bundle.putString("store_type", string4);
        string4 = od3_2.a();
        bundle.putString("contains_store", string4);
        bundle.putString("item_id", (String)object);
        bundle.putString("item_name", (String)object3);
        bundle.putString("creative_name", (String)object2);
        bundle.putString("creative_slot", string2);
        object = new xp0_2((yp0_0)object4, string3, bundle, null);
        Ae3.d(((yp0_0)object4).d, null, null, (Function2)object, 3);
        return Unit.a;
    }
}


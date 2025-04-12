/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from wC
 */
public final class wc_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dr0_0 d;

    public wc_2(Subcomponent subcomponent, int n3, int n4, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = subcomponent;
        this.b = n3;
        this.c = n4;
        this.d = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.c;
        dr0_0 dr0_02 = this.d;
        Subcomponent subcomponent = this.a;
        int n4 = this.b;
        object = new wc_2(subcomponent, n4, n3, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (wc_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wc_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = new wq0_0(0);
        object2 = null;
        Subcomponent subcomponent = this.a;
        Object object3 = subcomponent != null ? subcomponent.getId() : null;
        ((wq0_0)object).a = object3;
        object3 = subcomponent != null && (object3 = subcomponent.getResourceOwner()) != null ? ((ResourceOwner)object3).getName() : null;
        String string2 = "fleek_storybubble_";
        ((wq0_0)object).b = object3 = kp1_0.c(string2, (String)object3);
        if (subcomponent != null) {
            object2 = subcomponent.getHeading();
        }
        ((wq0_0)object).c = object2;
        object2 = new StringBuilder();
        int n3 = this.b;
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append("|");
        n3 = this.c;
        ((StringBuilder)object2).append(n3);
        ((wq0_0)object).d = object2 = ((StringBuilder)object2).toString();
        this.d.j((wq0_0)object);
        return Unit.a;
    }
}


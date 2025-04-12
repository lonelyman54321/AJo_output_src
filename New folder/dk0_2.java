/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from DK0
 */
public final class dk0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dr0_0 d;

    public dk0_2(Subcomponent subcomponent, int n3, int n4, dr0_0 dr0_02, f80_0 f80_02) {
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
        object = new dk0_2(subcomponent, n4, n3, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (dk0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dk0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = new wq0_0(0);
        object3 = null;
        Object object4 = this.a;
        object2 = object4 != null && (object2 = ((Subcomponent)object4).getResourceOwner()) != null ? ((ResourceOwner)object2).getId() : null;
        ((wq0_0)object).a = object2;
        object2 = object4 != null && (object2 = ((Subcomponent)object4).getResourceOwner()) != null ? ((ResourceOwner)object2).getName() : null;
        String string2 = "fleek_story_tile_";
        ((wq0_0)object).b = object2 = kp1_0.c(string2, (String)object2);
        if (object4 != null && (object4 = ((Subcomponent)object4).getResourceOwner()) != null) {
            object3 = ((ResourceOwner)object4).getName();
        }
        ((wq0_0)object).c = object3;
        object3 = new StringBuilder();
        int n3 = this.b;
        ((StringBuilder)object3).append(n3);
        ((StringBuilder)object3).append("|");
        n3 = this.c;
        ((StringBuilder)object3).append(n3);
        ((wq0_0)object).d = object3 = ((StringBuilder)object3).toString();
        this.d.l((wq0_0)object);
        return Unit.a;
    }
}


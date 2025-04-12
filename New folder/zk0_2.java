/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from zK0
 */
public final class zk0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dr0_0 d;

    public zk0_2(Subcomponent subcomponent, int n3, int n4, dr0_0 dr0_02, f80_0 f80_02) {
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
        object = new zk0_2(subcomponent, n4, n3, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zk0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zk0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        int n3 = 0;
        object3 = null;
        object = new wq0_0(0);
        int n4 = 0;
        Object object4 = null;
        Subcomponent subcomponent = this.a;
        object2 = subcomponent != null && (object2 = subcomponent.getResourceOwner()) != null ? ((ResourceOwner)object2).getId() : null;
        ((wq0_0)object).a = object2;
        if (subcomponent != null && (object2 = subcomponent.getResourceOwner()) != null) {
            object4 = ((ResourceOwner)object2).getName();
        }
        object2 = "fleek_story_bubble_";
        object4 = kp1_0.c((String)object2, object4);
        ((wq0_0)object).b = object4;
        if (subcomponent == null || (object4 = subcomponent.getResourceOwner()) == null || (object4 = ((ResourceOwner)object4).getLogo()) == null) {
            object4 = "";
        }
        n3 = StringsKt.Q((CharSequence)object4, '/', 0, 6) + 1;
        int n7 = ((String)object4).length();
        object3 = ((String)object4).substring(n3, n7);
        Intrinsics.checkNotNullExpressionValue(object3, "substring(...)");
        ((wq0_0)object).c = object3;
        object3 = new StringBuilder();
        n4 = this.b;
        ((StringBuilder)object3).append(n4);
        ((StringBuilder)object3).append("|");
        n4 = this.c;
        ((StringBuilder)object3).append(n4);
        ((wq0_0)object).d = object3 = ((StringBuilder)object3).toString();
        this.d.l((wq0_0)object);
        return Unit.a;
    }
}


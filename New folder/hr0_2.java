/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HR0
 */
public final class hr0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;

    public hr0_2(f80_0 f80_02, dr0_0 dr0_02) {
        this.a = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.a;
        object = new hr0_2(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hr0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hr0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        ye0_0 ye0_02 = null;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((dr0_0)object).a;
        Object object3 = new GR0(object, 0);
        object2.getClass();
        Intrinsics.checkNotNullParameter(object3, "onSuccessCartCount");
        object = ((xr0_2)object2).a();
        boolean bl2 = ((UserInformation)object).isUserOnline();
        if (bl2 || (bl2 = ap_0.c())) {
            object = ((xr0_2)object2).c;
            object2 = (so_1)((hh3_2)object).getValue();
            cp$a cp$a = cp_1.Companion;
            object2 = ((so_1)object2).c;
            String string2 = "userInformation";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            cp$a.getClass();
            boolean bl3 = cp$a.A((UserInformation)object2);
            if (bl3) {
                object = ((so_1)((hh3_2)object).getValue()).a();
                int n3 = 1;
                object2 = new qa_1(object3, n3);
                object3 = new vq0_1(object2, 0);
                object2 = new wq0_1(0);
                ye0_02 = new ye0_0(object2);
                ((g53_0)object).f((o60_0)object3, ye0_02);
            }
        }
        return Unit.a;
    }
}


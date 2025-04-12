/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vs$e
 */
public final class vs$e_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ tr1_0 a;
    public final /* synthetic */ tr1_0 b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ String d;

    public vs$e_0(tr1_0 tr1_02, tr1_0 tr1_03, tr1_0 tr1_04, String string2, f80_0 f80_02) {
        this.a = tr1_02;
        this.b = tr1_03;
        this.c = tr1_04;
        this.d = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = this.c;
        String string2 = this.d;
        tr1_0 tr1_03 = this.a;
        tr1_0 tr1_04 = this.b;
        object = new vs$e_0(tr1_03, tr1_04, tr1_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vs$e_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vs$e_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.b;
        object2 = (Subcomponent)object.getValue();
        if (object2 != null) {
            object = (Subcomponent)object.getValue();
        } else {
            object = (Component)this.c.getValue();
            object2 = null;
            if (object != null && (object = ((Component)object).getSubcomponents()) != null) {
                boolean bl2;
                object = object.iterator();
                while (bl2 = object.hasNext()) {
                    String string2;
                    boolean bl3;
                    Object t3 = object.next();
                    Object object3 = t3;
                    object3 = (Subcomponent)t3;
                    if (object3 != null) {
                        object3 = ((Subcomponent)object3).getUuid();
                    } else {
                        bl3 = false;
                        object3 = null;
                    }
                    if (!(bl3 = Intrinsics.areEqual(object3, string2 = this.d))) continue;
                    object2 = t3;
                    break;
                }
                object = object2;
                object = (Subcomponent)object2;
            } else {
                object = null;
            }
        }
        this.a.setValue(object);
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from yK0
 */
public final class yk0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Component f;

    public yk0_2(ib3_0 ib3_02, c80 c802, int n3, dr0_0 dr0_02, String string2, Component component, f80_0 f80_02) {
        this.a = ib3_02;
        this.b = c802;
        this.c = n3;
        this.d = dr0_02;
        this.e = string2;
        this.f = component;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.d;
        Object object2 = this.b;
        i90_0 i90_02 = object2;
        i90_02 = (c80)object2;
        ib3_0 ib3_02 = this.a;
        int n3 = this.c;
        String string2 = this.e;
        Component component = this.f;
        object2 = object;
        object = new yk0_2(ib3_02, (c80)i90_02, n3, dr0_02, string2, component, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yk0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yk0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        Object object2 = object = this.a.getValue();
        object2 = (List)object;
        object = ir0_2.a;
        object = em0_2.b;
        dr0_0 dr0_02 = this.d;
        String string2 = this.e;
        int n3 = this.c;
        Component component = this.f;
        yK0$a yK0$a = new yK0$a((List)object2, n3, dr0_02, string2, component, null);
        Ae3.d(this.b, (CoroutineContext)object, null, yK0$a, 2);
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Rx2
 */
public final class rx2_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ px2_0 a;
    public final /* synthetic */ boolean b;

    public rx2_0(px2_0 px2_02, boolean bl2, f80_0 f80_02) {
        this.a = px2_02;
        this.b = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        px2_0 px2_02 = this.a;
        boolean bl2 = this.b;
        object = new rx2_0(px2_02, bl2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rx2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rx2_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        V72 v72;
        boolean bl2;
        vl2_2.b(object);
        object = this.a;
        boolean bl3 = this.b;
        if (!bl3 && !(bl2 = ((px2_0)object).d) && (bl2 = ((W72)object).isEnabled()) && (v72 = ((px2_0)object).c) != null) {
            v72.a();
        }
        ((W72)object).setEnabled(bl3);
        return Unit.a;
    }
}


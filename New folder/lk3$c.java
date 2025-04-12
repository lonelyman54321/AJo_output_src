/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Lambda;

public final class lk3$c
extends Lambda
implements gx0_2 {
    public final /* synthetic */ ln0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ wr1_1 f;

    public lk3$c(ln0 ln02, boolean bl2, boolean bl3, wr1_1 wr1_12) {
        this.c = ln02;
        this.d = bl2;
        this.e = bl3;
        this.f = wr1_12;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        boolean bl2;
        object = (Yh1)((Object)object);
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        int bl3 = -1272940975;
        object2.K(bl3);
        object3 = Yh1.UnfocusedEmpty;
        if (object == object3) {
            bl2 = false;
            object = null;
        } else {
            bl2 = this.e;
        }
        boolean bl4 = this.d;
        wr1_1 wr1_12 = this.f;
        long l2 = ((OX)this.c.d((boolean)bl4, (boolean)bl2, (wr1_1)wr1_12, (b30_0)object2).getValue()).a;
        object2.E();
        object = new OX(l2);
        return object;
    }
}


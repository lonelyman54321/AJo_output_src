/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from GQ2$a
 */
public final class gq2$a_0
implements fs0_2 {
    public final /* synthetic */ lq2_0 a;

    public gq2$a_0(lq2_0 lq2_02) {
        this.a = lq2_02;
    }

    public final Object emit(Object object, f80_0 objectArray) {
        boolean bl2 = (object = (kk2_1)object) instanceof KK2$c;
        if (bl2) {
            objectArray = this.a.h;
            object = ((KK2$c)object).a;
            objectArray.k(object);
        } else {
            object = yn3_0.a;
            bl2 = false;
            objectArray = new Object[]{};
            String string2 = "rto data not available";
            ((yn3$a)object).a(string2, objectArray);
        }
        return Unit.a;
    }
}


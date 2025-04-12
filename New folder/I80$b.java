/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class I80$b
implements fs0_2 {
    public final /* synthetic */ Vt1 a;
    public final /* synthetic */ Al3 b;
    public final /* synthetic */ Sk3 c;
    public final /* synthetic */ Se1 d;

    public I80$b(Vt1 vt1, Al3 al3, Sk3 sk3, Se1 se1) {
        this.a = vt1;
        this.b = al3;
        this.c = sk3;
        this.d = se1;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        object2 = this.a;
        if (bl2 && (bl2 = ((Vt1)object2).b())) {
            object = this.c;
            ql3_0 ql3_02 = ((Sk3)object).l();
            object = ((Sk3)object).b;
            Al3 al3 = this.b;
            Se1 se1 = this.d;
            o90.f(al3, (Vt1)object2, ql3_02, se1, (i72)object);
        } else {
            o90.e((Vt1)object2);
        }
        return Unit.a;
    }
}


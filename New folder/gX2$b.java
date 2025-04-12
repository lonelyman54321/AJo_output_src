/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class gX2$b
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ gx2_0 d;
    public final /* synthetic */ gr3 e;
    public final /* synthetic */ float f;

    public gX2$b(Object object, Object object2, gx2_0 gx2_02, gr3 gr32, float f5, f80_0 f80_02) {
        this.b = object;
        this.c = object2;
        this.d = gx2_02;
        this.e = gr32;
        this.f = f5;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        gr3 gr32 = this.e;
        float f5 = this.f;
        Object object = this.b;
        Object object2 = this.c;
        gx2_0 gx2_02 = this.d;
        gX2$b gX2$b = new gX2$b(object, object2, gx2_02, gr32, f5, f80_02);
        return gX2$b;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (gX2$b)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((gX2$b)object).invokeSuspend(unit);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            float f5 = this.f;
            Object object2 = this.b;
            Object object3 = this.c;
            gx2_0 gx2_02 = this.d;
            gr3 gr32 = this.e;
            object = new gX2$b$a(object2, object3, gx2_02, gr32, f5, null);
            this.a = n4;
            object = kotlinx.coroutines.d.c((Function2)object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}


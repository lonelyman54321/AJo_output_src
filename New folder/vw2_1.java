/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from vW2
 */
public final class vw2_1
extends qg3_2
implements Function2 {
    public zr1_1 a;
    public int b;
    public final /* synthetic */ yw2_0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public vw2_1(f80_0 f80_02, yw2_0 yw2_02, String string2, boolean bl2) {
        this.c = yw2_02;
        this.d = string2;
        this.e = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.d;
        boolean bl2 = this.e;
        yw2_0 yw2_02 = this.c;
        object = new vw2_1(f80_02, yw2_02, string2, bl2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vw2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vw2_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            object2 = this.a;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = this.c;
            zr1_1 zr1_12 = ((yw2_0)object).k;
            wm0_2 wm0_22 = ir0_2.a;
            em0_2 em0_22 = em0_2.b;
            String string2 = this.d;
            boolean bl2 = this.e;
            vW2$a vW2$a = new vW2$a(null, (yw2_0)object, string2, bl2);
            this.a = zr1_12;
            this.b = n4;
            object = Ae3.g(this, em0_22, vW2$a);
            if (object == object2) {
                return object2;
            }
            object2 = zr1_12;
        }
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}


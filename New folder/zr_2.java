/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ZR
 */
public final class zr_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fz2_1 c;
    public final /* synthetic */ Object d;

    public zr_2(fz2_1 fz2_12, Object object, f80_0 f80_02) {
        this.c = fz2_12;
        this.d = object;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        fz2_1 fz2_12 = this.c;
        Object object2 = this.d;
        zr_2 zr_22 = new zr_2(fz2_12, object2, f80_02);
        zr_22.b = object;
        return zr_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zr_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zr_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        int n3;
        Object object2;
        block11: {
            block10: {
                object2 = j90_0.COROUTINE_SUSPENDED;
                int n4 = this.a;
                n3 = 1;
                if (n4 != 0) {
                    if (n4 != n3) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    try {
                        vl2_2.b(object);
                        break block10;
                    }
                    finally {
                        break block11;
                    }
                }
                vl2_2.b(object);
                object = (i90_0)this.b;
                object = this.c;
                Object object3 = this.d;
                try {
                    // empty try
                }
                catch (Throwable throwable2) {}
                this.a = n3;
                object = object.o(this, object3);
                if (object != object2) break block10;
                return object2;
            }
            object = Unit.a;
            return tl2_2.b;
        }
        object2 = tl2_2.b;
        object = vl2_2.a(throwable2);
        int n7 = object instanceof tL2$b ^ n3;
        if (n7 != 0) {
            object = Unit.a;
            return new vr_2(object);
        } else {
            object = tl2_2.a(object);
            object2 = new VR$a((Throwable)object);
            object = object2;
        }
        return new vr_2(object);
    }
}


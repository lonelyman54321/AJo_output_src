/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KT1
 */
public final class kt1_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ gx2_0 c;
    public final /* synthetic */ d d;

    public kt1_1(float f5, gx2_0 gx2_02, d d2, f80_0 f80_02) {
        this.b = f5;
        this.c = gx2_02;
        this.d = d2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gx2_0 gx2_02 = this.c;
        d d2 = this.d;
        float f5 = this.b;
        object = new kt1_1(f5, gx2_02, d2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kt1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kt1_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block12: {
            float f5;
            float f6;
            int n3;
            float f7;
            d d2;
            gx2_0 gx2_02;
            int n4;
            j90_0 j90_02;
            block13: {
                int n7;
                block9: {
                    block10: {
                        block11: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n4 = this.a;
                            gx2_02 = this.c;
                            d2 = null;
                            f7 = this.b;
                            n3 = 2;
                            n7 = 1;
                            if (n4 == 0) break block9;
                            if (n4 == n7) break block10;
                            if (n4 != n3) break block11;
                            vl2_2.b(object);
                            break block12;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block13;
                }
                vl2_2.b(object);
                float f8 = f7 - 0.0f;
                f6 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                if (f6 > 0) {
                    this.a = n7;
                    object = gx2_02.b.getValue();
                    if ((object = gx2_02.m(f7, object, this)) == j90_02) {
                        return j90_02;
                    }
                }
            }
            f6 = (f5 = f7 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
            if (f6 == false) {
                this.a = n3;
                object = gx2_02.e;
                if (object == null) {
                    object = Unit.a;
                } else {
                    Object object2 = gx2_02.c.getValue();
                    n4 = (int)(Intrinsics.areEqual(object2, d2 = this.d) ? 1 : 0);
                    if (n4 != 0 && (n4 = (int)(Intrinsics.areEqual(object2 = gx2_02.b.getValue(), d2) ? 1 : 0)) != 0) {
                        object = Unit.a;
                    } else {
                        f7 = 0.0f;
                        object2 = new mx2_0(gx2_02, d2, (gr3)object, null);
                        if ((object = cs1_0.a(gx2_02.k, (Function1)object2, this)) != j90_02) {
                            object = Unit.a;
                        }
                    }
                }
                if (object == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}


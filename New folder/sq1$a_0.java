/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.f;

/*
 * Renamed from sq1$a
 */
public final class sq1$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ zr1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Ref$FloatRef f;
    public final /* synthetic */ QT2 g;
    public final /* synthetic */ Ref$BooleanRef h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float j;
    public final /* synthetic */ Ref$IntRef k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Ref$ObjectRef n;

    public sq1$a_0(zr1 zr12, int n3, float f5, Ref$FloatRef ref$FloatRef, QT2 qT2, Ref$BooleanRef ref$BooleanRef, boolean bl2, float f6, Ref$IntRef ref$IntRef, int n4, Ref$ObjectRef ref$ObjectRef) {
        this.c = zr12;
        this.d = n3;
        this.e = f5;
        this.f = ref$FloatRef;
        this.g = qT2;
        this.h = ref$BooleanRef;
        this.i = bl2;
        this.j = f6;
        this.k = ref$IntRef;
        this.l = 100;
        this.m = n4;
        this.n = ref$ObjectRef;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        int n4;
        Object object2;
        block22: {
            block20: {
                block21: {
                    boolean bl2;
                    int n7;
                    Object object3;
                    block18: {
                        Object object4;
                        Object object5;
                        float f5;
                        Serializable serializable;
                        float f6;
                        float f7;
                        block19: {
                            object = (tl_1)object;
                            object2 = this.c;
                            n4 = this.d;
                            object3 = tq1_1.a((zr1)object2, n4);
                            Ref$BooleanRef ref$BooleanRef = this.h;
                            n7 = this.m;
                            bl2 = this.i;
                            if (object3 != 0) break block18;
                            f7 = 0.0f;
                            Number number = null;
                            f6 = this.e;
                            float f8 = f6 - 0.0f;
                            object3 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                            if (object3 > 0) {
                                number = (Number)((tl_1)object).e.getValue();
                                f7 = kotlin.ranges.f.c(number.floatValue(), f6);
                            } else {
                                number = (Number)((tl_1)object).e.getValue();
                                f7 = kotlin.ranges.f.a(number.floatValue(), f6);
                            }
                            serializable = this.f;
                            f5 = ((Ref$FloatRef)serializable).element;
                            f7 -= f5;
                            object5 = this.g;
                            f5 = object5.a(f7);
                            boolean bl3 = tq1_1.a((zr1)object2, n4);
                            if (bl3 || (bl3 = sq1_2.c(bl2, (zr1)object2, n4, n7))) break block18;
                            object4 = f7 == f5 ? 0 : (f7 < f5 ? -1 : 1);
                            if (object4 == false) break block19;
                            ((tl_1)object).a();
                            ref$BooleanRef.element = false;
                            break block20;
                        }
                        ((Ref$FloatRef)serializable).element = f5 = ((Ref$FloatRef)serializable).element + f7;
                        f7 = this.j;
                        if (bl2) {
                            serializable = (Number)((tl_1)object).e.getValue();
                            f6 = ((Number)serializable).floatValue();
                            float f11 = f6 - f7;
                            object3 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                            if (object3 > 0) {
                                ((tl_1)object).a();
                            }
                        } else {
                            serializable = (Number)((tl_1)object).e.getValue();
                            f6 = ((Number)serializable).floatValue();
                            float f12 = f6 - (f7 = -f7);
                            object3 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                            if (object3 < 0) {
                                ((tl_1)object).a();
                            }
                        }
                        object3 = this.l;
                        int n8 = 2;
                        f6 = 2.8E-45f;
                        object5 = this.k;
                        if (bl2) {
                            object4 = ((Ref$IntRef)object5).element;
                            if (object4 >= n8) {
                                n8 = object2.a();
                                if ((n8 = n4 - n8) > object3) {
                                    object3 = n4 - object3;
                                    object2.b((int)object3, 0);
                                }
                            }
                        } else {
                            object4 = ((Ref$IntRef)object5).element;
                            if (object4 >= n8 && (n8 = object2.e() - n4) > object3) {
                                object2.b((int)(object3 += n4), 0);
                            }
                        }
                    }
                    if ((object3 = sq1_2.c(bl2, (zr1)object2, n4, n7)) == 0) break block21;
                    object2.b(n4, n7);
                    ref$BooleanRef.element = false;
                    ((tl_1)object).a();
                    break block20;
                }
                n3 = tq1_1.a((zr1)object2, n4);
                if (n3 != 0) break block22;
            }
            return Unit.a;
        }
        n3 = ok1_1.b(object2.c(n4));
        il_0 il_02 = (il_0)this.n.element;
        object2 = new tk1_0(n3, il_02);
        throw object2;
    }
}


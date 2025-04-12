/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from lU2
 */
public final class lu2_2
extends qg3_2
implements Function2 {
    public long a;
    public int b;
    public /* synthetic */ long c;
    public final /* synthetic */ ku2_0 d;

    public lu2_2(ku2_0 ku2_02, f80_0 f80_02) {
        this.d = ku2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2;
        ku2_0 ku2_02 = this.d;
        lu2_2 lu2_22 = new lu2_2(ku2_02, f80_02);
        lu2_22.c = l2 = ((WA3)object).a;
        return lu2_22;
    }

    public final Object invoke(Object object, Object object2) {
        long l2 = ((WA3)object).a;
        object2 = (f80_0)object2;
        ku2_0 ku2_02 = this.d;
        object = new lu2_2(ku2_02, (f80_0)object2);
        ((lu2_2)object).c = l2;
        object2 = Unit.a;
        return ((lu2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        long l2;
        long l3;
        long l4;
        block7: {
            long l7;
            ku2_0 ku2_02;
            int n3;
            j90_0 j90_02;
            block8: {
                int n4;
                block9: {
                    int n7;
                    block3: {
                        block4: {
                            block5: {
                                block6: {
                                    j90_02 = j90_0.COROUTINE_SUSPENDED;
                                    int n8 = this.b;
                                    n3 = 3;
                                    n4 = 2;
                                    n7 = 1;
                                    ku2_02 = this.d;
                                    if (n8 == 0) break block3;
                                    if (n8 == n7) break block4;
                                    if (n8 == n4) break block5;
                                    if (n8 != n3) break block6;
                                    l4 = this.a;
                                    l3 = this.c;
                                    vl2_2.b(object);
                                    l2 = l4;
                                    object2 = object;
                                    break block7;
                                }
                                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw illegalStateException;
                            }
                            l3 = this.a;
                            l7 = this.c;
                            vl2_2.b(object);
                            object2 = object;
                            break block8;
                        }
                        l7 = this.c;
                        vl2_2.b(object);
                        object2 = object;
                        break block9;
                    }
                    vl2_2.b(object);
                    l7 = this.c;
                    object2 = ku2_02.f;
                    this.c = l7;
                    this.b = n7;
                    object2 = ((pU1)object2).b(l7, this);
                    if (object2 == j90_02) {
                        return j90_02;
                    }
                }
                l2 = ((WA3)object2).a;
                l2 = WA3.d(l7, l2);
                this.c = l7;
                this.a = l2;
                this.b = n4;
                object2 = ku2_02.b(l2, this);
                if (object2 == j90_02) {
                    return j90_02;
                }
                l3 = l2;
            }
            l2 = ((WA3)object2).a;
            object2 = ku2_02.f;
            l3 = WA3.d(l3, l2);
            this.c = l7;
            this.a = l2;
            this.b = n3;
            object2 = ((pU1)object2).a(l3, l2, this);
            if (object2 == j90_02) {
                return j90_02;
            }
            l3 = l7;
        }
        l4 = ((WA3)object2).a;
        l4 = WA3.d(l2, l4);
        l4 = WA3.d(l3, l4);
        WA3 wA3 = new WA3(l4);
        return wA3;
    }
}


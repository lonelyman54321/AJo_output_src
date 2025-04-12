/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KB2
 */
public abstract class kb2_0
extends H30 {
    public kb2_0() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final pa3_0 b(MB2 object, pa3_0 object2) {
        Object object3;
        Object object4;
        block15: {
            block17: {
                boolean bl2;
                block16: {
                    block14: {
                        bl2 = object2 instanceof ow0_0;
                        object4 = null;
                        if (!bl2) break block14;
                        bl2 = ((MB2)object).f;
                        if (bl2) {
                            object4 = object2;
                            object4 = (ow0_0)object2;
                            object2 = ((ow0_0)object4).a;
                            object3 = ((MB2)object).a();
                            object2.setValue(object3);
                        }
                        break block15;
                    }
                    bl2 = object2 instanceof xc3;
                    if (!bl2) break block16;
                    bl2 = ((MB2)object).b;
                    if (!bl2 && (object3 = ((MB2)object).g) == null || (bl2 = ((MB2)object).f)) break block15;
                    object3 = ((MB2)object).a();
                    object2 = (xc3)object2;
                    Object object5 = ((xc3)object2).a;
                    bl2 = Intrinsics.areEqual(object3, object5);
                    if (!bl2) break block15;
                    break block17;
                }
                bl2 = object2 instanceof V30;
                if (!bl2) break block15;
                object3 = ((MB2)object).e;
                object2 = (V30)object2;
                Function1 function1 = ((V30)object2).a;
                if (object3 != function1) break block15;
            }
            object4 = object2;
        }
        if (object4 != null) return object4;
        boolean bl3 = ((MB2)object).f;
        object3 = ((MB2)object).d;
        if (bl3) {
            if (object3 == null) {
                object3 = ((MB2)object).c;
                if (object3 == null) {
                    J83.l();
                    object3 = qi_2.b;
                }
                object = ((MB2)object).g;
                object3 = J83.f(object, (I83)object3);
            }
            object2 = new ow0_0((tr1_0)object3);
            return object2;
        }
        object2 = ((MB2)object).e;
        if (object2 != null) {
            object = new V30((Function1)object2);
            return object;
        }
        if (object3 != null) {
            object = new ow0_0((tr1_0)object3);
            return object;
        }
        object = ((MB2)object).a();
        object2 = new xc3(object);
        return object2;
    }

    public abstract MB2 c(Object var1);
}


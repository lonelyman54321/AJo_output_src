/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

public final class Ql0$a
implements fs0_2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ rS0 c;

    public Ql0$a(ArrayList arrayList, i90_0 i90_02, rS0 rS02) {
        this.a = arrayList;
        this.b = i90_02;
        this.c = rS02;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        object = (kj1)object;
        boolean bl2 = object instanceof x91;
        Object object2 = this.a;
        if (bl2) {
            object2.add(object);
        } else {
            bl2 = object instanceof y91;
            if (bl2) {
                object = ((y91)object).a;
                object2.remove(object);
            } else {
                bl2 = object instanceof rt0_0;
                if (bl2) {
                    object2.add(object);
                } else {
                    bl2 = object instanceof ST0;
                    if (bl2) {
                        object = ((ST0)object).a;
                        object2.remove(object);
                    } else {
                        bl2 = object instanceof Ey2$b;
                        if (bl2) {
                            object2.add(object);
                        } else {
                            bl2 = object instanceof Ey2$c;
                            if (bl2) {
                                object = ((Ey2$c)object).a;
                                object2.remove(object);
                            } else {
                                bl2 = object instanceof Ey2$a;
                                if (bl2) {
                                    object = ((Ey2$a)object).a;
                                    object2.remove(object);
                                }
                            }
                        }
                    }
                }
            }
        }
        object = (kj1)CollectionsKt.T((List)object2);
        object2 = this.c;
        f80_02 = new pl0_0((rS0)object2, (kj1)object, null);
        Ae3.d(this.b, null, null, (Function2)((Object)f80_02), 3);
        return Unit.a;
    }
}


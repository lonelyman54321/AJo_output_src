/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class X72
extends Lambda
implements Function1 {
    public final /* synthetic */ d82_0 c;

    public X72(d82_0 d82_02) {
        this.c = d82_02;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        Object object3;
        d82_0 d82_02;
        block3: {
            object = (uu_0)object;
            Intrinsics.checkNotNullParameter(object, "backEvent");
            d82_02 = this.c;
            object3 = d82_02.c;
            int n3 = ((e1_0)object3).size();
            object3 = ((AbstractList)object3).listIterator(n3);
            while ((n3 = (int)(object3.hasPrevious() ? 1 : 0)) != 0) {
                Object object4 = object2 = object3.previous();
                object4 = (W72)object2;
                boolean bl2 = ((W72)object4).isEnabled();
                if (!bl2) continue;
                break block3;
            }
            n3 = 0;
            object2 = null;
        }
        object2 = (W72)object2;
        object3 = d82_02.d;
        if (object3 != null) {
            d82_02.c();
        }
        d82_02.d = object2;
        if (object2 != null) {
            ((W72)object2).handleOnBackStarted((uu_0)object);
        }
        return Unit.a;
    }
}


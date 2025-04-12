/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Cl2$b
extends Lambda
implements Function2 {
    public final /* synthetic */ Cl2 c;

    public Cl2$b(Cl2 cl2) {
        this.c = cl2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (QT2)object;
        int n3 = ((Number)object2).intValue();
        object2 = this.c;
        n3 = ((Cl2)object2).i(n3);
        ((Cl2)object2).r.e(n3);
        return Unit.a;
    }
}


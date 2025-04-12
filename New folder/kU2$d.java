/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class kU2$d
extends Lambda
implements Function1 {
    public final /* synthetic */ ku2_0 c;

    public kU2$d(ku2_0 ku2_02) {
        this.c = ku2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((e72)object).a;
        object = this.c;
        QT2 qT2 = ((ku2_0)object).h;
        int n3 = ((ku2_0)object).g;
        l2 = ku2_0.a((ku2_0)object, qT2, l2, n3);
        object = new e72(l2);
        return object;
    }
}


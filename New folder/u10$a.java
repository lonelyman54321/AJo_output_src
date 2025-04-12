/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u10$a
extends Lambda
implements Function2 {
    public final /* synthetic */ u10 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;

    public u10$a(u10 u102, Object object, int n3) {
        this.c = u102;
        this.d = object;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e) | 1;
        u10 u102 = this.c;
        Object object3 = this.d;
        u102.a(object3, (b30_0)object, n3);
        return Unit.a;
    }
}


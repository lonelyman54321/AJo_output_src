/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u10$b
extends Lambda
implements Function2 {
    public final /* synthetic */ u10 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;

    public u10$b(u10 u102, Object object, Object object2, int n3) {
        this.c = u102;
        this.d = object;
        this.e = object2;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f) | 1;
        Object object3 = this.d;
        Object object4 = this.e;
        this.c.b(object3, object4, (b30_0)object, n3);
        return Unit.a;
    }
}


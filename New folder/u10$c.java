/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u10$c
extends Lambda
implements Function2 {
    public final /* synthetic */ u10 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;

    public u10$c(u10 u102, Object object, Object object2, Object object3, int n3) {
        this.c = u102;
        this.d = object;
        this.e = object2;
        this.f = object3;
        this.g = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g) | 1;
        Object object4 = this.e;
        Object object5 = this.f;
        u10 u102 = this.c;
        Object object6 = this.d;
        u102.c(object6, object4, object5, (b30_0)object3, n3);
        return Unit.a;
    }
}


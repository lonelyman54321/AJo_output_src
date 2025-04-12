/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class S70
extends Lambda
implements Function2 {
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ E70 e;
    public final /* synthetic */ LP1 f;
    public final /* synthetic */ gx0_2 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;

    public S70(String string2, boolean bl2, E70 e70, LP1 lP1, gx0_2 gx0_22, Function0 function0, int n3) {
        this.c = string2;
        this.d = bl2;
        this.e = e70;
        this.f = lP1;
        this.g = gx0_22;
        this.h = function0;
        this.i = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.i | 1);
        E70 e70 = this.e;
        LP1 lP1 = this.f;
        String string2 = this.c;
        boolean bl2 = this.d;
        gx0_2 gx0_22 = this.g;
        Function0 function0 = this.h;
        X70.b(string2, bl2, e70, lP1, gx0_22, function0, (b30_0)object3, n3);
        return Unit.a;
    }
}


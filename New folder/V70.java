/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class V70
extends Lambda
implements Function2 {
    public final /* synthetic */ E70 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ Function1 e;

    public V70(E70 e70, LP1 lP1, Yk3 yk3) {
        this.c = e70;
        this.d = lP1;
        this.e = yk3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            Object object3 = (Yk3)this.e;
            E70 e70 = this.c;
            object2 = new u70_0((Yk3)object3, e70);
            n3 = 1156688164;
            object2 = v10.c(n3, (fx0_2)object2, (b30_0)object);
            object3 = this.d;
            int n7 = 384;
            X70.a(e70, (LP1)object3, (u10)object2, (b30_0)object, n7);
        }
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o90$c
extends Lambda
implements Function1 {
    public final /* synthetic */ long c;

    public o90$c(long l2) {
        this.c = l2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (UY2)object;
        TY2 tY2 = hY2.c;
        v21_0 v21_02 = v21_0.Cursor;
        fY2 fY22 = fY2.Middle;
        long l2 = this.c;
        gy2_0 gy2_02 = new gy2_0(v21_02, l2, fY22, true);
        object.a(tY2, gy2_02);
        return Unit.a;
    }
}


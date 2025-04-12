/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from dh
 */
public final class dh_0
extends Lambda
implements Function1 {
    public final /* synthetic */ k72 c;

    public dh_0(k72 k722) {
        this.c = k722;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (UY2)object;
        TY2 tY2 = hY2.c;
        v21_0 v21_02 = v21_0.Cursor;
        long l2 = this.c.a();
        fY2 fY22 = fY2.Middle;
        gy2_0 gy2_02 = new gy2_0(v21_02, l2, fY22, true);
        object.a(tY2, gy2_02);
        return Unit.a;
    }
}


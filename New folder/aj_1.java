/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from aj
 */
public final class aj_1
extends Lambda
implements Function1 {
    public final /* synthetic */ k72 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public aj_1(k72 k722, boolean bl2, boolean bl3) {
        this.c = k722;
        this.d = bl2;
        this.e = bl3;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        gy2_0 gy2_02;
        object = (UY2)object;
        long l2 = this.c.a();
        TY2 tY2 = hY2.c;
        boolean bl2 = this.d;
        Object object2 = bl2 ? v21_0.SelectionStart : v21_0.SelectionEnd;
        v21_0 v21_02 = object2;
        bl2 = this.e;
        object2 = bl2 ? fY2.Left : fY2.Right;
        Enum enum_ = object2;
        boolean bl3 = h72.c(l2);
        object2 = gy2_02;
        gy2_02 = new gy2_0(v21_02, l2, (fY2)enum_, bl3);
        object.a(tY2, gy2_02);
        return Unit.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from xk
 */
public final class xk_1
extends Lambda
implements Function1 {
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Hk e;

    public xk_1(p83_0 p83_02, Object object, Hk hk) {
        this.c = p83_02;
        this.d = object;
        this.e = hk;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        Object object2 = this.d;
        Hk hk = this.e;
        p83_0 p83_02 = this.c;
        object = new wk_0(p83_02, object2, hk);
        return object;
    }
}


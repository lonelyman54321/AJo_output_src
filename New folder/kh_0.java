/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from kh
 */
public final class kh_0
extends Lambda
implements Function1 {
    public final /* synthetic */ oq0_0 c;

    public kh_0(oq0_0 oq0_02) {
        this.c = oq0_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        object.show();
        jh_0 jh_02 = new jh_0((oq0_0)object);
        return jh_02;
    }
}


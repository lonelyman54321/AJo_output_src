/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Yp0
extends Lambda
implements Function1 {
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ d d;
    public final /* synthetic */ fq0_0 e;

    public Yp0(fq0_0 fq0_02, p83_0 p83_02, d d2) {
        this.c = p83_02;
        this.d = d2;
        this.e = fq0_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        d d2 = this.d;
        ((p83_0)object).add(d2);
        fq0_0 fq0_02 = this.e;
        Xp0 xp0 = new Xp0(fq0_02, (p83_0)object, d2);
        return xp0;
    }
}


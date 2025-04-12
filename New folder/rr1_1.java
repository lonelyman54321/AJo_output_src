/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Rr1
 */
public final class rr1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Tr1$a c;

    public rr1_1(Tr1$a tr1$a) {
        this.c = tr1$a;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        Tr1$a tr1$a = this.c;
        object = new Qr1(tr1$a);
        return object;
    }
}


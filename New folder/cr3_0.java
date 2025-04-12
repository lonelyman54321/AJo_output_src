/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Cr3
 */
public final class cr3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ gr3$a d;

    public cr3_0(gr3 gr32, gr3$a gr3$a) {
        this.c = gr32;
        this.d = gr3$a;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        gr3 gr32 = this.c;
        gr3$a gr3$a = this.d;
        object = new br3_0(gr32, gr3$a);
        return object;
    }
}


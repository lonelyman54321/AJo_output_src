/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;
import com.google.common.escape.Escaper;

/*
 * Renamed from sB0
 */
public final class sb0_0
implements Function {
    public final /* synthetic */ Escaper a;

    public /* synthetic */ sb0_0(Escaper escaper) {
        this.a = escaper;
    }

    public final Object apply(Object object) {
        Escaper escaper = this.a;
        object = (String)object;
        return escaper.escape((String)object);
    }
}


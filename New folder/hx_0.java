/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from hx
 */
public final class hx_0
extends Lambda
implements Function0 {
    public final /* synthetic */ tr1_0 c;

    public hx_0(tr1_0 tr1_02) {
        this.c = tr1_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        object = object != null ? (List)object.getValue() : null;
        return object;
    }
}


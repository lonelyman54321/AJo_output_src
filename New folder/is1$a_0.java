/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Is1$a
 */
public final class is1$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Object c;

    public is1$a_0(Object object) {
        this.c = object;
        super(1);
    }

    public final Object invoke(Object object) {
        ((Number)object).intValue();
        return this.c;
    }
}


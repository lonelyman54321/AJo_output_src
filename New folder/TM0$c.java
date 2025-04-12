/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class TM0$c
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;

    public TM0$c(p83_0 p83_02) {
        this.c = p83_02;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = ((Number)object).intValue();
        this.c.get(n3);
        return null;
    }
}


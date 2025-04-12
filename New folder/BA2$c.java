/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class BA2$c
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;

    public BA2$c(ArrayList arrayList) {
        this.c = arrayList;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = ((Number)object).intValue();
        this.c.get(n3);
        return null;
    }
}


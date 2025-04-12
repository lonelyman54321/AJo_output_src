/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from HX
 */
public final class hx_2
extends Lambda
implements Function0 {
    public final /* synthetic */ Iterable c;

    public hx_2(ArrayList arrayList) {
        this.c = arrayList;
        super(0);
    }

    public final Iterator b() {
        return this.c.iterator();
    }
}


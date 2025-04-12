/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;
import kotlinx.coroutines.i$a;

/*
 * Renamed from cV0
 */
public final class cv0_0 {
    public static final cV0$a c;
    public final Fq a;
    public final c80 b;

    static {
        cV0$a cV0$a;
        C90$a c90$a = C90$a.a;
        c = cV0$a = new a(c90$a);
    }

    public cv0_0(Fq object) {
        CoroutineContext coroutineContext = f.a;
        this.a = object;
        object = hr0.a;
        object = c.plus((CoroutineContext)object).plus(coroutineContext);
        i$a i$a = i$a.a;
        coroutineContext.getClass();
        Intrinsics.checkNotNullParameter(i$a, "key");
        super(null);
        this.b = object = d.a(object.plus(coroutineContext));
    }
}


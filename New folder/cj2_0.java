/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.core.CorruptionException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CJ2
 */
public final class cj2_0
implements T90 {
    public final Function1 a;

    public cj2_0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "produceNewData");
        this.a = function1;
    }

    public final Object a(CorruptionException corruptionException) {
        return this.a.invoke(corruptionException);
    }
}


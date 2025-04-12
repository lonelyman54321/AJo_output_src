/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from CZ2
 */
public final class cz2_2
extends Lambda
implements Function1 {
    public final /* synthetic */ Function0 c;

    public cz2_2(Function0 function0) {
        this.c = function0;
        super(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNullParameter(object, "it");
        return this.c.invoke();
    }
}


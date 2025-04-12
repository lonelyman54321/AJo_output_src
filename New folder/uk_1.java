/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from uk
 */
public final class uk_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Object c;

    public uk_1(Object object) {
        this.c = object;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = this.c;
        return Intrinsics.areEqual(object, object2);
    }
}


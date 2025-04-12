/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class rZ2
extends Lambda
implements Function1 {
    public final /* synthetic */ IntRange c;

    public rZ2(IntRange intRange) {
        this.c = intRange;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Wq3)object;
        String string2 = "stash";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((Wq3)object).a;
        int n3 = ((Object)object).length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            IntRange intRange = this.c;
            if ((object2 = (Object)intRange.e((int)object2)) == false) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }
}


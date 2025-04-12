/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ke3
 */
public final class ke3_2
extends Lambda
implements Function1 {
    public static final ke3_2 c;

    static {
        ke3_2 ke3_22;
        c = ke3_22 = new Lambda(1);
    }

    public ke3_2() {
        super(1);
    }

    public final String a(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "it");
        return ((Object)charSequence).toString();
    }
}


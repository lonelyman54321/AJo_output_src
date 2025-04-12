/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from io0
 */
public final class io0_2
extends ea1_2 {
    public io0_2(da1_2 i90_02, Function0 function0, ea1_2 i90_03, l41_0 l41_02) {
        Intrinsics.checkNotNullParameter(i90_02, "client");
        Intrinsics.checkNotNullParameter(function0, "block");
        Intrinsics.checkNotNullParameter(i90_03, "originCall");
        Intrinsics.checkNotNullParameter(l41_02, "responseHeaders");
        super((da1_2)i90_02);
        Object object = i90_03.c();
        super(this, (bb1_2)object);
        object = "<set-?>";
        Intrinsics.checkNotNullParameter(i90_02, (String)object);
        this.b = i90_02;
        i90_03 = i90_03.d();
        super(this, function0, (jb1_2)i90_03, l41_02);
        Intrinsics.checkNotNullParameter(i90_02, (String)object);
        this.c = i90_02;
    }
}


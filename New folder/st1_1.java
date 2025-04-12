/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from sT1
 */
public final class st1_1
extends Lambda
implements Function0 {
    public final /* synthetic */ String c;

    public st1_1(String string2) {
        this.c = string2;
        super(0);
    }

    public final Object invoke() {
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "uriPattern");
        gt1_0 gt1_02 = new gt1_0(string2);
        return gt1_02;
    }
}


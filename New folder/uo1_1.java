/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uo1
 */
public final class uo1_1
implements vo1_0 {
    public final b93 a;
    public wo1_0 b;
    public YT0 c;

    public uo1_1(b93 b932) {
        this.a = b932;
    }

    public final wo1_0 a() {
        wo1_0 wo1_02 = this.b;
        if (wo1_02 != null) {
            return wo1_02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }
}


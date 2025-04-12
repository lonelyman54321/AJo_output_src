/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class z33
implements F62 {
    public final /* synthetic */ b33_0 a;

    public /* synthetic */ z33(b33_0 b33_02) {
        this.a = b33_02;
    }

    public final void onChanged(Object object) {
        object = (Integer)object;
        b33_0 b33_02 = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(b33_02, string2);
        b33_02 = b33_02.v;
        if (b33_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekbar");
            b33_02 = null;
        }
        int n3 = (Integer)object;
        b33_02.setProgress(n3);
    }
}


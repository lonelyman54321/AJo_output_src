/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mj0
 */
public final class mj0_1
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ yT1 b;

    public /* synthetic */ mj0_1(String string2, yT1 yT12) {
        this.a = string2;
        this.b = yT12;
    }

    public final void run() {
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        CharSequence charSequence = new StringBuilder("brand?brandId=");
        Object object = this.a;
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullParameter(charSequence, "route");
        Intrinsics.checkNotNullParameter(yT12, "fleekAppNavigationController");
        object = new pj0_1(0);
        yT12.o((String)charSequence, (Function1)object);
    }
}


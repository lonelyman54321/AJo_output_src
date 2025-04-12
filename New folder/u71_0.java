/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from u71
 */
public final class u71_0
implements Runnable {
    public final /* synthetic */ x71_0 a;

    public /* synthetic */ u71_0(x71_0 x71_02) {
        this.a = x71_02;
    }

    public final void run() {
        x71_0 x71_02 = this.a;
        Intrinsics.checkNotNullParameter(x71_02, "this$0");
        Object object = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object);
        if (bl2) {
            long l2;
            x71_02.o = l2 = x71_02.o + 1L;
            object = x71_02.p;
            Object object2 = x71_02.q;
            object.postDelayed((Runnable)object2, 1000L);
            l2 = x71_02.o;
            long l3 = 3;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 >= 0 && !(bl2 = x71_02.r)) {
                x71_02.r = true;
                bl2 = x71_02.s;
                if (!bl2) {
                    float f5;
                    int n3;
                    object = x71_02.m;
                    if (object != null) {
                        n3 = ((ma_2)object).r;
                    } else {
                        n3 = 0;
                        f5 = 0.0f;
                        object2 = null;
                    }
                    Object object3 = null;
                    if (object != null) {
                        object = ((ow_0)object).a(n3);
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    if (object != null) {
                        n3 = 1065353216;
                        f5 = 1.0f;
                        object.setVolume(f5);
                    }
                    if ((object = x71_02.g) == null) {
                        object = "imgVolume";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object3 = object;
                    }
                    object = object3.getContext();
                    object2 = "getContext(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    x71_02.x((Context)object);
                }
            }
        }
    }
}


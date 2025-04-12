/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.graphics.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from be
 */
public final class be_1 {
    public static sg3_2 a() {
        sg3_2 sg3_22 = new xl1_2(null);
        return sg3_22;
    }

    public static final LP1 b(LP1 lP1, float f5) {
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            boolean bl2 = true;
            int n3 = 126971;
            lP1 = a.b(lP1, 0.0f, 0.0f, f5, 0.0f, null, bl2, n3);
        }
        return lP1;
    }

    public static final Object c(Function2 object, f80_0 f80_02) {
        CoroutineContext coroutineContext = f80_02.getContext();
        Object object2 = new ut2_2(f80_02, coroutineContext);
        if ((object = nv3_0.a(object2, object2, (Function2)object)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        }
        return object;
    }
}


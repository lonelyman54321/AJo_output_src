/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;

public final class Xm0$b
implements QT2 {
    public final /* synthetic */ xm0_0 a;

    public Xm0$b(xm0_0 xm0_02) {
        this.a = xm0_02;
    }

    public final float a(float f5) {
        Boolean bl2;
        boolean bl3 = Float.isNaN(f5);
        int n3 = 0;
        Boolean bl4 = null;
        if (bl3) {
            return 0.0f;
        }
        xm0_0 xm0_02 = this.a;
        Function1 function1 = xm0_02.a;
        Number number = Float.valueOf(f5);
        number = (Number)function1.invoke(number);
        f5 = number.floatValue();
        boolean bl5 = false;
        function1 = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
        } else {
            object = false;
            bl2 = null;
        }
        bl2 = (boolean)object;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = xm0_02.e;
        parcelableSnapshotMutableState.setValue(bl2);
        float f7 = f5 - 0.0f;
        n3 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (n3 < 0) {
            bl5 = true;
        }
        bl4 = bl5;
        xm0_02.f.setValue(bl4);
        return f5;
    }
}


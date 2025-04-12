/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.utils.StopWorkRunnable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kI3
 */
public final class ki3_2
implements ii3_0 {
    public final kz2_0 a;
    public final Si3 b;

    public ki3_2(kz2_0 kz2_02, Si3 si3) {
        Intrinsics.checkNotNullParameter(kz2_02, "processor");
        Intrinsics.checkNotNullParameter(si3, "workTaskExecutor");
        this.a = kz2_02;
        this.b = si3;
    }

    public final void a(xb3_0 xb3_02) {
        Intrinsics.checkNotNullParameter(xb3_02, "workSpecId");
        this.c(xb3_02, -512);
    }

    public final void b(xb3_0 xb3_02, int n3) {
        Intrinsics.checkNotNullParameter(xb3_02, "workSpecId");
        this.c(xb3_02, n3);
    }

    public final void c(xb3_0 xb3_02, int n3) {
        Intrinsics.checkNotNullParameter(xb3_02, "workSpecId");
        kz2_0 kz2_02 = this.a;
        StopWorkRunnable stopWorkRunnable = new StopWorkRunnable(kz2_02, xb3_02, false, n3);
        this.b.d(stopWorkRunnable);
    }

    public final void d(xb3_0 xb3_02) {
        Object object = "workSpecId";
        Intrinsics.checkNotNullParameter(xb3_02, (String)object);
        Intrinsics.checkNotNullParameter(xb3_02, (String)object);
        object = new ji3_1(this, 0, xb3_02, null);
        this.b.d((Runnable)object);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kf1
 */
public final class kf1_1
implements ln1_0 {
    public final rn1_1 a;
    public final yc1_2 b;
    public vg1_1 c;
    public ar0 d;
    public final Object e;
    public final Object f;

    public kf1_1(rn1_1 object, yc1_2 yc1_22) {
        Intrinsics.checkNotNullParameter(object, "config");
        this.a = object;
        this.b = yc1_22;
        this.e = object = new Object();
        this.f = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final vg1_1 a() {
        Object object;
        block6: {
            object = this.c;
            if (object == null) {
                object = this.e;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        Object object2;
                        block4: {
                            try {
                                object2 = this.c;
                                if (object2 != null) break block4;
                                int n3 = this.c();
                                this.c = object2 = new vg1_1(n3);
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        object2 = Unit.a;
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        object = this.c;
        Intrinsics.checkNotNull(object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ar0 b() {
        Object object;
        block6: {
            object = this.d;
            if (object == null) {
                object = this.f;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        Object object2;
                        block4: {
                            try {
                                object2 = this.d;
                                if (object2 != null) break block4;
                                rn1_1 rn1_12 = this.a;
                                File file = rn1_12.d;
                                long l2 = rn1_12.c;
                                int n3 = (int)l2;
                                yc1_2 yc1_22 = this.b;
                                this.d = object2 = new ar0(file, n3, yc1_22);
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        object2 = Unit.a;
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        object = this.d;
        Intrinsics.checkNotNull(object);
        return object;
    }

    public final int c() {
        Object object = this.a;
        long l2 = ((rn1_1)object).b;
        long l3 = ((rn1_1)object).a;
        long l4 = Math.max(l2, l3);
        int n3 = (int)l4;
        object = this.b;
        if (object != null) {
            object.a();
        }
        return n3;
    }
}


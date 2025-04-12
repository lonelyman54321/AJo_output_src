/*
 * Decompiled with CFR 0.152.
 */
package retrofit2;

final class KotlinExtensions$suspendAndThrow$2$1
implements Runnable {
    public final /* synthetic */ f80_0 a;
    public final /* synthetic */ Throwable b;

    public KotlinExtensions$suspendAndThrow$2$1(ko1_2 ko1_22, Throwable throwable) {
        this.a = ko1_22;
        this.b = throwable;
    }

    public final void run() {
        f80_0 f80_02 = zj1_2.b(this.a);
        Object object = tl2_2.b;
        object = vl2_2.a(this.b);
        f80_02.resumeWith(object);
    }
}


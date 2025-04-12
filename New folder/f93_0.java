/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from F93
 */
public final class f93_0
extends Fe1 {
    public final Fe1$a a;
    public boolean b;
    public se_1 c;
    public Function0 d;
    public hn2_2 e;

    public f93_0(se_1 se_12, Function0 function0, Fe1$a fe1$a) {
        this.a = fe1$a;
        this.c = se_12;
        this.d = function0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final hn2_2 a() {
        synchronized (this) {
            block13: {
                block12: {
                    this.h();
                    var1_1 = this.e;
                    if (var1_1 == null) break block12;
                    return var1_1;
                }
                var1_1 = this.d;
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.invoke();
                var1_1 = (File)var1_1;
                var2_3 = var1_1.isDirectory();
                if (!var2_3) ** GOTO lbl-1000
                var3_4 = hn2_2.b;
                var3_4 = "tmp";
                var1_1 = File.createTempFile((String)var3_4, null, (File)var1_1);
                var1_1 = hn2$a.b((File)var1_1);
                var3_4 = hm0_2.a;
                var3_4 = var3_4.k((hn2_2)var1_1);
                var3_4 = o72_0.a((y63_0)var3_4);
                try {
                    var4_8 = this.c;
                    Intrinsics.checkNotNull(var4_8);
                    var3_4.s(var4_8);
                }
                catch (Throwable var4_9) {
                    try {
                        var3_4.close();
                        ** GOTO lbl34
                    }
                    catch (Throwable var3_6) {
                        block14: {
                            yc0_2.a(var4_9, var3_6);
lbl34:
                            // 2 sources

                            var3_4 = var4_9;
lbl35:
                            // 3 sources

                            if (var3_4 == null) {
                                this.c = null;
                                this.e = var1_1;
                                this.d = null;
                                return var1_1;
                            }
                            break block14;
                            catch (Throwable var1_2) {
                                break block13;
                            }
                        }
                        throw var3_4;
                    }
                }
                try {
                    var3_4.close();
                    var2_3 = false;
                    var3_4 = null;
                }
                catch (Throwable var3_5) {}
                ** GOTO lbl35
lbl-1000:
                // 1 sources

                {
                    var3_7 = "cacheDirectory must be a directory.";
                    var3_7 = var3_7.toString();
                    var1_1 = new IllegalStateException(var3_7);
                    throw var1_1;
                }
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hn2_2 b() {
        synchronized (this) {
            this.h();
            return this.e;
        }
    }

    public final Fe1$a c() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    boolean bl2 = true;
                    try {
                        this.b = bl2;
                        object = this.c;
                        if (object == null) break block4;
                        m.a((Closeable)object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if ((object = this.e) != null) {
                    vn1_2 vn1_22 = hm0_2.a;
                    vn1_22.getClass();
                    String string2 = "path";
                    Intrinsics.checkNotNullParameter(object, string2);
                    vn1_22.d((hn2_2)object);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final se_1 d() {
        synchronized (this) {
            this.h();
            Object object = this.c;
            if (object != null) {
                return object;
            }
            object = hm0_2.a;
            hn2_2 hn2_22 = this.e;
            Intrinsics.checkNotNull(hn2_22);
            object = ((vn1_2)object).l(hn2_22);
            this.c = object = o72_0.b((a93_0)object);
            return object;
        }
    }

    public final void h() {
        boolean bl2 = this.b ^ true;
        if (bl2) {
            return;
        }
        String string2 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}


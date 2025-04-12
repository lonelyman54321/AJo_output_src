/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/*
 * Renamed from zC0
 */
public final class zc0_2 {
    public final RealCall a;
    public final ib0_2 b;
    public final jc0_2 c;
    public final ac0_2 d;
    public boolean e;
    public boolean f;
    public final je2_2 g;

    public zc0_2(RealCall object, IB0$a iB0$a, jc0_2 jc0_22, ac0_2 ac0_22) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(iB0$a, "eventListener");
        Intrinsics.checkNotNullParameter(jc0_22, "finder");
        Intrinsics.checkNotNullParameter(ac0_22, "codec");
        this.a = object;
        this.b = iB0$a;
        this.c = jc0_22;
        this.d = ac0_22;
        this.g = object = ac0_22.d();
    }

    public final IOException a(boolean bl2, boolean bl3, IOException iOException) {
        if (iOException != null) {
            this.e(iOException);
        }
        String string2 = "ioe";
        String string3 = "call";
        ib0_2 ib0_22 = this.b;
        RealCall realCall = this.a;
        if (bl3) {
            if (iOException != null) {
                ib0_22.getClass();
                Intrinsics.checkNotNullParameter(realCall, string3);
                Intrinsics.checkNotNullParameter(iOException, string2);
            } else {
                ib0_22.getClass();
                Intrinsics.checkNotNullParameter(realCall, string3);
            }
        }
        if (bl2) {
            if (iOException != null) {
                ib0_22.getClass();
                Intrinsics.checkNotNullParameter(realCall, string3);
                Intrinsics.checkNotNullParameter(iOException, string2);
            } else {
                ib0_22.getClass();
                Intrinsics.checkNotNullParameter(realCall, string3);
            }
        }
        return realCall.i(this, bl3, bl2, iOException);
    }

    public final zC0$a b(kj2_2 object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "request");
        this.e = bl2;
        Object object2 = ((kj2_2)object).d;
        Intrinsics.checkNotNull(object2);
        long l2 = ((pj2_2)object2).contentLength();
        this.b.getClass();
        Intrinsics.checkNotNullParameter(this.a, "call");
        object = this.d.e((kj2_2)object, l2);
        object2 = new zC0$a(this, (y63_0)object, l2);
        return object2;
    }

    public final ve2_2 c(cl2_2 closeable) {
        Object object = this.d;
        Intrinsics.checkNotNullParameter(closeable, "response");
        String string2 = "Content-Type";
        try {
            string2 = cl2_2.c(closeable, string2);
        }
        catch (IOException iOException) {
            this.b.getClass();
            Intrinsics.checkNotNullParameter(this.a, "call");
            Intrinsics.checkNotNullParameter(iOException, "ioe");
            this.e(iOException);
            throw iOException;
        }
        long l2 = object.c((cl2_2)closeable);
        closeable = object.a((cl2_2)closeable);
        object = new zC0$b(this, (a93_0)closeable, l2);
        object = o72_0.b((a93_0)object);
        closeable = new ve2_2(string2, l2, (ie2_2)object);
        return closeable;
    }

    public final cl2$a_0 d(boolean bl2) {
        cl2$a_0 cl2$a_0;
        block5: {
            Object object;
            try {
                object = this.d;
            }
            catch (IOException iOException) {
                this.b.getClass();
                Intrinsics.checkNotNullParameter(this.a, "call");
                Intrinsics.checkNotNullParameter(iOException, "ioe");
                this.e(iOException);
                throw iOException;
            }
            cl2$a_0 = object.g(bl2);
            if (cl2$a_0 == null) break block5;
            object = "deferredTrailers";
            Intrinsics.checkNotNullParameter(this, (String)object);
            cl2$a_0.m = this;
        }
        return cl2$a_0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(IOException var1_1) {
        var2_3 = 1;
        this.f = var2_3;
        this.c.c(var1_1 /* !! */ );
        var3_4 = this.d.d();
        var4_5 /* !! */  = this.a;
        synchronized (var3_4) {
            block13: {
                block12: {
                    block11: {
                        var5_6 /* !! */  = "call";
                        try {
                            Intrinsics.checkNotNullParameter(var4_5 /* !! */ , (String)var5_6 /* !! */ );
                        }
                        catch (Throwable var1_2) {
                            break block13;
                        }
                        var6_7 = var1_1 /* !! */  instanceof StreamResetException;
                        if (var6_7 == 0) ** GOTO lbl33
                        var5_6 /* !! */  = var1_1 /* !! */ ;
                        {
                            var5_6 /* !! */  = (StreamResetException)var1_1 /* !! */ ;
                            var5_6 /* !! */  = var5_6 /* !! */ .a;
                            var7_8 = ta0_2.REFUSED_STREAM;
                            if (var5_6 /* !! */  != var7_8) break block11;
                        }
                        var3_4.n = var8_9 = var3_4.n + var2_3;
                        if (var8_9 > var2_3) {
                            var3_4.j = var2_3;
                            var3_4.l = var8_9 = var3_4.l + var2_3;
                        }
                        ** GOTO lbl48
                    }
                    var1_1 /* !! */  = (StreamResetException)var1_1 /* !! */ ;
                    {
                        var1_1 /* !! */  = var1_1 /* !! */ .a;
                        var5_6 /* !! */  = ta0_2.CANCEL;
                        if (var1_1 /* !! */  != var5_6 /* !! */  || (var8_10 = var4_5 /* !! */ .p) == 0) {
                            var3_4.j = var2_3;
                            var3_4.l = var8_10 = var3_4.l + var2_3;
                        }
                        ** GOTO lbl48
lbl33:
                        // 1 sources

                        var5_6 /* !! */  = var3_4.g;
                        if (var5_6 /* !! */  != null) {
                            var6_7 = 1;
                            break block12;
                        }
                        var6_7 = 0;
                        var5_6 /* !! */  = null;
                    }
                }
                if (var6_7 != 0 && (var6_7 = var1_1 /* !! */  instanceof ConnectionShutdownException) == 0) ** GOTO lbl48
                {
                    var3_4.j = var2_3;
                    var6_7 = var3_4.m;
                    if (var6_7 == 0) {
                        var4_5 /* !! */  = var4_5 /* !! */ .a;
                        var5_6 /* !! */  = var3_4.b;
                        je2_2.d((x72_0)var4_5 /* !! */ , (wp2_2)var5_6 /* !! */ , var1_1 /* !! */ );
                        var3_4.l = var8_11 = var3_4.l + var2_3;
                    }
lbl48:
                    // 6 sources

                    return;
                }
            }
            throw var1_2;
        }
    }

    public final void f(kj2_2 kj2_22) {
        String string2 = "call";
        RealCall realCall = this.a;
        ib0_2 ib0_22 = this.b;
        String string3 = "request";
        Intrinsics.checkNotNullParameter(kj2_22, string3);
        try {
            ib0_22.getClass();
        }
        catch (IOException iOException) {
            ib0_22.getClass();
            Intrinsics.checkNotNullParameter(realCall, string2);
            Intrinsics.checkNotNullParameter(iOException, "ioe");
            this.e(iOException);
            throw iOException;
        }
        Intrinsics.checkNotNullParameter(realCall, string2);
        ac0_2 ac0_22 = this.d;
        ac0_22.f(kj2_22);
        Intrinsics.checkNotNullParameter(realCall, string2);
        Intrinsics.checkNotNullParameter(kj2_22, string3);
    }
}


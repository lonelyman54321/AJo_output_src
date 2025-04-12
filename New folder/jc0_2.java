/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.a;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/*
 * Renamed from JC0
 */
public final class jc0_2 {
    public final a a;
    public final h4_0 b;
    public final RealCall c;
    public final ib0_2 d;
    public aq2$a_0 e;
    public aq2_2 f;
    public int g;
    public int h;
    public int i;
    public wp2_2 j;

    public jc0_2(a a2, h4_0 h4_02, RealCall realCall, IB0$a iB0$a) {
        Intrinsics.checkNotNullParameter(a2, "connectionPool");
        Intrinsics.checkNotNullParameter(h4_02, "address");
        Intrinsics.checkNotNullParameter(realCall, "call");
        Intrinsics.checkNotNullParameter(iB0$a, "eventListener");
        this.a = a2;
        this.b = h4_02;
        this.c = realCall;
        this.d = iB0$a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final je2_2 a(int var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5, boolean var6_6) {
        var7_7 = this;
        var8_8 = true;
        do {
            block25: {
                block22: {
                    block29: {
                        block28: {
                            block27: {
                                block26: {
                                    block23: {
                                        block24: {
                                            var9_9 = var7_7.c;
                                            var10_10 = var9_9.p;
                                            if (var10_10 != 0) {
                                                var15_30 = new IOException("Canceled");
                                                throw var15_30;
                                            }
                                            var9_9 = var7_7.c.j;
                                            var11_11 = false;
                                            var12_12 = null;
                                            if (var9_9 == null) break block23;
                                            synchronized (var9_9) {
                                                block20: {
                                                    block19: {
                                                        try {
                                                            var13_13 = var9_9.j;
                                                            if (var13_13 != 0) break block19;
                                                            var14_14 = var9_9.b;
                                                            var14_14 = var14_14.a;
                                                            var14_14 = var14_14.i;
                                                            var13_13 = this.b((ob1_1)var14_14);
                                                            if (var13_13 == 0) break block19;
                                                            var13_13 = 0;
                                                            var14_14 = null;
                                                            break block20;
                                                        }
                                                        catch (Throwable var15_23) {
                                                            ** break block21
                                                        }
                                                    }
                                                    var14_14 = var7_7.c;
                                                    var14_14 = var14_14.k();
                                                }
                                                var16_15 = Unit.a;
                                            }
                                            var16_15 = var7_7.c.j;
                                            if (var16_15 == null) break block24;
                                            if (var14_14 != null) {
                                                var15_24 = "Check failed.".toString();
                                                var9_9 = new IllegalStateException(var15_24);
                                                throw var9_9;
                                            }
                                            break block25;
                                        }
                                        if (var14_14 != null) {
                                            ez3.d((Socket)var14_14);
                                        }
                                        var14_14 = var7_7.d;
                                        var16_15 = var7_7.c;
                                        var14_14.getClass();
                                        Intrinsics.checkNotNullParameter(var16_15, "call");
                                        var14_14 = "connection";
                                        Intrinsics.checkNotNullParameter(var9_9, (String)var14_14);
                                        break block23;
lbl-1000:
                                        // 1 sources

                                        {
                                            throw var15_23;
                                        }
                                    }
                                    var10_10 = 0;
                                    var9_9 = null;
                                    var7_7.g = 0;
                                    var7_7.h = 0;
                                    var7_7.i = 0;
                                    var14_14 = var7_7.a;
                                    var16_15 = var7_7.b;
                                    var17_16 = var7_7.c;
                                    var13_13 = var14_14.a((h4_0)var16_15, (RealCall)var17_16, null, false);
                                    if (var13_13 == 0) break block26;
                                    var9_9 = var7_7.c.j;
                                    Intrinsics.checkNotNull(var9_9);
                                    var12_12 = var7_7.d;
                                    var14_14 = var7_7.c;
                                    var12_12.getClass();
                                    Intrinsics.checkNotNullParameter(var14_14, "call");
                                    var12_12 = "connection";
                                    Intrinsics.checkNotNullParameter(var9_9, (String)var12_12);
                                    break block25;
                                }
                                var14_14 = var7_7.j;
                                if (var14_14 == null) break block27;
                                Intrinsics.checkNotNull(var14_14);
                                var7_7.j = null;
                                break block28;
                            }
                            var14_14 = var7_7.e;
                            if (var14_14 == null) break block29;
                            Intrinsics.checkNotNull(var14_14);
                            var13_13 = var14_14.a();
                            if (var13_13 == 0) break block29;
                            var9_9 = var7_7.e;
                            Intrinsics.checkNotNull(var9_9);
                            var13_13 = var9_9.a();
                            if (var13_13 == 0) {
                                var15_25 = new NoSuchElementException();
                                throw var15_25;
                            }
                            var13_13 = var9_9.b;
                            var9_9.b = var18_17 = var13_13 + 1;
                            var14_14 = var9_9 = var9_9.a.get(var13_13);
                            var14_14 = (wp2_2)var9_9;
                        }
                        var18_17 = 0;
                        var16_15 = null;
                        ** GOTO lbl136
                    }
                    if ((var14_14 = var7_7.f) == null) {
                        var16_15 = var7_7.b;
                        var17_16 = var7_7.c;
                        var19_18 = var17_16.a.D;
                        var20_19 = var7_7.d;
                        var7_7.f = var14_14 = new aq2_2((h4_0)var16_15, (yp2_2)var19_18, (ij_2)var17_16, (ib0_2)var20_19);
                    }
                    var7_7.e = var14_14 = var14_14.b();
                    var16_15 = var14_14.a;
                    var17_16 = var7_7.c;
                    var21_20 = var17_16.p;
                    if (var21_20 != 0) {
                        var15_29 = new IOException("Canceled");
                        throw var15_29;
                    }
                    var17_16 = var7_7.a;
                    var19_18 = var7_7.b;
                    var20_19 = var7_7.c;
                    var10_10 = var17_16.a((h4_0)var19_18, (RealCall)var20_19, (List)var16_15, false);
                    if (var10_10 != 0) {
                        var9_9 = var7_7.c.j;
                        Intrinsics.checkNotNull(var9_9);
                        var12_12 = var7_7.d;
                        var14_14 = var7_7.c;
                        var12_12.getClass();
                        Intrinsics.checkNotNullParameter(var14_14, "call");
                        var12_12 = "connection";
                        Intrinsics.checkNotNullParameter(var9_9, (String)var12_12);
                    } else {
                        var10_10 = var14_14.a();
                        if (var10_10 == 0) {
                            var15_28 = new NoSuchElementException();
                            throw var15_28;
                        }
                        var10_10 = var14_14.b;
                        var14_14.b = var21_20 = var10_10 + 1;
                        var14_14 = var9_9 = var14_14.a.get(var10_10);
                        var14_14 = (wp2_2)var9_9;
lbl136:
                        // 2 sources

                        var17_16 = var7_7.a;
                        var9_9 = new je2_2((a)var17_16, (wp2_2)var14_14);
                        var17_16 = var7_7.c;
                        var17_16.r = var9_9;
                        var22_21 = var7_7.c;
                        var23_22 = var7_7.d;
                        var17_16 = var9_9;
                        var9_9.c(var1_1, var2_2, var3_3, var4_4, var5_5, var22_21, var23_22);
                        var12_12 = var7_7.c.a.D;
                        var17_16 = var9_9.b;
                        var12_12.a((wp2_2)var17_16);
                        var12_12 = var7_7.a;
                        var17_16 = var7_7.b;
                        var19_18 = var7_7.c;
                        var11_11 = var12_12.a((h4_0)var17_16, (RealCall)var19_18, (List)var16_15, var8_8);
                        if (!var11_11) break block22;
                        var12_12 = var7_7.c.j;
                        Intrinsics.checkNotNull(var12_12);
                        var7_7.j = var14_14;
                        var9_9 = var9_9.d;
                        Intrinsics.checkNotNull(var9_9);
                        ez3.d((Socket)var9_9);
                        var9_9 = var7_7.d;
                        var14_14 = var7_7.c;
                        var9_9.getClass();
                        Intrinsics.checkNotNullParameter(var14_14, "call");
                        Intrinsics.checkNotNullParameter(var12_12, "connection");
                        var9_9 = var12_12;
                    }
                    break block25;
                }
                synchronized (var9_9) {
                    var12_12 = var7_7.a;
                    var12_12.c((je2_2)var9_9);
                    var12_12 = var7_7.c;
                    var12_12.d((je2_2)var9_9);
                    var12_12 = Unit.a;
                }
                var12_12 = var7_7.d;
                var14_14 = var7_7.c;
                var12_12.getClass();
                Intrinsics.checkNotNullParameter(var14_14, "call");
                var12_12 = "connection";
                Intrinsics.checkNotNullParameter(var9_9, (String)var12_12);
            }
            var11_11 = var6_6;
            var13_13 = var9_9.j(var6_6);
            if (var13_13 != 0) {
                return var9_9;
            }
            var9_9.l();
        } while ((var9_9 = var7_7.j) != null || (var10_10 = (var9_9 = var7_7.e) != null ? var9_9.a() : 1) != 0 || (var10_10 = (var9_9 = var7_7.f) != null ? var9_9.a() : 1) != 0);
        var15_26 = new IOException("exhausted all routes");
        throw var15_26;
        finally {
            var7_7.c.r = null;
        }
    }

    public final boolean b(ob1_1 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "url");
        Object object2 = this.b.i;
        int n3 = ((ob1_1)object).e;
        int n4 = ((ob1_1)object2).e;
        if (n3 == n4 && (bl2 = Intrinsics.areEqual(object = ((ob1_1)object).d, object2 = ((ob1_1)object2).d))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c(IOException iOException) {
        int n3;
        Intrinsics.checkNotNullParameter(iOException, "e");
        Object var2_2 = null;
        this.j = null;
        boolean bl2 = iOException instanceof StreamResetException;
        if (bl2) {
            IOException iOException2 = iOException;
            ta0_2 ta0_22 = ((StreamResetException)iOException).a;
            ta0_2 ta0_23 = ta0_2.REFUSED_STREAM;
            if (ta0_22 == ta0_23) {
                int n4;
                this.g = n4 = this.g + 1;
                return;
            }
        }
        if ((n3 = iOException instanceof ConnectionShutdownException) != 0) {
            this.h = n3 = this.h + 1;
            return;
        }
        this.i = n3 = this.i + 1;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.connection.RealCall;

/*
 * Renamed from EM2
 */
public final class em2_1
implements nj1_2 {
    public final x72_0 a;

    public em2_1(x72_0 x72_02) {
        Intrinsics.checkNotNullParameter(x72_02, "client");
        this.a = x72_02;
    }

    public static int c(cl2_2 object, int n3) {
        String string2 = "Retry-After";
        if ((object = cl2_2.c((cl2_2)object, string2)) == null) {
            return n3;
        }
        string2 = "\\d+";
        Regex regex = new Regex(string2);
        n3 = (int)(regex.c((CharSequence)object) ? 1 : 0);
        if (n3 != 0) {
            object = Integer.valueOf((String)object);
            Intrinsics.checkNotNullExpressionValue(object, "valueOf(header)");
            return ((Number)object).intValue();
        }
        return -1 >>> 1;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final kj2_2 a(cl2_2 var1_1, zc0_2 var2_2) {
        block29: {
            var3_3 = null;
            if (var2_2 != null && (var4_4 = var2_2.g) != null) {
                var4_4 = var4_4.b;
            } else {
                var5_5 = 0;
                var4_4 = null;
            }
            var6_6 = var1_1.d;
            var7_7 = var1_1.a;
            var8_8 = var7_7.b;
            var9_9 = false;
            var10_10 = 308;
            var11_11 = 307;
            var12_12 = 1;
            if (var6_6 == var11_11 || var6_6 == var10_10) break block29;
            var13_13 = 401;
            if (var6_6 == var13_13) {
                this.a.g.a((wp2_2)var4_4, (cl2_2)var1_1);
                return null;
            }
            var13_13 = 421;
            if (var6_6 == var13_13) ** GOTO lbl57
            var14_14 = 503;
            if (var6_6 == var14_14) ** GOTO lbl51
            var14_14 = 407;
            if (var6_6 == var14_14) ** GOTO lbl43
            var14_14 = 408;
            if (var6_6 == var14_14) ** GOTO lbl30
            switch (var6_6) {
                default: {
                    return null;
                }
lbl30:
                // 1 sources

                var4_4 = this.a;
                var5_5 = (int)var4_4.f;
                if (var5_5 == 0) {
                    return null;
                }
                var4_4 = var7_7.d;
                if (var4_4 != null && (var5_5 = (int)var4_4.isOneShot()) != 0) {
                    return null;
                }
                var4_4 = var1_1.j;
                if (var4_4 != null && (var5_5 = var4_4.d) == var14_14) {
                    return null;
                }
                var14_14 = em2_1.c((cl2_2)var1_1, 0);
                if (var14_14 <= 0) return var1_1.a;
                return null;
lbl43:
                // 1 sources

                Intrinsics.checkNotNull(var4_4);
                var2_2 = var4_4.b.type();
                var15_15 = Proxy.Type.HTTP;
                if (var2_2 == var15_15) {
                    this.a.o.a((wp2_2)var4_4, (cl2_2)var1_1);
                    return null;
                }
                var1_1 = new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                throw var1_1;
lbl51:
                // 1 sources

                var4_4 = var1_1.j;
                if (var4_4 != null && (var5_5 = var4_4.d) == var14_14) {
                    return null;
                }
                var14_14 = em2_1.c((cl2_2)var1_1, -1 >>> 1);
                if (var14_14 != 0) return null;
                return var1_1.a;
lbl57:
                // 1 sources

                var4_4 = var7_7.d;
                if (var4_4 != null && (var5_5 = var4_4.isOneShot()) != 0) {
                    return null;
                }
                if (var2_2 == null) return null;
                var4_4 = var2_2.c.b.i.d;
                var15_16 = var2_2.g.b.a.i.d;
                var5_5 = Intrinsics.areEqual(var4_4, var15_16) ^ var12_12;
                if (var5_5 == 0) {
                    return null;
                }
                var2_2 = var2_2.g;
                synchronized (var2_2) {
                    var2_2.k = var12_12;
                    return var1_1.a;
                }
                case 300: 
                case 301: 
                case 302: 
                case 303: 
            }
        }
        var2_2 = this.a;
        var5_5 = var2_2.h;
        if (var5_5 == 0) {
            return var3_3;
        }
        var4_4 = cl2_2.c((cl2_2)var1_1, "Location");
        if (var4_4 == null) {
            return var3_3;
        }
        var15_17 = var1_1.a;
        var7_7 = var15_17.a;
        var7_7.getClass();
        var16_18 = "link";
        Intrinsics.checkNotNullParameter(var4_4, var16_18);
        var4_4 = var7_7.g((String)var4_4);
        if (var4_4 != null) {
            var4_4 = var4_4.b();
        } else {
            var5_5 = 0;
            var4_4 = null;
        }
        if (var4_4 == null) {
            return var3_3;
        }
        var16_18 = var4_4.a;
        var7_7 = var15_17.a.a;
        var17_19 = Intrinsics.areEqual(var16_18, var7_7);
        if (!var17_19 && (var14_14 = (int)var2_2.i) == 0) {
            return var3_3;
        }
        var2_2 = var15_17.c();
        var17_19 = nk_0.e(var8_8);
        if (var17_19) {
            var7_7 = "method";
            Intrinsics.checkNotNullParameter(var8_8, (String)var7_7);
            var16_18 = "PROPFIND";
            var18_20 = Intrinsics.areEqual(var8_8, var16_18);
            var19_21 = var1_1.d;
            if (var18_20 || var19_21 == var10_10 || var19_21 == var11_11) {
                var9_9 = true;
            }
            Intrinsics.checkNotNullParameter(var8_8, (String)var7_7);
            var17_19 = Intrinsics.areEqual(var8_8, var16_18) ^ var12_12;
            if (var17_19 && var19_21 != var10_10 && var19_21 != var11_11) {
                var1_1 = "GET";
                var2_2.e((String)var1_1, null);
            } else {
                if (var9_9) {
                    var3_3 = var15_17.d;
                }
                var2_2.e(var8_8, (pj2_2)var3_3);
            }
            if (!var9_9) {
                var2_2.f("Transfer-Encoding");
                var2_2.f("Content-Length");
                var1_1 = "Content-Type";
                var2_2.f((String)var1_1);
            }
        }
        if ((var19_21 = ez3.a((ob1_1)(var1_1 = var15_17.a), (ob1_1)var4_4)) == 0) {
            var1_1 = "Authorization";
            var2_2.f((String)var1_1);
        }
        var1_1 = "url";
        Intrinsics.checkNotNullParameter(var4_4, (String)var1_1);
        var2_2.a = var4_4;
        return var2_2.b();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(IOException var1_1, RealCall var2_3, kj2_2 var3_4, boolean var4_5) {
        block21: {
            block22: {
                block20: {
                    var5_5 = this.a;
                    var6_6 = var5_5.f;
                    if (var6_6 == 0) {
                        return false;
                    }
                    if (var4_4 != 0) {
                        var3_3 = var3_3.d;
                        if (var3_3 != null) {
                            var7_7 = var3_3.isOneShot();
                            if (var7_7 != 0) return false;
                        }
                        if ((var7_7 = var1_1 instanceof FileNotFoundException) != 0) {
                            return false;
                        }
                    }
                    if ((var7_7 = var1_1 instanceof ProtocolException) != 0) {
                        return false;
                    }
                    var7_7 = var1_1 instanceof InterruptedIOException;
                    if (var7_7 != 0) {
                        var8_8 = var1_1 instanceof SocketTimeoutException;
                        if (var8_8 == false) return false;
                        if (var4_4 != false) return false;
                    } else {
                        var7_7 = var1_1 instanceof SSLHandshakeException;
                        if (var7_7 != 0 && (var7_7 = (var3_3 = ((Throwable)var1_1).getCause()) instanceof CertificateException) != 0) {
                            return false;
                        }
                        var8_8 = var1_1 instanceof SSLPeerUnverifiedException;
                        if (var8_8) {
                            return false;
                        }
                    }
                    var1_1 = var2_2.i;
                    Intrinsics.checkNotNull(var1_1);
                    var9_9 = var1_1.g;
                    var7_7 = 1;
                    if (var9_9 != 0 || (var4_4 = var1_1.h) != 0 || (var4_4 = var1_1.i) != 0) break block20;
                    var8_8 = false;
                    var1_1 = null;
                    break block21;
                }
                var10_10 = var1_1.j;
                if (var10_10 != null) ** GOTO lbl-1000
                var4_4 = 0;
                var10_10 = null;
                if (var9_9 <= var7_7 && (var9_9 = var1_1.h) <= var7_7 && (var9_9 = var1_1.i) <= 0 && (var2_2 = var1_1.c.j) != null) {
                    synchronized (var2_2) {
                        var6_6 = var2_2.l;
                        if (var6_6 != 0) {
                        } else {
                            var5_5 = var2_2.b;
                            var5_5 = var5_5.a;
                            var5_5 = var5_5.i;
                            var11_11 = var1_1.b;
                            var11_11 = var11_11.i;
                            var6_6 = (int)ez3.a((ob1_1)var5_5, (ob1_1)var11_11);
                            if (var6_6 == 0) {
                            } else {
                                var10_10 = var2_2.b;
                            }
                        }
                    }
                }
                if (var10_10 == null) break block22;
                var1_1.j = var10_10;
                ** GOTO lbl-1000
            }
            var2_2 = var1_1.e;
            if (var2_2 != null && (var9_9 = (int)var2_2.a()) == var7_7 || (var1_1 = var1_1.f) == null) lbl-1000:
            // 3 sources

            {
                var8_8 = true;
            } else {
                var8_8 = var1_1.a();
            }
        }
        if (var8_8 != false) return (boolean)var7_7;
        return false;
    }

    /*
     * Exception decompiling
     */
    public final cl2_2 intercept(nj1$a var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [14 : 456->459)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}


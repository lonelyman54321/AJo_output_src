/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/*
 * Renamed from MG
 */
public final class mg_1
implements vq1_1,
i90_0 {
    public final CoroutineContext a;

    /*
     * Enabled aggressive block sorting
     */
    public mg_1(CoroutineContext coroutineContext, uf_1 uf_12, String string2, Long l2) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        Ref$IntRef ref$IntRef;
        int n19;
        int n20;
        Object object;
        int n21;
        Object object2;
        Object object3;
        Object object4;
        mg_1 mg_12;
        block25: {
            mg_12 = this;
            object4 = coroutineContext;
            object3 = uf_12;
            object2 = string2;
            n21 = 1;
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            Intrinsics.checkNotNullParameter(uf_12, "channel");
            object = "contentType";
            Intrinsics.checkNotNullParameter(string2, (String)object);
            this.a = coroutineContext;
            object4 = hr1_2.a;
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(uf_12, "input");
            Intrinsics.checkNotNullParameter(string2, (String)object);
            object4 = k70$c.a;
            Intrinsics.checkNotNullParameter(string2, (String)object);
            object4 = "multipart/";
            n20 = StringsKt.c0(string2, (String)object4, n21 != 0);
            if (n20 == 0) {
                object3 = new StringBuilder("Failed to parse multipart: Content-Type should be multipart/* but it is ");
                ((StringBuilder)object3).append((Object)string2);
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object3, "message");
                object4 = new IOException((String)object3);
                throw object4;
            }
            Intrinsics.checkNotNullParameter(string2, (String)object);
            n20 = string2.length();
            n19 = 0;
            object = null;
            int n22 = 0;
            ref$IntRef = null;
            n18 = 0;
            while (true) {
                block31: {
                    block35: {
                        block32: {
                            block26: {
                                block36: {
                                    block33: {
                                        block34: {
                                            block27: {
                                                block30: {
                                                    block28: {
                                                        block29: {
                                                            n17 = 4;
                                                            n16 = 92;
                                                            n15 = 3;
                                                            n14 = 34;
                                                            n10 = 44;
                                                            n8 = 59;
                                                            n7 = 2;
                                                            if (n19 >= n20) break;
                                                            n4 = ((String)object2).charAt(n19);
                                                            if (n22 == 0) break block26;
                                                            if (n22 == n21) break block27;
                                                            if (n22 == n7) break block28;
                                                            if (n22 == n15) break block29;
                                                            if (n22 == n17) break block30;
                                                            break block31;
                                                        }
                                                        if (n4 == n14) break block32;
                                                        if (n4 == n16) {
                                                            n22 = 4;
                                                        }
                                                        break block31;
                                                    }
                                                    if (n4 == n14) break block30;
                                                    if (n4 == n10) break block33;
                                                    if (n4 == n8) break block32;
                                                    break block31;
                                                }
                                                n22 = 3;
                                                break block31;
                                            }
                                            n17 = 61;
                                            if (n4 != n17) break block34;
                                            n22 = 2;
                                            break block31;
                                        }
                                        if (n4 == n8) break block35;
                                        if (n4 != n10) break block36;
                                    }
                                    n22 = 0;
                                    ref$IntRef = null;
                                    break block31;
                                }
                                n17 = 32;
                                if (n4 != n17) {
                                    if (n18 == 0 && (n17 = (int)(StringsKt.b0(n19, (String)object2) ? 1 : 0)) != 0) {
                                        n20 = -1;
                                        break block25;
                                    }
                                    n18 += n21;
                                }
                                break block31;
                            }
                            if (n4 != n8) break block31;
                        }
                        n22 = 1;
                    }
                    n18 = 0;
                }
                n19 += n21;
            }
            n20 = -1;
            n19 = -1;
        }
        if (n19 == n20) {
            object4 = new IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
            throw object4;
        }
        n19 += 9;
        n20 = 74;
        object4 = new byte[n20];
        ref$IntRef = new Ref$IntRef();
        hr1_2.c(ref$IntRef, (byte[])object4, (byte)13);
        hr1_2.c(ref$IntRef, (byte[])object4, (byte)10);
        n18 = 45;
        hr1_2.c(ref$IntRef, (byte[])object4, (byte)n18);
        hr1_2.c(ref$IntRef, (byte[])object4, (byte)n18);
        n18 = string2.length();
        n17 = n19;
        n19 = 0;
        object = null;
        while (n17 < n18) {
            block38: {
                block37: {
                    char c2;
                    n4 = ((String)object2).charAt(n17);
                    n8 = n4 & (c2 = (char)-1);
                    if (n8 > (n10 = 127)) {
                        object3 = new StringBuilder("Failed to parse multipart: wrong boundary byte 0x");
                        int n24 = CharsKt.checkRadix(16);
                        object2 = Integer.toString(n8, n24);
                        Intrinsics.checkNotNullExpressionValue(object2, "toString(...)");
                        ((StringBuilder)object3).append((String)object2);
                        ((StringBuilder)object3).append(" - should be 7bit character");
                        object3 = ((StringBuilder)object3).toString();
                        object4 = new IOException((String)object3);
                        throw object4;
                    }
                    if (n19 == 0) break block37;
                    if (n19 != n21) {
                        if (n19 != n7) {
                            if (n19 == n15) {
                                n19 = (byte)n8;
                                hr1_2.c(ref$IntRef, (byte[])object4, (byte)n19);
                                n19 = 2;
                            }
                        } else {
                            if (n4 == n14) break;
                            if (n4 != n16) {
                                n8 = (byte)n8;
                                hr1_2.c(ref$IntRef, (byte[])object4, (byte)n8);
                            } else {
                                n19 = 3;
                            }
                        }
                        n7 = 44;
                        n16 = 59;
                        n10 = 32;
                        break block38;
                    } else {
                        n10 = 32;
                        if (n4 == n10 || n4 == (n7 = 44) || n4 == (n16 = 59)) break;
                        n8 = (byte)n8;
                        hr1_2.c(ref$IntRef, (byte[])object4, (byte)n8);
                    }
                    break block38;
                }
                n7 = 44;
                n16 = 59;
                n10 = 32;
                if (n4 != n10) {
                    if (n4 != n14) {
                        if (n4 == n7 || n4 == n16) break;
                        n19 = (byte)n8;
                        hr1_2.c(ref$IntRef, (byte[])object4, (byte)n19);
                        n19 = 1;
                    } else {
                        n19 = 2;
                    }
                }
            }
            n17 += n21;
            n7 = 2;
            n8 = 59;
            n16 = 92;
            n10 = 44;
        }
        if ((n3 = ref$IntRef.element) != (n19 = 4)) {
            er1_2 er1_22;
            object4 = rp_1.l(0, (byte[])object4, n3);
            object2 = new ef_2((byte[])object4, 0);
            object4 = er1_22;
            object3 = uf_12;
            er1_22 = new er1_2(uf_12, (ef_2)object2, 65536L, l2, null);
            object4 = f.a;
            object3 = he_2.SUSPEND;
            object2 = l90_0.DEFAULT;
            object3 = sr_2.a(0, 4, (he_2)((Object)object3));
            object4 = a90_0.b(mg_12, (CoroutineContext)object4);
            object = new fr_2((CoroutineContext)object4, (le_2)object3, n21 != 0, n21 != 0);
            ((l90_0)((Object)object2)).invoke(er1_22, object, (f80_0)object);
            return;
        }
        object4 = new IOException("Empty multipart boundary is not allowed");
        throw object4;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }
}


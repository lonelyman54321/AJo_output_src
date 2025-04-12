/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.os.CancellationSignal
 *  android.os.CancellationSignal$OnCancelListener
 *  android.view.inputmethod.DeleteGesture
 *  android.view.inputmethod.DeleteRangeGesture
 *  android.view.inputmethod.HandwritingGesture
 *  android.view.inputmethod.InsertGesture
 *  android.view.inputmethod.JoinOrSplitGesture
 *  android.view.inputmethod.PreviewableHandwritingGesture
 *  android.view.inputmethod.RemoveSpaceGesture
 *  android.view.inputmethod.SelectGesture
 *  android.view.inputmethod.SelectRangeGesture
 */
import android.graphics.PointF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;

public final class q31 {
    public static final q31 a;

    static {
        q31 q312;
        a = q312 = new Object();
    }

    private final void C(Vt1 object, SelectGesture selectGesture, Sk3 sk3) {
        if (sk3 != null) {
            Object object2 = cf_2.g(b31_0.a(selectGesture));
            int n3 = c31_0.a(selectGesture);
            n3 = this.G(n3);
            long l2 = s31.d(object, (aG2)object2, n3);
            object2 = sk3.d;
            if (object2 != null) {
                ((Vt1)object2).g(l2);
            }
            object2 = sk3.d;
            if (object2 != null) {
                long l3 = mm3.b;
                ((Vt1)object2).f(l3);
            }
            boolean bl2 = mm3.b(l2);
            if (!bl2) {
                bl2 = false;
                sk3.t(false);
                object = x21_0.None;
                sk3.r((x21_0)((Object)object));
            }
        }
    }

    private final void D(er3 er32, SelectGesture selectGesture, Vl3 vl3) {
        cf_2.g(b31_0.a(selectGesture));
        int n3 = c31_0.a(selectGesture);
        this.G(n3);
        throw null;
    }

    private final void E(Vt1 object, SelectRangeGesture selectRangeGesture, Sk3 sk3) {
        if (sk3 != null) {
            Object object2 = cf_2.g(L21.a(selectRangeGesture));
            aG2 aG22 = cf_2.g(W21.a(selectRangeGesture));
            int n3 = f31_0.a(selectRangeGesture);
            n3 = this.G(n3);
            long l2 = s31.a(object, (aG2)object2, aG22, n3);
            object2 = sk3.d;
            if (object2 != null) {
                ((Vt1)object2).g(l2);
            }
            object2 = sk3.d;
            if (object2 != null) {
                long l3 = mm3.b;
                ((Vt1)object2).f(l3);
            }
            boolean bl2 = mm3.b(l2);
            if (!bl2) {
                bl2 = false;
                sk3.t(false);
                object = x21_0.None;
                sk3.r((x21_0)((Object)object));
            }
        }
    }

    private final void F(er3 er32, SelectRangeGesture selectRangeGesture, Vl3 vl3) {
        cf_2.g(L21.a(selectRangeGesture));
        cf_2.g(W21.a(selectRangeGesture));
        int n3 = f31_0.a(selectRangeGesture);
        this.G(n3);
        throw null;
    }

    private final int G(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4;
    }

    private final int a(er3 er32, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture object, Function1 function1) {
        if ((object = h31_0.a(object)) == null) {
            return 3;
        }
        bz_0 bz_02 = new bz_0((String)object, 1);
        function1.invoke(bz_02);
        return 5;
    }

    private final int c(Vt1 object, DeleteGesture deleteGesture, Sl sl, Function1 function1) {
        boolean bl2;
        int n3 = T21.a(deleteGesture);
        n3 = this.G(n3);
        aG2 aG22 = cf_2.g(S21.a(deleteGesture));
        long l2 = s31.d((Vt1)object, aG22, n3);
        int n4 = mm3.b(l2);
        if (n4 != 0) {
            object = a;
            deleteGesture = l31_0.a(deleteGesture);
            return super.b((HandwritingGesture)deleteGesture, function1);
        }
        n4 = 1;
        if (n3 == n4) {
            bl2 = true;
        } else {
            deleteGesture = null;
            bl2 = false;
        }
        this.h(l2, sl, bl2, function1);
        return n4;
    }

    private final int d(er3 er32, DeleteGesture deleteGesture, Vl3 vl3) {
        int n3 = T21.a(deleteGesture);
        this.G(n3);
        cf_2.g(S21.a(deleteGesture));
        throw null;
    }

    private final int e(Vt1 object, DeleteRangeGesture deleteRangeGesture, Sl sl, Function1 function1) {
        boolean bl2;
        aG2 aG22;
        int n3 = k31_0.a(deleteRangeGesture);
        n3 = this.G(n3);
        aG2 aG23 = cf_2.g(i31_0.a(deleteRangeGesture));
        long l2 = s31.a((Vt1)object, aG23, aG22 = cf_2.g(j31_0.a(deleteRangeGesture)), n3);
        int n4 = mm3.b(l2);
        if (n4 != 0) {
            object = a;
            deleteRangeGesture = l31_0.a(deleteRangeGesture);
            return super.b((HandwritingGesture)deleteRangeGesture, function1);
        }
        n4 = 1;
        if (n3 == n4) {
            bl2 = true;
        } else {
            deleteRangeGesture = null;
            bl2 = false;
        }
        this.h(l2, sl, bl2, function1);
        return n4;
    }

    private final int f(er3 er32, DeleteRangeGesture deleteRangeGesture, Vl3 vl3) {
        int n3 = k31_0.a(deleteRangeGesture);
        this.G(n3);
        cf_2.g(i31_0.a(deleteRangeGesture));
        cf_2.g(j31_0.a(deleteRangeGesture));
        throw null;
    }

    private final void g(er3 er32, long l2, boolean bl2) {
        if (bl2) {
            throw null;
        }
        throw null;
    }

    private final void h(long l2, Sl object, boolean n3, Function1 function1) {
        int n4;
        long l3 = 0xFFFFFFFFL;
        if (n3 != 0) {
            n3 = mm3.c;
            n3 = (int)(l2 >> 32);
            long l4 = l2 & l3;
            int n7 = (int)l4;
            int n8 = 10;
            int n10 = n3 > 0 ? Character.codePointBefore((CharSequence)object, n3) : 10;
            int n14 = ((Sl)object).length();
            if (n7 < n14) {
                n8 = Character.codePointAt((CharSequence)object, n7);
            }
            if ((n14 = (int)(s31.g(n10) ? 1 : 0)) != 0 && ((n14 = (int)(s31.f(n8) ? 1 : 0)) != 0 || (n14 = (int)(s31.e(n8) ? 1 : 0)) != 0)) {
                while ((n3 -= (n4 = Character.charCount(n10))) != 0 && (n4 = (int)(s31.g(n10 = Character.codePointBefore((CharSequence)object, n3)) ? 1 : 0)) != 0) {
                }
                l2 = nm3.a(n3, n7);
            } else {
                n14 = (int)(s31.g(n8) ? 1 : 0);
                if (n14 != 0 && ((n14 = (int)(s31.f(n10) ? 1 : 0)) != 0 || (n10 = (int)(s31.e(n10) ? 1 : 0)) != 0)) {
                    do {
                        n4 = Character.charCount(n8);
                    } while ((n7 += n4) != (n4 = ((Sl)object).length()) && (n4 = (int)(s31.g(n8 = Character.codePointAt((CharSequence)object, n7)) ? 1 : 0)) != 0);
                    l2 = nm3.a(n3, n7);
                }
            }
        }
        n3 = (int)(l3 & l2);
        object = new N03(n3, n3);
        n4 = mm3.c(l2);
        mx0 mx02 = new jo0_0(n4, 0);
        mx0[] mx0Array = new mx0[]{object, mx02};
        mx02 = new r31(mx0Array);
        function1.invoke(mx02);
    }

    private final int k(Vt1 object, InsertGesture insertGesture, NC3 nC3, Function1 function1) {
        int n3;
        int n4;
        zp1 zp12;
        if (nC3 == null) {
            object = l31_0.a(insertGesture);
            return this.b((HandwritingGesture)object, function1);
        }
        PointF pointF = d31.a(insertGesture);
        float f5 = pointF.x;
        float f6 = pointF.y;
        long l2 = h72.a(f5, f6);
        Object object2 = ((Vt1)object).d();
        int n7 = 1;
        int n8 = -1;
        if (object2 != null && (object2 = ((Ul3)object2).a) != null && (object2 = ((Tl3)object2).b) != null && (zp12 = ((Vt1)object).c()) != null && (n4 = s31.c((RQ1)object2, l2 = zp12.n(l2), nC3)) != n8) {
            float f7 = ((RQ1)object2).d(n4);
            float f8 = ((RQ1)object2).b(n4) + f7;
            f7 = 2.0f;
            l2 = e72.a(n7, l2, f8 /= f7);
            n4 = ((RQ1)object2).e(l2);
        } else {
            n4 = -1;
            float f11 = 0.0f / 0.0f;
        }
        if (n4 != n8 && ((object = ((Vt1)object).d()) == null || (object = ((Ul3)object).a) == null || (n3 = s31.b((Tl3)object, n4)) != n7)) {
            object = e31_0.a(insertGesture);
            this.m(n4, (String)object, function1);
            return n7;
        }
        object = l31_0.a(insertGesture);
        return this.b((HandwritingGesture)object, function1);
    }

    private final int l(er3 er32, InsertGesture insertGesture, Vl3 vl3, NC3 nC3) {
        er32 = d31.a(insertGesture);
        float f5 = ((PointF)er32).x;
        float f6 = ((PointF)er32).y;
        h72.a(f5, f6);
        throw null;
    }

    private final void m(int n3, String mx0Array, Function1 function1) {
        N03 n03 = new N03(n3, n3);
        int n4 = 1;
        mx0 mx02 = new bz_0((String)mx0Array, n4);
        mx0Array = new mx0[2];
        mx0Array[0] = n03;
        mx0Array[n4] = mx02;
        mx02 = new r31(mx0Array);
        function1.invoke(mx02);
    }

    private final int n(Vt1 object, JoinOrSplitGesture joinOrSplitGesture, Sl sl, NC3 nC3, Function1 function1) {
        int n3;
        float f5;
        int n4;
        zp1 zp12;
        if (nC3 == null) {
            object = l31_0.a(joinOrSplitGesture);
            return this.b((HandwritingGesture)object, function1);
        }
        PointF pointF = g31_0.a(joinOrSplitGesture);
        float f6 = pointF.x;
        float f7 = pointF.y;
        long l2 = h72.a(f6, f7);
        Object object2 = ((Vt1)object).d();
        int n7 = 1;
        int n8 = -1;
        if (object2 != null && (object2 = ((Ul3)object2).a) != null && (object2 = ((Tl3)object2).b) != null && (zp12 = ((Vt1)object).c()) != null && (n4 = s31.c((RQ1)object2, l2 = zp12.n(l2), nC3)) != n8) {
            float f8 = ((RQ1)object2).d(n4);
            f5 = ((RQ1)object2).b(n4) + f8;
            f8 = 2.0f;
            l2 = e72.a(n7, l2, f5 /= f8);
            n4 = ((RQ1)object2).e(l2);
        } else {
            n4 = -1;
            f5 = 0.0f / 0.0f;
        }
        if (n4 != n8 && ((object = ((Vt1)object).d()) == null || (object = ((Ul3)object).a) == null || (n3 = (int)(s31.b((Tl3)object, n4) ? 1 : 0)) != n7)) {
            boolean bl2;
            int n10;
            for (n3 = n4; n3 > 0 && (bl2 = s31.f(n10 = Character.codePointBefore(sl, n3))); n3 -= n10) {
                n10 = Character.charCount(n10);
            }
            while (n4 < (n10 = sl.length()) && (bl2 = s31.f(n10 = Character.codePointAt(sl, n4)))) {
                n10 = Character.charCount(n10);
                n4 += n10;
            }
            long l3 = nm3.a(n3, n4);
            if ((n3 = (int)(mm3.b(l3) ? 1 : 0)) != 0) {
                n3 = 32;
                long l4 = l3 >> n3;
                n10 = (int)l4;
                object = " ";
                this.m(n10, (String)object, function1);
            } else {
                this.h(l3, sl, false, function1);
            }
            return n7;
        }
        object = l31_0.a(joinOrSplitGesture);
        return this.b((HandwritingGesture)object, function1);
    }

    private final int o(er3 er32, JoinOrSplitGesture joinOrSplitGesture, Vl3 vl3, NC3 nC3) {
        throw null;
    }

    private final int p(Vt1 vt1, RemoveSpaceGesture removeSpaceGesture, Sl sl, NC3 nC3, Function1 function1) {
        float f5;
        long l2;
        int n3;
        int n4;
        int n7;
        Object object;
        Object object2;
        Object object3;
        int n8;
        Object object4;
        int n10;
        int n14;
        Function1 function12;
        mx0[] mx0Array;
        block12: {
            block9: {
                long l3;
                long l4;
                float f6;
                float f7;
                block11: {
                    block10: {
                        mx0Array = nC3;
                        function12 = function1;
                        n14 = 1;
                        n10 = 2;
                        object4 = vt1.d();
                        if (object4 != null) {
                            object4 = ((Ul3)object4).a;
                        } else {
                            n8 = 0;
                            object4 = null;
                        }
                        object3 = Cj.b(removeSpaceGesture);
                        f7 = object3.x;
                        f6 = object3.y;
                        l4 = h72.a(f7, f6);
                        object2 = dj_0.b(removeSpaceGesture);
                        float f8 = ((PointF)object2).x;
                        float f11 = ((PointF)object2).y;
                        l3 = h72.a(f8, f11);
                        object = vt1.c();
                        n7 = -1;
                        if (object4 == null || object == null) break block9;
                        l4 = object.n(l4);
                        l3 = object.n(l3);
                        object4 = ((Tl3)object4).b;
                        n4 = s31.c((RQ1)object4, l4, (NC3)mx0Array);
                        n3 = s31.c((RQ1)object4, l3, (NC3)mx0Array);
                        if (n4 != n7) break block10;
                        if (n3 != n7) break block11;
                        l2 = mm3.b;
                        break block12;
                    }
                    if (n3 != n7) {
                        n4 = Math.min(n4, n3);
                    }
                    n3 = n4;
                }
                float f12 = ((RQ1)object4).d(n3);
                float f14 = ((RQ1)object4).b(n3) + f12;
                f12 = n10;
                float f15 = e72.d(l4);
                float f16 = e72.d(l3);
                f15 = Math.min(f15, f16);
                f16 = 0.1f;
                f5 = (f14 /= f12) - f16;
                f6 = e72.d(l4);
                f7 = e72.d(l3);
                f6 = Math.max(f6, f7);
                object = new aG2(f15, f5, f6, f14 += f16);
                mx0Array = ul3$a.a;
                l2 = ((RQ1)object4).f((aG2)object, 0, (ul3_0)mx0Array);
                break block12;
            }
            l2 = mm3.b;
        }
        n3 = mm3.b(l2);
        if (n3 != 0) {
            mx0Array = a;
            HandwritingGesture handwritingGesture = l31_0.a(removeSpaceGesture);
            return super.b(handwritingGesture, function12);
        }
        mx0Array = new Ref$IntRef();
        mx0Array.element = n7;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = n7;
        int n15 = mm3.e(l2);
        int n16 = mm3.d(l2);
        object = sl;
        object2 = ((Object)sl.subSequence(n15, n16)).toString();
        Object object5 = new Regex("\\s+");
        object = new q31$a((Ref$IntRef)mx0Array, ref$IntRef);
        Intrinsics.checkNotNullParameter(object2, "input");
        String string2 = "transform";
        Intrinsics.checkNotNullParameter(object, string2);
        object5 = Regex.a((Regex)object5, (CharSequence)object2);
        if (object5 == null) {
            object2 = object2.toString();
        } else {
            int n17 = ((String)object2).length();
            StringBuilder stringBuilder = new StringBuilder(n17);
            int n18 = 0;
            f5 = 0.0f;
            IntRange intRange = null;
            do {
                IntRange intRange2 = ((oh1_1)object5).getRange();
                int n19 = intRange2.a;
                stringBuilder.append((CharSequence)object2, n18, n19);
                ((q31$a)object).invoke(object5);
                stringBuilder.append((CharSequence)"");
                intRange = ((oh1_1)object5).getRange();
                n18 = intRange.b + n14;
                object5 = ((oh1_1)object5).next();
            } while (n18 < n17 && object5 != null);
            if (n18 < n17) {
                stringBuilder.append((CharSequence)object2, n18, n17);
            }
            object2 = stringBuilder.toString();
            object5 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
        }
        n3 = mx0Array.element;
        if (n3 != n7 && (n16 = ref$IntRef.element) != n7) {
            n7 = (int)(l2 >> 32);
            n4 = n7 + n3;
            n7 += n16;
            n16 = ((String)object2).length();
            n8 = mm3.c(l2);
            int n20 = ref$IntRef.element;
            mx0Array = ((String)object2).substring(n3, n16 -= (n8 -= n20));
            Intrinsics.checkNotNullExpressionValue(mx0Array, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            object4 = new N03(n4, n7);
            object3 = new bz_0((String)mx0Array, n14);
            mx0Array = new mx0[n10];
            mx0Array[0] = object4;
            mx0Array[n14] = object3;
            r31 r312 = new r31(mx0Array);
            function12.invoke(r312);
            return n14;
        }
        mx0Array = l31_0.a(removeSpaceGesture);
        q31 q312 = this;
        return this.b((HandwritingGesture)mx0Array, function12);
    }

    private final int q(er3 er32, RemoveSpaceGesture removeSpaceGesture, Vl3 vl3, NC3 nC3) {
        throw null;
    }

    private final int r(Vt1 object, SelectGesture selectGesture, Sk3 sk3, Function1 function1) {
        aG2 aG22 = cf_2.g(b31_0.a(selectGesture));
        int n3 = c31_0.a(selectGesture);
        long l2 = s31.d((Vt1)object, aG22, n3 = this.G(n3));
        boolean bl2 = mm3.b(l2);
        if (bl2) {
            object = a;
            selectGesture = l31_0.a(selectGesture);
            return super.b((HandwritingGesture)selectGesture, function1);
        }
        this.v(l2, sk3, function1);
        return 1;
    }

    private final int s(er3 er32, SelectGesture selectGesture, Vl3 vl3) {
        cf_2.g(b31_0.a(selectGesture));
        int n3 = c31_0.a(selectGesture);
        this.G(n3);
        throw null;
    }

    private final int t(Vt1 object, SelectRangeGesture selectRangeGesture, Sk3 sk3, Function1 function1) {
        aG2 aG22 = cf_2.g(L21.a(selectRangeGesture));
        aG2 aG23 = cf_2.g(W21.a(selectRangeGesture));
        int n3 = f31_0.a(selectRangeGesture);
        long l2 = s31.a((Vt1)object, aG22, aG23, n3 = this.G(n3));
        boolean bl2 = mm3.b(l2);
        if (bl2) {
            object = a;
            selectRangeGesture = l31_0.a(selectRangeGesture);
            return super.b((HandwritingGesture)selectRangeGesture, function1);
        }
        this.v(l2, sk3, function1);
        return 1;
    }

    private final int u(er3 er32, SelectRangeGesture selectRangeGesture, Vl3 vl3) {
        cf_2.g(L21.a(selectRangeGesture));
        cf_2.g(W21.a(selectRangeGesture));
        int n3 = f31_0.a(selectRangeGesture);
        this.G(n3);
        throw null;
    }

    private final void v(long l2, Sk3 sk3, Function1 function1) {
        int n3 = mm3.c;
        n3 = 32;
        long l3 = l2 >> n3;
        int n4 = (int)l3;
        long l4 = 0xFFFFFFFFL;
        int n7 = (int)(l2 &= l4);
        N03 n03 = new N03(n4, n7);
        function1.invoke(n03);
        if (sk3 != null) {
            boolean bl2 = true;
            sk3.h(bl2);
        }
    }

    private final void w(Vt1 object, DeleteGesture deleteGesture, Sk3 sk3) {
        if (sk3 != null) {
            Object object2 = cf_2.g(S21.a(deleteGesture));
            int n3 = T21.a(deleteGesture);
            n3 = this.G(n3);
            long l2 = s31.d(object, (aG2)object2, n3);
            object2 = sk3.d;
            if (object2 != null) {
                ((Vt1)object2).f(l2);
            }
            object2 = sk3.d;
            if (object2 != null) {
                long l3 = mm3.b;
                ((Vt1)object2).g(l3);
            }
            boolean bl2 = mm3.b(l2);
            if (!bl2) {
                bl2 = false;
                sk3.t(false);
                object = x21_0.None;
                sk3.r((x21_0)((Object)object));
            }
        }
    }

    private final void x(er3 er32, DeleteGesture deleteGesture, Vl3 vl3) {
        cf_2.g(S21.a(deleteGesture));
        int n3 = T21.a(deleteGesture);
        this.G(n3);
        throw null;
    }

    private final void y(Vt1 object, DeleteRangeGesture deleteRangeGesture, Sk3 sk3) {
        if (sk3 != null) {
            Object object2 = cf_2.g(i31_0.a(deleteRangeGesture));
            aG2 aG22 = cf_2.g(j31_0.a(deleteRangeGesture));
            int n3 = k31_0.a(deleteRangeGesture);
            n3 = this.G(n3);
            long l2 = s31.a(object, (aG2)object2, aG22, n3);
            object2 = sk3.d;
            if (object2 != null) {
                ((Vt1)object2).f(l2);
            }
            object2 = sk3.d;
            if (object2 != null) {
                long l3 = mm3.b;
                ((Vt1)object2).g(l3);
            }
            boolean bl2 = mm3.b(l2);
            if (!bl2) {
                bl2 = false;
                sk3.t(false);
                object = x21_0.None;
                sk3.r((x21_0)((Object)object));
            }
        }
    }

    private final void z(er3 er32, DeleteRangeGesture deleteRangeGesture, Vl3 vl3) {
        cf_2.g(i31_0.a(deleteRangeGesture));
        cf_2.g(j31_0.a(deleteRangeGesture));
        int n3 = k31_0.a(deleteRangeGesture);
        this.G(n3);
        throw null;
    }

    public final boolean A(Vt1 object, PreviewableHandwritingGesture previewableHandwritingGesture, Sk3 sk3, CancellationSignal cancellationSignal) {
        block10: {
            block7: {
                boolean bl2;
                block9: {
                    block8: {
                        block6: {
                            Sl sl = ((Vt1)object).j;
                            if (sl == null) {
                                return false;
                            }
                            Object object2 = ((Vt1)object).d();
                            object2 = object2 != null && (object2 = ((Ul3)object2).a) != null && (object2 = ((Tl3)object2).a) != null ? ((Sl3)object2).a : null;
                            bl2 = Intrinsics.areEqual(sl, object2);
                            if (!bl2) {
                                return false;
                            }
                            bl2 = m31_0.a(previewableHandwritingGesture);
                            if (!bl2) break block6;
                            previewableHandwritingGesture = n31.a(previewableHandwritingGesture);
                            this.C((Vt1)object, (SelectGesture)previewableHandwritingGesture, sk3);
                            break block7;
                        }
                        bl2 = M21.a(previewableHandwritingGesture);
                        if (!bl2) break block8;
                        previewableHandwritingGesture = N21.a(previewableHandwritingGesture);
                        this.w((Vt1)object, (DeleteGesture)previewableHandwritingGesture, sk3);
                        break block7;
                    }
                    bl2 = O21.a(previewableHandwritingGesture);
                    if (!bl2) break block9;
                    previewableHandwritingGesture = P21.a(previewableHandwritingGesture);
                    this.E((Vt1)object, (SelectRangeGesture)previewableHandwritingGesture, sk3);
                    break block7;
                }
                bl2 = Q21.a(previewableHandwritingGesture);
                if (!bl2) break block10;
                previewableHandwritingGesture = R21.a(previewableHandwritingGesture);
                this.y((Vt1)object, (DeleteRangeGesture)previewableHandwritingGesture, sk3);
            }
            if (cancellationSignal != null) {
                object = new o31(sk3);
                cancellationSignal.setOnCancelListener((CancellationSignal.OnCancelListener)object);
            }
            return true;
        }
        return false;
    }

    public final boolean B(er3 object, PreviewableHandwritingGesture previewableHandwritingGesture, Vl3 vl3, CancellationSignal cancellationSignal) {
        block8: {
            block5: {
                boolean bl2;
                block7: {
                    block6: {
                        block4: {
                            bl2 = m31_0.a(previewableHandwritingGesture);
                            if (!bl2) break block4;
                            previewableHandwritingGesture = n31.a(previewableHandwritingGesture);
                            this.D((er3)object, (SelectGesture)previewableHandwritingGesture, vl3);
                            break block5;
                        }
                        bl2 = M21.a(previewableHandwritingGesture);
                        if (!bl2) break block6;
                        previewableHandwritingGesture = N21.a(previewableHandwritingGesture);
                        this.x((er3)object, (DeleteGesture)previewableHandwritingGesture, vl3);
                        break block5;
                    }
                    bl2 = O21.a(previewableHandwritingGesture);
                    if (!bl2) break block7;
                    previewableHandwritingGesture = P21.a(previewableHandwritingGesture);
                    this.F((er3)object, (SelectRangeGesture)previewableHandwritingGesture, vl3);
                    break block5;
                }
                bl2 = Q21.a(previewableHandwritingGesture);
                if (!bl2) break block8;
                previewableHandwritingGesture = R21.a(previewableHandwritingGesture);
                this.z((er3)object, (DeleteRangeGesture)previewableHandwritingGesture, vl3);
            }
            if (cancellationSignal != null) {
                object = new Object();
                cancellationSignal.setOnCancelListener((CancellationSignal.OnCancelListener)object);
            }
            return true;
        }
        return false;
    }

    public final int i(Vt1 vt1, HandwritingGesture handwritingGesture, Sk3 sk3, NC3 nC3, Function1 function1) {
        int n3;
        boolean bl2;
        Sl sl = vt1.j;
        int n4 = 3;
        if (sl == null) {
            return n4;
        }
        Object object = vt1.d();
        if (object != null && (object = ((Ul3)object).a) != null && (object = ((Tl3)object).a) != null) {
            object = ((Sl3)object).a;
        } else {
            bl2 = false;
            object = null;
        }
        bl2 = Intrinsics.areEqual(sl, object);
        if (!bl2) {
            return n4;
        }
        n4 = (int)(m31_0.a(handwritingGesture) ? 1 : 0);
        if (n4 != 0) {
            handwritingGesture = n31.a(handwritingGesture);
            n3 = this.r(vt1, (SelectGesture)handwritingGesture, sk3, function1);
        } else {
            n4 = (int)(M21.a(handwritingGesture) ? 1 : 0);
            if (n4 != 0) {
                handwritingGesture = N21.a(handwritingGesture);
                n3 = this.c(vt1, (DeleteGesture)handwritingGesture, sl, function1);
            } else {
                n4 = (int)(O21.a(handwritingGesture) ? 1 : 0);
                if (n4 != 0) {
                    handwritingGesture = P21.a(handwritingGesture);
                    n3 = this.t(vt1, (SelectRangeGesture)handwritingGesture, sk3, function1);
                } else {
                    boolean bl3 = Q21.a(handwritingGesture);
                    if (bl3) {
                        handwritingGesture = R21.a(handwritingGesture);
                        n3 = this.e(vt1, (DeleteRangeGesture)handwritingGesture, sl, function1);
                    } else {
                        bl3 = Z21.a(handwritingGesture);
                        if (bl3) {
                            JoinOrSplitGesture joinOrSplitGesture = a31_0.a(handwritingGesture);
                            object = vt1;
                            n3 = this.n(vt1, joinOrSplitGesture, sl, nC3, function1);
                        } else {
                            bl3 = U21.a(handwritingGesture);
                            if (bl3) {
                                handwritingGesture = V21.a(handwritingGesture);
                                n3 = this.k(vt1, (InsertGesture)handwritingGesture, nC3, function1);
                            } else {
                                bl3 = X21.a(handwritingGesture);
                                if (bl3) {
                                    RemoveSpaceGesture removeSpaceGesture = Y21.a(handwritingGesture);
                                    object = vt1;
                                    n3 = this.p(vt1, removeSpaceGesture, sl, nC3, function1);
                                } else {
                                    n3 = 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return n3;
    }

    public final int j(er3 er32, HandwritingGesture handwritingGesture, Vl3 vl3, NC3 nC3) {
        int n3;
        boolean bl2 = m31_0.a(handwritingGesture);
        if (bl2) {
            handwritingGesture = n31.a(handwritingGesture);
            n3 = this.s(er32, (SelectGesture)handwritingGesture, vl3);
        } else {
            bl2 = M21.a(handwritingGesture);
            if (bl2) {
                handwritingGesture = N21.a(handwritingGesture);
                n3 = this.d(er32, (DeleteGesture)handwritingGesture, vl3);
            } else {
                bl2 = O21.a(handwritingGesture);
                if (bl2) {
                    handwritingGesture = P21.a(handwritingGesture);
                    n3 = this.u(er32, (SelectRangeGesture)handwritingGesture, vl3);
                } else {
                    bl2 = Q21.a(handwritingGesture);
                    if (bl2) {
                        handwritingGesture = R21.a(handwritingGesture);
                        n3 = this.f(er32, (DeleteRangeGesture)handwritingGesture, vl3);
                    } else {
                        bl2 = Z21.a(handwritingGesture);
                        if (bl2) {
                            handwritingGesture = a31_0.a(handwritingGesture);
                            n3 = this.o(er32, (JoinOrSplitGesture)handwritingGesture, vl3, nC3);
                        } else {
                            bl2 = U21.a(handwritingGesture);
                            if (bl2) {
                                handwritingGesture = V21.a(handwritingGesture);
                                n3 = this.l(er32, (InsertGesture)handwritingGesture, vl3, nC3);
                            } else {
                                bl2 = X21.a(handwritingGesture);
                                if (bl2) {
                                    handwritingGesture = Y21.a(handwritingGesture);
                                    n3 = this.q(er32, (RemoveSpaceGesture)handwritingGesture, vl3, nC3);
                                } else {
                                    n3 = 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return n3;
    }
}


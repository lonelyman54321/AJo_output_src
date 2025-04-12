/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

public final class No0$a
implements Iterator,
KMappedMarker {
    public int a = -1;
    public int b;
    public int c;
    public IntRange d;
    public int e;
    public final /* synthetic */ no0_2 f;

    public No0$a(no0_2 no0_22) {
        this.f = no0_22;
        int n3 = no0_22.b;
        int n4 = no0_22.a.length();
        this.b = n4 = kotlin.ranges.f.g(n3, 0, n4);
        this.c = n4;
    }

    /*
     * Unable to fully structure code
     */
    public final void a() {
        block6: {
            block7: {
                block5: {
                    var1_1 = this.c;
                    var2_2 = 0;
                    if (var1_1 >= 0) break block5;
                    this.a = 0;
                    var1_1 = 0;
                    var3_3 = null;
                    this.d = null;
                    break block6;
                }
                var4_6 = this.f;
                var5_7 = var4_6.c;
                var6_8 = -1;
                var7_9 = 1;
                if (var5_7 <= 0) break block7;
                this.e = var8_10 = this.e + var7_9;
                if (var8_10 >= var5_7) ** GOTO lbl-1000
            }
            if (var1_1 > (var5_7 = (var9_11 = var4_6.a).length())) lbl-1000:
            // 2 sources

            {
                var2_2 = this.b;
                var4_6 = var4_6.a;
                var10_12 = StringsKt.K((CharSequence)var4_6);
                this.d = var3_4 = new c(var2_2, var10_12, var7_9);
                this.c = var6_8;
            } else {
                var3_5 = var4_6.d;
                var9_11 = var4_6.a;
                var8_10 = this.c;
                var11_15 = var8_10;
                if ((var3_5 = (Pair)var3_5.invoke(var9_11, var11_15)) == null) {
                    var2_2 = this.b;
                    var4_6 = var4_6.a;
                    var10_13 = StringsKt.K((CharSequence)var4_6);
                    this.d = var3_5 = new c(var2_2, var10_13, var7_9);
                    this.c = var6_8;
                } else {
                    var4_6 = (Number)var3_5.a;
                    var10_14 = var4_6.intValue();
                    var3_5 = (Number)var3_5.b;
                    var1_1 = var3_5.intValue();
                    var5_7 = this.b;
                    this.d = var9_11 = kotlin.ranges.f.m(var5_7, var10_14);
                    this.b = var10_14 += var1_1;
                    if (var1_1 == 0) {
                        var2_2 = 1;
                    }
                    this.c = var10_14 += var2_2;
                }
            }
            this.a = var7_9;
        }
    }

    public final boolean hasNext() {
        int n3 = this.a;
        int n4 = -1;
        if (n3 == n4) {
            this.a();
        }
        if ((n3 = this.a) != (n4 = 1)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final Object next() {
        int n3 = this.a;
        int n4 = -1;
        if (n3 == n4) {
            this.a();
        }
        if ((n3 = this.a) != 0) {
            IntRange intRange = this.d;
            Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.d = null;
            this.a = n4;
            return intRange;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}


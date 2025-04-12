/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from oh1
 */
public final class oh1_2
implements a93_0 {
    public final se_1 a;
    public final Inflater b;
    public int c;
    public boolean d;

    public oh1_2(ie2_2 ie2_22, Inflater inflater) {
        Intrinsics.checkNotNullParameter(ie2_22, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.a = ie2_22;
        this.b = inflater;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(ce_2 var1_1, long var2_3) {
        block12: {
            block13: {
                var4_4 = this.b;
                var5_5 = "sink";
                Intrinsics.checkNotNullParameter(var1_1, var5_5);
                var6_6 = 0L;
                var8_7 = var2_3 == var6_6 ? 0 : (var2_3 < var6_6 ? -1 : 1);
                if (var8_7 < 0) {
                    var1_1 = Wm2.a(var2_3, "byteCount < 0: ");
                    var1_1 = var1_1.toString();
                    var17_17 = new IllegalArgumentException((String)var1_1);
                    throw var17_17;
                }
                var9_8 = this.d;
                var10_9 = 1;
                if ((var9_8 ^= var10_9) == 0) {
                    var17_16 = "closed".toString();
                    var1_1 = new IllegalStateException(var17_16);
                    throw var1_1;
                }
                if (var8_7 == false) {
                    return var6_6;
                }
                try {
                    var11_10 = var1_1.O(var10_9);
                    var9_8 = var11_10.c;
                    var9_8 = 8192 - var9_8;
                }
                catch (DataFormatException var1_2) {
                    break block12;
                }
                var12_11 = var9_8;
                {
                    var2_3 = Math.min(var2_3, var12_11);
                    var14_12 = (int)var2_3;
                    var15_13 = var4_4.needsInput();
                    var16_14 = this.a;
                    if (var15_13 == 0) ** GOTO lbl42
                }
                {
                    var15_13 = var16_14.g();
                    if (var15_13 != 0) ** GOTO lbl42
                    var17_15 = var16_14.e();
                    var17_15 = var17_15.a;
                    Intrinsics.checkNotNull(var17_15);
                    var10_9 = var17_15.c;
                    var18_18 = var17_15.b;
                }
                {
                    this.c = var10_9 -= var18_18;
                    var17_15 = var17_15.a;
                    var4_4.setInput((byte[])var17_15, var18_18, var10_9);
lbl42:
                    // 3 sources

                    var17_15 = var11_10.a;
                    var10_9 = var11_10.c;
                    var15_13 = var4_4.inflate((byte[])var17_15, var10_9, var14_12);
                    var14_12 = this.c;
                    if (var14_12 == 0) break block13;
                    var19_19 = var4_4.getRemaining();
                    var14_12 -= var19_19;
                }
                {
                    var19_19 = this.c - var14_12;
                }
                this.c = var19_19;
                var20_20 = var14_12;
                var16_14.skip(var20_20);
            }
            if (var15_13 > 0) {
                var11_10.c = var14_12 = var11_10.c + var15_13;
                var22_21 = var1_1.b;
                var2_3 = var15_13;
                var1_1.b = var22_21 += var2_3;
                return var2_3;
            }
            var15_13 = var11_10.b;
            var14_12 = var11_10.c;
            if (var15_13 == var14_12) {
                var1_1.a = var17_15 = var11_10.a();
                ax2_2.a(var11_10);
            }
            return var6_6;
        }
        var17_15 = new IOException(var1_2);
        throw var17_15;
    }

    public final long a0(ce_2 object, long l2) {
        block2: {
            boolean bl2;
            Object object2 = "sink";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            do {
                long l3;
                long l4;
                long l7;
                long l8;
                if ((l8 = (l7 = (l4 = this.a((ce_2)object, l2)) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) > 0) {
                    return l4;
                }
                object2 = this.b;
                boolean bl3 = ((Inflater)object2).finished();
                if (bl3 || (bl2 = ((Inflater)object2).needsDictionary())) break block2;
            } while (!(bl2 = (object2 = this.a).g()));
            object = new EOFException("source exhausted prematurely");
            throw object;
        }
        return -1;
    }

    public final void close() {
        boolean bl2 = this.d;
        if (bl2) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    public final a timeout() {
        return this.a.timeout();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from mm1
 */
public final class mm1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ uf_1 a;
    public final /* synthetic */ at3_0 b;
    public final /* synthetic */ ml1_2 c;

    public mm1_2(uf_1 uf_12, at3_0 at3_02, ml1_2 ml1_22, f80_0 f80_02) {
        this.a = uf_12;
        this.b = at3_02;
        this.c = ml1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        at3_0 at3_02 = this.b;
        ml1_2 ml1_22 = this.c;
        uf_1 uf_12 = this.a;
        object = new mm1_2(uf_12, at3_02, ml1_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (mm1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mm1_2)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var19_44;
        void var4_18;
        int n3;
        int n4;
        int[] nArray;
        Object object2;
        ml1_2 ml1_22;
        int n7;
        block15: {
            block16: {
                n7 = 1;
                j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
                vl2_2.b(object);
                object = this.a;
                String string2 = "<this>";
                Intrinsics.checkNotNullParameter(object, string2);
                ny_2 ny_22 = new ny_2((uf_1)object);
                object = vo1_1.a(this.b);
                ml1_22 = this.c;
                object = h03_0.c(ml1_22.b, (at3_0)object);
                bj0_2 bj0_22 = bj0_2.AUTO_DETECT;
                Intrinsics.checkNotNullParameter(ml1_22, string2);
                Intrinsics.checkNotNullParameter(ny_22, "stream");
                String string3 = "deserializer";
                Intrinsics.checkNotNullParameter(object, string3);
                Object object3 = "format";
                Intrinsics.checkNotNullParameter((Object)bj0_22, (String)object3);
                sk1_2 sk1_22 = new sk1_2(ny_22);
                String string4 = "json";
                Intrinsics.checkNotNullParameter(ml1_22, string4);
                object2 = "reader";
                Intrinsics.checkNotNullParameter(sk1_22, (String)object2);
                Intrinsics.checkNotNullParameter(object, string3);
                Intrinsics.checkNotNullParameter((Object)bj0_22, (String)object3);
                int n8 = 16384;
                object3 = new char[n8];
                Intrinsics.checkNotNullParameter(ml1_22, string4);
                Intrinsics.checkNotNullParameter(sk1_22, (String)object2);
                String string5 = "buffer";
                Intrinsics.checkNotNullParameter(object3, string5);
                Object object4 = ml1_22.a;
                boolean bl2 = ((sl1_2)object4).o;
                if (!bl2) {
                    object2 = new ce2_2(sk1_22, (char[])object3);
                } else {
                    Intrinsics.checkNotNullParameter(sk1_22, (String)object2);
                    Intrinsics.checkNotNullParameter(object3, string5);
                    object2 = object4 = new ce2_2(sk1_22, (char[])object3);
                }
                object3 = "mode";
                Intrinsics.checkNotNullParameter((Object)bj0_22, (String)object3);
                Intrinsics.checkNotNullParameter(ml1_22, string4);
                String string6 = "lexer";
                Intrinsics.checkNotNullParameter(object2, string6);
                Intrinsics.checkNotNullParameter(object, string3);
                nArray = qm1_1.$EnumSwitchMapping$0;
                int n14 = bj0_22.ordinal();
                n14 = nArray[n14];
                n4 = 3;
                n3 = 2;
                if (n14 == n7) break block16;
                byte by2 = 8;
                if (n14 != n3) {
                    if (n14 != n4) {
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    byte by4 = ((q0_0)object2).w();
                    if (by4 == by2) {
                        ((q0_0)object2).g(by2);
                        bj0_2 bj0_23 = bj0_2.ARRAY_WRAPPED;
                        break block15;
                    } else {
                        bj0_2 bj0_24 = bj0_2.WHITESPACE_SEPARATED;
                    }
                    break block15;
                } else {
                    byte by5 = ((q0_0)object2).w();
                    if (by5 == by2) {
                        ((q0_0)object2).g(by2);
                        bj0_2 bj0_25 = bj0_2.ARRAY_WRAPPED;
                        break block15;
                    } else {
                        void var3_9;
                        object = r0_0.d(by2);
                        int n15 = ((q0_0)object2).a;
                        n7 = n15 + -1;
                        dp_1 dp_12 = ((ce2_2)object2).g;
                        int n16 = dp_12.b;
                        if (n15 != n16 && n7 >= 0) {
                            char c2 = dp_12.a[n7];
                            String string7 = String.valueOf(c2);
                        } else {
                            String string8 = "EOF";
                        }
                        object = uc0_0.a("Expected ", (String)object, ", but had '", (String)var3_9, "' instead");
                        q0_0.r((q0_0)object2, (String)object, n7, null, 4);
                        throw null;
                    }
                }
            }
            bj0_2 bj0_26 = bj0_2.WHITESPACE_SEPARATED;
        }
        int n17 = var4_18.ordinal();
        int n18 = nArray[n17];
        if (n18 != n7) {
            if (n18 != n3) {
                if (n18 != n4) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                String string9 = "AbstractJsonLexer.determineFormat must be called beforehand.".toString();
                object = new IllegalStateException(string9);
                throw object;
            }
            pm1_1 pm1_12 = new pm1_1(ml1_22, (ce2_2)object2, (KSerializer)object);
        } else {
            rm1_1 rm1_12 = new rm1_1(ml1_22, (ce2_2)object2, (KSerializer)object);
        }
        object = new im1_1((Iterator)var19_44);
        return ez2_1.c((Sequence)object);
    }
}


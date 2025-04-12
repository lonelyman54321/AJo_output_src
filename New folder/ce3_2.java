/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;

/*
 * Renamed from ce3
 */
public final class ce3_2
extends i0_0
implements zl1_2 {
    public final ml1_2 a;
    public final pj3_2 b;
    public final q0_0 c;
    public final i0_0 d;
    public int e;
    public ce3$a f;
    public final sl1_2 g;
    public final cm1_2 h;

    public ce3_2(ml1_2 object, pj3_2 object2, q0_0 q0_02, SerialDescriptor serialDescriptor, ce3$a ce3$a) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "json");
        Intrinsics.checkNotNullParameter(object2, "mode");
        Intrinsics.checkNotNullParameter(q0_02, "lexer");
        String string2 = "descriptor";
        Intrinsics.checkNotNullParameter(serialDescriptor, string2);
        this.a = object;
        this.b = object2;
        this.c = q0_02;
        object2 = ((ml1_2)object).b;
        this.d = object2;
        this.e = n3 = -1;
        this.f = ce3$a;
        this.g = object = ((ml1_2)object).a;
        boolean bl2 = ((sl1_2)object).f;
        if (bl2) {
            bl2 = false;
            object = null;
        } else {
            object = new cm1_2(serialDescriptor);
        }
        this.h = object;
    }

    public final boolean A() {
        boolean bl2;
        boolean bl3;
        boolean bl4 = false;
        Object object = this.h;
        if (object != null) {
            bl3 = ((cm1_2)object).b;
        } else {
            bl3 = false;
            object = null;
        }
        if (!bl3 && !(bl3 = ((q0_0)(object = this.c)).C(bl2 = true))) {
            bl4 = true;
        }
        return bl4;
    }

    public final byte D() {
        byte by2;
        long l2;
        q0_0 q0_02 = this.c;
        long l3 = q0_02.i();
        long l4 = l3 - (l2 = (long)(by2 = (byte)l3));
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return by2;
        }
        StringBuilder stringBuilder = new StringBuilder("Failed to parse byte for input '");
        stringBuilder.append(l3);
        stringBuilder.append('\'');
        String string2 = stringBuilder.toString();
        q0_0.r(q0_02, string2, 0, null, 6);
        throw null;
    }

    public final i0_0 a() {
        return this.d;
    }

    public final JsonElement b() {
        sl1_2 sl1_22 = this.a.a;
        q0_0 q0_02 = this.c;
        um1_1 um1_12 = new um1_1(sl1_22, q0_02);
        return um1_12.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final s30_0 c(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        Object object = this.a;
        pj3_2 pj3_22 = qj3_2.b((ml1_2)object, serialDescriptor);
        q0_0 q0_02 = this.c;
        cm1_1 cm1_12 = q0_02.b;
        cm1_12.getClass();
        Object object2 = "sd";
        Intrinsics.checkNotNullParameter(serialDescriptor, (String)object2);
        int n3 = cm1_12.c;
        int n4 = 1;
        cm1_12.c = n3 += n4;
        Object[] objectArray = cm1_12.a;
        int n7 = objectArray.length;
        if (n3 == n7) {
            n7 = n3 * 2;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n7);
            String string2 = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(objectArray2, string2);
            cm1_12.a = objectArray2;
            int[] nArray = Arrays.copyOf(cm1_12.b, n7);
            Intrinsics.checkNotNullExpressionValue(nArray, string2);
            cm1_12.b = nArray;
        }
        Object[] objectArray3 = cm1_12.a;
        objectArray3[n3] = serialDescriptor;
        int n8 = pj3_22.begin;
        q0_02.h((char)n8);
        n8 = q0_02.w();
        n3 = 4;
        if (n8 != n3) {
            int[] nArray = ce3$b.$EnumSwitchMapping$0;
            n8 = pj3_22.ordinal();
            int n10 = nArray[n8];
            if (n10 != n4 && n10 != (n8 = 2) && n10 != (n8 = 3)) {
                pj3_2 pj3_23 = this.b;
                if (pj3_23 == pj3_22) {
                    object = ((ml1_2)object).a;
                    boolean bl2 = ((sl1_2)object).f;
                    if (bl2) {
                        return this;
                    }
                }
                ce3$a ce3$a = this.f;
                ml1_2 ml1_22 = this.a;
                object2 = this.c;
                Object object3 = object;
                return new ce3_2(ml1_22, pj3_22, (q0_0)object2, serialDescriptor, ce3$a);
            }
            ce3$a ce3$a = this.f;
            ml1_2 ml1_23 = this.a;
            object2 = this.c;
            Object object4 = object;
            return new ce3_2(ml1_23, pj3_22, (q0_0)object2, serialDescriptor, ce3$a);
        }
        q0_0.r(q0_02, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public final void d(SerialDescriptor object) {
        Object object2 = "descriptor";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.d();
        int n4 = -1;
        Object object3 = this.a;
        if (n3 == 0 && (n3 = (int)(xm1_2.d((ml1_2)object3, (SerialDescriptor)object) ? 1 : 0)) != 0) {
            while ((n3 = this.m((SerialDescriptor)object)) != n4) {
            }
        }
        if ((n3 = (int)(((q0_0)(object = this.c)).B() ? 1 : 0)) != 0) {
            object2 = ((ml1_2)object3).a;
            n3 = (int)(((sl1_2)object2).n ? 1 : 0);
            if (n3 == 0) {
                HT2.e((q0_0)object, "");
                throw null;
            }
        }
        object2 = this.b;
        n3 = ((pj3_2)((Object)object2)).end;
        ((q0_0)object).h((char)n3);
        object = ((q0_0)object).b;
        n3 = ((cm1_1)object).c;
        object3 = ((cm1_1)object).b;
        Object object4 = object3[n3];
        int n7 = -2;
        if (object4 == n7) {
            object3[n3] = n4;
            ((cm1_1)object).c = n3 += n4;
        }
        if ((n3 = ((cm1_1)object).c) != n4) {
            ((cm1_1)object).c = n3 += n4;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object e(qp0_2 var1_1) {
        block20: {
            block14: {
                block15: {
                    block17: {
                        block16: {
                            block19: {
                                block18: {
                                    var2_7 = "<this>";
                                    var3_8 = this.a;
                                    var4_9 = this.c;
                                    var5_10 = "Expected ";
                                    Intrinsics.checkNotNullParameter(var1_1, "deserializer");
                                    var6_11 = var1_1 instanceof l1_0;
                                    if (var6_11 == false) return var1_1.deserialize(this);
                                    try {
                                        var7_12 = var3_8.a;
                                        var6_11 = var7_12.i;
                                        if (var6_11) {
                                            return var1_1.deserialize(this);
                                        }
                                        var7_12 = var1_1;
                                        var7_12 = (l1_0)var1_1;
                                        var7_12 = var7_12.getDescriptor();
                                        var7_12 = ow2_2.b((ml1_2)var3_8, (SerialDescriptor)var7_12);
                                        var8_13 = this.g;
                                        var9_14 = var8_13.c;
                                        var8_13 = var4_9.v((String)var7_12, var9_14);
                                        var10_15 = null;
                                        if (var8_13 != null) break block14;
                                    }
                                    catch (MissingFieldException var1_2) {}
                                    var6_11 = var1_1 instanceof l1_0;
                                    if (!var6_11) break block15;
                                    var7_12 = var3_8.a;
                                    var6_11 = var7_12.i;
                                    if (var6_11) break block15;
                                    var7_12 = var1_1;
                                    var7_12 = (l1_0)var1_1;
                                    var7_12 = var7_12.getDescriptor();
                                    var7_12 = ow2_2.b((ml1_2)var3_8, (SerialDescriptor)var7_12);
                                    var8_13 = this.b();
                                    var11_16 = var1_1;
                                    var11_16 = (l1_0)var1_1;
                                    var11_16 = var11_16.getDescriptor();
                                    var11_16 = var11_16.h();
                                    var12_17 = var8_13 instanceof JsonObject;
                                    var13_18 = -1;
                                    if (!var12_17) break block17;
                                    var8_13 = (JsonObject)var8_13;
                                    var5_10 = var8_13.get(var7_12);
                                    var5_10 = (JsonElement)var5_10;
                                    if (var5_10 == null) break block16;
                                    var11_16 = bm1_1.a;
                                    Intrinsics.checkNotNullParameter(var5_10, (String)var2_7);
                                    var14_19 = var5_10 instanceof JsonPrimitive;
                                    if (!var14_19) ** GOTO lbl54
                                    var11_16 = var5_10;
                                    var11_16 = (JsonPrimitive)var5_10;
                                    break block18;
lbl54:
                                    // 1 sources

                                    var14_19 = false;
                                    var11_16 = null;
                                }
                                if (var11_16 == null) ** GOTO lbl63
                                Intrinsics.checkNotNullParameter(var11_16, (String)var2_7);
                                var15_20 = var11_16 instanceof JsonNull;
                                if (var15_20) break block16;
                                break block19;
lbl63:
                                // 1 sources

                                var1_1 = "JsonPrimitive";
                                bm1_1.c((String)var1_1, (JsonElement)var5_10);
                                throw null;
                            }
                            var10_15 = var11_16.a();
                        }
                        try {
                            var1_1 = (l1_0)var1_1;
                            var1_1 = pr0_0.c((l1_0)var1_1, this, var10_15);
                            var2_7 = "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>";
                        }
                        catch (SerializationException var1_3) {
                            var1_4 = var1_3.getMessage();
                            Intrinsics.checkNotNull(var1_4);
                            var2_7 = var8_13.toString();
                            var1_4 = HT2.d(var2_7, var13_18, (String)var1_4);
                            throw var1_4;
                        }
                        Intrinsics.checkNotNull(var1_1, var2_7);
                        return ds3_0.a((ml1_2)var3_8, (String)var7_12, (JsonObject)var8_13, (qp0_2)var1_1);
                        break block20;
                    }
                    var1_1 = new StringBuilder((String)var5_10);
                    var2_7 = JsonObject.class;
                    var2_7 = Reflection.getOrCreateKotlinClass(var2_7);
                    var2_7 = var2_7.getSimpleName();
                    var1_1.append((String)var2_7);
                    var2_7 = ", but had ";
                    var1_1.append((String)var2_7);
                    var2_7 = var8_13.getClass();
                    var2_7 = Reflection.getOrCreateKotlinClass(var2_7);
                    var2_7 = var2_7.getSimpleName();
                    var1_1.append((String)var2_7);
                    var2_7 = " as the serialized body of ";
                    var1_1.append((String)var2_7);
                    var1_1.append((String)var11_16);
                    var2_7 = " at element: ";
                    var1_1.append((String)var2_7);
                    var2_7 = var4_9.b;
                    var2_7 = var2_7.a();
                    var1_1.append((String)var2_7);
                    var1_1 = var1_1.toString();
                    var2_7 = var8_13.toString();
                    var1_1 = HT2.d((CharSequence)var2_7, var13_18, (String)var1_1);
                    throw var1_1;
                }
                var1_1 = (l1_0)var1_1;
                return var1_1.deserialize(this);
            }
            var1_1 = (l1_0)var1_1;
            var1_1 = pr0_0.c((l1_0)var1_1, this, (String)var8_13);
            var2_7 = "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>";
            {
                catch (SerializationException var1_5) {
                    var2_7 = var1_5.getMessage();
                    Intrinsics.checkNotNull(var2_7);
                    var16_21 = 10;
                    var2_7 = StringsKt.i0((String)var2_7, (char)var16_21);
                    var5_10 = ".";
                    var2_7 = StringsKt.V((String)var2_7, (String)var5_10);
                    var1_6 = var1_5.getMessage();
                    Intrinsics.checkNotNull(var1_6);
                    var5_10 = "";
                    var1_6 = StringsKt.e0((char)var16_21, var1_6, (String)var5_10);
                    var16_21 = 2;
                    q0_0.r((q0_0)var4_9, (String)var2_7, 0, var1_6, var16_21);
                    throw null;
                }
                Intrinsics.checkNotNull(var1_1, (String)var2_7);
                var2_7 = new Object();
                var2_7.a = var7_12;
                this.f = var2_7;
                return var1_1.deserialize(this);
            }
        }
        var2_7 = var1_2.getMessage();
        Intrinsics.checkNotNull(var2_7);
        var3_8 = "at path";
        var15_20 = StringsKt.F((CharSequence)var2_7, (CharSequence)var3_8, false);
        if (var15_20) {
            throw var1_2;
        }
        var3_8 = new StringBuilder();
        var5_10 = var1_2.getMessage();
        var3_8.append((String)var5_10);
        var3_8.append(" at path: ");
        var4_9 = var4_9.b.a();
        var3_8.append((String)var4_9);
        var3_8 = var3_8.toString();
        var4_9 = (ArrayList)var1_2.a;
        var2_7 = new MissingFieldException((ArrayList)var4_9, (String)var3_8, var1_2);
        throw var2_7;
    }

    public final int f(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "enumDescriptor");
        String string2 = this.w();
        CharSequence charSequence = new StringBuilder(" at path ");
        Object object = this.c.b.a();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        object = this.a;
        return xm1_2.c(serialDescriptor, (ml1_2)object, string2, (String)charSequence);
    }

    public final int i() {
        int n3;
        long l2;
        q0_0 q0_02 = this.c;
        long l3 = q0_02.i();
        long l4 = l3 - (l2 = (long)(n3 = (int)l3));
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return n3;
        }
        StringBuilder stringBuilder = new StringBuilder("Failed to parse int for input '");
        stringBuilder.append(l3);
        stringBuilder.append('\'');
        String string2 = stringBuilder.toString();
        q0_0.r(q0_02, string2, 0, null, 6);
        throw null;
    }

    public final long k() {
        return this.c.i();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int m(SerialDescriptor var1_1) {
        block44: {
            block56: {
                block47: {
                    block55: {
                        block46: {
                            block48: {
                                var2_2 = this;
                                var3_3 /* !! */  = var1_1;
                                Intrinsics.checkNotNullParameter(var1_1, "descriptor");
                                var4_4 = ce3$b.$EnumSwitchMapping$0;
                                var5_5 = this.b;
                                var6_6 = var5_5.ordinal();
                                var7_7 = var4_4[var6_6];
                                var8_8 /* !! */  = "object";
                                var9_9 = this.c;
                                var10_10 = 1;
                                var11_11 = -1;
                                var12_12 = 2;
                                var13_13 = 4;
                                var14_14 = 0;
                                var15_15 = 0;
                                var16_16 = null;
                                var17_17 = 58;
                                var18_18 = this.a;
                                if (var7_7 == var12_12) break block47;
                                var12_12 = 6;
                                if (var7_7 == var13_13) break block48;
                                var19_19 = (int)var9_9.B();
                                var7_7 = (int)var9_9.c();
                                if (var7_7 != 0) {
                                    var7_7 = this.e;
                                    if (var7_7 != var11_11 && var19_19 == 0) {
                                        q0_0.r(var9_9, "Expected end of the array or comma", 0, null, var12_12);
                                        throw null;
                                    }
                                    var2_2.e = var11_11 = var7_7 + 1;
                                } else if (var19_19 != 0) {
                                    var3_3 /* !! */  = var18_18.a;
                                    var19_19 = (int)var3_3 /* !! */ .n;
                                    if (var19_19 == 0) {
                                        HT2.e(var9_9, "array");
                                        throw null;
                                    }
                                }
                                break block44;
                            }
                            var7_7 = (int)var9_9.B();
                            while (true) {
                                block49: {
                                    block51: {
                                        block50: {
                                            var13_13 = (int)var9_9.c();
                                            var20_23 = var2_2.h;
                                            if (var13_13 == 0) break;
                                            var4_4 = var2_2.g;
                                            var13_13 = (int)var4_4.c;
                                            var21_24 = var13_13 != 0 ? var9_9.m() : var9_9.e();
                                            var9_9.h((char)var17_17);
                                            var17_17 = xm1_2.b(var3_3 /* !! */ , var18_18, var21_24);
                                            var11_11 = (int)var4_4.c;
                                            var15_15 = -3;
                                            if (var17_17 == var15_15) ** GOTO lbl91
                                            var7_7 = (int)var4_4.h;
                                            if (var7_7 == 0) ** GOTO lbl-1000
                                            var7_7 = (int)var3_3 /* !! */ .i(var17_17);
                                            var22_25 = var3_3 /* !! */ .g(var17_17);
                                            if (var7_7 != 0 && !(var23_26 = var22_25.b()) && (var23_26 = var9_9.C((boolean)var10_10))) ** GOTO lbl71
                                            var24_27 = var22_25.getKind();
                                            var10_10 = Intrinsics.areEqual(var24_27, var25_28 = XZ2$b.a);
                                            if (var10_10 == 0 || (var10_10 = (int)var22_25.b()) != 0 && (var10_10 = (int)var9_9.C(false)) != 0 || (var24_27 = var9_9.x((boolean)var11_11)) == null) ** GOTO lbl-1000
                                            var10_10 = xm1_2.b(var22_25, var18_18, (String)var24_27);
                                            var25_28 = var18_18.a;
                                            var26_29 = var25_28.f;
                                            if (!var26_29 && (var26_29 = var22_25.b())) {
                                                var26_29 = true;
                                            } else {
                                                var26_29 = false;
                                                var25_28 = null;
                                            }
                                            if (var10_10 == var15_15 && (var7_7 != 0 || var26_29)) {
                                                var9_9.j();
lbl71:
                                                // 2 sources

                                                var7_7 = (int)var9_9.B();
                                                var10_10 = 0;
                                                var24_27 = null;
                                            } else lbl-1000:
                                            // 3 sources

                                            {
                                                if (var20_23 != null) {
                                                    var3_3 /* !! */  = var20_23.a;
                                                    var7_7 = 64;
                                                    if (var17_17 < var7_7) {
                                                        var27_30 = var3_3 /* !! */ .c;
                                                        var29_33 = 1L << var17_17;
                                                        var3_3 /* !! */ .c = var27_30 |= var29_33;
                                                    } else {
                                                        var7_7 = (var17_17 >>> 6) - 1;
                                                        var6_6 = var17_17 & 63;
                                                        var3_3 /* !! */  = (SerialDescriptor)var3_3 /* !! */ .d;
                                                        var27_31 = var3_3 /* !! */ [var7_7];
                                                        var29_34 = 1L << var6_6;
                                                        var3_3 /* !! */ [var7_7] = var27_31 |= var29_34;
                                                    }
                                                }
                                                var11_11 = var17_17;
                                                break block44;
lbl91:
                                                // 1 sources

                                                var7_7 = 0;
                                                var4_4 = null;
                                                var10_10 = 1;
                                            }
                                            if (var10_10 == 0) break block49;
                                            var7_7 = (int)xm1_2.d(var18_18, var3_3 /* !! */ );
                                            var24_27 = var9_9.b;
                                            if (var7_7 == 0) {
                                                var4_4 = var2_2.f;
                                                if (var4_4 != null && (var12_12 = (int)Intrinsics.areEqual(var20_23 = var4_4.a, var21_24)) != 0) {
                                                    var12_12 = 0;
                                                    var20_23 = null;
                                                    var4_4.a = null;
                                                } else {
                                                    var4_4 = var24_27.b;
                                                    var19_20 = var24_27.c;
                                                    var31_35 = var4_4[var19_20];
                                                    var6_6 = -2;
                                                    if (var31_35 == var6_6) {
                                                        var4_4[var19_20] = var31_35 = -1;
                                                        var24_27.c = var19_20 += var31_35;
                                                    } else {
                                                        var31_35 = -1;
                                                    }
                                                    var19_20 = var24_27.c;
                                                    if (var19_20 != var31_35) {
                                                        var24_27.c = var19_20 += var31_35;
                                                    }
                                                    Intrinsics.checkNotNullParameter(var21_24, "key");
                                                    var19_20 = var9_9.a;
                                                    var19_20 = StringsKt.R(var9_9.A(0, var19_20), var21_24, 0, 6);
                                                    var5_5 = oe3_0.a(var19_20, "Encountered an unknown key '", var21_24, "' at offset ", " at path: ");
                                                    var8_8 /* !! */  = var24_27.a();
                                                    var5_5.append(var8_8 /* !! */ );
                                                    var5_5.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                                                    var8_8 /* !! */  = var9_9.t();
                                                    var3_3 /* !! */  = HT2.f(var19_20, var8_8 /* !! */ );
                                                    var5_5.append(var3_3 /* !! */ );
                                                    var3_3 /* !! */  = var5_5.toString();
                                                    var4_4 = new JsonDecodingException((String)var3_3 /* !! */ );
                                                    throw var4_4;
                                                }
                                            }
                                            var20_23 = new ArrayList();
                                            var7_7 = var9_9.w();
                                            if (var7_7 == (var13_13 = 8) || var7_7 == (var15_15 = 6)) break block50;
                                            var9_9.l();
                                            var15_15 = 6;
                                            break block51;
                                        }
                                        while (true) {
                                            block45: {
                                                block52: {
                                                    block53: {
                                                        block54: {
                                                            if ((var7_7 = (int)var9_9.w()) == (var15_15 = 1)) {
                                                                if (var11_11 != 0) {
                                                                    var9_9.l();
                                                                    continue;
                                                                }
                                                                var9_9.e();
                                                                continue;
                                                            }
                                                            var15_15 = 6;
                                                            if (var7_7 == var13_13 || var7_7 == var15_15) break block52;
                                                            var15_15 = 9;
                                                            if (var7_7 == var15_15) {
                                                                var4_4 = (Number)CollectionsKt.S((List)var20_23);
                                                                var7_7 = var4_4.byteValue();
                                                                if (var7_7 == var13_13) {
                                                                    cx_2.y((List)var20_23);
lbl158:
                                                                    // 3 sources

                                                                    while (true) {
                                                                        var15_15 = 6;
                                                                        break block45;
                                                                        break;
                                                                    }
                                                                }
                                                                var19_21 = var9_9.a;
                                                                var4_4 = new StringBuilder("found ] instead of } at path: ");
                                                                var4_4.append(var24_27);
                                                                var4_4 = var4_4.toString();
                                                                throw HT2.d(var9_9.t(), var19_21, (String)var4_4);
                                                            }
                                                            var15_15 = 7;
                                                            if (var7_7 != var15_15) break block53;
                                                            var4_4 = (Number)CollectionsKt.S((List)var20_23);
                                                            var7_7 = var4_4.byteValue();
                                                            if (var7_7 != (var15_15 = 6)) break block54;
                                                            cx_2.y((List)var20_23);
                                                            ** GOTO lbl158
                                                        }
                                                        var19_22 = var9_9.a;
                                                        var4_4 = new StringBuilder("found } instead of ] at path: ");
                                                        var4_4.append(var24_27);
                                                        var4_4 = var4_4.toString();
                                                        throw HT2.d(var9_9.t(), var19_22, (String)var4_4);
                                                    }
                                                    var15_15 = 10;
                                                    if (var7_7 == var15_15) ** break;
                                                    ** continue;
                                                    q0_0.r(var9_9, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                                    throw null;
                                                }
                                                var4_4 = (byte)var7_7;
                                                var20_23.add(var4_4);
                                            }
                                            var9_9.f();
                                            var7_7 = var20_23.size();
                                            if (var7_7 == 0) break;
                                        }
                                    }
                                    var7_7 = (int)var9_9.B();
                                }
                                var10_10 = 1;
                                var11_11 = -1;
                                var12_12 = 6;
                                var15_15 = 0;
                                var16_16 = null;
                                var17_17 = 58;
                            }
                            if (var7_7 != 0) {
                                var3_3 /* !! */  = var18_18.a;
                                var19_19 = (int)var3_3 /* !! */ .n;
                                if (var19_19 == 0) {
                                    HT2.e(var9_9, var8_8 /* !! */ );
                                    throw null;
                                }
                            }
                            if (var20_23 == null) break block55;
                            var3_3 /* !! */  = var20_23.a;
                            var4_4 = var3_3 /* !! */ .a;
                            var6_6 = var4_4.d();
                            do {
                                var27_32 = var3_3 /* !! */ .c;
                                var20_23 = var3_3 /* !! */ .b;
                                var32_36 = -1;
                                cfr_temp_0 = var27_32 - var32_36;
                                var13_13 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                if (var13_13 == 0) break block46;
                                var10_10 = Long.numberOfTrailingZeros(var27_32 ^= (long)-1);
                                var32_36 = var3_3 /* !! */ .c;
                                var34_37 = 1L;
                                var36_38 = var34_37 << var10_10;
                                var3_3 /* !! */ .c = var32_36 |= var36_38;
                                var38_39 = Integer.valueOf(var10_10);
                            } while ((var11_11 = (var38_39 = (Boolean)var20_23.invoke(var4_4, var38_39)).booleanValue()) == 0);
                            var11_11 = var10_10;
                            break block44;
                        }
                        var10_10 = 64;
                        if (var6_6 > var10_10) {
                            var3_3 /* !! */  = (SerialDescriptor)var3_3 /* !! */ .d;
                            var6_6 = ((SerialDescriptor)var3_3 /* !! */ ).length;
                            while (var14_14 < var6_6) {
                                var10_10 = var14_14 + 1;
                                var11_11 = var10_10 * 64;
                                var34_37 = (long)var3_3 /* !! */ [var14_14];
                                while ((var13_13 = (int)(var34_37 == var32_36 ? 0 : (var34_37 < var32_36 ? -1 : 1))) != 0) {
                                    var13_13 = Long.numberOfTrailingZeros(var34_37 ^ (long)-1);
                                    var32_36 = 1L;
                                    var39_40 = var32_36 << var13_13;
                                    var34_37 |= var39_40;
                                    var16_16 = Integer.valueOf(var13_13 += var11_11);
                                    var15_15 = (int)(var16_16 = (Boolean)var20_23.invoke(var4_4, var16_16)).booleanValue();
                                    if (var15_15 != 0) {
                                        var3_3 /* !! */ [var14_14] = (SerialDescriptor)var34_37;
                                        var11_11 = var13_13;
                                        break block44;
                                    }
                                    var32_36 = -1;
                                }
                                var3_3 /* !! */ [var14_14] = (SerialDescriptor)var34_37;
                                var14_14 = var10_10;
                                var32_36 = -1;
                            }
                        }
                    }
lbl261:
                    // 3 sources

                    while (true) {
                        var11_11 = -1;
                        break block44;
                        break;
                    }
                }
                var19_19 = this.e;
                var7_7 = var19_19 % 2;
                if (var7_7 != 0) {
                    var7_7 = 1;
                } else {
                    var7_7 = 0;
                    var4_4 = null;
                }
                if (var7_7 != 0) {
                    var10_10 = -1;
                    if (var19_19 != var10_10) {
                        var14_14 = var9_9.B();
                    }
                } else {
                    var19_19 = 58;
                    var10_10 = -1;
                    var9_9.h((char)var19_19);
                }
                if ((var19_19 = (int)var9_9.c()) == 0) break block56;
                if (var7_7 != 0) {
                    var19_19 = var2_2.e;
                    if (var19_19 == var10_10) {
                        var7_7 = var14_14 ^ 1;
                        var19_19 = var9_9.a;
                        if (var7_7 == 0) {
                            q0_0.r(var9_9, "Unexpected leading comma", var19_19, null, var13_13);
                            throw null;
                        }
                    } else {
                        var6_6 = 0;
                        var8_8 /* !! */  = null;
                        var19_19 = var9_9.a;
                        if (var14_14 == 0) {
                            q0_0.r(var9_9, "Expected comma after the key-value pair", var19_19, null, var13_13);
                            throw null;
                        }
                    }
                }
                var19_19 = var2_2.e;
                var7_7 = 1;
                var2_2.e = var11_11 = var19_19 + 1;
                break block44;
            }
            if (var14_14 == 0) ** GOTO lbl261
            var3_3 /* !! */  = var18_18.a;
            var19_19 = (int)var3_3 /* !! */ .n;
            if (var19_19 == 0) ** break;
            ** while (true)
            HT2.e(var9_9, var8_8 /* !! */ );
            throw null;
        }
        var3_3 /* !! */  = pj3_2.MAP;
        if (var5_5 != var3_3 /* !! */ ) {
            var3_3 /* !! */  = var9_9.b;
            var4_4 = var3_3 /* !! */ .b;
            var19_19 = var3_3 /* !! */ .c;
            var4_4[var19_19] = var11_11;
        }
        return var11_11;
    }

    public final Decoder n(SerialDescriptor object) {
        Object object2 = "descriptor";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = ee3_1.a((SerialDescriptor)object);
        if (bl2) {
            object2 = this.c;
            ml1_2 ml1_22 = this.a;
            object = new am1_2((q0_0)object2, ml1_22);
        } else {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = this;
        }
        return object;
    }

    public final short p() {
        short s7;
        long l2;
        q0_0 q0_02 = this.c;
        long l3 = q0_02.i();
        long l4 = l3 - (l2 = (long)(s7 = (short)l3));
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return s7;
        }
        StringBuilder stringBuilder = new StringBuilder("Failed to parse short for input '");
        stringBuilder.append(l3);
        stringBuilder.append('\'');
        String string2 = stringBuilder.toString();
        q0_0.r(q0_02, string2, 0, null, 6);
        throw null;
    }

    public final float q() {
        float f5;
        q0_0 q0_02 = this.c;
        Object object = q0_02.l();
        try {
            f5 = Float.parseFloat((String)object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object = oj_0.b('\'', "Failed to parse type 'float' for input '", (String)object);
            q0_0.r(q0_02, (String)object, 0, null, 6);
            throw null;
        }
        sl1_2 sl1_22 = this.a.a;
        boolean bl2 = sl1_22.k;
        if (!bl2 && ((bl2 = Float.isInfinite(f5)) || (bl2 = Float.isNaN(f5)))) {
            object = Float.valueOf(f5);
            HT2.g(q0_02, (Number)object);
            throw null;
        }
        return f5;
    }

    public final double s() {
        double d2;
        q0_0 q0_02 = this.c;
        Object object = q0_02.l();
        try {
            d2 = Double.parseDouble((String)object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object = oj_0.b('\'', "Failed to parse type 'double' for input '", (String)object);
            q0_0.r(q0_02, (String)object, 0, null, 6);
            throw null;
        }
        object = this.a.a;
        boolean bl2 = ((sl1_2)object).k;
        if (!bl2 && ((bl2 = Double.isInfinite(d2)) || (bl2 = Double.isNaN(d2)))) {
            object = d2;
            HT2.g(q0_02, (Number)object);
            throw null;
        }
        return d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean t() {
        q0_0 q0_02 = this.c;
        int n3 = q0_02.z();
        CharSequence charSequence = q0_02.t();
        int n4 = charSequence.length();
        String string2 = "EOF";
        int n7 = 6;
        if (n3 == n4) {
            q0_0.r(q0_02, string2, 0, null, n7);
            throw null;
        }
        charSequence = q0_02.t();
        n4 = charSequence.charAt(n3);
        int n8 = 1;
        int n10 = 34;
        if (n4 == n10) {
            ++n3;
            n4 = 1;
        } else {
            n4 = 0;
            charSequence = null;
        }
        n3 = q0_02.y(n3);
        CharSequence charSequence2 = q0_02.t();
        int n14 = charSequence2.length();
        if (n3 < n14 && n3 != (n14 = -1)) {
            int n15;
            charSequence2 = q0_02.t();
            int n16 = n3 + 1;
            if ((n3 = charSequence2.charAt(n3) | 0x20) != (n14 = 102)) {
                n14 = 116;
                if (n3 != n14) {
                    StringBuilder stringBuilder = new StringBuilder("Expected valid boolean literal prefix, but had '");
                    charSequence = q0_02.l();
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append('\'');
                    String string3 = stringBuilder.toString();
                    q0_0.r(q0_02, string3, 0, null, n7);
                    throw null;
                }
                String string4 = "rue";
                q0_02.d(n16, string4);
                n3 = 1;
            } else {
                q0_02.d(n16, "alse");
                n3 = 0;
                Object var12_15 = null;
            }
            if (n4 == 0) return n3 != 0;
            n4 = q0_02.a;
            charSequence2 = q0_02.t();
            n14 = charSequence2.length();
            if (n4 == n14) {
                q0_0.r(q0_02, string2, 0, null, n7);
                throw null;
            }
            charSequence = q0_02.t();
            n4 = charSequence.charAt(n15 = q0_02.a);
            if (n4 == n10) {
                q0_02.a = n4 = q0_02.a + n8;
                return n3 != 0;
            }
            q0_0.r(q0_02, "Expected closing quotation mark", 0, null, n7);
            throw null;
        }
        q0_0.r(q0_02, string2, 0, null, n7);
        throw null;
    }

    public final char u() {
        int n3;
        q0_0 q0_02 = this.c;
        String string2 = q0_02.l();
        int n4 = string2.length();
        if (n4 == (n3 = 1)) {
            return string2.charAt(0);
        }
        string2 = oj_0.b('\'', "Expected single char, but got '", string2);
        q0_0.r(q0_02, string2, 0, null, 6);
        throw null;
    }

    public final Object v(SerialDescriptor object, int n3, qp0_2 objectArray, Object object2) {
        int n4;
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Intrinsics.checkNotNullParameter(objectArray, "deserializer");
        Object object3 = pj3_2.MAP;
        pj3_2 pj3_22 = this.b;
        int n7 = 1;
        if (pj3_22 == object3 && (n4 = n3 & 1) == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object3 = null;
        }
        int n8 = -2;
        q0_0 q0_02 = this.c;
        if (n4 != 0) {
            Object[] objectArray2 = q0_02.b;
            Object object4 = objectArray2.b;
            int n10 = objectArray2.c;
            int n14 = object4[n10];
            if (n14 == n8) {
                objectArray2 = objectArray2.a;
                object4 = Cm1$a.a;
                objectArray2[n10] = object4;
            }
        }
        object = super.v((SerialDescriptor)object, n3, (qp0_2)objectArray, object2);
        if (n4 != 0) {
            Object object5 = q0_02.b;
            objectArray = ((cm1_1)object5).b;
            int n15 = ((cm1_1)object5).c;
            Object object6 = objectArray[n15];
            if (object6 != n8) {
                ((cm1_1)object5).c = n15 += n7;
                objectArray = ((cm1_1)object5).a;
                n4 = objectArray.length;
                if (n15 == n4) {
                    objectArray = Arrays.copyOf(objectArray, n15 *= 2);
                    object3 = "copyOf(...)";
                    Intrinsics.checkNotNullExpressionValue(objectArray, (String)object3);
                    ((cm1_1)object5).a = objectArray;
                    objectArray = Arrays.copyOf(((cm1_1)object5).b, n15);
                    Intrinsics.checkNotNullExpressionValue(objectArray, (String)object3);
                    ((cm1_1)object5).b = (int[])objectArray;
                }
            }
            objectArray = ((cm1_1)object5).a;
            n15 = ((cm1_1)object5).c;
            objectArray[n15] = object;
            object5 = ((cm1_1)object5).b;
            object5[n15] = n8;
        }
        return object;
    }

    public final String w() {
        Object object = this.g;
        boolean bl2 = ((sl1_2)object).c;
        q0_0 q0_02 = this.c;
        object = bl2 ? q0_02.m() : q0_02.j();
        return object;
    }
}


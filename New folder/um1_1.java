/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/*
 * Renamed from Um1
 */
public final class um1_1 {
    public final q0_0 a;
    public final boolean b;
    public final boolean c;
    public int d;

    public um1_1(sl1_2 sl1_22, q0_0 q0_02) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(sl1_22, "configuration");
        Intrinsics.checkNotNullParameter(q0_02, "lexer");
        this.a = q0_02;
        this.b = bl3 = sl1_22.c;
        this.c = bl2 = sl1_22.n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(um1_1 var0, xj0_2 var1_1, f80_0 var2_2) {
        block15: {
            block12: {
                block13: {
                    block14: {
                        var0.getClass();
                        var3_3 = var2_2 /* !! */  instanceof tm1_2;
                        if (!var3_3) ** GOTO lbl-1000
                        var4_4 = var2_2 /* !! */ ;
                        var4_4 = (tm1_2)var2_2 /* !! */ ;
                        var5_5 = var4_4.g;
                        var6_6 = -1 << -1;
                        var7_7 = var5_5 & var6_6;
                        if (var7_7 != 0) {
                            var4_4.g = var5_5 -= var6_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_4 = new tm1_2((um1_1)var0, (f80_0)var2_2 /* !! */ );
                        }
                        var2_2 /* !! */  = var4_4.e;
                        var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var6_6 = var4_4.g;
                        var7_7 = 0;
                        var9_9 = 6;
                        var10_10 = 7;
                        var11_11 = 4;
                        var12_12 = 1;
                        if (var6_6 == 0) break block13;
                        if (var6_6 != var12_12) break block14;
                        var0 = var4_4.d;
                        var1_1 = var4_4.c;
                        var13_13 = var4_4.b;
                        var14_14 /* !! */  = var4_4.a;
                        vl2_2.b(var2_2 /* !! */ );
                        var15_15 = var4_4;
                        var4_4 = var1_1;
                        var1_1 = var14_14 /* !! */ ;
                        var14_14 /* !! */  = var15_15;
                        ** GOTO lbl65
                    }
                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var0;
                }
                vl2_2.b(var2_2 /* !! */ );
                var2_2 /* !! */  = var0.a;
                var6_6 = var2_2 /* !! */ .g((byte)var9_9);
                var16_16 = var2_2 /* !! */ .w();
                if (var16_16 == var11_11) break block15;
                var2_2 /* !! */  = new LinkedHashMap();
                while ((var17_17 = (var14_14 /* !! */  = var0.a).c()) != 0) {
                    var6_6 = (int)var0.b;
                    var13_13 = var6_6 != 0 ? var14_14 /* !! */ .l() : var14_14 /* !! */ .j();
                    var17_17 = 5;
                    var14_14 /* !! */ .g(var17_17);
                    var14_14 /* !! */  = Unit.a;
                    var4_4.a = var1_1;
                    var4_4.b = var0;
                    var4_4.c = var2_2 /* !! */ ;
                    var4_4.d = var13_13;
                    var4_4.g = var12_12;
                    var14_14 /* !! */  = var1_1.a(var14_14 /* !! */ , (tm1_2)var4_4);
                    if (var14_14 /* !! */  == var8_8 /* !! */ ) break block12;
                    var15_15 = var13_13;
                    var13_13 = var0;
                    var0 = var15_15;
                    var18_18 = var4_4;
                    var4_4 = var2_2 /* !! */ ;
                    var2_2 /* !! */  = var14_14 /* !! */ ;
                    var14_14 /* !! */  = var18_18;
lbl65:
                    // 2 sources

                    var2_2 /* !! */  = (JsonElement)var2_2 /* !! */ ;
                    var4_4.put(var0, var2_2 /* !! */ );
                    var0 = var13_13.a;
                    var19_19 = var0.f();
                    if (var19_19 != var11_11) {
                        if (var19_19 == var10_10) {
                            var2_2 /* !! */  = var4_4;
                            var15_15 = var13_13;
                            var6_6 = var19_19;
                            var0 = var13_13;
                            break;
                        }
                        q0_0.r(var13_13.a, "Expected end of the object or comma", 0, null, var9_9);
                        throw null;
                    }
                    var2_2 /* !! */  = var4_4;
                    var4_4 = var14_14 /* !! */ ;
                    var15_15 = var13_13;
                    var6_6 = var19_19;
                    var0 = var13_13;
                }
                var1_1 = var0.a;
                if (var6_6 == var9_9) {
                    var1_1.g(var10_10);
                } else if (var6_6 == var11_11) {
                    var19_19 = var0.c;
                    if (var19_19 != 0) {
                        var1_1.g(var10_10);
                    } else {
                        HT2.e((q0_0)var1_1, "object");
                        throw null;
                    }
                }
                var8_8 /* !! */  = new JsonObject((Map)var2_2 /* !! */ );
            }
            return var8_8 /* !! */ ;
        }
        q0_0.r(var2_2 /* !! */ , "Unexpected leading comma", 0, null, var9_9);
        throw null;
    }

    public final JsonElement b() {
        int n3;
        int n4;
        Object object;
        block42: {
            block38: {
                int n7;
                block40: {
                    block41: {
                        block32: {
                            int n8;
                            LinkedHashMap<String, JsonElement> linkedHashMap;
                            int n10;
                            block36: {
                                Object object2;
                                boolean bl2;
                                block39: {
                                    block37: {
                                        object = this.a;
                                        n4 = ((q0_0)object).w();
                                        if (n4 != (n7 = 1)) break block37;
                                        object = this.d(n7 != 0);
                                        break block38;
                                    }
                                    bl2 = false;
                                    object2 = null;
                                    if (n4 != 0) break block39;
                                    object = this.d(false);
                                    break block38;
                                }
                                n3 = 6;
                                int n14 = 0;
                                if (n4 != n3) break block40;
                                this.d = n4 = this.d + n7;
                                n7 = 200;
                                if (n4 == n7) {
                                    Object object3 = new sm1_2(this, null);
                                    object = new vj0_2((sm1_2)object3);
                                    Object object4 = Unit.a;
                                    object2 = wj0_2.a;
                                    String string2 = "<this>";
                                    Intrinsics.checkNotNullParameter(object, string2);
                                    Intrinsics.checkNotNullParameter(object3, "block");
                                    yj0_2 yj0_22 = new xj0_2(null);
                                    yj0_22.a = object3;
                                    yj0_22.b = object4;
                                    object = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>";
                                    Intrinsics.checkNotNull(yj0_22, (String)object);
                                    yj0_22.c = yj0_22;
                                    object3 = wj0_2.a;
                                    yj0_22.d = object3;
                                    while (true) {
                                        object = yj0_22.d;
                                        object4 = yj0_22.c;
                                        if (object4 == null) {
                                            vl2_2.b(object);
                                            object = (JsonElement)object;
                                            break block32;
                                        }
                                        object2 = tl2_2.b;
                                        bl2 = Intrinsics.areEqual(object3, object);
                                        if (bl2) {
                                            block35: {
                                                object = yj0_22.a;
                                                object2 = yj0_22.b;
                                                n3 = object instanceof xv_1;
                                                n14 = 3;
                                                if (n3 == 0) {
                                                    Object object5;
                                                    block34: {
                                                        Serializable serializable;
                                                        block33: {
                                                            Intrinsics.checkNotNullParameter(object, string2);
                                                            object5 = "completion";
                                                            Intrinsics.checkNotNullParameter(object4, (String)object5);
                                                            Intrinsics.checkNotNullParameter(object4, (String)object5);
                                                            object5 = object4.getContext();
                                                            serializable = f.a;
                                                            if (object5 != serializable) break block33;
                                                            object5 = new ak1_2((f80_0)object4);
                                                            break block34;
                                                        }
                                                        serializable = new bk1_2((f80_0)object4, (CoroutineContext)object5);
                                                        object5 = serializable;
                                                    }
                                                    object = TypeIntrinsics.beforeCheckcastToFunctionOfArity(object, n14);
                                                    object = (gx0_2)object;
                                                    object = object.invoke(yj0_22, object2, object5);
                                                    break block35;
                                                }
                                                object = TypeIntrinsics.beforeCheckcastToFunctionOfArity(object, n14);
                                                object = (gx0_2)object;
                                                try {
                                                    object = object.invoke(yj0_22, object2, object4);
                                                }
                                                catch (Throwable throwable) {
                                                    object2 = tl2_2.b;
                                                    object = vl2_2.a(throwable);
                                                    object4.resumeWith(object);
                                                }
                                            }
                                            if (object == (object2 = j90_0.COROUTINE_SUSPENDED)) continue;
                                            object4.resumeWith(object);
                                            continue;
                                        }
                                        yj0_22.d = object3;
                                        object4.resumeWith(object);
                                    }
                                }
                                n4 = ((q0_0)object).g((byte)n3);
                                n7 = ((q0_0)object).w();
                                if (n7 == (n10 = 4)) break block41;
                                linkedHashMap = new LinkedHashMap<String, JsonElement>();
                                do {
                                    byte by2 = ((q0_0)object).c();
                                    n8 = 7;
                                    if (by2 == 0) break block36;
                                    n4 = (int)(this.b ? 1 : 0);
                                    String string3 = n4 != 0 ? ((q0_0)object).l() : ((q0_0)object).j();
                                    by2 = 5;
                                    ((q0_0)object).g(by2);
                                    JsonElement jsonElement = this.b();
                                    linkedHashMap.put(string3, jsonElement);
                                } while ((n4 = (int)((q0_0)object).f()) == n10);
                                if (n4 != n8) {
                                    q0_0.r((q0_0)object, "Expected end of the object or comma", 0, null, n3);
                                    throw null;
                                }
                            }
                            if (n4 == n3) {
                                ((q0_0)object).g((byte)n8);
                            } else if (n4 == n10) {
                                n4 = (int)(this.c ? 1 : 0);
                                if (n4 != 0) {
                                    ((q0_0)object).g((byte)n8);
                                } else {
                                    HT2.e((q0_0)object, "object");
                                    throw null;
                                }
                            }
                            object = new JsonObject(linkedHashMap);
                        }
                        this.d = n4 = this.d + -1;
                        break block38;
                    }
                    q0_0.r((q0_0)object, "Unexpected leading comma", 0, null, n3);
                    throw null;
                }
                n7 = 8;
                if (n4 != n7) break block42;
                object = this.c();
            }
            return object;
        }
        String string4 = r0_0.d((byte)n4);
        string4 = "Cannot read Json element because of unexpected ".concat(string4);
        q0_0.r((q0_0)object, string4, 0, null, n3);
        throw null;
    }

    public final JsonArray c() {
        Object object = this.a;
        int n3 = ((q0_0)object).f();
        byte by2 = ((q0_0)object).w();
        int n4 = 0;
        byte by4 = 4;
        if (by2 != by4) {
            int n7;
            ArrayList<JsonElement> arrayList;
            block7: {
                arrayList = new ArrayList<JsonElement>();
                while (true) {
                    boolean bl2 = ((q0_0)object).c();
                    n7 = 9;
                    if (!bl2) break block7;
                    JsonElement jsonElement = this.b();
                    arrayList.add(jsonElement);
                    n3 = ((q0_0)object).f();
                    if (n3 == by4) continue;
                    bl2 = n3 == n7;
                    n7 = ((q0_0)object).a;
                    if (!bl2) break;
                }
                q0_0.r((q0_0)object, "Expected end of the array or comma", n7, null, by4);
                throw null;
            }
            n4 = 8;
            if (n3 == n4) {
                ((q0_0)object).g((byte)n7);
            } else if (n3 == by4) {
                n3 = (int)(this.c ? 1 : 0);
                if (n3 != 0) {
                    ((q0_0)object).g((byte)n7);
                } else {
                    HT2.e((q0_0)object, "array");
                    throw null;
                }
            }
            object = new JsonArray(arrayList);
            return object;
        }
        q0_0.r((q0_0)object, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public final JsonPrimitive d(boolean bl2) {
        boolean bl3;
        boolean bl4 = this.b;
        Object object = this.a;
        String string2 = !bl4 && bl2 ? ((q0_0)object).j() : ((q0_0)object).l();
        if (!bl2 && (bl3 = Intrinsics.areEqual(string2, object = "null"))) {
            return JsonNull.INSTANCE;
        }
        object = new tm1_1(string2, bl2, null);
        return object;
    }
}


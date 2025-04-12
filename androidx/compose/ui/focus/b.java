/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$2;
import androidx.compose.ui.focus.FocusPropertiesElement;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.b$a;
import androidx.compose.ui.focus.b$b;
import androidx.compose.ui.focus.b$c;
import androidx.compose.ui.platform.AndroidComposeView$h;
import androidx.compose.ui.platform.AndroidComposeView$i;
import androidx.compose.ui.platform.AndroidComposeView$j;
import androidx.compose.ui.platform.AndroidComposeView$k;
import androidx.compose.ui.platform.AndroidComposeView$l;
import androidx.compose.ui.platform.AndroidComposeView$m;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class b
implements bu0_1 {
    public final Function2 a;
    public final Function1 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final FocusTargetNode f;
    public final XT0 g;
    public final xu0_0 h;
    public final LP1 i;
    public CR1 j;

    public b(AndroidComposeView$h object, AndroidComposeView$i object2, AndroidComposeView$j functionBase, AndroidComposeView$k androidComposeView$k, AndroidComposeView$l androidComposeView$l, AndroidComposeView$m androidComposeView$m) {
        this.a = object2;
        this.b = functionBase;
        this.c = androidComposeView$k;
        this.d = androidComposeView$l;
        this.e = androidComposeView$m;
        this.f = object2 = new FocusTargetNode();
        super(0, this, b.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        this.g = object2 = new XT0((AndroidComposeView$h)object, (du0_1)functionBase);
        this.h = object = new xu0_0();
        functionBase = eu0_1.d;
        object2 = new kU0((Function1)((Object)functionBase));
        object = new FocusPropertiesElement((kU0)object2);
        object2 = new FocusOwnerImpl$modifier$2(this);
        this.i = object = kp1_0.a((LP1)object, (LP1)object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Boolean a(int var1_1, aG2 var2_2, Function1 var3_3) {
        block52: {
            block49: {
                block36: {
                    block51: {
                        block50: {
                            block45: {
                                block48: {
                                    block47: {
                                        block46: {
                                            block44: {
                                                block43: {
                                                    block41: {
                                                        block42: {
                                                            block40: {
                                                                block39: {
                                                                    block38: {
                                                                        block37: {
                                                                            var4_4 = this;
                                                                            var5_5 = var1_1;
                                                                            var6_6 = var2_2;
                                                                            var7_7 = var3_3;
                                                                            var8_8 = this.f;
                                                                            var9_9 = AU0.a(var8_8);
                                                                            var10_10 = 8;
                                                                            var11_11 = 7;
                                                                            var12_12 = 4;
                                                                            var13_13 = 3;
                                                                            var14_14 = 6;
                                                                            var15_15 = 5;
                                                                            var16_16 = 2;
                                                                            var17_17 = this.e;
                                                                            var18_18 = 1;
                                                                            if (var9_9 == null) ** GOTO lbl111
                                                                            var19_19 = (bp1_0)var17_17.invoke();
                                                                            var20_20 = var9_9.r1();
                                                                            var21_21 = LT0.a(var1_1, var18_18);
                                                                            if (!var21_21) break block37;
                                                                            var20_20 = var20_20.b;
                                                                            ** GOTO lbl97
                                                                        }
                                                                        var21_21 = LT0.a(var1_1, var16_16);
                                                                        if (!var21_21) break block38;
                                                                        var20_20 = var20_20.c;
                                                                        ** GOTO lbl97
                                                                    }
                                                                    var21_21 = LT0.a(var1_1, var15_15);
                                                                    if (!var21_21) break block39;
                                                                    var20_20 = var20_20.d;
                                                                    ** GOTO lbl97
                                                                }
                                                                var21_21 = LT0.a(var1_1, var14_14);
                                                                if (!var21_21) break block40;
                                                                var20_20 = var20_20.e;
                                                                ** GOTO lbl97
                                                            }
                                                            var21_21 = LT0.a(var1_1, var13_13);
                                                            if (!var21_21) break block41;
                                                            var22_22 = AU0$a.$EnumSwitchMapping$0;
                                                            var23_23 = var19_19.ordinal();
                                                            var14_14 = var22_22[var23_23];
                                                            if (var14_14 == var18_18) ** GOTO lbl50
                                                            if (var14_14 == var16_16) {
                                                                var24_24 = var20_20.i;
                                                            } else {
                                                                var25_25 = new NoWhenBranchMatchedException();
                                                                throw var25_25;
lbl50:
                                                                // 1 sources

                                                                var24_24 = var20_20.h;
                                                            }
                                                            var26_32 = ou0_0.b;
                                                            if (var24_24 == var26_32) {
                                                                var14_14 = 0;
                                                                var24_24 = null;
                                                            }
                                                            if (var24_24 != null) break block42;
                                                            var20_20 = var20_20.f;
                                                            ** GOTO lbl97
                                                        }
lbl59:
                                                        // 2 sources

                                                        while (true) {
                                                            var20_20 = var24_24;
                                                            ** GOTO lbl97
                                                            break;
                                                        }
                                                    }
                                                    var14_14 = (int)LT0.a(var1_1, var12_12);
                                                    if (var14_14 == 0) break block43;
                                                    var24_24 = AU0$a.$EnumSwitchMapping$0;
                                                    var15_15 = var19_19.ordinal();
                                                    var14_14 = (int)var24_24[var15_15];
                                                    if (var14_14 == var18_18) ** GOTO lbl74
                                                    if (var14_14 == var16_16) {
                                                        var24_24 = var20_20.h;
                                                    } else {
                                                        var25_26 = new NoWhenBranchMatchedException();
                                                        throw var25_26;
lbl74:
                                                        // 1 sources

                                                        var24_24 = var20_20.i;
                                                    }
                                                    var26_32 = ou0_0.b;
                                                    if (var24_24 == var26_32) {
                                                        var14_14 = 0;
                                                        var24_24 = null;
                                                    }
                                                    ** while (var24_24 != null)
lbl80:
                                                    // 1 sources

                                                    var20_20 = var20_20.g;
                                                    ** GOTO lbl97
                                                }
                                                var14_14 = (int)LT0.a(var1_1, var11_11);
                                                if (var14_14 == 0) break block44;
                                                var24_24 = var20_20.j;
                                                var26_32 = new LT0(var1_1);
                                                var20_20 = var24_24 = var24_24.invoke(var26_32);
                                                var20_20 = (ou0_0)var24_24;
                                                ** GOTO lbl97
                                            }
                                            var14_14 = (int)LT0.a(var1_1, var10_10);
                                            if (var14_14 != 0) {
                                                var24_24 = var20_20.k;
                                                var26_32 = new LT0(var1_1);
                                                var20_20 = var24_24 = var24_24.invoke(var26_32);
                                                var20_20 = (ou0_0)var24_24;
lbl97:
                                                // 9 sources

                                                var24_24 = ou0_0.c;
                                                var14_14 = (int)Intrinsics.areEqual(var20_20, var24_24);
                                                if (var14_14 != 0) {
                                                    return null;
                                                }
                                                var14_14 = 0;
                                                var24_24 = null;
                                                var26_32 = ou0_0.b;
                                                var15_15 = (int)Intrinsics.areEqual(var20_20, var26_32);
                                                if (var15_15 == 0) {
                                                    return var20_20.a((Function1)var7_7);
                                                }
                                            } else {
                                                var6_6 = "invalid FocusDirection".toString();
                                                var25_27 = new IllegalStateException((String)var6_6);
                                                throw var25_27;
lbl111:
                                                // 1 sources

                                                var14_14 = 0;
                                                var24_24 = null;
                                                var27_33 = 0;
                                                var9_9 = null;
                                            }
                                            var26_32 = (bp1_0)var17_17.invoke();
                                            var17_17 = new b$b((FocusTargetNode)var9_9, var4_4, (Function1)var7_7);
                                            var28_34 = LT0.a(var5_5, var18_18);
                                            var28_34 = var28_34 != 0 ? 1 : LT0.a(var5_5, var16_16);
                                            if (var28_34 == 0) break block45;
                                            var29_35 = LT0.a(var5_5, var18_18);
                                            if (!var29_35) break block46;
                                            var5_5 = (int)u92_0.b(var8_8, (b$b)var17_17);
                                            break block47;
                                        }
                                        if ((var5_5 = (int)LT0.a(var5_5, var16_16)) == 0) break block48;
                                        var5_5 = (int)u92_0.a(var8_8, (b$b)var17_17);
                                    }
                                    var20_20 = (boolean)var5_5;
                                    break block49;
                                }
                                var6_6 = "This function should only be used for 1-D focus search".toString();
                                var25_28 = new IllegalStateException((String)var6_6);
                                throw var25_28;
                            }
                            var28_34 = LT0.a(var5_5, var13_13);
                            var28_34 = var28_34 != 0 ? 1 : LT0.a(var5_5, var12_12);
                            var28_34 = var28_34 != 0 ? 1 : LT0.a(var5_5, 5);
                            if ((var28_34 = var28_34 != 0 ? 1 : LT0.a(var5_5, 6)) == 0) break block50;
                            var20_20 = Ts3.j(var5_5, (aG2)var6_6, (b$b)var17_17, var8_8);
                            break block49;
                        }
                        var28_34 = LT0.a(var5_5, var11_11);
                        if (var28_34 == 0) break block51;
                        var25_29 /* !! */  = AU0$a.$EnumSwitchMapping$0;
                        var28_34 = var26_32.ordinal();
                        var5_5 = var25_29 /* !! */ [var28_34];
                        if (var5_5 != var18_18) {
                            if (var5_5 == var16_16) {
                                var12_12 = 3;
                            } else {
                                var25_29 /* !! */  = (int[])new NoWhenBranchMatchedException;
                                var25_29 /* !! */ ();
                                throw var25_29 /* !! */ ;
                            }
                        }
                        var20_20 = (var25_29 /* !! */  = (int[])AU0.a(var8_8)) != null ? Ts3.j(var12_12, (aG2)var6_6, (b$b)var17_17, (FocusTargetNode)var25_29 /* !! */ ) : null;
                        break block49;
                    }
                    var29_36 = LT0.a(var5_5, var10_10);
                    if (!var29_36) break block52;
                    var25_30 = AU0.a(var8_8);
                    var29_36 = false;
                    var6_6 = null;
                    if (var25_30 != null) {
                        var7_7 = var25_30.a;
                        var27_33 = var7_7.m;
                        if (var27_33 != 0) {
                            var7_7 = var7_7.e;
                            var25_30 = go0.f((fo0)var25_30);
                            while (var25_30 != null) {
                                var9_9 = var25_30.y.e;
                                var27_33 = var9_9.d & 1024;
                                if (var27_33 != 0) {
                                    while (var7_7 != null) {
                                        var27_33 = var7_7.c & 1024;
                                        if (var27_33 != 0) {
                                            var9_9 = var7_7;
                                            var10_10 = 0;
                                            var30_37 = null;
                                            while (var9_9 != null) {
                                                var11_11 = var9_9 instanceof FocusTargetNode;
                                                if (var11_11 != 0) {
                                                    var9_9 = (FocusTargetNode)var9_9;
                                                    var31_38 = var9_9.r1();
                                                    var11_11 = (int)var31_38.a;
                                                    if (var11_11 != 0) {
                                                        var20_20 = var9_9;
                                                        break block36;
                                                    }
                                                } else {
                                                    var11_11 = ((LP1$c)var9_9).c & 1024;
                                                    if (var11_11 != 0 && (var11_11 = var9_9 instanceof mo0_0) != 0) {
                                                        var31_38 = var9_9;
                                                        var31_38 = ((mo0_0)var9_9).o;
                                                        var12_12 = 0;
                                                        while (var31_38 != null) {
                                                            var13_13 = var31_38.c & 1024;
                                                            if (var13_13 != 0) {
                                                                if (++var12_12 == var18_18) {
                                                                    var9_9 = var31_38;
                                                                } else {
                                                                    if (var30_37 == null) {
                                                                        var13_13 = 16;
                                                                        var32_39 = new LP1$c[var13_13];
                                                                        var30_37 = new WR1(var32_39);
                                                                    }
                                                                    if (var9_9 != null) {
                                                                        var30_37.b(var9_9);
                                                                        var27_33 = 0;
                                                                        var9_9 = null;
                                                                    }
                                                                    var30_37.b(var31_38);
                                                                }
                                                            }
                                                            var31_38 = var31_38.f;
                                                        }
                                                        if (var12_12 == var18_18) continue;
                                                    }
                                                }
                                                var9_9 = go0.b(var30_37);
                                            }
                                        }
                                        var7_7 = var7_7.e;
                                    }
                                }
                                if ((var25_30 = var25_30.A()) != null && (var7_7 = var25_30.y) != null) {
                                    var7_7 = var7_7.d;
                                    continue;
                                }
                                var28_34 = 0;
                                var7_7 = null;
                            }
                        } else {
                            var6_6 = "visitAncestors called on an unattached node".toString();
                            var25_30 = new IllegalStateException((String)var6_6);
                            throw var25_30;
                        }
                    }
                    var20_20 = null;
                }
                if (var20_20 != null && (var5_5 = (int)Intrinsics.areEqual(var20_20, var8_8)) == 0) {
                    var25_30 = (Boolean)var17_17.invoke(var20_20);
                    var29_36 = var25_30.booleanValue();
                }
                var20_20 = var29_36;
            }
            return var20_20;
        }
        var7_7 = new StringBuilder("Focus search invoked with invalid FocusDirection ");
        var25_31 = LT0.b(var1_1);
        var7_7.append((Object)var25_31);
        var25_31 = var7_7.toString().toString();
        var6_6 = new IllegalStateException(var25_31);
        throw var6_6;
    }

    public final void b(nt0_0 nt0_02) {
        XT0 xT0 = this.g;
        pr1_1 pr1_12 = xT0.d;
        xT0.b(pr1_12, nt0_02);
    }

    public final xu0_0 c() {
        return this.h;
    }

    public final boolean d(int n3) {
        Object object;
        Object object2;
        Object object3 = new Ref$ObjectRef();
        ((Ref$ObjectRef)object3).element = object2 = Boolean.FALSE;
        object2 = (aG2)this.d.invoke();
        b$c b$c = new b$c((Ref$ObjectRef)object3, n3);
        object2 = this.a(n3, (aG2)object2, b$c);
        boolean bl2 = false;
        b$c = null;
        if (object2 != null && (object = ((Ref$ObjectRef)object3).element) != null) {
            boolean bl3;
            object = Boolean.TRUE;
            boolean bl4 = Intrinsics.areEqual(object2, object);
            boolean bl5 = true;
            if (bl4 && (bl3 = Intrinsics.areEqual(object3 = ((Ref$ObjectRef)object3).element, object))) {
                return bl5;
            }
            bl3 = LT0.a(n3, (int)(bl5 ? 1 : 0));
            bl3 = bl3 ? true : LT0.a(n3, 2);
            if (bl3) {
                bl3 = this.l(n3, false, false);
                if (bl3) {
                    object3 = new fu0_1(n3);
                    bl4 = false;
                    object2 = null;
                    Boolean bl6 = this.a(n3, null, (Function1)object3);
                    if (bl6 != null) {
                        n3 = (int)(bl6.booleanValue() ? 1 : 0);
                    } else {
                        n3 = 0;
                        bl6 = null;
                    }
                    if (n3 != 0) {
                        bl2 = true;
                    }
                }
                return bl2;
            }
            object3 = new LT0(n3);
            return (Boolean)this.b.invoke(object3);
        }
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean e(KeyEvent object) {
        Object[] objectArray;
        int n3;
        int n4;
        Object object2;
        int n7;
        Object object3;
        int n8;
        Object[] objectArray2;
        int n10;
        ArrayList<Object> arrayList;
        int n14;
        int n15;
        Object object4;
        int n16;
        String string2;
        int n17;
        block61: {
            object = this.g;
            n17 = ((XT0)object).a();
            string2 = null;
            if (n17 != 0) {
                System.out.println((Object)"FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
                return false;
            }
            object = AU0.a(this.f);
            n16 = 1;
            object4 = "visitAncestors called on an unattached node";
            n15 = 131072;
            n14 = 16;
            if (object == null) return false;
            arrayList = ((LP1$c)object).a;
            n10 = ((LP1$c)((Object)arrayList)).m;
            if (n10 != 0) {
                object = go0.f((fo0)object);
                while (object != null) {
                    objectArray2 = ((xp1_0)object).y.e;
                    n10 = objectArray2.d & n15;
                    if (n10 != 0) {
                        while (arrayList != null) {
                            n10 = ((LP1$c)((Object)arrayList)).c & n15;
                            if (n10 != 0) {
                                n8 = 0;
                                object3 = null;
                                objectArray2 = arrayList;
                                while (objectArray2 != null) {
                                    n7 = objectArray2 instanceof a93;
                                    if (n7 == 0) {
                                        n7 = ((LP1$c)objectArray2).c & n15;
                                        if (n7 != 0 && (n7 = objectArray2 instanceof mo0_0) != 0) {
                                            object2 = objectArray2;
                                            object2 = ((mo0_0)objectArray2).o;
                                            n4 = 0;
                                            Object var16_16 = null;
                                            while (object2 != null) {
                                                n3 = ((LP1$c)object2).c & n15;
                                                if (n3 != 0) {
                                                    if (++n4 == n16) {
                                                        objectArray2 = object2;
                                                    } else {
                                                        if (object3 == null) {
                                                            objectArray = new LP1$c[n14];
                                                            object3 = new WR1(objectArray);
                                                        }
                                                        if (objectArray2 != null) {
                                                            ((WR1)object3).b(objectArray2);
                                                            n10 = 0;
                                                            objectArray2 = null;
                                                        }
                                                        ((WR1)object3).b(object2);
                                                    }
                                                }
                                                object2 = ((LP1$c)object2).f;
                                            }
                                            if (n4 == n16) continue;
                                        }
                                        objectArray2 = go0.b((WR1)object3);
                                        continue;
                                    }
                                    break block61;
                                }
                            }
                            arrayList = ((LP1$c)((Object)arrayList)).e;
                        }
                    }
                    if ((object = ((xp1_0)object).A()) != null && (arrayList = ((xp1_0)object).y) != null) {
                        arrayList = ((T32)((Object)arrayList)).d;
                        continue;
                    }
                    arrayList = null;
                }
                n10 = 0;
                objectArray2 = null;
            } else {
                string2 = object4.toString();
                object = new IllegalStateException(string2);
                throw object;
            }
        }
        objectArray2 = (a93)objectArray2;
        if (objectArray2 == null) return false;
        object = objectArray2.e();
        n17 = ((LP1$c)object).m;
        if (n17 != 0) {
            int n18;
            object = objectArray2.e().e;
            object4 = go0.f((fo0)objectArray2);
            arrayList = null;
            while (object4 != null) {
                object3 = ((xp1_0)object4).y.e;
                n8 = ((LP1$c)object3).d & n15;
                if (n8 != 0) {
                    while (object != null) {
                        n8 = ((LP1$c)object).c & n15;
                        if (n8 != 0) {
                            object3 = object;
                            n7 = 0;
                            object2 = null;
                            while (object3 != null) {
                                n4 = object3 instanceof a93;
                                if (n4 != 0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList<Object>();
                                    }
                                    arrayList.add(object3);
                                } else {
                                    n4 = ((LP1$c)object3).c & n15;
                                    if (n4 != 0 && (n4 = object3 instanceof mo0_0) != 0) {
                                        void var16_20;
                                        Object object5 = object3;
                                        LP1$c lP1$c = ((mo0_0)object3).o;
                                        n3 = 0;
                                        objectArray = null;
                                        while (var16_20 != null) {
                                            int n19 = var16_20.c & n15;
                                            if (n19 != 0) {
                                                if (++n3 == n16) {
                                                    object3 = var16_20;
                                                } else {
                                                    if (object2 == null) {
                                                        Object[] objectArray3 = new LP1$c[n14];
                                                        object2 = new WR1(objectArray3);
                                                    }
                                                    if (object3 != null) {
                                                        ((WR1)object2).b(object3);
                                                        n8 = 0;
                                                        object3 = null;
                                                    }
                                                    ((WR1)object2).b(var16_20);
                                                }
                                            }
                                            LP1$c lP1$c2 = var16_20.f;
                                        }
                                        if (n3 == n16) continue;
                                    }
                                }
                                object3 = go0.b((WR1)object2);
                            }
                        }
                        object = ((LP1$c)object).e;
                    }
                }
                if ((object4 = ((xp1_0)object4).A()) != null && (object = ((xp1_0)object4).y) != null) {
                    object = ((T32)object).d;
                    continue;
                }
                n17 = 0;
                object = null;
            }
            if (arrayList != null && (n17 = arrayList.size() + -1) >= 0) {
                while (true) {
                    n18 = n17 + -1;
                    object = (a93)arrayList.get(n17);
                    if ((n17 = (int)(object.A() ? 1 : 0)) != 0) {
                        return n16 != 0;
                    }
                    if (n18 < 0) break;
                    n17 = n18;
                }
            }
            object = objectArray2.e();
            n18 = 0;
            object4 = null;
            while (object != null) {
                n8 = object instanceof a93;
                if (n8 != 0) {
                    n17 = (int)((object = (a93)object).A() ? 1 : 0);
                    if (n17 != 0) {
                        return n16 != 0;
                    }
                } else {
                    n8 = ((LP1$c)object).c & n15;
                    if (n8 != 0 && (n8 = object instanceof mo0_0) != 0) {
                        object3 = object;
                        object3 = ((mo0_0)object).o;
                        n7 = 0;
                        object2 = null;
                        while (object3 != null) {
                            n4 = ((LP1$c)object3).c & n15;
                            if (n4 != 0) {
                                if (++n7 == n16) {
                                    object = object3;
                                } else {
                                    if (object4 == null) {
                                        Object[] objectArray4 = new LP1$c[n14];
                                        object4 = new WR1(objectArray4);
                                    }
                                    if (object != null) {
                                        ((WR1)object4).b(object);
                                        n17 = 0;
                                        object = null;
                                    }
                                    ((WR1)object4).b(object3);
                                }
                            }
                            object3 = ((LP1$c)object3).f;
                        }
                        if (n7 == n16) continue;
                    }
                }
                object = go0.b((WR1)object4);
            }
            object = objectArray2.e();
            n18 = 0;
            object4 = null;
            while (object != null) {
                n10 = object instanceof a93;
                if (n10 != 0) {
                    n17 = (int)((object = (a93)object).W0() ? 1 : 0);
                    if (n17 != 0) {
                        return n16 != 0;
                    }
                } else {
                    n10 = ((LP1$c)object).c & n15;
                    if (n10 != 0 && (n10 = object instanceof mo0_0) != 0) {
                        objectArray2 = object;
                        objectArray2 = ((mo0_0)object).o;
                        n8 = 0;
                        object3 = null;
                        while (objectArray2 != null) {
                            n7 = objectArray2.c & n15;
                            if (n7 != 0) {
                                if (++n8 == n16) {
                                    object = objectArray2;
                                } else {
                                    if (object4 == null) {
                                        object2 = new LP1$c[n14];
                                        object4 = new WR1((Object[])object2);
                                    }
                                    if (object != null) {
                                        ((WR1)object4).b(object);
                                        n17 = 0;
                                        object = null;
                                    }
                                    ((WR1)object4).b(objectArray2);
                                }
                            }
                            objectArray2 = objectArray2.f;
                        }
                        if (n8 == n16) continue;
                    }
                }
                object = go0.b((WR1)object4);
            }
            if (arrayList == null) return false;
            n17 = arrayList.size();
            n18 = 0;
            object4 = null;
            while (n18 < n17) {
                a93 a932 = (a93)arrayList.get(n18);
                n15 = (int)(a932.W0() ? 1 : 0);
                if (n15 != 0) {
                    return n16 != 0;
                }
                ++n18;
            }
            return false;
        }
        string2 = object4.toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final boolean f() {
        return (Boolean)this.a.invoke(null, null);
    }

    public final void g(FocusTargetNode focusTargetNode) {
        XT0 xT0 = this.g;
        pr1_1 pr1_12 = xT0.c;
        xT0.b(pr1_12, focusTargetNode);
    }

    public final LP1 h() {
        return this.i;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean i(KeyEvent var1_1, Function0 var2_2) {
        block129: {
            block130: {
                block131: {
                    block126: {
                        block116: {
                            block127: {
                                block128: {
                                    block115: {
                                        block124: {
                                            block125: {
                                                block112: {
                                                    block122: {
                                                        block118: {
                                                            var3_3 = this;
                                                            var4_4 /* !! */  = var1_1;
                                                            var5_5 /* !! */  = 16;
                                                            var6_6 = 3;
                                                            var7_7 = 1;
                                                            var8_8 /* !! */  = this.g;
                                                            var9_9 = var8_8 /* !! */ .a();
                                                            var10_10 = 0;
                                                            var11_11 = null;
                                                            if (var9_9 != 0) {
                                                                System.out.println((Object)"FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                                                                return false;
                                                            }
                                                            var12_12 = bo1_1.c(var1_1);
                                                            var9_9 = bo1_1.d(var1_1);
                                                            var14_13 = ao1_2.a(var9_9, 2);
                                                            var15_14 = 6;
                                                            var16_15 = 1L;
                                                            var18_16 = 0L;
                                                            var20_17 = -9187201950435737472L;
                                                            var22_18 = 0x101010101010101L;
                                                            var24_19 = 63;
                                                            var25_20 = -862048943;
                                                            var26_21 = 32;
                                                            if (var14_13 == 0) break block118;
                                                            var8_8 /* !! */  = this.j;
                                                            if (var8_8 /* !! */  == null) {
                                                                var8_8 /* !! */  = new CR1(var6_6);
                                                                this.j = var8_8 /* !! */ ;
                                                            }
                                                            var27_22 = var8_8 /* !! */ ;
                                                            var28_23 = var12_12 >>> var26_21;
                                                            var30_24 = var12_12 ^ var28_23;
                                                            var9_9 = (int)var30_24 * var25_20;
                                                            var32_25 = var9_9 << 16;
                                                            var9_9 ^= var32_25;
                                                            var32_25 = var9_9 >>> 7;
                                                            var33_26 = var9_9 & 127;
                                                            var9_9 = var8_8 /* !! */ .c;
                                                            var34_27 = var32_25 & var9_9;
                                                            var35_28 = 0;
                                                            while (true) {
                                                                block119: {
                                                                    block111: {
                                                                        block121: {
                                                                            block120: {
                                                                                var36_30 = var27_22.a;
                                                                                var37_31 = var34_27 >> 3;
                                                                                var38_32 = var34_27 & 7;
                                                                                var10_10 = var38_32 << 3;
                                                                                var39_33 = var36_30[var37_31] >>> var10_10;
                                                                                var41_34 /* !! */  = var36_30[++var37_31];
                                                                                var43_35 = 64 - var10_10;
                                                                                var44_36 = -((long)var10_10) >> var24_19;
                                                                                var44_36 = (long)((var41_34 /* !! */  <<= var43_35) & var44_36);
                                                                                var44_36 = (long)(var39_33 | var44_36);
                                                                                var10_10 = var9_9;
                                                                                var46_37 = var33_26;
                                                                                var41_34 /* !! */  = (reference)(var46_37 * var22_18);
                                                                                var48_38 = var44_36 ^ var41_34 /* !! */ ;
                                                                                var41_34 /* !! */  = (reference)(var48_38 - var22_18);
                                                                                var48_38 ^= (long)-1;
                                                                                var48_38 = (long)(var41_34 /* !! */  & var48_38 & var20_17);
                                                                                while ((var37_31 = (int)(var48_38 == var18_16 ? 0 : (var48_38 < var18_16 ? -1 : 1))) != 0) {
                                                                                    var37_31 = Long.numberOfTrailingZeros(var48_38) >> 3;
                                                                                    var50_39 = var27_22.b;
                                                                                    var51_40 = var50_39[var37_31 = var34_27 + var37_31 & var10_10];
                                                                                    cfr_temp_0 = var51_40 - var12_12;
                                                                                    var53_41 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                                                    if (var53_41 /* !! */  == false) {
                                                                                        var51_40 = var12_12;
                                                                                        break block111;
                                                                                    }
                                                                                    var51_40 = var48_38 - var16_15;
                                                                                    var48_38 &= var51_40;
                                                                                }
                                                                                var48_38 = (var44_36 ^ (long)-1) << var15_14 & var44_36 & var20_17;
                                                                                cfr_temp_1 = var48_38 - var18_16;
                                                                                var54_42 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                                                if (var54_42 /* !! */  == false) break block119;
                                                                                var43_35 = var27_22.b(var32_25);
                                                                                var5_5 /* !! */  = var27_22.e;
                                                                                var55_43 = 128L;
                                                                                if (var5_5 /* !! */  != 0) break block120;
                                                                                var57_44 = var27_22.a;
                                                                                var10_10 = var43_35 >> 3;
                                                                                var58_45 = var57_44[var10_10];
                                                                                var5_5 /* !! */  = (var43_35 & 7) << var6_6;
                                                                                var60_46 = 254L;
                                                                                cfr_temp_2 = (var58_45 = var58_45 >> var5_5 /* !! */  & 255L) - var60_46;
                                                                                if ((var5_5 /* !! */  = (int)(cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1))) == 0) break block120;
                                                                                var43_35 = var27_22.c;
                                                                                var5_5 /* !! */  = 8;
                                                                                if (var43_35 <= var5_5 /* !! */ ) ** GOTO lbl-1000
                                                                                var5_5 /* !! */  = var27_22.d;
                                                                                var58_45 = (reference)((long)var5_5 /* !! */ );
                                                                                var57_44 = mt3_0.b;
                                                                                var58_45 *= (long)32;
                                                                                var48_38 = (long)var43_35 * (long)25;
                                                                                var60_46 = -9223372036854775808L;
                                                                                var43_35 = Long.compare((long)(var58_45 ^= var60_46), var48_38 ^= var60_46);
                                                                                if (var43_35 <= 0) {
                                                                                    var57_44 = var27_22.a;
                                                                                    var10_10 = var27_22.c;
                                                                                    var64_48 = var27_22.b;
                                                                                    et2_1.a((long[])var57_44, var10_10);
                                                                                    var43_35 = -1;
                                                                                    var53_41 /* !! */  = 0;
                                                                                    var50_39 = null;
                                                                                    while (var53_41 /* !! */  != var10_10) {
                                                                                        var65_49 = var53_41 /* !! */  >> 3;
                                                                                        var20_17 = (long)var57_44[var65_49];
                                                                                        var66_50 = (var53_41 /* !! */  & 7) << 3;
                                                                                        var20_17 >>= var66_50;
                                                                                        var67_51 = 255L;
                                                                                        cfr_temp_3 = (var20_17 &= var67_51) - var55_43;
                                                                                        var69_52 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                                                                        if (var69_52 /* !! */  == false) {
                                                                                            var69_52 /* !! */  = 1;
                                                                                            var43_35 = (int)(var53_41 /* !! */  + true);
                                                                                            var70_53 = var53_41 /* !! */ ;
                                                                                            var53_41 /* !! */  = var43_35;
                                                                                            var43_35 = (int)var70_53;
                                                                                            continue;
                                                                                        }
                                                                                        var69_52 /* !! */  = 1;
                                                                                        var28_23 = 254L;
                                                                                        cfr_temp_4 = var20_17 - var28_23;
                                                                                        var24_19 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                                                                        if (var24_19 != 0) {
                                                                                            ++var53_41 /* !! */ ;
                                                                                            continue;
                                                                                        }
                                                                                        var20_17 = var64_48[var53_41 /* !! */ ];
                                                                                        var67_51 = var20_17 >>> var26_21;
                                                                                        var55_43 = var20_17 ^ var67_51;
                                                                                        var54_42 /* !! */  = (int)var55_43 * var25_20;
                                                                                        var71_54 = var54_42 /* !! */  << 16;
                                                                                        var33_26 = var54_42 /* !! */  ^ var71_54;
                                                                                        var54_42 /* !! */  = var33_26 >>> 7;
                                                                                        var71_54 = var27_22.b((int)var54_42 /* !! */ );
                                                                                        var54_42 /* !! */  = var54_42 /* !! */  & var10_10;
                                                                                        var72_55 = var71_54 - var54_42 /* !! */  & var10_10;
                                                                                        var69_52 /* !! */  = 8;
                                                                                        var6_6 = var72_55 / 8;
                                                                                        var54_42 /* !! */  = (var53_41 /* !! */  - var54_42 /* !! */  & var10_10) / 8;
                                                                                        var67_51 = 0xFFFFFFFFFFFFFFL;
                                                                                        var4_4 /* !! */  = "<this>";
                                                                                        if (var6_6 == var54_42 /* !! */ ) {
                                                                                            var55_43 = var33_26 & 127;
                                                                                            var20_17 = (long)var57_44[var65_49];
                                                                                            var51_40 = var12_12;
                                                                                            var73_56 = 255L;
                                                                                            var12_12 = var73_56 << var66_50 ^ (long)-1;
                                                                                            var12_12 = var20_17 & var12_12;
                                                                                            var57_44[var65_49] = var12_12 |= (var55_43 <<= var66_50);
                                                                                            Intrinsics.checkNotNullParameter(var57_44, (String)var4_4 /* !! */ );
                                                                                            var75_29 = ((Object)var57_44).length;
                                                                                            var6_6 = 1;
                                                                                            var76_57 = 0;
                                                                                            var77_58 /* !! */  = null;
                                                                                            var12_12 = (long)(var57_44[0] & var67_51 | var60_46);
                                                                                            var57_44[var75_29 -= var6_6] = var12_12;
                                                                                            var53_41 /* !! */  += var6_6;
                                                                                            var4_4 /* !! */  = var1_1;
                                                                                            var12_12 = var51_40;
                                                                                            var6_6 = 3;
                                                                                            var55_43 = 128L;
                                                                                            continue;
                                                                                        }
                                                                                        var51_40 = var12_12;
                                                                                        var78_59 = (int)(var71_54 >> 3);
                                                                                        var79_60 = var57_44[var78_59];
                                                                                        var54_42 /* !! */  = (var71_54 & 7) << 3;
                                                                                        var62_47 = (long)(var79_60 >> var54_42 /* !! */ );
                                                                                        var81_61 = 255L;
                                                                                        var28_23 = 128L;
                                                                                        cfr_temp_5 = (var62_47 &= var81_61) - var28_23;
                                                                                        var76_57 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                                                                                        if (var76_57 == 0) {
                                                                                            var43_35 = var33_26 & 127;
                                                                                            var62_47 = var46_37;
                                                                                            var83_62 = var43_35;
                                                                                            var76_57 = var10_10;
                                                                                            var85_63 /* !! */  = var81_61 << var54_42 /* !! */  ^ (long)-1;
                                                                                            var85_63 /* !! */  = (long)(var79_60 & var85_63 /* !! */ );
                                                                                            var83_62 = var83_62 << var54_42 /* !! */  | var85_63 /* !! */ ;
                                                                                            var57_44[var78_59] = var83_62;
                                                                                            var83_62 = (long)var57_44[var65_49];
                                                                                            var85_63 /* !! */  = var81_61 << var66_50 ^ (long)-1;
                                                                                            var83_62 &= var85_63 /* !! */ ;
                                                                                            var85_63 /* !! */  = 128L;
                                                                                            var55_43 = var85_63 /* !! */  << var66_50;
                                                                                            var57_44[var65_49] = var83_62 |= var55_43;
                                                                                            var64_48[var71_54] = var83_62 = var64_48[var53_41 /* !! */ ];
                                                                                            var64_48[var53_41 /* !! */ ] = var18_16;
                                                                                            var87_64 = var32_25;
                                                                                            var43_35 = (int)var53_41 /* !! */ ;
                                                                                        } else {
                                                                                            var62_47 = var46_37;
                                                                                            var76_57 = var10_10;
                                                                                            var83_62 = var33_26 & 127;
                                                                                            var87_64 = var32_25;
                                                                                            var30_24 = 255L << var54_42 /* !! */ ;
                                                                                            var85_63 /* !! */  = var30_24 ^ (long)-1;
                                                                                            var85_63 /* !! */  = (long)(var79_60 & var85_63 /* !! */ );
                                                                                            var83_62 = var83_62 << var54_42 /* !! */  | var85_63 /* !! */ ;
                                                                                            var57_44[var78_59] = var83_62;
                                                                                            var6_6 = -1;
                                                                                            if (var43_35 == var6_6) {
                                                                                                var7_7 = 1;
                                                                                                var43_35 = (int)(var53_41 /* !! */  + true);
                                                                                                var43_35 = et2_1.b((long[])var57_44, var43_35, var10_10);
                                                                                            }
                                                                                            var64_48[var43_35] = var85_63 /* !! */  = var64_48[var71_54];
                                                                                            var64_48[var71_54] = var85_63 /* !! */  = var64_48[var53_41 /* !! */ ];
                                                                                            var64_48[var53_41 /* !! */ ] = var85_63 /* !! */  = var64_48[var43_35];
                                                                                            var70_53 = var53_41 /* !! */  + var6_6;
                                                                                            var53_41 /* !! */  = var43_35;
                                                                                            var43_35 = (int)var70_53;
                                                                                        }
                                                                                        Intrinsics.checkNotNullParameter(var57_44, (String)var4_4 /* !! */ );
                                                                                        var75_29 = ((Object)var57_44).length - 1;
                                                                                        var7_7 = 0;
                                                                                        var88_65 = null;
                                                                                        var85_63 /* !! */  = (long)var57_44[0];
                                                                                        var46_37 = var85_63 /* !! */  & var67_51 | var60_46;
                                                                                        var57_44[var75_29] = var46_37;
                                                                                        var75_29 = var43_35 + 1;
                                                                                        var10_10 = var76_57;
                                                                                        var43_35 = (int)var53_41 /* !! */ ;
                                                                                        var32_25 = var87_64;
                                                                                        var12_12 = var51_40;
                                                                                        var46_37 = var62_47;
                                                                                        var6_6 = 3;
                                                                                        var55_43 = 128L;
                                                                                        var53_41 /* !! */  = var75_29;
                                                                                        var4_4 /* !! */  = var1_1;
                                                                                    }
                                                                                    var62_47 = var46_37;
                                                                                    var51_40 = var12_12;
                                                                                    var87_64 = var32_25;
                                                                                    var75_29 = et2_1.c(var27_22.c);
                                                                                    var5_5 /* !! */  = var27_22.d;
                                                                                    var27_22.e = var75_29 -= var5_5 /* !! */ ;
                                                                                    var75_29 = var32_25;
                                                                                    var5_5 /* !! */  = 1;
                                                                                } else lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    var62_47 = var46_37;
                                                                                    var51_40 = var12_12;
                                                                                    var87_64 = var32_25;
                                                                                    var75_29 = et2_1.e(var27_22.c);
                                                                                    var57_44 = var27_22.a;
                                                                                    var89_66 = var27_22.b;
                                                                                    var7_7 = var27_22.c;
                                                                                    var27_22.c(var75_29);
                                                                                    var4_4 /* !! */  = (KeyEvent)var27_22.a;
                                                                                    var8_8 /* !! */  = var27_22.b;
                                                                                    var10_10 = var27_22.c;
                                                                                    var77_58 /* !! */  = null;
                                                                                    for (var76_57 = 0; var76_57 < var7_7; var76_57 += var5_5 /* !! */ ) {
                                                                                        var32_25 = var76_57 >> 3;
                                                                                        var30_24 = (long)var57_44[var32_25];
                                                                                        var54_42 /* !! */  = (var76_57 & 7) << 3;
                                                                                        var44_36 = 128L;
                                                                                        cfr_temp_6 = (var30_24 = var30_24 >> var54_42 /* !! */  & 255L) - var44_36;
                                                                                        var78_59 = (int)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                                                                                        if (var78_59 < 0) {
                                                                                            var30_24 = (long)var89_66[var76_57];
                                                                                            var44_36 = var30_24 >>> var26_21 ^ var30_24;
                                                                                            var78_59 = (int)var44_36 * var25_20;
                                                                                            var90_67 /* !! */  = var78_59 << 16;
                                                                                            var54_42 /* !! */  = (var78_59 ^= var90_67 /* !! */ ) >>> 7;
                                                                                            var54_42 /* !! */  = var27_22.b((int)var54_42 /* !! */ );
                                                                                            var58_45 = (reference)((long)(var78_59 & 127));
                                                                                            var78_59 = 3;
                                                                                            var15_14 = (int)(var54_42 /* !! */  >> 3);
                                                                                            var91_68 = (var54_42 /* !! */  & 7) << 3;
                                                                                            var92_69 = var4_4 /* !! */ [var15_14];
                                                                                            var94_70 = var57_44;
                                                                                            var95_71 = 255L;
                                                                                            var48_38 = var95_71 << var91_68 ^ (long)-1;
                                                                                            var48_38 = (long)(var92_69 & var48_38);
                                                                                            var4_4 /* !! */ [var15_14] = (KeyEvent)(var48_38 |= (var58_45 <<= var91_68));
                                                                                            var90_67 /* !! */  = var54_42 /* !! */  + -7 & var10_10;
                                                                                            var53_41 /* !! */  = var10_10 & 7;
                                                                                            var90_67 /* !! */  += var53_41 /* !! */ ;
                                                                                            var53_41 /* !! */  = 3;
                                                                                            var4_4 /* !! */ [var90_67 /* !! */  >>= var53_41 /* !! */ ] = (KeyEvent)var48_38;
                                                                                            var8_8 /* !! */ [var54_42 /* !! */ ] = var30_24;
lbl279:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                continue;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var94_70 = var57_44;
                                                                                        ** continue;
                                                                                        var5_5 /* !! */  = 1;
                                                                                        var57_44 = var94_70;
                                                                                    }
                                                                                    var5_5 /* !! */  = 1;
                                                                                    var75_29 = var87_64;
                                                                                }
                                                                                var75_29 = var27_22.b(var75_29);
                                                                                break block121;
                                                                            }
                                                                            var62_47 = var46_37;
                                                                            var51_40 = var12_12;
                                                                            var5_5 /* !! */  = 1;
                                                                            var75_29 = var43_35;
                                                                        }
                                                                        var43_35 = var27_22.d;
                                                                        var27_22.d = var6_6 = var43_35 + 1;
                                                                        var5_5 /* !! */  = var27_22.e;
                                                                        var89_66 = var27_22.a;
                                                                        var9_9 = var75_29 >> 3;
                                                                        var97_72 = var89_66[var9_9];
                                                                        var78_59 = (var75_29 & 7) << 3;
                                                                        var30_24 = (long)(var97_72 >> var78_59);
                                                                        var44_36 = 255L;
                                                                        var99_73 = 128L;
                                                                        cfr_temp_7 = (var30_24 &= var44_36) - var99_73;
                                                                        var7_7 = (int)(cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1));
                                                                        if (var7_7 == 0) {
                                                                            var7_7 = 1;
                                                                        } else {
                                                                            var7_7 = 0;
                                                                            var88_65 = null;
                                                                        }
                                                                        var27_22.e = var5_5 /* !! */  -= var7_7;
                                                                        var5_5 /* !! */  = var27_22.c;
                                                                        var30_24 = var44_36 << var78_59 ^ (long)-1;
                                                                        var97_72 &= var30_24;
                                                                        var30_24 = var62_47 << var78_59;
                                                                        var89_66[var9_9] = var97_72 |= var30_24;
                                                                        var7_7 = var75_29 + -7 & var5_5 /* !! */ ;
                                                                        var5_5 /* !! */  = (var7_7 += (var5_5 /* !! */  &= 7)) >> 3;
                                                                        var89_66[var5_5 /* !! */ ] = var97_72;
                                                                        var37_31 = var75_29;
                                                                    }
                                                                    var4_4 /* !! */  = (KeyEvent)var27_22.b;
                                                                    var4_4 /* !! */ [var37_31] = (KeyEvent)var51_40;
                                                                    break block112;
                                                                }
                                                                var51_40 = var12_12;
                                                                var75_29 = var32_25;
                                                                var34_27 = var34_27 + (var35_28 += 8) & var10_10;
                                                                var9_9 = var10_10;
                                                                var5_5 /* !! */  = 16;
                                                                var6_6 = 3;
                                                                var7_7 = 1;
                                                                var10_10 = 0;
                                                                var11_11 = null;
                                                                var4_4 /* !! */  = var1_1;
                                                            }
                                                        }
                                                        var51_40 = var12_12;
                                                        var5_5 /* !! */  = 1;
                                                        var75_29 = ao1_2.a(var9_9, var5_5 /* !! */ );
                                                        if (var75_29 == 0) break block112;
                                                        var4_4 /* !! */  = this.j;
                                                        if (var4_4 /* !! */  == null) break block122;
                                                        var83_62 = var12_12;
                                                        var75_29 = var4_4 /* !! */ .a(var12_12);
                                                        if (var75_29 != var5_5 /* !! */ ) break block122;
                                                        var4_4 /* !! */  = this.j;
                                                        if (var4_4 /* !! */  == null) break block112;
                                                        var85_63 /* !! */  = var12_12 >>> var26_21 ^ var12_12;
                                                        var5_5 /* !! */  = (int)var85_63 /* !! */  * var25_20;
                                                        var10_10 = var5_5 /* !! */  << 16;
                                                        var9_9 = (var5_5 /* !! */  ^= var10_10) & 127;
                                                        var10_10 = var4_4 /* !! */ .c;
                                                        var5_5 /* !! */  = var5_5 /* !! */  >>> 7 & var10_10;
                                                        var76_57 = 0;
                                                        var77_58 /* !! */  = null;
                                                        while (true) {
                                                            block123: {
                                                                block113: {
                                                                    var94_70 = var4_4 /* !! */ .a;
                                                                    var14_13 = 3;
                                                                    var32_25 = var5_5 /* !! */  >> 3;
                                                                    var33_26 = (var5_5 /* !! */  & 7) << var14_13;
                                                                    var44_36 = var94_70[var32_25] >>> var33_26;
                                                                    var43_35 = 1;
                                                                    var101_74 = var94_70[var32_25 += var43_35];
                                                                    var78_59 = 64 - var33_26;
                                                                    var103_75 = var101_74 << var78_59;
                                                                    var30_24 = -((long)var33_26) >> var24_19;
                                                                    var103_75 = var103_75 & var30_24 | var44_36;
                                                                    var30_24 = (long)var9_9 * var22_18 ^ var103_75;
                                                                    var44_36 = var30_24 - var22_18;
                                                                    var30_24 = (var30_24 ^ (long)-1) & var44_36 & var20_17;
                                                                    while ((var54_42 /* !! */  = var30_24 == var18_16 ? 0 : (var30_24 < var18_16 ? -1 : 1)) != false) {
                                                                        var64_48 = var4_4 /* !! */ .b;
                                                                        var54_42 /* !! */  = (Long.numberOfTrailingZeros(var30_24) >> 3) + var5_5 /* !! */  & var10_10;
                                                                        var105_76 = var64_48[var54_42 /* !! */ ];
                                                                        cfr_temp_8 = var105_76 - var83_62;
                                                                        var90_67 /* !! */  = (long)(cfr_temp_8 == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1));
                                                                        if (var90_67 /* !! */  == false) {
                                                                            var6_6 = (int)var54_42 /* !! */ ;
                                                                            break block113;
                                                                        }
                                                                        var44_36 = var30_24 - var16_15;
                                                                        var30_24 &= var44_36;
                                                                    }
                                                                    var30_24 = (var103_75 ^ (long)-1) << var15_14;
                                                                    cfr_temp_9 = (var103_75 = var103_75 & var30_24 & var20_17) - var18_16;
                                                                    var32_25 = (int)(cfr_temp_9 == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1));
                                                                    if (var32_25 == 0) break block123;
                                                                    var6_6 = -1;
                                                                }
                                                                if (var6_6 >= 0) {
                                                                    var5_5 /* !! */  = var4_4 /* !! */ .d;
                                                                    var43_35 = 1;
                                                                    var4_4 /* !! */ .d = var5_5 /* !! */  -= var43_35;
                                                                    var57_44 = var4_4 /* !! */ .a;
                                                                    var75_29 = var4_4 /* !! */ .c;
                                                                    var7_7 = 3;
                                                                    var9_9 = var6_6 >> 3;
                                                                    var10_10 = (var6_6 & 7) << var7_7;
                                                                    var12_12 = (long)var57_44[var9_9];
                                                                    var101_74 = 255L << var10_10 ^ (long)-1;
                                                                    var12_12 &= var101_74;
                                                                    var55_43 = 254L;
                                                                    var101_74 = var55_43 << var10_10;
                                                                    var97_72 = (reference)(var12_12 | var101_74);
                                                                    var57_44[var9_9] = var97_72;
                                                                    var6_6 = var6_6 + -7 & var75_29;
                                                                    var78_59 = 3;
                                                                    var75_29 = (var6_6 += (var75_29 &= 7)) >> 3;
                                                                    var57_44[var75_29] = var97_72;
                                                                }
                                                                break block112;
                                                            }
                                                            var78_59 = 3;
                                                            var101_74 = 255L;
                                                            var55_43 = 254L;
                                                            var90_67 /* !! */  = 8;
                                                            var5_5 /* !! */  = var5_5 /* !! */  + (var76_57 += var90_67 /* !! */ ) & var10_10;
                                                        }
                                                    }
                                                    return false;
                                                }
                                                var4_4 /* !! */  = var3_3.f;
                                                var57_44 = AU0.a((FocusTargetNode)var4_4 /* !! */ );
                                                var6_6 = 0;
                                                var89_66 = null;
                                                var88_65 = "visitAncestors called on an unattached node";
                                                if (var57_44 == null) break block124;
                                                var8_8 /* !! */  = var57_44.a;
                                                var10_10 = var8_8 /* !! */ .m;
                                                if (var10_10 == 0) break block125;
                                                var10_10 = var8_8 /* !! */ .d & 9216;
                                                if (var10_10 != 0) {
                                                    var8_8 /* !! */  = var8_8 /* !! */ .f;
                                                    var10_10 = 0;
                                                    var11_11 = null;
                                                    while (var8_8 /* !! */  != null) {
                                                        var76_57 = var8_8 /* !! */ .c;
                                                        var78_59 = var76_57 & 9216;
                                                        if (var78_59 != 0) {
                                                            if ((var76_57 &= 1024) != 0) break;
                                                            var11_11 = var8_8 /* !! */ ;
                                                        }
                                                        var8_8 /* !! */  = var8_8 /* !! */ .f;
                                                    }
                                                } else {
                                                    var10_10 = 0;
                                                    var11_11 = null;
                                                }
                                                if (var11_11 != null) break block126;
                                                break block124;
                                            }
                                            bh1_1.c("visitLocalDescendants called on an unattached node");
                                            throw null;
                                        }
                                        if (var57_44 == null) break block127;
                                        var8_8 /* !! */  = var57_44.a;
                                        var10_10 = var8_8 /* !! */ .m;
                                        if (var10_10 == 0) break block128;
                                        var57_44 = go0.f((fo0)var57_44);
                                        while (var57_44 != null) {
                                            var11_11 = var57_44.y.e;
                                            var10_10 = var11_11.d & 8192;
                                            if (var10_10 != 0) {
                                                while (var8_8 /* !! */  != null) {
                                                    var10_10 = var8_8 /* !! */ .c & 8192;
                                                    if (var10_10 != 0) {
                                                        var76_57 = 0;
                                                        var77_58 /* !! */  = null;
                                                        var11_11 = var8_8 /* !! */ ;
                                                        while (var11_11 != null) {
                                                            var78_59 = var11_11 instanceof eo1_2;
                                                            if (var78_59 == 0) {
                                                                var78_59 = ((LP1$c)var11_11).c & 8192;
                                                                if (var78_59 != 0 && (var78_59 = var11_11 instanceof mo0_0) != 0) {
                                                                    var94_70 = var11_11;
                                                                    var27_22 = ((mo0_0)var11_11).o;
                                                                    var94_70 = var77_58 /* !! */ ;
                                                                    var76_57 = 0;
                                                                    var77_58 /* !! */  = null;
                                                                    while (var27_22 != null) {
                                                                        var32_25 = var27_22.c & 8192;
                                                                        if (var32_25 != 0) {
                                                                            var43_35 = 1;
                                                                            if ((var76_57 += var43_35) == var43_35) {
                                                                                var11_11 = var27_22;
                                                                            } else {
                                                                                if (var94_70 == null) {
                                                                                    var94_70 = new WR1;
                                                                                    var32_25 = 16;
                                                                                    var107_77 = new LP1$c[var32_25];
                                                                                    var94_70(var107_77);
                                                                                }
                                                                                if (var11_11 != null) {
                                                                                    var94_70.b(var11_11);
                                                                                    var10_10 = 0;
                                                                                    var11_11 = null;
                                                                                }
                                                                                var94_70.b(var27_22);
                                                                            }
                                                                        }
                                                                        var27_22 = var27_22.f;
                                                                    }
                                                                    var43_35 = 1;
                                                                    if (var76_57 == var43_35) {
                                                                        var77_58 /* !! */  = (KeyEvent)var94_70;
                                                                        continue;
                                                                    }
                                                                    var77_58 /* !! */  = (KeyEvent)var94_70;
                                                                }
                                                                var11_11 = go0.b((WR1)var77_58 /* !! */ );
                                                                continue;
                                                            }
                                                            break block115;
                                                        }
                                                    }
                                                    var8_8 /* !! */  = var8_8 /* !! */ .e;
                                                }
                                            }
                                            if ((var57_44 = var57_44.A()) != null && (var8_8 /* !! */  = var57_44.y) != null) {
                                                var8_8 /* !! */  = var8_8 /* !! */ .d;
                                                continue;
                                            }
                                            var9_9 = 0;
                                            var8_8 /* !! */  = null;
                                        }
                                        var10_10 = 0;
                                        var11_11 = null;
                                    }
                                    if ((var11_11 = (eo1_2)var11_11) == null) break block127;
                                    var11_11 = var11_11.e();
                                    break block126;
                                }
                                var36_30 = var88_65.toString();
                                var4_4 /* !! */  = new IllegalStateException((String)var36_30);
                                throw var4_4 /* !! */ ;
                            }
                            var57_44 = var4_4 /* !! */ .a;
                            var9_9 = (int)var57_44.m;
                            if (var9_9 == 0) break block129;
                            var57_44 = var57_44.e;
                            var4_4 /* !! */  = go0.f((fo0)var4_4 /* !! */ );
                            while (var4_4 /* !! */  != null) {
                                var8_8 /* !! */  = var4_4 /* !! */ .y.e;
                                var9_9 = var8_8 /* !! */ .d & 8192;
                                if (var9_9 != 0) {
                                    while (var57_44 != null) {
                                        var9_9 = var57_44.c & 8192;
                                        if (var9_9 != 0) {
                                            var8_8 /* !! */  = var57_44;
                                            var10_10 = 0;
                                            var11_11 = null;
                                            while (var8_8 /* !! */  != null) {
                                                var76_57 = var8_8 /* !! */  instanceof eo1_2;
                                                if (var76_57 == 0) {
                                                    var76_57 = ((LP1$c)var8_8 /* !! */ ).c & 8192;
                                                    if (var76_57 != 0 && (var76_57 = var8_8 /* !! */  instanceof mo0_0) != 0) {
                                                        var77_58 /* !! */  = var8_8 /* !! */ ;
                                                        var77_58 /* !! */  = ((mo0_0)var8_8 /* !! */ ).o;
                                                        var78_59 = 0;
                                                        var94_70 = null;
                                                        while (var77_58 /* !! */  != null) {
                                                            var14_13 = var77_58 /* !! */ .c & 8192;
                                                            if (var14_13 != 0) {
                                                                var43_35 = 1;
                                                                if ((var78_59 += var43_35) == var43_35) {
                                                                    var8_8 /* !! */  = var77_58 /* !! */ ;
                                                                } else {
                                                                    if (var11_11 == null) {
                                                                        var14_13 = 16;
                                                                        var108_78 = new LP1$c[var14_13];
                                                                        var11_11 = new WR1(var108_78);
                                                                    }
                                                                    if (var8_8 /* !! */  != null) {
                                                                        var11_11.b(var8_8 /* !! */ );
                                                                        var9_9 = 0;
                                                                        var8_8 /* !! */  = null;
                                                                    }
                                                                    var11_11.b(var77_58 /* !! */ );
                                                                }
                                                            }
                                                            var77_58 /* !! */  = var77_58 /* !! */ .f;
                                                        }
                                                        var43_35 = 1;
                                                        if (var78_59 == var43_35) continue;
                                                    }
                                                    var8_8 /* !! */  = go0.b((WR1)var11_11);
                                                    continue;
                                                }
                                                break block116;
                                            }
                                        }
                                        var57_44 = var57_44.e;
                                    }
                                }
                                if ((var4_4 /* !! */  = var4_4 /* !! */ .A()) != null && (var57_44 = var4_4 /* !! */ .y) != null) {
                                    var57_44 = var57_44.d;
                                    continue;
                                }
                                var5_5 /* !! */  = 0;
                                var57_44 = null;
                            }
                            var9_9 = 0;
                            var8_8 /* !! */  = null;
                        }
                        if ((var8_8 /* !! */  = (eo1_2)var8_8 /* !! */ ) != null) {
                            var11_11 = var8_8 /* !! */ .e();
                        } else {
                            var10_10 = 0;
                            var11_11 = null;
                        }
                    }
                    if (var11_11 == null) break block130;
                    var4_4 /* !! */  = var11_11.a;
                    var5_5 /* !! */  = (int)var4_4 /* !! */ .m;
                    if (var5_5 /* !! */  == 0) break block131;
                    var4_4 /* !! */  = var4_4 /* !! */ .e;
                    var57_44 = go0.f((fo0)var11_11);
                    var7_7 = 0;
                    var88_65 = null;
                    while (var57_44 != null) {
                        var8_8 /* !! */  = var57_44.y.e;
                        var9_9 = var8_8 /* !! */ .d & 8192;
                        if (var9_9 != 0) {
                            while (var4_4 /* !! */  != null) {
                                var9_9 = var4_4 /* !! */ .c & 8192;
                                if (var9_9 != 0) {
                                    var8_8 /* !! */  = var4_4 /* !! */ ;
                                    var76_57 = 0;
                                    var77_58 /* !! */  = null;
                                    while (var8_8 /* !! */  != null) {
                                        var78_59 = var8_8 /* !! */  instanceof eo1_2;
                                        if (var78_59 != 0) {
                                            if (var88_65 == null) {
                                                var88_65 = new ArrayList<E>();
                                            }
                                            var88_65.add(var8_8 /* !! */ );
                                        } else {
                                            var78_59 = ((LP1$c)var8_8 /* !! */ ).c & 8192;
                                            if (var78_59 != 0 && (var78_59 = var8_8 /* !! */  instanceof mo0_0) != 0) {
                                                var94_70 = var8_8 /* !! */ ;
                                                var27_22 = ((mo0_0)var8_8 /* !! */ ).o;
                                                var94_70 = var77_58 /* !! */ ;
                                                var76_57 = 0;
                                                var77_58 /* !! */  = null;
                                                while (var27_22 != null) {
                                                    var32_25 = var27_22.c & 8192;
                                                    if (var32_25 != 0) {
                                                        var43_35 = 1;
                                                        if ((var76_57 += var43_35) == var43_35) {
                                                            var8_8 /* !! */  = var27_22;
                                                        } else {
                                                            if (var94_70 == null) {
                                                                var94_70 = new WR1;
                                                                var32_25 = 16;
                                                                var107_77 = new LP1$c[var32_25];
                                                                var94_70(var107_77);
                                                            }
                                                            if (var8_8 /* !! */  != null) {
                                                                var94_70.b(var8_8 /* !! */ );
                                                                var9_9 = 0;
                                                                var8_8 /* !! */  = null;
                                                            }
                                                            var94_70.b(var27_22);
                                                        }
                                                    }
                                                    var27_22 = var27_22.f;
                                                }
                                                var43_35 = 1;
                                                if (var76_57 == var43_35) {
                                                    var77_58 /* !! */  = (KeyEvent)var94_70;
                                                    continue;
                                                }
                                                var77_58 /* !! */  = (KeyEvent)var94_70;
                                            }
                                        }
                                        var8_8 /* !! */  = go0.b((WR1)var77_58 /* !! */ );
                                    }
                                }
                                var4_4 /* !! */  = var4_4 /* !! */ .e;
                            }
                        }
                        if ((var57_44 = var57_44.A()) != null && (var4_4 /* !! */  = var57_44.y) != null) {
                            var4_4 /* !! */  = var4_4 /* !! */ .d;
                            continue;
                        }
                        var75_29 = 0;
                        var4_4 /* !! */  = null;
                    }
                    if (var88_65 != null) {
                        var75_29 = var88_65.size();
                        var5_5 /* !! */  = -1;
                        if ((var75_29 += var5_5 /* !! */ ) >= 0) {
                            while (true) {
                                var9_9 = var75_29 + -1;
                                var4_4 /* !! */  = (eo1_2)var88_65.get(var75_29);
                                var77_58 /* !! */  = var1_1;
                                var75_29 = (int)var4_4 /* !! */ .n0(var1_1);
                                if (var75_29 != 0) {
                                    return true;
                                }
                                if (var9_9 >= 0) {
                                    var75_29 = var9_9;
                                    continue;
                                }
                                break;
                            }
                        } else {
                            var77_58 /* !! */  = var1_1;
                        }
                        var4_4 /* !! */  = Unit.a;
                    } else {
                        var77_58 /* !! */  = var1_1;
                    }
                    var4_4 /* !! */  = var11_11.a;
                    var5_5 /* !! */  = 0;
                    var57_44 = null;
                    while (var4_4 /* !! */  != null) {
                        var9_9 = var4_4 /* !! */  instanceof eo1_2;
                        if (var9_9 != 0) {
                            var75_29 = (int)(var4_4 /* !! */  = (eo1_2)var4_4 /* !! */ ).n0(var77_58 /* !! */ );
                            if (var75_29 != 0) {
                                return true;
                            }
                        } else {
                            var9_9 = ((LP1$c)var4_4 /* !! */ ).c & 8192;
                            if (var9_9 != 0 && (var9_9 = var4_4 /* !! */  instanceof mo0_0) != 0) {
                                var8_8 /* !! */  = var4_4 /* !! */ ;
                                var8_8 /* !! */  = ((mo0_0)var4_4 /* !! */ ).o;
                                var78_59 = 0;
                                var94_70 = null;
                                while (var8_8 /* !! */  != null) {
                                    var14_13 = var8_8 /* !! */ .c & 8192;
                                    if (var14_13 != 0) {
                                        var43_35 = 1;
                                        if ((var78_59 += var43_35) == var43_35) {
                                            var4_4 /* !! */  = var8_8 /* !! */ ;
                                        } else {
                                            if (var57_44 == null) {
                                                var14_13 = 16;
                                                var108_78 = new LP1$c[var14_13];
                                                var57_44 = new WR1(var108_78);
                                            }
                                            if (var4_4 /* !! */  != null) {
                                                var57_44.b(var4_4 /* !! */ );
                                                var75_29 = 0;
                                                var4_4 /* !! */  = null;
                                            }
                                            var57_44.b(var8_8 /* !! */ );
                                        }
                                    }
                                    var8_8 /* !! */  = var8_8 /* !! */ .f;
                                }
                                var43_35 = 1;
                                if (var78_59 == var43_35) continue;
                            }
                        }
                        var4_4 /* !! */  = go0.b((WR1)var57_44);
                    }
                    var4_4 /* !! */  = (Boolean)var2_2.invoke();
                    var75_29 = (int)var4_4 /* !! */ .booleanValue();
                    if (var75_29 != 0) {
                        return true;
                    }
                    var75_29 = 1;
                    var57_44 = var36_30 = var11_11.a;
                    var9_9 = 0;
                    var8_8 /* !! */  = null;
                    while (var57_44 != null) {
                        block117: {
                            var43_35 = var57_44 instanceof eo1_2;
                            if (var43_35 != 0) {
                                var43_35 = (int)(var57_44 = (eo1_2)var57_44).u0(var77_58 /* !! */ );
                                if (var43_35 != 0) {
                                    return (boolean)var75_29;
                                }
                                while (true) {
                                    var78_59 = 16;
                                    break block117;
                                    break;
                                }
                            }
                            if ((var75_29 = ((LP1$c)var57_44).c & 8192) == 0 || (var75_29 = var57_44 instanceof mo0_0) == 0) ** continue;
                            var4_4 /* !! */  = var57_44;
                            var4_4 /* !! */  = ((mo0_0)var57_44).o;
                            var10_10 = 0;
                            var11_11 = null;
                            while (var4_4 /* !! */  != null) {
                                var78_59 = var4_4 /* !! */ .c & 8192;
                                if (var78_59 == 0) ** GOTO lbl742
                                var43_35 = 1;
                                if ((var10_10 += var43_35) == var43_35) {
                                    var57_44 = var4_4 /* !! */ ;
lbl742:
                                    // 2 sources

                                    var78_59 = 16;
                                } else {
                                    if (var8_8 /* !! */  == null) {
                                        var78_59 = 16;
                                        var27_22 = new LP1$c[var78_59];
                                        var8_8 /* !! */  = new WR1(var27_22);
                                    } else {
                                        var78_59 = 16;
                                    }
                                    if (var57_44 != null) {
                                        var8_8 /* !! */ .b(var57_44);
                                        var5_5 /* !! */  = 0;
                                        var57_44 = null;
                                    }
                                    var8_8 /* !! */ .b(var4_4 /* !! */ );
                                }
                                var4_4 /* !! */  = var4_4 /* !! */ .f;
                            }
                            var75_29 = 1;
                            var78_59 = 16;
                            if (var10_10 == var75_29) continue;
                        }
                        var57_44 = go0.b((WR1)var8_8 /* !! */ );
                        var75_29 = 1;
                    }
                    if (var88_65 != null) {
                        var75_29 = var88_65.size();
                        var57_44 = null;
                        for (var5_5 /* !! */  = 0; var5_5 /* !! */  < var75_29; var5_5 /* !! */  += var43_35) {
                            var89_66 = (eo1_2)var88_65.get(var5_5 /* !! */ );
                            var6_6 = (int)var89_66.u0(var77_58 /* !! */ );
                            if (var6_6 != 0) {
                                return true;
                            }
                            var43_35 = 1;
                        }
                        var4_4 /* !! */  = Unit.a;
                    }
                    var4_4 /* !! */  = Unit.a;
                    break block130;
                }
                var36_30 = var88_65.toString();
                var4_4 /* !! */  = new IllegalStateException((String)var36_30);
                throw var4_4 /* !! */ ;
            }
            var75_29 = 0;
            var4_4 /* !! */  = null;
            return false;
        }
        var36_30 = var88_65.toString();
        var4_4 /* !! */  = new IllegalStateException((String)var36_30);
        throw var4_4 /* !! */ ;
    }

    public final uu0_1 j() {
        return this.f.s1();
    }

    public final aG2 k() {
        Object object = AU0.a(this.f);
        object = object != null ? AU0.b((FocusTargetNode)object) : null;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean l(int object, boolean bl2, boolean bl3) {
        Throwable throwable2;
        xu0_0 xu0_02;
        block8: {
            block9: {
                Object object2;
                Object object3;
                block6: {
                    Ef0 ef0;
                    block7: {
                        xu0_02 = this.h;
                        try {
                            Object object4;
                            Object object5;
                            object3 = xu0_02.c;
                            if (object3 != 0) {
                                xu0_0.a(xu0_02);
                            }
                            xu0_02.c = object3 = 1;
                            object2 = cu0_0.c;
                            if (object2 != null) {
                                object5 = xu0_02.b;
                                ((WR1)object5).b(object2);
                            }
                            object2 = this.f;
                            if (bl2) break block6;
                            ef0 = yu0_1.c((FocusTargetNode)object2, object);
                            object5 = b$a.$EnumSwitchMapping$0;
                            object = ef0.ordinal();
                            if ((object = (Object)object5[object]) == object3 || object == (object4 = 2) || object == (object4 = 3)) break block7;
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    object = 0;
                    ef0 = null;
                    break block9;
                }
                object = yu0_1.a((FocusTargetNode)object2, bl2, (boolean)object3);
            }
            xu0_0.b(xu0_02);
            if (object != 0 && bl3) {
                Function0 function0 = this.c;
                function0.invoke();
            }
            return (boolean)object;
        }
        xu0_0.b(xu0_02);
        throw throwable2;
    }

    public final void m(lu0_0 lu0_02) {
        XT0 xT0 = this.g;
        pr1_1 pr1_12 = xT0.e;
        xT0.b(pr1_12, lu0_02);
    }

    public final void n() {
        xu0_0 xu0_02 = this.h;
        boolean bl2 = xu0_02.c;
        FocusTargetNode focusTargetNode = this.f;
        boolean bl3 = true;
        if (bl2) {
            yu0_1.a(focusTargetNode, bl3, bl3);
        } else {
            xu0_02.c = bl3;
            yu0_1.a(focusTargetNode, bl3, bl3);
        }
        return;
        finally {
            xu0_0.b(xu0_02);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean o(MP2 object) {
        Object object2 = this.g;
        int n3 = ((XT0)object2).a();
        int n4 = 1;
        if ((n3 ^= n4) != 0) {
            Object[] objectArray;
            int n7;
            int n8;
            Object object3;
            int n10;
            Object object4;
            int n14;
            Object[] objectArray2;
            int n15;
            ArrayList<Object> arrayList;
            int n16;
            Object object5;
            block61: {
                object2 = AU0.a(this.f);
                object5 = "visitAncestors called on an unattached node";
                n16 = 16;
                if (object2 == null) return false;
                arrayList = ((LP1$c)object2).a;
                n15 = ((LP1$c)((Object)arrayList)).m;
                if (n15 != 0) {
                    object2 = go0.f((fo0)object2);
                    while (object2 != null) {
                        objectArray2 = ((xp1_0)object2).y.e;
                        n15 = objectArray2.d & 0x4000;
                        if (n15 != 0) {
                            while (arrayList != null) {
                                n15 = ((LP1$c)((Object)arrayList)).c & 0x4000;
                                if (n15 != 0) {
                                    n14 = 0;
                                    object4 = null;
                                    objectArray2 = arrayList;
                                    while (objectArray2 != null) {
                                        n10 = objectArray2 instanceof kp2_0;
                                        if (n10 == 0) {
                                            n10 = ((LP1$c)objectArray2).c & 0x4000;
                                            if (n10 != 0 && (n10 = objectArray2 instanceof mo0_0) != 0) {
                                                object3 = objectArray2;
                                                object3 = ((mo0_0)objectArray2).o;
                                                n8 = 0;
                                                Object var15_15 = null;
                                                while (object3 != null) {
                                                    n7 = ((LP1$c)object3).c & 0x4000;
                                                    if (n7 != 0) {
                                                        if (++n8 == n4) {
                                                            objectArray2 = object3;
                                                        } else {
                                                            if (object4 == null) {
                                                                objectArray = new LP1$c[n16];
                                                                object4 = new WR1(objectArray);
                                                            }
                                                            if (objectArray2 != null) {
                                                                ((WR1)object4).b(objectArray2);
                                                                n15 = 0;
                                                                objectArray2 = null;
                                                            }
                                                            ((WR1)object4).b(object3);
                                                        }
                                                    }
                                                    object3 = ((LP1$c)object3).f;
                                                }
                                                if (n8 == n4) continue;
                                            }
                                            objectArray2 = go0.b((WR1)object4);
                                            continue;
                                        }
                                        break block61;
                                    }
                                }
                                arrayList = ((LP1$c)((Object)arrayList)).e;
                            }
                        }
                        if ((object2 = ((xp1_0)object2).A()) != null && (arrayList = ((xp1_0)object2).y) != null) {
                            arrayList = ((T32)((Object)arrayList)).d;
                            continue;
                        }
                        arrayList = null;
                    }
                    n15 = 0;
                    objectArray2 = null;
                } else {
                    object2 = object5.toString();
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
            }
            objectArray2 = (kp2_0)objectArray2;
            if (objectArray2 == null) return false;
            object2 = objectArray2.e();
            n3 = ((LP1$c)object2).m;
            if (n3 != 0) {
                int n17;
                object2 = objectArray2.e().e;
                object5 = go0.f((fo0)objectArray2);
                arrayList = null;
                while (object5 != null) {
                    object4 = ((xp1_0)object5).y.e;
                    n14 = ((LP1$c)object4).d & 0x4000;
                    if (n14 != 0) {
                        while (object2 != null) {
                            n14 = ((LP1$c)object2).c & 0x4000;
                            if (n14 != 0) {
                                object4 = object2;
                                n10 = 0;
                                object3 = null;
                                while (object4 != null) {
                                    n8 = object4 instanceof kp2_0;
                                    if (n8 != 0) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList<Object>();
                                        }
                                        arrayList.add(object4);
                                    } else {
                                        n8 = ((LP1$c)object4).c & 0x4000;
                                        if (n8 != 0 && (n8 = object4 instanceof mo0_0) != 0) {
                                            void var15_19;
                                            Object object6 = object4;
                                            LP1$c lP1$c = ((mo0_0)object4).o;
                                            n7 = 0;
                                            objectArray = null;
                                            while (var15_19 != null) {
                                                int n18 = var15_19.c & 0x4000;
                                                if (n18 != 0) {
                                                    if (++n7 == n4) {
                                                        object4 = var15_19;
                                                    } else {
                                                        if (object3 == null) {
                                                            Object[] objectArray3 = new LP1$c[n16];
                                                            object3 = new WR1(objectArray3);
                                                        }
                                                        if (object4 != null) {
                                                            ((WR1)object3).b(object4);
                                                            n14 = 0;
                                                            object4 = null;
                                                        }
                                                        ((WR1)object3).b(var15_19);
                                                    }
                                                }
                                                LP1$c lP1$c2 = var15_19.f;
                                            }
                                            if (n7 == n4) continue;
                                        }
                                    }
                                    object4 = go0.b((WR1)object3);
                                }
                            }
                            object2 = ((LP1$c)object2).e;
                        }
                    }
                    if ((object5 = ((xp1_0)object5).A()) != null && (object2 = ((xp1_0)object5).y) != null) {
                        object2 = ((T32)object2).d;
                        continue;
                    }
                    n3 = 0;
                    object2 = null;
                }
                if (arrayList != null && (n3 = arrayList.size() + -1) >= 0) {
                    while (true) {
                        n17 = n3 + -1;
                        object2 = (kp2_0)arrayList.get(n3);
                        if ((n3 = (int)(object2.V((MP2)object) ? 1 : 0)) != 0) {
                            return n4 != 0;
                        }
                        if (n17 < 0) break;
                        n3 = n17;
                    }
                }
                object2 = objectArray2.e();
                n17 = 0;
                object5 = null;
                while (object2 != null) {
                    n14 = object2 instanceof kp2_0;
                    if (n14 != 0) {
                        n3 = (int)((object2 = (kp2_0)object2).V((MP2)object) ? 1 : 0);
                        if (n3 != 0) {
                            return n4 != 0;
                        }
                    } else {
                        n14 = ((LP1$c)object2).c & 0x4000;
                        if (n14 != 0 && (n14 = object2 instanceof mo0_0) != 0) {
                            object4 = object2;
                            object4 = ((mo0_0)object2).o;
                            n10 = 0;
                            object3 = null;
                            while (object4 != null) {
                                n8 = ((LP1$c)object4).c & 0x4000;
                                if (n8 != 0) {
                                    if (++n10 == n4) {
                                        object2 = object4;
                                    } else {
                                        if (object5 == null) {
                                            Object[] objectArray4 = new LP1$c[n16];
                                            object5 = new WR1(objectArray4);
                                        }
                                        if (object2 != null) {
                                            ((WR1)object5).b(object2);
                                            n3 = 0;
                                            object2 = null;
                                        }
                                        ((WR1)object5).b(object4);
                                    }
                                }
                                object4 = ((LP1$c)object4).f;
                            }
                            if (n10 == n4) continue;
                        }
                    }
                    object2 = go0.b((WR1)object5);
                }
                object2 = objectArray2.e();
                n17 = 0;
                object5 = null;
                while (object2 != null) {
                    n15 = object2 instanceof kp2_0;
                    if (n15 != 0) {
                        n3 = (int)((object2 = (kp2_0)object2).j0((MP2)object) ? 1 : 0);
                        if (n3 != 0) {
                            return n4 != 0;
                        }
                    } else {
                        n15 = ((LP1$c)object2).c & 0x4000;
                        if (n15 != 0 && (n15 = object2 instanceof mo0_0) != 0) {
                            objectArray2 = object2;
                            objectArray2 = ((mo0_0)object2).o;
                            n14 = 0;
                            object4 = null;
                            while (objectArray2 != null) {
                                n10 = objectArray2.c & 0x4000;
                                if (n10 != 0) {
                                    if (++n14 == n4) {
                                        object2 = objectArray2;
                                    } else {
                                        if (object5 == null) {
                                            object3 = new LP1$c[n16];
                                            object5 = new WR1((Object[])object3);
                                        }
                                        if (object2 != null) {
                                            ((WR1)object5).b(object2);
                                            n3 = 0;
                                            object2 = null;
                                        }
                                        ((WR1)object5).b(objectArray2);
                                    }
                                }
                                objectArray2 = objectArray2.f;
                            }
                            if (n14 == n4) continue;
                        }
                    }
                    object2 = go0.b((WR1)object5);
                }
                if (arrayList == null) return false;
                n3 = arrayList.size();
                n17 = 0;
                object5 = null;
                while (n17 < n3) {
                    kp2_0 kp2_02 = (kp2_0)arrayList.get(n17);
                    n16 = (int)(kp2_02.j0((MP2)object) ? 1 : 0);
                    if (n16 != 0) {
                        return n4 != 0;
                    }
                    ++n17;
                }
                return false;
            }
            object2 = object5.toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = "Dispatching rotary event while focus system is invalidated.".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final void p(boolean bl2) {
        this.l(8, bl2, true);
    }
}


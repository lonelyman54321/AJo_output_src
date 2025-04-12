/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.Region$Op
 */
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.platform.AndroidViewsHandler;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class VY2 {
    public static final aG2 a;

    static {
        aG2 aG22;
        float f5 = 10.0f;
        a = aG22 = new aG2(0.0f, 0.0f, f5, f5);
    }

    public static final tr1_1 a(LY2 object) {
        int n3;
        object = ((LY2)object).a();
        tr1_1 tr1_12 = Ri1.a;
        tr1_12 = new tr1_1();
        Object object2 = ((GY2)object).c;
        boolean bl2 = ((xp1_0)object2).L();
        if (bl2 && (n3 = ((xp1_0)object2).e()) != 0) {
            object2 = ((GY2)object).e();
            float f5 = ((aG2)object2).a;
            int n4 = Math.round(f5);
            float f6 = ((aG2)object2).b;
            int n7 = Math.round(f6);
            float f7 = ((aG2)object2).c;
            int n8 = Math.round(f7);
            float f8 = ((aG2)object2).d;
            n3 = Math.round(f8);
            Region region = new Region(n4, n7, n8, n3);
            object2 = new Region();
            VY2.b(region, (GY2)object, tr1_12, (GY2)object, (Region)object2);
        }
        return tr1_12;
    }

    /*
     * WARNING - void declaration
     */
    public static final void b(Region region, GY2 gY2, tr1_1 tr1_12, GY2 gY22, Region region2) {
        Object object;
        float f5;
        float f6;
        int n3;
        int n4;
        Object object2;
        Object object3;
        int n7;
        int n8;
        int n10;
        float f7;
        float f8;
        int n14;
        Object object4;
        Region region3;
        GY2 gY23;
        tr1_1 tr1_13;
        Object object5;
        Object object6;
        block21: {
            boolean bl2;
            void var11_15;
            boolean bl3;
            object6 = region;
            object5 = gY2;
            tr1_13 = tr1_12;
            gY23 = gY22;
            region3 = region2;
            object4 = gY22.c;
            boolean n15 = ((xp1_0)object4).L();
            n14 = 1;
            f8 = Float.MIN_VALUE;
            Object object7 = gY22.c;
            if (n15 && (bl3 = ((xp1_0)object7).e())) {
                boolean bl4 = false;
                f7 = 0.0f;
                object4 = null;
            } else {
                boolean bl5 = true;
                f7 = Float.MIN_VALUE;
            }
            n10 = region.isEmpty();
            n8 = ((GY2)object5).g;
            n7 = gY23.g;
            if (n10 != 0 && n7 != n8 || var11_15 != false && !(bl2 = gY23.e)) {
                return;
            }
            object4 = gY23.d;
            n10 = ((zy2_0)object4).b;
            object3 = gY23.a;
            if (n10 != 0 && (object7 = JY2.c((xp1_0)object7)) != null) {
                object3 = object7;
            }
            object7 = object3.e();
            object2 = yY2.b;
            if ((object4 = AY2.a((zy2_0)object4, (TY2)object2)) != null) {
                boolean bl6 = true;
                f7 = Float.MIN_VALUE;
            } else {
                boolean bl7 = false;
                f7 = 0.0f;
                object4 = null;
            }
            object2 = ((LP1$c)object7).a;
            n10 = ((LP1$c)object2).m;
            object3 = aG2.e;
            if (n10 != 0) {
                zp1 zp12;
                void var11_19;
                n10 = 8;
                if (var11_19 == false) {
                    object4 = go0.d((fo0)object7, n10);
                    zp12 = ap1_0.d((zp1)object4);
                    object3 = zp12.G((zp1)object4, n14 != 0);
                } else {
                    object4 = go0.d((fo0)object7, n10);
                    object7 = ((w32_0)object4).j1();
                    n4 = ((LP1$c)object7).m;
                    if (n4 != 0) {
                        float f11;
                        object7 = ap1_0.d((zp1)object4);
                        object2 = ((w32_0)object4).B;
                        if (object2 == null) {
                            object2 = new Object();
                            ((MR1)object2).a = 0.0f;
                            ((MR1)object2).b = 0.0f;
                            ((MR1)object2).c = 0.0f;
                            ((MR1)object2).d = 0.0f;
                            ((w32_0)object4).B = object2;
                        }
                        long l2 = ((w32_0)object4).i1();
                        l2 = ((w32_0)object4).R0(l2);
                        ((MR1)object2).a = f11 = -C63.d(l2);
                        ((MR1)object2).b = f11 = -C63.b(l2);
                        int n16 = ((Ns2)object4).c0();
                        f11 = n16;
                        float f12 = C63.d(l2);
                        ((MR1)object2).c = f11 = f12 + f11;
                        long l3 = ((Ns2)object4).c;
                        long l4 = 0xFFFFFFFFL;
                        n3 = (int)(l3 &= l4);
                        f8 = n3;
                        ((MR1)object2).d = f6 = C63.b(l2) + f8;
                        while (object4 != object7) {
                            f8 = Float.MIN_VALUE;
                            n3 = 0;
                            f6 = 0.0f;
                            zp12 = null;
                            ((w32_0)object4).x1((MR1)object2, false, true);
                            n14 = (int)(((MR1)object2).b() ? 1 : 0);
                            if (n14 == 0) {
                                object4 = ((w32_0)object4).q;
                                Intrinsics.checkNotNull(object4);
                                continue;
                            }
                            break block21;
                        }
                        f7 = ((MR1)object2).a;
                        f8 = ((MR1)object2).b;
                        f6 = ((MR1)object2).c;
                        f5 = ((MR1)object2).d;
                        object3 = new aG2(f7, f8, f6, f5);
                    }
                }
            }
        }
        f7 = ((aG2)object3).a;
        int n17 = Math.round(f7);
        f8 = ((aG2)object3).b;
        n14 = Math.round(f8);
        f6 = ((aG2)object3).c;
        n3 = Math.round(f6);
        f5 = ((aG2)object3).d;
        n4 = Math.round(f5);
        region3.set(n17, n14, n3, n4);
        n10 = -1;
        if (n7 == n8) {
            n7 = -1;
        }
        if ((n8 = (int)(region3.op((Region)object6, (Region.Op)(object = Region.Op.INTERSECT)) ? 1 : 0)) != 0) {
            object3 = region2.getBounds();
            object = new KY2(gY23, (Rect)object3);
            tr1_13.i(n7, object);
            n8 = 4;
            n7 = 1;
            object = GY2.h(gY23, n7 != 0, n8);
            for (int i3 = object.size() - n7; n10 < i3; i3 += -1) {
                GY2 gY24 = (GY2)object.get(i3);
                VY2.b((Region)object6, (GY2)object5, tr1_13, gY24, region3);
            }
            int n18 = VY2.d(gY22);
            if (n18 != 0) {
                object2 = Region.Op.DIFFERENCE;
                object6 = region;
                n18 = n17;
                int n19 = n4;
                object4 = object2;
                region.op(n17, n14, n3, n4, (Region.Op)object2);
            }
        } else {
            int n20 = gY23.e;
            if (n20 != 0) {
                boolean bl8;
                boolean bl9;
                object6 = gY22.j();
                object6 = object6 != null && (object5 = ((GY2)object6).c) != null && (bl9 = ((xp1_0)object5).L()) == (bl8 = true) ? ((GY2)object6).e() : a;
                f7 = ((aG2)object6).a;
                int n21 = Math.round(f7);
                f8 = ((aG2)object6).b;
                n14 = Math.round(f8);
                f6 = ((aG2)object6).c;
                n3 = Math.round(f6);
                float f14 = ((aG2)object6).d;
                n20 = Math.round(f14);
                region3 = new Rect(n21, n14, n3, n20);
                object5 = new KY2(gY23, (Rect)region3);
                tr1_13.i(n7, object5);
            } else if (n7 == n10) {
                object5 = region2.getBounds();
                object6 = new KY2(gY23, (Rect)object5);
                tr1_13.i(n7, object6);
            }
        }
    }

    public static final Tl3 c(zy2_0 object) {
        boolean bl2;
        ArrayList arrayList = new ArrayList();
        Object object2 = yY2.a;
        object2 = yY2.a;
        object = (H1)AY2.a((zy2_0)object, (TY2)object2);
        object2 = null;
        if (object != null && (object = (Function1)((H1)object).b) != null && (bl2 = ((Boolean)(object = (Boolean)object.invoke(arrayList))).booleanValue())) {
            bl2 = false;
            object2 = object = arrayList.get(0);
            object2 = (Tl3)object;
        }
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean d(GY2 object) {
        Object object2;
        boolean bl2 = VY2.e((GY2)object);
        if (!bl2) return false;
        object = ((GY2)object).d;
        bl2 = ((zy2_0)object).b;
        if (bl2) return true;
        object = ((zy2_0)object).a.keySet();
        bl2 = object instanceof Collection;
        if (bl2) {
            object2 = object;
            object2 = (Collection)object;
            bl2 = object2.isEmpty();
            if (bl2) return false;
        }
        object = ((Iterable)object).iterator();
        do {
            if (!(bl2 = object.hasNext())) return false;
            object2 = (TY2)object.next();
        } while (!(bl2 = ((TY2)object2).c));
        return true;
    }

    public static final boolean e(GY2 object) {
        boolean bl2;
        boolean bl3;
        Object object2 = ((GY2)object).c();
        boolean bl4 = false;
        if (object2 != null) {
            bl3 = ((w32_0)object2).q1();
        } else {
            bl3 = false;
            object2 = null;
        }
        if (!bl3 && !(bl2 = (object = ((GY2)object).d.a).containsKey(object2 = MY2.n))) {
            bl4 = true;
        }
        return bl4;
    }

    public static final AndroidViewHolder f(AndroidViewsHandler object, int n3) {
        Object object2;
        Object object3;
        block3: {
            boolean bl2;
            block2: {
                Object object4;
                int n4;
                object = ((Iterable)object.getLayoutNodeToHolder().entrySet()).iterator();
                do {
                    bl2 = object.hasNext();
                    object3 = null;
                    if (!bl2) break block2;
                    object2 = object.next();
                    object4 = object2;
                    object4 = (xp1_0)((Map.Entry)object2).getKey();
                } while ((n4 = ((xp1_0)object4).b) != n3);
                break block3;
            }
            bl2 = false;
            object2 = null;
        }
        object2 = (Map.Entry)object2;
        if (object2 != null) {
            object3 = object = object2.getValue();
            object3 = (AndroidViewHolder)object;
        }
        return object3;
    }

    public static final String g(int n3) {
        String string2;
        int n4 = CP2.a(n3, 0);
        if (n4 != 0) {
            string2 = "android.widget.Button";
        } else {
            n4 = CP2.a(n3, 1);
            if (n4 != 0) {
                string2 = "android.widget.CheckBox";
            } else {
                n4 = CP2.a(n3, 3);
                if (n4 != 0) {
                    string2 = "android.widget.RadioButton";
                } else {
                    n4 = CP2.a(n3, 5);
                    if (n4 != 0) {
                        string2 = "android.widget.ImageView";
                    } else {
                        n4 = 6;
                        if ((n3 = (int)(CP2.a(n3, n4) ? 1 : 0)) != 0) {
                            string2 = "android.widget.Spinner";
                        } else {
                            n3 = 0;
                            string2 = null;
                        }
                    }
                }
            }
        }
        return string2;
    }
}


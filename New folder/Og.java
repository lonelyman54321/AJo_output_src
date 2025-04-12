/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class Og
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Og(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this;
        Object object2 = this.b;
        boolean bl2 = true;
        int n3 = this.a;
        switch (n3) {
            default: {
                i10_0.a((i10_0)object2);
                return;
            }
            case 0: 
        }
        object2 = (pg_1)object2;
        n3 = ((pg_1)object2).d() ? 1 : 0;
        if (n3 != 0) {
            int n4;
            Object object3;
            long l2;
            long l3;
            int n7;
            IY2 iY2;
            int n8;
            int n10;
            n3 = Rg2.a;
            Object object4 = ((pg_1)object2).a;
            object4.b(bl2);
            Object object5 = object4.getSemanticsOwner().a();
            Object object6 = ((pg_1)object2).o;
            ((pg_1)object2).h((GY2)object5, (IY2)object6);
            object5 = object4.getSemanticsOwner().a();
            object6 = ((pg_1)object2).o;
            ((pg_1)object2).f((GY2)object5, (IY2)object6);
            object5 = ((pg_1)object2).c();
            object6 = ((Qi1)object5).b;
            long[] lArray = ((Qi1)object5).a;
            int n14 = lArray.length + -2;
            tr1_1 tr1_12 = ((pg_1)object2).n;
            long l4 = 255L;
            int n15 = 8;
            long l7 = -9187201950435737472L;
            int n16 = 7;
            Object[] objectArray = object4;
            if (n14 >= 0) {
                n10 = 0;
                while (true) {
                    Object object7;
                    long l8;
                    long l12;
                    long l14;
                    long l15;
                    if ((l15 = (l14 = (l12 = ((l8 = lArray[n10]) ^ (long)-1) << n16 & l8 & l7) - l7) == 0L ? 0 : (l14 < 0L ? -1 : 1)) != false) {
                        n8 = ~(n10 - n14) >>> 31;
                        n8 = 8 - n8;
                        iY2 = null;
                        for (n7 = 0; n7 < n8; n7 += object7) {
                            l3 = l8 & l4;
                            l2 = 128L;
                            long l16 = l3 - l2;
                            long l17 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                            if (l17 < 0) {
                                l15 = (n10 << 3) + n7;
                                object7 = object6[l15];
                                Object object8 = (IY2)tr1_12.c((int)object7);
                                object3 = (KY2)((Qi1)object5).c((int)object7);
                                l15 = 0;
                                if (object3 != null) {
                                    object3 = ((KY2)object3).a;
                                } else {
                                    object7 = 0;
                                    object3 = null;
                                }
                                if (object3 != null) {
                                    Object object9;
                                    Object object10;
                                    int n17 = ((GY2)object3).g;
                                    object3 = ((GY2)object3).d;
                                    if (object8 == null) {
                                        boolean bl3;
                                        object8 = ((zy2_0)object3).iterator();
                                        while (bl3 = object8.hasNext()) {
                                            object10 = (Map.Entry)object8.next();
                                            object9 = object10.getKey();
                                            n15 = Intrinsics.areEqual(object9, object = MY2.v) ? 1 : 0;
                                            if (n15 != 0) {
                                                if ((object = (List)AY2.a((zy2_0)object3, (TY2)object)) != null) {
                                                    object = (Sl)CollectionsKt.firstOrNull((List)object);
                                                } else {
                                                    n4 = 0;
                                                    object = null;
                                                }
                                                object = String.valueOf(object);
                                                ((pg_1)object2).g(n17, (String)object);
                                            }
                                            object = this;
                                            n15 = 8;
                                        }
                                    } else {
                                        object = ((zy2_0)object3).iterator();
                                        while ((n15 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                            object9 = (TY2)((Map.Entry)object.next()).getKey();
                                            object10 = object;
                                            object = MY2.v;
                                            n15 = Intrinsics.areEqual(object9, object) ? 1 : 0;
                                            if (n15 != 0) {
                                                object9 = (List)AY2.a(((IY2)object8).a, (TY2)object);
                                                if (object9 != null) {
                                                    object9 = (Sl)CollectionsKt.firstOrNull((List)object9);
                                                } else {
                                                    n15 = 0;
                                                    object9 = null;
                                                }
                                                object = (List)AY2.a((zy2_0)object3, (TY2)object);
                                                if (object != null) {
                                                    object = (Sl)CollectionsKt.firstOrNull((List)object);
                                                } else {
                                                    n4 = 0;
                                                    object = null;
                                                }
                                                n15 = Intrinsics.areEqual(object9, object) ? 1 : 0;
                                                if (n15 == 0) {
                                                    object = String.valueOf(object);
                                                    ((pg_1)object2).g(n17, (String)object);
                                                }
                                            }
                                            object = object10;
                                        }
                                    }
                                } else {
                                    bh1_1.d("no value for specified key");
                                    throw null;
                                }
                            }
                            n4 = 8;
                            l8 >>= n4;
                            object7 = 1;
                            object = this;
                            l4 = 255L;
                            n15 = 8;
                            l7 = -9187201950435737472L;
                        }
                        n4 = 8;
                        object7 = 1;
                        if (n8 != n4) break;
                    } else {
                        object7 = 1;
                    }
                    if (n10 == n14) break;
                    n10 += object7;
                    object = this;
                    l4 = 255L;
                    n15 = 8;
                    l7 = -9187201950435737472L;
                }
            }
            tr1_12.d();
            object = ((pg_1)object2).c();
            Object object11 = ((Qi1)object).b;
            object4 = ((Qi1)object).c;
            object = ((Qi1)object).a;
            int n18 = ((Object)object).length + -2;
            if (n18 >= 0) {
                int n19 = 0;
                object6 = null;
                while (true) {
                    reference var43_37 = object[n19];
                    reference var45_38 = (var43_37 ^ (long)-1) << n16 & var43_37;
                    long l18 = -9187201950435737472L;
                    reference cfr_temp_2 = (var45_38 &= l18) - l18;
                    Object object12 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                    if (object12 != false) {
                        n10 = ~(n19 - n18) >>> 31;
                        n8 = 8;
                        n15 = 8 - n10;
                        for (n10 = 0; n10 < n15; n10 += n7) {
                            l7 = 255L;
                            l3 = (long)(var43_37 & l7);
                            l2 = 128L;
                            long l17 = l3 - l2;
                            n8 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                            if (n8 < 0) {
                                n8 = (n19 << 3) + n10;
                                object12 = object11[n8];
                                Object object13 = (KY2)object4[n8];
                                object13 = ((KY2)object13).a;
                                object3 = ((pg_1)object2).c();
                                iY2 = new IY2((GY2)object13, (Qi1)object3);
                                tr1_12.i((int)object12, iY2);
                            }
                            n8 = 8;
                            var43_37 >>= n8;
                            n7 = 1;
                            l18 = -9187201950435737472L;
                        }
                        n8 = 8;
                        n7 = 1;
                        l7 = 255L;
                        l2 = 128L;
                        if (n15 != n8) break;
                    } else {
                        n8 = 8;
                        n7 = 1;
                        l7 = 255L;
                        l2 = 128L;
                    }
                    if (n19 == n18) break;
                    n19 += n7;
                }
            }
            object11 = objectArray.getSemanticsOwner().a();
            object4 = ((pg_1)object2).c();
            ((pg_1)object2).o = object = new IY2((GY2)object11, (Qi1)object4);
            n4 = 0;
            object = null;
            ((pg_1)object2).p = false;
        }
    }
}


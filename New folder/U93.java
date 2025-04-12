/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class U93 {
    public static final long a = Em3.f(14);
    public static final long b = Em3.f(0);
    public static final long c = OX.k;
    public static final sl3_0 d;

    static {
        long l2 = OX.b;
        long l3 = 16;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        sl3_0 sl3_02 = l7 != false ? new gz_1(l2) : sl3$a.a;
        d = sl3_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final S93 a(S93 object, long l2, ZD zD, float f5, long l3, tv0_0 object2, nV0 object3, oV0 oV02, RU0 rU0, String object4, long l4, Rw rw, tl3_0 tl3_02, iw1 object5, long l7, Jj3 object6, b13_0 b13_02, st2_1 st2_12, Qt0 qt0) {
        long l8;
        boolean bl2;
        long l12;
        Object object7;
        Object object8;
        Object object9;
        long l14;
        long l15;
        Object object10;
        Object object11;
        Object object12;
        Object object13;
        Rw rw4;
        Object object14;
        Object object15;
        oV0 oV03;
        Object object16;
        Object object17;
        Object object18;
        block25: {
            long l16;
            block24: {
                float f6;
                ZD zD3;
                block23: {
                    block22: {
                        block21: {
                            block17: {
                                boolean bl3;
                                long l17;
                                boolean bl4;
                                boolean bl5;
                                float f7;
                                float f8;
                                long l18;
                                block20: {
                                    block19: {
                                        long l19;
                                        block18: {
                                            block16: {
                                                object18 = object;
                                                l16 = l2;
                                                zD3 = zD;
                                                f6 = f5;
                                                object17 = object2;
                                                object16 = object3;
                                                oV03 = oV02;
                                                object15 = rU0;
                                                object14 = object4;
                                                rw4 = rw;
                                                object13 = tl3_02;
                                                object12 = object5;
                                                l19 = l7;
                                                object11 = object6;
                                                object10 = Em3.g(l3) ^ true;
                                                l15 = 16;
                                                if (!object10) break block16;
                                                l19 = ((S93)object).b;
                                                l14 = l3;
                                                l18 = (long)Dm3.a(l3, l19);
                                                if (l18 == false) break block17;
                                                break block18;
                                            }
                                            l14 = l3;
                                        }
                                        if (zD3 == null && (l18 = l16 == l15 ? 0 : (l16 < l15 ? -1 : 1)) != false && (l18 = (long)OX.c(l16, l19 = (object9 = ((S93)object18).a).a())) == false || object16 != null && (l18 = (long)Intrinsics.areEqual(object16, object9 = ((S93)object18).d)) == false || object17 != null && (l18 = (long)Intrinsics.areEqual(object17, object9 = ((S93)object18).c)) == false || object15 != null && object15 != (object9 = ((S93)object18).f)) break block17;
                                        l18 = Em3.g(l4) ^ 1;
                                        if (l18 == false) break block19;
                                        l19 = ((S93)object18).h;
                                        l14 = l4;
                                        l18 = (long)Dm3.a(l4, l19);
                                        if (l18 == false) break block17;
                                        break block20;
                                    }
                                    l14 = l4;
                                }
                                if (object11 != null && (l18 = (long)Intrinsics.areEqual(object11, object9 = ((S93)object18).m)) == false || (l18 = (long)Intrinsics.areEqual(zD3, object9 = ((S93)object18).a.d())) == false || zD3 != null && (l18 = (long)((f8 = f6 - (f7 = (object9 = ((S93)object18).a).getAlpha())) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1))) != false || oV03 != null && (l18 = (long)Intrinsics.areEqual(oV03, object9 = ((S93)object18).e)) == false || object14 != null && (l18 = (long)Intrinsics.areEqual(object14, object9 = ((S93)object18).g)) == false || rw4 != null && (l18 = (long)Intrinsics.areEqual(rw4, object9 = ((S93)object18).i)) == false) break block17;
                                object9 = tl3_02;
                                if (tl3_02 != null && !(bl5 = Intrinsics.areEqual(tl3_02, object8 = ((S93)object18).j))) break block21;
                                object8 = object5;
                                if (object5 != null && !(bl4 = Intrinsics.areEqual(object5, object13 = ((S93)object18).k))) break block21;
                                l14 = l7;
                                object10 = l7 == l15 ? 0 : (l7 < l15 ? -1 : 1);
                                if (object10 && !(bl5 = OX.c(l7, l17 = ((S93)object18).l))) break block22;
                                object8 = b13_02;
                                if (b13_02 != null && !(bl3 = Intrinsics.areEqual(b13_02, object11 = ((S93)object18).n))) break block22;
                                object11 = st2_12;
                                if (st2_12 != null && !(bl5 = Intrinsics.areEqual(st2_12, object8 = ((S93)object18).o))) break block22;
                                object8 = qt0;
                                if (qt0 == null) return object18;
                                object11 = ((S93)object18).p;
                                bl3 = Intrinsics.areEqual(qt0, object11);
                                if (bl3) return object18;
                                break block23;
                            }
                            object9 = tl3_02;
                        }
                        l14 = l7;
                    }
                    object8 = qt0;
                }
                object11 = sl3$a.a;
                if (zD3 == null) break block24;
                boolean bl6 = zD3 instanceof i93_0;
                if (bl6) {
                    object7 = zD3;
                    object7 = (i93_0)zD3;
                    l16 = Tj3.a(((i93_0)object7).a, f6);
                    long l20 = l16 - l15;
                    l12 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
                    if (l12 != false) {
                        object11 = new gz_1(l16);
                    }
                    break block25;
                } else {
                    bl6 = zD3 instanceof Z03;
                    if (!bl6) {
                        object18 = new NoWhenBranchMatchedException();
                        throw object18;
                    }
                    object7 = zD3;
                    object7 = (Z03)zD3;
                    object11 = new be_2((Z03)object7, f6);
                }
                break block25;
            }
            l12 = l16 == l15 ? 0 : (l16 < l15 ? -1 : 1);
            if (l12 != false) {
                object11 = new gz_1(l16);
            }
        }
        object7 = ((S93)object18).a.c((sl3_0)object11);
        Object object19 = object15 == null ? ((S93)object18).f : object15;
        l12 = (long)Em3.g(l3);
        long l21 = l12 == false ? l3 : ((S93)object18).b;
        if (object17 == null) {
            object17 = ((S93)object18).c;
        }
        if (object16 == null) {
            object16 = ((S93)object18).d;
        }
        if (oV03 == null) {
            oV03 = ((S93)object18).e;
        }
        if (object14 == null) {
            object14 = object15 = ((S93)object18).g;
        }
        if (!(bl2 = Em3.g(l4))) {
            object3 = object14;
            l8 = l4;
        } else {
            object3 = object14;
            l8 = ((S93)object18).h;
        }
        if (rw4 == null) {
            rw4 = ((S93)object18).i;
        }
        if (object9 == null) {
            object9 = ((S93)object18).j;
        }
        object11 = object5 == null ? ((S93)object18).k : object5;
        object10 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
        if (!object10) {
            l14 = ((S93)object18).l;
        }
        long l22 = l14;
        object13 = object6 == null ? ((S93)object18).m : object6;
        Object object20 = b13_02 == null ? (object12 = ((S93)object18).n) : b13_02;
        object12 = ((S93)object18).o;
        if (object12 == null) {
            object12 = st2_12;
        }
        if (object8 == null) {
            object8 = object18 = ((S93)object18).p;
        }
        object = object18;
        object2 = object19;
        object4 = rw4;
        object5 = object13;
        object6 = object8;
        return new S93((sl3_0)object7, l21, (tv0_0)object17, (nV0)object16, oV03, (RU0)object19, (String)object3, l8, rw4, (tl3_0)object9, (iw1)object11, l22, (Jj3)object13, (b13_0)object20, (st2_1)object12, (Qt0)object8);
    }

    public static final Object b(float f5, Object object, Object object2) {
        double d2 = f5;
        double d5 = 0.5;
        double d7 = d2 - d5;
        Object object3 = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object3 >= 0) {
            object = object2;
        }
        return object;
    }

    public static final long c(long l2, long l3, float f5) {
        boolean bl2 = Em3.g(l2);
        if (!bl2 && !(bl2 = Em3.g(l3))) {
            bl2 = Em3.g(l2);
            if (!bl2 && !(bl2 = Em3.g(l3))) {
                long l4;
                long l7 = Dm3.b(l2);
                bl2 = Fm3.a(l7, l4 = Dm3.b(l3));
                if (bl2) {
                    l7 = 0xFF00000000L & l2;
                    float f6 = Dm3.c(l2);
                    float f7 = Dm3.c(l3);
                    f6 = LK1.c(f6, f7, f5);
                    return Em3.i(l7, f6);
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot perform operation for ");
                String string2 = Fm3.b(Dm3.b(l2));
                stringBuilder.append((Object)string2);
                stringBuilder.append(" and ");
                string2 = Fm3.b(Dm3.b(l3));
                stringBuilder.append((Object)string2);
                string2 = stringBuilder.toString();
                string2 = string2.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            String string3 = "Cannot perform operation for Unspecified type.".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
            throw illegalArgumentException;
        }
        Dm3 dm3 = new Dm3(l2);
        Dm3 dm32 = new Dm3(l3);
        return ((Dm3)U93.b((float)f5, (Object)dm3, (Object)dm32)).a;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;

/*
 * Renamed from bF3
 */
public final class bf3_0
implements eI0 {
    public gi0_0 a;
    public wp3 b;
    public int c;
    public long d;
    public bF3$b e;
    public int f;
    public long g;

    /*
     * Enabled aggressive block sorting
     */
    public final int a(fi0_0 fi0_02, Pw2 pw2) {
        int n3;
        int n4;
        int n7;
        int n8;
        Object object;
        bf3_0 bf3_02;
        block17: {
            long l2;
            int n10;
            int n14;
            block18: {
                int n15;
                block20: {
                    gi0_0 gi0_02;
                    int n16;
                    Object object2;
                    block25: {
                        block23: {
                            block24: {
                                block22: {
                                    block21: {
                                        block19: {
                                            bf3_02 = this;
                                            object = this.b;
                                            ct3.h(object);
                                            n8 = gz3.a;
                                            n8 = this.c;
                                            int n17 = 0;
                                            n7 = -1;
                                            n4 = 4;
                                            n3 = 1;
                                            if (n8 == 0) break block17;
                                            n14 = 8;
                                            n10 = 2;
                                            l2 = -1;
                                            if (n8 == n3) break block18;
                                            n15 = 3;
                                            if (n8 != n10) {
                                                long l3;
                                                long l4;
                                                if (n8 != n15) {
                                                    if (n8 != n4) {
                                                        object = new IllegalStateException();
                                                        throw object;
                                                    }
                                                    long l7 = this.g;
                                                    long l8 = l7 - l2;
                                                    n8 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                                                    if (n8 == 0) {
                                                        n3 = 0;
                                                        Object var17_19 = null;
                                                    }
                                                    ct3.f(n3 != 0);
                                                    long l12 = bf3_02.g;
                                                    object = fi0_02;
                                                    l7 = ((il0_0)fi0_02).d;
                                                    l12 -= l7;
                                                    object = bf3_02.e;
                                                    object.getClass();
                                                    fi0_0 fi0_03 = fi0_02;
                                                    fi0_03 = (il0_0)fi0_02;
                                                    n8 = (int)(object.a((il0_0)fi0_03, l12) ? 1 : 0);
                                                    if (n8 == 0) return n17;
                                                    return -1;
                                                }
                                                object = fi0_02;
                                                ((il0_0)fi0_02).f = 0;
                                                object = new Xm2(n14);
                                                Object object3 = fi0_02;
                                                object3 = (il0_0)fi0_02;
                                                object = df3_0.b(1684108385, (il0_0)object3, (Xm2)object);
                                                ((il0_0)object3).j(n14);
                                                Long l14 = ((il0_0)object3).d;
                                                long l15 = ((df3$a_0)object).b;
                                                object = l15;
                                                object = Pair.create((Object)l14, (Object)object);
                                                l14 = (Long)((Pair)object).first;
                                                this.f = n3 = l14.intValue();
                                                object = (Long)((Pair)object).second;
                                                long l16 = (Long)object;
                                                long l17 = this.d;
                                                n8 = (int)(l17 == l2 ? 0 : (l17 < l2 ? -1 : 1));
                                                if (n8 != 0 && (n8 = (int)((l4 = l16 - (l3 = 0xFFFFFFFFL)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0) {
                                                    l16 = l17;
                                                }
                                                bf3_02.g = l17 = (long)bf3_02.f + l16;
                                                l16 = ((il0_0)object3).c;
                                                long l18 = l16 - l2;
                                                n8 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1));
                                                if (n8 != 0 && (n8 = (int)(l17 == l16 ? 0 : (l17 < l16 ? -1 : 1))) > 0) {
                                                    object = new StringBuilder("Data exceeds input length: ");
                                                    long l19 = bf3_02.g;
                                                    ((StringBuilder)object).append(l19);
                                                    object3 = ", ";
                                                    ((StringBuilder)object).append((String)object3);
                                                    ((StringBuilder)object).append(l16);
                                                    object = ((StringBuilder)object).toString();
                                                    Cx.f((String)object);
                                                    bf3_02.g = l16;
                                                }
                                                object = bf3_02.e;
                                                object.getClass();
                                                n7 = bf3_02.f;
                                                l16 = bf3_02.g;
                                                object.b(n7, l16);
                                                bf3_02.c = n4;
                                                return 0;
                                            }
                                            n7 = 16;
                                            object = new Xm2(n7);
                                            fi0_0 fi0_04 = fi0_02;
                                            fi0_04 = (il0_0)fi0_02;
                                            Object object4 = df3_0.b(1718449184, (il0_0)fi0_04, (Xm2)object);
                                            long l20 = ((df3$a_0)object4).b;
                                            l2 = 16;
                                            long l21 = l20 - l2;
                                            n10 = (int)(l21 == 0L ? 0 : (l21 < 0L ? -1 : 1));
                                            if (n10 >= 0) {
                                                n10 = 1;
                                            } else {
                                                n10 = 0;
                                                object4 = null;
                                            }
                                            ct3.f(n10 != 0);
                                            object4 = ((Xm2)object).a;
                                            ((il0_0)fi0_04).b((byte[])object4, 0, n7, false);
                                            ((Xm2)object).I(0);
                                            n14 = ((Xm2)object).p();
                                            int n18 = ((Xm2)object).p();
                                            int n19 = ((Xm2)object).o();
                                            ((Xm2)object).o();
                                            int n20 = ((Xm2)object).p();
                                            n8 = ((Xm2)object).p();
                                            n10 = (int)l20 - n7;
                                            if (n10 > 0) {
                                                object2 = new byte[n10];
                                                fi0_0 fi0_05 = fi0_02;
                                                fi0_05 = (il0_0)fi0_02;
                                                ((il0_0)fi0_05).b((byte[])object2, 0, n10, false);
                                            } else {
                                                object2 = gz3.f;
                                            }
                                            byte[] byArray = object2;
                                            object2 = fi0_02;
                                            object2 = (il0_0)fi0_02;
                                            long l22 = ((il0_0)object2).h();
                                            l20 = ((il0_0)object2).d;
                                            int n21 = (int)(l22 -= l20);
                                            ((il0_0)object2).j(n21);
                                            object2 = new cf3_0(n14, n18, n19, n20, n8, byArray);
                                            n10 = 17;
                                            if (n14 != n10) break block19;
                                            gi0_0 gi0_03 = bf3_02.a;
                                            wp3 wp32 = bf3_02.b;
                                            bf3_02.e = object = new bf3$a_0(gi0_03, wp32, (cf3_0)object2);
                                            break block20;
                                        }
                                        n10 = 6;
                                        if (n14 != n10) break block21;
                                        gi0_0 gi0_04 = bf3_02.a;
                                        wp3 wp33 = bf3_02.b;
                                        String string2 = "audio/g711-alaw";
                                        int n22 = -1;
                                        bf3_02.e = object = new bF3$c(gi0_04, wp33, (cf3_0)object2, string2, n22);
                                        break block20;
                                    }
                                    n10 = 7;
                                    if (n14 != n10) break block22;
                                    gi0_0 gi0_05 = bf3_02.a;
                                    wp3 wp34 = bf3_02.b;
                                    String string3 = "audio/g711-mlaw";
                                    int n24 = -1;
                                    bf3_02.e = object = new bF3$c(gi0_05, wp34, (cf3_0)object2, string3, n24);
                                    break block20;
                                }
                                if (n14 == n3) break block23;
                                if (n14 == n15) break block24;
                                n4 = (char)-2;
                                if (n14 == n4) break block23;
                                n16 = 0;
                                break block25;
                            }
                            n3 = 32;
                            if (n8 != n3) {
                                n4 = 0;
                                gi0_02 = null;
                            }
                            n16 = n4;
                            break block25;
                        }
                        n16 = n8 = gz3.s(n8);
                    }
                    if (n16 == 0) {
                        object = new StringBuilder("Unsupported WAV format type: ");
                        ((StringBuilder)object).append(n14);
                        throw ParserException.b(((StringBuilder)object).toString());
                    }
                    gi0_02 = bf3_02.a;
                    wp3 wp35 = bf3_02.b;
                    String string4 = "audio/raw";
                    bf3_02.e = object = new bF3$c(gi0_02, wp35, (cf3_0)object2, string4, n16);
                }
                bf3_02.c = n15;
                return 0;
            }
            object = new Xm2(n14);
            Object object5 = fi0_02;
            object5 = (il0_0)fi0_02;
            df3$a_0 df3$a_0 = df3$a_0.a((il0_0)object5, (Xm2)object);
            n3 = df3$a_0.a;
            int n25 = 1685272116;
            if (n3 != n25) {
                ((il0_0)object5).f = 0;
            } else {
                ((il0_0)object5).l(n14, false);
                ((Xm2)object).I(0);
                object5 = ((Xm2)object).a;
                fi0_0 fi0_06 = fi0_02;
                fi0_06 = (il0_0)fi0_02;
                ((il0_0)fi0_06).b((byte[])object5, 0, n14, false);
                l2 = ((Xm2)object).l();
                long l23 = df3$a_0.b;
                n8 = (int)l23 + n14;
                ((il0_0)fi0_06).j(n8);
            }
            bf3_02.d = l2;
            bf3_02.c = n10;
            return 0;
        }
        object = fi0_02;
        object = (il0_0)fi0_02;
        long l24 = ((il0_0)object).d;
        long l25 = 0L;
        long l26 = l24 - l25;
        n8 = (int)(l26 == 0L ? 0 : (l26 < 0L ? -1 : 1));
        if (n8 == 0) {
            n8 = 1;
        } else {
            n8 = 0;
            object = null;
        }
        ct3.f(n8 != 0);
        n8 = bf3_02.f;
        if (n8 != n7) {
            fi0_0 fi0_07 = fi0_02;
            fi0_07 = (il0_0)fi0_02;
            ((il0_0)fi0_07).j(n8);
            bf3_02.c = n4;
            return 0;
        }
        object = fi0_02;
        object = (il0_0)fi0_02;
        n7 = (int)(df3_0.a((il0_0)object) ? 1 : 0);
        if (n7 == 0) throw ParserException.a("Unsupported or unrecognized wav file type.", null);
        long l27 = ((il0_0)object).h();
        l24 = ((il0_0)object).d;
        n4 = (int)(l27 -= l24);
        ((il0_0)object).j(n4);
        bf3_02.c = n3;
        return 0;
    }

    public final boolean b(fi0_0 fi0_02) {
        return df3_0.a((il0_0)fi0_02);
    }

    public final void c(long l2, long l3) {
        bF3$b bF3$b;
        int n3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            n3 = 0;
            bF3$b = null;
        } else {
            n3 = 4;
        }
        this.c = n3;
        bF3$b = this.e;
        if (bF3$b != null) {
            bF3$b.c(l3);
        }
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        wp3 wp32;
        this.a = gi0_02;
        this.b = wp32 = gi0_02.n(0, 1);
        gi0_02.j();
    }

    public final void release() {
    }
}


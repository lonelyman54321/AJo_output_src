/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class jq1$e
implements wf3$a_0 {
    public final /* synthetic */ jq1_2 a;
    public final /* synthetic */ Object b;

    public jq1$e(jq1_2 jq1_22, Object object) {
        this.a = jq1_22;
        this.b = object;
    }

    public final void a(vy2$a$b vy2$a$b) {
        block19: {
            Object object = this.a.j;
            Object object2 = this.b;
            if ((object = (xp1_0)((HashMap)object).get(object2)) != null && (object = ((xp1_0)object).y) != null && (object = ((T32)object).e) != null) {
                object = ((LP1$c)object).a;
                boolean bl2 = ((LP1$c)object).m;
                if (bl2) {
                    int n3;
                    int n4 = 16;
                    Object object3 = new LP1$c[n4];
                    object2 = new WR1((Object[])object3);
                    object3 = ((LP1$c)object).f;
                    if (object3 == null) {
                        go0.a((WR1)object2, (LP1$c)object);
                    } else {
                        ((WR1)object2).b(object3);
                    }
                    block0: while ((n3 = ((WR1)object2).l()) != 0) {
                        n3 = ((WR1)object2).c;
                        int n7 = 1;
                        object = (LP1$c)((WR1)object2).n(n3 -= n7);
                        int n8 = ((LP1$c)object).d;
                        int n10 = 262144;
                        if ((n8 &= n10) != 0) {
                            Object object4 = object;
                            while (object4 != null) {
                                int n14 = ((LP1$c)object4).c & n10;
                                if (n14 != 0) {
                                    WR1 wR1 = null;
                                    Object object5 = object4;
                                    while (object5 != null) {
                                        Object object6;
                                        String string2;
                                        int n15 = object5 instanceof yr3_0;
                                        if (n15 != 0) {
                                            string2 = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";
                                            object6 = (object5 = (yr3_0)object5).v();
                                            n15 = (int)(Intrinsics.areEqual(string2, object6) ? 1 : 0);
                                            if ((object5 = n15 != 0 ? (Xr3)((Object)vy2$a$b.invoke(object5)) : Xr3.ContinueTraversal) == (object6 = Xr3.CancelTraversal)) break block19;
                                            object6 = Xr3.SkipSubtreeAndContinueTraversal;
                                            if (object5 == object6) continue block0;
                                        } else {
                                            n15 = ((LP1$c)object5).c & n10;
                                            if (n15 != 0 && (n15 = object5 instanceof mo0_0) != 0) {
                                                object6 = object5;
                                                object6 = ((mo0_0)object5).o;
                                                int n16 = 0;
                                                string2 = null;
                                                while (object6 != null) {
                                                    int n17 = ((LP1$c)object6).c & n10;
                                                    if (n17 != 0) {
                                                        if (++n16 == n7) {
                                                            object5 = object6;
                                                        } else {
                                                            if (wR1 == null) {
                                                                Object[] objectArray = new LP1$c[n4];
                                                                wR1 = new WR1(objectArray);
                                                            }
                                                            if (object5 != null) {
                                                                wR1.b(object5);
                                                                n14 = 0;
                                                                object5 = null;
                                                            }
                                                            wR1.b(object6);
                                                        }
                                                    }
                                                    object6 = ((LP1$c)object6).f;
                                                }
                                                if (n16 == n7) continue;
                                            }
                                        }
                                        object5 = go0.b(wR1);
                                    }
                                }
                                object4 = ((LP1$c)object4).f;
                            }
                        }
                        go0.a((WR1)object2, (LP1$c)object);
                    }
                } else {
                    bh1_1.c("visitSubtreeIf called on an unattached node");
                    throw null;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(int n3, long l2) {
        jq1_2 jq1_22 = this.a;
        Object object = jq1_22.j;
        Object object2 = this.b;
        if ((object = (xp1_0)((HashMap)object).get(object2)) == null) return;
        int n4 = ((xp1_0)object).e();
        if (n4 == 0) return;
        object2 = ((xp1_0)object).v();
        n4 = object2.size();
        if (n3 >= 0 && n3 < n4) {
            n4 = (int)(((xp1_0)object).L() ? 1 : 0);
            int n7 = 1;
            if ((n4 ^= n7) != 0) {
                xp1_0 xp1_02 = jq1_22.a;
                xp1_02.l = n7;
                object2 = aq1_0.a((xp1_0)object);
                object = ((xp1_0)object).v();
                xp1_0 xp1_03 = (xp1_0)object.get(n3);
                object2.m(xp1_03, l2);
                n3 = 0;
                xp1_03 = null;
                xp1_02.l = false;
                return;
            }
            String string2 = "Pre-measure called on node that is not placed".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        StringBuilder stringBuilder = new StringBuilder("Index (");
        stringBuilder.append(n3);
        stringBuilder.append(") is out of bound of [0, ");
        stringBuilder.append(n4);
        stringBuilder.append(')');
        String string3 = stringBuilder.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string3);
        throw indexOutOfBoundsException;
    }

    public final int c() {
        int n3;
        Object object = this.a.j;
        Object object2 = this.b;
        if ((object = (xp1_0)((HashMap)object).get(object2)) != null) {
            object = ((xp1_0)object).v();
            n3 = object.size();
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void dispose() {
        Object object = this.a;
        ((jq1_2)object).d();
        Object object2 = ((jq1_2)object).j;
        Object object3 = this.b;
        object2 = (xp1_0)((HashMap)object2).remove(object3);
        if (object2 == null) return;
        int n3 = ((jq1_2)object).o;
        if (n3 <= 0) {
            object2 = "No pre-composed items to dispose".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object3 = ((jq1_2)object).a;
        int n4 = ((xp1_0)object3).x().indexOf(object2);
        List list = ((xp1_0)object3).x();
        int n7 = list.size();
        int n8 = ((jq1_2)object).o;
        if (n4 >= (n7 -= n8)) {
            n7 = ((jq1_2)object).n;
            int n10 = 1;
            ((jq1_2)object).n = n7 += n10;
            ((jq1_2)object).o = n8 += -1;
            list = ((xp1_0)object3).x();
            n7 = list.size();
            n8 = ((jq1_2)object).o;
            n7 -= n8;
            n8 = ((jq1_2)object).n;
            ((xp1_0)object3).l = n10;
            ((xp1_0)object3).O(n4, n7 -= n8, n10);
            n4 = 0;
            object2 = null;
            ((xp1_0)object3).l = false;
            ((jq1_2)object).b(n7);
            return;
        }
        object2 = "Item is not in pre-composed item range".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}


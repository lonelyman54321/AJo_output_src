/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SQ1
 */
public final class sq1_0
implements vm2_0 {
    public final Sl a;
    public final List b;
    public final rq1_2 c;
    public final rq1_2 d;
    public final ArrayList e;

    /*
     * Enabled aggressive block sorting
     */
    public sq1_0(Sl sl, xm3 xm32, List list, Vo0 vo0, RU0$a rU0$a) {
        int n3;
        Object object;
        int n4;
        Object object2;
        Object object3;
        ym2_0 ym2_02;
        sq1_0 sq1_02 = this;
        Object object4 = sl;
        Object object5 = xm32;
        this.a = sl;
        Object object6 = list;
        this.b = list;
        object6 = et1_2.NONE;
        ArrayList<Object> arrayList = new ArrayList<Object>(this);
        arrayList = yr1_2.a((et1_2)((Object)object6), (Function0)((Object)arrayList));
        this.c = arrayList;
        arrayList = new ArrayList<Object>(this);
        object6 = yr1_2.a((et1_2)((Object)object6), (Function0)((Object)arrayList));
        this.d = object6;
        object6 = Tl.a;
        object6 = sl.a;
        int n7 = ((String)object6).length();
        arrayList = sl.c;
        if (arrayList == null) {
            arrayList = mz0_2.a;
        }
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        int n8 = arrayList.size();
        int n10 = 0;
        int n14 = 0;
        Object object7 = null;
        int n15 = 0;
        Object object8 = null;
        while (true) {
            ym2_02 = ((xm3)object5).b;
            if (n14 >= n8) break;
            object3 = (Sl$b)arrayList.get(n14);
            object2 = (ym2_0)((Sl$b)object3).a;
            n4 = ((Sl$b)object3).b;
            if (n4 != n15) {
                object = new Sl$b(n15, n4, ym2_02);
                arrayList2.add(object);
            }
            ym2_02 = ym2_02.a((ym2_0)object2);
            n3 = ((Sl$b)object3).c;
            object8 = new Sl$b(n4, n3, ym2_02);
            arrayList2.add(object8);
            ++n14;
            n15 = n3;
        }
        if (n15 != n7) {
            arrayList = new ArrayList<Object>(n15, n7, (Object)ym2_02);
            arrayList2.add(arrayList);
        }
        if ((n7 = (int)(arrayList2.isEmpty() ? 1 : 0)) != 0) {
            object6 = new Sl$b(0, 0, ym2_02);
            arrayList2.add(object6);
        }
        int n16 = arrayList2.size();
        object6 = new ArrayList(n16);
        n16 = arrayList2.size();
        n8 = 0;
        while (true) {
            int n17;
            String string2;
            int n18;
            int n19;
            ArrayList<Object> arrayList3;
            int n20;
            Object object9;
            Object object10;
            if (n8 >= n16) {
                sq1_02.e = object6;
                return;
            }
            object7 = (Sl$b)arrayList2.get(n8);
            n15 = ((Sl$b)object7).b;
            int n21 = ((Sl$b)object7).c;
            if (n15 != n21) {
                object10 = ((Sl)object4).a.substring(n15, n21);
                object = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                Intrinsics.checkNotNullExpressionValue(object10, (String)object);
            } else {
                object10 = "";
            }
            Object object11 = object10;
            object8 = Tl.b((Sl)object4, n15, n21);
            object10 = null;
            object3 = new Sl((String)object11, (List)object8, null, null);
            object8 = (ym2_0)((Sl$b)object7).a;
            n4 = ((ym2_0)object8).b;
            int n22 = -1 << -1;
            n4 = (int)(Pj3.a(n4, n22) ? 1 : 0);
            if (n4 == 0) {
                object9 = object6;
                n20 = n16;
                arrayList3 = arrayList2;
                n19 = n8;
                n18 = n21;
                string2 = object11;
            } else {
                n4 = ym2_02.b;
                n10 = ((ym2_0)object8).h;
                object4 = ((ym2_0)object8).i;
                n20 = n16;
                n16 = ((ym2_0)object8).a;
                arrayList3 = arrayList2;
                n19 = n8;
                long l2 = ((ym2_0)object8).c;
                object9 = object6;
                object6 = ((ym2_0)object8).d;
                string2 = object11;
                object11 = ((ym2_0)object8).e;
                n18 = n21;
                object2 = ((ym2_0)object8).f;
                n15 = ((ym2_0)object8).g;
                object8 = object = new ym2_0(n16, n4, l2, (vl3_0)object6, (ot2_1)object11, (yu1_1)object2, n15, n10, (im3_0)object4);
            }
            arrayList = ym2_02.a((ym2_0)object8);
            arrayList2 = ((xm3)object5).a;
            object6 = new xm3((S93)((Object)arrayList2), (ym2_0)((Object)arrayList));
            List list2 = ((Sl)object3).b();
            arrayList = sq1_02.b;
            n8 = arrayList.size();
            arrayList2 = new ArrayList<Object>(n8);
            n8 = arrayList.size();
            n10 = 0;
            while (true) {
                n15 = ((Sl$b)object7).b;
                if (n10 >= n8) break;
                object2 = object3 = arrayList.get(n10);
                object2 = (Sl$b)object3;
                n4 = ((Sl$b)object2).b;
                n21 = ((Sl$b)object2).c;
                n17 = n18;
                if ((n15 = (int)(Tl.c(n15, n18, n4, n21) ? 1 : 0)) != 0) {
                    arrayList2.add(object3);
                }
                ++n10;
                n18 = n17;
            }
            n17 = n18;
            n8 = arrayList2.size();
            arrayList = new ArrayList<Object>(n8);
            n8 = arrayList2.size();
            for (n10 = 0; n10 < n8; ++n10) {
                object7 = (Sl$b)arrayList2.get(n10);
                n3 = ((Sl$b)object7).b;
                if (n15 <= n3 && (n21 = ((Sl$b)object7).c) <= n17) {
                    object7 = ((Sl$b)object7).a;
                    object10 = new Sl$b(n3 -= n15, n21 -= n15, object7);
                    arrayList.add(object10);
                    continue;
                }
                object5 = "placeholder can not overlap with paragraph.".toString();
                object4 = new IllegalArgumentException((String)object5);
                throw object4;
            }
            object = arrayList2;
            n8 = n17;
            object11 = string2;
            arrayList2 = new ArrayList<Object>(string2, (xm3)object6, list2, arrayList, rU0$a, vo0);
            object4 = new um2((ii)((Object)arrayList2), n15, n17);
            object6 = object9;
            ((ArrayList)object9).add(object4);
            n8 = n19 + 1;
            object4 = sl;
            n16 = n20;
            arrayList2 = arrayList3;
            n10 = 0;
        }
    }

    public final boolean a() {
        ArrayList arrayList = this.e;
        int n3 = arrayList.size();
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            vm2_0 vm2_02 = ((um2)arrayList.get((int)i3)).a;
            boolean bl3 = vm2_02.a();
            if (!bl3) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    public final float b() {
        return ((Number)this.d.getValue()).floatValue();
    }

    public final float c() {
        return ((Number)this.c.getValue()).floatValue();
    }
}


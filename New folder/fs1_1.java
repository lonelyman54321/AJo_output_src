/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from fs1
 */
public final class fs1_1
implements es1,
dl1_1 {
    public final Tr1 a;
    public final xf3_1 b;
    public final wr1_0 c;
    public final HashMap d;

    public fs1_1(Tr1 hashMap, xf3_1 xf3_12) {
        this.a = hashMap;
        this.b = xf3_12;
        hashMap = (wr1_0)((Tr1)((Object)hashMap)).b.invoke();
        this.c = hashMap;
        this.d = hashMap = new HashMap();
    }

    public final float D0(int n3) {
        return this.b.D0(n3);
    }

    public final float E0(float f5) {
        return this.b.E0(f5);
    }

    public final float H(long l2) {
        return this.b.H(l2);
    }

    public final float H0() {
        return this.b.H0();
    }

    public final float J0(float f5) {
        return this.b.J0(f5);
    }

    public final long O(float f5) {
        return this.b.O(f5);
    }

    public final int O0(long l2) {
        return this.b.O0(l2);
    }

    public final List R(int n3, long l2) {
        HashMap hashMap = this.d;
        ArrayList<Ns2> arrayList = n3;
        if ((arrayList = (List)hashMap.get(arrayList)) == null) {
            arrayList = this.c;
            Object object = arrayList.c(n3);
            arrayList = arrayList.e(n3);
            arrayList = this.a.a(n3, object, arrayList);
            arrayList = this.b.w(object, (Function2)((Object)arrayList));
            int n4 = arrayList.size();
            ArrayList<Ns2> arrayList2 = new ArrayList<Ns2>(n4);
            for (int i3 = 0; i3 < n4; ++i3) {
                Ns2 ns2 = ((xk1_0)arrayList.get(i3)).Q(l2);
                arrayList2.add(ns2);
            }
            Integer n7 = n3;
            hashMap.put(n7, arrayList2);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final bl1_0 V0(int n3, int n4, Map map2, Function1 function1) {
        return this.b.V0(n3, n4, map2, function1);
    }

    public final boolean W() {
        return this.b.W();
    }

    public final long Z0(long l2) {
        return this.b.Z0(l2);
    }

    public final int e0(float f5) {
        return this.b.e0(f5);
    }

    public final float getDensity() {
        return this.b.getDensity();
    }

    public final bp1_0 getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    public final float h0(long l2) {
        return this.b.h0(l2);
    }

    public final long z(long l2) {
        return this.b.z(l2);
    }
}


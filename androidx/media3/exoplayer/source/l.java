/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.i$a;
import androidx.media3.exoplayer.source.l$a;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.v;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

public final class l
implements androidx.media3.exoplayer.source.i,
i$a {
    public final androidx.media3.exoplayer.source.i[] a;
    public final IdentityHashMap b;
    public final yl0 c;
    public final ArrayList d;
    public final HashMap e;
    public i$a f;
    public sp3 g;
    public androidx.media3.exoplayer.source.i[] h;
    public w30_0 i;

    public l(yl0 identityHashMap, long[] lArray, androidx.media3.exoplayer.source.i ... iArray) {
        int n3;
        this.c = identityHashMap;
        this.a = iArray;
        androidx.media3.exoplayer.source.i[] iArray2 = new ArrayList();
        this.d = iArray2;
        this.e = iArray2;
        identityHashMap.getClass();
        iArray2 = ImmutableList.of();
        ImmutableList immutableList = ImmutableList.of();
        identityHashMap = new IdentityHashMap((List)iArray2, immutableList);
        this.i = identityHashMap;
        this.b = identityHashMap = new IdentityHashMap();
        identityHashMap = null;
        iArray2 = new androidx.media3.exoplayer.source.i[]{};
        this.h = iArray2;
        for (int i3 = 0; i3 < (n3 = iArray.length); ++i3) {
            long l2 = lArray[i3];
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) continue;
            androidx.media3.exoplayer.source.i[] iArray3 = this.a;
            androidx.media3.exoplayer.source.i i8 = iArray[i3];
            v v4 = new v(i8, l2);
            iArray3[i3] = v4;
        }
    }

    public final boolean a(i i3) {
        ArrayList arrayList = this.d;
        int n3 = arrayList.isEmpty();
        if (n3 == 0) {
            n3 = arrayList.size();
            for (int i8 = 0; i8 < n3; ++i8) {
                androidx.media3.exoplayer.source.i i10 = (androidx.media3.exoplayer.source.i)arrayList.get(i8);
                i10.a(i3);
            }
            return false;
        }
        return this.i.a(i3);
    }

    public final long b(DF0[] dF0Array, boolean[] blArray, VR2[] vR2Array, boolean[] blArray2, long l2) {
        Object object;
        int n3;
        Object object2;
        Object object3;
        l l3 = this;
        Object object4 = dF0Array;
        Object object5 = vR2Array;
        int n4 = dF0Array.length;
        int[] nArray = new int[n4];
        int n7 = dF0Array.length;
        int[] nArray2 = new int[n7];
        int n8 = 0;
        Object object6 = null;
        int n10 = 0;
        while (true) {
            int n14 = ((DF0[])object4).length;
            object3 = l3.b;
            if (n10 >= n14) break;
            object2 = object5[n10];
            if (object2 == null) {
                n3 = 0;
                object = null;
            } else {
                object = object2 = ((IdentityHashMap)object3).get(object2);
                object = (Integer)object2;
            }
            n14 = -1;
            int n15 = object == null ? -1 : (Integer)object;
            nArray[n10] = n15;
            object3 = object4[n10];
            if (object3 != null) {
                object2 = object3.d().b;
                object3 = ":";
                n15 = ((String)object2).indexOf((String)object3);
                object2 = ((String)object2).substring(0, n15);
                nArray2[n10] = n14 = Integer.parseInt((String)object2);
            } else {
                nArray2[n10] = n14;
            }
            ++n10;
        }
        ((IdentityHashMap)object3).clear();
        n10 = ((DF0[])object4).length;
        object2 = new VR2[n10];
        int n16 = ((DF0[])object4).length;
        VR2[] vR2Array2 = new VR2[n16];
        Object[] objectArray = new DF0[((DF0[])object4).length];
        Object object7 = l3.a;
        int n17 = ((androidx.media3.exoplayer.source.i[])object7).length;
        Object object8 = new ArrayList(n17);
        long l4 = l2;
        int n18 = 0;
        Object object9 = null;
        while (n18 < (n17 = ((androidx.media3.exoplayer.source.i[])object7).length)) {
            block20: {
                Object object10;
                DF0[] dF0Array2;
                androidx.media3.exoplayer.source.i[] iArray;
                androidx.media3.exoplayer.source.i i3;
                block19: {
                    long l7;
                    block18: {
                        VR2[] vR2Array3;
                        i3 = null;
                        for (n17 = 0; n17 < (n8 = ((DF0[])object4).length); ++n17) {
                            n8 = nArray[n17];
                            if (n8 == n18) {
                                object6 = object5[n17];
                            } else {
                                n8 = 0;
                                object6 = null;
                            }
                            vR2Array2[n17] = object6;
                            n8 = nArray2[n17];
                            if (n8 == n18) {
                                object6 = object4[n17];
                                object6.getClass();
                                object = object6.d();
                                vR2Array3 = object8;
                                object = (qp3)l3.e.get(object);
                                object.getClass();
                                objectArray[n17] = object8 = new l$a((DF0)object6, (qp3)object);
                                n8 = 0;
                                object6 = null;
                            } else {
                                vR2Array3 = object8;
                                n8 = 0;
                                object6 = null;
                                objectArray[n17] = null;
                            }
                            object8 = vR2Array3;
                        }
                        vR2Array3 = object8;
                        n8 = 0;
                        i3 = object7[n18];
                        n3 = n18;
                        object9 = objectArray;
                        iArray = object7;
                        object7 = blArray;
                        object6 = object8;
                        object8 = vR2Array2;
                        dF0Array2 = objectArray;
                        objectArray = blArray2;
                        l7 = i3.b((DF0[])object9, blArray, vR2Array2, blArray2, l4);
                        if (n18 != 0) break block18;
                        l4 = l7;
                        break block19;
                    }
                    object10 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
                    if (object10 != false) break block20;
                }
                i3 = null;
                n18 = 0;
                object9 = null;
                for (n17 = 0; n17 < (object10 = (Object)((Object[])object4).length); ++n17) {
                    object10 = nArray2[n17];
                    boolean bl2 = true;
                    if (object10 == n3) {
                        object9 = vR2Array2[n17];
                        object9.getClass();
                        object2[n17] = object7 = vR2Array2[n17];
                        object7 = n3;
                        ((IdentityHashMap)object3).put(object9, object7);
                        n18 = 1;
                        continue;
                    }
                    object10 = nArray[n17];
                    if (object10 != n3) continue;
                    object7 = vR2Array2[n17];
                    if (object7 != null) {
                        bl2 = false;
                        object8 = null;
                    }
                    ct3.f(bl2);
                }
                if (n18 != 0) {
                    i3 = iArray[n3];
                    ((ArrayList)object6).add(i3);
                }
                n18 = n3 + 1;
                object8 = object6;
                object7 = iArray;
                objectArray = dF0Array2;
                n8 = 0;
                object6 = null;
                continue;
            }
            object4 = new IllegalStateException("Children enabled at different positions.");
            throw object4;
        }
        object6 = object8;
        System.arraycopy(object2, 0, object5, 0, n10);
        object4 = new androidx.media3.exoplayer.source.i[]{};
        object4 = (androidx.media3.exoplayer.source.i[])object8.toArray((T[])object4);
        l3.h = object4;
        object4 = new Object();
        object4 = Lists.transform(object8, (Function)object4);
        l3.c.getClass();
        l3.i = object5 = new w30_0((List)object8, (List)object4);
        return l4;
    }

    public final void c(androidx.media3.exoplayer.source.i object) {
        int n3;
        sp3 sp32;
        int n4;
        qp3[] qp3Array = this.d;
        qp3Array.remove(object);
        boolean bl2 = qp3Array.isEmpty();
        if (!bl2) {
            return;
        }
        object = this.a;
        int n7 = ((androidx.media3.exoplayer.source.i[])object).length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            sp32 = object[n4].l();
            n3 = sp32.a;
            n8 += n3;
        }
        qp3Array = new qp3[n8];
        n8 = 0;
        for (n4 = 0; n4 < (n3 = ((androidx.media3.exoplayer.source.i[])object).length); ++n4) {
            sp32 = object[n4].l();
            int n10 = sp32.a;
            for (int i3 = 0; i3 < n10; ++i3) {
                Object object2;
                String string2;
                qp3 qp32 = sp32.a(i3);
                int n14 = qp32.a;
                Object object3 = new d[n14];
                int n15 = 0;
                qp3 qp33 = null;
                while (true) {
                    int n16 = qp32.a;
                    string2 = ":";
                    if (n15 >= n16) break;
                    object2 = qp32.d[n15];
                    d$a d$a = ((d)object2).a();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(n4);
                    stringBuilder.append(string2);
                    object2 = ((d)object2).a;
                    if (object2 == null) {
                        object2 = "";
                    }
                    stringBuilder.append((String)object2);
                    d$a.a = object2 = stringBuilder.toString();
                    object3[n15] = object2 = d$a.a();
                    ++n15;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(n4);
                ((StringBuilder)object2).append(string2);
                string2 = qp32.b;
                ((StringBuilder)object2).append(string2);
                object2 = ((StringBuilder)object2).toString();
                qp33 = new qp3((String)object2, (d[])object3);
                object3 = this.e;
                ((HashMap)object3).put(qp33, qp32);
                int n17 = n8 + 1;
                qp3Array[n8] = qp33;
                n8 = n17;
            }
        }
        object = new sp3(qp3Array);
        this.g = object;
        object = this.f;
        object.getClass();
        object.c(this);
    }

    public final long d() {
        return this.i.d();
    }

    public final long e(long l2, ex2_0 ex2_02) {
        Object object = this.h;
        int n3 = ((androidx.media3.exoplayer.source.i[])object).length;
        object = n3 > 0 ? object[0] : this.a[0];
        return object.e(l2, ex2_02);
    }

    public final long f(long l2) {
        int n3;
        Object object = this.h;
        Object object2 = null;
        object = object[0];
        l2 = object.f(l2);
        for (int i3 = 1; i3 < (n3 = ((androidx.media3.exoplayer.source.i[])(object2 = this.h)).length); ++i3) {
            long l3 = (object2 = object2[i3]).f(l2);
            long l4 = l3 - l2;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 == false) {
                continue;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected child seekToUs result.");
            throw illegalStateException;
        }
        return l2;
    }

    public final long g() {
        long l2;
        l l3 = this;
        Object object = this.h;
        int n3 = ((androidx.media3.exoplayer.source.i[])object).length;
        long l4 = l2 = -9223372036854775807L;
        for (int i3 = 0; i3 < n3; ++i3) {
            long l7;
            long l8;
            long l12;
            androidx.media3.exoplayer.source.i i8 = object[i3];
            long l14 = i8.g();
            String string2 = "Unexpected child seekToUs result.";
            Object object2 = l14 == l2 ? 0 : (l14 < l2 ? -1 : 1);
            if (object2 != false) {
                object2 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
                if (object2 == false) {
                    androidx.media3.exoplayer.source.i i10;
                    androidx.media3.exoplayer.source.i[] iArray = l3.h;
                    int n4 = iArray.length;
                    for (object2 = (Object)0; object2 < n4 && (i10 = iArray[object2]) != i8; ++object2) {
                        long l15 = i10.f(l14);
                        long l16 = l15 - l14;
                        Object object3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                        if (object3 == false) {
                            continue;
                        }
                        object = new IllegalStateException(string2);
                        throw object;
                    }
                    l4 = l14;
                    continue;
                }
                Object object4 = l14 == l4 ? 0 : (l14 < l4 ? -1 : 1);
                if (object4 == false) continue;
                object = new IllegalStateException("Conflicting discontinuities.");
                throw object;
            }
            Object object5 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
            if (object5 == false || (l12 = (l8 = (l7 = i8.f(l4)) - l4) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) continue;
            object = new IllegalStateException(string2);
            throw object;
        }
        return l4;
    }

    public final void h(r object) {
        object = (androidx.media3.exoplayer.source.i)object;
        object = this.f;
        object.getClass();
        object.h(this);
    }

    public final void i() {
        for (androidx.media3.exoplayer.source.i i3 : this.a) {
            i3.i();
        }
    }

    public final boolean isLoading() {
        return this.i.isLoading();
    }

    public final void k(i$a object, long l2) {
        this.f = object;
        object = this.d;
        androidx.media3.exoplayer.source.i[] iArray = this.a;
        Collections.addAll(object, iArray);
        for (androidx.media3.exoplayer.source.i i3 : iArray) {
            i3.k(this, l2);
        }
    }

    public final sp3 l() {
        sp3 sp32 = this.g;
        sp32.getClass();
        return sp32;
    }

    public final long o() {
        return this.i.o();
    }

    public final void p(long l2, boolean bl2) {
        for (androidx.media3.exoplayer.source.i i3 : this.h) {
            i3.p(l2, bl2);
        }
    }

    public final void q(long l2) {
        this.i.q(l2);
    }
}


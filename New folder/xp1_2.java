/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xP1
 */
public final class xp1_2 {
    public static final HashMap m;
    public final wg1_1 a;
    public final wg1_1 b;
    public final wg1_1 c;
    public final wg1_1 d;
    public final wg1_1 e;
    public final wg1_1 f;
    public final wg1_1 g;
    public final wg1_1 h;
    public final wg1_1 i;
    public final wg1_1 j;
    public final wg1_1 k;
    public final HashMap l;

    static {
        Pair pair = new Pair("embedding.weight", "embed.weight");
        Pair pair2 = new Pair("dense1.weight", "fc1.weight");
        Pair pair3 = new Pair("dense2.weight", "fc2.weight");
        Pair pair4 = new Pair("dense3.weight", "fc3.weight");
        Pair pair5 = new Pair("dense1.bias", "fc1.bias");
        Pair pair6 = new Pair("dense2.bias", "fc2.bias");
        Pair pair7 = new Pair("dense3.bias", "fc3.bias");
        Pair[] pairArray = new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7};
        m = fh1_2.h(pairArray);
    }

    public xp1_2() {
        throw null;
    }

    public xp1_2(HashMap serializable) {
        Object object = serializable.get("embed.weight");
        String string2 = "Required value was null.";
        if (object != null) {
            object = (wg1_1)object;
            this.a = object;
            object = serializable.get("convs.0.weight");
            if (object != null) {
                this.b = object = S92.l((wg1_1)object);
                object = serializable.get("convs.1.weight");
                if (object != null) {
                    this.c = object = S92.l((wg1_1)object);
                    object = serializable.get("convs.2.weight");
                    if (object != null) {
                        this.d = object = S92.l((wg1_1)object);
                        object = serializable.get("convs.0.bias");
                        if (object != null) {
                            this.e = object = (wg1_1)object;
                            object = serializable.get("convs.1.bias");
                            if (object != null) {
                                this.f = object = (wg1_1)object;
                                object = serializable.get("convs.2.bias");
                                if (object != null) {
                                    this.g = object = (wg1_1)object;
                                    object = serializable.get("fc1.weight");
                                    if (object != null) {
                                        this.h = object = S92.k((wg1_1)object);
                                        object = serializable.get("fc2.weight");
                                        if (object != null) {
                                            this.i = object = S92.k((wg1_1)object);
                                            object = serializable.get("fc1.bias");
                                            if (object != null) {
                                                this.j = object = (wg1_1)object;
                                                object = serializable.get("fc2.bias");
                                                if (object != null) {
                                                    boolean bl2;
                                                    this.k = object = (wg1_1)object;
                                                    this.l = object;
                                                    object = HP1$a.MTML_INTEGRITY_DETECT.toKey();
                                                    string2 = HP1$a.MTML_APP_EVENT_PREDICTION.toKey();
                                                    object = p03_0.f(object, string2).iterator();
                                                    while (bl2 = object.hasNext()) {
                                                        string2 = (String)object.next();
                                                        Object object2 = Ft2.a(string2, ".weight");
                                                        string2 = Ft2.a(string2, ".bias");
                                                        wg1_1 wg1_12 = (wg1_1)serializable.get(object2);
                                                        wg1_1 wg1_13 = (wg1_1)serializable.get(string2);
                                                        if (wg1_12 != null) {
                                                            wg1_12 = S92.k(wg1_12);
                                                            HashMap hashMap = this.l;
                                                            hashMap.put(object2, wg1_12);
                                                        }
                                                        if (wg1_13 == null) continue;
                                                        object2 = this.l;
                                                        ((HashMap)object2).put(string2, wg1_13);
                                                    }
                                                    return;
                                                }
                                                object = string2.toString();
                                                super((String)object);
                                                throw serializable;
                                            }
                                            object = string2.toString();
                                            super((String)object);
                                            throw serializable;
                                        }
                                        object = string2.toString();
                                        super((String)object);
                                        throw serializable;
                                    }
                                    object = string2.toString();
                                    super((String)object);
                                    throw serializable;
                                }
                                object = string2.toString();
                                super((String)object);
                                throw serializable;
                            }
                            object = string2.toString();
                            super((String)object);
                            throw serializable;
                        }
                        object = string2.toString();
                        super((String)object);
                        throw serializable;
                    }
                    object = string2.toString();
                    super((String)object);
                    throw serializable;
                }
                object = string2.toString();
                super((String)object);
                throw serializable;
            }
            object = string2.toString();
            super((String)object);
            throw serializable;
        }
        object = string2.toString();
        super((String)object);
        throw serializable;
    }

    public final wg1_1 a(wg1_1 wg1_12, String[] object, String object2) {
        Throwable throwable2;
        block53: {
            block52: {
                int n3 = 1;
                int n4 = 2;
                HashMap hashMap = this.l;
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return null;
                }
                Object object3 = "dense";
                try {
                    Intrinsics.checkNotNullParameter(wg1_12, (String)object3);
                    object3 = "texts";
                }
                catch (Throwable throwable2) {}
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object3 = "task";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = this.a;
                object = S92.e(object, (wg1_1)object3);
                object3 = this.b;
                object = S92.c((wg1_1)object, (wg1_1)object3);
                object3 = this.e;
                S92.a((wg1_1)object, (wg1_1)object3);
                S92.i((wg1_1)object);
                object3 = this.c;
                object3 = S92.c((wg1_1)object, (wg1_1)object3);
                wg1_1 wg1_13 = this.f;
                S92.a((wg1_1)object3, wg1_13);
                S92.i((wg1_1)object3);
                object3 = S92.g((wg1_1)object3, n4);
                wg1_13 = this.d;
                wg1_13 = S92.c((wg1_1)object3, wg1_13);
                wg1_1[] wg1_1Array = this.g;
                S92.a(wg1_13, (wg1_1)wg1_1Array);
                S92.i(wg1_13);
                wg1_1Array = (wg1_1[])object.a;
                Object object4 = wg1_1Array[n3];
                object = S92.g((wg1_1)object, (int)object4);
                wg1_1Array = (wg1_1[])((wg1_1)object3).a;
                object4 = wg1_1Array[n3];
                object3 = S92.g((wg1_1)object3, (int)object4);
                wg1_1Array = (wg1_1[])wg1_13.a;
                object4 = wg1_1Array[n3];
                wg1_13 = S92.g(wg1_13, (int)object4);
                S92.f((wg1_1)object);
                S92.f((wg1_1)object3);
                S92.f(wg1_13);
                object4 = 4;
                wg1_1Array = new wg1_1[object4];
                wg1_1Array[0] = object;
                wg1_1Array[n3] = object3;
                wg1_1Array[n4] = wg1_13;
                int n7 = 3;
                wg1_1Array[n7] = wg1_12;
                wg1_12 = S92.b(wg1_1Array);
                object = this.h;
                Object object5 = this.j;
                wg1_12 = S92.d(wg1_12, (wg1_1)object, (wg1_1)object5);
                S92.i(wg1_12);
                object = this.i;
                object5 = this.k;
                wg1_12 = S92.d(wg1_12, (wg1_1)object, (wg1_1)object5);
                S92.i(wg1_12);
                object = new StringBuilder();
                object.append((String)object2);
                object5 = ".weight";
                object.append((String)object5);
                object = object.toString();
                object = hashMap.get(object);
                object = (wg1_1)object;
                object5 = new StringBuilder();
                ((StringBuilder)object5).append((String)object2);
                object2 = ".bias";
                ((StringBuilder)object5).append((String)object2);
                object2 = ((StringBuilder)object5).toString();
                object2 = hashMap.get(object2);
                object2 = (wg1_1)object2;
                if (object == null || object2 == null) break block52;
                wg1_12 = S92.d(wg1_12, (wg1_1)object, (wg1_1)object2);
                S92.j(wg1_12);
                return wg1_12;
                break block53;
            }
            return null;
        }
        td0.a(this, throwable2);
        return null;
    }
}


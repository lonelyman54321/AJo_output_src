/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from Hs2
 */
public class hs2_2 {
    public final ArrayList a;
    public int b;
    public boolean c;
    public ks2_2 d;
    private volatile /* synthetic */ Object interceptors$delegate;

    public hs2_2(ks2_2 ... object) {
        Intrinsics.checkNotNullParameter(object, "phases");
        new e40_0();
        int n3 = ((ks2_2[])object).length;
        this.a = object = xx_2.j(Arrays.copyOf(object, n3));
        this.interceptors$delegate = null;
    }

    public final Object a(Object object, Object object2, f80_0 f80_02) {
        String string2;
        boolean bl2;
        int n3;
        Object object3;
        Object object4;
        block16: {
            object4 = f80_02.getContext();
            object3 = (ArrayList)this.interceptors$delegate;
            n3 = 1;
            if (object3 == null) {
                int n4 = this.b;
                bl2 = false;
                string2 = null;
                if (n4 == 0) {
                    this.interceptors$delegate = object3 = mz0_2.a;
                    this.c = false;
                    this.d = null;
                } else {
                    Object object5;
                    int n7;
                    Object object6;
                    boolean bl3;
                    int n8;
                    ArrayList arrayList = this.a;
                    if (n4 == n3 && (n4 = xx_2.h(arrayList)) >= 0) {
                        n8 = 0;
                        while (true) {
                            if (bl3 = (object6 = arrayList.get(n8)) instanceof us2_2) {
                                object6 = (us2_2)object6;
                            } else {
                                n7 = 0;
                                object6 = null;
                            }
                            if (object6 != null && !(bl3 = (object5 = ((us2_2)object6).c).isEmpty())) {
                                object3 = ((us2_2)object6).c;
                                ((us2_2)object6).d = n3;
                                this.interceptors$delegate = object3;
                                this.c = false;
                                this.d = object3 = ((us2_2)object6).a;
                                break block16;
                            }
                            if (n8 == n4) break;
                            ++n8;
                        }
                    }
                    object3 = new ArrayList();
                    n8 = xx_2.h(arrayList);
                    if (n8 >= 0) {
                        n7 = 0;
                        object6 = null;
                        while (true) {
                            int n10;
                            if ((n10 = (object5 = arrayList.get(n7)) instanceof us2_2) != 0) {
                                object5 = (us2_2)object5;
                            } else {
                                bl3 = false;
                                object5 = null;
                            }
                            if (object5 != null) {
                                String string3 = "destination";
                                Intrinsics.checkNotNullParameter(object3, string3);
                                object5 = ((us2_2)object5).c;
                                n10 = ((ArrayList)object3).size();
                                int n14 = object5.size() + n10;
                                ((ArrayList)object3).ensureCapacity(n14);
                                n10 = object5.size();
                                for (n14 = 0; n14 < n10; ++n14) {
                                    Object e2 = object5.get(n14);
                                    ((ArrayList)object3).add(e2);
                                }
                            }
                            if (n7 == n8) break;
                            ++n7;
                        }
                    }
                    this.interceptors$delegate = object3;
                    this.c = false;
                    this.d = null;
                }
            }
        }
        this.c = n3;
        object3 = (List)this.interceptors$delegate;
        Intrinsics.checkNotNull(object3);
        n3 = this.d();
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object3, "interceptors");
        Intrinsics.checkNotNullParameter(object2, "subject");
        string2 = "coroutineContext";
        Intrinsics.checkNotNullParameter(object4, string2);
        bl2 = js2_2.a;
        if (!bl2 && n3 == 0) {
            object4 = new pg3_2(object2, object, (List)object3);
        } else {
            qi0_2 qi0_22 = new qi0_2(object, (List)object3, object2, (CoroutineContext)object4);
            object4 = qi0_22;
        }
        return ((is2_2)object4).a(f80_02, object2);
    }

    public final us2_2 b(ks2_2 ks2_22) {
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = arrayList.get(i3);
            if (object == ks2_22) {
                object = Ls2$c.a;
                us2_2 us2_22 = new us2_2(ks2_22, (ls2_1)object);
                arrayList.set(i3, us2_22);
                return us2_22;
            }
            boolean bl2 = object instanceof us2_2;
            if (!bl2) continue;
            object = (us2_2)object;
            ks2_2 ks2_23 = ((us2_2)object).a;
            if (ks2_23 != ks2_22) continue;
            return object;
        }
        return null;
    }

    public final int c(ks2_2 ks2_22) {
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            Object object = arrayList.get(i3);
            if (!(object == ks2_22 || (bl2 = object instanceof us2_2) && (object = ((us2_2)object).a) == ks2_22)) {
                continue;
            }
            return i3;
        }
        return -1;
    }

    public boolean d() {
        return false;
    }

    public final boolean e(ks2_2 ks2_22) {
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            Object object = arrayList.get(i3);
            if (!(object == ks2_22 || (bl2 = object instanceof us2_2) && (object = ((us2_2)object).a) == ks2_22)) {
                continue;
            }
            return true;
        }
        return false;
    }

    public final void f(ks2_2 object, ks2_2 object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "reference");
        CharSequence charSequence = "phase";
        Intrinsics.checkNotNullParameter(object2, (String)charSequence);
        int n4 = this.e((ks2_2)object2);
        if (n4 != 0) {
            return;
        }
        n4 = this.c((ks2_2)object);
        if (n4 != (n3 = -1)) {
            n3 = n4 + 1;
            ArrayList arrayList = this.a;
            int n7 = xx_2.h(arrayList);
            if (n3 <= n7) {
                while (true) {
                    boolean bl2;
                    Object object3 = arrayList.get(n3);
                    boolean bl3 = object3 instanceof us2_2;
                    Ls2$a ls2$a = null;
                    if (bl3) {
                        object3 = (us2_2)object3;
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    if (object3 == null || (object3 = ((us2_2)object3).b) == null) break;
                    bl3 = object3 instanceof Ls2$a;
                    if (bl3) {
                        ls2$a = (Ls2$a)object3;
                        ls2$a = (Ls2$a)object3;
                    }
                    if (ls2$a != null && (object3 = ls2$a.a) != null && (bl2 = Intrinsics.areEqual(object3, object))) {
                        n4 = n3;
                    }
                    if (n3 == n7) break;
                    ++n3;
                }
            }
            Ls2$a ls2$a = new Ls2$a((ks2_2)object);
            us2_2 us2_22 = new us2_2((ks2_2)object2, ls2$a);
            arrayList.add(++n4, us2_22);
            return;
        }
        charSequence = new StringBuilder("Phase ");
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append(" was not registered for this pipeline");
        object = ((StringBuilder)charSequence).toString();
        object2 = new fk1_2((String)object);
        throw object2;
    }

    public final void g(ks2_2 object, gx0_2 object2) {
        Object object3;
        block5: {
            String string2;
            block6: {
                int n3;
                block8: {
                    ArrayList arrayList;
                    int n4;
                    int n7;
                    Object object4;
                    List list;
                    block7: {
                        Intrinsics.checkNotNullParameter(object, "phase");
                        Intrinsics.checkNotNullParameter(object2, "block");
                        object3 = this.b((ks2_2)object);
                        if (object3 == null) break block5;
                        list = (List)this.interceptors$delegate;
                        object4 = this.a;
                        n7 = object4.isEmpty();
                        string2 = "interceptor";
                        if (n7 != 0 || list == null || (n7 = this.c) != 0 || (n7 = TypeIntrinsics.isMutableList(list)) == 0) break block6;
                        object4 = this.d;
                        n7 = Intrinsics.areEqual(object4, object);
                        if (n7 == 0) break block7;
                        list.add(object2);
                        break block8;
                    }
                    object4 = CollectionsKt.S(this.a);
                    n7 = Intrinsics.areEqual(object, object4);
                    if (n7 == 0 && (n7 = this.c((ks2_2)object)) != (n4 = xx_2.h(arrayList = this.a))) break block6;
                    object = this.b((ks2_2)object);
                    Intrinsics.checkNotNull(object);
                    object.getClass();
                    Intrinsics.checkNotNullParameter(object2, string2);
                    boolean bl2 = ((us2_2)object).d;
                    if (bl2) {
                        ((us2_2)object).c = object3 = CollectionsKt.m0(((us2_2)object).c);
                        ((us2_2)object).d = false;
                    }
                    object = ((us2_2)object).c;
                    object.add(object2);
                    list.add(object2);
                }
                this.b = n3 = this.b + 1;
                return;
            }
            Intrinsics.checkNotNullParameter(object2, string2);
            int n8 = ((us2_2)object3).d;
            if (n8 != 0) {
                ((us2_2)object3).c = object = CollectionsKt.m0(((us2_2)object3).c);
                ((us2_2)object3).d = false;
            }
            ((us2_2)object3).c.add(object2);
            this.b = n8 = this.b + 1;
            this.interceptors$delegate = null;
            this.c = false;
            this.d = null;
            return;
        }
        object3 = new StringBuilder("Phase ");
        ((StringBuilder)object3).append(object);
        ((StringBuilder)object3).append(" was not registered for this pipeline");
        object = ((StringBuilder)object3).toString();
        object2 = new fk1_2((String)object);
        throw object2;
    }
}


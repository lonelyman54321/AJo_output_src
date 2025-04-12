/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from X40
 */
public final class x40_0
extends le_2 {
    public final he_2 m;

    public x40_0(int n3, he_2 object, Function1 object2) {
        super(n3, (Function1)object2);
        this.m = object;
        object2 = he_2.SUSPEND;
        if (object != object2) {
            int n4 = 1;
            if (n3 >= n4) {
                return;
            }
            String string2 = Gj0.b(n3, "Buffered channel capacity must be at least 1, but ", " was specified");
            string2 = string2.toString();
            super(string2);
            throw object;
        }
        CharSequence charSequence = new StringBuilder("This implementation does not support suspension for senders, use ");
        object = Reflection.getOrCreateKotlinClass(le_2.class).getSimpleName();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" instead");
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        super((String)charSequence);
        throw object;
    }

    public final boolean C() {
        boolean bl2;
        he_2 he_22 = this.m;
        he_2 he_23 = he_2.DROP_OLDEST;
        if (he_22 == he_23) {
            bl2 = true;
        } else {
            bl2 = false;
            he_22 = null;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object O(Object object, boolean bl2) {
        Object object2;
        block13: {
            int n3;
            int n4;
            void var5_10;
            long l2;
            int n7;
            boolean bl3;
            gh3_2 gh3_22;
            int n8;
            Object object3;
            x40_0 x40_02;
            block14: {
                int n10;
                long l3;
                x40_02 = this;
                object3 = he_2.DROP_LATEST;
                he_2 he_22 = this.m;
                object2 = null;
                n8 = 1;
                if (he_22 == object3) {
                    object3 = super.j(object);
                    boolean bl4 = object3 instanceof VR$b ^ n8;
                    if (bl4) return object3;
                    bl4 = object3 instanceof VR$a;
                    if (bl4) {
                        return object3;
                    }
                    if (!bl2) return Unit.a;
                    object3 = this.b;
                    if (object3 == null) return Unit.a;
                    if ((object3 = hz0_2.b((Function1)object3, object, null)) != null) throw object3;
                    return Unit.a;
                }
                gh3_22 = pe_2.d;
                object3 = (wr_2)le_2.h.get(this);
                while (true) {
                    block17: {
                        long l4;
                        block18: {
                            block15: {
                                wr_2 wr_22;
                                block16: {
                                    AtomicLongFieldUpdater atomicLongFieldUpdater = le_2.d;
                                    long l7 = atomicLongFieldUpdater.getAndIncrement(x40_02);
                                    l3 = l7 & 0xFFFFFFFFFFFFFFFL;
                                    bl3 = x40_02.A(l7, false);
                                    n7 = pe_2.b;
                                    l4 = n7;
                                    l7 = l3 / l4;
                                    long l8 = l3 % l4;
                                    n8 = (int)l8;
                                    l2 = l4;
                                    long l12 = ((wx2_2)object3).c;
                                    long l14 = l12 - l7;
                                    Object object4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                                    if (object4 == false) break block15;
                                    wr_22 = le_2.a(x40_02, l7, (wr_2)object3);
                                    if (wr_22 != null) break block16;
                                    if (bl3) {
                                        object3 = this.w();
                                        VR$a vR$a = new VR$a((Throwable)object3);
                                        return var5_10;
                                    }
                                    break block17;
                                }
                                object2 = wr_22;
                                break block18;
                            }
                            object2 = object3;
                        }
                        object3 = this;
                        Object object5 = object2;
                        n10 = n8;
                        l4 = l3;
                        n4 = n7;
                        n7 = (int)(bl3 ? 1 : 0);
                        n3 = le_2.c(this, (wr_2)object2, n8, object, l3, gh3_22, bl3);
                        if (n3 == 0) break block13;
                        int n14 = 1;
                        if (n3 == n14) return Unit.a;
                        n10 = 2;
                        if (n3 == n10) break block14;
                        n10 = 3;
                        if (n3 == n10) {
                            String string2 = "unexpected".toString();
                            object3 = new IllegalStateException(string2);
                            throw object3;
                        }
                        n10 = 4;
                        if (n3 == n10) break;
                        n10 = 5;
                        if (n3 == n10) {
                            ((d40_0)object2).a();
                        }
                        object3 = object2;
                    }
                    object2 = null;
                    n8 = 1;
                }
                object3 = le_2.e;
                long l15 = ((AtomicLongFieldUpdater)object3).get(x40_02);
                long l16 = l3 - l15;
                n10 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                if (n10 < 0) {
                    ((d40_0)object2).a();
                }
                object3 = this.w();
                VR$a vR$a = new VR$a((Throwable)object3);
                return var5_10;
            }
            if (bl3) {
                ((wx2_2)object2).i();
                object3 = this.w();
                VR$a vR$a = new VR$a((Throwable)object3);
                return var5_10;
            }
            n3 = gh3_22 instanceof me3_2;
            if (n3 != 0) {
                object3 = gh3_22;
                object3 = (me3_2)((Object)gh3_22);
            } else {
                n3 = 0;
                object3 = null;
            }
            if (object3 != null) {
                n7 = n8 + n4;
                object3.a((wx2_2)object2, n7);
            }
            long l17 = ((wx2_2)object2).c * l2;
            long l18 = n8;
            x40_02.p(l17 += l18);
            return Unit.a;
        }
        ((d40_0)object2).a();
        return Unit.a;
    }

    public final Object j(Object object) {
        return this.O(object, false);
    }

    public final Object o(f80_0 object, Object object2) {
        boolean bl2 = true;
        object = this.O(object2, bl2);
        boolean bl3 = object instanceof VR$a;
        if (bl3) {
            bl2 = object instanceof VR$a;
            object = this.b;
            if (object != null) {
                bl3 = false;
                if ((object = hz0_2.b((Function1)object, object2, null)) != null) {
                    object2 = this.w();
                    yc0_2.a((Throwable)object, (Throwable)object2);
                    throw object;
                }
            }
            throw this.w();
        }
        return Unit.a;
    }
}


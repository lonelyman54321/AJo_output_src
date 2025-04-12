/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.i;

/*
 * Renamed from qa1
 */
public final class qa1_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ da1_2 d;
    public final /* synthetic */ ma1_1 e;

    public qa1_2(da1_2 da1_22, ma1_1 ma1_12, f80_0 f80_02) {
        this.d = da1_22;
        this.e = ma1_12;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object3 = (f80_0)object3;
        da1_2 da1_22 = this.d;
        ma1_1 ma1_12 = this.e;
        qa1_2 qa1_22 = new qa1_2(da1_22, ma1_12, (f80_0)object3);
        qa1_22.b = object;
        qa1_22.c = object2;
        object = Unit.a;
        return qa1_22.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        Iterator<Object> iterator;
        Object object2;
        Object object3;
        block20: {
            Object object4;
            block21: {
                block18: {
                    Object object5;
                    Object object6;
                    da1_2 da1_22;
                    Object object7;
                    int n3;
                    int n4;
                    qa1_2 qa1_22;
                    block19: {
                        Object object8;
                        block14: {
                            boolean bl2;
                            boolean bl3;
                            block15: {
                                block16: {
                                    block17: {
                                        qa1_22 = this;
                                        object3 = j90_0.COROUTINE_SUSPENDED;
                                        int n7 = this.a;
                                        n4 = 2;
                                        n3 = 1;
                                        object7 = "<set-?>";
                                        da1_22 = this.d;
                                        if (n7 == 0) break block15;
                                        if (n7 == n3) break block16;
                                        if (n7 != n4) break block17;
                                        vl2_2.b(object);
                                        break block18;
                                    }
                                    object3 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw object3;
                                }
                                object2 = (eb1_2)this.c;
                                object6 = this.b;
                                vl2_2.b(object);
                                object5 = object6;
                                object6 = object;
                                break block19;
                            }
                            vl2_2.b(object);
                            object2 = this.b;
                            object5 = this.c;
                            iterator = new Iterator<Object>();
                            object4 = (db1_2)((is2_2)object2).a;
                            ((db1_2)((Object)iterator)).b((db1_2)object4);
                            object4 = Object.class;
                            if (object5 == null) {
                                object5 = g52_0.a;
                                Intrinsics.checkNotNullParameter(object5, (String)object7);
                                ((db1_2)((Object)iterator)).d = object5;
                                object5 = Reflection.getOrCreateKotlinClass((Class)object4);
                                try {
                                    object4 = Reflection.typeOf((Class)object4);
                                }
                                catch (Throwable throwable) {
                                    bl3 = false;
                                    object4 = null;
                                }
                                object8 = new at3_0((yn1_2)object5, (kn1_1)object4);
                                ((db1_2)((Object)iterator)).a((at3_0)object8);
                            } else {
                                bl2 = object5 instanceof bg2_2;
                                if (bl2) {
                                    Intrinsics.checkNotNullParameter(object5, (String)object7);
                                    ((db1_2)((Object)iterator)).d = object5;
                                    ((db1_2)((Object)iterator)).a(null);
                                } else {
                                    Intrinsics.checkNotNullParameter(object5, (String)object7);
                                    ((db1_2)((Object)iterator)).d = object5;
                                    object5 = Reflection.getOrCreateKotlinClass((Class)object4);
                                    try {
                                        object4 = Reflection.typeOf((Class)object4);
                                    }
                                    catch (Throwable throwable) {
                                        bl3 = false;
                                        object4 = null;
                                    }
                                    object8 = new at3_0((yn1_2)object5, (kn1_1)object4);
                                    ((db1_2)((Object)iterator)).a((at3_0)object8);
                                }
                            }
                            object5 = da1_22.k;
                            object4 = ch3_0.b;
                            ((rb0_2)object5).a((eb0_2)object4, iterator);
                            Object object9 = ((db1_2)((Object)iterator)).a.b();
                            Object object10 = ((db1_2)((Object)iterator)).b;
                            object4 = ((db1_2)((Object)iterator)).c.i();
                            object8 = ((db1_2)((Object)iterator)).d;
                            boolean bl4 = object8 instanceof bg2_2;
                            Object object11 = bl4 ? (object8 = (bg2_2)object8) : null;
                            if (object11 == null) break block20;
                            Object object12 = ((db1_2)((Object)iterator)).e;
                            iterator = ((db1_2)((Object)iterator)).f;
                            object8 = object5;
                            i i3 = object12;
                            object12 = object4;
                            object5 = new eb1_2((fx3_0)object9, (pa1_0)object10, (q41_0)object4, (bg2_2)object11, i3, (e40_0)((Object)iterator));
                            object8 = xa1_1.b;
                            object9 = da1_22.l;
                            ((e40_0)((Object)iterator)).d((xq_2)object8, object9);
                            iterator = ((ye3_2)object4).d();
                            object4 = new ArrayList();
                            iterator = iterator.iterator();
                            while (bl2 = iterator.hasNext()) {
                                object9 = object8 = iterator.next();
                                object10 = ja1_1.a;
                                object9 = (String)object8;
                                boolean bl5 = object10.contains(object9);
                                if (!bl5) continue;
                                ((ArrayList)object4).add(object8);
                            }
                            int n8 = ((ArrayList)object4).isEmpty() ^ n3;
                            if (n8 != 0) break block21;
                            iterator = ((eb1_2)object5).g.iterator();
                            do {
                                bl3 = iterator.hasNext();
                                object8 = qa1_22.e;
                                if (!bl3) break block14;
                                object4 = (ua1_0)iterator.next();
                            } while (bl2 = (object8 = object8.k0()).contains(object4));
                            object3 = new StringBuilder("Engine doesn't support ");
                            ((StringBuilder)object3).append(object4);
                            object3 = ((StringBuilder)object3).toString();
                            object3 = object3.toString();
                            object2 = new IllegalArgumentException((String)object3);
                            throw object2;
                        }
                        qa1_22.b = object2;
                        qa1_22.c = object5;
                        qa1_22.a = n3;
                        object6 = ma1$a.a((ma1_1)object8, (eb1_2)object5, qa1_22);
                        if (object6 == object3) {
                            return object3;
                        }
                        Object object13 = object5;
                        object5 = object2;
                        object2 = object13;
                    }
                    object6 = (lb1_1)object6;
                    Intrinsics.checkNotNullParameter(da1_22, "client");
                    Intrinsics.checkNotNullParameter(object2, "requestData");
                    Intrinsics.checkNotNullParameter(object6, "responseData");
                    iterator = new Iterator<Object>(da1_22);
                    object4 = new zl0_2((ea1_2)((Object)iterator), (eb1_2)object2);
                    Intrinsics.checkNotNullParameter(object4, (String)object7);
                    ((ea1_2)((Object)iterator)).b = object4;
                    object2 = new am0_2((ea1_2)((Object)iterator), (lb1_1)object6);
                    Intrinsics.checkNotNullParameter(object2, (String)object7);
                    ((ea1_2)((Object)iterator)).c = object2;
                    object2 = ((ea1_2)((Object)iterator)).getAttributes();
                    object7 = ea1_2.e;
                    object2.b((xq_2)object7);
                    object2 = ((lb1_1)object6).e;
                    n3 = object2 instanceof uf_1;
                    if (n3 == 0) {
                        object6 = ((ea1_2)((Object)iterator)).getAttributes();
                        object6.d((xq_2)object7, object2);
                    }
                    object2 = ((ea1_2)((Object)iterator)).d();
                    object6 = ch3_0.c;
                    da1_22.k.a((eb0_2)object6, object2);
                    object6 = mm0.e(object2.getCoroutineContext());
                    object7 = new pa1_1(da1_22, (jb1_2)object2);
                    object6.G((Function1)object7);
                    qa1_22.b = null;
                    qa1_22.c = null;
                    qa1_22.a = n4;
                    object2 = ((is2_2)object5).d(qa1_22, iterator);
                    if (object2 == object3) {
                        return object3;
                    }
                }
                return Unit.a;
            }
            object2 = object4.toString();
            Intrinsics.checkNotNullParameter(object2, "header");
            StringBuilder stringBuilder = new StringBuilder("Header(s) ");
            stringBuilder.append((String)object2);
            stringBuilder.append(" are controlled by the engine and cannot be set explicitly");
            object2 = stringBuilder.toString();
            object3 = new IllegalArgumentException((String)object2);
            throw object3;
        }
        object2 = new StringBuilder("No request transformation found: ");
        Object object14 = ((db1_2)((Object)iterator)).d;
        ((StringBuilder)object2).append(object14);
        object2 = ((StringBuilder)object2).toString().toString();
        object3 = new IllegalStateException((String)object2);
        throw object3;
    }
}


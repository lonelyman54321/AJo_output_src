/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Xp1$i
extends Lambda
implements Function0 {
    public final /* synthetic */ xp1_0 c;
    public final /* synthetic */ Ref$ObjectRef d;

    public Xp1$i(xp1_0 xp1_02, Ref$ObjectRef ref$ObjectRef) {
        this.c = xp1_02;
        this.d = ref$ObjectRef;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c.y;
        LP1$c lP1$c = ((T32)object).e;
        int n3 = lP1$c.d & 8;
        if (n3 != 0) {
            object = ((T32)object).d;
            while (object != null) {
                n3 = ((LP1$c)object).c & 8;
                if (n3 != 0) {
                    n3 = 0;
                    lP1$c = null;
                    Object object2 = object;
                    WR1 wR1 = null;
                    while (object2 != null) {
                        Object object3;
                        Ref$ObjectRef ref$ObjectRef;
                        int n4 = object2 instanceof dy2_0;
                        int n7 = 1;
                        if (n4 != 0) {
                            object2 = (dy2_0)object2;
                            n4 = object2.N();
                            ref$ObjectRef = this.d;
                            if (n4 != 0) {
                                ref$ObjectRef.element = object3 = new zy2_0();
                                ((zy2_0)object3).c = n7;
                            }
                            if ((n4 = (int)(object2.c1() ? 1 : 0)) != 0) {
                                object3 = (zy2_0)ref$ObjectRef.element;
                                ((zy2_0)object3).b = n7;
                            }
                            object3 = (zy2_0)ref$ObjectRef.element;
                            object2.i0((UY2)object3);
                        } else {
                            n4 = ((LP1$c)object2).c & 8;
                            if (n4 != 0 && (n4 = object2 instanceof mo0_0) != 0) {
                                object3 = object2;
                                object3 = ((mo0_0)object2).o;
                                int n8 = 0;
                                ref$ObjectRef = null;
                                while (object3 != null) {
                                    int n10 = ((LP1$c)object3).c & 8;
                                    if (n10 != 0) {
                                        if (++n8 == n7) {
                                            object2 = object3;
                                        } else {
                                            if (wR1 == null) {
                                                n10 = 16;
                                                Object[] objectArray = new LP1$c[n10];
                                                wR1 = new WR1(objectArray);
                                            }
                                            if (object2 != null) {
                                                wR1.b(object2);
                                                object2 = null;
                                            }
                                            wR1.b(object3);
                                        }
                                    }
                                    object3 = ((LP1$c)object3).f;
                                }
                                if (n8 == n7) continue;
                            }
                        }
                        object2 = go0.b(wR1);
                    }
                }
                object = ((LP1$c)object).e;
            }
        }
        return Unit.a;
    }
}


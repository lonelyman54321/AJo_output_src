/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Bx {
    public static final Object a(FocusTargetNode object, int n3, Function1 function1) {
        Object object2 = ((LP1$c)object).a;
        int n4 = ((LP1$c)object2).m;
        if (n4 != 0) {
            int n7;
            Object object3;
            Object object4;
            int n8;
            Object object5;
            block30: {
                int n10;
                object2 = ((LP1$c)object2).e;
                object5 = go0.f((fo0)object);
                while (true) {
                    n8 = 1;
                    object4 = null;
                    if (object5 == null) break;
                    object3 = ((xp1_0)object5).y.e;
                    n10 = ((LP1$c)object3).d & 0x400;
                    if (n10 != 0) {
                        while (object2 != null) {
                            n10 = ((LP1$c)object2).c & 0x400;
                            if (n10 != 0) {
                                object3 = object2;
                                WR1 wR1 = null;
                                while (object3 != null) {
                                    int n14 = object3 instanceof FocusTargetNode;
                                    if (n14 == 0) {
                                        n14 = ((LP1$c)object3).c & 0x400;
                                        if (n14 != 0 && (n14 = object3 instanceof mo0_0) != 0) {
                                            Object object6 = object3;
                                            object6 = ((mo0_0)object3).o;
                                            int n15 = 0;
                                            while (object6 != null) {
                                                int n16 = ((LP1$c)object6).c & 0x400;
                                                if (n16 != 0) {
                                                    if (++n15 == n8) {
                                                        object3 = object6;
                                                    } else {
                                                        if (wR1 == null) {
                                                            n16 = 16;
                                                            Object[] objectArray = new LP1$c[n16];
                                                            wR1 = new WR1(objectArray);
                                                        }
                                                        if (object3 != null) {
                                                            wR1.b(object3);
                                                            n10 = 0;
                                                            object3 = null;
                                                        }
                                                        wR1.b(object6);
                                                    }
                                                }
                                                object6 = ((LP1$c)object6).f;
                                            }
                                            if (n15 == n8) continue;
                                        }
                                        object3 = go0.b(wR1);
                                        continue;
                                    }
                                    break block30;
                                }
                            }
                            object2 = ((LP1$c)object2).e;
                        }
                    }
                    if ((object5 = ((xp1_0)object5).A()) != null && (object2 = ((xp1_0)object5).y) != null) {
                        object2 = ((T32)object2).d;
                        continue;
                    }
                    n7 = 0;
                    object2 = null;
                }
                n10 = 0;
                object3 = null;
            }
            if ((object3 = (FocusTargetNode)object3) != null) {
                object2 = Ax.a;
                object5 = (zx)((FocusTargetNode)object3).U((OP1)object2);
                n7 = Intrinsics.areEqual(object5, object2 = (zx)((FocusTargetNode)object).U((OP1)object2)) ? 1 : 0;
                if (n7 != 0) {
                    return null;
                }
            }
            if ((object = (zx)((FocusTargetNode)object).U((OP1)(object2 = Ax.a))) != null) {
                n7 = 5;
                n4 = LT0.a(n3, n7);
                if (n4 != 0) {
                    n8 = 5;
                } else {
                    n7 = 6;
                    n4 = LT0.a(n3, n7);
                    if (n4 != 0) {
                        n8 = 6;
                    } else {
                        n7 = 3;
                        n4 = LT0.a(n3, n7);
                        if (n4 != 0) {
                            n8 = 3;
                        } else {
                            n7 = 4;
                            n4 = LT0.a(n3, n7);
                            if (n4 != 0) {
                                n8 = 4;
                            } else {
                                n7 = LT0.a(n3, n8) ? 1 : 0;
                                n4 = 2;
                                if (n7 != 0) {
                                    n8 = 2;
                                } else if ((n3 = (int)(LT0.a(n3, n4) ? 1 : 0)) == 0) {
                                    String string2 = "Unsupported direction for beyond bounds layout".toString();
                                    object = new IllegalStateException(string2);
                                    throw object;
                                }
                            }
                        }
                    }
                }
                object4 = object.b(n8, function1);
            }
            return object4;
        }
        String string3 = "visitAncestors called on an unattached node".toString();
        object = new IllegalStateException(string3);
        throw object;
    }
}


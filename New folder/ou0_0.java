/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from oU0
 */
public final class ou0_0 {
    public static final ou0_0 b;
    public static final ou0_0 c;
    public final WR1 a;

    static {
        ou0_0 ou0_02;
        b = ou0_02 = new ou0_0();
        c = ou0_02 = new ou0_0();
    }

    public ou0_0() {
        WR1 wR1;
        Object[] objectArray = new qu0_1[16];
        this.a = wR1 = new WR1(objectArray);
    }

    public final boolean a(Function1 object) {
        String string2;
        Object object2;
        block26: {
            block27: {
                block28: {
                    boolean bl2;
                    block29: {
                        object2 = b;
                        string2 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n";
                        if (this == object2) break block26;
                        object2 = c;
                        if (this == object2) break block27;
                        object2 = this.a;
                        int n3 = object2.l();
                        if (n3 == 0) break block28;
                        n3 = object2.c;
                        bl2 = false;
                        if (n3 > 0) {
                            block25: {
                                object2 = object2.a;
                                int n4 = 0;
                                boolean bl3 = false;
                                block0: do {
                                    int n7;
                                    Object object3 = (qu0_1)object2[n4];
                                    Object object4 = object3.e();
                                    boolean bl4 = ((LP1$c)object4).m;
                                    if (!bl4) break block25;
                                    int n8 = 16;
                                    Object object5 = new LP1$c[n8];
                                    object4 = new WR1((Object[])object5);
                                    object5 = object3.e().f;
                                    if (object5 == null) {
                                        object3 = object3.e();
                                        go0.a((WR1)object4, (LP1$c)object3);
                                    } else {
                                        ((WR1)object4).b(object5);
                                    }
                                    block1: while ((n7 = ((WR1)object4).l()) != 0) {
                                        n7 = ((WR1)object4).c;
                                        int n10 = 1;
                                        object3 = (LP1$c)((WR1)object4).n(n7 -= n10);
                                        int n14 = ((LP1$c)object3).d & 0x400;
                                        if (n14 == 0) {
                                            go0.a((WR1)object4, (LP1$c)object3);
                                            continue;
                                        }
                                        while (object3 != null) {
                                            n14 = ((LP1$c)object3).c & 0x400;
                                            if (n14 != 0) {
                                                n14 = 0;
                                                WR1 wR1 = null;
                                                while (object3 != null) {
                                                    Object object6;
                                                    int n15 = object3 instanceof FocusTargetNode;
                                                    if (n15 != 0) {
                                                        object3 = (FocusTargetNode)object3;
                                                        object6 = ((FocusTargetNode)object3).r1();
                                                        n15 = (int)(((ju0_0)object6).a ? 1 : 0);
                                                        if (n15 != 0) {
                                                            object3 = (Boolean)object.invoke(object3);
                                                            n7 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                                                        } else {
                                                            n15 = 7;
                                                            n7 = (int)(Ts3.e((FocusTargetNode)object3, n15, (Function1)object) ? 1 : 0);
                                                        }
                                                        if (n7 != 0) {
                                                            bl3 = true;
                                                            continue block0;
                                                        }
                                                    } else {
                                                        n15 = ((LP1$c)object3).c & 0x400;
                                                        if (n15 != 0) {
                                                            n15 = 1;
                                                        } else {
                                                            n15 = 0;
                                                            object6 = null;
                                                        }
                                                        if (n15 != 0 && (n15 = object3 instanceof mo0_0) != 0) {
                                                            object6 = object3;
                                                            object6 = ((mo0_0)object3).o;
                                                            int n16 = 0;
                                                            while (object6 != null) {
                                                                Object[] objectArray;
                                                                int n17 = ((LP1$c)object6).c & 0x400;
                                                                if (n17 != 0) {
                                                                    n17 = 1;
                                                                } else {
                                                                    n17 = 0;
                                                                    objectArray = null;
                                                                }
                                                                if (n17 != 0) {
                                                                    if (++n16 == n10) {
                                                                        object3 = object6;
                                                                    } else {
                                                                        if (wR1 == null) {
                                                                            objectArray = new LP1$c[n8];
                                                                            wR1 = new WR1(objectArray);
                                                                        }
                                                                        if (object3 != null) {
                                                                            wR1.b(object3);
                                                                            n7 = 0;
                                                                            object3 = null;
                                                                        }
                                                                        wR1.b(object6);
                                                                    }
                                                                }
                                                                object6 = ((LP1$c)object6).f;
                                                            }
                                                            if (n16 == n10) continue;
                                                        }
                                                    }
                                                    object3 = go0.b(wR1);
                                                }
                                                continue block1;
                                            }
                                            object3 = ((LP1$c)object3).f;
                                        }
                                    }
                                } while (++n4 < n3);
                                bl2 = bl3;
                                break block29;
                            }
                            object2 = "visitChildren called on an unattached node".toString();
                            object = new IllegalStateException((String)object2);
                            throw object;
                        }
                    }
                    return bl2;
                }
                object2 = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object2 = string2.toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = string2.toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final void b() {
        nu0_1 nu0_12 = nu0_1.c;
        this.a(nu0_12);
    }
}


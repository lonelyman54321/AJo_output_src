/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Arrays;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class BU0
implements Comparator {
    public static final BU0 a;

    static {
        BU0 bU0;
        a = bU0 = new Object();
    }

    public final int compare(Object object, Object object2) {
        int n3;
        block15: {
            object = (FocusTargetNode)object;
            object2 = (FocusTargetNode)object2;
            int n4 = AU0.d((FocusTargetNode)object);
            n3 = 0;
            int n7 = 1;
            if (n4 != 0 && (n4 = AU0.d((FocusTargetNode)object2)) != 0) {
                n4 = Intrinsics.areEqual(object = go0.f((fo0)object), object2 = go0.f((fo0)object2));
                if (n4 == 0) {
                    int n8;
                    int n10;
                    String string2;
                    n4 = 16;
                    Object[] objectArray = new xp1_0[n4];
                    int n14 = 0;
                    while (true) {
                        string2 = "copyOf(this, newSize)";
                        if (object == null) break;
                        n10 = objectArray.length;
                        n8 = n14 + 1;
                        if (n10 < n8) {
                            n10 = objectArray.length * 2;
                            n8 = Math.max(n8, n10);
                            objectArray = Arrays.copyOf(objectArray, n8);
                            Intrinsics.checkNotNullExpressionValue(objectArray, string2);
                        }
                        if (n14 != 0) {
                            string2 = null;
                            int n15 = 0 + n7;
                            rp_1.i(objectArray, n15, objectArray, 0, n14);
                        }
                        objectArray[0] = object;
                        ++n14;
                        object = ((xp1_0)object).A();
                    }
                    object = new xp1_0[n4];
                    n4 = 0;
                    Object object3 = null;
                    while (object2 != null) {
                        n10 = ((xp1_0[])object).length;
                        n8 = n4 + 1;
                        if (n10 < n8) {
                            n10 = ((xp1_0[])object).length * 2;
                            n8 = Math.max(n8, n10);
                            object = Arrays.copyOf(object, n8);
                            Intrinsics.checkNotNullExpressionValue(object, string2);
                        }
                        if (n4 != 0) {
                            n8 = 0 + n7;
                            rp_1.i((Object[])object, n8, (Object[])object, 0, n4);
                        }
                        object[0] = object2;
                        ++n4;
                        object2 = ((xp1_0)object2).A();
                    }
                    int n16 = Math.min(n14 -= n7, n4 -= n7);
                    if (n16 >= 0) {
                        while (true) {
                            xp1_0 xp1_02;
                            if ((n4 = (int)(Intrinsics.areEqual(object3 = objectArray[n3], xp1_02 = object[n3]) ? 1 : 0)) == 0) {
                                object2 = (xp1_0)objectArray[n3];
                                n16 = ((xp1_0)object2).B();
                                object = (xp1_0)object[n3];
                                int n17 = ((xp1_0)object).B();
                                n3 = Intrinsics.compare(n16, n17);
                                break block15;
                            }
                            if (n3 == n16) break;
                            ++n3;
                        }
                    }
                    object2 = "Could not find a common ancestor between the two FocusModifiers.".toString();
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
            } else {
                boolean bl2 = AU0.d((FocusTargetNode)object);
                if (bl2) {
                    n3 = -1;
                } else {
                    bl2 = AU0.d((FocusTargetNode)object2);
                    if (bl2) {
                        n3 = 1;
                    }
                }
            }
        }
        return n3;
    }
}


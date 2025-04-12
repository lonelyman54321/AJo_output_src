/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class w6
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w6(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (Function0)object;
                Intrinsics.checkNotNullParameter(object, "$block");
                object.invoke();
                return;
            }
            case 1: {
                object = (Bl3)object;
                n4 = 0;
                ((Bl3)object).n = null;
                Serializable serializable = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Object object2 = ((Bl3)object).m;
                int n7 = ((WR1)object2).c;
                if (n7 > 0) {
                    Object[] objectArray = ((WR1)object2).a;
                    int n8 = 0;
                    do {
                        Object object3;
                        int n10;
                        Object object4;
                        int n14;
                        if ((n14 = (object4 = Bl3$b.$EnumSwitchMapping$0)[n10 = (object3 = (Bl3$a)((Object)objectArray[n8])).ordinal()]) != n3) {
                            n10 = 2;
                            if (n14 != n10) {
                                boolean bl2;
                                Boolean bl3;
                                n10 = 3;
                                if (n14 != n10 && n14 != (n10 = 4) || (n14 = (int)(Intrinsics.areEqual(object4 = (Object)serializable.element, bl3 = Boolean.FALSE) ? 1 : 0)) != 0) continue;
                                object4 = (Object)Bl3$a.ShowKeyboard;
                                if (object3 == object4) {
                                    bl2 = true;
                                } else {
                                    bl2 = false;
                                    object3 = null;
                                }
                                object3 = bl2;
                                ref$ObjectRef.element = object3;
                                continue;
                            }
                            object3 = Boolean.FALSE;
                            serializable.element = object3;
                            ref$ObjectRef.element = object3;
                            continue;
                        }
                        object3 = Boolean.TRUE;
                        serializable.element = object3;
                        ref$ObjectRef.element = object3;
                    } while ((n8 += n3) < n7);
                }
                ((WR1)object2).g();
                Object object5 = serializable.element;
                object2 = Boolean.TRUE;
                n3 = Intrinsics.areEqual(object5, object2);
                object = ((Bl3)object).b;
                if (n3 != 0) {
                    object.c();
                }
                if ((object5 = (Boolean)ref$ObjectRef.element) != null) {
                    n3 = (int)(((Boolean)object5).booleanValue() ? 1 : 0);
                    if (n3 != 0) {
                        object.e();
                    } else {
                        object.f();
                    }
                }
                if ((n3 = (int)(Intrinsics.areEqual(object5 = serializable.element, serializable = Boolean.FALSE) ? 1 : 0)) != 0) {
                    object.c();
                }
                return;
            }
            case 0: 
        }
        object = (ConstraintLayout)((Object)object);
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}


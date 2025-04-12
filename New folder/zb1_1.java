/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.holders.PDPFooterHolder$setTimer$task$1;
import in.juspay.services.HyperServices;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zb1
 */
public final class zb1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = PDPFooterHolder$setTimer$task$1.b;
                Object object2 = "this$0";
                object = (si2_1)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                n3 = ((si2_1)object).j;
                Object object3 = null;
                String string2 = "addToBag";
                int n4 = 1;
                if (n3 != n4) {
                    int n7 = 2;
                    if (n3 != n7) {
                        n7 = 3;
                        if (n3 == n7) {
                            object2 = ((si2_1)object).f;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                            } else {
                                object3 = object2;
                            }
                            object2 = "Adding...";
                            object3.setText((CharSequence)object2);
                            ((si2_1)object).j = n4;
                        }
                    } else {
                        object2 = ((si2_1)object).f;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                        } else {
                            object3 = object2;
                        }
                        object2 = "Adding..";
                        object3.setText((CharSequence)object2);
                        ((si2_1)object).j = n3 = ((si2_1)object).j + n4;
                    }
                } else {
                    object2 = ((si2_1)object).f;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object2;
                    }
                    object2 = "Adding.";
                    object3.setText((CharSequence)object2);
                    ((si2_1)object).j = n3 = ((si2_1)object).j + n4;
                }
                return;
            }
            case 0: 
        }
        HyperServices.e((HyperServices)object);
    }
}


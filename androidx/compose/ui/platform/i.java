/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.R$id;
import androidx.compose.ui.platform.f;
import androidx.compose.ui.platform.g;
import androidx.compose.ui.platform.h;
import androidx.compose.ui.platform.j;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

public final class i
extends Lambda
implements Function2 {
    public final /* synthetic */ j c;
    public final /* synthetic */ Function2 d;

    public i(j j3, Function2 function2) {
        this.c = j3;
        this.d = function2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            int n7;
            object2 = this.c;
            Object object3 = ((j)object2).a;
            int n8 = R$id.inspection_slot_table_set;
            object3 = object3.getTag(n8);
            n8 = (int)(TypeIntrinsics.isMutableSet(object3) ? 1 : 0);
            Function2 function2 = null;
            if (n8 != 0) {
                object3 = (Set)object3;
            } else {
                n3 = 0;
                object3 = null;
            }
            Object object4 = ((j)object2).a;
            if (object3 == null) {
                object3 = object4.getParent();
                n7 = object3 instanceof View;
                if (n7 != 0) {
                    object3 = (View)object3;
                } else {
                    n3 = 0;
                    object3 = null;
                }
                if (object3 != null) {
                    n7 = R$id.inspection_slot_table_set;
                    object3 = object3.getTag(n7);
                } else {
                    n3 = 0;
                    object3 = null;
                }
                n7 = (int)(TypeIntrinsics.isMutableSet(object3) ? 1 : 0);
                if (n7 != 0) {
                    object3 = (Set)object3;
                } else {
                    n3 = 0;
                    object3 = null;
                }
            }
            if (object3 != null) {
                l73 l732 = object.w();
                object3.add(l732);
                object.r();
            }
            n7 = object.x(object2);
            Object object5 = object.v();
            b30$a$a b30$a$a = b30$a.a;
            if (n7 != 0 || object5 == b30$a$a) {
                object5 = new f((j)object2, null);
                object.o(object5);
            }
            object5 = (Function2)object5;
            ly0_0.d((b30_0)object, object4, (Function2)object5);
            n7 = (int)(object.x(object2) ? 1 : 0);
            object5 = object.v();
            if (n7 != 0 || object5 == b30$a$a) {
                object5 = new g((j)object2, null);
                object.o(object5);
            }
            object5 = (Function2)object5;
            ly0_0.d((b30_0)object, object4, (Function2)object5);
            object3 = li1_0.a.c(object3);
            function2 = this.d;
            object4 = new h((j)object2, function2);
            n4 = -1193460702;
            object2 = v10.c(n4, (fx0_2)object4, (b30_0)object);
            n8 = 56;
            L30.a((MB2)object3, (Function2)object2, (b30_0)object, n8);
        }
        return Unit.a;
    }
}


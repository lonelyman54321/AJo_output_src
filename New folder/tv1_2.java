/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TV1
 */
public final class tv1_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tv1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                List list = (List)this.b;
                int n4 = list.isEmpty();
                if (n4 != 0) {
                    list = mz0_2.a;
                } else {
                    CharSequence charSequence = (CharSequence)CollectionsKt.L(list);
                    n4 = charSequence.length();
                    int n7 = 1;
                    if (n4 == 0 && (n4 = list.size()) > n7) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        charSequence = null;
                    }
                    CharSequence charSequence2 = (CharSequence)CollectionsKt.S(list);
                    int n8 = charSequence2.length();
                    if (n8 == 0) {
                        n7 = xx_2.h(list);
                    } else {
                        n8 = xx_2.h(list);
                        n7 += n8;
                    }
                    list = list.subList(n4, n7);
                }
                return list;
            }
            case 0: 
        }
        yv1_1 yv1_12 = (yv1_1)this.b;
        Intrinsics.checkNotNullParameter(yv1_12, "this$0");
        yv1_12 = yv1_12.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(yv1_12, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)yv1_12);
        return jo_22;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.EddResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class M8
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ M8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                object3 = (e12_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = ((DataCallback)object).getData();
                if (object2 != null) {
                    object = ((DataCallback)object).getData();
                    Intrinsics.checkNotNull(object);
                    Object object4 = object;
                    object4 = (EddResult)object;
                    ((e12_0)object3).c((EddResult)object4);
                    object = ((e12_0)object3).P0;
                    int n4 = 12;
                    object2 = new DataCallback(0, object4, null, null, n4, null);
                    ((LiveData)object).k(object2);
                } else {
                    object2 = ((e12_0)object3).P0;
                    ((LiveData)object2).k(object);
                }
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object3 = (hq_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                ((hq_2)object3).b.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (Boolean)object;
        object3 = (q9_0)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = Boolean.TRUE;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2 && (object = ((q9_0)object3).R) != null) {
            int n7 = ((q9_0)object3).C1;
            object2 = ((TabLayout)((Object)object)).getTabAt(n7);
            ((TabLayout)((Object)object)).selectTab((TabLayout$Tab)object2);
        }
        return Unit.a;
    }
}


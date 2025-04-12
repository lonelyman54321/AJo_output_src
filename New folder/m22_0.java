/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.common.j;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$setTimer$task$1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from m22
 */
public final class m22_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m22_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = j.g;
                object = (j)((Object)object);
                Intrinsics.checkNotNullParameter(object, string2);
                boolean bl2 = ((j)((Object)object)).a();
                if (bl2 && (object = ((j)((Object)object)).f) != null) {
                    object.a();
                }
                return;
            }
            case 0: 
        }
        n3 = NewProductDetailsFragment$setTimer$task$1.b;
        object = (NewProductDetailsFragment)object;
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = ((NewProductDetailsFragment)object).C0;
        n3 = 1;
        if (n4 != n3) {
            int n7 = 2;
            if (n4 != n7) {
                n7 = 3;
                if (n4 == n7) {
                    string2 = ((NewProductDetailsFragment)object).D0;
                    Intrinsics.checkNotNull(string2);
                    String string3 = "Adding...";
                    string2.setText((CharSequence)string3);
                    ((NewProductDetailsFragment)object).C0 = n3;
                }
            } else {
                string2 = ((NewProductDetailsFragment)object).D0;
                Intrinsics.checkNotNull(string2);
                String string4 = "Adding..";
                string2.setText((CharSequence)string4);
                ((NewProductDetailsFragment)object).C0 = n4 = ((NewProductDetailsFragment)object).C0 + n3;
            }
        } else {
            string2 = ((NewProductDetailsFragment)object).D0;
            Intrinsics.checkNotNull(string2);
            String string5 = "Adding.";
            string2.setText((CharSequence)string5);
            ((NewProductDetailsFragment)object).C0 = n4 = ((NewProductDetailsFragment)object).C0 + n3;
        }
    }
}


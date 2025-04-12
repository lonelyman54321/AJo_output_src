/*
 * Decompiled with CFR 0.152.
 */
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.payment.fragment.i$b;
import com.ril.ajio.payment.fragment.i$b$a;
import com.ril.ajio.payment.fragment.i$b$b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yr2
 */
public final class yr2_0
implements Function1 {
    public final /* synthetic */ h a;

    public /* synthetic */ yr2_0(h h3) {
        this.a = h3;
    }

    public final Object invoke(Object object) {
        block8: {
            block7: {
                h h3;
                block6: {
                    int n3;
                    object = (i$b)object;
                    h3 = this.a;
                    Intrinsics.checkNotNullParameter(h3, "this$0");
                    Intrinsics.checkNotNullParameter(object, "it");
                    Object object2 = h3.getActivity();
                    if (object2 != null && (n3 = (object2 = h3.requireActivity()).isFinishing()) == 0) {
                        object2 = h3.getChildFragmentManager();
                        n3 = ((FragmentManager)object2).J();
                        if (n3 > 0) {
                            object2 = h3.getChildFragmentManager();
                            ((FragmentManager)object2).W();
                        } else {
                            object2 = h3.requireActivity();
                            ((ComponentActivity)object2).onBackPressed();
                        }
                    }
                    if ((n3 = object instanceof i$b$b) == 0) break block6;
                    boolean bl2 = false;
                    object = null;
                    h3.Ta(false);
                    break block7;
                }
                boolean bl3 = object instanceof i$b$a;
                if (!bl3) break block8;
                bl3 = true;
                h3.Ta(bl3);
            }
            return Unit.a;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}


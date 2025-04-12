/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iQ0
 */
public final class iq0_2
implements Function2 {
    public final /* synthetic */ fq0_2 a;

    public iq0_2(fq0_2 fq0_22) {
        this.a = fq0_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        hq0_2 hq0_22;
        boolean bl2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n3;
        Object object7 = object;
        object7 = (b30_0)object;
        Object object8 = object2;
        object8 = (Number)object2;
        int n4 = ((Number)object8).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object7.h() ? 1 : 0)) != 0) {
            object7.D();
            return Unit.a;
        }
        Object object9 = this.a;
        object8 = ((fq0_2)object9).q;
        Object object10 = "fleekViewModel";
        int n7 = 0;
        if (object8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
            object6 = null;
        } else {
            object6 = object8;
        }
        f23_0 f23_02 = ((fq0_2)object9).Qa();
        object8 = ((fq0_2)object9).p;
        Object object11 = object8 != null ? (object8 = ((Fragment)object8).getChildFragmentManager()) : null;
        object8 = ((fq0_2)object9).n;
        if (object8 == null) {
            object8 = "bottomNavHostController";
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            object5 = null;
        } else {
            object5 = object8;
        }
        object8 = ((fq0_2)object9).o;
        if (object8 == null) {
            object8 = "fleekAppNavHostController";
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            object4 = null;
        } else {
            object4 = object8;
        }
        object8 = ((fq0_2)object9).q;
        if (object8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
            n4 = 0;
            object8 = null;
        }
        if ((object3 = ((fq0_2)object9).q) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
            bl2 = false;
            object3 = null;
        }
        object10 = ((dr0_0)object3).M;
        bl2 = ((fq0_2)object9).r;
        object8.getClass();
        object8 = "home";
        if (!bl2 && (n3 = (int)(TextUtils.isEmpty((CharSequence)object10) ? 1 : 0)) != 0) {
            object8 = "splash-screen";
        }
        Object object12 = object8;
        Object object13 = "getCommitFunction(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lkotlin/jvm/functions/Function2;";
        Object object14 = fq0_2.class;
        Object object15 = "getCommitFunction";
        object8 = hq0_22;
        object3 = object9;
        hq0_22 = new FunctionReferenceImpl(2, object9, (Class)object14, (String)object15, (String)object13, 0);
        object8 = ((Fragment)object9).getActivity();
        n3 = object8 instanceof AjioHomeActivity;
        if (n3 != 0) {
            object8 = (AjioHomeActivity)object8;
        } else {
            n4 = 0;
            object8 = null;
        }
        n3 = -352568849;
        object7.K(n3);
        if (object8 == null) {
            boolean bl3 = false;
            object9 = null;
        } else {
            object10 = AjioHomeActivity.Companion;
            n3 = 516497495;
            object7.K(n3);
            object10 = new pe1$a_0((Context)object8);
            object3 = h40_0.a;
            ((pe1$a_0)object10).c = object3 = h40_0.E0("splash_animation_url");
            ((pe1$a_0)object10).b();
            object3 = B63.c;
            ((pe1$a_0)object10).d((B63)object3);
            object10 = ((pe1$a_0)object10).a();
            object3 = UW.a((Context)object8);
            object15 = null;
            object13 = null;
            int n8 = 124;
            object8 = object10;
            object10 = object3;
            bl2 = false;
            object3 = null;
            object14 = null;
            object8 = uq_0.a(object8, (ce1_0)object10, null, null, null, 0, (b30_0)object7, n8);
            object7.E();
            object9 = object8;
        }
        object7.E();
        object8 = dr0_0.Companion;
        n7 = 37448;
        object8 = object6;
        object10 = f23_02;
        object3 = object11;
        object14 = object5;
        object15 = object4;
        object13 = object12;
        uo0_0.c((dr0_0)object6, f23_02, (FragmentManager)object11, (yT1)object5, (yT1)object4, (String)object12, hq0_22, (pq_0)object9, (b30_0)object7, n7);
        return Unit.a;
    }
}


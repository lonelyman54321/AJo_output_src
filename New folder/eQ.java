/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class eQ
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eQ(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        boolean bl2;
        Object object2;
        Object object3;
        block10: {
            block11: {
                int n3 = this.a;
                switch (n3) {
                    default: {
                        Object object4 = (OC2)this.b;
                        Intrinsics.checkNotNullParameter(object4, "this$0");
                        object = ((OC2)object4).b;
                        String string2 = ((OC2)object4).a;
                        object4 = ((OC2)object4).c;
                        object.y9(string2, (String)object4);
                        return;
                    }
                    case 0: 
                }
                object = (iq_0)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object3 = ((iq_0)object).Pa();
                if (object3 == null) break block10;
                object3 = ((iq_0)object).Pa();
                Intrinsics.checkNotNull(object3);
                object3 = ((F12)object3).d.N;
                object2 = ((iq_0)object).Pa();
                Intrinsics.checkNotNull(object2);
                object2 = ((F12)object2).d.M;
                bl2 = Intrinsics.areEqual(object3, object2);
                if (!bl2) break block11;
                object3 = ((iq_0)object).Pa();
                Intrinsics.checkNotNull(object3);
                object3 = ((F12)object3).d.R;
                Intrinsics.checkNotNull(object3);
                bl2 = ((HashMap)object3).isEmpty() ^ true;
                if (bl2) break block11;
                object3 = ((iq_0)object).Pa();
                Intrinsics.checkNotNull(object3);
                object3 = ((F12)object3).d.S;
                Intrinsics.checkNotNull(object3);
                bl2 = ((HashMap)object3).isEmpty() ^ true;
                if (!bl2) break block10;
            }
            object2 = ((iq_0)object).Pa();
            Intrinsics.checkNotNull(object2);
            object3 = ((iq_0)object).Pa();
            Intrinsics.checkNotNull(object3);
            ProductsList productsList = ((F12)object3).d.N;
            Intrinsics.checkNotNull(productsList);
            Boolean bl3 = Boolean.TRUE;
            boolean bl4 = true;
            int n4 = 24;
            F12.j((F12)object2, productsList, bl4, bl3, null, null, n4);
            object3 = ((iq_0)object).Pa();
            Intrinsics.checkNotNull(object3);
            ((F12)object3).o();
        }
        if ((object3 = ((iq_0)object).Pa()) != null) {
            object3 = ((iq_0)object).Pa();
            Intrinsics.checkNotNull(object3);
            object3 = ((F12)object3).d;
            bl2 = ((bv2_0)object3).e1;
            if (bl2) {
                object3 = ((iq_0)object).Pa();
                Intrinsics.checkNotNull(object3);
                object3 = ((F12)object3).d;
                object2 = null;
                ((bv2_0)object3).e1 = false;
                object3 = ((iq_0)object).h;
                if (object3 != null) {
                    object3.P2();
                }
            }
        }
        if ((object = ((Fragment)object).getParentFragment()) != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
            ((FragmentManager)object).W();
        }
    }
}


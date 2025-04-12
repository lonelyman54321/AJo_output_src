/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.media3.ui.PlayerControlView;
import com.clevertap.android.sdk.gif.GifImageView;
import com.clevertap.android.sdk.inapp.f;
import com.ril.ajio.services.data.Cart.PanCardVerificationRequest;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Bc
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Bc(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int bl2 = this.a;
        switch (bl2) {
            default: {
                object = (PlayerControlView)((Object)this.b);
                boolean bl3 = ((PlayerControlView)((Object)object)).B0 ^ true;
                ((PlayerControlView)((Object)object)).k(bl3);
                return;
            }
            case 2: {
                PanCardVerificationRequest panCardVerificationRequest;
                boolean bl4;
                object = (qh2_2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = ((qh2_2)object).x;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                    bl4 = false;
                    object2 = null;
                }
                object2.startLoader();
                object2 = ((qh2_2)object).v;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("panCardVerificationViewModel");
                    bl4 = false;
                    object2 = null;
                }
                int n3 = 15;
                int n4 = 0;
                Object object3 = null;
                String string2 = null;
                Object object4 = panCardVerificationRequest;
                panCardVerificationRequest = new PanCardVerificationRequest(null, null, null, null, n3, null);
                object4 = ((qh2_2)object).g;
                if (object4 != null && (object4 = ((AppCompatEditText)object4).getText()) != null && (n4 = (object3 = StringsKt.m0((CharSequence)object4)).length()) > 0) {
                    object4 = ((Object)StringsKt.m0((CharSequence)object4)).toString();
                    object3 = ((qh2_2)object).y;
                    if (object3 != null && (object3 = ((gq2_2)object3).a((String)object4)) != null) {
                        object4 = object3;
                    }
                    panCardVerificationRequest.setName((String)object4);
                }
                if ((object4 = ((qh2_2)object).h) != null && (object4 = ((AppCompatEditText)object4).getText()) != null && (n4 = (object3 = StringsKt.m0((CharSequence)object4)).length()) > 0) {
                    object4 = ((Object)StringsKt.m0((CharSequence)object4)).toString();
                    object3 = ((qh2_2)object).y;
                    if (object3 != null && (object3 = ((gq2_2)object3).a((String)object4)) != null) {
                        object4 = object3;
                    }
                    panCardVerificationRequest.setTaxPayerId((String)object4);
                }
                if ((object4 = ((qh2_2)object).j) != null && (object4 = ((AppCompatEditText)object4).getText()) != null && (n4 = (object3 = StringsKt.m0((CharSequence)object4)).length()) > 0) {
                    object4 = object4.toString();
                    string2 = "dd/MM/yyyy";
                    object4 = k7.a((String)object4, "dd MMM yyyy", string2);
                    object3 = ((qh2_2)object).y;
                    if (object3 != null && (object3 = ((gq2_2)object3).a((String)object4)) != null) {
                        object4 = object3;
                    }
                    panCardVerificationRequest.setDateOfBirth((String)object4);
                }
                if ((object = ((qh2_2)object).m) != null) {
                    boolean bl5 = object.isChecked();
                    object = bl5;
                } else {
                    boolean bl6 = false;
                    object = null;
                }
                panCardVerificationRequest.setAcceptedTnC((Boolean)object);
                object2.getClass();
                Intrinsics.checkNotNullParameter(panCardVerificationRequest, "panCardVerificationRequest");
                object = md3_0.c((jD3)object2);
                object4 = new pm2_1((qm2_2)object2, panCardVerificationRequest, null);
                Ae3.d((i90_0)object, null, null, (Function2)object4, 3);
                return;
            }
            case 1: {
                boolean bl7 = false;
                f f5 = (f)this.b;
                f5.Pa(null);
                object = f5.m;
                if (object != null) {
                    ((GifImageView)object).d();
                }
                if ((object = f5.getActivity()) != null) {
                    object.finish();
                }
                return;
            }
            case 0: 
        }
        cc_0 cc_02 = (cc_0)this.b;
        Intrinsics.checkNotNullParameter(cc_02, "this$0");
        cc_02.a.v7();
    }
}


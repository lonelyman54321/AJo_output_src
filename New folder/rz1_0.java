/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$drawable;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rz1
 */
public final class rz1_0
implements F62 {
    public final /* synthetic */ sz1_2 a;

    public /* synthetic */ rz1_0(sz1_2 sz1_22) {
        this.a = sz1_22;
    }

    public final void onChanged(Object object) {
        int n3;
        Object object2 = object;
        object2 = (DataCallback)object;
        sz1_2 sz1_22 = this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(sz1_22, (String)object3);
        sz1_22.U = object2;
        object2 = sz1_22.y;
        if (object2 != null) {
            object2.stopLoader();
        }
        object2 = sz1_22.T;
        object3 = "loginOtpVerifiedText";
        Object object4 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object2 = null;
        }
        int n4 = 8;
        object2.setVisibility(n4);
        object2 = sz1_22.U;
        if (object2 != null && (n3 = ((DataCallback)object2).getStatus()) == 0) {
            object2 = cp_1.Companion;
            n3 = (int)(km_1.b((cp$a)object2) ? 1 : 0);
            String string2 = "loginButtonAccessibleUser";
            if (n3 == 0) {
                sz1_22.Ra();
                object2 = sz1_22.S;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object2 = null;
                }
                object2.setVisibility(n4);
                object2 = sz1_22.T;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object4 = object2;
                }
                object4.setVisibility(n4);
            } else {
                object2 = sz1_22.S;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object2 = null;
                }
                object2.setVisibility(0);
                object2 = sz1_22.T;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    object2 = null;
                }
                object2.setVisibility(0);
                object2 = sz1_22.T;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object4 = object2;
                }
                ai0_2.a((View)object4);
            }
        } else {
            int n7;
            object2 = sz1_22.U;
            if (object2 != null && (n3 = ((DataCallback)object2).getStatus()) == (n7 = 1)) {
                object2 = sz1_22.y;
                if (object2 != null) {
                    object2.stopLoader();
                }
                if ((object2 = sz1_22.U) != null && (object2 = ((DataCallback)object2).getError()) != null) {
                    object2 = ((DataError)object2).getErrors();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    object2 = sz1_22.U;
                    if (object2 != null) {
                        object2 = ((DataCallback)object2).getError();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    object2 = ((DataError)object2).getErrors();
                    n3 = object2.size();
                    if (n3 > 0) {
                        object2 = sz1_22.q;
                        object3 = "errorTv";
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n3 = 0;
                            object2 = null;
                        }
                        object2.setVisibility(0);
                        object2 = sz1_22.q;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n3 = 0;
                            object2 = null;
                        }
                        ai0_2.a((View)object2);
                        object2 = sz1_22.q;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n3 = 0;
                            object2 = null;
                        }
                        if ((object3 = sz1_22.U) != null) {
                            object3 = ((DataCallback)object3).getError();
                        } else {
                            n7 = 0;
                            object3 = null;
                        }
                        Intrinsics.checkNotNull(object3);
                        object3 = ((DataError$ErrorMessage)((DataError)object3).getErrors().get(0)).getMessage();
                        object2.setText((CharSequence)object3);
                        object2 = sz1_22.p;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("errorIv");
                            n3 = 0;
                            object2 = null;
                        }
                        object2.setVisibility(0);
                        object2 = sz1_22.l;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editText1");
                            n3 = 0;
                            object2 = null;
                        }
                        n7 = R$drawable.rounded_rect_4_grey_bg_ff7676_stroke;
                        object3 = hv3_0.r(n7);
                        object2.setBackground((Drawable)object3);
                        object2 = sz1_22.m;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editText2");
                            n3 = 0;
                            object2 = null;
                        }
                        n7 = R$drawable.rounded_rect_4_grey_bg_ff7676_stroke;
                        object3 = hv3_0.r(n7);
                        object2.setBackground((Drawable)object3);
                        object2 = sz1_22.n;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editText3");
                            n3 = 0;
                            object2 = null;
                        }
                        n7 = R$drawable.rounded_rect_4_grey_bg_ff7676_stroke;
                        object3 = hv3_0.r(n7);
                        object2.setBackground((Drawable)object3);
                        object2 = sz1_22.o;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editText4");
                            n3 = 0;
                            object2 = null;
                        }
                        n7 = R$drawable.rounded_rect_4_grey_bg_ff7676_stroke;
                        object3 = hv3_0.r(n7);
                        object2.setBackground((Drawable)object3);
                        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object2 = sz1_22.U;
                        if (object2 != null) {
                            object4 = ((DataCallback)object2).getError();
                        }
                        Intrinsics.checkNotNull(object4);
                        object2 = (DataError$ErrorMessage)((DataError)object4).getErrors().get(0);
                        String string3 = ((DataError$ErrorMessage)object2).getMessage();
                        String string4 = "formErrorEvent";
                        String string5 = "Login Form";
                        String string6 = "";
                        int n8 = 112;
                        GTMEvents.gtmEventsToGa$default(gTMEvents, string4, string5, string3, string6, null, null, null, n8, null);
                    }
                }
            }
        }
    }
}


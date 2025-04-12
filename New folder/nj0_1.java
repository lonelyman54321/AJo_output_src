/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.dresstool.ApplicableStyle;
import com.ril.ajio.services.data.dresstool.DressToolModel;
import java.net.URLEncoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from nJ0
 */
public final class nj0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ nj0_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke() {
        int n3 = 1;
        Object object = "this$0";
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                int n7;
                Object object3;
                Object object4;
                object2 = (pl2_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = pl2_1.Pa((pl2_1)object2);
                Object object5 = ((pl2_1)object2).f;
                Object object6 = (am2_2)((ov0_0)((hh3_2)object5).getValue()).c.getValue();
                CharSequence charSequence = new StringBuilder();
                boolean bl2 = object6 instanceof aM2$d;
                if (bl2 && (object6 = ((aM2$d)object6).a) != null) {
                    object6 = ((Iterable)object6.getRecommendedStyles()).iterator();
                    while (bl2 = object6.hasNext()) {
                        object4 = (ApplicableStyle)object6.next();
                        int n8 = ((ApplicableStyle)object4).isSelected();
                        if (n8 == 0) continue;
                        n8 = ((StringBuilder)charSequence).length();
                        if (n8 > 0) {
                            object3 = ",";
                            ((StringBuilder)charSequence).append((String)object3);
                        }
                        object4 = ((ApplicableStyle)object4).getApplicable_style_name();
                        ((StringBuilder)charSequence).append((String)object4);
                    }
                }
                object6 = ((StringBuilder)charSequence).toString();
                Intrinsics.checkNotNullExpressionValue(object6, "toString(...)");
                charSequence = "style_selected";
                ((ov0_0)object).d("dress tool style selection halfcard screen", (String)object6, (String)charSequence);
                ((pl2_1)object2).Qa();
                object = (ov0_0)((hh3_2)object5).getValue();
                object6 = (am2_2)((ov0_0)object).c.getValue();
                object = ((ov0_0)object).b.getValue();
                boolean bl3 = object instanceof Bv0$d;
                bl2 = false;
                object4 = null;
                if (bl3) {
                    object = (Bv0$d)object;
                } else {
                    n7 = 0;
                    object = null;
                }
                if (object != null && (object = ((Bv0$d)object).a) != null) {
                    object = ((DressToolModel)object).getPlp_redirection_url();
                } else {
                    n7 = 0;
                    object = null;
                }
                if (object == null) {
                    object = "";
                }
                charSequence = new StringBuilder();
                boolean bl4 = object6 instanceof aM2$d;
                if (bl4 && (object6 = ((aM2$d)object6).a) != null) {
                    boolean bl5;
                    object6 = ((Iterable)object6.getRecommendedStyles()).iterator();
                    while (bl5 = object6.hasNext()) {
                        String string2;
                        object3 = (ApplicableStyle)object6.next();
                        int n8 = ((ApplicableStyle)object3).isSelected();
                        if (n8 == 0 || (string2 = ((ApplicableStyle)object3).getSaas_redirection_params()) == null || (n8 = string2.length()) == 0) continue;
                        if ((object3 = ((ApplicableStyle)object3).getSaas_redirection_params()) != null) {
                            object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
                        } else {
                            bl5 = false;
                            object3 = null;
                        }
                        string2 = "UTF-8";
                        object3 = URLEncoder.encode((String)object3, string2);
                        ((StringBuilder)charSequence).append((String)object3);
                    }
                }
                object6 = new StringBuilder();
                object6.append((String)object);
                object6.append((Object)charSequence);
                object = object6.toString();
                object6 = null;
                charSequence = " ";
                object3 = "%20";
                object = kotlin.text.b.n((String)object, (String)charSequence, (String)object3, false);
                if (object != null) {
                    Bundle bundle = E1.a("dress_tool_source", "bra_dress_tool");
                    object6 = ((Fragment)object2).getArguments();
                    charSequence = "dress_tool_source_details";
                    if (object6 == null || (object6 = object6.getString((String)charSequence)) == null) {
                        object6 = "bra dress tool banner";
                    }
                    bundle.putString((String)charSequence, (String)object6);
                    object5 = ((ov0_0)((hh3_2)object5).getValue()).c();
                    object6 = "dress_tool_ingress";
                    bundle.putString((String)object6, (String)object5);
                    bundle.putString("dress_tool_plp_url", (String)object);
                    object5 = kj0_1.g();
                    object2 = ((Fragment)object2).getActivity();
                    ((kj0_1)object5).r((Activity)object2, (String)object, bundle);
                } else {
                    n7 = R$string.something_wrong_msg;
                    object = hv3_0.K(n7);
                    hv3_0.o0(n3, (String)object, null);
                }
                return Unit.a;
            }
            case 0: 
        }
        Object object7 = pj0_2.Companion;
        object2 = (pj0_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = new xz_1(object2, n3);
        Object object4 = new pw_2((Function0)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object7 = "factory";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        rd3_0 rd3_02 = object2.getViewModelStore();
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = object2.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = e43_0.class;
        object7 = "modelClass";
        object4 = on_2.c(rd3_02, (pw_2)object4, (Wd0)object, (Class)object2, (String)object7);
        object = ef0_0.a((Class)object2, (String)object7, (String)object7, "<this>");
        object2 = object.getQualifiedName();
        if (object2 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
            return (e43_0)((pD3)object4).a((yn1_2)object, (String)object2);
        }
        object = "Local and anonymous classes can not be ViewModels".toString();
        object4 = new IllegalArgumentException((String)object);
        throw object4;
    }
}


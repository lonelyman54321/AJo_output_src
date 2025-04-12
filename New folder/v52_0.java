/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.databinding.DialogLocationPermRevampBinding;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from v52
 */
public final class v52_0
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final v52$a Companion;
    public static final /* synthetic */ gn1_2[] k;
    public final c80 a;
    public final NewCustomEventsRevamp b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public final hh3_2 i;
    public final cc3_2 j;

    static {
        Object object = jz.a(v52_0.class, "binding", "getBinding()Lcom/ril/ajio/databinding/DialogLocationPermRevampBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        k = gn1_2Array;
        Companion = object = new Object();
    }

    public v52_0() {
        Object object = ir0_2.a;
        this.a = object = kotlinx.coroutines.d.a(em0_2.b);
        this.b = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.c = object = "";
        this.d = object;
        this.e = "Allow";
        this.f = "Cancel";
        this.g = object;
        object = new t52_0(this, 0);
        this.i = object = yr1_2.b((Function0)object);
        this.j = object = z80_0.c(v52$b.a, this);
    }

    public final DialogLocationPermRevampBinding Oa() {
        Object object = k[0];
        object = this.j.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (DialogLocationPermRevampBinding)object;
    }

    public final void Pa(String string2, String string3, String string4) {
        v52$c v52$c = new v52$c(this, string3, string2, string4, null);
        Ae3.d(this.a, null, null, v52$c, 3);
    }

    public final void Qa(String string2, String string3) {
        v52$d v52$d = new v52$d(this, string2, string3, null);
        Ae3.d(this.a, null, null, v52$d, 3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View var1_1) {
        block20: {
            block22: {
                block21: {
                    block19: {
                        block17: {
                            block18: {
                                block23: {
                                    var2_6 = "cancel";
                                    var3_7 = "allow";
                                    if (var1_1 != null) {
                                        var4_8 = var1_1.getId();
                                        var1_1 = var4_8;
                                    } else {
                                        var4_8 = 0;
                                        var1_1 = null;
                                    }
                                    var5_9 = R$id.laTvNotNow;
                                    var6_10 = "result";
                                    var7_11 = "permission_result";
                                    if (var1_1 != null && (var8_12 = var1_1.intValue()) == var5_9) break block23;
                                    var5_9 = R$id.dlprClose;
                                    if (var1_1 != null && (var8_12 = var1_1.intValue()) == var5_9) break block23;
                                    var5_9 = R$id.dlprIvClose;
                                    if (var1_1 != null && (var8_12 = var1_1.intValue()) == var5_9) break block23;
                                    var9_13 = R$id.laTvAllow;
                                    if (var1_1 == null) {
                                        return;
                                    }
                                    var4_8 = var1_1.intValue();
                                    if (var4_8 != var9_13) return;
                                    var1_1 = new Bundle();
                                    var9_13 = 100;
                                    var1_1.putInt(var6_10, var9_13);
                                    r0_0.c((Bundle)var1_1, this, var7_11);
                                    this.dismissAllowingStateLoss();
                                    var4_8 = (int)this.h;
                                    if (var4_8 == 0) ** GOTO lbl37
                                    break block18;
                                    {
                                        catch (Throwable var1_2) {
                                            break block17;
                                        }
                                        catch (Exception var1_3) {}
                                        {
                                            vl1_2.a(var1_3);
                                        }
                                        var4_8 = (int)this.h;
                                        if (var4_8 != 0) break block18;
lbl37:
                                        // 2 sources

                                        var1_1 = this.c;
                                        var2_6 = this.g;
                                        this.Pa((String)var1_1, var2_6, var3_7);
                                        return;
                                    }
                                }
                                var1_1 = new Bundle();
                                var11_16 = 101;
                                var1_1.putInt(var6_10, var11_16);
                                r0_0.c((Bundle)var1_1, this, var7_11);
                                this.dismissAllowingStateLoss();
                                break block19;
                                {
                                    catch (Throwable var1_4) {
                                        break block20;
                                    }
                                    catch (Exception var1_5) {}
                                    {
                                        vl1_2.a(var1_5);
                                    }
                                    var4_8 = (int)this.h;
                                    if (var4_8 == 0) break block21;
                                    break block22;
                                }
                            }
                            var1_1 = this.g;
                            this.Qa((String)var1_1, var3_7);
                            return;
                        }
                        var9_13 = (int)this.h;
                        if (var9_13 != 0) {
                            var2_6 = this.g;
                            this.Qa(var2_6, var3_7);
                            throw var1_2;
                        }
                        var2_6 = this.c;
                        var10_14 = this.g;
                        this.Pa(var2_6, var10_14, var3_7);
                        throw var1_2;
                    }
                    var4_8 = (int)this.h;
                    if (var4_8 != 0) break block22;
                }
                var1_1 = this.c;
                var3_7 = this.g;
                this.Pa((String)var1_1, var3_7, var2_6);
                return;
            }
            var1_1 = this.g;
            this.Qa((String)var1_1, var2_6);
            return;
        }
        var11_16 = (int)this.h;
        if (var11_16 != 0) {
            var3_7 = this.g;
            this.Qa(var3_7, var2_6);
            throw var1_4;
        }
        var3_7 = this.c;
        var10_15 = this.g;
        this.Pa(var3_7, var10_15, var2_6);
        throw var1_4;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.dialog_location_perm_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        hh3_2 hh3_22 = this.i;
        jo_2 jo_22 = (jo_2)hh3_22.getValue();
        long l2 = System.currentTimeMillis();
        jo_22.t(l2);
        ((jo_2)hh3_22.getValue()).s(true);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3;
        int n4;
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onViewCreated((View)object, (Bundle)object2);
        this.Oa().laTvAllow.setOnClickListener((View.OnClickListener)this);
        this.Oa().laTvNotNow.setOnClickListener((View.OnClickListener)this);
        object2 = this.getArguments();
        if (object2 != null) {
            this.c = string2 = String.valueOf(object2.getString("permission_dialog_title"));
            this.d = string2 = String.valueOf(object2.getString("permission_dialog_description"));
            this.e = string2 = String.valueOf(object2.getString("permission_dialog_positive_button"));
            this.f = string2 = String.valueOf(object2.getString("permission_dialog_negative_button"));
            n4 = (int)(object2.getBoolean("KEY_PERMISSION_IS_FOR_SETTINGS") ? 1 : 0);
            this.h = n4;
            string2 = "KEY_PERMISSION_SOURCE";
            object2 = String.valueOf(object2.getString(string2));
            this.g = object2;
            object2 = this.c;
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                object2 = this.Oa().laTitle;
                string2 = hv3_0.f(this.c);
                object2.setText((CharSequence)string2);
            }
            if ((object2 = this.d) != null && (n3 = ((String)object2).length()) != 0) {
                object2 = this.Oa().laAccessInfo;
                Intrinsics.checkNotNullExpressionValue(object2, "laAccessInfo");
                string2 = this.d;
                ai0_2.A((TextView)object2, string2);
            }
            object2 = this.Oa().laTvAllow;
            Intrinsics.checkNotNullExpressionValue(object2, "laTvAllow");
            string2 = this.e;
            ai0_2.A((TextView)object2, string2);
            object2 = this.Oa().laTvNotNow;
            Intrinsics.checkNotNullExpressionValue(object2, "laTvNotNow");
            string2 = this.f;
            ai0_2.z((TextView)object2, string2);
        }
        this.Oa().laTvAllow.setOnClickListener((View.OnClickListener)this);
        this.Oa().laTvNotNow.setOnClickListener((View.OnClickListener)this);
        n3 = R$id.dlprLayoutContent;
        object2 = object.findViewById(n3);
        if (object2 != null) {
            string2 = this.getDialog();
            if (string2 != null) {
                object3 = new Object();
                string2.setOnShowListener((DialogInterface.OnShowListener)object3);
            }
            object2.bringToFront();
        }
        n3 = R$id.dlprClose;
        object2 = object.findViewById(n3);
        n4 = 8;
        if (object2 != null) {
            object2.setVisibility(n4);
        }
        if ((object = (ImageView)object.findViewById(n3 = R$id.dlprIvClose)) != null) {
            object.setVisibility(n4);
        }
        boolean bl2 = this.h;
        n3 = 3;
        n4 = 0;
        string2 = null;
        object3 = this.a;
        if (bl2) {
            object = this.g;
            x52_0 x52_02 = new x52_0(this, (String)object, null);
            Ae3.d((i90_0)object3, null, null, x52_02, n3);
        } else {
            object = this.c;
            String string3 = this.g;
            w52 w522 = new w52(this, string3, (String)object, null);
            Ae3.d((i90_0)object3, null, null, w522, n3);
        }
    }
}


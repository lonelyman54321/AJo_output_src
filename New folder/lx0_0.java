/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.RadioButton
 */
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.query.QueryProfile;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lx0
 */
public final class lx0_0
implements View.OnClickListener {
    public final /* synthetic */ px0_1 a;
    public final /* synthetic */ View b;

    public /* synthetic */ lx0_0(px0_1 px0_12, View view) {
        this.a = px0_12;
        this.b = view;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        int n3;
        int n4;
        boolean bl2;
        Object object;
        String string2;
        int n7;
        String string3;
        String string4;
        String string5;
        String string6;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n8;
        int n10;
        block42: {
            block41: {
                block40: {
                    n10 = 1;
                    n8 = -1;
                    object6 = this.a;
                    Intrinsics.checkNotNullParameter(object6, "this$0");
                    object5 = this.b;
                    Intrinsics.checkNotNullParameter(object5, "$view");
                    object4 = ((px0_1)object6).y;
                    object3 = ((NewCustomEventsRevamp)object4).getEC_MY_ACC_INTERACTION();
                    object2 = "update_profile";
                    string6 = "";
                    string5 = "update_profile";
                    string4 = "edit profile screen";
                    String string7 = "my account screen";
                    string3 = ((px0_1)object6).z;
                    n7 = 0;
                    string2 = ((px0_1)object6).A;
                    int n14 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object3, (String)object2, string6, string5, string4, string7, string3, null, string2, false, null, n14, null);
                    object = ((px0_1)object6).a;
                    object4 = null;
                    if (object != null) {
                        bl2 = ((fv0_2)object).a.h();
                        object = bl2;
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    object3 = Boolean.TRUE;
                    n4 = Intrinsics.areEqual(object, object3);
                    if (n4 != 0) {
                        object2 = ((px0_1)object6).o;
                        hv3_0.S((Activity)object2);
                    }
                    cp_1.Companion.getClass();
                    object2 = cp$a.e();
                    object2.getClass();
                    n4 = cp_1.q();
                    n3 = 0;
                    string6 = null;
                    if (n4 == 0) break block40;
                    object2 = ((px0_1)object6).D;
                    if (object2 != null) {
                        object2.setVisibility(0);
                    }
                    if ((object2 = ((px0_1)object6).E) != null) {
                        object2.setVisibility(0);
                    }
                    if ((object2 = ((px0_1)object6).k) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("genderRadioGroup");
                        n4 = 0;
                        object2 = null;
                    }
                    if ((n4 = object2.getCheckedRadioButtonId()) <= n8 || (object5 = (RadioButton)object5.findViewById(n4)) == null) break block41;
                    object5 = ((Object)object5.getText()).toString();
                    break block42;
                }
                object5 = ((px0_1)object6).D;
                n4 = 8;
                if (object5 != null) {
                    object5.setVisibility(n4);
                }
                if ((object5 = ((px0_1)object6).E) != null) {
                    object5.setVisibility(n4);
                }
            }
            object5 = "";
        }
        bl2 = Intrinsics.areEqual(object, object3);
        if (bl2) {
            int n15;
            int n16;
            int n17;
            object = new HashMap();
            object3 = ((px0_1)object6).c;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("firstName");
                object3 = null;
            }
            object3 = String.valueOf(((AppCompatEditText)object3).getText());
            n4 = ((String)object3).length() - n10;
            int n18 = 0;
            string5 = null;
            int n19 = 0;
            string4 = null;
            while (true) {
                n17 = 32;
                if (n18 > n4) break;
                n16 = n19 == 0 ? n18 : n4;
                if ((n16 = Intrinsics.compare(((String)object3).charAt(n16), n17)) <= 0) {
                    n16 = 1;
                } else {
                    n16 = 0;
                    string3 = null;
                }
                if (n19 == 0) {
                    if (n16 == 0) {
                        n19 = 1;
                        continue;
                    }
                    n18 += n10;
                    continue;
                }
                if (n16 == 0) break;
                n4 += n8;
            }
            object3 = com.jio.jioads.adinterfaces.a.a(n4, n10, n18, (String)object3);
            object2 = "firstname";
            ((HashMap)object).put(object2, object3);
            object3 = ((px0_1)object6).d;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastName");
                object3 = null;
            }
            object3 = String.valueOf(((AppCompatEditText)object3).getText());
            n18 = ((String)object3).length() - n10;
            n19 = 0;
            string4 = null;
            n16 = 0;
            string3 = null;
            while (n19 <= n18) {
                n7 = n16 == 0 ? n19 : n18;
                n7 = Intrinsics.compare(((String)object3).charAt(n7), n17);
                n7 = n7 <= 0 ? 1 : 0;
                if (n16 == 0) {
                    if (n7 == 0) {
                        n16 = 1;
                        continue;
                    }
                    n19 += n10;
                    continue;
                }
                if (n7 == 0) break;
                n18 += n8;
            }
            object3 = com.jio.jioads.adinterfaces.a.a(n18, n10, n19, (String)object3);
            string5 = "lastname";
            ((HashMap)object).put(string5, object3);
            object3 = ((px0_1)object6).e;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                object3 = null;
            }
            object3 = String.valueOf(((AppCompatEditText)object3).getText());
            n19 = ((String)object3).length() - n10;
            n16 = 0;
            string3 = null;
            n7 = 0;
            while (n16 <= n19) {
                n15 = n7 == 0 ? n16 : n19;
                if ((n15 = Intrinsics.compare(((String)object3).charAt(n15), n17)) <= 0) {
                    n15 = 1;
                } else {
                    n15 = 0;
                    string2 = null;
                }
                if (n7 == 0) {
                    if (n15 == 0) {
                        n7 = 1;
                        continue;
                    }
                    n16 += n10;
                    continue;
                }
                if (n15 == 0) break;
                n19 += n8;
            }
            object3 = com.jio.jioads.adinterfaces.a.a(n19, n10, n16, (String)object3);
            string4 = "screenname";
            ((HashMap)object).put(string4, object3);
            object3 = "gender";
            ((HashMap)object).put(object3, object5);
            object5 = ((px0_1)object6).g;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("telephoneField");
                object5 = null;
            }
            object5 = String.valueOf(((AppCompatEditText)object5).getText());
            n16 = ((String)object5).length() - n10;
            n7 = 0;
            n15 = 0;
            string2 = null;
            while (n7 <= n16) {
                n3 = n15 == 0 ? n7 : n16;
                if ((n3 = Intrinsics.compare(((String)object5).charAt(n3), n17)) <= 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    string6 = null;
                }
                if (n15 == 0) {
                    if (n3 == 0) {
                        n3 = 0;
                        string6 = null;
                        n15 = 1;
                        continue;
                    }
                    n7 += n10;
                } else {
                    if (n3 == 0) break;
                    n16 += n8;
                }
                n3 = 0;
                string6 = null;
            }
            Object object7 = com.jio.jioads.adinterfaces.a.a(n16, n10, n7, (String)object5);
            ((HashMap)object).put("mobilenumber", object7);
            ((HashMap)object).put("otp", null);
            object7 = ((px0_1)object6).i;
            Object object8 = "dateOfBirthField";
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n10 = 0;
                object7 = null;
            }
            object7 = ((AppCompatTextView)object7).getText();
            object5 = "dob";
            if (object7 != null) {
                object7 = ((px0_1)object6).i;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                } else {
                    object4 = object7;
                }
                object7 = ((Object)((AppCompatTextView)object4).getText()).toString();
                object8 = "dd MMMM yyyy";
                object4 = "dd/MM/yyyy";
                object7 = k7.a((String)object7, (String)object8, (String)object4);
                ((HashMap)object).put(object5, object7);
            }
            if ((object7 = ((px0_1)object6).u) != null) {
                Intrinsics.checkNotNullParameter(object, "queryParams");
                object8 = new QueryProfile();
                object6 = ((HashMap)object).get(object2);
                object4 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(object6, (String)object4);
                object6 = (String)object6;
                ((QueryProfile)object8).setFirstName((String)object6);
                object6 = ((HashMap)object).get(string5);
                Intrinsics.checkNotNull(object6, (String)object4);
                object6 = (String)object6;
                ((QueryProfile)object8).setLastName((String)object6);
                boolean bl3 = ((HashMap)object).containsKey(string4);
                if (bl3) {
                    object6 = ((HashMap)object).get(string4);
                    Intrinsics.checkNotNull(object6, (String)object4);
                    object6 = (String)object6;
                    ((QueryProfile)object8).setScreenName((String)object6);
                }
                object6 = ((HashMap)object).get(object3);
                Intrinsics.checkNotNull(object6, (String)object4);
                object6 = (String)object6;
                ((QueryProfile)object8).setGender((String)object6);
                bl3 = ((HashMap)object).containsKey(object5);
                if (bl3) {
                    object6 = ((HashMap)object).get(object5);
                    Intrinsics.checkNotNull(object6, (String)object4);
                    object6 = (String)object6;
                    bl3 = TextUtils.isEmpty((CharSequence)object6);
                    if (!bl3) {
                        object6 = ((HashMap)object).get(object5);
                        Intrinsics.checkNotNull(object6, (String)object4);
                        object6 = (String)object6;
                        ((QueryProfile)object8).setDateOfBirth((String)object6);
                    }
                }
                object8 = ((hy3_0)object7).g.updateUserProfile((QueryProfile)object8);
                object6 = new dy3_0((hy3_0)object7);
                object5 = new zn2_2((Function1)object6);
                object6 = new ey3_0((hy3_0)object7);
                object = new fy3_0((ey3_0)object6);
                object8 = ((g53_0)object8).f((o60_0)object5, (o60_0)object);
                object7 = ((hy3_0)object7).x;
                ((t30_0)object7).b((yr0_2)object8);
            }
        }
    }
}


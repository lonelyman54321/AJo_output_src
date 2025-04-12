/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bP0
 */
public final class bp0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;

    public bp0_2(Activity activity, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = activity;
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Activity activity = this.a;
        dr0_0 dr0_02 = this.b;
        object = new bp0_2(activity, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (bp0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bp0_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        block30: {
            boolean bl2;
            block28: {
                Object object2;
                int n3;
                block31: {
                    Exception exception3;
                    Object object3;
                    block27: {
                        Object object4;
                        Object object5;
                        block26: {
                            Object object6;
                            int n4;
                            int n7;
                            block29: {
                                Exception exception22;
                                Object object7;
                                block25: {
                                    block24: {
                                        String string2;
                                        long l2;
                                        long l3;
                                        long l4;
                                        long l7;
                                        int n8;
                                        Object object8;
                                        object5 = j90_0.COROUTINE_SUSPENDED;
                                        vl2_2.b(object);
                                        object = this.a;
                                        if (object == null) return Unit.a;
                                        this.b.getClass();
                                        object = dr0_0.w((Activity)object);
                                        object5 = ((fq0_2)object).Pa();
                                        object7 = h40_0.a;
                                        ((lq2_0)object5).l = object7 = h40_0.v0();
                                        object5 = z40_0.Companion;
                                        object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a;
                                        object7 = "enable_locale";
                                        n7 = ((ao0_0)object5).a((String)object7);
                                        n3 = 101;
                                        object3 = null;
                                        object2 = "fleekViewModel";
                                        if (n7 != 0) {
                                            object5 = ((fq0_2)object).q;
                                            if (object5 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                                n7 = 0;
                                                object5 = null;
                                            }
                                            ((dr0_0)object5).o = n3;
                                        }
                                        if ((n7 = ((ao0_0)(object5 = z40$a.a((Context)AJIOApplication$a.a()).a)).a((String)(object4 = "mandatory_on_start_permissions"))) == 0) {
                                            object = ((fq0_2)object).Pa();
                                            ((lq2_0)object).c();
                                            return Unit.a;
                                        }
                                        object5 = ((fq0_2)object).q;
                                        if (object5 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                            n7 = 0;
                                            object5 = null;
                                        }
                                        ((dr0_0)object5).o = n3;
                                        hv3_0.a.getClass();
                                        n7 = hv3_0.X();
                                        n3 = 1;
                                        object2 = ((ew_2)object).a;
                                        ((jo_2)object2).s((n7 ^= n3) != 0);
                                        ((fq0_2)object).y = object5 = new ArrayList();
                                        object5 = "IS_MANDATORY_PERMISSIONS_DIALOG_SHOWN";
                                        n4 = 0;
                                        int n10 = ((sw_0)object2).getPreference((String)object5, false);
                                        if (n10 == 0) {
                                            int n14;
                                            object6 = z40$a.a((Context)AJIOApplication$a.a()).a;
                                            n10 = ((ao0_0)object6).a((String)object4);
                                            if (n10 != 0) {
                                                object6 = ((fq0_2)object).y;
                                                if (object6 != null) {
                                                    object8 = "android.permission.ACCESS_FINE_LOCATION";
                                                    ((ArrayList)object6).add(object8);
                                                }
                                                if ((object6 = ((fq0_2)object).y) != null) {
                                                    object8 = "android.permission.ACCESS_COARSE_LOCATION";
                                                    ((ArrayList)object6).add(object8);
                                                }
                                                if ((object6 = ((fq0_2)object).y) != null) {
                                                    object8 = "android.permission.READ_PHONE_STATE";
                                                    ((ArrayList)object6).add(object8);
                                                }
                                            }
                                            if ((n10 = h40_0.N1()) != 0 && (n8 = (int)(hv3_0.R((String)(object6 = "android.permission.POST_NOTIFICATIONS")) ? 1 : 0)) == 0 && (n8 = Build.VERSION.SDK_INT) >= (n14 = 33) && (object8 = ((fq0_2)object).y) != null) {
                                                ((ArrayList)object8).add(object6);
                                            }
                                            object6 = ((fq0_2)object).y;
                                            Intrinsics.checkNotNull(object6);
                                            ((fq0_2)object).y = object6 = hv3_0.e((ArrayList)object6);
                                            object6 = new Gson();
                                            object8 = ((fq0_2)object).y;
                                            object6 = ((Gson)object6).toJson(object8);
                                            Intrinsics.checkNotNull(object6);
                                            Intrinsics.checkNotNullParameter(object6, "permissionsRejectedString");
                                            object8 = "permissions_not_granted";
                                            ((sw_0)object2).putPreference((String)object8, (String)object6);
                                        }
                                        if (!(bl2 = ((ao0_0)(object6 = z40$a.a((Context)AJIOApplication$a.a()).a)).a((String)object4))) {
                                            n10 = h40_0.N1();
                                            if (n10 == 0) return Unit.a;
                                        }
                                        if (bl2) {
                                            object8 = ((Fragment)object).getActivity();
                                            ((fq0_2)object).A = object6 = new ey0_1((FragmentActivity)object8, (fy0_1)object);
                                        }
                                        if ((n10 = Build.VERSION.SDK_INT) < (n8 = 23) || (object6 = ((fq0_2)object).y) == null || (n10 = ((ArrayList)object6).isEmpty() ^ n3) != n3) break block28;
                                        bl2 = h40_0.N1();
                                        if (!bl2) break block29;
                                        object4 = ((Fragment)object).requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(object4, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(object4, "activity");
                                        object8 = AJIOApplication$a.a();
                                        object6 = new jo_2((Context)object8);
                                        bl2 = hv3_0.a((FragmentActivity)object4, false);
                                        if (!bl2 || (l7 = (l4 = (l3 = ((sw_0)object6).getPreference((String)(object4 = "MANDATORY_PERMISSIONS_DIALOG_TIME"), l2 = 0L)) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) break block29;
                                        l2 = System.currentTimeMillis() - l3;
                                        l2 = TimeUnit.MILLISECONDS.toDays(l2);
                                        String string3 = "no_of_times_notifications_settings_dialog_shown";
                                        n10 = ((sw_0)object6).getPreference(string3, 0);
                                        ao0_0 ao0_02 = z40$a.a((Context)AJIOApplication$a.a()).a;
                                        String string4 = "post_notifications_settings_permission_duration";
                                        int n15 = ao0_02.g(string4);
                                        long l8 = n15;
                                        long l12 = l2 - l8;
                                        Object object9 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                        if (object9 <= 0 || n10 >= (n8 = ((ao0_0)(object8 = z40$a.a((Context)AJIOApplication$a.a()).a)).g(string2 = "post_notifications_settings_permission_frequency"))) break block29;
                                        long l14 = System.currentTimeMillis();
                                        ((sw_0)object2).putPreference((String)object4, l14);
                                        n7 = ((sw_0)object2).getPreference(string3, 0) + n3;
                                        ((sw_0)object2).putPreference(string3, n7);
                                        object5 = yn3_0.a;
                                        object2 = "notifications settigs dialog can be shown";
                                        object4 = new Object[]{};
                                        ((yn3$a)object5).a((String)object2, (Object[])object4);
                                        object5 = ((fq0_2)object).i;
                                        if (object5 != null) {
                                            object5 = object5.y();
                                        } else {
                                            n7 = 0;
                                            object5 = null;
                                        }
                                        if (object5 == null || (object5 = ((fq0_2)object).i) == null || (object5 = object5.y()) == null || (n7 = ((Fragment)object5).isAdded()) != n3 || (n7 = ((Fragment)object).isAdded()) == 0) break block30;
                                        try {
                                            object5 = new z52_0();
                                            n3 = 1985;
                                            ((Fragment)object5).setTargetFragment((Fragment)object, n3);
                                            object7 = ((fq0_2)object).i;
                                            if (object7 == null) break block24;
                                            object3 = object7.y();
                                        }
                                        catch (Exception exception22) {
                                            break block25;
                                        }
                                    }
                                    Intrinsics.checkNotNull(object3);
                                    object7 = ((Fragment)object3).getChildFragmentManager();
                                    object3 = "NotificationSettingsDialog";
                                    ((DialogFragment)object5).show((FragmentManager)object7, (String)object3);
                                    break block30;
                                }
                                object7 = yn3_0.a;
                                ((yn3$a)object7).e(exception22);
                                break block30;
                            }
                            if ((n7 = ((sw_0)object2).getPreference((String)object5, false)) != 0) break block30;
                            object5 = z40$a.a((Context)AJIOApplication$a.a()).a;
                            object4 = "android_mandatory_on_start_perm_dialog_enable";
                            n7 = ((ao0_0)object5).a((String)object4);
                            if (n7 == 0) break block31;
                            object5 = ((fq0_2)object).i;
                            if (object5 != null) {
                                object5 = object5.y();
                            } else {
                                n7 = 0;
                                object5 = null;
                            }
                            if (object5 == null || (object5 = ((fq0_2)object).i) == null || (object5 = object5.y()) == null || (n7 = ((Fragment)object5).isAdded()) != n3 || (n7 = ((Fragment)object).isAdded()) == 0) break block30;
                            object5 = new Bundle();
                            object4 = ((fq0_2)object).y;
                            Intrinsics.checkNotNull(object4);
                            object4 = (String)hv3_0.p((ArrayList)object4).a;
                            object5.putString("permission_dialog_title", (String)object4);
                            object4 = ((fq0_2)object).y;
                            Intrinsics.checkNotNull(object4);
                            object4 = (String)hv3_0.p((ArrayList)object4).b;
                            object5.putString("permission_dialog_description", (String)object4);
                            object4 = ((fq0_2)object).y;
                            Intrinsics.checkNotNull(object4);
                            object4 = (String)hv3_0.p((ArrayList)object4).c;
                            object6 = "permission_list";
                            object5.putString((String)object6, (String)object4);
                            try {
                                ((fq0_2)object).z = object4 = new oq2_1();
                                ((DialogFragment)object4).setCancelable(false);
                                object4 = ((fq0_2)object).z;
                                if (object4 == null) break block26;
                                n4 = 1986;
                                ((Fragment)object4).setTargetFragment((Fragment)object, n4);
                            }
                            catch (Exception exception3) {
                                break block27;
                            }
                        }
                        if ((object4 = ((fq0_2)object).z) != null) {
                            ((Fragment)object4).setArguments((Bundle)object5);
                        }
                        if ((object5 = ((fq0_2)object).z) != null) {
                            object4 = ((fq0_2)object).i;
                            if (object4 != null) {
                                object3 = object4.y();
                            }
                            Intrinsics.checkNotNull(object3);
                            object3 = ((Fragment)object3).getChildFragmentManager();
                            object4 = "PermissionsDialog";
                            ((DialogFragment)object5).show((FragmentManager)object3, (String)object4);
                            object5 = Unit.a;
                        }
                        break block30;
                    }
                    object3 = yn3_0.a;
                    ((yn3$a)object3).e(exception3);
                    long l15 = System.currentTimeMillis();
                    ((jo_2)object2).t(l15);
                    ((jo_2)object2).s(n3 != 0);
                    ((fq0_2)object).db();
                    Unit unit = Unit.a;
                    break block30;
                }
                long l16 = System.currentTimeMillis();
                ((jo_2)object2).t(l16);
                ((jo_2)object2).s(n3 != 0);
                ((fq0_2)object).db();
                break block30;
            }
            if (bl2) {
                ((fq0_2)object).eb();
            }
        }
        object = ((fq0_2)object).Pa();
        ((lq2_0)object).c();
        return Unit.a;
    }
}

